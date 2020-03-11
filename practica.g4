// java -jar antlr-4.7.2-complete.jar grupal.g4

grammar grupal;



r:(IDENT|ENTRECOMILLADOS|COMMENT | SPACE | NUM_REAL_CONST | NUM_INT_CONST | NUM_INT_CONST_B |
        NUM_INT_CONST_O | NUM_INT_CONST_H  | STRING_CONST | ERRORES)+;

//ELEMENTOS ENTRECOMILLADOS

ENTRECOMILLADOS: '"'.*?'"' {
                           String sub= (String)getText().subSequence(1,getText().length()-1);
                           System.out.println("SUBS:"+sub);
};


//-------------------------------------------ELEMENTOS ENTRECOMILLADOS

//IDENTIFICADORES
IDENT:VOCAB(VOCAB|'_'|NUM)+ {System.out.println("IDENT:"+getText());};

fragment
VOCAB:[a-zA-Z];

fragment
NUM:[0-9];
//----------------------------------------------------IDENTIFICADORES

//COMENTARIOS
//¿Cómo se hace lo de fin de linea?

COMMENT:'!'.*?[\n] {System.out.println("COMMENT:"+getText());};
//----------------------------------------------------COMENTARIOS
NUM_INT_CONST :  ('-')? [0-9]+ {System.out.println("ENTERO");}; //'NUM_INT_CONST' (' ')*
NUM_REAL_CONST : ('-')?  ([0-9]+ ('E'|'e') ('-')? [0-9]+   |  [0-9]+(.)[0-9]+ |  [0-9]+ (.)[0-9]+ ('E'|'e')('-')?[0-9]+)  {System.out.println("REAL");};
NUM_INT_CONST_B: ('b\'')('0'|'1')+'\'' ;
NUM_INT_CONST_O: ('o\'')([0-7])+'\'';
NUM_INT_CONST_H: ('z\'')([0-9]|[A-F])+'\'' ;
SPACE: (' ') {System.out.println(" ");};

STRING_CONST:('\'')([a-zA-Z]+|[0-9]+|' '|'\'\''|'"')+('\'') | ('"')([a-zA-Z]+|[0-9]+|' '|'""'|'\'')+('"') {
     if(getText().charAt(0)=='\''){
       int longuitud = getText().length();
       String s = getText().substring(1, longuitud-1);
       String s2= s.replace("\'\'", "\'");
       System.out.println(s2);
     }
     if(getText().charAt(0)=='\"'){
       int longuitud = getText().length();
       String s = getText().substring(1, longuitud-1);
       String text = s.replace("\"\"", "\"");
       System.out.println(text);
     }};
WS : [ \r\t\n] -> skip;

ERRORES: 'erj' {};

prg :'PROGRAM' IDENT ';' dcllist cabecera sent sentlist 'END' 'PROGRAM' IDENT subproglist;
dcllist: dcllistp;
dcllistp: dcl dcllistp | ;
cabecera: 'INTERFACE' cablist 'END' 'INTERFACE' | ;
cablist: decproc decsubprog | decfun decsubprog;
decsubprog: decproc decsubprog | decfun decsubprog | ;
sentlist: sent sentlist | ;
dcl: tipo dclprima;
dclprima:',' 'PARAMETER' '::' IDENT '=' simpvalue ctelist ';' defcte | ;
defcte: tipo ',' 'PARAMETER' '::' IDENT '=' simpvalue ctelist ';' defcte  | '::' varlist ';' defvar | ;
ctelist: ',' IDENT '=' simpvalue ctelist  | ;
simpvalue: NUM_INT_CONST | NUM_REAL_CONST | STRING_CONST  |  NUM_INT_CONST_B | NUM_INT_CONST_O | NUM_INT_CONST_H;
defvar: tipo '::' varlist ';' defvar | tipo;
tipo: 'INTEGER' | 'REAL' | 'CHARACTER' charlength;
charlength: '(' NUM_INT_CONST ')' | ;
varlist: IDENT init varlistPRIMA;
varlistPRIMA: ',' varlist | ;
init: '=' simpvalue | ;
decproc:  'SUBROUTINE' IDENT formal_paramlist dec_s_paramlist 'END' 'SUBROUTINE' IDENT;
formal_paramlist:  | '(' nomparamlist ')';
nomparamlist: IDENT nomparamlistPRIMA;
nomparamlistPRIMA: ',' nomparamlist | ;
dec_s_paramlist: tipo ',' 'INTENT' '(' tipoparam ')' IDENT ';'  dec_s_paramlist | ;
tipoparam: 'IN' | 'OUT' | 'INOUT';
decfun:  'FUNCTION' IDENT '(' nomparamlist ')'  tipo '::' IDENT ';' dec_f_paramlist 'END' 'FUNCTION' IDENT;
dec_f_paramlist: tipo ',' 'INTENT' '(' 'IN' ')' IDENT ';'  dec_f_paramlist | ;
sent: IDENT '=' exp ';' | proc_call ';' |  'DO' sentppp |  'IF' '(' expcond ')' sentpp | 'SELECT' 'CASE' '(' exp ')' casos 'END' 'SELECT';
sentp : 'ENDIF' |'ELSE' sentlist 'ENDINF';
sentpp : 'THEN' sentlist sentp | sent;
sentppp : 'WHILE' '(' expcond ')' sentlist 'ENDDO' | IDENT '=' doval ',' doval ',' doval sentlist 'ENDDO';
exp : factor expPRIMA;
expPRIMA : op exp expPRIMA | ;
op : oparit;
oparit : '+' | '-' | '*' | '/';
factor : simpvalue | '(' exp ')' | IDENT factorPRIMA;
factorPRIMA: '(' exp explist ')'  | ;
explist : ',' exp explist | ;
proc_call : 'CALL' IDENT subpparamlist;
subpparamlist : '(' exp explist ')' | ;
subproglist : codproc subproglist | codfun subproglist | ;
codproc : 'SUBROUTINE' IDENT formal_paramlist dec_s_paramlist dcllist sent sentlist 'END' 'SUBROUTINE' IDENT;
codfun : 'FUNCTION' IDENT '(' nomparamlist ')'  tipo '::' IDENT ';'  dec_f_paramlist dcllist sent sentlist IDENT '=' exp ';' 'END' 'FUNCTION' IDENT;
//OPCIONAL

expcond: factorcond expcondp;
expcondp: oplog expcond | ;
oplog: '.OR.' | '.AND.' | '.EQV.' | '.NEQV.';
factorcond: exp opcomp exp | '(' expcond ')' | '.NOT.' factorcond | '.TRUE.' | '.FALSE.';
opcomp: '<' | '>' | '<=' | '>=' | '==' | '/=';
doval: NUM_INT_CONST | IDENT;
casos: 'CASE' casos | ;
etiquetas: simpvalue etiquetaspp;
etiquetaspp: etiquetasp | listaetiquetas;
etiquetasp: simpvalue | ':' simpvalue | ;
casosp: '(' etiquetas ')' sentlist casos | 'DEFAULT' sentlist;
listaetiquetas: ',' simpvalue | ;


