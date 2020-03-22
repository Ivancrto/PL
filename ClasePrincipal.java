import errors.MyErrorStrategy;
import errors.TestE_Listener;
import org.antlr.v4.runtime.*;

import java.io.IOException;

/*
El nombre ClasePrincipal es arbitrario, escoge el que prefieras.
Sustituye Hello por el nombre del fichero que contiene la especificación de la gramática ANTLR (extensión .g4)
*/
public class ClasePrincipal {
    public static void main(String[] args) {
        try{
// Preparar el fichero de entrada para asignarlo al analizador léxico
            CharStream input = CharStreams.fromFileName(args[0]);
// Crear el objeto correspondiente al analizador léxico con el fichero de entrada
            grupalLexer analex = new grupalLexer(input);

            //PARA LOS ERRORES
            //analex.removeErrorListeners ();
            //analex.addErrorListener (new TestE_Listener.VerboseListener ());

// Identificar al analizador léxico como fuente de tokens para el sintactico
            CommonTokenStream tokens = new CommonTokenStream (analex);
// Crear el objeto correspondiente al analizador sintáctico
            grupalParser anasint = new grupalParser(tokens);

            //PARA LOS ERRORES
            anasint.removeErrorListeners ();
            anasint.addErrorListener (new TestE_Listener.VerboseListener ());
            anasint.setErrorHandler (new MyErrorStrategy ());

            
            //--------------------------------------------------------------------------------


/*
Si se quiere pasar al analizador algún objeto externo con el que trabajar, este deberá ser de una clase del mismo paquete
Aquí se le llama "sintesis", pero puede ser cualquier nombre.
HelloParser anasint = new HelloParser(tokens, new sintesis());
*/
/*
Comenzar el análisis llamando al axioma de la gramática
Atención, sustituye "AxiomaDeLaGramatica" por el nombre del axioma de tu gramática
*/
            anasint.prg();
        } catch (org.antlr.v4.runtime.RecognitionException e) { //Fallo al reconocer la entrada
            System.err.println("REC " + e.getMessage());
        } catch (IOException e) { //Fallo de entrada/salida
            System.err.println("IO " + e.getMessage());
        } catch (RuntimeException e) { //Cualquier otro fallo
            System.err.println("RUN " + e.getMessage());
        }
    }
}
