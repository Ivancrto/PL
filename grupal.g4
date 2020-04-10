// java -jar antlr-4.7.2-complete.jar grupal.g4

grammar grupal;

@members {
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
}
@parser::header {
    import java.io.FileWriter;
    import java.io.File;
    import java.io.IOException;
}
@lexer::header {
    import java.io.FileWriter;
    import java.io.File;
    import java.io.IOException;
}

r:(IDENT|ENTRECOMILLADOS|COMMENT | NUM_REAL_CONST | NUM_INT_CONST | NUM_INT_CONST_B |
        NUM_INT_CONST_O | NUM_INT_CONST_H  | STRING_CONST | ERRORES)+;

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

prg: 'PROGRAM' IDENT ';' dcllist cabecera sent sentlist 'END' 'PROGRAM' IDENT subproglist {};
dcllist: dcllistp;
dcllistp: dcl dcllistp | ;
cabecera: 'INTERFACE' cablist 'END' 'INTERFACE' | ;
cablist: decproc decsubprog | decfun decsubprog;
decsubprog: decproc decsubprog | decfun decsubprog | ;

sentlist: sent sentlist | ;

//#DEFINE
dcl returns[String re]: tipo dclp {$re=$tipo.s+$dclp.re; insertTxtC($tipo.s+$dclp.re);}; //si sale repetido el float es por esta funcion
dclp returns[String re]: ',' 'PARAMETER' '::' IDENT '=' simpvalue ctelist ';' defcte {$re="#define "+$IDENT.text+'='+$simpvalue.s+$ctelist.re+";\n"+$defcte.re;} //es de tipo define
                                        | '::' varlist ';' defvar {$re= $varlist.s+";\n"+$defvar.re;}| {$re="";}; //NO ES de tipo define
defcte  returns[String re]: tipo ',' 'PARAMETER' '::' IDENT '=' simpvalue ctelist ';' defcte  {$re = "#define " + $tipo.s + $IDENT.text + $simpvalue.s +";\n" + $defcte.re; }| {$re="";}  ;

ctelist returns[String re]: ',' IDENT '=' simpvalue ctelist {$re=','+$IDENT.text+'='+$simpvalue.s+$ctelist.re;}| {$re="";} ;
simpvalue returns[String s]: NUM_INT_CONST {$s= $NUM_INT_CONST.text;}| NUM_REAL_CONST {$s= $NUM_REAL_CONST.text;}| STRING_CONST {$s= $STRING_CONST.text;}
                |NUM_INT_CONST_B | NUM_INT_CONST_O | NUM_INT_CONST_H; //FALTA POR TERMINAR, ES DE LA PARTE OPCIONAL
defvar returns [String re]: tipo '::' varlist ';' defvar {$re = $tipo.s + $varlist.s + ";";
                                                            insertTxtC($tipo.s + $varlist.s + ";");}| {$re="";} ;
tipo returns[String s]: 'INTEGER' {$s="int ";}| 'REAL' {$s="float ";}| 'CHARACTER' charlength {$s= "char " + $charlength.s ;};
charlength returns[String s]: '(' NUM_INT_CONST ')' {$s='['+ $NUM_INT_CONST.text +"] ";}| ;
varlist returns [String s]: IDENT init varlistp{$s = $IDENT.text + $init.s + $varlistp.s;};
varlistp returns [String s]: ',' varlist {$s= ", " + $varlist.s;}| {$s="";}; //Esta puesto la lamda asi debido a que sino salia null en el codigo.c
init returns [String s]: '=' simpvalue {$s= " = " + $simpvalue.s;}| {$s= "";}; //Esta puesto la lamda asi debido a que salia null en el codigo.c

//Hecha la parte opcional solo de los IN, OUT, INOUT
decproc returns [String re]: 'SUBROUTINE' IDENT formal_paramlist dec_s_paramlist 'END' 'SUBROUTINE' IDENT {
                                                                                                            $re="void "+$IDENT.text;
                                                                                                            if($formal_paramlist.esVoid==1)
                                                                                                                $re+="( void )";
                                                                                                            else
                                                                                                                $re+="("+$dec_s_paramlist.re+")";
                                                                                                            $re+=";\n";
                                                                                                            insertTxtC($re);
                                                                                                            };
