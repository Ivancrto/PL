
// java -jar antlr-4.7.2-complete.jar grupal.g4

grammar grupal;

@parser::header {
    import java.io.FileWriter;
    import java.io.File;
    import java.io.IOException;
    import java.util.HashMap;
}
@lexer::header {
    import java.io.FileWriter;
    import java.io.File;
    import java.io.IOException;
    import java.util.HashMap;
}

@members {

    ClasesTraduccion.Creador creador = new ClasesTraduccion.Creador();

}



//ELEMENTOS ENTRECOMILLADOS

ENTRECOMILLADOS: '"'.*?'"' ;


//-------------------------------------------ELEMENTOS ENTRECOMILLADOS

//IDENTIFICADORES
IDENT:VOCAB(VOCAB|'_'|NUM)* ;

fragment
VOCAB:[a-zA-Z];

fragment
NUM:[0-9];
//----------------------------------------------------IDENTIFICADORES

//COMENTARIOS


COMMENT: ('!'.*?[\n])+ -> skip;
//----------------------------------------------------COMENTARIOS
NUM_INT_CONST :  ('-')? [0-9]+ ; //'NUM_INT_CONST' (' ')*
NUM_REAL_CONST : ('-')?  ([0-9]+ ('E'|'e') ('-')? [0-9]+   |  [0-9]+(.)[0-9]+ |  [0-9]+ (.)[0-9]+ ('E'|'e')('-')?[0-9]+);
NUM_INT_CONST_B: ('b\'')('0'|'1')+'\'' ;
NUM_INT_CONST_O: ('o\'')([0-7])+'\'';
NUM_INT_CONST_H: ('z\'')([0-9]|[A-F])+'\'' ;


STRING_CONST:((('\'')([a-zA-Z]+|[0-9]+|' '|'\'\''|'"')+('\'') | ('"')([a-zA-Z]+|[0-9]+|' '|'""'|'\'')+('"')) (' + ')?)+ ;
WS : [ \r\t\n] -> skip;

ERRORES: . ;

//GRAMATICA: SINTÁCTICO + TRADUCCIÓN DIRIGIDA POR LA SINTAXIS
prg: 'PROGRAM' IDENT ';' dcllist cabecera sent sentlist 'END' 'PROGRAM' IDENT subproglist {
    creador.getPrincipal().addPrincipal($dcllist.s , $sent.re , $sentlist.re);
     creador.crear();

};

dcllist returns[String s]: dcllistp {$s = $dcllistp.re ;};
dcllistp returns[String re]: dcl dcllistp {$re = $dcl.re + $dcllistp.re ;}| {$re="";};
cabecera returns[String re]: 'INTERFACE' cablist 'END' 'INTERFACE' {$re=$cablist.re;}| {$re="";};

cablist returns[String re]: decproc decsubprog | decfun decsubprog ;

decsubprog returns[String re]: decproc decsubprog {}| decfun decsubprog {}| {$re="";};
sentlist returns [String re]: sent sentlist {$re =$sent.re+ $sentlist.re;}| {$re="";};

//#DEFINE
dcl  returns[String re]: tipo dclp [$tipo.t]  {$re=$dclp.re;};
dclp [String h] returns[String re=""]: ',' 'PARAMETER' '::' IDENT '=' simpvalue ctelist ';' defcte {
                                            creador.getConstantes().addConstante($IDENT.text+ " " +$simpvalue.s +" "+$ctelist.re);
                                        } //es de tipo define
                                        | '::' varlist[""] ';' defvar {$re= $h +  " " + $varlist.s + ";\n" + $defvar.re + "";}| {$re="";}; //NO ES de tipo define
defcte  returns[String re]: tipo ',' 'PARAMETER' '::' IDENT '=' simpvalue ctelist ';' defcte  {
                        $re= "";
                        creador.getConstantes().addConstante($IDENT.text, $simpvalue.s);
                        }
                       | {$re="";} ;

