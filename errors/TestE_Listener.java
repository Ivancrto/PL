package errors;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.jetbrains.annotations.Nullable;

import java.util.*;

public class TestE_Listener {
    public static class VerboseListener extends BaseErrorListener {
        @Override
        public void syntaxError(Recognizer<?, ?> recognizer,
                                Object offendingSymbol,
                                int line, int charPositionInLine,
                                String msg,
                                RecognitionException e)
                throws ParseCancellationException {

            /*List<String> stack = ((Parser)recognizer).getRuleInvocationStack();
            Collections.reverse(stack);
            System.err.println("rule stack: "+stack);*/
            System.err.println("linea "+line+":"+charPositionInLine+": "+msg);
            //throw new ParseCancellationException("HASTA LOS COJONES "+line+":"+charPositionInLine+" at "+ offendingSymbol+": "+msg);
        }

    }

}
