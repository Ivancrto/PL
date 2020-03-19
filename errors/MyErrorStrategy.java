package errors;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.IntervalSet;

public class MyErrorStrategy extends DefaultErrorStrategy {

    @Override
    public void reportNoViableAlternative(Parser parser,
                                          NoViableAltException e)
            throws RecognitionException {
        // ANTLR generates Parser subclasses from grammars and
        // Parser extends Recognizer. Parameter parser is a
        // pointer to the parser that detected the error
        String msg = "no puedo elegir entre las alternativas que hay"; // nonstandard msg
        parser.notifyErrorListeners (e.getOffendingToken (), msg, e);
    }

    @Override
    protected void reportInputMismatch(Parser recognizer, InputMismatchException e) {
        String msg = "se detectó un " + this.getTokenErrorDisplay(e.getOffendingToken()) + " y se esperaba un " + e.getExpectedTokens().toString(recognizer.getVocabulary());
        recognizer.notifyErrorListeners(e.getOffendingToken(), msg, e);
    }

    @Override
    protected void reportUnwantedToken(Parser recognizer) {
        if (!this.inErrorRecoveryMode(recognizer)) {
            this.beginErrorCondition(recognizer);
            Token t = recognizer.getCurrentToken();
            String tokenName = this.getTokenErrorDisplay(t);
            IntervalSet expecting = this.getExpectedTokens(recognizer);
            String msg = "se ha recibido " + tokenName + " pero se esperaba recibir " + expecting.toString(recognizer.getVocabulary());
            recognizer.notifyErrorListeners(t, msg, (RecognitionException)null);
        }
    }

    @Override
    protected void reportMissingToken(Parser recognizer) {
        if (!this.inErrorRecoveryMode(recognizer)) {
            this.beginErrorCondition(recognizer);
            Token t = recognizer.getCurrentToken();
            IntervalSet expecting = this.getExpectedTokens(recognizer);
            String msg = "¡vaya! estaba esperando recibir " + expecting.toString(recognizer.getVocabulary()) + " en " + this.getTokenErrorDisplay(t);
            recognizer.notifyErrorListeners(t, msg, (RecognitionException)null);
        }
    }
}
