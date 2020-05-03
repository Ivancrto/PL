
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
prg: 'PROGRAM' IDENT ';' dcllist cabecera sent sentlist 'END' 'PROGRAM' IDENT subproglist { System.out.println(creador.getConstantes().getDefine());
    System.out.println(cab.toString());
    System.out.println(creador.getFusionFuncionSubrutina());

insertTxtC(tabulacion("\n" + $cabecera.re + "\n" + $subproglist.re  + "\n" + "void main (void){" + "\n" + $dcllist.s + $sent.re + $sentlist.re + "\n"+ "}\n"));};

dcllist returns[String s]: dcllistp {$s = $dcllistp.re ;};
dcllistp returns[String re]: dcl dcllistp {$re = $dcl.re+ " " + $dcllistp.re ;}| {$re="";};

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
simpvalue returns[String s]: NUM_INT_CONST {$s= $NUM_INT_CONST.text;}| NUM_REAL_CONST {$s= $NUM_REAL_CONST.text;}| STRING_CONST {$s= strConstComillas($STRING_CONST.text);}
                |NUM_INT_CONST_B {$s= "0b" + $NUM_INT_CONST_B.text.substring(2,$NUM_INT_CONST_B.text.length()-1)  ;} | NUM_INT_CONST_O {$s= "0o" + $NUM_INT_CONST_O.text.substring(2,$NUM_INT_CONST_O.text.length()-1)  ;}| NUM_INT_CONST_H {$s= "0x" + $NUM_INT_CONST_H.text.substring(2,$NUM_INT_CONST_H.text.length()-1)  ;};
defvar returns [String re]: tipo '::' varlist[$tipo.cl] ';' defvar {$re = $tipo.t + $varlist.s + ";\n" + $defvar.re;
                                                            //insertTxtC($tipo.t + $varlist.s + ";\n");
                                                            }
                                                            | {$re="";} ;
tipo returns[String t, String cl]: 'INTEGER' {$t="int "; $cl="";}| 'REAL' {$t="float "; $cl="";}| 'CHARACTER' charlength {$t= "char "; $cl=$charlength.s;};
charlength returns[String s]: '(' NUM_INT_CONST ')' {$s='['+ $NUM_INT_CONST.text +"] ";}| {$s="";};
varlist [String cl] returns [String s]: IDENT init varlistp[$cl]{$s = $IDENT.text+ $cl + $init.s + $varlistp.s;};
varlistp [String cl]returns [String s]: ',' varlist[$cl] {$s= ", " + $varlist.s;}| {$s="";};
init returns [String s]: '=' simpvalue {$s= " = " + $simpvalue.s;}| {$s= "";};

//Declaracion de SUBRUTINE en la interfaz
decproc: 'SUBROUTINE' id1=IDENT formal_paramlist[$id1.text,true] dec_s_paramlist[$id1.text] 'END' 'SUBROUTINE' id2=IDENT {cab.addSub($id1.text,$id2.text); };

formal_paramlist[String id, boolean declaration] returns [int esVoid]:'(' nomparamlist[$id,$declaration] ')'{  $esVoid=0; }| {$esVoid=1;};

nomparamlist[String id,boolean declaration]: IDENT nomparamlistp[$id,$declaration] {
    if($declaration){   //Se trata de una declaracion de cabecera en la interfaz
        cab.addArgSubFun($id,$IDENT.text);
    }
    else{   //Implementacion--> PARTE DE IVAN

    }
};
nomparamlistp[String id, boolean declaration]: ',' nomparamlist[$id,$declaration] | ;
//hacer ivan
dec_s_paramlist [String id] returns[String re]: tipo ',' 'INTENT' '(' tipoparam ')' IDENT ';' {cab.addArgValuesSub($id,$tipo.t, $tipoparam.c,$IDENT.text);}  dec_s_paramlist[$id]  {$re="";} |{$re="";} ;
tipoparam returns [String c]: 'IN' {$c="";}| 'OUT' {$c="*";}| 'INOUT'{$c="*";};


