// java -jar antlr-4.7.2-complete.jar grupal.g4

grammar grupal;

r:(IDENT|ENTRECOMILLADOS|COMMENT|ENTEROS | SPACE | PUNTOFIJO | EXPONENCIAL | MIXTO  | NUM_REAL_CONST | NUM_INT_CONST | STRING_CONST|STRING_CONST2)+;

//ELEMENTOS ENTRECOMILLADOS

ENTRECOMILLADOS: '"'.*?'"' {
                           String sub= (String)getText().subSequence(1,getText().length()-1);
                           System.out.println("SUBS:"+sub);
};


//-------------------------------------------ELEMENTOS ENTRECOMILLADOS

//IDENTIFICADORES
IDENT:VOCAB(VOCAB|'_'|NUM)+ {System.out.println("IDENT:"+getText());};

fragment
VOCAB:[a-nA-No-z];

fragment
NUM:[0-9];
//----------------------------------------------------IDENTIFICADORES

//COMENTARIOS
//¿Cómo se hace lo de fin de linea?

COMMENT:'!'.*?[\n] {System.out.println("COMMENT:"+getText());};
//----------------------------------------------------COMENTARIOS

EXPONENCIAL : ('-')? [0-9]+ ('E'|'e') ('-')? [0-9]+ {System.out.println("EXPONENCIAL");};

ENTEROS :  ('-')? [0-9]+ {System.out.println("ENTERO");}; //'NUM_INT_CONST' (' ')*

SPACE: (' ') {System.out.println(" ");};

PUNTOFIJO : ('-')?[0-9]+(.)[0-9]+ {System.out.println("PUNTO FIJO");};

MIXTO:  ('-')?[0-9]+ (.)[0-9]+ ('E'|'e')('-')?[0-9]+ {System.out.println("MIXTO");};

NUM_INT_CONST: 'NUM_INT_CONST' {System.out.println("NUM_INT_CONST");};

NUM_REAL_CONST: 'NUM_REAL_CONST' {System.out.println("NUM_REAL_CONST");};

STRING_CONST:('\'')([a-zA-Z]+|[0-9]+|' '|'\'\''|'"')+('\'') | ('"')([a-zA-Z]+|[0-9]+|' '|'""'|'\'')+('"') {
    if(getText().charAt(0)=='\''{
      int longuitud = getText().length();
      String s = getText().substring(1, longuitud-1);
      String s2= s.replace("\'\'", "\'");
      System.out.println(s2);};
    }
    if(getText().charAt(0)=='\"'{
      int longuitud = getText().length();
      String s = getText().substring(1, longuitud-1);
      String text = s.replace("\"\"", "\"");
      System.out.println(text);
    }};
    

    