ctelist returns[String re]: ',' IDENT '=' simpvalue ctelist {$re=','+$IDENT.text+ " " +$simpvalue.s+$ctelist.re;}| {$re="";} ;
simpvalue returns[String s]: NUM_INT_CONST {$s= $NUM_INT_CONST.text;}| NUM_REAL_CONST {$s= $NUM_REAL_CONST.text;}| STRING_CONST {$s= creador.strConstComillas($STRING_CONST.text);}
                |NUM_INT_CONST_B {$s= "0b" + $NUM_INT_CONST_B.text.substring(2,$NUM_INT_CONST_B.text.length()-1)  ;} | NUM_INT_CONST_O {$s= "0o" + $NUM_INT_CONST_O.text.substring(2,$NUM_INT_CONST_O.text.length()-1)  ;}| NUM_INT_CONST_H {$s= "0x" + $NUM_INT_CONST_H.text.substring(2,$NUM_INT_CONST_H.text.length()-1)  ;};
defvar returns [String re]: tipo '::' varlist[$tipo.cl] ';' defvar {$re = $tipo.t + $varlist.s + ";\n" + $defvar.re;} | {$re="";} ;
tipo returns[String t, String cl]: 'INTEGER' {$t="int "; $cl="";}| 'REAL' {$t="float "; $cl="";}| 'CHARACTER' charlength {$t= "char "; $cl=$charlength.s;};
charlength returns[String s]: '(' NUM_INT_CONST ')' {$s='['+ $NUM_INT_CONST.text +"] ";}| {$s="";};
varlist [String cl] returns [String s]: IDENT init varlistp[$cl]{$s = $IDENT.text+ $cl + $init.s + $varlistp.s;  creador.getPrincipal().insertarVariable($IDENT.text);};
varlistp [String cl]returns [String s]: ',' varlist[$cl] {$s= ", " + $varlist.s;}| {$s="";};
init returns [String s]: '=' simpvalue {$s= " = " + $simpvalue.s;}| {$s= "";};


decproc: 'SUBROUTINE' id1=IDENT {creador.getCabecera().addSub($id1.text); } formal_paramlist[$id1.text,1] dec_s_paramlist[$id1.text,1] 'END' 'SUBROUTINE' id2=IDENT {creador.getCabecera().compruebaCabSub($id1.text,$id2.text,$id1.getLine(),  $id1.getCharPositionInLine()); };

formal_paramlist[String id, int declaration] returns [int esVoid, String re]:'(' nomparamlist[$id,$declaration] ')'{  $esVoid=0; $re = $nomparamlist.re;}| {$esVoid=1; $re=""; };

nomparamlist[String id, int declaration] returns[String re]: IDENT nomparamlistp[$id,$declaration]  {
    if($declaration==1){   //Se trata de una declaracion de cabecera en la interfaz
        creador.getCabecera().addArgSubFun($id,$IDENT.text);
        $re = "";
    }
    else{   //Implementacion
        creador.getFunciones().comprobacionArgumentos($id,$IDENT.text,creador.getCabecera(),$IDENT.getLine(),  $IDENT.getCharPositionInLine());
        $re = $IDENT.text + " " + $nomparamlistp.re;
    }
};
nomparamlistp[String id, int declaration] returns[String re]: ',' nomparamlist[$id,$declaration]  {$re = $nomparamlist.re;}| {$re = "";};

dec_s_paramlist [String id, int declaration] returns[String re]: tipo ',' 'INTENT' '(' tipoparam ')' IDENT ';' {
    if($declaration==1){
        creador.getCabecera().addArgValuesSub($id,$tipo.t, $tipoparam.c,$IDENT.text, $IDENT.getLine(),  $IDENT.getCharPositionInLine());
    }else{
        $re = $IDENT.text + " ";
     }
    }  dec_s_paramlist[$id, $declaration]  {$re += $dec_s_paramlist.re;} |{$re="";} ;
tipoparam returns [String c]: 'IN' {$c="";}| 'OUT' {$c="*";}| 'INOUT'{$c="*";};


