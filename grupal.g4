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
    
    public HashMap<String,Integer> mapVarSub= new HashMap<String,Integer>(); //Clave=nombre de la variable ; Valor=Numero de accesos;
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
}
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
prg: 'PROGRAM' IDENT ';' dcllist cabecera sent sentlist 'END' 'PROGRAM' IDENT subproglist {};
dcllist: dcllistp;
dcllistp: dcl dcllistp | ;
cabecera: 'INTERFACE' cablist 'END' 'INTERFACE' | ;
cablist: decproc decsubprog | decfun decsubprog;
decsubprog: decproc decsubprog | decfun decsubprog | ;

sentlist: sent sentlist | ;

//#DEFINE
dcl  returns[String re]: tipo dclp [$tipo.s]  { };
dclp [String h] returns[String re]: ',' 'PARAMETER' '::' IDENT '=' simpvalue ctelist ';' defcte {
                        String define = $IDENT.text+ " " +$simpvalue.s +" "+$ctelist.re;
                        String[] parts = define.split(",");
                        for(String i:parts){
                            insertTxtC("#define "+ $h + i + ";\n");
                        }
                   } //es de tipo define

                                        | '::' varlist ';' defvar {insertTxtC($h + " " + $varlist.s+";\n"+$defvar.re+"\n");}| {$re="";}; //NO ES de tipo define
defcte  returns[String re]: tipo ',' 'PARAMETER' '::' IDENT '=' simpvalue ctelist ';' defcte  {insertTxtC("#define " + $tipo.s + $IDENT.text + " " + $simpvalue.s +";\n");   }| {$re="";}  ;

ctelist returns[String re]: ',' IDENT '=' simpvalue ctelist {$re=','+$IDENT.text+ " " +$simpvalue.s+$ctelist.re;}| {$re="";} ;
simpvalue returns[String s]: NUM_INT_CONST {$s= $NUM_INT_CONST.text;}| NUM_REAL_CONST {$s= $NUM_REAL_CONST.text;}| STRING_CONST {$s= $STRING_CONST.text;}
                |NUM_INT_CONST_B | NUM_INT_CONST_O | NUM_INT_CONST_H; //FALTA POR TERMINAR, ES DE LA PARTE OPCIONAL
defvar returns [String re]: tipo '::' varlist ';' defvar {$re = $tipo.s + $varlist.s + ";";
                                                            insertTxtC($tipo.s + $varlist.s + ";\n");}| {$re="";} ;
tipo returns[String s]: 'INTEGER' {$s="int ";}| 'REAL' {$s="float ";}| 'CHARACTER' charlength {$s= "char " + $charlength.s ;};
charlength returns[String s]: '(' NUM_INT_CONST ')' {$s='['+ $NUM_INT_CONST.text +"] ";}| ;
varlist returns [String s]: IDENT init varlistp{$s = $IDENT.text + $init.s + $varlistp.s;};
varlistp returns [String s]: ',' varlist {$s= ", " + $varlist.s;}| {$s="";}; //Esta puesto la lamda asi debido a que sino salia null en el codigo.c
init returns [String s]: '=' simpvalue {$s= " = " + $simpvalue.s;}| {$s= "";}; //Esta puesto la lamda asi debido a que salia null en el codigo.c

//Hecha la parte opcional solo de los IN, OUT, INOUT
decproc returns [String re]: 'SUBROUTINE' id1=IDENT formal_paramlist dec_s_paramlist 'END' 'SUBROUTINE' id2=IDENT {
                                                                                                            comprobarTodosSub();
                                                                                                            $re="void "+$id1.text;
                                                                                                            if($formal_paramlist.esVoid==1)
                                                                                                                $re+="( void )";
                                                                                                            else
                                                                                                                $re+="("+$dec_s_paramlist.re+")";
                                                                                                            $re+=";\n";
                                                                                                            insertTxtC($re);
                                                                                                            mapVarSub.clear();
                                                                                                            };
