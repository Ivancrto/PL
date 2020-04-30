// Generated from C:/Users/Ivanxrto/Downloads/practicaGrupalPL/src\grupal.g4 by ANTLR 4.8

    import java.io.FileWriter;
    import java.io.File;
    import java.io.IOException;
    import java.util.HashMap;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class grupalLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, ENTRECOMILLADOS=49, IDENT=50, COMMENT=51, 
		NUM_INT_CONST=52, NUM_REAL_CONST=53, NUM_INT_CONST_B=54, NUM_INT_CONST_O=55, 
		NUM_INT_CONST_H=56, STRING_CONST=57, WS=58, ERRORES=59;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
			"T__33", "T__34", "T__35", "T__36", "T__37", "T__38", "T__39", "T__40", 
			"T__41", "T__42", "T__43", "T__44", "T__45", "T__46", "T__47", "ENTRECOMILLADOS", 
			"IDENT", "VOCAB", "NUM", "COMMENT", "NUM_INT_CONST", "NUM_REAL_CONST", 
			"NUM_INT_CONST_B", "NUM_INT_CONST_O", "NUM_INT_CONST_H", "STRING_CONST", 
			"WS", "ERRORES"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'PROGRAM'", "';'", "'END'", "'INTERFACE'", "','", "'PARAMETER'", 
			"'::'", "'='", "'INTEGER'", "'REAL'", "'CHARACTER'", "'('", "')'", "'SUBROUTINE'", 
			"'INTENT'", "'IN'", "'OUT'", "'INOUT'", "'FUNCTION'", "'IF'", "'DO'", 
			"'SELECT'", "'CASE'", "'ENDIF'", "'ELSE'", "'THEN'", "'WHILE'", "'ENDDO'", 
			"'+'", "'-'", "'*'", "'/'", "'CALL'", "'.OR.'", "'.AND.'", "'.EQV.'", 
			"'.NEQV.'", "'.NOT.'", "'.TRUE.'", "'.FALSE.'", "'<'", "'>'", "'<='", 
			"'>='", "'=='", "'/='", "'DEFAULT'", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "ENTRECOMILLADOS", "IDENT", "COMMENT", "NUM_INT_CONST", "NUM_REAL_CONST", 
			"NUM_INT_CONST_B", "NUM_INT_CONST_O", "NUM_INT_CONST_H", "STRING_CONST", 
			"WS", "ERRORES"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	     File file = new File("codigo.c");
	     FileWriter fr;
	    public void insertTxtC(String t){
	    	{
	    		try {
	    			fr = new FileWriter(file, true);
	    			fr.write(t);
	    			fr.close();
	    		} catch (IOException e) {
	    			e.printStackTrace();
	    		}
	    	}}

	    public HashMap<String,Integer> mapVarSub= new HashMap<String,Integer>(); //Clave=nombre de la variable ; Valor=Numero de accesos;
	    public HashMap<String, HashMap<String,String[]>> comprobacionPunteroFunc = new HashMap<String, HashMap<String,String[]>>();
	    public void comprobar(String id){
	        if(mapVarSub.get(id)==null){
	            System.out.println("La variable "+id+" no coincide con ningun argumento.");
	        }
	        else{
	               if(mapVarSub.get(id)==1){
	                System.out.println("La declaracion de la variable "+id+" se ha repetido.");
	               }
	                mapVarSub.put(id,1);
	        }
	    }
	    public void comprobarTodosSub(){    //Se encarga de comprobar que se han declarado todas las variables
	          if(mapVarSub.containsValue(0)){
	              System.out.println("Hay variables sin declarar.");
	          }
	    }


	public grupalLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "grupal.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2=\u0220\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3"+
		"\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32"+
		"\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3\"\3\"\3\"\3"+
		"#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3"+
		"&\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3"+
		")\3*\3*\3+\3+\3,\3,\3,\3-\3-\3-\3.\3.\3.\3/\3/\3/\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\61\3\61\3\62\3\62\7\62\u016e\n\62\f\62\16\62\u0171"+
		"\13\62\3\62\3\62\3\63\3\63\3\63\3\63\7\63\u0179\n\63\f\63\16\63\u017c"+
		"\13\63\3\64\3\64\3\65\3\65\3\66\3\66\7\66\u0184\n\66\f\66\16\66\u0187"+
		"\13\66\3\66\6\66\u018a\n\66\r\66\16\66\u018b\3\66\3\66\3\67\5\67\u0191"+
		"\n\67\3\67\6\67\u0194\n\67\r\67\16\67\u0195\38\58\u0199\n8\38\68\u019c"+
		"\n8\r8\168\u019d\38\38\58\u01a2\n8\38\68\u01a5\n8\r8\168\u01a6\38\68\u01aa"+
		"\n8\r8\168\u01ab\38\38\68\u01b0\n8\r8\168\u01b1\38\68\u01b5\n8\r8\168"+
		"\u01b6\38\38\68\u01bb\n8\r8\168\u01bc\38\38\58\u01c1\n8\38\68\u01c4\n"+
		"8\r8\168\u01c5\58\u01c8\n8\39\39\39\39\69\u01ce\n9\r9\169\u01cf\39\39"+
		"\3:\3:\3:\3:\6:\u01d8\n:\r:\16:\u01d9\3:\3:\3;\3;\3;\3;\6;\u01e2\n;\r"+
		";\16;\u01e3\3;\3;\3<\3<\6<\u01ea\n<\r<\16<\u01eb\3<\6<\u01ef\n<\r<\16"+
		"<\u01f0\3<\3<\3<\3<\6<\u01f7\n<\r<\16<\u01f8\3<\3<\3<\6<\u01fe\n<\r<\16"+
		"<\u01ff\3<\6<\u0203\n<\r<\16<\u0204\3<\3<\3<\3<\6<\u020b\n<\r<\16<\u020c"+
		"\3<\5<\u0210\n<\3<\3<\3<\5<\u0215\n<\6<\u0217\n<\r<\16<\u0218\3=\3=\3"+
		"=\3=\3>\3>\4\u016f\u0185\2?\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32"+
		"\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a"+
		"\62c\63e\64g\2i\2k\65m\66o\67q8s9u:w;y<{=\3\2\t\4\2C\\c|\3\2\62;\3\2\f"+
		"\f\4\2GGgg\3\2\629\4\2\62;CH\5\2\13\f\17\17\"\"\2\u0245\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2"+
		"\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2"+
		"\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2"+
		"K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3"+
		"\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2"+
		"\2\2e\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2"+
		"u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\3}\3\2\2\2\5\u0085\3\2\2\2"+
		"\7\u0087\3\2\2\2\t\u008b\3\2\2\2\13\u0095\3\2\2\2\r\u0097\3\2\2\2\17\u00a1"+
		"\3\2\2\2\21\u00a4\3\2\2\2\23\u00a6\3\2\2\2\25\u00ae\3\2\2\2\27\u00b3\3"+
		"\2\2\2\31\u00bd\3\2\2\2\33\u00bf\3\2\2\2\35\u00c1\3\2\2\2\37\u00cc\3\2"+
		"\2\2!\u00d3\3\2\2\2#\u00d6\3\2\2\2%\u00da\3\2\2\2\'\u00e0\3\2\2\2)\u00e9"+
		"\3\2\2\2+\u00ec\3\2\2\2-\u00ef\3\2\2\2/\u00f6\3\2\2\2\61\u00fb\3\2\2\2"+
		"\63\u0101\3\2\2\2\65\u0106\3\2\2\2\67\u010b\3\2\2\29\u0111\3\2\2\2;\u0117"+
		"\3\2\2\2=\u0119\3\2\2\2?\u011b\3\2\2\2A\u011d\3\2\2\2C\u011f\3\2\2\2E"+
		"\u0124\3\2\2\2G\u0129\3\2\2\2I\u012f\3\2\2\2K\u0135\3\2\2\2M\u013c\3\2"+
		"\2\2O\u0142\3\2\2\2Q\u0149\3\2\2\2S\u0151\3\2\2\2U\u0153\3\2\2\2W\u0155"+
		"\3\2\2\2Y\u0158\3\2\2\2[\u015b\3\2\2\2]\u015e\3\2\2\2_\u0161\3\2\2\2a"+
		"\u0169\3\2\2\2c\u016b\3\2\2\2e\u0174\3\2\2\2g\u017d\3\2\2\2i\u017f\3\2"+
		"\2\2k\u0189\3\2\2\2m\u0190\3\2\2\2o\u0198\3\2\2\2q\u01c9\3\2\2\2s\u01d3"+
		"\3\2\2\2u\u01dd\3\2\2\2w\u0216\3\2\2\2y\u021a\3\2\2\2{\u021e\3\2\2\2}"+
		"~\7R\2\2~\177\7T\2\2\177\u0080\7Q\2\2\u0080\u0081\7I\2\2\u0081\u0082\7"+
		"T\2\2\u0082\u0083\7C\2\2\u0083\u0084\7O\2\2\u0084\4\3\2\2\2\u0085\u0086"+
		"\7=\2\2\u0086\6\3\2\2\2\u0087\u0088\7G\2\2\u0088\u0089\7P\2\2\u0089\u008a"+
		"\7F\2\2\u008a\b\3\2\2\2\u008b\u008c\7K\2\2\u008c\u008d\7P\2\2\u008d\u008e"+
		"\7V\2\2\u008e\u008f\7G\2\2\u008f\u0090\7T\2\2\u0090\u0091\7H\2\2\u0091"+
		"\u0092\7C\2\2\u0092\u0093\7E\2\2\u0093\u0094\7G\2\2\u0094\n\3\2\2\2\u0095"+
		"\u0096\7.\2\2\u0096\f\3\2\2\2\u0097\u0098\7R\2\2\u0098\u0099\7C\2\2\u0099"+
		"\u009a\7T\2\2\u009a\u009b\7C\2\2\u009b\u009c\7O\2\2\u009c\u009d\7G\2\2"+
		"\u009d\u009e\7V\2\2\u009e\u009f\7G\2\2\u009f\u00a0\7T\2\2\u00a0\16\3\2"+
		"\2\2\u00a1\u00a2\7<\2\2\u00a2\u00a3\7<\2\2\u00a3\20\3\2\2\2\u00a4\u00a5"+
		"\7?\2\2\u00a5\22\3\2\2\2\u00a6\u00a7\7K\2\2\u00a7\u00a8\7P\2\2\u00a8\u00a9"+
		"\7V\2\2\u00a9\u00aa\7G\2\2\u00aa\u00ab\7I\2\2\u00ab\u00ac\7G\2\2\u00ac"+
		"\u00ad\7T\2\2\u00ad\24\3\2\2\2\u00ae\u00af\7T\2\2\u00af\u00b0\7G\2\2\u00b0"+
		"\u00b1\7C\2\2\u00b1\u00b2\7N\2\2\u00b2\26\3\2\2\2\u00b3\u00b4\7E\2\2\u00b4"+
		"\u00b5\7J\2\2\u00b5\u00b6\7C\2\2\u00b6\u00b7\7T\2\2\u00b7\u00b8\7C\2\2"+
		"\u00b8\u00b9\7E\2\2\u00b9\u00ba\7V\2\2\u00ba\u00bb\7G\2\2\u00bb\u00bc"+
		"\7T\2\2\u00bc\30\3\2\2\2\u00bd\u00be\7*\2\2\u00be\32\3\2\2\2\u00bf\u00c0"+
		"\7+\2\2\u00c0\34\3\2\2\2\u00c1\u00c2\7U\2\2\u00c2\u00c3\7W\2\2\u00c3\u00c4"+
		"\7D\2\2\u00c4\u00c5\7T\2\2\u00c5\u00c6\7Q\2\2\u00c6\u00c7\7W\2\2\u00c7"+
		"\u00c8\7V\2\2\u00c8\u00c9\7K\2\2\u00c9\u00ca\7P\2\2\u00ca\u00cb\7G\2\2"+
		"\u00cb\36\3\2\2\2\u00cc\u00cd\7K\2\2\u00cd\u00ce\7P\2\2\u00ce\u00cf\7"+
		"V\2\2\u00cf\u00d0\7G\2\2\u00d0\u00d1\7P\2\2\u00d1\u00d2\7V\2\2\u00d2 "+
		"\3\2\2\2\u00d3\u00d4\7K\2\2\u00d4\u00d5\7P\2\2\u00d5\"\3\2\2\2\u00d6\u00d7"+
		"\7Q\2\2\u00d7\u00d8\7W\2\2\u00d8\u00d9\7V\2\2\u00d9$\3\2\2\2\u00da\u00db"+
		"\7K\2\2\u00db\u00dc\7P\2\2\u00dc\u00dd\7Q\2\2\u00dd\u00de\7W\2\2\u00de"+
		"\u00df\7V\2\2\u00df&\3\2\2\2\u00e0\u00e1\7H\2\2\u00e1\u00e2\7W\2\2\u00e2"+
		"\u00e3\7P\2\2\u00e3\u00e4\7E\2\2\u00e4\u00e5\7V\2\2\u00e5\u00e6\7K\2\2"+
		"\u00e6\u00e7\7Q\2\2\u00e7\u00e8\7P\2\2\u00e8(\3\2\2\2\u00e9\u00ea\7K\2"+
		"\2\u00ea\u00eb\7H\2\2\u00eb*\3\2\2\2\u00ec\u00ed\7F\2\2\u00ed\u00ee\7"+
		"Q\2\2\u00ee,\3\2\2\2\u00ef\u00f0\7U\2\2\u00f0\u00f1\7G\2\2\u00f1\u00f2"+
		"\7N\2\2\u00f2\u00f3\7G\2\2\u00f3\u00f4\7E\2\2\u00f4\u00f5\7V\2\2\u00f5"+
		".\3\2\2\2\u00f6\u00f7\7E\2\2\u00f7\u00f8\7C\2\2\u00f8\u00f9\7U\2\2\u00f9"+
		"\u00fa\7G\2\2\u00fa\60\3\2\2\2\u00fb\u00fc\7G\2\2\u00fc\u00fd\7P\2\2\u00fd"+
		"\u00fe\7F\2\2\u00fe\u00ff\7K\2\2\u00ff\u0100\7H\2\2\u0100\62\3\2\2\2\u0101"+
		"\u0102\7G\2\2\u0102\u0103\7N\2\2\u0103\u0104\7U\2\2\u0104\u0105\7G\2\2"+
		"\u0105\64\3\2\2\2\u0106\u0107\7V\2\2\u0107\u0108\7J\2\2\u0108\u0109\7"+
		"G\2\2\u0109\u010a\7P\2\2\u010a\66\3\2\2\2\u010b\u010c\7Y\2\2\u010c\u010d"+
		"\7J\2\2\u010d\u010e\7K\2\2\u010e\u010f\7N\2\2\u010f\u0110\7G\2\2\u0110"+
		"8\3\2\2\2\u0111\u0112\7G\2\2\u0112\u0113\7P\2\2\u0113\u0114\7F\2\2\u0114"+
		"\u0115\7F\2\2\u0115\u0116\7Q\2\2\u0116:\3\2\2\2\u0117\u0118\7-\2\2\u0118"+
		"<\3\2\2\2\u0119\u011a\7/\2\2\u011a>\3\2\2\2\u011b\u011c\7,\2\2\u011c@"+
		"\3\2\2\2\u011d\u011e\7\61\2\2\u011eB\3\2\2\2\u011f\u0120\7E\2\2\u0120"+
		"\u0121\7C\2\2\u0121\u0122\7N\2\2\u0122\u0123\7N\2\2\u0123D\3\2\2\2\u0124"+
		"\u0125\7\60\2\2\u0125\u0126\7Q\2\2\u0126\u0127\7T\2\2\u0127\u0128\7\60"+
		"\2\2\u0128F\3\2\2\2\u0129\u012a\7\60\2\2\u012a\u012b\7C\2\2\u012b\u012c"+
		"\7P\2\2\u012c\u012d\7F\2\2\u012d\u012e\7\60\2\2\u012eH\3\2\2\2\u012f\u0130"+
		"\7\60\2\2\u0130\u0131\7G\2\2\u0131\u0132\7S\2\2\u0132\u0133\7X\2\2\u0133"+
		"\u0134\7\60\2\2\u0134J\3\2\2\2\u0135\u0136\7\60\2\2\u0136\u0137\7P\2\2"+
		"\u0137\u0138\7G\2\2\u0138\u0139\7S\2\2\u0139\u013a\7X\2\2\u013a\u013b"+
		"\7\60\2\2\u013bL\3\2\2\2\u013c\u013d\7\60\2\2\u013d\u013e\7P\2\2\u013e"+
		"\u013f\7Q\2\2\u013f\u0140\7V\2\2\u0140\u0141\7\60\2\2\u0141N\3\2\2\2\u0142"+
		"\u0143\7\60\2\2\u0143\u0144\7V\2\2\u0144\u0145\7T\2\2\u0145\u0146\7W\2"+
		"\2\u0146\u0147\7G\2\2\u0147\u0148\7\60\2\2\u0148P\3\2\2\2\u0149\u014a"+
		"\7\60\2\2\u014a\u014b\7H\2\2\u014b\u014c\7C\2\2\u014c\u014d\7N\2\2\u014d"+
		"\u014e\7U\2\2\u014e\u014f\7G\2\2\u014f\u0150\7\60\2\2\u0150R\3\2\2\2\u0151"+
		"\u0152\7>\2\2\u0152T\3\2\2\2\u0153\u0154\7@\2\2\u0154V\3\2\2\2\u0155\u0156"+
		"\7>\2\2\u0156\u0157\7?\2\2\u0157X\3\2\2\2\u0158\u0159\7@\2\2\u0159\u015a"+
		"\7?\2\2\u015aZ\3\2\2\2\u015b\u015c\7?\2\2\u015c\u015d\7?\2\2\u015d\\\3"+
		"\2\2\2\u015e\u015f\7\61\2\2\u015f\u0160\7?\2\2\u0160^\3\2\2\2\u0161\u0162"+
		"\7F\2\2\u0162\u0163\7G\2\2\u0163\u0164\7H\2\2\u0164\u0165\7C\2\2\u0165"+
		"\u0166\7W\2\2\u0166\u0167\7N\2\2\u0167\u0168\7V\2\2\u0168`\3\2\2\2\u0169"+
		"\u016a\7<\2\2\u016ab\3\2\2\2\u016b\u016f\7$\2\2\u016c\u016e\13\2\2\2\u016d"+
		"\u016c\3\2\2\2\u016e\u0171\3\2\2\2\u016f\u0170\3\2\2\2\u016f\u016d\3\2"+
		"\2\2\u0170\u0172\3\2\2\2\u0171\u016f\3\2\2\2\u0172\u0173\7$\2\2\u0173"+
		"d\3\2\2\2\u0174\u017a\5g\64\2\u0175\u0179\5g\64\2\u0176\u0179\7a\2\2\u0177"+
		"\u0179\5i\65\2\u0178\u0175\3\2\2\2\u0178\u0176\3\2\2\2\u0178\u0177\3\2"+
		"\2\2\u0179\u017c\3\2\2\2\u017a\u0178\3\2\2\2\u017a\u017b\3\2\2\2\u017b"+
		"f\3\2\2\2\u017c\u017a\3\2\2\2\u017d\u017e\t\2\2\2\u017eh\3\2\2\2\u017f"+
		"\u0180\t\3\2\2\u0180j\3\2\2\2\u0181\u0185\7#\2\2\u0182\u0184\13\2\2\2"+
		"\u0183\u0182\3\2\2\2\u0184\u0187\3\2\2\2\u0185\u0186\3\2\2\2\u0185\u0183"+
		"\3\2\2\2\u0186\u0188\3\2\2\2\u0187\u0185\3\2\2\2\u0188\u018a\t\4\2\2\u0189"+
		"\u0181\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u0189\3\2\2\2\u018b\u018c\3\2"+
		"\2\2\u018c\u018d\3\2\2\2\u018d\u018e\b\66\2\2\u018el\3\2\2\2\u018f\u0191"+
		"\7/\2\2\u0190\u018f\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u0193\3\2\2\2\u0192"+
		"\u0194\t\3\2\2\u0193\u0192\3\2\2\2\u0194\u0195\3\2\2\2\u0195\u0193\3\2"+
		"\2\2\u0195\u0196\3\2\2\2\u0196n\3\2\2\2\u0197\u0199\7/\2\2\u0198\u0197"+
		"\3\2\2\2\u0198\u0199\3\2\2\2\u0199\u01c7\3\2\2\2\u019a\u019c\t\3\2\2\u019b"+
		"\u019a\3\2\2\2\u019c\u019d\3\2\2\2\u019d\u019b\3\2\2\2\u019d\u019e\3\2"+
		"\2\2\u019e\u019f\3\2\2\2\u019f\u01a1\t\5\2\2\u01a0\u01a2\7/\2\2\u01a1"+
		"\u01a0\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a4\3\2\2\2\u01a3\u01a5\t\3"+
		"\2\2\u01a4\u01a3\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a6"+
		"\u01a7\3\2\2\2\u01a7\u01c8\3\2\2\2\u01a8\u01aa\t\3\2\2\u01a9\u01a8\3\2"+
		"\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac"+
		"\u01ad\3\2\2\2\u01ad\u01af\13\2\2\2\u01ae\u01b0\t\3\2\2\u01af\u01ae\3"+
		"\2\2\2\u01b0\u01b1\3\2\2\2\u01b1\u01af\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2"+
		"\u01c8\3\2\2\2\u01b3\u01b5\t\3\2\2\u01b4\u01b3\3\2\2\2\u01b5\u01b6\3\2"+
		"\2\2\u01b6\u01b4\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8"+
		"\u01ba\13\2\2\2\u01b9\u01bb\t\3\2\2\u01ba\u01b9\3\2\2\2\u01bb\u01bc\3"+
		"\2\2\2\u01bc\u01ba\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01be\3\2\2\2\u01be"+
		"\u01c0\t\5\2\2\u01bf\u01c1\7/\2\2\u01c0\u01bf\3\2\2\2\u01c0\u01c1\3\2"+
		"\2\2\u01c1\u01c3\3\2\2\2\u01c2\u01c4\t\3\2\2\u01c3\u01c2\3\2\2\2\u01c4"+
		"\u01c5\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01c8\3\2"+
		"\2\2\u01c7\u019b\3\2\2\2\u01c7\u01a9\3\2\2\2\u01c7\u01b4\3\2\2\2\u01c8"+
		"p\3\2\2\2\u01c9\u01ca\7d\2\2\u01ca\u01cb\7)\2\2\u01cb\u01cd\3\2\2\2\u01cc"+
		"\u01ce\4\62\63\2\u01cd\u01cc\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf\u01cd\3"+
		"\2\2\2\u01cf\u01d0\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1\u01d2\7)\2\2\u01d2"+
		"r\3\2\2\2\u01d3\u01d4\7q\2\2\u01d4\u01d5\7)\2\2\u01d5\u01d7\3\2\2\2\u01d6"+
		"\u01d8\t\6\2\2\u01d7\u01d6\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9\u01d7\3\2"+
		"\2\2\u01d9\u01da\3\2\2\2\u01da\u01db\3\2\2\2\u01db\u01dc\7)\2\2\u01dc"+
		"t\3\2\2\2\u01dd\u01de\7|\2\2\u01de\u01df\7)\2\2\u01df\u01e1\3\2\2\2\u01e0"+
		"\u01e2\t\7\2\2\u01e1\u01e0\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3\u01e1\3\2"+
		"\2\2\u01e3\u01e4\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5\u01e6\7)\2\2\u01e6"+
		"v\3\2\2\2\u01e7\u01f6\7)\2\2\u01e8\u01ea\t\2\2\2\u01e9\u01e8\3\2\2\2\u01ea"+
		"\u01eb\3\2\2\2\u01eb\u01e9\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01f7\3\2"+
		"\2\2\u01ed\u01ef\t\3\2\2\u01ee\u01ed\3\2\2\2\u01ef\u01f0\3\2\2\2\u01f0"+
		"\u01ee\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1\u01f7\3\2\2\2\u01f2\u01f7\7\""+
		"\2\2\u01f3\u01f4\7)\2\2\u01f4\u01f7\7)\2\2\u01f5\u01f7\7$\2\2\u01f6\u01e9"+
		"\3\2\2\2\u01f6\u01ee\3\2\2\2\u01f6\u01f2\3\2\2\2\u01f6\u01f3\3\2\2\2\u01f6"+
		"\u01f5\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8\u01f6\3\2\2\2\u01f8\u01f9\3\2"+
		"\2\2\u01f9\u01fa\3\2\2\2\u01fa\u0210\7)\2\2\u01fb\u020a\7$\2\2\u01fc\u01fe"+
		"\t\2\2\2\u01fd\u01fc\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff\u01fd\3\2\2\2\u01ff"+
		"\u0200\3\2\2\2\u0200\u020b\3\2\2\2\u0201\u0203\t\3\2\2\u0202\u0201\3\2"+
		"\2\2\u0203\u0204\3\2\2\2\u0204\u0202\3\2\2\2\u0204\u0205\3\2\2\2\u0205"+
		"\u020b\3\2\2\2\u0206\u020b\7\"\2\2\u0207\u0208\7$\2\2\u0208\u020b\7$\2"+
		"\2\u0209\u020b\7)\2\2\u020a\u01fd\3\2\2\2\u020a\u0202\3\2\2\2\u020a\u0206"+
		"\3\2\2\2\u020a\u0207\3\2\2\2\u020a\u0209\3\2\2\2\u020b\u020c\3\2\2\2\u020c"+
		"\u020a\3\2\2\2\u020c\u020d\3\2\2\2\u020d\u020e\3\2\2\2\u020e\u0210\7$"+
		"\2\2\u020f\u01e7\3\2\2\2\u020f\u01fb\3\2\2\2\u0210\u0214\3\2\2\2\u0211"+
		"\u0212\7\"\2\2\u0212\u0213\7-\2\2\u0213\u0215\7\"\2\2\u0214\u0211\3\2"+
		"\2\2\u0214\u0215\3\2\2\2\u0215\u0217\3\2\2\2\u0216\u020f\3\2\2\2\u0217"+
		"\u0218\3\2\2\2\u0218\u0216\3\2\2\2\u0218\u0219\3\2\2\2\u0219x\3\2\2\2"+
		"\u021a\u021b\t\b\2\2\u021b\u021c\3\2\2\2\u021c\u021d\b=\2\2\u021dz\3\2"+
		"\2\2\u021e\u021f\13\2\2\2\u021f|\3\2\2\2$\2\u016f\u0178\u017a\u0185\u018b"+
		"\u0190\u0195\u0198\u019d\u01a1\u01a6\u01ab\u01b1\u01b6\u01bc\u01c0\u01c5"+
		"\u01c7\u01cf\u01d9\u01e1\u01e3\u01eb\u01f0\u01f6\u01f8\u01ff\u0204\u020a"+
		"\u020c\u020f\u0214\u0218\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}