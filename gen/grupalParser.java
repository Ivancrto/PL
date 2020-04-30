// Generated from C:/Users/Ivanxrto/Downloads/practicaGrupalPL/src\grupal.g4 by ANTLR 4.8

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
	public static final int
		RULE_r = 0, RULE_prg = 1, RULE_dcllist = 2, RULE_dcllistp = 3, RULE_cabecera = 4, 
		RULE_cablist = 5, RULE_decsubprog = 6, RULE_sentlist = 7, RULE_dcl = 8, 
		RULE_dclp = 9, RULE_defcte = 10, RULE_ctelist = 11, RULE_simpvalue = 12, 
		RULE_defvar = 13, RULE_tipo = 14, RULE_charlength = 15, RULE_varlist = 16, 
		RULE_varlistp = 17, RULE_init = 18, RULE_decproc = 19, RULE_formal_paramlist = 20, 
		RULE_nomparamlist = 21, RULE_nomparamlistp = 22, RULE_dec_s_paramlist = 23, 
		RULE_tipoparam = 24, RULE_decfun = 25, RULE_dec_f_paramlist = 26, RULE_sent = 27, 
		RULE_sentp = 28, RULE_sentpp = 29, RULE_sentppp = 30, RULE_exp = 31, RULE_expp = 32, 
		RULE_op = 33, RULE_oparit = 34, RULE_factor = 35, RULE_factorp = 36, RULE_explist = 37, 
		RULE_proc_call = 38, RULE_subpparamlist = 39, RULE_subproglist = 40, RULE_codproc = 41, 
		RULE_codfun = 42, RULE_expcond = 43, RULE_expcondp = 44, RULE_oplog = 45, 
		RULE_factorcond = 46, RULE_opcomp = 47, RULE_doval = 48, RULE_casos = 49, 
		RULE_casosp = 50, RULE_etiquetas = 51, RULE_etiquetasp = 52, RULE_etiquetaspp = 53, 
		RULE_listaetiquetas = 54;
	private static String[] makeRuleNames() {
		return new String[] {
			"r", "prg", "dcllist", "dcllistp", "cabecera", "cablist", "decsubprog", 
			"sentlist", "dcl", "dclp", "defcte", "ctelist", "simpvalue", "defvar", 
			"tipo", "charlength", "varlist", "varlistp", "init", "decproc", "formal_paramlist", 
			"nomparamlist", "nomparamlistp", "dec_s_paramlist", "tipoparam", "decfun", 
			"dec_f_paramlist", "sent", "sentp", "sentpp", "sentppp", "exp", "expp", 
			"op", "oparit", "factor", "factorp", "explist", "proc_call", "subpparamlist", 
			"subproglist", "codproc", "codfun", "expcond", "expcondp", "oplog", "factorcond", 
			"opcomp", "doval", "casos", "casosp", "etiquetas", "etiquetasp", "etiquetaspp", 
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

	public grupalParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class RContext extends ParserRuleContext {
		public List<TerminalNode> IDENT() { return getTokens(grupalParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(grupalParser.IDENT, i);
		}
		public List<TerminalNode> ENTRECOMILLADOS() { return getTokens(grupalParser.ENTRECOMILLADOS); }
		public TerminalNode ENTRECOMILLADOS(int i) {
			return getToken(grupalParser.ENTRECOMILLADOS, i);
		}
		public List<TerminalNode> COMMENT() { return getTokens(grupalParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(grupalParser.COMMENT, i);
		}
		public List<TerminalNode> NUM_REAL_CONST() { return getTokens(grupalParser.NUM_REAL_CONST); }
		public TerminalNode NUM_REAL_CONST(int i) {
			return getToken(grupalParser.NUM_REAL_CONST, i);
		}
		public List<TerminalNode> NUM_INT_CONST() { return getTokens(grupalParser.NUM_INT_CONST); }
		public TerminalNode NUM_INT_CONST(int i) {
			return getToken(grupalParser.NUM_INT_CONST, i);
		}
		public List<TerminalNode> NUM_INT_CONST_B() { return getTokens(grupalParser.NUM_INT_CONST_B); }
		public TerminalNode NUM_INT_CONST_B(int i) {
			return getToken(grupalParser.NUM_INT_CONST_B, i);
		}
		public List<TerminalNode> NUM_INT_CONST_O() { return getTokens(grupalParser.NUM_INT_CONST_O); }
		public TerminalNode NUM_INT_CONST_O(int i) {
			return getToken(grupalParser.NUM_INT_CONST_O, i);
		}
		public List<TerminalNode> NUM_INT_CONST_H() { return getTokens(grupalParser.NUM_INT_CONST_H); }
		public TerminalNode NUM_INT_CONST_H(int i) {
			return getToken(grupalParser.NUM_INT_CONST_H, i);
		}
		public List<TerminalNode> STRING_CONST() { return getTokens(grupalParser.STRING_CONST); }
		public TerminalNode STRING_CONST(int i) {
			return getToken(grupalParser.STRING_CONST, i);
		}
		public List<TerminalNode> ERRORES() { return getTokens(grupalParser.ERRORES); }
		public TerminalNode ERRORES(int i) {
			return getToken(grupalParser.ERRORES, i);
		}
		public RContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grupalListener ) ((grupalListener)listener).enterR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grupalListener ) ((grupalListener)listener).exitR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grupalVisitor ) return ((grupalVisitor<? extends T>)visitor).visitR(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RContext r() throws RecognitionException {
		RContext _localctx = new RContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_r);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(110);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENTRECOMILLADOS) | (1L << IDENT) | (1L << COMMENT) | (1L << NUM_INT_CONST) | (1L << NUM_REAL_CONST) | (1L << NUM_INT_CONST_B) | (1L << NUM_INT_CONST_O) | (1L << NUM_INT_CONST_H) | (1L << STRING_CONST) | (1L << ERRORES))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(113); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENTRECOMILLADOS) | (1L << IDENT) | (1L << COMMENT) | (1L << NUM_INT_CONST) | (1L << NUM_REAL_CONST) | (1L << NUM_INT_CONST_B) | (1L << NUM_INT_CONST_O) | (1L << NUM_INT_CONST_H) | (1L << STRING_CONST) | (1L << ERRORES))) != 0) );
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grupalVisitor ) return ((grupalVisitor<? extends T>)visitor).visitPrg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrgContext prg() throws RecognitionException {
		PrgContext _localctx = new PrgContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_prg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(T__0);
			setState(116);
			match(IDENT);
			setState(117);
			match(T__1);
			setState(118);
			((PrgContext)_localctx).dcllist = dcllist();
			setState(119);
			((PrgContext)_localctx).cabecera = cabecera();
			setState(120);
			((PrgContext)_localctx).sent = sent();
			setState(121);
			((PrgContext)_localctx).sentlist = sentlist();
			setState(122);
			match(T__2);
			setState(123);
			match(T__0);
			setState(124);
			match(IDENT);
			setState(125);
			((PrgContext)_localctx).subproglist = subproglist();
			insertTxtC("\n" + ((PrgContext)_localctx).cabecera.re + "\n" +((PrgContext)_localctx).subproglist.re  + "\n" +"void main (void){" + "\n" + ((PrgContext)_localctx).dcllist.s + ((PrgContext)_localctx).sent.re + ((PrgContext)_localctx).sentlist.re + "\n"+ "}\n");
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grupalVisitor ) return ((grupalVisitor<? extends T>)visitor).visitDcllist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DcllistContext dcllist() throws RecognitionException {
		DcllistContext _localctx = new DcllistContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_dcllist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grupalVisitor ) return ((grupalVisitor<? extends T>)visitor).visitDcllistp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DcllistpContext dcllistp() throws RecognitionException {
		DcllistpContext _localctx = new DcllistpContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_dcllistp);
		try {
			setState(136);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
			case T__9:
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				((DcllistpContext)_localctx).dcl = dcl();
				setState(132);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grupalVisitor ) return ((grupalVisitor<? extends T>)visitor).visitCabecera(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CabeceraContext cabecera() throws RecognitionException {
		CabeceraContext _localctx = new CabeceraContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_cabecera);
		try {
			setState(145);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				match(T__3);
				setState(139);
				((CabeceraContext)_localctx).cablist = cablist();
				setState(140);
				match(T__2);
				setState(141);
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
		public DecprocContext decproc;
		public DecsubprogContext decsubprog;
		public DecfunContext decfun;
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grupalVisitor ) return ((grupalVisitor<? extends T>)visitor).visitCablist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CablistContext cablist() throws RecognitionException {
		CablistContext _localctx = new CablistContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_cablist);
		try {
			setState(155);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				((CablistContext)_localctx).decproc = decproc();
				setState(148);
				((CablistContext)_localctx).decsubprog = decsubprog();
				((CablistContext)_localctx).re = ((CablistContext)_localctx).decproc.re + ((CablistContext)_localctx).decsubprog.re;
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 2);
				{
				setState(151);
				((CablistContext)_localctx).decfun = decfun();
				setState(152);
				((CablistContext)_localctx).decsubprog = decsubprog();
				((CablistContext)_localctx).re = ((CablistContext)_localctx).decfun.re + ((CablistContext)_localctx).decsubprog.re;
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
		public DecprocContext decproc;
		public DecsubprogContext decsubprog;
		public DecfunContext decfun;
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grupalVisitor ) return ((grupalVisitor<? extends T>)visitor).visitDecsubprog(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecsubprogContext decsubprog() throws RecognitionException {
		DecsubprogContext _localctx = new DecsubprogContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_decsubprog);
		try {
			setState(166);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				((DecsubprogContext)_localctx).decproc = decproc();
				setState(158);
				((DecsubprogContext)_localctx).decsubprog = decsubprog();
				((DecsubprogContext)_localctx).re = ((DecsubprogContext)_localctx).decproc.re + ((DecsubprogContext)_localctx).decsubprog.re;
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 2);
				{
				setState(161);
				((DecsubprogContext)_localctx).decfun = decfun();
				setState(162);
				((DecsubprogContext)_localctx).decsubprog = decsubprog();
				((DecsubprogContext)_localctx).re = ((DecsubprogContext)_localctx).decfun.re + ((DecsubprogContext)_localctx).decsubprog.re;
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grupalVisitor ) return ((grupalVisitor<? extends T>)visitor).visitSentlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentlistContext sentlist() throws RecognitionException {
		SentlistContext _localctx = new SentlistContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_sentlist);
		try {
			setState(173);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				((SentlistContext)_localctx).sent = sent();
				setState(169);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grupalVisitor ) return ((grupalVisitor<? extends T>)visitor).visitDcl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DclContext dcl() throws RecognitionException {
		DclContext _localctx = new DclContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_dcl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			((DclContext)_localctx).tipo = tipo();
			setState(176);
			((DclContext)_localctx).dclp = dclp(((DclContext)_localctx).tipo.s);
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
		public DefcteContext defcte;
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grupalVisitor ) return ((grupalVisitor<? extends T>)visitor).visitDclp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DclpContext dclp(String h) throws RecognitionException {
		DclpContext _localctx = new DclpContext(_ctx, getState(), h);
		enterRule(_localctx, 18, RULE_dclp);
		try {
			setState(197);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(179);
				match(T__4);
				setState(180);
				match(T__5);
				setState(181);
				match(T__6);
				setState(182);
				((DclpContext)_localctx).IDENT = match(IDENT);
				setState(183);
				match(T__7);
				setState(184);
				((DclpContext)_localctx).simpvalue = simpvalue();
				setState(185);
				((DclpContext)_localctx).ctelist = ctelist();
				setState(186);
				match(T__1);
				setState(187);
				((DclpContext)_localctx).defcte = defcte();

				                        String define = (((DclpContext)_localctx).IDENT!=null?((DclpContext)_localctx).IDENT.getText():null)+ " " +((DclpContext)_localctx).simpvalue.s +" "+((DclpContext)_localctx).ctelist.re;
				                        String[] parts = define.split(",");
				                        for(String i:parts){
				                           insertTxtC("#define "+ _localctx.h + i + ";\n");
				                           //_localctx.re+="#define "+ _localctx.h + i + ";\n";
				                        }
				                        ((DclpContext)_localctx).re =  ((DclpContext)_localctx).defcte.re + _localctx.re ;
				                   
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(190);
				match(T__6);
				setState(191);
				((DclpContext)_localctx).varlist = varlist();
				setState(192);
				match(T__1);
				setState(193);
				((DclpContext)_localctx).defvar = defvar();
				((DclpContext)_localctx).re =   _localctx.h +  " " + ((DclpContext)_localctx).varlist.s + ";\n" + ((DclpContext)_localctx).defvar.re + "\n";
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
		public TipoContext tipo;
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grupalVisitor ) return ((grupalVisitor<? extends T>)visitor).visitDefcte(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefcteContext defcte() throws RecognitionException {
		DefcteContext _localctx = new DefcteContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_defcte);
		try {
			setState(212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(199);
				((DefcteContext)_localctx).tipo = tipo();
				setState(200);
				match(T__4);
				setState(201);
				match(T__5);
				setState(202);
				match(T__6);
				setState(203);
				((DefcteContext)_localctx).IDENT = match(IDENT);
				setState(204);
				match(T__7);
				setState(205);
				((DefcteContext)_localctx).simpvalue = simpvalue();
				setState(206);
				ctelist();
				setState(207);
				match(T__1);
				setState(208);
				defcte();

				                       ((DefcteContext)_localctx).re =  "";
				                       insertTxtC("#define " + ((DefcteContext)_localctx).tipo.s + (((DefcteContext)_localctx).IDENT!=null?((DefcteContext)_localctx).IDENT.getText():null) + " " + ((DefcteContext)_localctx).simpvalue.s +";\n");
				                        
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grupalVisitor ) return ((grupalVisitor<? extends T>)visitor).visitCtelist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CtelistContext ctelist() throws RecognitionException {
		CtelistContext _localctx = new CtelistContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_ctelist);
		try {
			setState(222);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(214);
				match(T__4);
				setState(215);
				((CtelistContext)_localctx).IDENT = match(IDENT);
				setState(216);
				match(T__7);
				setState(217);
				((CtelistContext)_localctx).simpvalue = simpvalue();
				setState(218);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grupalVisitor ) return ((grupalVisitor<? extends T>)visitor).visitSimpvalue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpvalueContext simpvalue() throws RecognitionException {
		SimpvalueContext _localctx = new SimpvalueContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_simpvalue);
		try {
			setState(236);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM_INT_CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(224);
				((SimpvalueContext)_localctx).NUM_INT_CONST = match(NUM_INT_CONST);
				((SimpvalueContext)_localctx).s =  (((SimpvalueContext)_localctx).NUM_INT_CONST!=null?((SimpvalueContext)_localctx).NUM_INT_CONST.getText():null);
				}
				break;
			case NUM_REAL_CONST:
				enterOuterAlt(_localctx, 2);
				{
				setState(226);
				((SimpvalueContext)_localctx).NUM_REAL_CONST = match(NUM_REAL_CONST);
				((SimpvalueContext)_localctx).s =  (((SimpvalueContext)_localctx).NUM_REAL_CONST!=null?((SimpvalueContext)_localctx).NUM_REAL_CONST.getText():null);
				}
				break;
			case STRING_CONST:
				enterOuterAlt(_localctx, 3);
				{
				setState(228);
				((SimpvalueContext)_localctx).STRING_CONST = match(STRING_CONST);
				((SimpvalueContext)_localctx).s =  (((SimpvalueContext)_localctx).STRING_CONST!=null?((SimpvalueContext)_localctx).STRING_CONST.getText():null);
				}
				break;
			case NUM_INT_CONST_B:
				enterOuterAlt(_localctx, 4);
				{
				setState(230);
				((SimpvalueContext)_localctx).NUM_INT_CONST_B = match(NUM_INT_CONST_B);
				((SimpvalueContext)_localctx).s =  "0b" + (((SimpvalueContext)_localctx).NUM_INT_CONST_B!=null?((SimpvalueContext)_localctx).NUM_INT_CONST_B.getText():null).substring(2,(((SimpvalueContext)_localctx).NUM_INT_CONST_B!=null?((SimpvalueContext)_localctx).NUM_INT_CONST_B.getText():null).length()-1)  ;
				}
				break;
			case NUM_INT_CONST_O:
				enterOuterAlt(_localctx, 5);
				{
				setState(232);
				((SimpvalueContext)_localctx).NUM_INT_CONST_O = match(NUM_INT_CONST_O);
				((SimpvalueContext)_localctx).s =  "0o" + (((SimpvalueContext)_localctx).NUM_INT_CONST_O!=null?((SimpvalueContext)_localctx).NUM_INT_CONST_O.getText():null).substring(2,(((SimpvalueContext)_localctx).NUM_INT_CONST_O!=null?((SimpvalueContext)_localctx).NUM_INT_CONST_O.getText():null).length()-1)  ;
				}
				break;
			case NUM_INT_CONST_H:
				enterOuterAlt(_localctx, 6);
				{
				setState(234);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grupalVisitor ) return ((grupalVisitor<? extends T>)visitor).visitDefvar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefvarContext defvar() throws RecognitionException {
		DefvarContext _localctx = new DefvarContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_defvar);
		try {
			setState(246);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(238);
				((DefvarContext)_localctx).tipo = tipo();
				setState(239);
				match(T__6);
				setState(240);
				((DefvarContext)_localctx).varlist = varlist();
				setState(241);
				match(T__1);
				setState(242);
				defvar();
				((DefvarContext)_localctx).re =  ((DefvarContext)_localctx).tipo.s + ((DefvarContext)_localctx).varlist.s + ";\n";
				                                                            //insertTxtC(((DefvarContext)_localctx).tipo.s + ((DefvarContext)_localctx).varlist.s + ";\n");
				                                                            
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
		public String s;
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grupalVisitor ) return ((grupalVisitor<? extends T>)visitor).visitTipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_tipo);
		try {
			setState(256);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(248);
				match(T__8);
				((TipoContext)_localctx).s = "int ";
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(250);
				match(T__9);
				((TipoContext)_localctx).s = "float ";
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 3);
				{
				setState(252);
				match(T__10);
				setState(253);
				((TipoContext)_localctx).charlength = charlength();
				((TipoContext)_localctx).s =  "char " + ((TipoContext)_localctx).charlength.s ;
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grupalVisitor ) return ((grupalVisitor<? extends T>)visitor).visitCharlength(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharlengthContext charlength() throws RecognitionException {
		CharlengthContext _localctx = new CharlengthContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_charlength);
		try {
			setState(263);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(258);
				match(T__11);
				setState(259);
				((CharlengthContext)_localctx).NUM_INT_CONST = match(NUM_INT_CONST);
				setState(260);
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
		public VarlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grupalVisitor ) return ((grupalVisitor<? extends T>)visitor).visitVarlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarlistContext varlist() throws RecognitionException {
		VarlistContext _localctx = new VarlistContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_varlist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			((VarlistContext)_localctx).IDENT = match(IDENT);
			setState(266);
			((VarlistContext)_localctx).init = init();
			setState(267);
			((VarlistContext)_localctx).varlistp = varlistp();
			((VarlistContext)_localctx).s =  (((VarlistContext)_localctx).IDENT!=null?((VarlistContext)_localctx).IDENT.getText():null) + ((VarlistContext)_localctx).init.s + ((VarlistContext)_localctx).varlistp.s;
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
		public String s;
		public VarlistContext varlist;
		public VarlistContext varlist() {
			return getRuleContext(VarlistContext.class,0);
		}
		public VarlistpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grupalVisitor ) return ((grupalVisitor<? extends T>)visitor).visitVarlistp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarlistpContext varlistp() throws RecognitionException {
		VarlistpContext _localctx = new VarlistpContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_varlistp);
		try {
			setState(275);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(270);
				match(T__4);
				setState(271);
				((VarlistpContext)_localctx).varlist = varlist();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grupalVisitor ) return ((grupalVisitor<? extends T>)visitor).visitInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_init);
		try {
			setState(282);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(277);
				match(T__7);
				setState(278);
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
		public String re;
		public Token id1;
		public Formal_paramlistContext formal_paramlist;
		public Dec_s_paramlistContext dec_s_paramlist;
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grupalVisitor ) return ((grupalVisitor<? extends T>)visitor).visitDecproc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecprocContext decproc() throws RecognitionException {
		DecprocContext _localctx = new DecprocContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_decproc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(T__13);
			setState(285);
			((DecprocContext)_localctx).id1 = match(IDENT);
			setState(286);
			((DecprocContext)_localctx).formal_paramlist = formal_paramlist();
			setState(287);
			((DecprocContext)_localctx).dec_s_paramlist = dec_s_paramlist((((DecprocContext)_localctx).id1!=null?((DecprocContext)_localctx).id1.getText():null));
			setState(288);
			match(T__2);
			setState(289);
			match(T__13);
			setState(290);
			((DecprocContext)_localctx).id2 = match(IDENT);

			                                                                                                            comprobarTodosSub();
			                                                                                                            ((DecprocContext)_localctx).re = "void "+(((DecprocContext)_localctx).id1!=null?((DecprocContext)_localctx).id1.getText():null);
			                                                                                                            if(((DecprocContext)_localctx).formal_paramlist.esVoid==1)
			                                                                                                                _localctx.re+="(void)";
			                                                                                                            else
			                                                                                                                _localctx.re+="("+((DecprocContext)_localctx).dec_s_paramlist.re+")";
			                                                                                                            _localctx.re+=";\n";
			                                                                                                            //insertTxtC(_localctx.re);
			                                                                                                            mapVarSub.clear();
			                                                                                                            
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
		public int esVoid;
		public NomparamlistContext nomparamlist() {
			return getRuleContext(NomparamlistContext.class,0);
		}
		public Formal_paramlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grupalVisitor ) return ((grupalVisitor<? extends T>)visitor).visitFormal_paramlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Formal_paramlistContext formal_paramlist() throws RecognitionException {
		Formal_paramlistContext _localctx = new Formal_paramlistContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_formal_paramlist);
		try {
			setState(299);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(293);
				match(T__11);
				setState(294);
				nomparamlist();
				setState(295);
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
		public Token IDENT;
		public TerminalNode IDENT() { return getToken(grupalParser.IDENT, 0); }
		public NomparamlistpContext nomparamlistp() {
			return getRuleContext(NomparamlistpContext.class,0);
		}
		public NomparamlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grupalVisitor ) return ((grupalVisitor<? extends T>)visitor).visitNomparamlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NomparamlistContext nomparamlist() throws RecognitionException {
		NomparamlistContext _localctx = new NomparamlistContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_nomparamlist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			((NomparamlistContext)_localctx).IDENT = match(IDENT);
			setState(302);
			nomparamlistp();
			mapVarSub.put((((NomparamlistContext)_localctx).IDENT!=null?((NomparamlistContext)_localctx).IDENT.getText():null),0);
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
		public NomparamlistContext nomparamlist() {
			return getRuleContext(NomparamlistContext.class,0);
		}
		public NomparamlistpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grupalVisitor ) return ((grupalVisitor<? extends T>)visitor).visitNomparamlistp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NomparamlistpContext nomparamlistp() throws RecognitionException {
		NomparamlistpContext _localctx = new NomparamlistpContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_nomparamlistp);
		try {
			setState(308);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(305);
				match(T__4);
				setState(306);
				nomparamlist();
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
		public Dec_s_paramlistContext dec_s_paramlist;
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grupalVisitor ) return ((grupalVisitor<? extends T>)visitor).visitDec_s_paramlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dec_s_paramlistContext dec_s_paramlist(String id) throws RecognitionException {
		Dec_s_paramlistContext _localctx = new Dec_s_paramlistContext(_ctx, getState(), id);
		enterRule(_localctx, 46, RULE_dec_s_paramlist);
		try {
			setState(322);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(310);
				((Dec_s_paramlistContext)_localctx).tipo = tipo();
				setState(311);
				match(T__4);
				setState(312);
				match(T__14);
				setState(313);
				match(T__11);
				setState(314);
				((Dec_s_paramlistContext)_localctx).tipoparam = tipoparam();
				setState(315);
				match(T__12);
				setState(316);
				((Dec_s_paramlistContext)_localctx).IDENT = match(IDENT);
				setState(317);
				match(T__1);
				setState(318);
				((Dec_s_paramlistContext)_localctx).dec_s_paramlist = dec_s_paramlist(_localctx.id);

				                                                                                                        String tipo=((Dec_s_paramlistContext)_localctx).tipo.s;
				                                                                                                        if((((Dec_s_paramlistContext)_localctx).tipo.s).startsWith("char")){
				                                                                                                            tipo="char ";
				                                                                                                        }
				                                                                                                        ((Dec_s_paramlistContext)_localctx).re = tipo+ ((Dec_s_paramlistContext)_localctx).tipoparam.c +(((Dec_s_paramlistContext)_localctx).IDENT!=null?((Dec_s_paramlistContext)_localctx).IDENT.getText():null);
				                                                                                                        //Comprobamos que las variables se hayan declarado o no estetn repetidas:
				                                                                                                        comprobar((((Dec_s_paramlistContext)_localctx).IDENT!=null?((Dec_s_paramlistContext)_localctx).IDENT.getText():null));
				                                                                                                        if(!(((Dec_s_paramlistContext)_localctx).dec_s_paramlist.re).equals("")){
				                                                                                                            _localctx.re+=','+((Dec_s_paramlistContext)_localctx).dec_s_paramlist.re;
				                                                                                                        }
				                                                                                                        if(comprobacionPunteroFunc.get(_localctx.id) == null){
				                                                                                                            HashMap<String,String[]> x = new HashMap<String,String[]>();
				                                                                                                            comprobacionPunteroFunc.put(_localctx.id, x);
				                                                                                                        }
				                                                                                                        String[] valores = new String[2];
				                                                                                                        if(((Dec_s_paramlistContext)_localctx).tipoparam.c == "*"){
				                                                                                                              valores[1] = "puntero";
				                                                                                                              valores[0] = (((Dec_s_paramlistContext)_localctx).IDENT!=null?((Dec_s_paramlistContext)_localctx).IDENT.getText():null);
				                                                                                                              comprobacionPunteroFunc.get(_localctx.id).put((((Dec_s_paramlistContext)_localctx).IDENT!=null?((Dec_s_paramlistContext)_localctx).IDENT.getText():null), valores);
				                                                                                                        }else{
				                                                                                                        valores[1] = "no_puntero";
				                                                                                                        valores[0] = (((Dec_s_paramlistContext)_localctx).IDENT!=null?((Dec_s_paramlistContext)_localctx).IDENT.getText():null);
				                                                                                                              comprobacionPunteroFunc.get(_localctx.id).put((((Dec_s_paramlistContext)_localctx).IDENT!=null?((Dec_s_paramlistContext)_localctx).IDENT.getText():null), valores);
				                                                                                                        }

				                                                                                                        
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grupalVisitor ) return ((grupalVisitor<? extends T>)visitor).visitTipoparam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoparamContext tipoparam() throws RecognitionException {
		TipoparamContext _localctx = new TipoparamContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_tipoparam);
		try {
			setState(330);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				setState(324);
				match(T__15);
				((TipoparamContext)_localctx).c = "";
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
				setState(326);
				match(T__16);
				((TipoparamContext)_localctx).c = "*";
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 3);
				{
				setState(328);
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
		public String re;
		public Token id1;
		public TipoContext tipo;
		public Token id2;
		public Dec_f_paramlistContext dec_f_paramlist;
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grupalVisitor ) return ((grupalVisitor<? extends T>)visitor).visitDecfun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecfunContext decfun() throws RecognitionException {
		DecfunContext _localctx = new DecfunContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_decfun);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			match(T__18);
			setState(333);
			((DecfunContext)_localctx).id1 = match(IDENT);
			setState(334);
			match(T__11);
			setState(335);
			nomparamlist();
			setState(336);
			match(T__12);
			setState(337);
			((DecfunContext)_localctx).tipo = tipo();
			setState(338);
			match(T__6);
			setState(339);
			((DecfunContext)_localctx).id2 = match(IDENT);
			setState(340);
			match(T__1);
			setState(341);
			((DecfunContext)_localctx).dec_f_paramlist = dec_f_paramlist();
			setState(342);
			match(T__2);
			setState(343);
			match(T__18);
			setState(344);
			((DecfunContext)_localctx).id3 = match(IDENT);

			                                                                                                                                    //Por lo que sea, esta sentencia if falla
			                                                                                                                                    if(!((((DecfunContext)_localctx).id1!=null?((DecfunContext)_localctx).id1.getText():null)).equals((((DecfunContext)_localctx).id2!=null?((DecfunContext)_localctx).id2.getText():null))){
			                                                                                                                                        System.out.println("El nombre de la funcion "+(((DecfunContext)_localctx).id1!=null?((DecfunContext)_localctx).id1.getText():null)+" y el nombre asociado al tipo devuelto "+(((DecfunContext)_localctx).id2!=null?((DecfunContext)_localctx).id2.getText():null)+" no coinciden.");
			                                                                                                                                    }
			                                                                                                                                    else{
			                                                                                                                                        ((DecfunContext)_localctx).re = ((DecfunContext)_localctx).tipo.s+(((DecfunContext)_localctx).id1!=null?((DecfunContext)_localctx).id1.getText():null)+'('+((DecfunContext)_localctx).dec_f_paramlist.re+");\n";
			                                                                                                                                        //insertTxtC(_localctx.re);
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

	public static class Dec_f_paramlistContext extends ParserRuleContext {
		public String re;
		public TipoContext tipo;
		public Token IDENT;
		public Dec_f_paramlistContext dec_f_paramlist;
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(grupalParser.IDENT, 0); }
		public Dec_f_paramlistContext dec_f_paramlist() {
			return getRuleContext(Dec_f_paramlistContext.class,0);
		}
		public Dec_f_paramlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grupalVisitor ) return ((grupalVisitor<? extends T>)visitor).visitDec_f_paramlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dec_f_paramlistContext dec_f_paramlist() throws RecognitionException {
		Dec_f_paramlistContext _localctx = new Dec_f_paramlistContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_dec_f_paramlist);
		try {
			setState(359);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(347);
				((Dec_f_paramlistContext)_localctx).tipo = tipo();
				setState(348);
				match(T__4);
				setState(349);
				match(T__14);
				setState(350);
				match(T__11);
				setState(351);
				match(T__15);
				setState(352);
				match(T__12);
				setState(353);
				((Dec_f_paramlistContext)_localctx).IDENT = match(IDENT);
				setState(354);
				match(T__1);
				setState(355);
				((Dec_f_paramlistContext)_localctx).dec_f_paramlist = dec_f_paramlist();
				String corchetes="";
				                                                                                              String tipo=((Dec_f_paramlistContext)_localctx).tipo.s;
				                                                                                              if((((Dec_f_paramlistContext)_localctx).tipo.s).startsWith("char"))
				                                                                                                  corchetes="[]";
				                                                                                                  tipo="char ";
				                                                                                              ((Dec_f_paramlistContext)_localctx).re = tipo + (((Dec_f_paramlistContext)_localctx).IDENT!=null?((Dec_f_paramlistContext)_localctx).IDENT.getText():null)+corchetes;
				                                                                                              //Comprobamos que las variables se hayan declarado o no estetn repetidas:
				                                                                                              comprobar((((Dec_f_paramlistContext)_localctx).IDENT!=null?((Dec_f_paramlistContext)_localctx).IDENT.getText():null));
				                                                                                              if(!(((Dec_f_paramlistContext)_localctx).dec_f_paramlist.re).equals("")){
				                                                                                                  _localctx.re+=','+((Dec_f_paramlistContext)_localctx).dec_f_paramlist.re;
				                                                                                              }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grupalVisitor ) return ((grupalVisitor<? extends T>)visitor).visitSent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentContext sent() throws RecognitionException {
		SentContext _localctx = new SentContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_sent);
		try {
			setState(392);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(361);
				((SentContext)_localctx).IDENT = match(IDENT);
				setState(362);
				match(T__7);
				setState(363);
				((SentContext)_localctx).exp = exp();
				setState(364);
				match(T__1);
				((SentContext)_localctx).re =  (((SentContext)_localctx).IDENT!=null?((SentContext)_localctx).IDENT.getText():null) + " =" + ((SentContext)_localctx).exp.re + ";\n";
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 2);
				{
				setState(367);
				((SentContext)_localctx).proc_call = proc_call();
				setState(368);
				match(T__1);
				((SentContext)_localctx).re =  ((SentContext)_localctx).proc_call.s +";\n";
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 3);
				{
				setState(371);
				match(T__19);
				setState(372);
				match(T__11);
				setState(373);
				((SentContext)_localctx).expcond = expcond();
				setState(374);
				match(T__12);
				setState(375);
				((SentContext)_localctx).sentpp = sentpp();
				((SentContext)_localctx).re =  "if (" + ((SentContext)_localctx).expcond.s + ")" + ((SentContext)_localctx).sentpp.re; insertTxtC(_localctx.re);
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 4);
				{
				setState(378);
				match(T__20);
				setState(379);
				((SentContext)_localctx).sentppp = sentppp();
				((SentContext)_localctx).re =  "do {" + ((SentContext)_localctx).sentppp.re; insertTxtC(_localctx.re);
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 5);
				{
				setState(382);
				match(T__21);
				setState(383);
				match(T__22);
				setState(384);
				match(T__11);
				setState(385);
				((SentContext)_localctx).exp = exp();
				setState(386);
				match(T__12);
				setState(387);
				((SentContext)_localctx).casos = casos();
				setState(388);
				match(T__2);
				setState(389);
				match(T__21);
				((SentContext)_localctx).re = "switch (" + ((SentContext)_localctx).exp.re + "){\n" + ((SentContext)_localctx).casos.re + "\n}\n" ;  insertTxtC(_localctx.re);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grupalVisitor ) return ((grupalVisitor<? extends T>)visitor).visitSentp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentpContext sentp() throws RecognitionException {
		SentpContext _localctx = new SentpContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_sentp);
		try {
			setState(401);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__23:
				enterOuterAlt(_localctx, 1);
				{
				setState(394);
				match(T__23);
				((SentpContext)_localctx).re =  " }";
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 2);
				{
				setState(396);
				match(T__24);
				setState(397);
				((SentpContext)_localctx).sentlist = sentlist();
				setState(398);
				match(T__23);
				((SentpContext)_localctx).re =  "else {\n" +"\t\t" + ((SentpContext)_localctx).sentlist.re +"\n" +"}\n";
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grupalVisitor ) return ((grupalVisitor<? extends T>)visitor).visitSentpp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentppContext sentpp() throws RecognitionException {
		SentppContext _localctx = new SentppContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_sentpp);
		try {
			setState(411);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__25:
				enterOuterAlt(_localctx, 1);
				{
				setState(403);
				match(T__25);
				setState(404);
				((SentppContext)_localctx).sentlist = sentlist();
				setState(405);
				((SentppContext)_localctx).sentp = sentp();
				((SentppContext)_localctx).re =  "{" +"\n" +"\t"+ ((SentppContext)_localctx).sentlist.re + ((SentppContext)_localctx).sentp.re +"\n";
				}
				break;
			case T__19:
			case T__20:
			case T__21:
			case T__32:
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(408);
				((SentppContext)_localctx).sent = sent();
				((SentppContext)_localctx).re =  "{" + "\n"+((SentppContext)_localctx).sent.re + "\n}\n";
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grupalVisitor ) return ((grupalVisitor<? extends T>)visitor).visitSentppp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentpppContext sentppp() throws RecognitionException {
		SentpppContext _localctx = new SentpppContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_sentppp);
		try {
			setState(432);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__26:
				enterOuterAlt(_localctx, 1);
				{
				setState(413);
				match(T__26);
				setState(414);
				match(T__11);
				setState(415);
				expcond();
				setState(416);
				match(T__12);
				setState(417);
				((SentpppContext)_localctx).sentlist = sentlist();
				setState(418);
				match(T__27);
				((SentpppContext)_localctx).re =  "\n"+ "while (" + "expcond" + ");" +"\n" + ((SentpppContext)_localctx).sentlist.re;
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(421);
				((SentpppContext)_localctx).IDENT = match(IDENT);
				setState(422);
				match(T__7);
				setState(423);
				((SentpppContext)_localctx).val1 = doval();
				setState(424);
				match(T__4);
				setState(425);
				((SentpppContext)_localctx).val2 = doval();
				setState(426);
				match(T__4);
				setState(427);
				((SentpppContext)_localctx).val3 = doval();
				setState(428);
				((SentpppContext)_localctx).sentlist = sentlist();
				setState(429);
				match(T__27);
				((SentpppContext)_localctx).re =  (((SentpppContext)_localctx).IDENT!=null?((SentpppContext)_localctx).IDENT.getText():null) +" "+ ((SentpppContext)_localctx).val1.doVal+", " + ((SentpppContext)_localctx).val2.doVal+", " + ((SentpppContext)_localctx).val3.doVal +";" + "\n"+ "\t" + ((SentpppContext)_localctx).sentlist.re +"\n"+'}';
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grupalVisitor ) return ((grupalVisitor<? extends T>)visitor).visitExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
			((ExpContext)_localctx).factor = factor();
			setState(435);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grupalVisitor ) return ((grupalVisitor<? extends T>)visitor).visitExpp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExppContext expp() throws RecognitionException {
		ExppContext _localctx = new ExppContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_expp);
		try {
			setState(444);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(438);
				((ExppContext)_localctx).op = op();
				setState(439);
				((ExppContext)_localctx).exp = exp();
				setState(440);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grupalVisitor ) return ((grupalVisitor<? extends T>)visitor).visitOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpContext op() throws RecognitionException {
		OpContext _localctx = new OpContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_op);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grupalVisitor ) return ((grupalVisitor<? extends T>)visitor).visitOparit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OparitContext oparit() throws RecognitionException {
		OparitContext _localctx = new OparitContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_oparit);
		try {
			setState(457);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__28:
				enterOuterAlt(_localctx, 1);
				{
				setState(449);
				match(T__28);
				((OparitContext)_localctx).c = '+';
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 2);
				{
				setState(451);
				match(T__29);
				((OparitContext)_localctx).c = '-';
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 3);
				{
				setState(453);
				match(T__30);
				((OparitContext)_localctx).c = '*';
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 4);
				{
				setState(455);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grupalVisitor ) return ((grupalVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_factor);
		try {
			setState(471);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(459);
				((FactorContext)_localctx).IDENT = match(IDENT);
				setState(460);
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
				setState(463);
				((FactorContext)_localctx).simpvalue = simpvalue();
				((FactorContext)_localctx).re = ((FactorContext)_localctx).simpvalue.s;
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 3);
				{
				setState(466);
				match(T__11);
				setState(467);
				((FactorContext)_localctx).exp = exp();
				setState(468);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grupalVisitor ) return ((grupalVisitor<? extends T>)visitor).visitFactorp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorpContext factorp() throws RecognitionException {
		FactorpContext _localctx = new FactorpContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_factorp);
		try {
			setState(480);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(473);
				match(T__11);
				setState(474);
				((FactorpContext)_localctx).exp = exp();
				setState(475);
				((FactorpContext)_localctx).explist = explist();
				setState(476);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grupalVisitor ) return ((grupalVisitor<? extends T>)visitor).visitExplist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExplistContext explist() throws RecognitionException {
		ExplistContext _localctx = new ExplistContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_explist);
		try {
			setState(488);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(482);
				match(T__4);
				setState(483);
				((ExplistContext)_localctx).exp = exp();
				setState(484);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grupalVisitor ) return ((grupalVisitor<? extends T>)visitor).visitProc_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Proc_callContext proc_call() throws RecognitionException {
		Proc_callContext _localctx = new Proc_callContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_proc_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
			match(T__32);
			setState(491);
			((Proc_callContext)_localctx).IDENT = match(IDENT);
			setState(492);
			((Proc_callContext)_localctx).subpparamlist = subpparamlist();
			((Proc_callContext)_localctx).s =  (((Proc_callContext)_localctx).IDENT!=null?((Proc_callContext)_localctx).IDENT.getText():null) + " " + ((Proc_callContext)_localctx).subpparamlist.s ;
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grupalVisitor ) return ((grupalVisitor<? extends T>)visitor).visitSubpparamlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubpparamlistContext subpparamlist() throws RecognitionException {
		SubpparamlistContext _localctx = new SubpparamlistContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_subpparamlist);
		try {
			setState(502);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(495);
				match(T__11);
				setState(496);
				((SubpparamlistContext)_localctx).exp = exp();
				setState(497);
				((SubpparamlistContext)_localctx).explist = explist();
				setState(498);
				match(T__12);
				((SubpparamlistContext)_localctx).s =  "(" + ((SubpparamlistContext)_localctx).exp.re + ((SubpparamlistContext)_localctx).explist.re +")";
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				((SubpparamlistContext)_localctx).s = "";
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grupalVisitor ) return ((grupalVisitor<? extends T>)visitor).visitSubproglist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubproglistContext subproglist() throws RecognitionException {
		SubproglistContext _localctx = new SubproglistContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_subproglist);
		try {
			setState(513);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(504);
				((SubproglistContext)_localctx).codproc = codproc();
				setState(505);
				((SubproglistContext)_localctx).subproglist = subproglist();
				((SubproglistContext)_localctx).re =  ((SubproglistContext)_localctx).codproc.s + ((SubproglistContext)_localctx).subproglist.re;
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 2);
				{
				setState(508);
				((SubproglistContext)_localctx).codfun = codfun();
				setState(509);
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
		public Token IDENT;
		public Formal_paramlistContext formal_paramlist;
		public Dec_s_paramlistContext dec_s_paramlist;
		public DcllistContext dcllist;
		public SentContext sent;
		public SentlistContext sentlist;
		public List<TerminalNode> IDENT() { return getTokens(grupalParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(grupalParser.IDENT, i);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grupalVisitor ) return ((grupalVisitor<? extends T>)visitor).visitCodproc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodprocContext codproc() throws RecognitionException {
		CodprocContext _localctx = new CodprocContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_codproc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(515);
			match(T__13);
			setState(516);
			((CodprocContext)_localctx).IDENT = match(IDENT);
			setState(517);
			((CodprocContext)_localctx).formal_paramlist = formal_paramlist();
			setState(518);
			((CodprocContext)_localctx).dec_s_paramlist = dec_s_paramlist((((CodprocContext)_localctx).IDENT!=null?((CodprocContext)_localctx).IDENT.getText():null));
			setState(519);
			((CodprocContext)_localctx).dcllist = dcllist();
			setState(520);
			((CodprocContext)_localctx).sent = sent();
			setState(521);
			((CodprocContext)_localctx).sentlist = sentlist();
			setState(522);
			match(T__2);
			setState(523);
			match(T__13);
			setState(524);
			((CodprocContext)_localctx).IDENT = match(IDENT);

			    String t = "void " + (((CodprocContext)_localctx).IDENT!=null?((CodprocContext)_localctx).IDENT.getText():null);
			    if(((CodprocContext)_localctx).formal_paramlist.esVoid==1){
			      t +="(void)";}
			    else{
			      t += "("+((CodprocContext)_localctx).dec_s_paramlist.re+")";
			    }
			    t += "{\n"+ ((CodprocContext)_localctx).dcllist.s+ ((CodprocContext)_localctx).sent.re+ ((CodprocContext)_localctx).sentlist.re +"}\n";
			    ((CodprocContext)_localctx).s = t;
			    //insertTxtC(_localctx.s);

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
		public Token IDENT;
		public TipoContext tipo;
		public Dec_f_paramlistContext dec_f_paramlist;
		public DcllistContext dcllist;
		public SentContext sent;
		public SentlistContext sentlist;
		public List<TerminalNode> IDENT() { return getTokens(grupalParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(grupalParser.IDENT, i);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grupalVisitor ) return ((grupalVisitor<? extends T>)visitor).visitCodfun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodfunContext codfun() throws RecognitionException {
		CodfunContext _localctx = new CodfunContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_codfun);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(527);
			match(T__18);
			setState(528);
			((CodfunContext)_localctx).IDENT = match(IDENT);
			setState(529);
			match(T__11);
			setState(530);
			nomparamlist();
			setState(531);
			match(T__12);
			setState(532);
			((CodfunContext)_localctx).tipo = tipo();
			setState(533);
			match(T__6);
			setState(534);
			((CodfunContext)_localctx).IDENT = match(IDENT);
			setState(535);
			match(T__1);
			setState(536);
			((CodfunContext)_localctx).dec_f_paramlist = dec_f_paramlist();
			setState(537);
			((CodfunContext)_localctx).dcllist = dcllist();
			setState(538);
			((CodfunContext)_localctx).sent = sent();
			setState(539);
			((CodfunContext)_localctx).sentlist = sentlist();
			setState(540);
			((CodfunContext)_localctx).IDENT = match(IDENT);
			setState(541);
			match(T__7);
			setState(542);
			exp();
			setState(543);
			match(T__1);
			setState(544);
			match(T__2);
			setState(545);
			match(T__18);
			setState(546);
			((CodfunContext)_localctx).IDENT = match(IDENT);

			    ((CodfunContext)_localctx).s =  ((CodfunContext)_localctx).tipo.s + (((CodfunContext)_localctx).IDENT!=null?((CodfunContext)_localctx).IDENT.getText():null) + "("+((CodfunContext)_localctx).dec_f_paramlist.re+")" +"{\n" + ((CodfunContext)_localctx).dcllist.s+ ((CodfunContext)_localctx).sent.re+ ((CodfunContext)_localctx).sentlist.re + "}\n";
			    //insertTxtC(_localctx.s);

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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grupalVisitor ) return ((grupalVisitor<? extends T>)visitor).visitExpcond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpcondContext expcond() throws RecognitionException {
		ExpcondContext _localctx = new ExpcondContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_expcond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(549);
			((ExpcondContext)_localctx).factorcond = factorcond();
			setState(550);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grupalVisitor ) return ((grupalVisitor<? extends T>)visitor).visitExpcondp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpcondpContext expcondp() throws RecognitionException {
		ExpcondpContext _localctx = new ExpcondpContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_expcondp);
		try {
			setState(559);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(553);
				((ExpcondpContext)_localctx).oplog = oplog();
				setState(554);
				((ExpcondpContext)_localctx).expcond = expcond();
				setState(555);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grupalVisitor ) return ((grupalVisitor<? extends T>)visitor).visitOplog(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OplogContext oplog() throws RecognitionException {
		OplogContext _localctx = new OplogContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_oplog);
		try {
			setState(569);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__33:
				enterOuterAlt(_localctx, 1);
				{
				setState(561);
				match(T__33);
				((OplogContext)_localctx).s = "||";
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 2);
				{
				setState(563);
				match(T__34);
				((OplogContext)_localctx).s = "&&";
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 3);
				{
				setState(565);
				match(T__35);
				((OplogContext)_localctx).s = "!^";
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 4);
				{
				setState(567);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grupalVisitor ) return ((grupalVisitor<? extends T>)visitor).visitFactorcond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorcondContext factorcond() throws RecognitionException {
		FactorcondContext _localctx = new FactorcondContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_factorcond);
		try {
			setState(589);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(571);
				match(T__11);
				setState(572);
				((FactorcondContext)_localctx).expcond = expcond();
				setState(573);
				match(T__12);
				((FactorcondContext)_localctx).s =  "("+((FactorcondContext)_localctx).expcond.s +")";
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(576);
				match(T__37);
				setState(577);
				((FactorcondContext)_localctx).factorcond = factorcond();
				((FactorcondContext)_localctx).s =  "!" + ((FactorcondContext)_localctx).factorcond.s;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(580);
				match(T__38);
				((FactorcondContext)_localctx).s = "1";
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(582);
				match(T__39);
				((FactorcondContext)_localctx).s = "0";
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(584);
				((FactorcondContext)_localctx).exp = exp();
				setState(585);
				((FactorcondContext)_localctx).opcomp = opcomp();
				setState(586);
				((FactorcondContext)_localctx).exp = exp();
				((FactorcondContext)_localctx).s =  ((FactorcondContext)_localctx).exp.re + ((FactorcondContext)_localctx).opcomp.s + ((FactorcondContext)_localctx).exp.re;
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grupalVisitor ) return ((grupalVisitor<? extends T>)visitor).visitOpcomp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpcompContext opcomp() throws RecognitionException {
		OpcompContext _localctx = new OpcompContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_opcomp);
		try {
			setState(603);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__40:
				enterOuterAlt(_localctx, 1);
				{
				setState(591);
				match(T__40);
				((OpcompContext)_localctx).s = "<";
				}
				break;
			case T__41:
				enterOuterAlt(_localctx, 2);
				{
				setState(593);
				match(T__41);
				((OpcompContext)_localctx).s = ">";
				}
				break;
			case T__42:
				enterOuterAlt(_localctx, 3);
				{
				setState(595);
				match(T__42);
				((OpcompContext)_localctx).s = "<=";
				}
				break;
			case T__43:
				enterOuterAlt(_localctx, 4);
				{
				setState(597);
				match(T__43);
				((OpcompContext)_localctx).s = ">=";
				}
				break;
			case T__44:
				enterOuterAlt(_localctx, 5);
				{
				setState(599);
				match(T__44);
				((OpcompContext)_localctx).s = "==";
				}
				break;
			case T__45:
				enterOuterAlt(_localctx, 6);
				{
				setState(601);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grupalVisitor ) return ((grupalVisitor<? extends T>)visitor).visitDoval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DovalContext doval() throws RecognitionException {
		DovalContext _localctx = new DovalContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_doval);
		try {
			setState(609);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM_INT_CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(605);
				((DovalContext)_localctx).NUM_INT_CONST = match(NUM_INT_CONST);
				((DovalContext)_localctx).doVal = (((DovalContext)_localctx).NUM_INT_CONST!=null?((DovalContext)_localctx).NUM_INT_CONST.getText():null);
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(607);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grupalVisitor ) return ((grupalVisitor<? extends T>)visitor).visitCasos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CasosContext casos() throws RecognitionException {
		CasosContext _localctx = new CasosContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_casos);
		try {
			setState(616);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__22:
				enterOuterAlt(_localctx, 1);
				{
				setState(611);
				match(T__22);
				setState(612);
				((CasosContext)_localctx).casosp = casosp();

				                                            if((((CasosContext)_localctx).casosp.re).startsWith("\t" + "default")){
				                                               _localctx.re+=((CasosContext)_localctx).casosp.re;
				                                            }
				                                            else{
				                                            ((CasosContext)_localctx).re = "\t" + "case " + ((CasosContext)_localctx).casosp.re;}
				                                            
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grupalVisitor ) return ((grupalVisitor<? extends T>)visitor).visitCasosp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CasospContext casosp() throws RecognitionException {
		CasospContext _localctx = new CasospContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_casosp);
		try {
			setState(629);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(618);
				match(T__11);
				setState(619);
				((CasospContext)_localctx).etiquetas = etiquetas();
				setState(620);
				match(T__12);
				setState(621);
				sentlist();
				setState(622);
				((CasospContext)_localctx).casos = casos();
				((CasospContext)_localctx).re = ((CasospContext)_localctx).etiquetas.re + ":\n" + "\t\t" + "SENTENCIAS_SENTLIST" + "\n\t\t" + "break;" + "\n" + ((CasospContext)_localctx).casos.re;
				}
				break;
			case T__46:
				enterOuterAlt(_localctx, 2);
				{
				setState(625);
				match(T__46);
				setState(626);
				sentlist();
				((CasospContext)_localctx).re =  "\t" + "default:" + "\n\t\t" + "SENTENCIAS_SENTLIST";
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grupalVisitor ) return ((grupalVisitor<? extends T>)visitor).visitEtiquetas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EtiquetasContext etiquetas() throws RecognitionException {
		EtiquetasContext _localctx = new EtiquetasContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_etiquetas);
		try {
			setState(639);
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
				setState(631);
				((EtiquetasContext)_localctx).simpvalue = simpvalue();
				setState(632);
				((EtiquetasContext)_localctx).etiquetaspp = etiquetaspp();
				((EtiquetasContext)_localctx).re = ((EtiquetasContext)_localctx).etiquetaspp.ant + ((EtiquetasContext)_localctx).simpvalue.s + ((EtiquetasContext)_localctx).etiquetaspp.re;
				}
				break;
			case T__47:
				enterOuterAlt(_localctx, 2);
				{
				setState(635);
				match(T__47);
				setState(636);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grupalVisitor ) return ((grupalVisitor<? extends T>)visitor).visitEtiquetasp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EtiquetaspContext etiquetasp() throws RecognitionException {
		EtiquetaspContext _localctx = new EtiquetaspContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_etiquetasp);
		try {
			setState(645);
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
				setState(641);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grupalVisitor ) return ((grupalVisitor<? extends T>)visitor).visitEtiquetaspp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EtiquetasppContext etiquetaspp() throws RecognitionException {
		EtiquetasppContext _localctx = new EtiquetasppContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_etiquetaspp);
		try {
			setState(654);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__47:
				enterOuterAlt(_localctx, 1);
				{
				setState(647);
				match(T__47);
				setState(648);
				((EtiquetasppContext)_localctx).etiquetasp = etiquetasp();
				((EtiquetasppContext)_localctx).re = ((EtiquetasppContext)_localctx).etiquetasp.re; ((EtiquetasppContext)_localctx).ant = ((EtiquetasppContext)_localctx).etiquetasp.ant;
				}
				break;
			case T__4:
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(651);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grupalVisitor ) return ((grupalVisitor<? extends T>)visitor).visitListaetiquetas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaetiquetasContext listaetiquetas() throws RecognitionException {
		ListaetiquetasContext _localctx = new ListaetiquetasContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_listaetiquetas);
		try {
			setState(661);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(656);
				match(T__4);
				setState(657);
				((ListaetiquetasContext)_localctx).simpvalue = simpvalue();
				((ListaetiquetasContext)_localctx).re = ":\n" + "\t" + "case " + ((ListaetiquetasContext)_localctx).simpvalue.s;
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3=\u029a\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\3\2\6\2r\n\2\r\2\16\2s\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3"+
		"\5\3\5\5\5\u008b\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0094\n\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u009e\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\5\b\u00a9\n\b\3\t\3\t\3\t\3\t\3\t\5\t\u00b0\n\t\3\n\3\n\3\n\3\n\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\5\13\u00c8\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\5\f\u00d7\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00e1"+
		"\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16"+
		"\u00ef\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00f9\n\17\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0103\n\20\3\21\3\21\3\21"+
		"\3\21\3\21\5\21\u010a\n\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\23\5\23\u0116\n\23\3\24\3\24\3\24\3\24\3\24\5\24\u011d\n\24\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\5"+
		"\26\u012e\n\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\5\30\u0137\n\30\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0145\n\31"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u014d\n\32\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u016a\n\34\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\5\35\u018b\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u0194\n\36\3"+
		"\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u019e\n\37\3 \3 \3 \3 \3 "+
		"\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u01b3\n \3!\3!\3!\3!\3\""+
		"\3\"\3\"\3\"\3\"\3\"\5\"\u01bf\n\"\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\5"+
		"$\u01cc\n$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u01da\n%\3&\3&\3&\3"+
		"&\3&\3&\3&\5&\u01e3\n&\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u01eb\n\'\3(\3(\3("+
		"\3(\3(\3)\3)\3)\3)\3)\3)\3)\5)\u01f9\n)\3*\3*\3*\3*\3*\3*\3*\3*\3*\5*"+
		"\u0204\n*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,"+
		"\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3.\3.\3.\3.\3."+
		"\3.\5.\u0232\n.\3/\3/\3/\3/\3/\3/\3/\3/\5/\u023c\n/\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\5\60\u0250\n\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\5\61\u025e\n\61\3\62\3\62\3\62\3\62\5\62\u0264\n\62\3\63\3\63\3"+
		"\63\3\63\3\63\5\63\u026b\n\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\3\64\3\64\5\64\u0278\n\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\5\65\u0282\n\65\3\66\3\66\3\66\3\66\5\66\u0288\n\66\3\67\3\67\3\67\3"+
		"\67\3\67\3\67\3\67\5\67\u0291\n\67\38\38\38\38\38\58\u0298\n8\38\2\29"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFH"+
		"JLNPRTVXZ\\^`bdfhjln\2\3\4\2\63;==\2\u02a4\2q\3\2\2\2\4u\3\2\2\2\6\u0082"+
		"\3\2\2\2\b\u008a\3\2\2\2\n\u0093\3\2\2\2\f\u009d\3\2\2\2\16\u00a8\3\2"+
		"\2\2\20\u00af\3\2\2\2\22\u00b1\3\2\2\2\24\u00c7\3\2\2\2\26\u00d6\3\2\2"+
		"\2\30\u00e0\3\2\2\2\32\u00ee\3\2\2\2\34\u00f8\3\2\2\2\36\u0102\3\2\2\2"+
		" \u0109\3\2\2\2\"\u010b\3\2\2\2$\u0115\3\2\2\2&\u011c\3\2\2\2(\u011e\3"+
		"\2\2\2*\u012d\3\2\2\2,\u012f\3\2\2\2.\u0136\3\2\2\2\60\u0144\3\2\2\2\62"+
		"\u014c\3\2\2\2\64\u014e\3\2\2\2\66\u0169\3\2\2\28\u018a\3\2\2\2:\u0193"+
		"\3\2\2\2<\u019d\3\2\2\2>\u01b2\3\2\2\2@\u01b4\3\2\2\2B\u01be\3\2\2\2D"+
		"\u01c0\3\2\2\2F\u01cb\3\2\2\2H\u01d9\3\2\2\2J\u01e2\3\2\2\2L\u01ea\3\2"+
		"\2\2N\u01ec\3\2\2\2P\u01f8\3\2\2\2R\u0203\3\2\2\2T\u0205\3\2\2\2V\u0211"+
		"\3\2\2\2X\u0227\3\2\2\2Z\u0231\3\2\2\2\\\u023b\3\2\2\2^\u024f\3\2\2\2"+
		"`\u025d\3\2\2\2b\u0263\3\2\2\2d\u026a\3\2\2\2f\u0277\3\2\2\2h\u0281\3"+
		"\2\2\2j\u0287\3\2\2\2l\u0290\3\2\2\2n\u0297\3\2\2\2pr\t\2\2\2qp\3\2\2"+
		"\2rs\3\2\2\2sq\3\2\2\2st\3\2\2\2t\3\3\2\2\2uv\7\3\2\2vw\7\64\2\2wx\7\4"+
		"\2\2xy\5\6\4\2yz\5\n\6\2z{\58\35\2{|\5\20\t\2|}\7\5\2\2}~\7\3\2\2~\177"+
		"\7\64\2\2\177\u0080\5R*\2\u0080\u0081\b\3\1\2\u0081\5\3\2\2\2\u0082\u0083"+
		"\5\b\5\2\u0083\u0084\b\4\1\2\u0084\7\3\2\2\2\u0085\u0086\5\22\n\2\u0086"+
		"\u0087\5\b\5\2\u0087\u0088\b\5\1\2\u0088\u008b\3\2\2\2\u0089\u008b\b\5"+
		"\1\2\u008a\u0085\3\2\2\2\u008a\u0089\3\2\2\2\u008b\t\3\2\2\2\u008c\u008d"+
		"\7\6\2\2\u008d\u008e\5\f\7\2\u008e\u008f\7\5\2\2\u008f\u0090\7\6\2\2\u0090"+
		"\u0091\b\6\1\2\u0091\u0094\3\2\2\2\u0092\u0094\b\6\1\2\u0093\u008c\3\2"+
		"\2\2\u0093\u0092\3\2\2\2\u0094\13\3\2\2\2\u0095\u0096\5(\25\2\u0096\u0097"+
		"\5\16\b\2\u0097\u0098\b\7\1\2\u0098\u009e\3\2\2\2\u0099\u009a\5\64\33"+
		"\2\u009a\u009b\5\16\b\2\u009b\u009c\b\7\1\2\u009c\u009e\3\2\2\2\u009d"+
		"\u0095\3\2\2\2\u009d\u0099\3\2\2\2\u009e\r\3\2\2\2\u009f\u00a0\5(\25\2"+
		"\u00a0\u00a1\5\16\b\2\u00a1\u00a2\b\b\1\2\u00a2\u00a9\3\2\2\2\u00a3\u00a4"+
		"\5\64\33\2\u00a4\u00a5\5\16\b\2\u00a5\u00a6\b\b\1\2\u00a6\u00a9\3\2\2"+
		"\2\u00a7\u00a9\b\b\1\2\u00a8\u009f\3\2\2\2\u00a8\u00a3\3\2\2\2\u00a8\u00a7"+
		"\3\2\2\2\u00a9\17\3\2\2\2\u00aa\u00ab\58\35\2\u00ab\u00ac\5\20\t\2\u00ac"+
		"\u00ad\b\t\1\2\u00ad\u00b0\3\2\2\2\u00ae\u00b0\b\t\1\2\u00af\u00aa\3\2"+
		"\2\2\u00af\u00ae\3\2\2\2\u00b0\21\3\2\2\2\u00b1\u00b2\5\36\20\2\u00b2"+
		"\u00b3\5\24\13\2\u00b3\u00b4\b\n\1\2\u00b4\23\3\2\2\2\u00b5\u00b6\7\7"+
		"\2\2\u00b6\u00b7\7\b\2\2\u00b7\u00b8\7\t\2\2\u00b8\u00b9\7\64\2\2\u00b9"+
		"\u00ba\7\n\2\2\u00ba\u00bb\5\32\16\2\u00bb\u00bc\5\30\r\2\u00bc\u00bd"+
		"\7\4\2\2\u00bd\u00be\5\26\f\2\u00be\u00bf\b\13\1\2\u00bf\u00c8\3\2\2\2"+
		"\u00c0\u00c1\7\t\2\2\u00c1\u00c2\5\"\22\2\u00c2\u00c3\7\4\2\2\u00c3\u00c4"+
		"\5\34\17\2\u00c4\u00c5\b\13\1\2\u00c5\u00c8\3\2\2\2\u00c6\u00c8\b\13\1"+
		"\2\u00c7\u00b5\3\2\2\2\u00c7\u00c0\3\2\2\2\u00c7\u00c6\3\2\2\2\u00c8\25"+
		"\3\2\2\2\u00c9\u00ca\5\36\20\2\u00ca\u00cb\7\7\2\2\u00cb\u00cc\7\b\2\2"+
		"\u00cc\u00cd\7\t\2\2\u00cd\u00ce\7\64\2\2\u00ce\u00cf\7\n\2\2\u00cf\u00d0"+
		"\5\32\16\2\u00d0\u00d1\5\30\r\2\u00d1\u00d2\7\4\2\2\u00d2\u00d3\5\26\f"+
		"\2\u00d3\u00d4\b\f\1\2\u00d4\u00d7\3\2\2\2\u00d5\u00d7\b\f\1\2\u00d6\u00c9"+
		"\3\2\2\2\u00d6\u00d5\3\2\2\2\u00d7\27\3\2\2\2\u00d8\u00d9\7\7\2\2\u00d9"+
		"\u00da\7\64\2\2\u00da\u00db\7\n\2\2\u00db\u00dc\5\32\16\2\u00dc\u00dd"+
		"\5\30\r\2\u00dd\u00de\b\r\1\2\u00de\u00e1\3\2\2\2\u00df\u00e1\b\r\1\2"+
		"\u00e0\u00d8\3\2\2\2\u00e0\u00df\3\2\2\2\u00e1\31\3\2\2\2\u00e2\u00e3"+
		"\7\66\2\2\u00e3\u00ef\b\16\1\2\u00e4\u00e5\7\67\2\2\u00e5\u00ef\b\16\1"+
		"\2\u00e6\u00e7\7;\2\2\u00e7\u00ef\b\16\1\2\u00e8\u00e9\78\2\2\u00e9\u00ef"+
		"\b\16\1\2\u00ea\u00eb\79\2\2\u00eb\u00ef\b\16\1\2\u00ec\u00ed\7:\2\2\u00ed"+
		"\u00ef\b\16\1\2\u00ee\u00e2\3\2\2\2\u00ee\u00e4\3\2\2\2\u00ee\u00e6\3"+
		"\2\2\2\u00ee\u00e8\3\2\2\2\u00ee\u00ea\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef"+
		"\33\3\2\2\2\u00f0\u00f1\5\36\20\2\u00f1\u00f2\7\t\2\2\u00f2\u00f3\5\""+
		"\22\2\u00f3\u00f4\7\4\2\2\u00f4\u00f5\5\34\17\2\u00f5\u00f6\b\17\1\2\u00f6"+
		"\u00f9\3\2\2\2\u00f7\u00f9\b\17\1\2\u00f8\u00f0\3\2\2\2\u00f8\u00f7\3"+
		"\2\2\2\u00f9\35\3\2\2\2\u00fa\u00fb\7\13\2\2\u00fb\u0103\b\20\1\2\u00fc"+
		"\u00fd\7\f\2\2\u00fd\u0103\b\20\1\2\u00fe\u00ff\7\r\2\2\u00ff\u0100\5"+
		" \21\2\u0100\u0101\b\20\1\2\u0101\u0103\3\2\2\2\u0102\u00fa\3\2\2\2\u0102"+
		"\u00fc\3\2\2\2\u0102\u00fe\3\2\2\2\u0103\37\3\2\2\2\u0104\u0105\7\16\2"+
		"\2\u0105\u0106\7\66\2\2\u0106\u0107\7\17\2\2\u0107\u010a\b\21\1\2\u0108"+
		"\u010a\b\21\1\2\u0109\u0104\3\2\2\2\u0109\u0108\3\2\2\2\u010a!\3\2\2\2"+
		"\u010b\u010c\7\64\2\2\u010c\u010d\5&\24\2\u010d\u010e\5$\23\2\u010e\u010f"+
		"\b\22\1\2\u010f#\3\2\2\2\u0110\u0111\7\7\2\2\u0111\u0112\5\"\22\2\u0112"+
		"\u0113\b\23\1\2\u0113\u0116\3\2\2\2\u0114\u0116\b\23\1\2\u0115\u0110\3"+
		"\2\2\2\u0115\u0114\3\2\2\2\u0116%\3\2\2\2\u0117\u0118\7\n\2\2\u0118\u0119"+
		"\5\32\16\2\u0119\u011a\b\24\1\2\u011a\u011d\3\2\2\2\u011b\u011d\b\24\1"+
		"\2\u011c\u0117\3\2\2\2\u011c\u011b\3\2\2\2\u011d\'\3\2\2\2\u011e\u011f"+
		"\7\20\2\2\u011f\u0120\7\64\2\2\u0120\u0121\5*\26\2\u0121\u0122\5\60\31"+
		"\2\u0122\u0123\7\5\2\2\u0123\u0124\7\20\2\2\u0124\u0125\7\64\2\2\u0125"+
		"\u0126\b\25\1\2\u0126)\3\2\2\2\u0127\u0128\7\16\2\2\u0128\u0129\5,\27"+
		"\2\u0129\u012a\7\17\2\2\u012a\u012b\b\26\1\2\u012b\u012e\3\2\2\2\u012c"+
		"\u012e\b\26\1\2\u012d\u0127\3\2\2\2\u012d\u012c\3\2\2\2\u012e+\3\2\2\2"+
		"\u012f\u0130\7\64\2\2\u0130\u0131\5.\30\2\u0131\u0132\b\27\1\2\u0132-"+
		"\3\2\2\2\u0133\u0134\7\7\2\2\u0134\u0137\5,\27\2\u0135\u0137\3\2\2\2\u0136"+
		"\u0133\3\2\2\2\u0136\u0135\3\2\2\2\u0137/\3\2\2\2\u0138\u0139\5\36\20"+
		"\2\u0139\u013a\7\7\2\2\u013a\u013b\7\21\2\2\u013b\u013c\7\16\2\2\u013c"+
		"\u013d\5\62\32\2\u013d\u013e\7\17\2\2\u013e\u013f\7\64\2\2\u013f\u0140"+
		"\7\4\2\2\u0140\u0141\5\60\31\2\u0141\u0142\b\31\1\2\u0142\u0145\3\2\2"+
		"\2\u0143\u0145\b\31\1\2\u0144\u0138\3\2\2\2\u0144\u0143\3\2\2\2\u0145"+
		"\61\3\2\2\2\u0146\u0147\7\22\2\2\u0147\u014d\b\32\1\2\u0148\u0149\7\23"+
		"\2\2\u0149\u014d\b\32\1\2\u014a\u014b\7\24\2\2\u014b\u014d\b\32\1\2\u014c"+
		"\u0146\3\2\2\2\u014c\u0148\3\2\2\2\u014c\u014a\3\2\2\2\u014d\63\3\2\2"+
		"\2\u014e\u014f\7\25\2\2\u014f\u0150\7\64\2\2\u0150\u0151\7\16\2\2\u0151"+
		"\u0152\5,\27\2\u0152\u0153\7\17\2\2\u0153\u0154\5\36\20\2\u0154\u0155"+
		"\7\t\2\2\u0155\u0156\7\64\2\2\u0156\u0157\7\4\2\2\u0157\u0158\5\66\34"+
		"\2\u0158\u0159\7\5\2\2\u0159\u015a\7\25\2\2\u015a\u015b\7\64\2\2\u015b"+
		"\u015c\b\33\1\2\u015c\65\3\2\2\2\u015d\u015e\5\36\20\2\u015e\u015f\7\7"+
		"\2\2\u015f\u0160\7\21\2\2\u0160\u0161\7\16\2\2\u0161\u0162\7\22\2\2\u0162"+
		"\u0163\7\17\2\2\u0163\u0164\7\64\2\2\u0164\u0165\7\4\2\2\u0165\u0166\5"+
		"\66\34\2\u0166\u0167\b\34\1\2\u0167\u016a\3\2\2\2\u0168\u016a\b\34\1\2"+
		"\u0169\u015d\3\2\2\2\u0169\u0168\3\2\2\2\u016a\67\3\2\2\2\u016b\u016c"+
		"\7\64\2\2\u016c\u016d\7\n\2\2\u016d\u016e\5@!\2\u016e\u016f\7\4\2\2\u016f"+
		"\u0170\b\35\1\2\u0170\u018b\3\2\2\2\u0171\u0172\5N(\2\u0172\u0173\7\4"+
		"\2\2\u0173\u0174\b\35\1\2\u0174\u018b\3\2\2\2\u0175\u0176\7\26\2\2\u0176"+
		"\u0177\7\16\2\2\u0177\u0178\5X-\2\u0178\u0179\7\17\2\2\u0179\u017a\5<"+
		"\37\2\u017a\u017b\b\35\1\2\u017b\u018b\3\2\2\2\u017c\u017d\7\27\2\2\u017d"+
		"\u017e\5> \2\u017e\u017f\b\35\1\2\u017f\u018b\3\2\2\2\u0180\u0181\7\30"+
		"\2\2\u0181\u0182\7\31\2\2\u0182\u0183\7\16\2\2\u0183\u0184\5@!\2\u0184"+
		"\u0185\7\17\2\2\u0185\u0186\5d\63\2\u0186\u0187\7\5\2\2\u0187\u0188\7"+
		"\30\2\2\u0188\u0189\b\35\1\2\u0189\u018b\3\2\2\2\u018a\u016b\3\2\2\2\u018a"+
		"\u0171\3\2\2\2\u018a\u0175\3\2\2\2\u018a\u017c\3\2\2\2\u018a\u0180\3\2"+
		"\2\2\u018b9\3\2\2\2\u018c\u018d\7\32\2\2\u018d\u0194\b\36\1\2\u018e\u018f"+
		"\7\33\2\2\u018f\u0190\5\20\t\2\u0190\u0191\7\32\2\2\u0191\u0192\b\36\1"+
		"\2\u0192\u0194\3\2\2\2\u0193\u018c\3\2\2\2\u0193\u018e\3\2\2\2\u0194;"+
		"\3\2\2\2\u0195\u0196\7\34\2\2\u0196\u0197\5\20\t\2\u0197\u0198\5:\36\2"+
		"\u0198\u0199\b\37\1\2\u0199\u019e\3\2\2\2\u019a\u019b\58\35\2\u019b\u019c"+
		"\b\37\1\2\u019c\u019e\3\2\2\2\u019d\u0195\3\2\2\2\u019d\u019a\3\2\2\2"+
		"\u019e=\3\2\2\2\u019f\u01a0\7\35\2\2\u01a0\u01a1\7\16\2\2\u01a1\u01a2"+
		"\5X-\2\u01a2\u01a3\7\17\2\2\u01a3\u01a4\5\20\t\2\u01a4\u01a5\7\36\2\2"+
		"\u01a5\u01a6\b \1\2\u01a6\u01b3\3\2\2\2\u01a7\u01a8\7\64\2\2\u01a8\u01a9"+
		"\7\n\2\2\u01a9\u01aa\5b\62\2\u01aa\u01ab\7\7\2\2\u01ab\u01ac\5b\62\2\u01ac"+
		"\u01ad\7\7\2\2\u01ad\u01ae\5b\62\2\u01ae\u01af\5\20\t\2\u01af\u01b0\7"+
		"\36\2\2\u01b0\u01b1\b \1\2\u01b1\u01b3\3\2\2\2\u01b2\u019f\3\2\2\2\u01b2"+
		"\u01a7\3\2\2\2\u01b3?\3\2\2\2\u01b4\u01b5\5H%\2\u01b5\u01b6\5B\"\2\u01b6"+
		"\u01b7\b!\1\2\u01b7A\3\2\2\2\u01b8\u01b9\5D#\2\u01b9\u01ba\5@!\2\u01ba"+
		"\u01bb\5B\"\2\u01bb\u01bc\b\"\1\2\u01bc\u01bf\3\2\2\2\u01bd\u01bf\b\""+
		"\1\2\u01be\u01b8\3\2\2\2\u01be\u01bd\3\2\2\2\u01bfC\3\2\2\2\u01c0\u01c1"+
		"\5F$\2\u01c1\u01c2\b#\1\2\u01c2E\3\2\2\2\u01c3\u01c4\7\37\2\2\u01c4\u01cc"+
		"\b$\1\2\u01c5\u01c6\7 \2\2\u01c6\u01cc\b$\1\2\u01c7\u01c8\7!\2\2\u01c8"+
		"\u01cc\b$\1\2\u01c9\u01ca\7\"\2\2\u01ca\u01cc\b$\1\2\u01cb\u01c3\3\2\2"+
		"\2\u01cb\u01c5\3\2\2\2\u01cb\u01c7\3\2\2\2\u01cb\u01c9\3\2\2\2\u01ccG"+
		"\3\2\2\2\u01cd\u01ce\7\64\2\2\u01ce\u01cf\5J&\2\u01cf\u01d0\b%\1\2\u01d0"+
		"\u01da\3\2\2\2\u01d1\u01d2\5\32\16\2\u01d2\u01d3\b%\1\2\u01d3\u01da\3"+
		"\2\2\2\u01d4\u01d5\7\16\2\2\u01d5\u01d6\5@!\2\u01d6\u01d7\7\17\2\2\u01d7"+
		"\u01d8\b%\1\2\u01d8\u01da\3\2\2\2\u01d9\u01cd\3\2\2\2\u01d9\u01d1\3\2"+
		"\2\2\u01d9\u01d4\3\2\2\2\u01daI\3\2\2\2\u01db\u01dc\7\16\2\2\u01dc\u01dd"+
		"\5@!\2\u01dd\u01de\5L\'\2\u01de\u01df\7\17\2\2\u01df\u01e0\b&\1\2\u01e0"+
		"\u01e3\3\2\2\2\u01e1\u01e3\b&\1\2\u01e2\u01db\3\2\2\2\u01e2\u01e1\3\2"+
		"\2\2\u01e3K\3\2\2\2\u01e4\u01e5\7\7\2\2\u01e5\u01e6\5@!\2\u01e6\u01e7"+
		"\5L\'\2\u01e7\u01e8\b\'\1\2\u01e8\u01eb\3\2\2\2\u01e9\u01eb\b\'\1\2\u01ea"+
		"\u01e4\3\2\2\2\u01ea\u01e9\3\2\2\2\u01ebM\3\2\2\2\u01ec\u01ed\7#\2\2\u01ed"+
		"\u01ee\7\64\2\2\u01ee\u01ef\5P)\2\u01ef\u01f0\b(\1\2\u01f0O\3\2\2\2\u01f1"+
		"\u01f2\7\16\2\2\u01f2\u01f3\5@!\2\u01f3\u01f4\5L\'\2\u01f4\u01f5\7\17"+
		"\2\2\u01f5\u01f6\b)\1\2\u01f6\u01f9\3\2\2\2\u01f7\u01f9\b)\1\2\u01f8\u01f1"+
		"\3\2\2\2\u01f8\u01f7\3\2\2\2\u01f9Q\3\2\2\2\u01fa\u01fb\5T+\2\u01fb\u01fc"+
		"\5R*\2\u01fc\u01fd\b*\1\2\u01fd\u0204\3\2\2\2\u01fe\u01ff\5V,\2\u01ff"+
		"\u0200\5R*\2\u0200\u0201\b*\1\2\u0201\u0204\3\2\2\2\u0202\u0204\b*\1\2"+
		"\u0203\u01fa\3\2\2\2\u0203\u01fe\3\2\2\2\u0203\u0202\3\2\2\2\u0204S\3"+
		"\2\2\2\u0205\u0206\7\20\2\2\u0206\u0207\7\64\2\2\u0207\u0208\5*\26\2\u0208"+
		"\u0209\5\60\31\2\u0209\u020a\5\6\4\2\u020a\u020b\58\35\2\u020b\u020c\5"+
		"\20\t\2\u020c\u020d\7\5\2\2\u020d\u020e\7\20\2\2\u020e\u020f\7\64\2\2"+
		"\u020f\u0210\b+\1\2\u0210U\3\2\2\2\u0211\u0212\7\25\2\2\u0212\u0213\7"+
		"\64\2\2\u0213\u0214\7\16\2\2\u0214\u0215\5,\27\2\u0215\u0216\7\17\2\2"+
		"\u0216\u0217\5\36\20\2\u0217\u0218\7\t\2\2\u0218\u0219\7\64\2\2\u0219"+
		"\u021a\7\4\2\2\u021a\u021b\5\66\34\2\u021b\u021c\5\6\4\2\u021c\u021d\5"+
		"8\35\2\u021d\u021e\5\20\t\2\u021e\u021f\7\64\2\2\u021f\u0220\7\n\2\2\u0220"+
		"\u0221\5@!\2\u0221\u0222\7\4\2\2\u0222\u0223\7\5\2\2\u0223\u0224\7\25"+
		"\2\2\u0224\u0225\7\64\2\2\u0225\u0226\b,\1\2\u0226W\3\2\2\2\u0227\u0228"+
		"\5^\60\2\u0228\u0229\5Z.\2\u0229\u022a\b-\1\2\u022aY\3\2\2\2\u022b\u022c"+
		"\5\\/\2\u022c\u022d\5X-\2\u022d\u022e\5Z.\2\u022e\u022f\b.\1\2\u022f\u0232"+
		"\3\2\2\2\u0230\u0232\b.\1\2\u0231\u022b\3\2\2\2\u0231\u0230\3\2\2\2\u0232"+
		"[\3\2\2\2\u0233\u0234\7$\2\2\u0234\u023c\b/\1\2\u0235\u0236\7%\2\2\u0236"+
		"\u023c\b/\1\2\u0237\u0238\7&\2\2\u0238\u023c\b/\1\2\u0239\u023a\7\'\2"+
		"\2\u023a\u023c\b/\1\2\u023b\u0233\3\2\2\2\u023b\u0235\3\2\2\2\u023b\u0237"+
		"\3\2\2\2\u023b\u0239\3\2\2\2\u023c]\3\2\2\2\u023d\u023e\7\16\2\2\u023e"+
		"\u023f\5X-\2\u023f\u0240\7\17\2\2\u0240\u0241\b\60\1\2\u0241\u0250\3\2"+
		"\2\2\u0242\u0243\7(\2\2\u0243\u0244\5^\60\2\u0244\u0245\b\60\1\2\u0245"+
		"\u0250\3\2\2\2\u0246\u0247\7)\2\2\u0247\u0250\b\60\1\2\u0248\u0249\7*"+
		"\2\2\u0249\u0250\b\60\1\2\u024a\u024b\5@!\2\u024b\u024c\5`\61\2\u024c"+
		"\u024d\5@!\2\u024d\u024e\b\60\1\2\u024e\u0250\3\2\2\2\u024f\u023d\3\2"+
		"\2\2\u024f\u0242\3\2\2\2\u024f\u0246\3\2\2\2\u024f\u0248\3\2\2\2\u024f"+
		"\u024a\3\2\2\2\u0250_\3\2\2\2\u0251\u0252\7+\2\2\u0252\u025e\b\61\1\2"+
		"\u0253\u0254\7,\2\2\u0254\u025e\b\61\1\2\u0255\u0256\7-\2\2\u0256\u025e"+
		"\b\61\1\2\u0257\u0258\7.\2\2\u0258\u025e\b\61\1\2\u0259\u025a\7/\2\2\u025a"+
		"\u025e\b\61\1\2\u025b\u025c\7\60\2\2\u025c\u025e\b\61\1\2\u025d\u0251"+
		"\3\2\2\2\u025d\u0253\3\2\2\2\u025d\u0255\3\2\2\2\u025d\u0257\3\2\2\2\u025d"+
		"\u0259\3\2\2\2\u025d\u025b\3\2\2\2\u025ea\3\2\2\2\u025f\u0260\7\66\2\2"+
		"\u0260\u0264\b\62\1\2\u0261\u0262\7\64\2\2\u0262\u0264\b\62\1\2\u0263"+
		"\u025f\3\2\2\2\u0263\u0261\3\2\2\2\u0264c\3\2\2\2\u0265\u0266\7\31\2\2"+
		"\u0266\u0267\5f\64\2\u0267\u0268\b\63\1\2\u0268\u026b\3\2\2\2\u0269\u026b"+
		"\b\63\1\2\u026a\u0265\3\2\2\2\u026a\u0269\3\2\2\2\u026be\3\2\2\2\u026c"+
		"\u026d\7\16\2\2\u026d\u026e\5h\65\2\u026e\u026f\7\17\2\2\u026f\u0270\5"+
		"\20\t\2\u0270\u0271\5d\63\2\u0271\u0272\b\64\1\2\u0272\u0278\3\2\2\2\u0273"+
		"\u0274\7\61\2\2\u0274\u0275\5\20\t\2\u0275\u0276\b\64\1\2\u0276\u0278"+
		"\3\2\2\2\u0277\u026c\3\2\2\2\u0277\u0273\3\2\2\2\u0278g\3\2\2\2\u0279"+
		"\u027a\5\32\16\2\u027a\u027b\5l\67\2\u027b\u027c\b\65\1\2\u027c\u0282"+
		"\3\2\2\2\u027d\u027e\7\62\2\2\u027e\u027f\5\32\16\2\u027f\u0280\b\65\1"+
		"\2\u0280\u0282\3\2\2\2\u0281\u0279\3\2\2\2\u0281\u027d\3\2\2\2\u0282i"+
		"\3\2\2\2\u0283\u0284\5\32\16\2\u0284\u0285\b\66\1\2\u0285\u0288\3\2\2"+
		"\2\u0286\u0288\b\66\1\2\u0287\u0283\3\2\2\2\u0287\u0286\3\2\2\2\u0288"+
		"k\3\2\2\2\u0289\u028a\7\62\2\2\u028a\u028b\5j\66\2\u028b\u028c\b\67\1"+
		"\2\u028c\u0291\3\2\2\2\u028d\u028e\5n8\2\u028e\u028f\b\67\1\2\u028f\u0291"+
		"\3\2\2\2\u0290\u0289\3\2\2\2\u0290\u028d\3\2\2\2\u0291m\3\2\2\2\u0292"+
		"\u0293\7\7\2\2\u0293\u0294\5\32\16\2\u0294\u0295\b8\1\2\u0295\u0298\3"+
		"\2\2\2\u0296\u0298\b8\1\2\u0297\u0292\3\2\2\2\u0297\u0296\3\2\2\2\u0298"+
		"o\3\2\2\2,s\u008a\u0093\u009d\u00a8\u00af\u00c7\u00d6\u00e0\u00ee\u00f8"+
		"\u0102\u0109\u0115\u011c\u012d\u0136\u0144\u014c\u0169\u018a\u0193\u019d"+
		"\u01b2\u01be\u01cb\u01d9\u01e2\u01ea\u01f8\u0203\u0231\u023b\u024f\u025d"+
		"\u0263\u026a\u0277\u0281\u0287\u0290\u0297";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}