formal_paramlist returns [int esVoid]: '(' nomparamlist ')' {$esVoid=0;}| {$esVoid=1;};
nomparamlist: IDENT nomparamlistp {mapVarSub.put($IDENT.text,0);};
nomparamlistp: ',' nomparamlist | ;
dec_s_paramlist returns[String re]: tipo ',' 'INTENT' '(' tipoparam ')' IDENT ';'  dec_s_paramlist {
                                                                                                        String tipo=$tipo.s;
                                                                                                        if(($tipo.s).startsWith("char")){
                                                                                                            tipo="char ";
                                                                                                        }
                                                                                                        $re=tipo + $tipoparam.c+$IDENT.text;
                                                                                                        //Comprobamos que las variables se hayan declarado o no estetn repetidas:
                                                                                                        comprobar($IDENT.text);
                                                                                                        if(!($dec_s_paramlist.re).equals("")){
                                                                                                            $re+=','+$dec_s_paramlist.re;
                                                                                                        }}
                                                                                                   |{$re="";} ;
tipoparam returns [String c]: 'IN' {$c="";}| 'OUT' {$c="*";}| 'INOUT'{$c="*";};


//Falta comprobar que la ultima sentencia tiene el valor de IDENT
decfun returns[String re]: 'FUNCTION' id1=IDENT '(' nomparamlist ')' tipo '::' id2=IDENT ';' dec_f_paramlist 'END' 'FUNCTION' id3=IDENT {
                                                                                                                                    //Por lo que sea, esta sentencia if falla
                                                                                                                                    if(!($id1.text).equals($id2.text)){
                                                                                                                                        System.out.println("El nombre de la funcion "+$id1.text+" y el nombre asociado al tipo devuelto "+$id2.text+" no coinciden.");
                                                                                                                                    }
                                                                                                                                    else{
                                                                                                                                        $re=$tipo.s+$id1.text+'('+$dec_f_paramlist.re+");\n";
                                                                                                                                        insertTxtC($re);
                                                                                                                                    }
                                                                                                                                    };
dec_f_paramlist returns[String re]: tipo ',' 'INTENT' '(' 'IN' ')' IDENT ';' dec_f_paramlist {String corchetes="";
                                                                                              String tipo=$tipo.s;
                                                                                              if(($tipo.s).startsWith("char"))
                                                                                                  corchetes="[]";
                                                                                                  tipo="char ";
                                                                                              $re=tipo + $IDENT.text+corchetes;
                                                                                              //Comprobamos que las variables se hayan declarado o no estetn repetidas:
                                                                                              comprobar($IDENT.text);
                                                                                              if(!($dec_f_paramlist.re).equals("")){
                                                                                                  $re+=','+$dec_f_paramlist.re;
                                                                                              }}
                                                                                              |{$re="";} ;

//DE AQUI SOLO ESTÁ HECHO EL CASE ==> FALTA LA PARTE DE LA EXPRESIÓN Y HACER LAS ETIQUETAS (MIRAR EN LAS PRODUCCIONES DE CASI AL FINAL)
sent returns [String re]: IDENT '=' exp ';' | proc_call ';'| 'IF' '(' expcond ')' sentpp| 'DO' sentppp |'SELECT' 'CASE' '(' exp ')' casos 'END' 'SELECT' {$re="switch (" + "EXPRESION" + "){\n" + $casos.re + "\n}\n" ;  insertTxtC($re);};

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

//CASOS ESTÁ "INCOMPLETO", HAY QUE HACER LA PARTE DE LAS ETIQUETAS Y SENTLIST
casos returns [String re=""]: 'CASE' casosp {
                                            if(($casosp.re).startsWith("default")){
                                               $re+=$casosp.re;
                                            }
                                            else{
                                            $re="case "+$casosp.re;}
                                            }
                                            | {$re+="";};
casosp returns [String re]: '(' etiquetas ')' sentlist casos {$re=$etiquetas.re +":"+ "VALOR DE SENTLIST" +"\n break; \n"+$casos.re;}| 'DEFAULT' sentlist {$re="default:"+ "VALOR DE SENTLIST";};
etiquetas returns [String re]: simpvalue etiquetaspp | ':' simpvalue;
etiquetasp returns [String re]: simpvalue | ;
etiquetaspp returns [String re]: ':' etiquetasp | listaetiquetas;
listaetiquetas returns [String re]: ',' simpvalue | ;