decfun: 'FUNCTION' id1=IDENT {creador.getCabecera().addFun($id1.text);}'(' nomparamlist[$id1.text,1] ')' tipo '::' id2=IDENT ';' dec_f_paramlist[$id1.text] 'END' 'FUNCTION' id3=IDENT {creador.getCabecera().addTipoFun($id1.text,$tipo.t,$id3.text, $id2.text,$id1.getLine(),  $id1.getCharPositionInLine());};
dec_f_paramlist[String id] returns[String re]: tipo ',' 'INTENT' '(' 'IN' ')' IDENT ';' {creador.getCabecera().addArgValuesFun($id,$tipo.t,$IDENT.text,$IDENT.getLine(),  $IDENT.getCharPositionInLine());} dec_f_paramlist[$id] {$re = $IDENT.text + " "+$dec_f_paramlist.re;}  |{$re="";} ;


sent returns [String re]: IDENT '=' exp ';' {$re =  $IDENT.text + " = " + $exp.re + ";\n";}
                | proc_call ';' {$re =  $proc_call.s +";\n";}| 'IF' '(' expcond ')' sentpp {$re = "if (" + $expcond.s + ")" + ($sentpp.re);
                //insertTxtC($re);
                }
                | 'DO' sentppp {$re = $sentppp.re; // "do {" +
                //insertTxtC($re);
                }
                |'SELECT' 'CASE' '(' exp ')' casos 'END' 'SELECT' {$re="switch (" + $exp.re + "){\n" + $casos.re + "\n}\n" ;
                //insertTxtC($re);
                };

sentp returns [String re]: 'ENDIF' {$re = "\n}\n";}| 'ELSE' sentlist 'ENDIF' {$re = "}\nelse {\n" + $sentlist.re +"\n" +"}\n";};
sentpp returns [String re]: 'THEN' sentlist sentp {$re = "{" +"\n" + $sentlist.re + $sentp.re;} | sent {$re = "{" + "\n"+$sent.re+"\n}\n";};
sentppp returns [String re ]: 'WHILE' '(' expcond ')' sentlist 'ENDDO' {$re = "\n" +"while (" + $expcond.s + "){" +"\n"  +($sentlist.re) +  "}\n";}| IDENT '=' val1=doval ',' val2=doval ',' val3=doval sentlist 'ENDDO'{$re = "for("+$IDENT.text +"="+ $val1.doVal+"; "+$IDENT.text+"!="+ $val2.doVal+"; "+$IDENT.text+ "=" +$IDENT.text+"+"+$val3.doVal+"){" + "\n"+ $sentlist.re +"\n"+"}\n";};
exp returns [String re]: factor expp {$re=  $factor.re+$expp.re;};
expp returns [String re]:  op exp expp {$re=" "+$op.c+" "+$exp.re+ $expp.re;}| {$re="";};
op returns[char c]: oparit {$c = $oparit.c;};
oparit returns[char c]: '+' {$c='+';} | '-' {$c='-';} | '*' {$c='*';}| '/' {$c='/';};
factor returns [String re]: IDENT factorp {$re=$IDENT.text+$factorp.re;}|simpvalue {$re=$simpvalue.s;}| '('exp')'{$re="("+$exp.re+")";};
factorp returns [String re]: '(' exp explist ')' {$re="("+$exp.re+$explist.re+")";}| {$re="";};
explist returns [String re]: ',' exp explist {$re=','+ $exp.re +$explist.re;}| {$re="";};

proc_call returns[String s]: 'CALL' IDENT subpparamlist {$s=creador.getFunciones().añadirPunterosCall($IDENT.text, $subpparamlist.s, creador.getCabecera(), creador.getPrincipal().getVariablesPrincipal());};
subpparamlist returns[String s]: '(' exp explist ')' {$s= "(" + $exp.re + $explist.re +")";} | {$s="()";};

subproglist returns [String re]: codproc subproglist {$re= $codproc.s + $subproglist.re;}| codfun subproglist {$re= $codfun.s + $subproglist.re;}| {$re="";};