formal_paramlist returns [int esVoid]: '(' nomparamlist ')' {$esVoid=0;}| {$esVoid=1;};
nomparamlist: IDENT nomparamlistp;
nomparamlistp: ',' nomparamlist | ;
dec_s_paramlist returns[String re]: tipo ',' 'INTENT' '(' tipoparam ')' IDENT ';'  dec_s_paramlist {$re=$tipo.s + $tipoparam.c+$IDENT.text;
                                                                                                        if(!($dec_s_paramlist.re).equals("")){
                                                                                                            $re+=','+$dec_s_paramlist.re;
                                                                                                        }}
                                                                                                   |{$re="";} ;
tipoparam returns [String c]: 'IN' {$c="";}| 'OUT' {$c="*";}| 'INOUT'{$c="*";};
decfun: 'FUNCTION' IDENT '(' nomparamlist ')' tipo '::' IDENT ';' dec_f_paramlist 'END' 'FUNCTION' IDENT ;
dec_f_paramlist: tipo ',' 'INTENT' '(' 'IN' ')' IDENT ';' dec_f_paramlist | ;

sent: IDENT '=' exp ';' | proc_call ';'| 'IF' '(' expcond ')' sentpp| 'DO' sentppp |'SELECT' 'CASE' '(' exp ')' casos 'END' 'SELECT';

sentp: 'ENDIF' | 'ELSE' sentlist 'ENDIF';
sentpp: 'THEN' sentlist sentp | sent;
sentppp: 'WHILE' '(' expcond ')' sentlist 'ENDDO' | IDENT '=' doval ',' doval ',' doval sentlist 'ENDDO';
exp: factor expp ;
expp:  op exp expp | ;
op returns[char c]: oparit {$c = $oparit.c;};
oparit returns[char c]: '+' {$c='+';} | '-' {$c='-';} | '*' {$c='+';}| '/' {$c='/';};
factor: IDENT factorp |simpvalue | '('exp')';
factorp: '(' exp explist ')' | ;
explist: ',' exp explist | ;
proc_call: 'CALL' IDENT subpparamlist;
subpparamlist: '(' exp explist ')' | ;
subproglist: codproc subproglist {}| codfun subproglist {}| {};
codproc: 'SUBROUTINE' IDENT formal_paramlist dec_s_paramlist dcllist sent sentlist 'END' 'SUBROUTINE' IDENT;
codfun: 'FUNCTION' IDENT '(' nomparamlist ')' tipo '::'  IDENT ';' dec_f_paramlist dcllist sent sentlist  IDENT '=' exp ';' 'END' 'FUNCTION' IDENT {};
expcond: factorcond expcondp;
expcondp: oplog expcond expcondp| ;
oplog returns[String s]: '.OR.' {$s="||";}| '.AND.' {$s="&&";}| '.EQV.' {$s="!^";}| '.NEQV.' {$s="^";};
factorcond returns[String s]: '(' expcond ')' | '.NOT.' factorcond| '.TRUE.' {$s="1";}| '.FALSE.' {$s="0";}| exp opcomp exp ; //falta terminar esta regla
opcomp returns[String s]: '<' {$s="<";}| '>' {$s=">";}| '<=' {$s="<=";}| '>=' {$s=">=";}| '==' {$s="==";}| '/=' {$s="!=";};
doval returns [String doVal]: NUM_INT_CONST {$doVal=$NUM_INT_CONST.text;} | IDENT{$doVal=$IDENT.text;};
casos: 'CASE' casosp | ;
casosp: '(' etiquetas ')' sentlist casos | 'DEFAULT' sentlist;
etiquetas: simpvalue etiquetaspp | ':' simpvalue;
etiquetasp: simpvalue | ;
etiquetaspp: ':' etiquetasp | listaetiquetas;
listaetiquetas: ',' simpvalue | ;
