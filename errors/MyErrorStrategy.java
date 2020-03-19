package errors;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATNState;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.misc.IntervalSet;

public class MyErrorStrategy extends DefaultErrorStrategy {
    @Override
    public void reportNoViableAlternative(Parser parser,
                                          NoViableAltException e)
            throws RecognitionException {
        // ANTLR generates Parser subclasses from grammars and
        // Parser extends Recognizer. Parameter parser is a
        // pointer to the parser that detected the error
        String msg = "No se puede elegir entre las alternativas disponibles";
        parser.notifyErrorListeners (e.getOffendingToken (), msg, e);
    }
    @Override
    protected void reportInputMismatch(Parser recognizer, InputMismatchException e) {
        String msg = "Se detectó un " + this.getTokenErrorDisplay(e.getOffendingToken()) + " y se esperaba un " + e.getExpectedTokens().toString(recognizer.getVocabulary());
        recognizer.notifyErrorListeners(e.getOffendingToken(), msg, e);
    }

    @Override
    protected void reportUnwantedToken(Parser recognizer) {
        if (!this.inErrorRecoveryMode(recognizer)) {
            this.beginErrorCondition(recognizer);
            Token t = recognizer.getCurrentToken();
            String tokenName = this.getTokenErrorDisplay(t);
            IntervalSet expecting = this.getExpectedTokens(recognizer);
            String msg = "Se ha recibido " + tokenName + " pero se esperaba recibir " + expecting.toString(recognizer.getVocabulary());
            recognizer.notifyErrorListeners(t, msg, (RecognitionException)null);
        }
    }

    @Override
    protected void reportMissingToken(Parser recognizer) {
        if (!this.inErrorRecoveryMode(recognizer)) {
            this.beginErrorCondition(recognizer);
            Token t = recognizer.getCurrentToken();
            IntervalSet expecting = this.getExpectedTokens(recognizer);
            String msg = "Se esperaba " + expecting.toString(recognizer.getVocabulary()) + " en vez de " + this.getTokenErrorDisplay(t);
            recognizer.notifyErrorListeners(t, msg, (RecognitionException)null);
        }
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @Override
    public void recover(Parser recognizer, RecognitionException e) {

        throw (e);
    }
    @Override
    public void sync(Parser recognizer) throws RecognitionException {
        ATNState s = (ATNState)((ParserATNSimulator)recognizer.getInterpreter()).atn.states.get(recognizer.getState());
        if (!this.inErrorRecoveryMode(recognizer)) {
            TokenStream tokens = recognizer.getInputStream();
            int la = tokens.LA(1);
            IntervalSet nextTokens = recognizer.getATN().nextTokens(s);
            if (nextTokens.contains(la)) {
                this.nextTokensContext = null;
                this.nextTokensState = -1;
            } else if (nextTokens.contains(-2)) {
                if (this.nextTokensContext == null) {
                    this.nextTokensContext = recognizer.getContext();
                    this.nextTokensState = recognizer.getState();
                }

            } else {
                switch(s.getStateType()) {
                    case 3:
                    case 4:
                    case 5:
                    case 10:
                        if (this.singleTokenDeletion(recognizer) != null) {
                            return;
                        }

                        throw new InputMismatchException(recognizer);
                    case 9:
                    case 11:
                        this.reportUnwantedToken(recognizer);
                        IntervalSet expecting = recognizer.getExpectedTokens();
                        IntervalSet whatFollowsLoopIterationOrRule = expecting.or(this.getErrorRecoverySet(recognizer));
                        this.consumeUntil(recognizer, whatFollowsLoopIterationOrRule);
                    case 6:
                    case 7:
                    case 8:
                    default:
                }
            }
        }
    }

    @Override
    public Token recoverInline(Parser recognizer) throws RecognitionException {
        Token matchedSymbol = this.singleTokenDeletion(recognizer);
        if (matchedSymbol != null) {
            recognizer.consume();
            return matchedSymbol;
        } else if (this.singleTokenInsertion(recognizer)) {
            return this.getMissingSymbol(recognizer);
        } else {
            InputMismatchException e;
            if (this.nextTokensContext == null) {
                e = new InputMismatchException(recognizer);
            } else {
                e = new InputMismatchException(recognizer, this.nextTokensState, this.nextTokensContext);
            }

            throw e;
        }    }
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
}