codproc returns[String s]: 'SUBROUTINE' id1=IDENT formal_paramlist[$id1.text,0] dec_s_paramlist[$id1.text,0]  dcllist sent sentlist 'END' 'SUBROUTINE' id2=IDENT {

    creador.getSubrutina().comprobacion($id1.text,$id2.text,$id1.getLine(),  $id1.getCharPositionInLine());//Comprobacion:
    creador.fusion(creador.getSubrutina().construirSubrutina($formal_paramlist.esVoid,$id1.text,$dec_s_paramlist.re ,$dcllist.s, $sent.re, $sentlist.re,creador.getCabecera(), $formal_paramlist.re, $id1.getLine()));

};

codfun returns[String s]: 'FUNCTION' id1=IDENT '(' nomparamlist[$id1.text,0] ')' tipo '::'  id2=IDENT ';' dec_f_paramlist[$id1.text] dcllist sent sentlist  id3=IDENT '=' exp ';' 'END' 'FUNCTION' id4=IDENT {

    creador.getFunciones().comprobacion($id1.text,$id2.text,$id3.text,$id4.text,$id1.getLine(),  $id1.getCharPositionInLine());//Comprobacion:
    creador.fusion(creador.getFunciones().construirFuncion( $tipo.t, $id1.text, $dec_f_paramlist.re, $dcllist.s, $sent.re, $sentlist.re,  $exp.re, creador.getCabecera(), $nomparamlist.re, $id1.getLine()));


};


expcond returns [String s]: factorcond expcondp {$s = $factorcond.s + $expcondp.s;};
expcondp returns [String s]: oplog expcond expcondp {$s = $oplog.s + $expcond.s + $expcondp.s;}| {$s="";};
oplog returns[String s]: '.OR.' {$s=" || ";}| '.AND.' {$s=" && ";}| '.EQV.' {$s=" !^ ";}| '.NEQV.' {$s=" ^ ";};
factorcond returns[String s]: '(' expcond ')' {$s = "("+$expcond.s +")";}| '.NOT.' factorcond {$s= "!" + $factorcond.s;}| '.TRUE.' {$s="1";}| '.FALSE.' {$s="0";}| exp {$s = $exp.re;} opcomp exp {$s +=$opcomp.s + $exp.re;};
opcomp returns[String s]: '<' {$s="<";}| '>' {$s=">";}| '<=' {$s="<=";}| '>=' {$s=">=";}| '==' {$s="==";}| '/=' {$s="!=";};
doval returns [String doVal]: NUM_INT_CONST {$doVal=$NUM_INT_CONST.text;} | IDENT{$doVal=$IDENT.text;};



casos returns [String re=""]: 'CASE' casosp {
                                            if(($casosp.re).startsWith( "default")){
                                               $re+=$casosp.re;
                                            }
                                            else{
                                            $re= "case " + $casosp.re;}
                                            }
                                            | {$re+="";};
casosp returns [String re]: '(' etiquetas ')' sentlist casos {$re=$etiquetas.re + ":\n"+ $sentlist.re + "\n" + "break;" + "\n" + $casos.re;}| 'DEFAULT' sentlist {$re= "default:" + "\n" +  $sentlist.re;};
etiquetas returns [String re]: simpvalue etiquetaspp {$re=$etiquetaspp.ant + $simpvalue.s + $etiquetaspp.re;}| ':' simpvalue{$re="<" + $simpvalue.s;};
etiquetasp returns [String re,String ant]: simpvalue {$re=" to " + $simpvalue.s; $ant="";}| {$re=""; $ant=">";};
etiquetaspp returns [String re, String ant]: ':' etiquetasp {$re=$etiquetasp.re; $ant=$etiquetasp.ant;}| listaetiquetas{$re=$listaetiquetas.re;$ant="";};
listaetiquetas returns [String re]: ',' simpvalue {$re=":\n" + "case " + $simpvalue.s;}| {$re="";};
