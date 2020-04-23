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

prg: 'PROGRAM' IDENT ';' dcllist cabecera sent sentlist 'END' 'PROGRAM' IDENT subproglist {insertTxtC($cabecera.re + "\n" +"void main (void){" + "\n" + $dcllist.s + $sent.re + $sentlist.re + "\n"+ "}" + $subproglist.re );};

dcllist returns[String s]: dcllistp {$s = $dcllistp.re ;};
dcllistp returns[String re]: dcl dcllistp {$re = $dcl.re+ " " + $dcllistp.re ;}| {$re="";};

cabecera returns[String re]: 'INTERFACE' cablist 'END' 'INTERFACE' {$re=$cablist.re;}| {$re="";};

cablist returns[String re]: decproc decsubprog {$re=$decproc.re + $decsubprog.re;}| decfun decsubprog {$re=$decfun.re + $decsubprog.re;};

decsubprog returns[String re]: decproc decsubprog {$re=$decproc.re + $decsubprog.re;}| decfun decsubprog {$re=$decfun.re + $decsubprog.re;}| {$re="";};
sentlist returns [String re]: sent sentlist {$re =$sent.re+ $sentlist.re;}| {$re="";};

//#DEFINE
dcl  returns[String re]: tipo dclp [$tipo.s]  {$re=$dclp.re;};
dclp [String h] returns[String re=""]: ',' 'PARAMETER' '::' IDENT '=' simpvalue ctelist ';' defcte {
                        String define = $IDENT.text+ " " +$simpvalue.s +" "+$ctelist.re;
                        String[] parts = define.split(",");
                        for(String i:parts){
                            insertTxtC("#define "+ $h + i + ";\n");
                            $re+="#define "+ $h + i + ";\n";
                        }
                        $re+=$defcte.re;
                   } //es de tipo define

                                        | '::' varlist ';' defvar {$re=  $h +  " " + $varlist.s + ";\n" + $defvar.re + "\n";}| {$re="";}; //NO ES de tipo define
defcte  returns[String re]: tipo ',' 'PARAMETER' '::' IDENT '=' simpvalue ctelist ';' defcte  {
                       $re= "#define " + $tipo.s + $IDENT.text + " " + $simpvalue.s + ";\n" +$defcte.re;
                       insertTxtC("#define " + $tipo.s + $IDENT.text + " " + $simpvalue.s +";\n");
                        }
                       | {$re="";} ;

ctelist returns[String re]: ',' IDENT '=' simpvalue ctelist {$re=','+$IDENT.text+ " " +$simpvalue.s+$ctelist.re;}| {$re="";} ;
simpvalue returns[String s]: NUM_INT_CONST {$s= $NUM_INT_CONST.text;}| NUM_REAL_CONST {$s= $NUM_REAL_CONST.text;}| STRING_CONST {$s= $STRING_CONST.text;}
                |NUM_INT_CONST_B {$s= "0b" + $NUM_INT_CONST_B.text.substring(2,$NUM_INT_CONST_B.text.length()-1)  ;} | NUM_INT_CONST_O {$s= "0o" + $NUM_INT_CONST_O.text.substring(2,$NUM_INT_CONST_O.text.length()-1)  ;}| NUM_INT_CONST_H {$s= "0x" + $NUM_INT_CONST_H.text.substring(2,$NUM_INT_CONST_H.text.length()-1)  ;};
defvar returns [String re]: tipo '::' varlist ';' defvar {$re = $tipo.s + $varlist.s + ";";
                                                            insertTxtC($tipo.s + $varlist.s + ";\n");}| {$re="";} ;
tipo returns[String s]: 'INTEGER' {$s="int ";}| 'REAL' {$s="float ";}| 'CHARACTER' charlength {$s= "char " + $charlength.s ;};
charlength returns[String s]: '(' NUM_INT_CONST ')' {$s='['+ $NUM_INT_CONST.text +"] ";}| {$s="";};
varlist returns [String s]: IDENT init varlistp{$s = $IDENT.text + $init.s + $varlistp.s;};
varlistp returns [String s]: ',' varlist {$s= ", " + $varlist.s;}| {$s="";};
init returns [String s]: '=' simpvalue {$s= " = " + $simpvalue.s;}| {$s= "";};

