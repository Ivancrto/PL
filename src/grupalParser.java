// Generated from grupal.g4 by ANTLR 4.7.2

    import java.io.FileWriter;
    import java.io.File;
    import java.io.IOException;
    import java.util.HashMap;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class grupalParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

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
	public static final int
		RULE_prg = 0, RULE_dcllist = 1, RULE_dcllistp = 2, RULE_cabecera = 3, 
		RULE_cablist = 4, RULE_decsubprog = 5, RULE_sentlist = 6, RULE_dcl = 7, 
		RULE_dclp = 8, RULE_defcte = 9, RULE_ctelist = 10, RULE_simpvalue = 11, 
		RULE_defvar = 12, RULE_tipo = 13, RULE_charlength = 14, RULE_varlist = 15, 
		RULE_varlistp = 16, RULE_init = 17, RULE_decproc = 18, RULE_formal_paramlist = 19, 
		RULE_nomparamlist = 20, RULE_nomparamlistp = 21, RULE_dec_s_paramlist = 22, 
		RULE_tipoparam = 23, RULE_decfun = 24, RULE_dec_f_paramlist = 25, RULE_sent = 26, 
		RULE_sentp = 27, RULE_sentpp = 28, RULE_sentppp = 29, RULE_exp = 30, RULE_expp = 31, 
		RULE_op = 32, RULE_oparit = 33, RULE_factor = 34, RULE_factorp = 35, RULE_explist = 36, 
		RULE_proc_call = 37, RULE_subpparamlist = 38, RULE_subproglist = 39, RULE_codproc = 40, 
		RULE_codfun = 41, RULE_expcond = 42, RULE_expcondp = 43, RULE_oplog = 44, 
		RULE_factorcond = 45, RULE_opcomp = 46, RULE_doval = 47, RULE_casos = 48, 
		RULE_casosp = 49, RULE_etiquetas = 50, RULE_etiquetasp = 51, RULE_etiquetaspp = 52, 
		RULE_listaetiquetas = 53;
	private static String[] makeRuleNames() {
		return new String[] {
			"prg", "dcllist", "dcllistp", "cabecera", "cablist", "decsubprog", "sentlist", 
			"dcl", "dclp", "defcte", "ctelist", "simpvalue", "defvar", "tipo", "charlength", 
			"varlist", "varlistp", "init", "decproc", "formal_paramlist", "nomparamlist", 
			"nomparamlistp", "dec_s_paramlist", "tipoparam", "decfun", "dec_f_paramlist", 
			"sent", "sentp", "sentpp", "sentppp", "exp", "expp", "op", "oparit", 
			"factor", "factorp", "explist", "proc_call", "subpparamlist", "subproglist", 
			"codproc", "codfun", "expcond", "expcondp", "oplog", "factorcond", "opcomp", 
			"doval", "casos", "casosp", "etiquetas", "etiquetasp", "etiquetaspp", 
			"listaetiquetas"
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

	@Override
	public String getGrammarFileName() { return "grupal.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }



	    Creador creador = new Creador();
	    Cabeceras cab= new Cabeceras();

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


	//Este método se va a encargar de manejar las comillas de los STRING_CONST de fortran por comillas para el lenguaje C

	public String strConstComillas(String sConst){
		         	         			    String cadenaCorrecta = "";
		         	         			    String s = sConst;
		         	         			    if(sConst.contains ("+")){
		         	         			     String[] separacion = sConst.split("\\+");
		         	         			     int ind = 0;
		         	         	            		    for(String i: separacion){
		         	         	            		       if(i.charAt(i.length()-1)==' ' && i.charAt(0)==' '){
		         	         	                               i = i.substring(1, i.length()-1);
		         	         	            		       }else if(i.charAt(0)==' '){
		         	         	            		           i = i.substring(1, i.length());
		         	         	            		       }else if(i.charAt(i.length()-1)==' '){
		         	         	            		          i = i.substring(0, i.length()-1);
		         	         	            		       }
		         	         	            		       if(i.substring(1, i.length()-1).contains("\"")){
		         	         								   i = i.substring(1, i.length()-1).replaceAll("\"", "\\\\\"");
		         	         								   if(ind == separacion.length-1){
		         												   cadenaCorrecta += "\"" + i + "\"";
		         											   }else{
		         												   cadenaCorrecta += "\"" + i + "\" + ";
		         											   }
		         	         							   }else{
		         											   if(i.charAt(0)=='\''){
		         												 i = "\"" +  i.substring(1, i.length()-1) +  "\"";
		         											   }
		         											   if(ind == separacion.length-1){
		         												   cadenaCorrecta +=   i;
		         											   }else{
		         												   cadenaCorrecta +=  i + " + ";
		         											   }
		         	         	            		       }
		         	         	            		       ind++;
		         	         	            		    }
		         	         	            		    cadenaCorrecta = cadenaCorrecta.replaceAll("\\\\\"\\\\\"","\\\\\"");
		         	         	            		    cadenaCorrecta = cadenaCorrecta.replaceAll("''","'");
		         	         	            		    return cadenaCorrecta;
		         	         			    }
		         	         			   else{
		         	         			       cadenaCorrecta = sConst.replaceAll("\\\\\"\\\\\"","\\\\\"");
		         	         			       cadenaCorrecta = cadenaCorrecta.replaceAll("''","'");
		         	         			       return cadenaCorrecta;
		         	         			   }

		         	         		    }

	//Metodo para tabular todo el String que reciba
	   public String tabulacion(String t) {
	        int cont = 0;
	        String fin= "";
	        String [] lineas = t.split("\n");
	        for(String linea: lineas){
	            if(linea.contains("{")){
	                    String t1="";
	                    for (int i=0; i<cont; i++){
	                        t1+= "\t";
	                    }
	                    cont= cont+1;
	                    fin+= t1 + linea+ "\n";
	            }
	            else{
	                if(linea.contains("}")){
	                cont=cont-1;
	                }
	                String t1="";
	                for (int i=0; i<cont; i++){
	                    t1+= "\t";
	                }
	                fin += t1 + linea + "\n";
	            }
	        }
	        return fin;
	    }

	public grupalParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class PrgContext extends ParserRuleContext {
		public DcllistContext dcllist;
		public CabeceraContext cabecera;
		public SentContext sent;
		public SentlistContext sentlist;
		public SubproglistContext subproglist;
		public List<TerminalNode> IDENT() { return getTokens(grupalParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(grupalParser.IDENT, i);
		}
		public DcllistContext dcllist() {
			return getRuleContext(DcllistContext.class,0);
		}
		public CabeceraContext cabecera() {
			return getRuleContext(CabeceraContext.class,0);
		}
		public SentContext sent() {
			return getRuleContext(SentContext.class,0);
		}
		public SentlistContext sentlist() {
			return getRuleContext(SentlistContext.class,0);
		}
		public SubproglistContext subproglist() {
			return getRuleContext(SubproglistContext.class,0);
		}
		public PrgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grupalListener ) ((grupalListener)listener).enterPrg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grupalListener ) ((grupalListener)listener).exitPrg(this);
		}
	}

	public final PrgContext prg() throws RecognitionException {
		PrgContext _localctx = new PrgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(T__0);
			setState(109);
			match(IDENT);
			setState(110);
			match(T__1);
			setState(111);
			((PrgContext)_localctx).dcllist = dcllist();
			setState(112);
			((PrgContext)_localctx).cabecera = cabecera();
			setState(113);
			((PrgContext)_localctx).sent = sent();
			setState(114);
			((PrgContext)_localctx).sentlist = sentlist();
			setState(115);
			match(T__2);
			setState(116);
			match(T__0);
			setState(117);
			match(IDENT);
			setState(118);
			((PrgContext)_localctx).subproglist = subproglist();
			 System.out.println(creador.getConstantes().getDefine());
			    System.out.println(cab.toString());
			    System.out.println(creador.getFusionFuncionSubrutina());
			    System.out.println(creador.getPrincipal().addPrincipal(((PrgContext)_localctx).dcllist.s + ((PrgContext)_localctx).sent.re + ((PrgContext)_localctx).sentlist.re));

			insertTxtC(tabulacion("\n" + ((PrgContext)_localctx).cabecera.re + "\n" + ((PrgContext)_localctx).subproglist.re  + "\n" + "void main (void){" + "\n" + ((PrgContext)_localctx).dcllist.s + ((PrgContext)_localctx).sent.re + ((PrgContext)_localctx).sentlist.re + "\n"+ "}\n"));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DcllistContext extends ParserRuleContext {
		public String s;
		public DcllistpContext dcllistp;
		public DcllistpContext dcllistp() {
			return getRuleContext(DcllistpContext.class,0);
		}
		public DcllistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dcllist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grupalListener ) ((grupalListener)listener).enterDcllist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grupalListener ) ((grupalListener)listener).exitDcllist(this);
		}
	}

	public final DcllistContext dcllist() throws RecognitionException {
		DcllistContext _localctx = new DcllistContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_dcllist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			((DcllistContext)_localctx).dcllistp = dcllistp();
			((DcllistContext)_localctx).s =  ((DcllistContext)_localctx).dcllistp.re ;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DcllistpContext extends ParserRuleContext {
		public String re;
		public DclContext dcl;
		public DcllistpContext dcllistp;
		public DclContext dcl() {
			return getRuleContext(DclContext.class,0);
		}
		public DcllistpContext dcllistp() {
			return getRuleContext(DcllistpContext.class,0);
		}
		public DcllistpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dcllistp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grupalListener ) ((grupalListener)listener).enterDcllistp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grupalListener ) ((grupalListener)listener).exitDcllistp(this);
		}
	}

	public final DcllistpContext dcllistp() throws RecognitionException {
		DcllistpContext _localctx = new DcllistpContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_dcllistp);
		try {
			setState(129);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
			case T__9:
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				((DcllistpContext)_localctx).dcl = dcl();
				setState(125);
				((DcllistpContext)_localctx).dcllistp = dcllistp();
				((DcllistpContext)_localctx).re =  ((DcllistpContext)_localctx).dcl.re+ " " + ((DcllistpContext)_localctx).dcllistp.re ;
				}
				break;
			case T__3:
			case T__19:
			case T__20:
			case T__21:
			case T__32:
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				((DcllistpContext)_localctx).re = "";
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CabeceraContext extends ParserRuleContext {
		public String re;
		public CablistContext cablist;
		public CablistContext cablist() {
			return getRuleContext(CablistContext.class,0);
		}
		public CabeceraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cabecera; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grupalListener ) ((grupalListener)listener).enterCabecera(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grupalListener ) ((grupalListener)listener).exitCabecera(this);
		}
	}

	public final CabeceraContext cabecera() throws RecognitionException {
		CabeceraContext _localctx = new CabeceraContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_cabecera);
		try {
			setState(138);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				match(T__3);
				setState(132);
				((CabeceraContext)_localctx).cablist = cablist();
				setState(133);
				match(T__2);
				setState(134);
				match(T__3);
				((CabeceraContext)_localctx).re = ((CabeceraContext)_localctx).cablist.re;
				}
				break;
			case T__19:
			case T__20:
			case T__21:
			case T__32:
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				((CabeceraContext)_localctx).re = "";
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CablistContext extends ParserRuleContext {
		public String re;
		public DecprocContext decproc() {
			return getRuleContext(DecprocContext.class,0);
		}
		public DecsubprogContext decsubprog() {
			return getRuleContext(DecsubprogContext.class,0);
		}
		public DecfunContext decfun() {
			return getRuleContext(DecfunContext.class,0);
		}
		public CablistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cablist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grupalListener ) ((grupalListener)listener).enterCablist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grupalListener ) ((grupalListener)listener).exitCablist(this);
		}
	}

	public final CablistContext cablist() throws RecognitionException {
		CablistContext _localctx = new CablistContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_cablist);
		try {
			setState(146);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				decproc();
				setState(141);
				decsubprog();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				decfun();
				setState(144);
				decsubprog();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DecsubprogContext extends ParserRuleContext {
		public String re;
		public DecprocContext decproc() {
			return getRuleContext(DecprocContext.class,0);
		}
		public DecsubprogContext decsubprog() {
			return getRuleContext(DecsubprogContext.class,0);
		}
		public DecfunContext decfun() {
			return getRuleContext(DecfunContext.class,0);
		}
		public DecsubprogContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decsubprog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grupalListener ) ((grupalListener)listener).enterDecsubprog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grupalListener ) ((grupalListener)listener).exitDecsubprog(this);
		}
	}

	public final DecsubprogContext decsubprog() throws RecognitionException {
		DecsubprogContext _localctx = new DecsubprogContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_decsubprog);
		try {
			setState(157);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				decproc();
				setState(149);
				decsubprog();

				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				decfun();
				setState(153);
				decsubprog();

				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 3);
				{
				((DecsubprogContext)_localctx).re = "";
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SentlistContext extends ParserRuleContext {
		public String re;
		public SentContext sent;
		public SentlistContext sentlist;
		public SentContext sent() {
			return getRuleContext(SentContext.class,0);
		}
		public SentlistContext sentlist() {
			return getRuleContext(SentlistContext.class,0);
		}
		public SentlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grupalListener ) ((grupalListener)listener).enterSentlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grupalListener ) ((grupalListener)listener).exitSentlist(this);
		}
	}

	public final SentlistContext sentlist() throws RecognitionException {
		SentlistContext _localctx = new SentlistContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_sentlist);
		try {
			setState(164);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				((SentlistContext)_localctx).sent = sent();
				setState(160);
				((SentlistContext)_localctx).sentlist = sentlist();
				((SentlistContext)_localctx).re = ((SentlistContext)_localctx).sent.re+ ((SentlistContext)_localctx).sentlist.re;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				((SentlistContext)_localctx).re = "";
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DclContext extends ParserRuleContext {
		public String re;
		public TipoContext tipo;
		public DclpContext dclp;
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public DclpContext dclp() {
			return getRuleContext(DclpContext.class,0);
		}
		public DclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dcl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grupalListener ) ((grupalListener)listener).enterDcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grupalListener ) ((grupalListener)listener).exitDcl(this);
		}
	}

	public final DclContext dcl() throws RecognitionException {
		DclContext _localctx = new DclContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_dcl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			((DclContext)_localctx).tipo = tipo();
			setState(167);
			((DclContext)_localctx).dclp = dclp(((DclContext)_localctx).tipo.t);
			((DclContext)_localctx).re = ((DclContext)_localctx).dclp.re;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DclpContext extends ParserRuleContext {
		public String h;
		public String re = "";
		public Token IDENT;
		public SimpvalueContext simpvalue;
		public CtelistContext ctelist;
		public VarlistContext varlist;
		public DefvarContext defvar;
		public TerminalNode IDENT() { return getToken(grupalParser.IDENT, 0); }
		public SimpvalueContext simpvalue() {
			return getRuleContext(SimpvalueContext.class,0);
		}
		public CtelistContext ctelist() {
			return getRuleContext(CtelistContext.class,0);
		}
		public DefcteContext defcte() {
			return getRuleContext(DefcteContext.class,0);
		}
		public VarlistContext varlist() {
			return getRuleContext(VarlistContext.class,0);
		}
		public DefvarContext defvar() {
			return getRuleContext(DefvarContext.class,0);
		}
		public DclpContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public DclpContext(ParserRuleContext parent, int invokingState, String h) {
			super(parent, invokingState);
			this.h = h;
		}
		@Override public int getRuleIndex() { return RULE_dclp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grupalListener ) ((grupalListener)listener).enterDclp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grupalListener ) ((grupalListener)listener).exitDclp(this);
		}
	}

	public final DclpContext dclp(String h) throws RecognitionException {
		DclpContext _localctx = new DclpContext(_ctx, getState(), h);
		enterRule(_localctx, 16, RULE_dclp);
		try {
			setState(188);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				match(T__4);
				setState(171);
				match(T__5);
				setState(172);
				match(T__6);
				setState(173);
				((DclpContext)_localctx).IDENT = match(IDENT);
				setState(174);
				match(T__7);
				setState(175);
				((DclpContext)_localctx).simpvalue = simpvalue();
				setState(176);
				((DclpContext)_localctx).ctelist = ctelist();
				setState(177);
				match(T__1);
				setState(178);
				defcte();

				                                            creador.getConstantes().addConstante((((DclpContext)_localctx).IDENT!=null?((DclpContext)_localctx).IDENT.getText():null)+ " " +((DclpContext)_localctx).simpvalue.s +" "+((DclpContext)_localctx).ctelist.re);
				                                        
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(181);
				match(T__6);
				setState(182);
				((DclpContext)_localctx).varlist = varlist("");
				setState(183);
				match(T__1);
				setState(184);
				((DclpContext)_localctx).defvar = defvar();
				((DclpContext)_localctx).re =  _localctx.h +  " " + ((DclpContext)_localctx).varlist.s + ";\n" + ((DclpContext)_localctx).defvar.re + "";
				}
				break;
			case T__3:
			case T__8:
			case T__9:
			case T__10:
			case T__19:
			case T__20:
			case T__21:
			case T__32:
			case IDENT:
				enterOuterAlt(_localctx, 3);
				{
				((DclpContext)_localctx).re = "";
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefcteContext extends ParserRuleContext {
		public String re;
		public Token IDENT;
		public SimpvalueContext simpvalue;
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(grupalParser.IDENT, 0); }
		public SimpvalueContext simpvalue() {
			return getRuleContext(SimpvalueContext.class,0);
		}
		public CtelistContext ctelist() {
			return getRuleContext(CtelistContext.class,0);
		}
		public DefcteContext defcte() {
			return getRuleContext(DefcteContext.class,0);
		}
		public DefcteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defcte; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grupalListener ) ((grupalListener)listener).enterDefcte(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grupalListener ) ((grupalListener)listener).exitDefcte(this);
		}
	}

	public final DefcteContext defcte() throws RecognitionException {
		DefcteContext _localctx = new DefcteContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_defcte);
		try {
			setState(203);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(190);
				tipo();
				setState(191);
				match(T__4);
				setState(192);
				match(T__5);
				setState(193);
				match(T__6);
				setState(194);
				((DefcteContext)_localctx).IDENT = match(IDENT);
				setState(195);
				match(T__7);
				setState(196);
				((DefcteContext)_localctx).simpvalue = simpvalue();
				setState(197);
				ctelist();
				setState(198);
				match(T__1);
				setState(199);
				defcte();

				                        ((DefcteContext)_localctx).re =  "";
				                        creador.getConstantes().addConstante((((DefcteContext)_localctx).IDENT!=null?((DefcteContext)_localctx).IDENT.getText():null), ((DefcteContext)_localctx).simpvalue.s);
				                        
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				((DefcteContext)_localctx).re = "";
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CtelistContext extends ParserRuleContext {
		public String re;
		public Token IDENT;
		public SimpvalueContext simpvalue;
		public CtelistContext ctelist;
		public TerminalNode IDENT() { return getToken(grupalParser.IDENT, 0); }
		public SimpvalueContext simpvalue() {
			return getRuleContext(SimpvalueContext.class,0);
		}
		public CtelistContext ctelist() {
			return getRuleContext(CtelistContext.class,0);
		}
		public CtelistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ctelist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grupalListener ) ((grupalListener)listener).enterCtelist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grupalListener ) ((grupalListener)listener).exitCtelist(this);
		}
	}

	public final CtelistContext ctelist() throws RecognitionException {
		CtelistContext _localctx = new CtelistContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ctelist);
		try {
			setState(213);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(205);
				match(T__4);
				setState(206);
				((CtelistContext)_localctx).IDENT = match(IDENT);
				setState(207);
				match(T__7);
				setState(208);
				((CtelistContext)_localctx).simpvalue = simpvalue();
				setState(209);
				((CtelistContext)_localctx).ctelist = ctelist();
				((CtelistContext)_localctx).re = ','+(((CtelistContext)_localctx).IDENT!=null?((CtelistContext)_localctx).IDENT.getText():null)+ " " +((CtelistContext)_localctx).simpvalue.s+((CtelistContext)_localctx).ctelist.re;
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				((CtelistContext)_localctx).re = "";
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpvalueContext extends ParserRuleContext {
		public String s;
		public Token NUM_INT_CONST;
		public Token NUM_REAL_CONST;
		public Token STRING_CONST;
		public Token NUM_INT_CONST_B;
		public Token NUM_INT_CONST_O;
		public Token NUM_INT_CONST_H;
		public TerminalNode NUM_INT_CONST() { return getToken(grupalParser.NUM_INT_CONST, 0); }
		public TerminalNode NUM_REAL_CONST() { return getToken(grupalParser.NUM_REAL_CONST, 0); }
		public TerminalNode STRING_CONST() { return getToken(grupalParser.STRING_CONST, 0); }
		public TerminalNode NUM_INT_CONST_B() { return getToken(grupalParser.NUM_INT_CONST_B, 0); }
		public TerminalNode NUM_INT_CONST_O() { return getToken(grupalParser.NUM_INT_CONST_O, 0); }
		public TerminalNode NUM_INT_CONST_H() { return getToken(grupalParser.NUM_INT_CONST_H, 0); }
		public SimpvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grupalListener ) ((grupalListener)listener).enterSimpvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grupalListener ) ((grupalListener)listener).exitSimpvalue(this);
		}
	}

	public final SimpvalueContext simpvalue() throws RecognitionException {
		SimpvalueContext _localctx = new SimpvalueContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_simpvalue);
		try {
			setState(227);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM_INT_CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(215);
				((SimpvalueContext)_localctx).NUM_INT_CONST = match(NUM_INT_CONST);
				((SimpvalueContext)_localctx).s =  (((SimpvalueContext)_localctx).NUM_INT_CONST!=null?((SimpvalueContext)_localctx).NUM_INT_CONST.getText():null);
				}
				break;
			case NUM_REAL_CONST:
				enterOuterAlt(_localctx, 2);
				{
				setState(217);
				((SimpvalueContext)_localctx).NUM_REAL_CONST = match(NUM_REAL_CONST);
				((SimpvalueContext)_localctx).s =  (((SimpvalueContext)_localctx).NUM_REAL_CONST!=null?((SimpvalueContext)_localctx).NUM_REAL_CONST.getText():null);
				}
				break;
			case STRING_CONST:
				enterOuterAlt(_localctx, 3);
				{
				setState(219);
				((SimpvalueContext)_localctx).STRING_CONST = match(STRING_CONST);
				((SimpvalueContext)_localctx).s =  strConstComillas((((SimpvalueContext)_localctx).STRING_CONST!=null?((SimpvalueContext)_localctx).STRING_CONST.getText():null));
				}
				break;
			case NUM_INT_CONST_B:
				enterOuterAlt(_localctx, 4);
				{
				setState(221);
				((SimpvalueContext)_localctx).NUM_INT_CONST_B = match(NUM_INT_CONST_B);
				((SimpvalueContext)_localctx).s =  "0b" + (((SimpvalueContext)_localctx).NUM_INT_CONST_B!=null?((SimpvalueContext)_localctx).NUM_INT_CONST_B.getText():null).substring(2,(((SimpvalueContext)_localctx).NUM_INT_CONST_B!=null?((SimpvalueContext)_localctx).NUM_INT_CONST_B.getText():null).length()-1)  ;
				}
				break;
			case NUM_INT_CONST_O:
				enterOuterAlt(_localctx, 5);
				{
				setState(223);
				((SimpvalueContext)_localctx).NUM_INT_CONST_O = match(NUM_INT_CONST_O);
				((SimpvalueContext)_localctx).s =  "0o" + (((SimpvalueContext)_localctx).NUM_INT_CONST_O!=null?((SimpvalueContext)_localctx).NUM_INT_CONST_O.getText():null).substring(2,(((SimpvalueContext)_localctx).NUM_INT_CONST_O!=null?((SimpvalueContext)_localctx).NUM_INT_CONST_O.getText():null).length()-1)  ;
				}
				break;
			case NUM_INT_CONST_H:
				enterOuterAlt(_localctx, 6);
				{
				setState(225);
				((SimpvalueContext)_localctx).NUM_INT_CONST_H = match(NUM_INT_CONST_H);
				((SimpvalueContext)_localctx).s =  "0x" + (((SimpvalueContext)_localctx).NUM_INT_CONST_H!=null?((SimpvalueContext)_localctx).NUM_INT_CONST_H.getText():null).substring(2,(((SimpvalueContext)_localctx).NUM_INT_CONST_H!=null?((SimpvalueContext)_localctx).NUM_INT_CONST_H.getText():null).length()-1)  ;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefvarContext extends ParserRuleContext {
		public String re;
		public TipoContext tipo;
		public VarlistContext varlist;
		public DefvarContext defvar;
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public VarlistContext varlist() {
			return getRuleContext(VarlistContext.class,0);
		}
		public DefvarContext defvar() {
			return getRuleContext(DefvarContext.class,0);
		}
		public DefvarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defvar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grupalListener ) ((grupalListener)listener).enterDefvar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grupalListener ) ((grupalListener)listener).exitDefvar(this);
		}
	}

	public final DefvarContext defvar() throws RecognitionException {
		DefvarContext _localctx = new DefvarContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_defvar);
		try {
			setState(237);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(229);
				((DefvarContext)_localctx).tipo = tipo();
				setState(230);
				match(T__6);
				setState(231);
				((DefvarContext)_localctx).varlist = varlist(((DefvarContext)_localctx).tipo.cl);
				setState(232);
				match(T__1);
				setState(233);
				((DefvarContext)_localctx).defvar = defvar();
				((DefvarContext)_localctx).re =  ((DefvarContext)_localctx).tipo.t + ((DefvarContext)_localctx).varlist.s + ";\n" + ((DefvarContext)_localctx).defvar.re;
				                                                            //insertTxtC(((DefvarContext)_localctx).tipo.t + ((DefvarContext)_localctx).varlist.s + ";\n");
				                                                            
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				((DefvarContext)_localctx).re = "";
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TipoContext extends ParserRuleContext {
		public String t;
		public String cl;
		public CharlengthContext charlength;
		public CharlengthContext charlength() {
			return getRuleContext(CharlengthContext.class,0);
		}
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grupalListener ) ((grupalListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grupalListener ) ((grupalListener)listener).exitTipo(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_tipo);
		try {
			setState(247);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(239);
				match(T__8);
				((TipoContext)_localctx).t = "int "; ((TipoContext)_localctx).cl = "";
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(241);
				match(T__9);
				((TipoContext)_localctx).t = "float "; ((TipoContext)_localctx).cl = "";
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 3);
				{
				setState(243);
				match(T__10);
				setState(244);
				((TipoContext)_localctx).charlength = charlength();
				((TipoContext)_localctx).t =  "char "; ((TipoContext)_localctx).cl = ((TipoContext)_localctx).charlength.s;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CharlengthContext extends ParserRuleContext {
		public String s;
		public Token NUM_INT_CONST;
		public TerminalNode NUM_INT_CONST() { return getToken(grupalParser.NUM_INT_CONST, 0); }
		public CharlengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charlength; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grupalListener ) ((grupalListener)listener).enterCharlength(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grupalListener ) ((grupalListener)listener).exitCharlength(this);
		}
	}

	public final CharlengthContext charlength() throws RecognitionException {
		CharlengthContext _localctx = new CharlengthContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_charlength);
		try {
			setState(254);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(249);
				match(T__11);
				setState(250);
				((CharlengthContext)_localctx).NUM_INT_CONST = match(NUM_INT_CONST);
				setState(251);
				match(T__12);
				((CharlengthContext)_localctx).s = '['+ (((CharlengthContext)_localctx).NUM_INT_CONST!=null?((CharlengthContext)_localctx).NUM_INT_CONST.getText():null) +"] ";
				}
				break;
			case T__3:
			case T__4:
			case T__6:
			case T__8:
			case T__9:
			case T__10:
			case T__19:
			case T__20:
			case T__21:
			case T__32:
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				((CharlengthContext)_localctx).s = "";
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarlistContext extends ParserRuleContext {
		public String cl;
		public String s;
		public Token IDENT;
		public InitContext init;
		public VarlistpContext varlistp;
		public TerminalNode IDENT() { return getToken(grupalParser.IDENT, 0); }
		public InitContext init() {
			return getRuleContext(InitContext.class,0);
		}
		public VarlistpContext varlistp() {
			return getRuleContext(VarlistpContext.class,0);
		}
		public VarlistContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public VarlistContext(ParserRuleContext parent, int invokingState, String cl) {
			super(parent, invokingState);
			this.cl = cl;
		}
		@Override public int getRuleIndex() { return RULE_varlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grupalListener ) ((grupalListener)listener).enterVarlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grupalListener ) ((grupalListener)listener).exitVarlist(this);
		}
	}

	public final VarlistContext varlist(String cl) throws RecognitionException {
		VarlistContext _localctx = new VarlistContext(_ctx, getState(), cl);
		enterRule(_localctx, 30, RULE_varlist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			((VarlistContext)_localctx).IDENT = match(IDENT);
			setState(257);
			((VarlistContext)_localctx).init = init();
			setState(258);
			((VarlistContext)_localctx).varlistp = varlistp(_localctx.cl);
			((VarlistContext)_localctx).s =  (((VarlistContext)_localctx).IDENT!=null?((VarlistContext)_localctx).IDENT.getText():null)+ _localctx.cl + ((VarlistContext)_localctx).init.s + ((VarlistContext)_localctx).varlistp.s;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarlistpContext extends ParserRuleContext {
		public String cl;
		public String s;
		public VarlistContext varlist;
		public VarlistContext varlist() {
			return getRuleContext(VarlistContext.class,0);
		}
		public VarlistpContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public VarlistpContext(ParserRuleContext parent, int invokingState, String cl) {
			super(parent, invokingState);
			this.cl = cl;
		}
		@Override public int getRuleIndex() { return RULE_varlistp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grupalListener ) ((grupalListener)listener).enterVarlistp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grupalListener ) ((grupalListener)listener).exitVarlistp(this);
		}
	}

	public final VarlistpContext varlistp(String cl) throws RecognitionException {
		VarlistpContext _localctx = new VarlistpContext(_ctx, getState(), cl);
		enterRule(_localctx, 32, RULE_varlistp);
		try {
			setState(266);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(261);
				match(T__4);
				setState(262);
				((VarlistpContext)_localctx).varlist = varlist(_localctx.cl);
				((VarlistpContext)_localctx).s =  ", " + ((VarlistpContext)_localctx).varlist.s;
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				((VarlistpContext)_localctx).s = "";
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitContext extends ParserRuleContext {
		public String s;
		public SimpvalueContext simpvalue;
		public SimpvalueContext simpvalue() {
			return getRuleContext(SimpvalueContext.class,0);
		}
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grupalListener ) ((grupalListener)listener).enterInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grupalListener ) ((grupalListener)listener).exitInit(this);
		}
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_init);
		try {
			setState(273);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(268);
				match(T__7);
				setState(269);
				((InitContext)_localctx).simpvalue = simpvalue();
				((InitContext)_localctx).s =  " = " + ((InitContext)_localctx).simpvalue.s;
				}
				break;
			case T__1:
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				((InitContext)_localctx).s =  "";
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DecprocContext extends ParserRuleContext {
		public Token id1;
		public Token id2;
		public Formal_paramlistContext formal_paramlist() {
			return getRuleContext(Formal_paramlistContext.class,0);
		}
		public Dec_s_paramlistContext dec_s_paramlist() {
			return getRuleContext(Dec_s_paramlistContext.class,0);
		}
		public List<TerminalNode> IDENT() { return getTokens(grupalParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(grupalParser.IDENT, i);
		}
		public DecprocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decproc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grupalListener ) ((grupalListener)listener).enterDecproc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grupalListener ) ((grupalListener)listener).exitDecproc(this);
		}
	}

	public final DecprocContext decproc() throws RecognitionException {
		DecprocContext _localctx = new DecprocContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_decproc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(T__13);
			setState(276);
			((DecprocContext)_localctx).id1 = match(IDENT);
			setState(277);
			formal_paramlist((((DecprocContext)_localctx).id1!=null?((DecprocContext)_localctx).id1.getText():null),true);
			setState(278);
			dec_s_paramlist((((DecprocContext)_localctx).id1!=null?((DecprocContext)_localctx).id1.getText():null));
			setState(279);
			match(T__2);
			setState(280);
			match(T__13);
			setState(281);
			((DecprocContext)_localctx).id2 = match(IDENT);
			cab.addSub((((DecprocContext)_localctx).id1!=null?((DecprocContext)_localctx).id1.getText():null),(((DecprocContext)_localctx).id2!=null?((DecprocContext)_localctx).id2.getText():null)); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Formal_paramlistContext extends ParserRuleContext {
		public String id;
		public boolean declaration;
		public int esVoid;
		public NomparamlistContext nomparamlist() {
			return getRuleContext(NomparamlistContext.class,0);
		}
		public Formal_paramlistContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Formal_paramlistContext(ParserRuleContext parent, int invokingState, String id, boolean declaration) {
			super(parent, invokingState);
			this.id = id;
			this.declaration = declaration;
		}
		@Override public int getRuleIndex() { return RULE_formal_paramlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grupalListener ) ((grupalListener)listener).enterFormal_paramlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grupalListener ) ((grupalListener)listener).exitFormal_paramlist(this);
		}
	}

	public final Formal_paramlistContext formal_paramlist(String id,boolean declaration) throws RecognitionException {
		Formal_paramlistContext _localctx = new Formal_paramlistContext(_ctx, getState(), id, declaration);
		enterRule(_localctx, 38, RULE_formal_paramlist);
		try {
			setState(290);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(284);
				match(T__11);
				setState(285);
				nomparamlist(_localctx.id,_localctx.declaration);
				setState(286);
				match(T__12);
				  ((Formal_paramlistContext)_localctx).esVoid = 0; 
				}
				break;
			case T__2:
			case T__8:
			case T__9:
			case T__10:
			case T__19:
			case T__20:
			case T__21:
			case T__32:
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				((Formal_paramlistContext)_localctx).esVoid = 1;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NomparamlistContext extends ParserRuleContext {
		public String id;
		public boolean declaration;
		public Token IDENT;
		public TerminalNode IDENT() { return getToken(grupalParser.IDENT, 0); }
		public NomparamlistpContext nomparamlistp() {
			return getRuleContext(NomparamlistpContext.class,0);
		}
		public NomparamlistContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public NomparamlistContext(ParserRuleContext parent, int invokingState, String id, boolean declaration) {
			super(parent, invokingState);
			this.id = id;
			this.declaration = declaration;
		}
		@Override public int getRuleIndex() { return RULE_nomparamlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grupalListener ) ((grupalListener)listener).enterNomparamlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grupalListener ) ((grupalListener)listener).exitNomparamlist(this);
		}
	}

	public final NomparamlistContext nomparamlist(String id,boolean declaration) throws RecognitionException {
		NomparamlistContext _localctx = new NomparamlistContext(_ctx, getState(), id, declaration);
		enterRule(_localctx, 40, RULE_nomparamlist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			((NomparamlistContext)_localctx).IDENT = match(IDENT);
			setState(293);
			nomparamlistp(_localctx.id,_localctx.declaration);

			    if(_localctx.declaration){   //Se trata de una declaracion de cabecera en la interfaz
			        cab.addArgSubFun(_localctx.id,(((NomparamlistContext)_localctx).IDENT!=null?((NomparamlistContext)_localctx).IDENT.getText():null));
			    }
			    else{   //Implementacion--> PARTE DE IVAN

			    }

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NomparamlistpContext extends ParserRuleContext {
		public String id;
		public boolean declaration;
		public NomparamlistContext nomparamlist() {
			return getRuleContext(NomparamlistContext.class,0);
		}
		public NomparamlistpContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public NomparamlistpContext(ParserRuleContext parent, int invokingState, String id, boolean declaration) {
			super(parent, invokingState);
			this.id = id;
			this.declaration = declaration;
		}
		@Override public int getRuleIndex() { return RULE_nomparamlistp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grupalListener ) ((grupalListener)listener).enterNomparamlistp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grupalListener ) ((grupalListener)listener).exitNomparamlistp(this);
		}
	}

	public final NomparamlistpContext nomparamlistp(String id,boolean declaration) throws RecognitionException {
		NomparamlistpContext _localctx = new NomparamlistpContext(_ctx, getState(), id, declaration);
		enterRule(_localctx, 42, RULE_nomparamlistp);
		try {
			setState(299);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(296);
				match(T__4);
				setState(297);
				nomparamlist(_localctx.id,_localctx.declaration);
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dec_s_paramlistContext extends ParserRuleContext {
		public String id;
		public String re;
		public TipoContext tipo;
		public TipoparamContext tipoparam;
		public Token IDENT;
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TipoparamContext tipoparam() {
			return getRuleContext(TipoparamContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(grupalParser.IDENT, 0); }
		public Dec_s_paramlistContext dec_s_paramlist() {
			return getRuleContext(Dec_s_paramlistContext.class,0);
		}
		public Dec_s_paramlistContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Dec_s_paramlistContext(ParserRuleContext parent, int invokingState, String id) {
			super(parent, invokingState);
			this.id = id;
		}
		@Override public int getRuleIndex() { return RULE_dec_s_paramlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grupalListener ) ((grupalListener)listener).enterDec_s_paramlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grupalListener ) ((grupalListener)listener).exitDec_s_paramlist(this);
		}
	}

	public final Dec_s_paramlistContext dec_s_paramlist(String id) throws RecognitionException {
		Dec_s_paramlistContext _localctx = new Dec_s_paramlistContext(_ctx, getState(), id);
		enterRule(_localctx, 44, RULE_dec_s_paramlist);
		try {
			setState(314);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(301);
				((Dec_s_paramlistContext)_localctx).tipo = tipo();
				setState(302);
				match(T__4);
				setState(303);
				match(T__14);
				setState(304);
				match(T__11);
				setState(305);
				((Dec_s_paramlistContext)_localctx).tipoparam = tipoparam();
				setState(306);
				match(T__12);
				setState(307);
				((Dec_s_paramlistContext)_localctx).IDENT = match(IDENT);
				setState(308);
				match(T__1);
				cab.addArgValuesSub(_localctx.id,((Dec_s_paramlistContext)_localctx).tipo.t, ((Dec_s_paramlistContext)_localctx).tipoparam.c,(((Dec_s_paramlistContext)_localctx).IDENT!=null?((Dec_s_paramlistContext)_localctx).IDENT.getText():null));
				setState(310);
				dec_s_paramlist(_localctx.id);
				((Dec_s_paramlistContext)_localctx).re = "";
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				((Dec_s_paramlistContext)_localctx).re = "";
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TipoparamContext extends ParserRuleContext {
		public String c;
		public TipoparamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipoparam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grupalListener ) ((grupalListener)listener).enterTipoparam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grupalListener ) ((grupalListener)listener).exitTipoparam(this);
		}
	}

	public final TipoparamContext tipoparam() throws RecognitionException {
		TipoparamContext _localctx = new TipoparamContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_tipoparam);
		try {
			setState(322);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				setState(316);
				match(T__15);
				((TipoparamContext)_localctx).c = "";
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
				setState(318);
				match(T__16);
				((TipoparamContext)_localctx).c = "*";
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 3);
				{
				setState(320);
				match(T__17);
				((TipoparamContext)_localctx).c = "*";
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DecfunContext extends ParserRuleContext {
		public Token id1;
		public TipoContext tipo;
		public Token id2;
		public Token id3;
		public NomparamlistContext nomparamlist() {
			return getRuleContext(NomparamlistContext.class,0);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public Dec_f_paramlistContext dec_f_paramlist() {
			return getRuleContext(Dec_f_paramlistContext.class,0);
		}
		public List<TerminalNode> IDENT() { return getTokens(grupalParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(grupalParser.IDENT, i);
		}
		public DecfunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decfun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grupalListener ) ((grupalListener)listener).enterDecfun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grupalListener ) ((grupalListener)listener).exitDecfun(this);
		}
	}

	public final DecfunContext decfun() throws RecognitionException {
		DecfunContext _localctx = new DecfunContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_decfun);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			match(T__18);
			setState(325);
			((DecfunContext)_localctx).id1 = match(IDENT);
			cab.addFun((((DecfunContext)_localctx).id1!=null?((DecfunContext)_localctx).id1.getText():null));
			setState(327);
			match(T__11);
			setState(328);
			nomparamlist((((DecfunContext)_localctx).id1!=null?((DecfunContext)_localctx).id1.getText():null),true);
			setState(329);
			match(T__12);
			setState(330);
			((DecfunContext)_localctx).tipo = tipo();
			setState(331);
			match(T__6);
			setState(332);
			((DecfunContext)_localctx).id2 = match(IDENT);
			setState(333);
			match(T__1);
			setState(334);
			dec_f_paramlist((((DecfunContext)_localctx).id1!=null?((DecfunContext)_localctx).id1.getText():null));
			setState(335);
			match(T__2);
			setState(336);
			match(T__18);
			setState(337);
			((DecfunContext)_localctx).id3 = match(IDENT);
			cab.addTipoFun((((DecfunContext)_localctx).id1!=null?((DecfunContext)_localctx).id1.getText():null),((DecfunContext)_localctx).tipo.t,(((DecfunContext)_localctx).id2!=null?((DecfunContext)_localctx).id2.getText():null));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dec_f_paramlistContext extends ParserRuleContext {
		public String id;
		public String re;
		public TipoContext tipo;
		public Token IDENT;
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(grupalParser.IDENT, 0); }
		public Dec_f_paramlistContext dec_f_paramlist() {
			return getRuleContext(Dec_f_paramlistContext.class,0);
		}
		public Dec_f_paramlistContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Dec_f_paramlistContext(ParserRuleContext parent, int invokingState, String id) {
			super(parent, invokingState);
			this.id = id;
		}
		@Override public int getRuleIndex() { return RULE_dec_f_paramlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grupalListener ) ((grupalListener)listener).enterDec_f_paramlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grupalListener ) ((grupalListener)listener).exitDec_f_paramlist(this);
		}
	}

	public final Dec_f_paramlistContext dec_f_paramlist(String id) throws RecognitionException {
		Dec_f_paramlistContext _localctx = new Dec_f_paramlistContext(_ctx, getState(), id);
		enterRule(_localctx, 50, RULE_dec_f_paramlist);
		try {
			setState(353);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(340);
				((Dec_f_paramlistContext)_localctx).tipo = tipo();
				setState(341);
				match(T__4);
				setState(342);
				match(T__14);
				setState(343);
				match(T__11);
				setState(344);
				match(T__15);
				setState(345);
				match(T__12);
				setState(346);
				((Dec_f_paramlistContext)_localctx).IDENT = match(IDENT);
				setState(347);
				match(T__1);
				cab.addArgValuesFun(_localctx.id,((Dec_f_paramlistContext)_localctx).tipo.t,(((Dec_f_paramlistContext)_localctx).IDENT!=null?((Dec_f_paramlistContext)_localctx).IDENT.getText():null));
				setState(349);
				dec_f_paramlist(_localctx.id);
				((Dec_f_paramlistContext)_localctx).re = "";
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				((Dec_f_paramlistContext)_localctx).re = "";
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SentContext extends ParserRuleContext {
		public String re;
		public Token IDENT;
		public ExpContext exp;
		public Proc_callContext proc_call;
		public ExpcondContext expcond;
		public SentppContext sentpp;
		public SentpppContext sentppp;
		public CasosContext casos;
		public TerminalNode IDENT() { return getToken(grupalParser.IDENT, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Proc_callContext proc_call() {
			return getRuleContext(Proc_callContext.class,0);
		}
		public ExpcondContext expcond() {
			return getRuleContext(ExpcondContext.class,0);
		}
		public SentppContext sentpp() {
			return getRuleContext(SentppContext.class,0);
		}
		public SentpppContext sentppp() {
			return getRuleContext(SentpppContext.class,0);
		}
		public CasosContext casos() {
			return getRuleContext(CasosContext.class,0);
		}
		public SentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grupalListener ) ((grupalListener)listener).enterSent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grupalListener ) ((grupalListener)listener).exitSent(this);
		}
	}

	public final SentContext sent() throws RecognitionException {
		SentContext _localctx = new SentContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_sent);
		try {
			setState(386);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(355);
				((SentContext)_localctx).IDENT = match(IDENT);
				setState(356);
				match(T__7);
				setState(357);
				((SentContext)_localctx).exp = exp();
				setState(358);
				match(T__1);
				((SentContext)_localctx).re =   (((SentContext)_localctx).IDENT!=null?((SentContext)_localctx).IDENT.getText():null) + " = " + ((SentContext)_localctx).exp.re + ";\n";
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 2);
				{
				setState(361);
				((SentContext)_localctx).proc_call = proc_call();
				setState(362);
				match(T__1);
				((SentContext)_localctx).re =   ((SentContext)_localctx).proc_call.s +";\n";
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 3);
				{
				setState(365);
				match(T__19);
				setState(366);
				match(T__11);
				setState(367);
				((SentContext)_localctx).expcond = expcond();
				setState(368);
				match(T__12);
				setState(369);
				((SentContext)_localctx).sentpp = sentpp();
				((SentContext)_localctx).re =  "if (" + ((SentContext)_localctx).expcond.s + ")" + (((SentContext)_localctx).sentpp.re);
				                //insertTxtC(_localctx.re);
				                
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 4);
				{
				setState(372);
				match(T__20);
				setState(373);
				((SentContext)_localctx).sentppp = sentppp();
				((SentContext)_localctx).re =  ((SentContext)_localctx).sentppp.re; // "do {" +
				                //insertTxtC(_localctx.re);
				                
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 5);
				{
				setState(376);
				match(T__21);
				setState(377);
				match(T__22);
				setState(378);
				match(T__11);
				setState(379);
				((SentContext)_localctx).exp = exp();
				setState(380);
				match(T__12);
				setState(381);
				((SentContext)_localctx).casos = casos();
				setState(382);
				match(T__2);
				setState(383);
				match(T__21);
				((SentContext)_localctx).re = "switch (" + ((SentContext)_localctx).exp.re + "){\n" + ((SentContext)_localctx).casos.re + "\n}\n" ;
				                //insertTxtC(_localctx.re);
				                
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SentpContext extends ParserRuleContext {
		public String re;
		public SentlistContext sentlist;
		public SentlistContext sentlist() {
			return getRuleContext(SentlistContext.class,0);
		}
		public SentpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grupalListener ) ((grupalListener)listener).enterSentp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grupalListener ) ((grupalListener)listener).exitSentp(this);
		}
	}

	public final SentpContext sentp() throws RecognitionException {
		SentpContext _localctx = new SentpContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_sentp);
		try {
			setState(395);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__23:
				enterOuterAlt(_localctx, 1);
				{
				setState(388);
				match(T__23);
				((SentpContext)_localctx).re =  "\n}\n";
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 2);
				{
				setState(390);
				match(T__24);
				setState(391);
				((SentpContext)_localctx).sentlist = sentlist();
				setState(392);
				match(T__23);
				((SentpContext)_localctx).re =  "}\nelse {\n" + ((SentpContext)_localctx).sentlist.re +"\n" +"}\n";
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SentppContext extends ParserRuleContext {
		public String re;
		public SentlistContext sentlist;
		public SentpContext sentp;
		public SentContext sent;
		public SentlistContext sentlist() {
			return getRuleContext(SentlistContext.class,0);
		}
		public SentpContext sentp() {
			return getRuleContext(SentpContext.class,0);
		}
		public SentContext sent() {
			return getRuleContext(SentContext.class,0);
		}
		public SentppContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentpp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grupalListener ) ((grupalListener)listener).enterSentpp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grupalListener ) ((grupalListener)listener).exitSentpp(this);
		}
	}

	public final SentppContext sentpp() throws RecognitionException {
		SentppContext _localctx = new SentppContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_sentpp);
		try {
			setState(405);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__25:
				enterOuterAlt(_localctx, 1);
				{
				setState(397);
				match(T__25);
				setState(398);
				((SentppContext)_localctx).sentlist = sentlist();
				setState(399);
				((SentppContext)_localctx).sentp = sentp();
				((SentppContext)_localctx).re =  "{" +"\n" + ((SentppContext)_localctx).sentlist.re + ((SentppContext)_localctx).sentp.re;
				}
				break;
			case T__19:
			case T__20:
			case T__21:
			case T__32:
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(402);
				((SentppContext)_localctx).sent = sent();
				((SentppContext)_localctx).re =  "{" + "\n"+((SentppContext)_localctx).sent.re+"\n}\n";
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SentpppContext extends ParserRuleContext {
		public String re;
		public ExpcondContext expcond;
		public SentlistContext sentlist;
		public Token IDENT;
		public DovalContext val1;
		public DovalContext val2;
		public DovalContext val3;
		public ExpcondContext expcond() {
			return getRuleContext(ExpcondContext.class,0);
		}
		public SentlistContext sentlist() {
			return getRuleContext(SentlistContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(grupalParser.IDENT, 0); }
		public List<DovalContext> doval() {
			return getRuleContexts(DovalContext.class);
		}
		public DovalContext doval(int i) {
			return getRuleContext(DovalContext.class,i);
		}
		public SentpppContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentppp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grupalListener ) ((grupalListener)listener).enterSentppp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grupalListener ) ((grupalListener)listener).exitSentppp(this);
		}
	}

	public final SentpppContext sentppp() throws RecognitionException {
		SentpppContext _localctx = new SentpppContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_sentppp);
		try {
			setState(426);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__26:
				enterOuterAlt(_localctx, 1);
				{
				setState(407);
				match(T__26);
				setState(408);
				match(T__11);
				setState(409);
				((SentpppContext)_localctx).expcond = expcond();
				setState(410);
				match(T__12);
				setState(411);
				((SentpppContext)_localctx).sentlist = sentlist();
				setState(412);
				match(T__27);
				((SentpppContext)_localctx).re =  "\n" +"while (" + ((SentpppContext)_localctx).expcond.s + "){" +"\n"  +(((SentpppContext)_localctx).sentlist.re) +  "}\n";
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(415);
				((SentpppContext)_localctx).IDENT = match(IDENT);
				setState(416);
				match(T__7);
				setState(417);
				((SentpppContext)_localctx).val1 = doval();
				setState(418);
				match(T__4);
				setState(419);
				((SentpppContext)_localctx).val2 = doval();
				setState(420);
				match(T__4);
				setState(421);
				((SentpppContext)_localctx).val3 = doval();
				setState(422);
				((SentpppContext)_localctx).sentlist = sentlist();
				setState(423);
				match(T__27);
				((SentpppContext)_localctx).re =  "for("+(((SentpppContext)_localctx).IDENT!=null?((SentpppContext)_localctx).IDENT.getText():null) +"="+ ((SentpppContext)_localctx).val1.doVal+"; "+(((SentpppContext)_localctx).IDENT!=null?((SentpppContext)_localctx).IDENT.getText():null)+"!="+ ((SentpppContext)_localctx).val2.doVal+"; "+(((SentpppContext)_localctx).IDENT!=null?((SentpppContext)_localctx).IDENT.getText():null)+ "=" +(((SentpppContext)_localctx).IDENT!=null?((SentpppContext)_localctx).IDENT.getText():null)+"-"+((SentpppContext)_localctx).val3.doVal+"){" + "\n"+ ((SentpppContext)_localctx).sentlist.re +"\n"+"}\n";
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpContext extends ParserRuleContext {
		public String re;
		public FactorContext factor;
		public ExppContext expp;
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public ExppContext expp() {
			return getRuleContext(ExppContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grupalListener ) ((grupalListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grupalListener ) ((grupalListener)listener).exitExp(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
			((ExpContext)_localctx).factor = factor();
			setState(429);
			((ExpContext)_localctx).expp = expp();
			((ExpContext)_localctx).re = ((ExpContext)_localctx).factor.re+((ExpContext)_localctx).expp.re;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExppContext extends ParserRuleContext {
		public String re;
		public OpContext op;
		public ExpContext exp;
		public ExppContext expp;
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ExppContext expp() {
			return getRuleContext(ExppContext.class,0);
		}
		public ExppContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grupalListener ) ((grupalListener)listener).enterExpp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grupalListener ) ((grupalListener)listener).exitExpp(this);
		}
	}

	public final ExppContext expp() throws RecognitionException {
		ExppContext _localctx = new ExppContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_expp);
		try {
			setState(438);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(432);
				((ExppContext)_localctx).op = op();
				setState(433);
				((ExppContext)_localctx).exp = exp();
				setState(434);
				((ExppContext)_localctx).expp = expp();
				((ExppContext)_localctx).re = " "+((ExppContext)_localctx).op.c+" "+((ExppContext)_localctx).exp.re+ ((ExppContext)_localctx).expp.re;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				((ExppContext)_localctx).re = "";
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OpContext extends ParserRuleContext {
		public char c;
		public OparitContext oparit;
		public OparitContext oparit() {
			return getRuleContext(OparitContext.class,0);
		}
		public OpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grupalListener ) ((grupalListener)listener).enterOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grupalListener ) ((grupalListener)listener).exitOp(this);
		}
	}

	public final OpContext op() throws RecognitionException {
		OpContext _localctx = new OpContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_op);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			((OpContext)_localctx).oparit = oparit();
			((OpContext)_localctx).c =  ((OpContext)_localctx).oparit.c;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OparitContext extends ParserRuleContext {
		public char c;
		public OparitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oparit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grupalListener ) ((grupalListener)listener).enterOparit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grupalListener ) ((grupalListener)listener).exitOparit(this);
		}
	}

	public final OparitContext oparit() throws RecognitionException {
		OparitContext _localctx = new OparitContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_oparit);
		try {
			setState(451);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__28:
				enterOuterAlt(_localctx, 1);
				{
				setState(443);
				match(T__28);
				((OparitContext)_localctx).c = '+';
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 2);
				{
				setState(445);
				match(T__29);
				((OparitContext)_localctx).c = '-';
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 3);
				{
				setState(447);
				match(T__30);
				((OparitContext)_localctx).c = '*';
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 4);
				{
				setState(449);
				match(T__31);
				((OparitContext)_localctx).c = '/';
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FactorContext extends ParserRuleContext {
		public String re;
		public Token IDENT;
		public FactorpContext factorp;
		public SimpvalueContext simpvalue;
		public ExpContext exp;
		public TerminalNode IDENT() { return getToken(grupalParser.IDENT, 0); }
		public FactorpContext factorp() {
			return getRuleContext(FactorpContext.class,0);
		}
		public SimpvalueContext simpvalue() {
			return getRuleContext(SimpvalueContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grupalListener ) ((grupalListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grupalListener ) ((grupalListener)listener).exitFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_factor);
		try {
			setState(465);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(453);
				((FactorContext)_localctx).IDENT = match(IDENT);
				setState(454);
				((FactorContext)_localctx).factorp = factorp();
				((FactorContext)_localctx).re = (((FactorContext)_localctx).IDENT!=null?((FactorContext)_localctx).IDENT.getText():null)+((FactorContext)_localctx).factorp.re;
				}
				break;
			case NUM_INT_CONST:
			case NUM_REAL_CONST:
			case NUM_INT_CONST_B:
			case NUM_INT_CONST_O:
			case NUM_INT_CONST_H:
			case STRING_CONST:
				enterOuterAlt(_localctx, 2);
				{
				setState(457);
				((FactorContext)_localctx).simpvalue = simpvalue();
				((FactorContext)_localctx).re = ((FactorContext)_localctx).simpvalue.s;
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 3);
				{
				setState(460);
				match(T__11);
				setState(461);
				((FactorContext)_localctx).exp = exp();
				setState(462);
				match(T__12);
				((FactorContext)_localctx).re = "("+((FactorContext)_localctx).exp.re+")";
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FactorpContext extends ParserRuleContext {
		public String re;
		public ExpContext exp;
		public ExplistContext explist;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
		}
		public FactorpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factorp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grupalListener ) ((grupalListener)listener).enterFactorp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grupalListener ) ((grupalListener)listener).exitFactorp(this);
		}
	}

	public final FactorpContext factorp() throws RecognitionException {
		FactorpContext _localctx = new FactorpContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_factorp);
		try {
			setState(474);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(467);
				match(T__11);
				setState(468);
				((FactorpContext)_localctx).exp = exp();
				setState(469);
				((FactorpContext)_localctx).explist = explist();
				setState(470);
				match(T__12);
				((FactorpContext)_localctx).re = "("+((FactorpContext)_localctx).exp.re+((FactorpContext)_localctx).explist.re+")";
				}
				break;
			case T__1:
			case T__4:
			case T__12:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__40:
			case T__41:
			case T__42:
			case T__43:
			case T__44:
			case T__45:
				enterOuterAlt(_localctx, 2);
				{
				((FactorpContext)_localctx).re = "";
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExplistContext extends ParserRuleContext {
		public String re;
		public ExpContext exp;
		public ExplistContext explist;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
		}
		public ExplistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grupalListener ) ((grupalListener)listener).enterExplist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grupalListener ) ((grupalListener)listener).exitExplist(this);
		}
	}

	public final ExplistContext explist() throws RecognitionException {
		ExplistContext _localctx = new ExplistContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_explist);
		try {
			setState(482);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(476);
				match(T__4);
				setState(477);
				((ExplistContext)_localctx).exp = exp();
				setState(478);
				((ExplistContext)_localctx).explist = explist();
				((ExplistContext)_localctx).re = ','+ ((ExplistContext)_localctx).exp.re +((ExplistContext)_localctx).explist.re;
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				((ExplistContext)_localctx).re = "";
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Proc_callContext extends ParserRuleContext {
		public String s;
		public Token IDENT;
		public SubpparamlistContext subpparamlist;
		public TerminalNode IDENT() { return getToken(grupalParser.IDENT, 0); }
		public SubpparamlistContext subpparamlist() {
			return getRuleContext(SubpparamlistContext.class,0);
		}
		public Proc_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proc_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grupalListener ) ((grupalListener)listener).enterProc_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grupalListener ) ((grupalListener)listener).exitProc_call(this);
		}
	}

	public final Proc_callContext proc_call() throws RecognitionException {
		Proc_callContext _localctx = new Proc_callContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_proc_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(484);
			match(T__32);
			setState(485);
			((Proc_callContext)_localctx).IDENT = match(IDENT);
			setState(486);
			((Proc_callContext)_localctx).subpparamlist = subpparamlist();
			((Proc_callContext)_localctx).s =  (((Proc_callContext)_localctx).IDENT!=null?((Proc_callContext)_localctx).IDENT.getText():null) + ((Proc_callContext)_localctx).subpparamlist.s ;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubpparamlistContext extends ParserRuleContext {
		public String s;
		public ExpContext exp;
		public ExplistContext explist;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
		}
		public SubpparamlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subpparamlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grupalListener ) ((grupalListener)listener).enterSubpparamlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grupalListener ) ((grupalListener)listener).exitSubpparamlist(this);
		}
	}

	public final SubpparamlistContext subpparamlist() throws RecognitionException {
		SubpparamlistContext _localctx = new SubpparamlistContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_subpparamlist);
		try {
			setState(496);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(489);
				match(T__11);
				setState(490);
				((SubpparamlistContext)_localctx).exp = exp();
				setState(491);
				((SubpparamlistContext)_localctx).explist = explist();
				setState(492);
				match(T__12);
				((SubpparamlistContext)_localctx).s =  "(" + ((SubpparamlistContext)_localctx).exp.re + ((SubpparamlistContext)_localctx).explist.re +")";
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				((SubpparamlistContext)_localctx).s = "()";
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubproglistContext extends ParserRuleContext {
		public String re;
		public CodprocContext codproc;
		public SubproglistContext subproglist;
		public CodfunContext codfun;
		public CodprocContext codproc() {
			return getRuleContext(CodprocContext.class,0);
		}
		public SubproglistContext subproglist() {
			return getRuleContext(SubproglistContext.class,0);
		}
		public CodfunContext codfun() {
			return getRuleContext(CodfunContext.class,0);
		}
		public SubproglistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subproglist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grupalListener ) ((grupalListener)listener).enterSubproglist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grupalListener ) ((grupalListener)listener).exitSubproglist(this);
		}
	}

	public final SubproglistContext subproglist() throws RecognitionException {
		SubproglistContext _localctx = new SubproglistContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_subproglist);
		try {
			setState(507);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(498);
				((SubproglistContext)_localctx).codproc = codproc();
				setState(499);
				((SubproglistContext)_localctx).subproglist = subproglist();
				((SubproglistContext)_localctx).re =  ((SubproglistContext)_localctx).codproc.s + ((SubproglistContext)_localctx).subproglist.re;
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 2);
				{
				setState(502);
				((SubproglistContext)_localctx).codfun = codfun();
				setState(503);
				((SubproglistContext)_localctx).subproglist = subproglist();
				((SubproglistContext)_localctx).re =  ((SubproglistContext)_localctx).codfun.s + ((SubproglistContext)_localctx).subproglist.re;
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 3);
				{
				((SubproglistContext)_localctx).re = "";
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CodprocContext extends ParserRuleContext {
		public String s;
		public Token id1;
		public Formal_paramlistContext formal_paramlist;
		public Dec_s_paramlistContext dec_s_paramlist;
		public DcllistContext dcllist;
		public SentContext sent;
		public SentlistContext sentlist;
		public Token id2;
		public Formal_paramlistContext formal_paramlist() {
			return getRuleContext(Formal_paramlistContext.class,0);
		}
		public Dec_s_paramlistContext dec_s_paramlist() {
			return getRuleContext(Dec_s_paramlistContext.class,0);
		}
		public DcllistContext dcllist() {
			return getRuleContext(DcllistContext.class,0);
		}
		public SentContext sent() {
			return getRuleContext(SentContext.class,0);
		}
		public SentlistContext sentlist() {
			return getRuleContext(SentlistContext.class,0);
		}
		public List<TerminalNode> IDENT() { return getTokens(grupalParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(grupalParser.IDENT, i);
		}
		public CodprocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codproc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grupalListener ) ((grupalListener)listener).enterCodproc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grupalListener ) ((grupalListener)listener).exitCodproc(this);
		}
	}

	public final CodprocContext codproc() throws RecognitionException {
		CodprocContext _localctx = new CodprocContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_codproc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(509);
			match(T__13);
			setState(510);
			((CodprocContext)_localctx).id1 = match(IDENT);
			setState(511);
			((CodprocContext)_localctx).formal_paramlist = formal_paramlist((((CodprocContext)_localctx).id1!=null?((CodprocContext)_localctx).id1.getText():null),false);
			setState(512);
			((CodprocContext)_localctx).dec_s_paramlist = dec_s_paramlist((((CodprocContext)_localctx).id1!=null?((CodprocContext)_localctx).id1.getText():null));
			setState(513);
			((CodprocContext)_localctx).dcllist = dcllist();
			setState(514);
			((CodprocContext)_localctx).sent = sent();
			setState(515);
			((CodprocContext)_localctx).sentlist = sentlist();
			setState(516);
			match(T__2);
			setState(517);
			match(T__13);
			setState(518);
			((CodprocContext)_localctx).id2 = match(IDENT);


			    creador.getSubrutina().comprobacion((((CodprocContext)_localctx).id1!=null?((CodprocContext)_localctx).id1.getText():null),(((CodprocContext)_localctx).id2!=null?((CodprocContext)_localctx).id2.getText():null));//Comprobacion:
			    creador.fusion(creador.getSubrutina().construirSubrutina(((CodprocContext)_localctx).formal_paramlist.esVoid,(((CodprocContext)_localctx).id1!=null?((CodprocContext)_localctx).id1.getText():null),((CodprocContext)_localctx).dec_s_paramlist.re ,((CodprocContext)_localctx).dcllist.s, ((CodprocContext)_localctx).sent.re, ((CodprocContext)_localctx).sentlist.re));


			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CodfunContext extends ParserRuleContext {
		public String s;
		public Token id1;
		public TipoContext tipo;
		public Token id2;
		public Dec_f_paramlistContext dec_f_paramlist;
		public DcllistContext dcllist;
		public SentContext sent;
		public SentlistContext sentlist;
		public Token id3;
		public ExpContext exp;
		public Token id4;
		public NomparamlistContext nomparamlist() {
			return getRuleContext(NomparamlistContext.class,0);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public Dec_f_paramlistContext dec_f_paramlist() {
			return getRuleContext(Dec_f_paramlistContext.class,0);
		}
		public DcllistContext dcllist() {
			return getRuleContext(DcllistContext.class,0);
		}
		public SentContext sent() {
			return getRuleContext(SentContext.class,0);
		}
		public SentlistContext sentlist() {
			return getRuleContext(SentlistContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public List<TerminalNode> IDENT() { return getTokens(grupalParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(grupalParser.IDENT, i);
		}
		public CodfunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codfun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grupalListener ) ((grupalListener)listener).enterCodfun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grupalListener ) ((grupalListener)listener).exitCodfun(this);
		}
	}

	public final CodfunContext codfun() throws RecognitionException {
		CodfunContext _localctx = new CodfunContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_codfun);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(521);
			match(T__18);
			setState(522);
			((CodfunContext)_localctx).id1 = match(IDENT);
			setState(523);
			match(T__11);
			setState(524);
			nomparamlist((((CodfunContext)_localctx).id1!=null?((CodfunContext)_localctx).id1.getText():null),false);
			setState(525);
			match(T__12);
			setState(526);
			((CodfunContext)_localctx).tipo = tipo();
			setState(527);
			match(T__6);
			setState(528);
			((CodfunContext)_localctx).id2 = match(IDENT);
			setState(529);
			match(T__1);
			setState(530);
			((CodfunContext)_localctx).dec_f_paramlist = dec_f_paramlist((((CodfunContext)_localctx).id1!=null?((CodfunContext)_localctx).id1.getText():null));
			setState(531);
			((CodfunContext)_localctx).dcllist = dcllist();
			setState(532);
			((CodfunContext)_localctx).sent = sent();
			setState(533);
			((CodfunContext)_localctx).sentlist = sentlist();
			setState(534);
			((CodfunContext)_localctx).id3 = match(IDENT);
			setState(535);
			match(T__7);
			setState(536);
			((CodfunContext)_localctx).exp = exp();
			setState(537);
			match(T__1);
			setState(538);
			match(T__2);
			setState(539);
			match(T__18);
			setState(540);
			((CodfunContext)_localctx).id4 = match(IDENT);


			    creador.getFunciones().comprobacion((((CodfunContext)_localctx).id1!=null?((CodfunContext)_localctx).id1.getText():null),(((CodfunContext)_localctx).id2!=null?((CodfunContext)_localctx).id2.getText():null),(((CodfunContext)_localctx).id3!=null?((CodfunContext)_localctx).id3.getText():null),(((CodfunContext)_localctx).id4!=null?((CodfunContext)_localctx).id4.getText():null));//Comprobacion:
			    creador.fusion(creador.getFunciones().construirFuncion( ((CodfunContext)_localctx).tipo.t, (((CodfunContext)_localctx).id1!=null?((CodfunContext)_localctx).id1.getText():null), ((CodfunContext)_localctx).dec_f_paramlist.re, ((CodfunContext)_localctx).dcllist.s, ((CodfunContext)_localctx).sent.re, ((CodfunContext)_localctx).sentlist.re,  ((CodfunContext)_localctx).exp.re));



			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpcondContext extends ParserRuleContext {
		public String s;
		public FactorcondContext factorcond;
		public ExpcondpContext expcondp;
		public FactorcondContext factorcond() {
			return getRuleContext(FactorcondContext.class,0);
		}
		public ExpcondpContext expcondp() {
			return getRuleContext(ExpcondpContext.class,0);
		}
		public ExpcondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expcond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grupalListener ) ((grupalListener)listener).enterExpcond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grupalListener ) ((grupalListener)listener).exitExpcond(this);
		}
	}

	public final ExpcondContext expcond() throws RecognitionException {
		ExpcondContext _localctx = new ExpcondContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_expcond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(543);
			((ExpcondContext)_localctx).factorcond = factorcond();
			setState(544);
			((ExpcondContext)_localctx).expcondp = expcondp();
			((ExpcondContext)_localctx).s =  ((ExpcondContext)_localctx).factorcond.s + ((ExpcondContext)_localctx).expcondp.s;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpcondpContext extends ParserRuleContext {
		public String s;
		public OplogContext oplog;
		public ExpcondContext expcond;
		public ExpcondpContext expcondp;
		public OplogContext oplog() {
			return getRuleContext(OplogContext.class,0);
		}
		public ExpcondContext expcond() {
			return getRuleContext(ExpcondContext.class,0);
		}
		public ExpcondpContext expcondp() {
			return getRuleContext(ExpcondpContext.class,0);
		}
		public ExpcondpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expcondp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grupalListener ) ((grupalListener)listener).enterExpcondp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grupalListener ) ((grupalListener)listener).exitExpcondp(this);
		}
	}

	public final ExpcondpContext expcondp() throws RecognitionException {
		ExpcondpContext _localctx = new ExpcondpContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_expcondp);
		try {
			setState(553);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(547);
				((ExpcondpContext)_localctx).oplog = oplog();
				setState(548);
				((ExpcondpContext)_localctx).expcond = expcond();
				setState(549);
				((ExpcondpContext)_localctx).expcondp = expcondp();
				((ExpcondpContext)_localctx).s =  ((ExpcondpContext)_localctx).oplog.s + ((ExpcondpContext)_localctx).expcond.s + ((ExpcondpContext)_localctx).expcondp.s;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				((ExpcondpContext)_localctx).s = "";
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OplogContext extends ParserRuleContext {
		public String s;
		public OplogContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oplog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grupalListener ) ((grupalListener)listener).enterOplog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grupalListener ) ((grupalListener)listener).exitOplog(this);
		}
	}

	public final OplogContext oplog() throws RecognitionException {
		OplogContext _localctx = new OplogContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_oplog);
		try {
			setState(563);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__33:
				enterOuterAlt(_localctx, 1);
				{
				setState(555);
				match(T__33);
				((OplogContext)_localctx).s = "||";
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 2);
				{
				setState(557);
				match(T__34);
				((OplogContext)_localctx).s = "&&";
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 3);
				{
				setState(559);
				match(T__35);
				((OplogContext)_localctx).s = "!^";
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 4);
				{
				setState(561);
				match(T__36);
				((OplogContext)_localctx).s = "^";
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FactorcondContext extends ParserRuleContext {
		public String s;
		public ExpcondContext expcond;
		public FactorcondContext factorcond;
		public ExpContext exp;
		public OpcompContext opcomp;
		public ExpcondContext expcond() {
			return getRuleContext(ExpcondContext.class,0);
		}
		public FactorcondContext factorcond() {
			return getRuleContext(FactorcondContext.class,0);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public OpcompContext opcomp() {
			return getRuleContext(OpcompContext.class,0);
		}
		public FactorcondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factorcond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grupalListener ) ((grupalListener)listener).enterFactorcond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grupalListener ) ((grupalListener)listener).exitFactorcond(this);
		}
	}

	public final FactorcondContext factorcond() throws RecognitionException {
		FactorcondContext _localctx = new FactorcondContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_factorcond);
		try {
			setState(584);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(565);
				match(T__11);
				setState(566);
				((FactorcondContext)_localctx).expcond = expcond();
				setState(567);
				match(T__12);
				((FactorcondContext)_localctx).s =  "("+((FactorcondContext)_localctx).expcond.s +")";
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(570);
				match(T__37);
				setState(571);
				((FactorcondContext)_localctx).factorcond = factorcond();
				((FactorcondContext)_localctx).s =  "!" + ((FactorcondContext)_localctx).factorcond.s;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(574);
				match(T__38);
				((FactorcondContext)_localctx).s = "1";
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(576);
				match(T__39);
				((FactorcondContext)_localctx).s = "0";
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(578);
				((FactorcondContext)_localctx).exp = exp();
				((FactorcondContext)_localctx).s =  ((FactorcondContext)_localctx).exp.re;
				setState(580);
				((FactorcondContext)_localctx).opcomp = opcomp();
				setState(581);
				((FactorcondContext)_localctx).exp = exp();
				_localctx.s +=((FactorcondContext)_localctx).opcomp.s + ((FactorcondContext)_localctx).exp.re;
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OpcompContext extends ParserRuleContext {
		public String s;
		public OpcompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opcomp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grupalListener ) ((grupalListener)listener).enterOpcomp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grupalListener ) ((grupalListener)listener).exitOpcomp(this);
		}
	}

	public final OpcompContext opcomp() throws RecognitionException {
		OpcompContext _localctx = new OpcompContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_opcomp);
		try {
			setState(598);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__40:
				enterOuterAlt(_localctx, 1);
				{
				setState(586);
				match(T__40);
				((OpcompContext)_localctx).s = "<";
				}
				break;
			case T__41:
				enterOuterAlt(_localctx, 2);
				{
				setState(588);
				match(T__41);
				((OpcompContext)_localctx).s = ">";
				}
				break;
			case T__42:
				enterOuterAlt(_localctx, 3);
				{
				setState(590);
				match(T__42);
				((OpcompContext)_localctx).s = "<=";
				}
				break;
			case T__43:
				enterOuterAlt(_localctx, 4);
				{
				setState(592);
				match(T__43);
				((OpcompContext)_localctx).s = ">=";
				}
				break;
			case T__44:
				enterOuterAlt(_localctx, 5);
				{
				setState(594);
				match(T__44);
				((OpcompContext)_localctx).s = "==";
				}
				break;
			case T__45:
				enterOuterAlt(_localctx, 6);
				{
				setState(596);
				match(T__45);
				((OpcompContext)_localctx).s = "!=";
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DovalContext extends ParserRuleContext {
		public String doVal;
		public Token NUM_INT_CONST;
		public Token IDENT;
		public TerminalNode NUM_INT_CONST() { return getToken(grupalParser.NUM_INT_CONST, 0); }
		public TerminalNode IDENT() { return getToken(grupalParser.IDENT, 0); }
		public DovalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grupalListener ) ((grupalListener)listener).enterDoval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grupalListener ) ((grupalListener)listener).exitDoval(this);
		}
	}

	public final DovalContext doval() throws RecognitionException {
		DovalContext _localctx = new DovalContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_doval);
		try {
			setState(604);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM_INT_CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(600);
				((DovalContext)_localctx).NUM_INT_CONST = match(NUM_INT_CONST);
				((DovalContext)_localctx).doVal = (((DovalContext)_localctx).NUM_INT_CONST!=null?((DovalContext)_localctx).NUM_INT_CONST.getText():null);
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(602);
				((DovalContext)_localctx).IDENT = match(IDENT);
				((DovalContext)_localctx).doVal = (((DovalContext)_localctx).IDENT!=null?((DovalContext)_localctx).IDENT.getText():null);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CasosContext extends ParserRuleContext {
		public String re = "";
		public CasospContext casosp;
		public CasospContext casosp() {
			return getRuleContext(CasospContext.class,0);
		}
		public CasosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_casos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grupalListener ) ((grupalListener)listener).enterCasos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grupalListener ) ((grupalListener)listener).exitCasos(this);
		}
	}

	public final CasosContext casos() throws RecognitionException {
		CasosContext _localctx = new CasosContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_casos);
		try {
			setState(611);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__22:
				enterOuterAlt(_localctx, 1);
				{
				setState(606);
				match(T__22);
				setState(607);
				((CasosContext)_localctx).casosp = casosp();

				                                            if((((CasosContext)_localctx).casosp.re).startsWith( "default")){
				                                               _localctx.re+=((CasosContext)_localctx).casosp.re;
				                                            }
				                                            else{
				                                            ((CasosContext)_localctx).re =  "case " + ((CasosContext)_localctx).casosp.re;}
				                                            
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				_localctx.re+="";
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CasospContext extends ParserRuleContext {
		public String re;
		public EtiquetasContext etiquetas;
		public SentlistContext sentlist;
		public CasosContext casos;
		public EtiquetasContext etiquetas() {
			return getRuleContext(EtiquetasContext.class,0);
		}
		public SentlistContext sentlist() {
			return getRuleContext(SentlistContext.class,0);
		}
		public CasosContext casos() {
			return getRuleContext(CasosContext.class,0);
		}
		public CasospContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_casosp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grupalListener ) ((grupalListener)listener).enterCasosp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grupalListener ) ((grupalListener)listener).exitCasosp(this);
		}
	}

	public final CasospContext casosp() throws RecognitionException {
		CasospContext _localctx = new CasospContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_casosp);
		try {
			setState(624);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(613);
				match(T__11);
				setState(614);
				((CasospContext)_localctx).etiquetas = etiquetas();
				setState(615);
				match(T__12);
				setState(616);
				((CasospContext)_localctx).sentlist = sentlist();
				setState(617);
				((CasospContext)_localctx).casos = casos();
				((CasospContext)_localctx).re = ((CasospContext)_localctx).etiquetas.re + ":\n" + ((CasospContext)_localctx).sentlist.re + "\n" + "break;" + "\n" + ((CasospContext)_localctx).casos.re;
				}
				break;
			case T__46:
				enterOuterAlt(_localctx, 2);
				{
				setState(620);
				match(T__46);
				setState(621);
				((CasospContext)_localctx).sentlist = sentlist();
				((CasospContext)_localctx).re =  "default:" + "\n" +  ((CasospContext)_localctx).sentlist.re;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EtiquetasContext extends ParserRuleContext {
		public String re;
		public SimpvalueContext simpvalue;
		public EtiquetasppContext etiquetaspp;
		public SimpvalueContext simpvalue() {
			return getRuleContext(SimpvalueContext.class,0);
		}
		public EtiquetasppContext etiquetaspp() {
			return getRuleContext(EtiquetasppContext.class,0);
		}
		public EtiquetasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_etiquetas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grupalListener ) ((grupalListener)listener).enterEtiquetas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grupalListener ) ((grupalListener)listener).exitEtiquetas(this);
		}
	}

	public final EtiquetasContext etiquetas() throws RecognitionException {
		EtiquetasContext _localctx = new EtiquetasContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_etiquetas);
		try {
			setState(634);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM_INT_CONST:
			case NUM_REAL_CONST:
			case NUM_INT_CONST_B:
			case NUM_INT_CONST_O:
			case NUM_INT_CONST_H:
			case STRING_CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(626);
				((EtiquetasContext)_localctx).simpvalue = simpvalue();
				setState(627);
				((EtiquetasContext)_localctx).etiquetaspp = etiquetaspp();
				((EtiquetasContext)_localctx).re = ((EtiquetasContext)_localctx).etiquetaspp.ant + ((EtiquetasContext)_localctx).simpvalue.s + ((EtiquetasContext)_localctx).etiquetaspp.re;
				}
				break;
			case T__47:
				enterOuterAlt(_localctx, 2);
				{
				setState(630);
				match(T__47);
				setState(631);
				((EtiquetasContext)_localctx).simpvalue = simpvalue();
				((EtiquetasContext)_localctx).re = "<" + ((EtiquetasContext)_localctx).simpvalue.s;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EtiquetaspContext extends ParserRuleContext {
		public String re;
		public String ant;
		public SimpvalueContext simpvalue;
		public SimpvalueContext simpvalue() {
			return getRuleContext(SimpvalueContext.class,0);
		}
		public EtiquetaspContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_etiquetasp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grupalListener ) ((grupalListener)listener).enterEtiquetasp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grupalListener ) ((grupalListener)listener).exitEtiquetasp(this);
		}
	}

	public final EtiquetaspContext etiquetasp() throws RecognitionException {
		EtiquetaspContext _localctx = new EtiquetaspContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_etiquetasp);
		try {
			setState(640);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM_INT_CONST:
			case NUM_REAL_CONST:
			case NUM_INT_CONST_B:
			case NUM_INT_CONST_O:
			case NUM_INT_CONST_H:
			case STRING_CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(636);
				((EtiquetaspContext)_localctx).simpvalue = simpvalue();
				((EtiquetaspContext)_localctx).re = " to " + ((EtiquetaspContext)_localctx).simpvalue.s; ((EtiquetaspContext)_localctx).ant = "";
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				((EtiquetaspContext)_localctx).re = ""; ((EtiquetaspContext)_localctx).ant = ">";
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EtiquetasppContext extends ParserRuleContext {
		public String re;
		public String ant;
		public EtiquetaspContext etiquetasp;
		public ListaetiquetasContext listaetiquetas;
		public EtiquetaspContext etiquetasp() {
			return getRuleContext(EtiquetaspContext.class,0);
		}
		public ListaetiquetasContext listaetiquetas() {
			return getRuleContext(ListaetiquetasContext.class,0);
		}
		public EtiquetasppContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_etiquetaspp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grupalListener ) ((grupalListener)listener).enterEtiquetaspp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grupalListener ) ((grupalListener)listener).exitEtiquetaspp(this);
		}
	}

	public final EtiquetasppContext etiquetaspp() throws RecognitionException {
		EtiquetasppContext _localctx = new EtiquetasppContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_etiquetaspp);
		try {
			setState(649);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__47:
				enterOuterAlt(_localctx, 1);
				{
				setState(642);
				match(T__47);
				setState(643);
				((EtiquetasppContext)_localctx).etiquetasp = etiquetasp();
				((EtiquetasppContext)_localctx).re = ((EtiquetasppContext)_localctx).etiquetasp.re; ((EtiquetasppContext)_localctx).ant = ((EtiquetasppContext)_localctx).etiquetasp.ant;
				}
				break;
			case T__4:
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(646);
				((EtiquetasppContext)_localctx).listaetiquetas = listaetiquetas();
				((EtiquetasppContext)_localctx).re = ((EtiquetasppContext)_localctx).listaetiquetas.re;((EtiquetasppContext)_localctx).ant = "";
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListaetiquetasContext extends ParserRuleContext {
		public String re;
		public SimpvalueContext simpvalue;
		public SimpvalueContext simpvalue() {
			return getRuleContext(SimpvalueContext.class,0);
		}
		public ListaetiquetasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaetiquetas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grupalListener ) ((grupalListener)listener).enterListaetiquetas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grupalListener ) ((grupalListener)listener).exitListaetiquetas(this);
		}
	}

	public final ListaetiquetasContext listaetiquetas() throws RecognitionException {
		ListaetiquetasContext _localctx = new ListaetiquetasContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_listaetiquetas);
		try {
			setState(656);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(651);
				match(T__4);
				setState(652);
				((ListaetiquetasContext)_localctx).simpvalue = simpvalue();
				((ListaetiquetasContext)_localctx).re = ":\n" + "case " + ((ListaetiquetasContext)_localctx).simpvalue.s;
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				((ListaetiquetasContext)_localctx).re = "";
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3=\u0295\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\5\4\u0084\n\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\5\5\u008d\n\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0095\n"+
		"\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00a0\n\7\3\b\3\b\3\b\3\b\3"+
		"\b\5\b\u00a7\n\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00bf\n\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00ce\n\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\5\f\u00d8\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\5\r\u00e6\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5"+
		"\16\u00f0\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00fa\n\17"+
		"\3\20\3\20\3\20\3\20\3\20\5\20\u0101\n\20\3\21\3\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\3\22\5\22\u010d\n\22\3\23\3\23\3\23\3\23\3\23\5\23\u0114"+
		"\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\5\25\u0125\n\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\5\27\u012e"+
		"\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\5\30\u013d\n\30\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0145\n\31\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5"+
		"\33\u0164\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0185\n\34\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\5\35\u018e\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36"+
		"\u0198\n\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u01ad\n\37\3 \3 \3 \3 \3!\3!"+
		"\3!\3!\3!\3!\5!\u01b9\n!\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\5#\u01c6"+
		"\n#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u01d4\n$\3%\3%\3%\3%\3%\3%"+
		"\3%\5%\u01dd\n%\3&\3&\3&\3&\3&\3&\5&\u01e5\n&\3\'\3\'\3\'\3\'\3\'\3(\3"+
		"(\3(\3(\3(\3(\3(\5(\u01f3\n(\3)\3)\3)\3)\3)\3)\3)\3)\3)\5)\u01fe\n)\3"+
		"*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3"+
		"+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\5-\u022c"+
		"\n-\3.\3.\3.\3.\3.\3.\3.\3.\5.\u0236\n.\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/"+
		"\3/\3/\3/\3/\3/\3/\3/\3/\3/\5/\u024b\n/\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\60\5\60\u0259\n\60\3\61\3\61\3\61\3\61\5\61"+
		"\u025f\n\61\3\62\3\62\3\62\3\62\3\62\5\62\u0266\n\62\3\63\3\63\3\63\3"+
		"\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u0273\n\63\3\64\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\3\64\5\64\u027d\n\64\3\65\3\65\3\65\3\65\5\65\u0283"+
		"\n\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\5\66\u028c\n\66\3\67\3\67\3\67"+
		"\3\67\3\67\5\67\u0293\n\67\3\67\2\28\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjl\2\2\2\u029f\2"+
		"n\3\2\2\2\4{\3\2\2\2\6\u0083\3\2\2\2\b\u008c\3\2\2\2\n\u0094\3\2\2\2\f"+
		"\u009f\3\2\2\2\16\u00a6\3\2\2\2\20\u00a8\3\2\2\2\22\u00be\3\2\2\2\24\u00cd"+
		"\3\2\2\2\26\u00d7\3\2\2\2\30\u00e5\3\2\2\2\32\u00ef\3\2\2\2\34\u00f9\3"+
		"\2\2\2\36\u0100\3\2\2\2 \u0102\3\2\2\2\"\u010c\3\2\2\2$\u0113\3\2\2\2"+
		"&\u0115\3\2\2\2(\u0124\3\2\2\2*\u0126\3\2\2\2,\u012d\3\2\2\2.\u013c\3"+
		"\2\2\2\60\u0144\3\2\2\2\62\u0146\3\2\2\2\64\u0163\3\2\2\2\66\u0184\3\2"+
		"\2\28\u018d\3\2\2\2:\u0197\3\2\2\2<\u01ac\3\2\2\2>\u01ae\3\2\2\2@\u01b8"+
		"\3\2\2\2B\u01ba\3\2\2\2D\u01c5\3\2\2\2F\u01d3\3\2\2\2H\u01dc\3\2\2\2J"+
		"\u01e4\3\2\2\2L\u01e6\3\2\2\2N\u01f2\3\2\2\2P\u01fd\3\2\2\2R\u01ff\3\2"+
		"\2\2T\u020b\3\2\2\2V\u0221\3\2\2\2X\u022b\3\2\2\2Z\u0235\3\2\2\2\\\u024a"+
		"\3\2\2\2^\u0258\3\2\2\2`\u025e\3\2\2\2b\u0265\3\2\2\2d\u0272\3\2\2\2f"+
		"\u027c\3\2\2\2h\u0282\3\2\2\2j\u028b\3\2\2\2l\u0292\3\2\2\2no\7\3\2\2"+
		"op\7\64\2\2pq\7\4\2\2qr\5\4\3\2rs\5\b\5\2st\5\66\34\2tu\5\16\b\2uv\7\5"+
		"\2\2vw\7\3\2\2wx\7\64\2\2xy\5P)\2yz\b\2\1\2z\3\3\2\2\2{|\5\6\4\2|}\b\3"+
		"\1\2}\5\3\2\2\2~\177\5\20\t\2\177\u0080\5\6\4\2\u0080\u0081\b\4\1\2\u0081"+
		"\u0084\3\2\2\2\u0082\u0084\b\4\1\2\u0083~\3\2\2\2\u0083\u0082\3\2\2\2"+
		"\u0084\7\3\2\2\2\u0085\u0086\7\6\2\2\u0086\u0087\5\n\6\2\u0087\u0088\7"+
		"\5\2\2\u0088\u0089\7\6\2\2\u0089\u008a\b\5\1\2\u008a\u008d\3\2\2\2\u008b"+
		"\u008d\b\5\1\2\u008c\u0085\3\2\2\2\u008c\u008b\3\2\2\2\u008d\t\3\2\2\2"+
		"\u008e\u008f\5&\24\2\u008f\u0090\5\f\7\2\u0090\u0095\3\2\2\2\u0091\u0092"+
		"\5\62\32\2\u0092\u0093\5\f\7\2\u0093\u0095\3\2\2\2\u0094\u008e\3\2\2\2"+
		"\u0094\u0091\3\2\2\2\u0095\13\3\2\2\2\u0096\u0097\5&\24\2\u0097\u0098"+
		"\5\f\7\2\u0098\u0099\b\7\1\2\u0099\u00a0\3\2\2\2\u009a\u009b\5\62\32\2"+
		"\u009b\u009c\5\f\7\2\u009c\u009d\b\7\1\2\u009d\u00a0\3\2\2\2\u009e\u00a0"+
		"\b\7\1\2\u009f\u0096\3\2\2\2\u009f\u009a\3\2\2\2\u009f\u009e\3\2\2\2\u00a0"+
		"\r\3\2\2\2\u00a1\u00a2\5\66\34\2\u00a2\u00a3\5\16\b\2\u00a3\u00a4\b\b"+
		"\1\2\u00a4\u00a7\3\2\2\2\u00a5\u00a7\b\b\1\2\u00a6\u00a1\3\2\2\2\u00a6"+
		"\u00a5\3\2\2\2\u00a7\17\3\2\2\2\u00a8\u00a9\5\34\17\2\u00a9\u00aa\5\22"+
		"\n\2\u00aa\u00ab\b\t\1\2\u00ab\21\3\2\2\2\u00ac\u00ad\7\7\2\2\u00ad\u00ae"+
		"\7\b\2\2\u00ae\u00af\7\t\2\2\u00af\u00b0\7\64\2\2\u00b0\u00b1\7\n\2\2"+
		"\u00b1\u00b2\5\30\r\2\u00b2\u00b3\5\26\f\2\u00b3\u00b4\7\4\2\2\u00b4\u00b5"+
		"\5\24\13\2\u00b5\u00b6\b\n\1\2\u00b6\u00bf\3\2\2\2\u00b7\u00b8\7\t\2\2"+
		"\u00b8\u00b9\5 \21\2\u00b9\u00ba\7\4\2\2\u00ba\u00bb\5\32\16\2\u00bb\u00bc"+
		"\b\n\1\2\u00bc\u00bf\3\2\2\2\u00bd\u00bf\b\n\1\2\u00be\u00ac\3\2\2\2\u00be"+
		"\u00b7\3\2\2\2\u00be\u00bd\3\2\2\2\u00bf\23\3\2\2\2\u00c0\u00c1\5\34\17"+
		"\2\u00c1\u00c2\7\7\2\2\u00c2\u00c3\7\b\2\2\u00c3\u00c4\7\t\2\2\u00c4\u00c5"+
		"\7\64\2\2\u00c5\u00c6\7\n\2\2\u00c6\u00c7\5\30\r\2\u00c7\u00c8\5\26\f"+
		"\2\u00c8\u00c9\7\4\2\2\u00c9\u00ca\5\24\13\2\u00ca\u00cb\b\13\1\2\u00cb"+
		"\u00ce\3\2\2\2\u00cc\u00ce\b\13\1\2\u00cd\u00c0\3\2\2\2\u00cd\u00cc\3"+
		"\2\2\2\u00ce\25\3\2\2\2\u00cf\u00d0\7\7\2\2\u00d0\u00d1\7\64\2\2\u00d1"+
		"\u00d2\7\n\2\2\u00d2\u00d3\5\30\r\2\u00d3\u00d4\5\26\f\2\u00d4\u00d5\b"+
		"\f\1\2\u00d5\u00d8\3\2\2\2\u00d6\u00d8\b\f\1\2\u00d7\u00cf\3\2\2\2\u00d7"+
		"\u00d6\3\2\2\2\u00d8\27\3\2\2\2\u00d9\u00da\7\66\2\2\u00da\u00e6\b\r\1"+
		"\2\u00db\u00dc\7\67\2\2\u00dc\u00e6\b\r\1\2\u00dd\u00de\7;\2\2\u00de\u00e6"+
		"\b\r\1\2\u00df\u00e0\78\2\2\u00e0\u00e6\b\r\1\2\u00e1\u00e2\79\2\2\u00e2"+
		"\u00e6\b\r\1\2\u00e3\u00e4\7:\2\2\u00e4\u00e6\b\r\1\2\u00e5\u00d9\3\2"+
		"\2\2\u00e5\u00db\3\2\2\2\u00e5\u00dd\3\2\2\2\u00e5\u00df\3\2\2\2\u00e5"+
		"\u00e1\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6\31\3\2\2\2\u00e7\u00e8\5\34\17"+
		"\2\u00e8\u00e9\7\t\2\2\u00e9\u00ea\5 \21\2\u00ea\u00eb\7\4\2\2\u00eb\u00ec"+
		"\5\32\16\2\u00ec\u00ed\b\16\1\2\u00ed\u00f0\3\2\2\2\u00ee\u00f0\b\16\1"+
		"\2\u00ef\u00e7\3\2\2\2\u00ef\u00ee\3\2\2\2\u00f0\33\3\2\2\2\u00f1\u00f2"+
		"\7\13\2\2\u00f2\u00fa\b\17\1\2\u00f3\u00f4\7\f\2\2\u00f4\u00fa\b\17\1"+
		"\2\u00f5\u00f6\7\r\2\2\u00f6\u00f7\5\36\20\2\u00f7\u00f8\b\17\1\2\u00f8"+
		"\u00fa\3\2\2\2\u00f9\u00f1\3\2\2\2\u00f9\u00f3\3\2\2\2\u00f9\u00f5\3\2"+
		"\2\2\u00fa\35\3\2\2\2\u00fb\u00fc\7\16\2\2\u00fc\u00fd\7\66\2\2\u00fd"+
		"\u00fe\7\17\2\2\u00fe\u0101\b\20\1\2\u00ff\u0101\b\20\1\2\u0100\u00fb"+
		"\3\2\2\2\u0100\u00ff\3\2\2\2\u0101\37\3\2\2\2\u0102\u0103\7\64\2\2\u0103"+
		"\u0104\5$\23\2\u0104\u0105\5\"\22\2\u0105\u0106\b\21\1\2\u0106!\3\2\2"+
		"\2\u0107\u0108\7\7\2\2\u0108\u0109\5 \21\2\u0109\u010a\b\22\1\2\u010a"+
		"\u010d\3\2\2\2\u010b\u010d\b\22\1\2\u010c\u0107\3\2\2\2\u010c\u010b\3"+
		"\2\2\2\u010d#\3\2\2\2\u010e\u010f\7\n\2\2\u010f\u0110\5\30\r\2\u0110\u0111"+
		"\b\23\1\2\u0111\u0114\3\2\2\2\u0112\u0114\b\23\1\2\u0113\u010e\3\2\2\2"+
		"\u0113\u0112\3\2\2\2\u0114%\3\2\2\2\u0115\u0116\7\20\2\2\u0116\u0117\7"+
		"\64\2\2\u0117\u0118\5(\25\2\u0118\u0119\5.\30\2\u0119\u011a\7\5\2\2\u011a"+
		"\u011b\7\20\2\2\u011b\u011c\7\64\2\2\u011c\u011d\b\24\1\2\u011d\'\3\2"+
		"\2\2\u011e\u011f\7\16\2\2\u011f\u0120\5*\26\2\u0120\u0121\7\17\2\2\u0121"+
		"\u0122\b\25\1\2\u0122\u0125\3\2\2\2\u0123\u0125\b\25\1\2\u0124\u011e\3"+
		"\2\2\2\u0124\u0123\3\2\2\2\u0125)\3\2\2\2\u0126\u0127\7\64\2\2\u0127\u0128"+
		"\5,\27\2\u0128\u0129\b\26\1\2\u0129+\3\2\2\2\u012a\u012b\7\7\2\2\u012b"+
		"\u012e\5*\26\2\u012c\u012e\3\2\2\2\u012d\u012a\3\2\2\2\u012d\u012c\3\2"+
		"\2\2\u012e-\3\2\2\2\u012f\u0130\5\34\17\2\u0130\u0131\7\7\2\2\u0131\u0132"+
		"\7\21\2\2\u0132\u0133\7\16\2\2\u0133\u0134\5\60\31\2\u0134\u0135\7\17"+
		"\2\2\u0135\u0136\7\64\2\2\u0136\u0137\7\4\2\2\u0137\u0138\b\30\1\2\u0138"+
		"\u0139\5.\30\2\u0139\u013a\b\30\1\2\u013a\u013d\3\2\2\2\u013b\u013d\b"+
		"\30\1\2\u013c\u012f\3\2\2\2\u013c\u013b\3\2\2\2\u013d/\3\2\2\2\u013e\u013f"+
		"\7\22\2\2\u013f\u0145\b\31\1\2\u0140\u0141\7\23\2\2\u0141\u0145\b\31\1"+
		"\2\u0142\u0143\7\24\2\2\u0143\u0145\b\31\1\2\u0144\u013e\3\2\2\2\u0144"+
		"\u0140\3\2\2\2\u0144\u0142\3\2\2\2\u0145\61\3\2\2\2\u0146\u0147\7\25\2"+
		"\2\u0147\u0148\7\64\2\2\u0148\u0149\b\32\1\2\u0149\u014a\7\16\2\2\u014a"+
		"\u014b\5*\26\2\u014b\u014c\7\17\2\2\u014c\u014d\5\34\17\2\u014d\u014e"+
		"\7\t\2\2\u014e\u014f\7\64\2\2\u014f\u0150\7\4\2\2\u0150\u0151\5\64\33"+
		"\2\u0151\u0152\7\5\2\2\u0152\u0153\7\25\2\2\u0153\u0154\7\64\2\2\u0154"+
		"\u0155\b\32\1\2\u0155\63\3\2\2\2\u0156\u0157\5\34\17\2\u0157\u0158\7\7"+
		"\2\2\u0158\u0159\7\21\2\2\u0159\u015a\7\16\2\2\u015a\u015b\7\22\2\2\u015b"+
		"\u015c\7\17\2\2\u015c\u015d\7\64\2\2\u015d\u015e\7\4\2\2\u015e\u015f\b"+
		"\33\1\2\u015f\u0160\5\64\33\2\u0160\u0161\b\33\1\2\u0161\u0164\3\2\2\2"+
		"\u0162\u0164\b\33\1\2\u0163\u0156\3\2\2\2\u0163\u0162\3\2\2\2\u0164\65"+
		"\3\2\2\2\u0165\u0166\7\64\2\2\u0166\u0167\7\n\2\2\u0167\u0168\5> \2\u0168"+
		"\u0169\7\4\2\2\u0169\u016a\b\34\1\2\u016a\u0185\3\2\2\2\u016b\u016c\5"+
		"L\'\2\u016c\u016d\7\4\2\2\u016d\u016e\b\34\1\2\u016e\u0185\3\2\2\2\u016f"+
		"\u0170\7\26\2\2\u0170\u0171\7\16\2\2\u0171\u0172\5V,\2\u0172\u0173\7\17"+
		"\2\2\u0173\u0174\5:\36\2\u0174\u0175\b\34\1\2\u0175\u0185\3\2\2\2\u0176"+
		"\u0177\7\27\2\2\u0177\u0178\5<\37\2\u0178\u0179\b\34\1\2\u0179\u0185\3"+
		"\2\2\2\u017a\u017b\7\30\2\2\u017b\u017c\7\31\2\2\u017c\u017d\7\16\2\2"+
		"\u017d\u017e\5> \2\u017e\u017f\7\17\2\2\u017f\u0180\5b\62\2\u0180\u0181"+
		"\7\5\2\2\u0181\u0182\7\30\2\2\u0182\u0183\b\34\1\2\u0183\u0185\3\2\2\2"+
		"\u0184\u0165\3\2\2\2\u0184\u016b\3\2\2\2\u0184\u016f\3\2\2\2\u0184\u0176"+
		"\3\2\2\2\u0184\u017a\3\2\2\2\u0185\67\3\2\2\2\u0186\u0187\7\32\2\2\u0187"+
		"\u018e\b\35\1\2\u0188\u0189\7\33\2\2\u0189\u018a\5\16\b\2\u018a\u018b"+
		"\7\32\2\2\u018b\u018c\b\35\1\2\u018c\u018e\3\2\2\2\u018d\u0186\3\2\2\2"+
		"\u018d\u0188\3\2\2\2\u018e9\3\2\2\2\u018f\u0190\7\34\2\2\u0190\u0191\5"+
		"\16\b\2\u0191\u0192\58\35\2\u0192\u0193\b\36\1\2\u0193\u0198\3\2\2\2\u0194"+
		"\u0195\5\66\34\2\u0195\u0196\b\36\1\2\u0196\u0198\3\2\2\2\u0197\u018f"+
		"\3\2\2\2\u0197\u0194\3\2\2\2\u0198;\3\2\2\2\u0199\u019a\7\35\2\2\u019a"+
		"\u019b\7\16\2\2\u019b\u019c\5V,\2\u019c\u019d\7\17\2\2\u019d\u019e\5\16"+
		"\b\2\u019e\u019f\7\36\2\2\u019f\u01a0\b\37\1\2\u01a0\u01ad\3\2\2\2\u01a1"+
		"\u01a2\7\64\2\2\u01a2\u01a3\7\n\2\2\u01a3\u01a4\5`\61\2\u01a4\u01a5\7"+
		"\7\2\2\u01a5\u01a6\5`\61\2\u01a6\u01a7\7\7\2\2\u01a7\u01a8\5`\61\2\u01a8"+
		"\u01a9\5\16\b\2\u01a9\u01aa\7\36\2\2\u01aa\u01ab\b\37\1\2\u01ab\u01ad"+
		"\3\2\2\2\u01ac\u0199\3\2\2\2\u01ac\u01a1\3\2\2\2\u01ad=\3\2\2\2\u01ae"+
		"\u01af\5F$\2\u01af\u01b0\5@!\2\u01b0\u01b1\b \1\2\u01b1?\3\2\2\2\u01b2"+
		"\u01b3\5B\"\2\u01b3\u01b4\5> \2\u01b4\u01b5\5@!\2\u01b5\u01b6\b!\1\2\u01b6"+
		"\u01b9\3\2\2\2\u01b7\u01b9\b!\1\2\u01b8\u01b2\3\2\2\2\u01b8\u01b7\3\2"+
		"\2\2\u01b9A\3\2\2\2\u01ba\u01bb\5D#\2\u01bb\u01bc\b\"\1\2\u01bcC\3\2\2"+
		"\2\u01bd\u01be\7\37\2\2\u01be\u01c6\b#\1\2\u01bf\u01c0\7 \2\2\u01c0\u01c6"+
		"\b#\1\2\u01c1\u01c2\7!\2\2\u01c2\u01c6\b#\1\2\u01c3\u01c4\7\"\2\2\u01c4"+
		"\u01c6\b#\1\2\u01c5\u01bd\3\2\2\2\u01c5\u01bf\3\2\2\2\u01c5\u01c1\3\2"+
		"\2\2\u01c5\u01c3\3\2\2\2\u01c6E\3\2\2\2\u01c7\u01c8\7\64\2\2\u01c8\u01c9"+
		"\5H%\2\u01c9\u01ca\b$\1\2\u01ca\u01d4\3\2\2\2\u01cb\u01cc\5\30\r\2\u01cc"+
		"\u01cd\b$\1\2\u01cd\u01d4\3\2\2\2\u01ce\u01cf\7\16\2\2\u01cf\u01d0\5>"+
		" \2\u01d0\u01d1\7\17\2\2\u01d1\u01d2\b$\1\2\u01d2\u01d4\3\2\2\2\u01d3"+
		"\u01c7\3\2\2\2\u01d3\u01cb\3\2\2\2\u01d3\u01ce\3\2\2\2\u01d4G\3\2\2\2"+
		"\u01d5\u01d6\7\16\2\2\u01d6\u01d7\5> \2\u01d7\u01d8\5J&\2\u01d8\u01d9"+
		"\7\17\2\2\u01d9\u01da\b%\1\2\u01da\u01dd\3\2\2\2\u01db\u01dd\b%\1\2\u01dc"+
		"\u01d5\3\2\2\2\u01dc\u01db\3\2\2\2\u01ddI\3\2\2\2\u01de\u01df\7\7\2\2"+
		"\u01df\u01e0\5> \2\u01e0\u01e1\5J&\2\u01e1\u01e2\b&\1\2\u01e2\u01e5\3"+
		"\2\2\2\u01e3\u01e5\b&\1\2\u01e4\u01de\3\2\2\2\u01e4\u01e3\3\2\2\2\u01e5"+
		"K\3\2\2\2\u01e6\u01e7\7#\2\2\u01e7\u01e8\7\64\2\2\u01e8\u01e9\5N(\2\u01e9"+
		"\u01ea\b\'\1\2\u01eaM\3\2\2\2\u01eb\u01ec\7\16\2\2\u01ec\u01ed\5> \2\u01ed"+
		"\u01ee\5J&\2\u01ee\u01ef\7\17\2\2\u01ef\u01f0\b(\1\2\u01f0\u01f3\3\2\2"+
		"\2\u01f1\u01f3\b(\1\2\u01f2\u01eb\3\2\2\2\u01f2\u01f1\3\2\2\2\u01f3O\3"+
		"\2\2\2\u01f4\u01f5\5R*\2\u01f5\u01f6\5P)\2\u01f6\u01f7\b)\1\2\u01f7\u01fe"+
		"\3\2\2\2\u01f8\u01f9\5T+\2\u01f9\u01fa\5P)\2\u01fa\u01fb\b)\1\2\u01fb"+
		"\u01fe\3\2\2\2\u01fc\u01fe\b)\1\2\u01fd\u01f4\3\2\2\2\u01fd\u01f8\3\2"+
		"\2\2\u01fd\u01fc\3\2\2\2\u01feQ\3\2\2\2\u01ff\u0200\7\20\2\2\u0200\u0201"+
		"\7\64\2\2\u0201\u0202\5(\25\2\u0202\u0203\5.\30\2\u0203\u0204\5\4\3\2"+
		"\u0204\u0205\5\66\34\2\u0205\u0206\5\16\b\2\u0206\u0207\7\5\2\2\u0207"+
		"\u0208\7\20\2\2\u0208\u0209\7\64\2\2\u0209\u020a\b*\1\2\u020aS\3\2\2\2"+
		"\u020b\u020c\7\25\2\2\u020c\u020d\7\64\2\2\u020d\u020e\7\16\2\2\u020e"+
		"\u020f\5*\26\2\u020f\u0210\7\17\2\2\u0210\u0211\5\34\17\2\u0211\u0212"+
		"\7\t\2\2\u0212\u0213\7\64\2\2\u0213\u0214\7\4\2\2\u0214\u0215\5\64\33"+
		"\2\u0215\u0216\5\4\3\2\u0216\u0217\5\66\34\2\u0217\u0218\5\16\b\2\u0218"+
		"\u0219\7\64\2\2\u0219\u021a\7\n\2\2\u021a\u021b\5> \2\u021b\u021c\7\4"+
		"\2\2\u021c\u021d\7\5\2\2\u021d\u021e\7\25\2\2\u021e\u021f\7\64\2\2\u021f"+
		"\u0220\b+\1\2\u0220U\3\2\2\2\u0221\u0222\5\\/\2\u0222\u0223\5X-\2\u0223"+
		"\u0224\b,\1\2\u0224W\3\2\2\2\u0225\u0226\5Z.\2\u0226\u0227\5V,\2\u0227"+
		"\u0228\5X-\2\u0228\u0229\b-\1\2\u0229\u022c\3\2\2\2\u022a\u022c\b-\1\2"+
		"\u022b\u0225\3\2\2\2\u022b\u022a\3\2\2\2\u022cY\3\2\2\2\u022d\u022e\7"+
		"$\2\2\u022e\u0236\b.\1\2\u022f\u0230\7%\2\2\u0230\u0236\b.\1\2\u0231\u0232"+
		"\7&\2\2\u0232\u0236\b.\1\2\u0233\u0234\7\'\2\2\u0234\u0236\b.\1\2\u0235"+
		"\u022d\3\2\2\2\u0235\u022f\3\2\2\2\u0235\u0231\3\2\2\2\u0235\u0233\3\2"+
		"\2\2\u0236[\3\2\2\2\u0237\u0238\7\16\2\2\u0238\u0239\5V,\2\u0239\u023a"+
		"\7\17\2\2\u023a\u023b\b/\1\2\u023b\u024b\3\2\2\2\u023c\u023d\7(\2\2\u023d"+
		"\u023e\5\\/\2\u023e\u023f\b/\1\2\u023f\u024b\3\2\2\2\u0240\u0241\7)\2"+
		"\2\u0241\u024b\b/\1\2\u0242\u0243\7*\2\2\u0243\u024b\b/\1\2\u0244\u0245"+
		"\5> \2\u0245\u0246\b/\1\2\u0246\u0247\5^\60\2\u0247\u0248\5> \2\u0248"+
		"\u0249\b/\1\2\u0249\u024b\3\2\2\2\u024a\u0237\3\2\2\2\u024a\u023c\3\2"+
		"\2\2\u024a\u0240\3\2\2\2\u024a\u0242\3\2\2\2\u024a\u0244\3\2\2\2\u024b"+
		"]\3\2\2\2\u024c\u024d\7+\2\2\u024d\u0259\b\60\1\2\u024e\u024f\7,\2\2\u024f"+
		"\u0259\b\60\1\2\u0250\u0251\7-\2\2\u0251\u0259\b\60\1\2\u0252\u0253\7"+
		".\2\2\u0253\u0259\b\60\1\2\u0254\u0255\7/\2\2\u0255\u0259\b\60\1\2\u0256"+
		"\u0257\7\60\2\2\u0257\u0259\b\60\1\2\u0258\u024c\3\2\2\2\u0258\u024e\3"+
		"\2\2\2\u0258\u0250\3\2\2\2\u0258\u0252\3\2\2\2\u0258\u0254\3\2\2\2\u0258"+
		"\u0256\3\2\2\2\u0259_\3\2\2\2\u025a\u025b\7\66\2\2\u025b\u025f\b\61\1"+
		"\2\u025c\u025d\7\64\2\2\u025d\u025f\b\61\1\2\u025e\u025a\3\2\2\2\u025e"+
		"\u025c\3\2\2\2\u025fa\3\2\2\2\u0260\u0261\7\31\2\2\u0261\u0262\5d\63\2"+
		"\u0262\u0263\b\62\1\2\u0263\u0266\3\2\2\2\u0264\u0266\b\62\1\2\u0265\u0260"+
		"\3\2\2\2\u0265\u0264\3\2\2\2\u0266c\3\2\2\2\u0267\u0268\7\16\2\2\u0268"+
		"\u0269\5f\64\2\u0269\u026a\7\17\2\2\u026a\u026b\5\16\b\2\u026b\u026c\5"+
		"b\62\2\u026c\u026d\b\63\1\2\u026d\u0273\3\2\2\2\u026e\u026f\7\61\2\2\u026f"+
		"\u0270\5\16\b\2\u0270\u0271\b\63\1\2\u0271\u0273\3\2\2\2\u0272\u0267\3"+
		"\2\2\2\u0272\u026e\3\2\2\2\u0273e\3\2\2\2\u0274\u0275\5\30\r\2\u0275\u0276"+
		"\5j\66\2\u0276\u0277\b\64\1\2\u0277\u027d\3\2\2\2\u0278\u0279\7\62\2\2"+
		"\u0279\u027a\5\30\r\2\u027a\u027b\b\64\1\2\u027b\u027d\3\2\2\2\u027c\u0274"+
		"\3\2\2\2\u027c\u0278\3\2\2\2\u027dg\3\2\2\2\u027e\u027f\5\30\r\2\u027f"+
		"\u0280\b\65\1\2\u0280\u0283\3\2\2\2\u0281\u0283\b\65\1\2\u0282\u027e\3"+
		"\2\2\2\u0282\u0281\3\2\2\2\u0283i\3\2\2\2\u0284\u0285\7\62\2\2\u0285\u0286"+
		"\5h\65\2\u0286\u0287\b\66\1\2\u0287\u028c\3\2\2\2\u0288\u0289\5l\67\2"+
		"\u0289\u028a\b\66\1\2\u028a\u028c\3\2\2\2\u028b\u0284\3\2\2\2\u028b\u0288"+
		"\3\2\2\2\u028ck\3\2\2\2\u028d\u028e\7\7\2\2\u028e\u028f\5\30\r\2\u028f"+
		"\u0290\b\67\1\2\u0290\u0293\3\2\2\2\u0291\u0293\b\67\1\2\u0292\u028d\3"+
		"\2\2\2\u0292\u0291\3\2\2\2\u0293m\3\2\2\2+\u0083\u008c\u0094\u009f\u00a6"+
		"\u00be\u00cd\u00d7\u00e5\u00ef\u00f9\u0100\u010c\u0113\u0124\u012d\u013c"+
		"\u0144\u0163\u0184\u018d\u0197\u01ac\u01b8\u01c5\u01d3\u01dc\u01e4\u01f2"+
		"\u01fd\u022b\u0235\u024a\u0258\u025e\u0265\u0272\u027c\u0282\u028b\u0292";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}