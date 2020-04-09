// java -jar antlr-4.7.2-complete.jar grupal.g4

grammar grupal;

@members {
     File file = new File("codico.c");
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

prg: 'PROGRAM' IDENT ';' dcllist cabecera sent sentlist 'END' 'PROGRAM' IDENT subproglist {insertTxtC("hola ");};
dcllist: dcllistp;
dcllistp: dcl dcllistp | ;
cabecera: 'INTERFACE' cablist 'END' 'INTERFACE' | ;
cablist: decproc decsubprog | decfun decsubprog;
decsubprog: decproc decsubprog | decfun decsubprog | ;
sentlist: sent sentlist | ;
dcl: tipo dclp;
dclp: ',' 'PARAMETER' '::' IDENT '=' simpvalue ctelist ';' defcte| '::' varlist ';' defvar | ;
defcte: tipo ',' 'PARAMETER' '::' IDENT '=' simpvalue ctelist ';' defcte | ;
ctelist: ',' IDENT '=' simpvalue ctelist |  ;
simpvalue: NUM_INT_CONST | NUM_REAL_CONST | STRING_CONST|NUM_INT_CONST_B | NUM_INT_CONST_O | NUM_INT_CONST_H;
defvar: tipo '::' varlist ';' defvar | ;
tipo: 'INTEGER' | 'REAL' | 'CHARACTER' charlength;
charlength: '(' NUM_INT_CONST ')' | ;
varlist: IDENT init varlistp;
varlistp: ',' varlist | ;
init: '=' simpvalue | ;
decproc: 'SUBROUTINE' IDENT formal_paramlist dec_s_paramlist 'END' 'SUBROUTINE' IDENT;
formal_paramlist: '(' nomparamlist ')' | ;
nomparamlist: IDENT nomparamlistp;
nomparamlistp: ',' nomparamlist | ;
dec_s_paramlist: tipo ',' 'INTENT' '(' tipoparam ')' IDENT ';'  dec_s_paramlist | ;
tipoparam: 'IN' | 'OUT' | 'INOUT';
decfun: 'FUNCTION' m1=IDENT '(' nomparamlist ')' tipo '::' m2=IDENT ';' dec_f_paramlist 'END' 'FUNCTION' m3=IDENT {   System.out.println($m1.text);};
dec_f_paramlist: tipo ',' 'INTENT' '(' 'IN' ')' IDENT ';' dec_f_paramlist | ;
sent: IDENT '=' exp ';' | proc_call ';'| 'IF' '(' expcond ')' sentpp| 'DO' sentppp |'SELECT' 'CASE' '(' exp ')' casos 'END' 'SELECT';
sentp: 'ENDIF' | 'ELSE' sentlist 'ENDIF';
sentpp: 'THEN' sentlist sentp | sent;
sentppp: 'WHILE' '(' expcond ')' sentlist 'ENDDO' | IDENT '=' doval ',' doval ',' doval sentlist 'ENDDO';
exp: factor expp ;
expp:  op exp expp | ;
op: oparit;
oparit: '+' | '-' | '*' | '/';
factor: IDENT factorp |simpvalue | '('exp')';
factorp: '(' exp explist ')' | ;
explist: ',' exp explist | ;
proc_call: 'CALL' IDENT subpparamlist;
subpparamlist: '(' exp explist ')' | ;
subproglist: codproc subproglist {}| codfun subproglist {}| {};
codproc: 'SUBROUTINE' IDENT formal_paramlist dec_s_paramlist dcllist sent sentlist 'END' 'SUBROUTINE' IDENT;
codfun: 'FUNCTION' m1=IDENT '(' nomparamlist ')' tipo '::'  m2=IDENT ';' dec_f_paramlist dcllist sent sentlist  m3=IDENT '=' exp ';' 'END' 'FUNCTION' m4=IDENT {
                System.out.println("Hola");};
expcond: factorcond expcondp;
expcondp: oplog expcond expcondp| ;
oplog: '.OR.' | '.AND.' | '.EQV.' | '.NEQV.';
factorcond: '(' expcond ')' | '.NOT.' factorcond| '.TRUE.' | '.FALSE.' | exp opcomp exp ;
opcomp: '<' | '>' | '<=' | '>=' | '==' | '/=';
doval: NUM_INT_CONST | IDENT;
casos: 'CASE' casosp | ;
casosp: '(' etiquetas ')' sentlist casos | 'DEFAULT' sentlist;
etiquetas: simpvalue etiquetaspp | ':' simpvalue;
etiquetasp: simpvalue | ;
etiquetaspp: ':' etiquetasp | listaetiquetas;
listaetiquetas: ',' simpvalue | ;