//Hecha la parte opcional solo de los IN, OUT, INOUT
decproc returns [String re]: 'SUBROUTINE' id1=IDENT formal_paramlist dec_s_paramlist[$id1.text] 'END' 'SUBROUTINE' id2=IDENT {
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
dec_s_paramlist [String id] returns[String re]: tipo ',' 'INTENT' '(' tipoparam ')' IDENT ';'  dec_s_paramlist[$id] {
                                                                                                        String tipo=$tipo.s;
                                                                                                        if(($tipo.s).startsWith("char")){
                                                                                                            tipo="char ";
                                                                                                        }
                                                                                                        $re=tipo+ $tipoparam.c +$IDENT.text;
                                                                                                        //Comprobamos que las variables se hayan declarado o no estetn repetidas:
                                                                                                        comprobar($IDENT.text);
                                                                                                        if(!($dec_s_paramlist.re).equals("")){
                                                                                                            $re+=','+$dec_s_paramlist.re;
                                                                                                        }
                                                                                                        if(comprobacionPunteroFunc.get($id) == null){
                                                                                                            HashMap<String,String[]> x = new HashMap<String,String[]>();
                                                                                                            comprobacionPunteroFunc.put($id, x);
                                                                                                        }
                                                                                                        String[] valores = new String[2];
                                                                                                        if($tipoparam.c == "*"){
                                                                                                              valores[1] = "puntero";
                                                                                                              valores[0] = $IDENT.text;
                                                                                                              comprobacionPunteroFunc.get($id).put($IDENT.text, valores);
                                                                                                        }else{
                                                                                                        valores[1] = "no_puntero";
                                                                                                        valores[0] = $IDENT.text;
                                                                                                              comprobacionPunteroFunc.get($id).put($IDENT.text, valores);
                                                                                                        }

                                                                                                        }
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

//Modificacion case Ana, if, do while Sandra
sent returns [String re]: IDENT '=' exp ';' {$re = $IDENT.text + " =" + $exp.re + ";\n";}| proc_call ';' {$re = $proc_call.s +";";}| 'IF' '(' expcond ')' sentpp {$re = "if (" + $expcond.s + ")" + $sentpp.re; insertTxtC($re);}| 'DO' sentppp {$re = "do {" + $sentppp.re; insertTxtC($re);} |'SELECT' 'CASE' '(' exp ')' casos 'END' 'SELECT' {$re="switch (" + $exp.re + "){\n" + $casos.re + "\n}\n" ;  insertTxtC($re);};
sentp returns [String re]: 'ENDIF' {$re = " }";}| 'ELSE' sentlist 'ENDIF' {$re = "else {\n" +"\t\t" + $sentlist.re +"\n" +"}";};
sentpp returns [String re]: 'THEN' sentlist sentp {$re = "{" +"\n" +"\t"+ $sentlist.re + $sentp.re +"\n";} | sent {$re = "{" + "\n"+$sent.re + "\n}\n";};
sentppp returns [String re ]: 'WHILE' '(' expcond ')' sentlist 'ENDDO' {$re = "\n"+ "while (" + "expcond" + ");" +"\n" + $sentlist.re;}| IDENT '=' val1=doval ',' val2=doval ',' val3=doval sentlist 'ENDDO'{$re = $IDENT.text +" "+ $val1.doVal+", " + $val2.doVal+", " + $val3.doVal +";" + "\n"+ "\t" + $sentlist.re +"\n"+'}';};
exp returns [String re]: factor expp {$re=$factor.re+$expp.re;};
expp returns [String re]:  op exp expp {$re=" "+$op.c+" "+$exp.re+ $expp.re;}| {$re="";};
op returns[char c]: oparit {$c = $oparit.c;};
oparit returns[char c]: '+' {$c='+';} | '-' {$c='-';} | '*' {$c='*';}| '/' {$c='/';};
factor returns [String re]: IDENT factorp {$re=$IDENT.text+$factorp.re;}|simpvalue {$re=$simpvalue.s;}| '('exp')'{$re="("+$exp.re+")";};
factorp returns [String re]: '(' exp explist ')' {$re="("+$exp.re+$explist.re+")";}| {$re="";};
explist returns [String re]: ',' exp explist {$re=','+ $exp.re +$explist.re;}| {$re="";};

proc_call returns[String s]: 'CALL' IDENT subpparamlist {$s = $IDENT.text + " " + $subpparamlist.s ;};
subpparamlist returns[String s]: '(' exp explist ')' {$s= "(" + $exp.re + $explist.re +")";} | {$s="";};

subproglist returns [String re]: codproc subproglist {$re= $codproc.s + $subproglist.re;}| codfun subproglist {$re= $codfun.s + $subproglist.re;}| {$re="";};


codproc returns[String s]: 'SUBROUTINE' IDENT formal_paramlist dec_s_paramlist[$IDENT.text]  dcllist sent sentlist 'END' 'SUBROUTINE' IDENT {
    String t = "void " + $IDENT.text;
    if($formal_paramlist.esVoid==1){
      t +="(void)";}
    else{
      t += "("+$dec_s_paramlist.re+")";
    }
    t += "{\n"+ $dcllist.s+ $sent.re+ $sentlist.re +"}\n";
    $s=t;
    insertTxtC($s);
};


codfun returns[String s]: 'FUNCTION' IDENT '(' nomparamlist ')' tipo '::'  IDENT ';' dec_f_paramlist dcllist sent sentlist  IDENT '=' exp ';' 'END' 'FUNCTION' IDENT {
    $s= $tipo.s + $IDENT.text + "("+$dec_f_paramlist.re+")" +"{\n" + $dcllist.s+ $sent.re+ $sentlist.re + "}\n";
    insertTxtC($s);
};

//Modificado
expcond returns [String s]: factorcond expcondp {$s = $factorcond.s + $expcondp.s;};
expcondp returns [String s]: oplog expcond expcondp {$s = $oplog.s + $expcond.s + $expcondp.s;}| {$s="";};
oplog returns[String s]: '.OR.' {$s="||";}| '.AND.' {$s="&&";}| '.EQV.' {$s="!^";}| '.NEQV.' {$s="^";};
//Duda en factorcond no se si despues de ! del NOT tiene que haber un igual
factorcond returns[String s]: '(' expcond ')' {$s = "("+$expcond.s +")";}| '.NOT.' factorcond {$s= "!" + $factorcond.s;}| '.TRUE.' {$s="1";}| '.FALSE.' {$s="0";}| exp opcomp exp {$s= $exp.re + $opcomp.s + $exp.re;};
opcomp returns[String s]: '<' {$s="<";}| '>' {$s=">";}| '<=' {$s="<=";}| '>=' {$s=">=";}| '==' {$s="==";}| '/=' {$s="!=";};
doval returns [String doVal]: NUM_INT_CONST {$doVal=$NUM_INT_CONST.text;} | IDENT{$doVal=$IDENT.text;};



casos returns [String re=""]: 'CASE' casosp {
                                            if(($casosp.re).startsWith("\t" + "default")){
                                               $re+=$casosp.re;
                                            }
                                            else{
                                            $re="\t" + "case " + $casosp.re;}
                                            }
                                            | {$re+="";};
casosp returns [String re]: '(' etiquetas ')' sentlist casos {$re=$etiquetas.re + ":\n" + "\t\t" + "SENTENCIAS_SENTLIST" + "\n\t\t" + "break;" + "\n" + $casos.re;}| 'DEFAULT' sentlist {$re= "\t" + "default:" + "\n\t\t" + "SENTENCIAS_SENTLIST";};
etiquetas returns [String re]: simpvalue etiquetaspp {$re=$etiquetaspp.ant + $simpvalue.s + $etiquetaspp.re;}| ':' simpvalue{$re="<" + $simpvalue.s;};
etiquetasp returns [String re,String ant]: simpvalue {$re=" to " + $simpvalue.s; $ant="";}| {$re=""; $ant=">";};
etiquetaspp returns [String re, String ant]: ':' etiquetasp {$re=$etiquetasp.re; $ant=$etiquetasp.ant;}| listaetiquetas{$re=$listaetiquetas.re;$ant="";};
listaetiquetas returns [String re]: ',' simpvalue {$re=":\n" + "\t" + "case " + $simpvalue.s;}| {$re="";};
