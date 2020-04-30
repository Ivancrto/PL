// Generated from grupal.g4 by ANTLR 4.7.2

    import java.io.FileWriter;
    import java.io.File;
    import java.io.IOException;
    import java.util.HashMap;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link grupalParser}.
 */
public interface grupalListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link grupalParser#prg}.
	 * @param ctx the parse tree
	 */
	void enterPrg(grupalParser.PrgContext ctx);
	/**
	 * Exit a parse tree produced by {@link grupalParser#prg}.
	 * @param ctx the parse tree
	 */
	void exitPrg(grupalParser.PrgContext ctx);
	/**
	 * Enter a parse tree produced by {@link grupalParser#dcllist}.
	 * @param ctx the parse tree
	 */
	void enterDcllist(grupalParser.DcllistContext ctx);
	/**
	 * Exit a parse tree produced by {@link grupalParser#dcllist}.
	 * @param ctx the parse tree
	 */
	void exitDcllist(grupalParser.DcllistContext ctx);
	/**
	 * Enter a parse tree produced by {@link grupalParser#dcllistp}.
	 * @param ctx the parse tree
	 */
	void enterDcllistp(grupalParser.DcllistpContext ctx);
	/**
	 * Exit a parse tree produced by {@link grupalParser#dcllistp}.
	 * @param ctx the parse tree
	 */
	void exitDcllistp(grupalParser.DcllistpContext ctx);
	/**
	 * Enter a parse tree produced by {@link grupalParser#cabecera}.
	 * @param ctx the parse tree
	 */
	void enterCabecera(grupalParser.CabeceraContext ctx);
	/**
	 * Exit a parse tree produced by {@link grupalParser#cabecera}.
	 * @param ctx the parse tree
	 */
	void exitCabecera(grupalParser.CabeceraContext ctx);
	/**
	 * Enter a parse tree produced by {@link grupalParser#cablist}.
	 * @param ctx the parse tree
	 */
	void enterCablist(grupalParser.CablistContext ctx);
	/**
	 * Exit a parse tree produced by {@link grupalParser#cablist}.
	 * @param ctx the parse tree
	 */
	void exitCablist(grupalParser.CablistContext ctx);
	/**
	 * Enter a parse tree produced by {@link grupalParser#decsubprog}.
	 * @param ctx the parse tree
	 */
	void enterDecsubprog(grupalParser.DecsubprogContext ctx);
	/**
	 * Exit a parse tree produced by {@link grupalParser#decsubprog}.
	 * @param ctx the parse tree
	 */
	void exitDecsubprog(grupalParser.DecsubprogContext ctx);
	/**
	 * Enter a parse tree produced by {@link grupalParser#sentlist}.
	 * @param ctx the parse tree
	 */
	void enterSentlist(grupalParser.SentlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link grupalParser#sentlist}.
	 * @param ctx the parse tree
	 */
	void exitSentlist(grupalParser.SentlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link grupalParser#dcl}.
	 * @param ctx the parse tree
	 */
	void enterDcl(grupalParser.DclContext ctx);
	/**
	 * Exit a parse tree produced by {@link grupalParser#dcl}.
	 * @param ctx the parse tree
	 */
	void exitDcl(grupalParser.DclContext ctx);
	/**
	 * Enter a parse tree produced by {@link grupalParser#dclp}.
	 * @param ctx the parse tree
	 */
	void enterDclp(grupalParser.DclpContext ctx);
	/**
	 * Exit a parse tree produced by {@link grupalParser#dclp}.
	 * @param ctx the parse tree
	 */
	void exitDclp(grupalParser.DclpContext ctx);
	/**
	 * Enter a parse tree produced by {@link grupalParser#defcte}.
	 * @param ctx the parse tree
	 */
	void enterDefcte(grupalParser.DefcteContext ctx);
	/**
	 * Exit a parse tree produced by {@link grupalParser#defcte}.
	 * @param ctx the parse tree
	 */
	void exitDefcte(grupalParser.DefcteContext ctx);
	/**
	 * Enter a parse tree produced by {@link grupalParser#ctelist}.
	 * @param ctx the parse tree
	 */
	void enterCtelist(grupalParser.CtelistContext ctx);
	/**
	 * Exit a parse tree produced by {@link grupalParser#ctelist}.
	 * @param ctx the parse tree
	 */
	void exitCtelist(grupalParser.CtelistContext ctx);
	/**
	 * Enter a parse tree produced by {@link grupalParser#simpvalue}.
	 * @param ctx the parse tree
	 */
	void enterSimpvalue(grupalParser.SimpvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link grupalParser#simpvalue}.
	 * @param ctx the parse tree
	 */
	void exitSimpvalue(grupalParser.SimpvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link grupalParser#defvar}.
	 * @param ctx the parse tree
	 */
	void enterDefvar(grupalParser.DefvarContext ctx);
	/**
	 * Exit a parse tree produced by {@link grupalParser#defvar}.
	 * @param ctx the parse tree
	 */
	void exitDefvar(grupalParser.DefvarContext ctx);
	/**
	 * Enter a parse tree produced by {@link grupalParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(grupalParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link grupalParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(grupalParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link grupalParser#charlength}.
	 * @param ctx the parse tree
	 */
	void enterCharlength(grupalParser.CharlengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link grupalParser#charlength}.
	 * @param ctx the parse tree
	 */
	void exitCharlength(grupalParser.CharlengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link grupalParser#varlist}.
	 * @param ctx the parse tree
	 */
	void enterVarlist(grupalParser.VarlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link grupalParser#varlist}.
	 * @param ctx the parse tree
	 */
	void exitVarlist(grupalParser.VarlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link grupalParser#varlistp}.
	 * @param ctx the parse tree
	 */
	void enterVarlistp(grupalParser.VarlistpContext ctx);
	/**
	 * Exit a parse tree produced by {@link grupalParser#varlistp}.
	 * @param ctx the parse tree
	 */
	void exitVarlistp(grupalParser.VarlistpContext ctx);
	/**
	 * Enter a parse tree produced by {@link grupalParser#init}.
	 * @param ctx the parse tree
	 */
	void enterInit(grupalParser.InitContext ctx);
	/**
	 * Exit a parse tree produced by {@link grupalParser#init}.
	 * @param ctx the parse tree
	 */
	void exitInit(grupalParser.InitContext ctx);
	/**
	 * Enter a parse tree produced by {@link grupalParser#decproc}.
	 * @param ctx the parse tree
	 */
	void enterDecproc(grupalParser.DecprocContext ctx);
	/**
	 * Exit a parse tree produced by {@link grupalParser#decproc}.
	 * @param ctx the parse tree
	 */
	void exitDecproc(grupalParser.DecprocContext ctx);
	/**
	 * Enter a parse tree produced by {@link grupalParser#formal_paramlist}.
	 * @param ctx the parse tree
	 */
	void enterFormal_paramlist(grupalParser.Formal_paramlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link grupalParser#formal_paramlist}.
	 * @param ctx the parse tree
	 */
	void exitFormal_paramlist(grupalParser.Formal_paramlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link grupalParser#nomparamlist}.
	 * @param ctx the parse tree
	 */
	void enterNomparamlist(grupalParser.NomparamlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link grupalParser#nomparamlist}.
	 * @param ctx the parse tree
	 */
	void exitNomparamlist(grupalParser.NomparamlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link grupalParser#nomparamlistp}.
	 * @param ctx the parse tree
	 */
	void enterNomparamlistp(grupalParser.NomparamlistpContext ctx);
	/**
	 * Exit a parse tree produced by {@link grupalParser#nomparamlistp}.
	 * @param ctx the parse tree
	 */
	void exitNomparamlistp(grupalParser.NomparamlistpContext ctx);
	/**
	 * Enter a parse tree produced by {@link grupalParser#dec_s_paramlist}.
	 * @param ctx the parse tree
	 */
	void enterDec_s_paramlist(grupalParser.Dec_s_paramlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link grupalParser#dec_s_paramlist}.
	 * @param ctx the parse tree
	 */
	void exitDec_s_paramlist(grupalParser.Dec_s_paramlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link grupalParser#tipoparam}.
	 * @param ctx the parse tree
	 */
	void enterTipoparam(grupalParser.TipoparamContext ctx);
	/**
	 * Exit a parse tree produced by {@link grupalParser#tipoparam}.
	 * @param ctx the parse tree
	 */
	void exitTipoparam(grupalParser.TipoparamContext ctx);
	/**
	 * Enter a parse tree produced by {@link grupalParser#decfun}.
	 * @param ctx the parse tree
	 */
	void enterDecfun(grupalParser.DecfunContext ctx);
	/**
	 * Exit a parse tree produced by {@link grupalParser#decfun}.
	 * @param ctx the parse tree
	 */
	void exitDecfun(grupalParser.DecfunContext ctx);
	/**
	 * Enter a parse tree produced by {@link grupalParser#dec_f_paramlist}.
	 * @param ctx the parse tree
	 */
	void enterDec_f_paramlist(grupalParser.Dec_f_paramlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link grupalParser#dec_f_paramlist}.
	 * @param ctx the parse tree
	 */
	void exitDec_f_paramlist(grupalParser.Dec_f_paramlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link grupalParser#sent}.
	 * @param ctx the parse tree
	 */
	void enterSent(grupalParser.SentContext ctx);
	/**
	 * Exit a parse tree produced by {@link grupalParser#sent}.
	 * @param ctx the parse tree
	 */
	void exitSent(grupalParser.SentContext ctx);
	/**
	 * Enter a parse tree produced by {@link grupalParser#sentp}.
	 * @param ctx the parse tree
	 */
	void enterSentp(grupalParser.SentpContext ctx);
	/**
	 * Exit a parse tree produced by {@link grupalParser#sentp}.
	 * @param ctx the parse tree
	 */
	void exitSentp(grupalParser.SentpContext ctx);
	/**
	 * Enter a parse tree produced by {@link grupalParser#sentpp}.
	 * @param ctx the parse tree
	 */
	void enterSentpp(grupalParser.SentppContext ctx);
	/**
	 * Exit a parse tree produced by {@link grupalParser#sentpp}.
	 * @param ctx the parse tree
	 */
	void exitSentpp(grupalParser.SentppContext ctx);
	/**
	 * Enter a parse tree produced by {@link grupalParser#sentppp}.
	 * @param ctx the parse tree
	 */
	void enterSentppp(grupalParser.SentpppContext ctx);
	/**
	 * Exit a parse tree produced by {@link grupalParser#sentppp}.
	 * @param ctx the parse tree
	 */
	void exitSentppp(grupalParser.SentpppContext ctx);
	/**
	 * Enter a parse tree produced by {@link grupalParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(grupalParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link grupalParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(grupalParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link grupalParser#expp}.
	 * @param ctx the parse tree
	 */
	void enterExpp(grupalParser.ExppContext ctx);
	/**
	 * Exit a parse tree produced by {@link grupalParser#expp}.
	 * @param ctx the parse tree
	 */
	void exitExpp(grupalParser.ExppContext ctx);
	/**
	 * Enter a parse tree produced by {@link grupalParser#op}.
	 * @param ctx the parse tree
	 */
	void enterOp(grupalParser.OpContext ctx);
	/**
	 * Exit a parse tree produced by {@link grupalParser#op}.
	 * @param ctx the parse tree
	 */
	void exitOp(grupalParser.OpContext ctx);
	/**
	 * Enter a parse tree produced by {@link grupalParser#oparit}.
	 * @param ctx the parse tree
	 */
	void enterOparit(grupalParser.OparitContext ctx);
	/**
	 * Exit a parse tree produced by {@link grupalParser#oparit}.
	 * @param ctx the parse tree
	 */
	void exitOparit(grupalParser.OparitContext ctx);
	/**
	 * Enter a parse tree produced by {@link grupalParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(grupalParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link grupalParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(grupalParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link grupalParser#factorp}.
	 * @param ctx the parse tree
	 */
	void enterFactorp(grupalParser.FactorpContext ctx);
	/**
	 * Exit a parse tree produced by {@link grupalParser#factorp}.
	 * @param ctx the parse tree
	 */
	void exitFactorp(grupalParser.FactorpContext ctx);
	/**
	 * Enter a parse tree produced by {@link grupalParser#explist}.
	 * @param ctx the parse tree
	 */
	void enterExplist(grupalParser.ExplistContext ctx);
	/**
	 * Exit a parse tree produced by {@link grupalParser#explist}.
	 * @param ctx the parse tree
	 */
	void exitExplist(grupalParser.ExplistContext ctx);
	/**
	 * Enter a parse tree produced by {@link grupalParser#proc_call}.
	 * @param ctx the parse tree
	 */
	void enterProc_call(grupalParser.Proc_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link grupalParser#proc_call}.
	 * @param ctx the parse tree
	 */
	void exitProc_call(grupalParser.Proc_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link grupalParser#subpparamlist}.
	 * @param ctx the parse tree
	 */
	void enterSubpparamlist(grupalParser.SubpparamlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link grupalParser#subpparamlist}.
	 * @param ctx the parse tree
	 */
	void exitSubpparamlist(grupalParser.SubpparamlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link grupalParser#subproglist}.
	 * @param ctx the parse tree
	 */
	void enterSubproglist(grupalParser.SubproglistContext ctx);
	/**
	 * Exit a parse tree produced by {@link grupalParser#subproglist}.
	 * @param ctx the parse tree
	 */
	void exitSubproglist(grupalParser.SubproglistContext ctx);
	/**
	 * Enter a parse tree produced by {@link grupalParser#codproc}.
	 * @param ctx the parse tree
	 */
	void enterCodproc(grupalParser.CodprocContext ctx);
	/**
	 * Exit a parse tree produced by {@link grupalParser#codproc}.
	 * @param ctx the parse tree
	 */
	void exitCodproc(grupalParser.CodprocContext ctx);
	/**
	 * Enter a parse tree produced by {@link grupalParser#codfun}.
	 * @param ctx the parse tree
	 */
	void enterCodfun(grupalParser.CodfunContext ctx);
	/**
	 * Exit a parse tree produced by {@link grupalParser#codfun}.
	 * @param ctx the parse tree
	 */
	void exitCodfun(grupalParser.CodfunContext ctx);
	/**
	 * Enter a parse tree produced by {@link grupalParser#expcond}.
	 * @param ctx the parse tree
	 */
	void enterExpcond(grupalParser.ExpcondContext ctx);
	/**
	 * Exit a parse tree produced by {@link grupalParser#expcond}.
	 * @param ctx the parse tree
	 */
	void exitExpcond(grupalParser.ExpcondContext ctx);
	/**
	 * Enter a parse tree produced by {@link grupalParser#expcondp}.
	 * @param ctx the parse tree
	 */
	void enterExpcondp(grupalParser.ExpcondpContext ctx);
	/**
	 * Exit a parse tree produced by {@link grupalParser#expcondp}.
	 * @param ctx the parse tree
	 */
	void exitExpcondp(grupalParser.ExpcondpContext ctx);
	/**
	 * Enter a parse tree produced by {@link grupalParser#oplog}.
	 * @param ctx the parse tree
	 */
	void enterOplog(grupalParser.OplogContext ctx);
	/**
	 * Exit a parse tree produced by {@link grupalParser#oplog}.
	 * @param ctx the parse tree
	 */
	void exitOplog(grupalParser.OplogContext ctx);
	/**
	 * Enter a parse tree produced by {@link grupalParser#factorcond}.
	 * @param ctx the parse tree
	 */
	void enterFactorcond(grupalParser.FactorcondContext ctx);
	/**
	 * Exit a parse tree produced by {@link grupalParser#factorcond}.
	 * @param ctx the parse tree
	 */
	void exitFactorcond(grupalParser.FactorcondContext ctx);
	/**
	 * Enter a parse tree produced by {@link grupalParser#opcomp}.
	 * @param ctx the parse tree
	 */
	void enterOpcomp(grupalParser.OpcompContext ctx);
	/**
	 * Exit a parse tree produced by {@link grupalParser#opcomp}.
	 * @param ctx the parse tree
	 */
	void exitOpcomp(grupalParser.OpcompContext ctx);
	/**
	 * Enter a parse tree produced by {@link grupalParser#doval}.
	 * @param ctx the parse tree
	 */
	void enterDoval(grupalParser.DovalContext ctx);
	/**
	 * Exit a parse tree produced by {@link grupalParser#doval}.
	 * @param ctx the parse tree
	 */
	void exitDoval(grupalParser.DovalContext ctx);
	/**
	 * Enter a parse tree produced by {@link grupalParser#casos}.
	 * @param ctx the parse tree
	 */
	void enterCasos(grupalParser.CasosContext ctx);
	/**
	 * Exit a parse tree produced by {@link grupalParser#casos}.
	 * @param ctx the parse tree
	 */
	void exitCasos(grupalParser.CasosContext ctx);
	/**
	 * Enter a parse tree produced by {@link grupalParser#casosp}.
	 * @param ctx the parse tree
	 */
	void enterCasosp(grupalParser.CasospContext ctx);
	/**
	 * Exit a parse tree produced by {@link grupalParser#casosp}.
	 * @param ctx the parse tree
	 */
	void exitCasosp(grupalParser.CasospContext ctx);
	/**
	 * Enter a parse tree produced by {@link grupalParser#etiquetas}.
	 * @param ctx the parse tree
	 */
	void enterEtiquetas(grupalParser.EtiquetasContext ctx);
	/**
	 * Exit a parse tree produced by {@link grupalParser#etiquetas}.
	 * @param ctx the parse tree
	 */
	void exitEtiquetas(grupalParser.EtiquetasContext ctx);
	/**
	 * Enter a parse tree produced by {@link grupalParser#etiquetasp}.
	 * @param ctx the parse tree
	 */
	void enterEtiquetasp(grupalParser.EtiquetaspContext ctx);
	/**
	 * Exit a parse tree produced by {@link grupalParser#etiquetasp}.
	 * @param ctx the parse tree
	 */
	void exitEtiquetasp(grupalParser.EtiquetaspContext ctx);
	/**
	 * Enter a parse tree produced by {@link grupalParser#etiquetaspp}.
	 * @param ctx the parse tree
	 */
	void enterEtiquetaspp(grupalParser.EtiquetasppContext ctx);
	/**
	 * Exit a parse tree produced by {@link grupalParser#etiquetaspp}.
	 * @param ctx the parse tree
	 */
	void exitEtiquetaspp(grupalParser.EtiquetasppContext ctx);
	/**
	 * Enter a parse tree produced by {@link grupalParser#listaetiquetas}.
	 * @param ctx the parse tree
	 */
	void enterListaetiquetas(grupalParser.ListaetiquetasContext ctx);
	/**
	 * Exit a parse tree produced by {@link grupalParser#listaetiquetas}.
	 * @param ctx the parse tree
	 */
	void exitListaetiquetas(grupalParser.ListaetiquetasContext ctx);
}