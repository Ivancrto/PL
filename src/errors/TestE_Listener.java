package errors;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.ParseCancellationException;


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

               System.err.println("línea "+line+" y columna "+charPositionInLine+": "+msg);

        }

    }

}
