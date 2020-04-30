// Generated from C:/Users/Ivanxrto/Downloads/practicaGrupalPL/src\grupal.g4 by ANTLR 4.8

    import java.io.FileWriter;
    import java.io.File;
    import java.io.IOException;
    import java.util.HashMap;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link grupalParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface grupalVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link grupalParser#r}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitR(grupalParser.RContext ctx);
	/**
	 * Visit a parse tree produced by {@link grupalParser#prg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrg(grupalParser.PrgContext ctx);
	/**
	 * Visit a parse tree produced by {@link grupalParser#dcllist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDcllist(grupalParser.DcllistContext ctx);
	/**
	 * Visit a parse tree produced by {@link grupalParser#dcllistp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDcllistp(grupalParser.DcllistpContext ctx);
	/**
	 * Visit a parse tree produced by {@link grupalParser#cabecera}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCabecera(grupalParser.CabeceraContext ctx);
	/**
	 * Visit a parse tree produced by {@link grupalParser#cablist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCablist(grupalParser.CablistContext ctx);
	/**
	 * Visit a parse tree produced by {@link grupalParser#decsubprog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecsubprog(grupalParser.DecsubprogContext ctx);
	/**
	 * Visit a parse tree produced by {@link grupalParser#sentlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentlist(grupalParser.SentlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link grupalParser#dcl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDcl(grupalParser.DclContext ctx);
	/**
	 * Visit a parse tree produced by {@link grupalParser#dclp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDclp(grupalParser.DclpContext ctx);
	/**
	 * Visit a parse tree produced by {@link grupalParser#defcte}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefcte(grupalParser.DefcteContext ctx);
	/**
	 * Visit a parse tree produced by {@link grupalParser#ctelist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCtelist(grupalParser.CtelistContext ctx);
	/**
	 * Visit a parse tree produced by {@link grupalParser#simpvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpvalue(grupalParser.SimpvalueContext ctx);
	/**
	 * Visit a parse tree produced by {@link grupalParser#defvar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefvar(grupalParser.DefvarContext ctx);
	/**
	 * Visit a parse tree produced by {@link grupalParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(grupalParser.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link grupalParser#charlength}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharlength(grupalParser.CharlengthContext ctx);
	/**
	 * Visit a parse tree produced by {@link grupalParser#varlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarlist(grupalParser.VarlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link grupalParser#varlistp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarlistp(grupalParser.VarlistpContext ctx);
	/**
	 * Visit a parse tree produced by {@link grupalParser#init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit(grupalParser.InitContext ctx);
	/**
	 * Visit a parse tree produced by {@link grupalParser#decproc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecproc(grupalParser.DecprocContext ctx);
	/**
	 * Visit a parse tree produced by {@link grupalParser#formal_paramlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormal_paramlist(grupalParser.Formal_paramlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link grupalParser#nomparamlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNomparamlist(grupalParser.NomparamlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link grupalParser#nomparamlistp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNomparamlistp(grupalParser.NomparamlistpContext ctx);
	/**
	 * Visit a parse tree produced by {@link grupalParser#dec_s_paramlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDec_s_paramlist(grupalParser.Dec_s_paramlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link grupalParser#tipoparam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipoparam(grupalParser.TipoparamContext ctx);
	/**
	 * Visit a parse tree produced by {@link grupalParser#decfun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecfun(grupalParser.DecfunContext ctx);
	/**
	 * Visit a parse tree produced by {@link grupalParser#dec_f_paramlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDec_f_paramlist(grupalParser.Dec_f_paramlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link grupalParser#sent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSent(grupalParser.SentContext ctx);
	/**
	 * Visit a parse tree produced by {@link grupalParser#sentp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentp(grupalParser.SentpContext ctx);
	/**
	 * Visit a parse tree produced by {@link grupalParser#sentpp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentpp(grupalParser.SentppContext ctx);
	/**
	 * Visit a parse tree produced by {@link grupalParser#sentppp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentppp(grupalParser.SentpppContext ctx);
	/**
	 * Visit a parse tree produced by {@link grupalParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(grupalParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link grupalParser#expp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpp(grupalParser.ExppContext ctx);
	/**
	 * Visit a parse tree produced by {@link grupalParser#op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp(grupalParser.OpContext ctx);
	/**
	 * Visit a parse tree produced by {@link grupalParser#oparit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOparit(grupalParser.OparitContext ctx);
	/**
	 * Visit a parse tree produced by {@link grupalParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(grupalParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link grupalParser#factorp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactorp(grupalParser.FactorpContext ctx);
	/**
	 * Visit a parse tree produced by {@link grupalParser#explist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplist(grupalParser.ExplistContext ctx);
	/**
	 * Visit a parse tree produced by {@link grupalParser#proc_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProc_call(grupalParser.Proc_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link grupalParser#subpparamlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubpparamlist(grupalParser.SubpparamlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link grupalParser#subproglist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubproglist(grupalParser.SubproglistContext ctx);
	/**
	 * Visit a parse tree produced by {@link grupalParser#codproc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodproc(grupalParser.CodprocContext ctx);
	/**
	 * Visit a parse tree produced by {@link grupalParser#codfun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodfun(grupalParser.CodfunContext ctx);
	/**
	 * Visit a parse tree produced by {@link grupalParser#expcond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpcond(grupalParser.ExpcondContext ctx);
	/**
	 * Visit a parse tree produced by {@link grupalParser#expcondp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpcondp(grupalParser.ExpcondpContext ctx);
	/**
	 * Visit a parse tree produced by {@link grupalParser#oplog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOplog(grupalParser.OplogContext ctx);
	/**
	 * Visit a parse tree produced by {@link grupalParser#factorcond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactorcond(grupalParser.FactorcondContext ctx);
	/**
	 * Visit a parse tree produced by {@link grupalParser#opcomp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpcomp(grupalParser.OpcompContext ctx);
	/**
	 * Visit a parse tree produced by {@link grupalParser#doval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoval(grupalParser.DovalContext ctx);
	/**
	 * Visit a parse tree produced by {@link grupalParser#casos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCasos(grupalParser.CasosContext ctx);
	/**
	 * Visit a parse tree produced by {@link grupalParser#casosp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCasosp(grupalParser.CasospContext ctx);
	/**
	 * Visit a parse tree produced by {@link grupalParser#etiquetas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEtiquetas(grupalParser.EtiquetasContext ctx);
	/**
	 * Visit a parse tree produced by {@link grupalParser#etiquetasp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEtiquetasp(grupalParser.EtiquetaspContext ctx);
	/**
	 * Visit a parse tree produced by {@link grupalParser#etiquetaspp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEtiquetaspp(grupalParser.EtiquetasppContext ctx);
	/**
	 * Visit a parse tree produced by {@link grupalParser#listaetiquetas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaetiquetas(grupalParser.ListaetiquetasContext ctx);
}