/*package errors;
import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.LexerNoViableAltException;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.misc.Interval;

public class MyLexer extends Lexer {
    @Override
    public void notifyListeners(LexerNoViableAltException e) {
        String text = this._input.getText(Interval.of(this._tokenStartCharIndex, this._input.index()));
        String msg = "token recognition error at: '" + this.getErrorDisplay(text) + "'";
        ANTLRErrorListener listener = this.getErrorListenerDispatch();
        listener.syntaxError(this, (Object)null, this._tokenStartLine, this._tokenStartCharPositionInLine, msg, e);
    }

    @Override
    public String[] getRuleNames() {
        return new String[0];
    }

    @Override
    public String getGrammarFileName() {
        return null;
    }

    @Override
    public ATN getATN() {
        return null;
    }
}*/