//Falta comprobar que la ultima sentencia tiene el valor de IDENT
decfun: 'FUNCTION' id1=IDENT {cab.addFun($id1.text);}'(' nomparamlist[$id1.text,true] ')' tipo '::' id2=IDENT ';' dec_f_paramlist[$id1.text] 'END' 'FUNCTION' id3=IDENT {cab.addTipoFun($id1.text,$tipo.t,$id2.text, $id3.text);};
dec_f_paramlist[String id] returns[String re]: tipo ',' 'INTENT' '(' 'IN' ')' IDENT ';' {cab.addArgValuesFun($id,$tipo.t,$IDENT.text);} dec_f_paramlist[$id] {$re="";}  |{$re="";} ;


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
sentppp returns [String re ]: 'WHILE' '(' expcond ')' sentlist 'ENDDO' {$re = "\n" +"while (" + $expcond.s + "){" +"\n"  +($sentlist.re) +  "}\n";}| IDENT '=' val1=doval ',' val2=doval ',' val3=doval sentlist 'ENDDO'{$re = "for("+$IDENT.text +"="+ $val1.doVal+"; "+$IDENT.text+"!="+ $val2.doVal+"; "+$IDENT.text+ "=" +$IDENT.text+"-"+$val3.doVal+"){" + "\n"+ $sentlist.re +"\n"+"}\n";};
exp returns [String re]: factor expp {$re=$factor.re+$expp.re;};
expp returns [String re]:  op exp expp {$re=" "+$op.c+" "+$exp.re+ $expp.re;}| {$re="";};
op returns[char c]: oparit {$c = $oparit.c;};
oparit returns[char c]: '+' {$c='+';} | '-' {$c='-';} | '*' {$c='*';}| '/' {$c='/';};
factor returns [String re]: IDENT factorp {$re=$IDENT.text+$factorp.re;}|simpvalue {$re=$simpvalue.s;}| '('exp')'{$re="("+$exp.re+")";};
factorp returns [String re]: '(' exp explist ')' {$re="("+$exp.re+$explist.re+")";}| {$re="";};
explist returns [String re]: ',' exp explist {$re=','+ $exp.re +$explist.re;}| {$re="";};

proc_call returns[String s]: 'CALL' IDENT subpparamlist {$s = $IDENT.text + $subpparamlist.s ;};
subpparamlist returns[String s]: '(' exp explist ')' {$s= "(" + $exp.re + $explist.re +")";} | {$s="()";};

subproglist returns [String re]: codproc subproglist {$re= $codproc.s + $subproglist.re;}| codfun subproglist {$re= $codfun.s + $subproglist.re;}| {$re="";};


codproc returns[String s]: 'SUBROUTINE' id1=IDENT formal_paramlist[$id1.text,false] dec_s_paramlist[$id1.text]  dcllist sent sentlist 'END' 'SUBROUTINE' id2=IDENT {

    creador.getSubrutina().comprobacion($id1.text,$id2.text);//Comprobacion:
    creador.fusion(creador.getSubrutina().construirSubrutina($formal_paramlist.esVoid,$id1.text,$dec_s_paramlist.re ,$dcllist.s, $sent.re, $sentlist.re));

};

//AQUI EN UN FUTURO CREO QUE DEBERÍAMOS COMPROBAR QUE LOS IDENT SON IGUALES, PARA QUE NO SE LLAME UNA PIPO, EL OTRO ANTOIO Y OTRO PANTOJA (p.ej)
codfun returns[String s]: 'FUNCTION' id1=IDENT '(' nomparamlist[$id1.text,false] ')' tipo '::'  id2=IDENT ';' dec_f_paramlist[$id1.text] dcllist sent sentlist  id3=IDENT '=' exp ';' 'END' 'FUNCTION' id4=IDENT {

    creador.getFunciones().comprobacion($id1.text,$id2.text,$id3.text,$id4.text);//Comprobacion:
    creador.fusion(creador.getFunciones().construirFuncion( $tipo.t, $id1.text, $dec_f_paramlist.re, $dcllist.s, $sent.re, $sentlist.re,  $exp.re));


};

//Modificado
expcond returns [String s]: factorcond expcondp {$s = $factorcond.s + $expcondp.s;};
expcondp returns [String s]: oplog expcond expcondp {$s = $oplog.s + $expcond.s + $expcondp.s;}| {$s="";};
oplog returns[String s]: '.OR.' {$s="||";}| '.AND.' {$s="&&";}| '.EQV.' {$s="!^";}| '.NEQV.' {$s="^";};
//Duda en factorcond no se si despues de ! del NOT tiene que haber un igual
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
casosp returns [String re]: '(' etiquetas ')' sentlist casos {$re=$etiquetas.re + ":\n" + $sentlist.re + "\n" + "break;" + "\n" + $casos.re;}| 'DEFAULT' sentlist {$re= "default:" + "\n" +  $sentlist.re;};
etiquetas returns [String re]: simpvalue etiquetaspp {$re=$etiquetaspp.ant + $simpvalue.s + $etiquetaspp.re;}| ':' simpvalue{$re="<" + $simpvalue.s;};
etiquetasp returns [String re,String ant]: simpvalue {$re=" to " + $simpvalue.s; $ant="";}| {$re=""; $ant=">";};
etiquetaspp returns [String re, String ant]: ':' etiquetasp {$re=$etiquetasp.re; $ant=$etiquetasp.ant;}| listaetiquetas{$re=$listaetiquetas.re;$ant="";};
listaetiquetas returns [String re]: ',' simpvalue {$re=":\n" + "case " + $simpvalue.s;}| {$re="";};
