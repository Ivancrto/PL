grammar practica;

r: (ENTEROS | SPACE | PUNTOFIJO | EXPONENCIAL | MIXTO|STRING_CONST|STRING_CONST2)+;
EXPONENCIAL : ('-')? [0-9]+ ('E'|'e') ('-')? [0-9]+ {System.out.println("EXPONENCIAL");};
ENTEROS :  ('-')? [0-9]+ {System.out.println("ENTERO");}; //'NUM_INT_CONST' (' ')*
SPACE: (' ') {System.out.println(" ");};
PUNTOFIJO : ('-')?[0-9]+(.)[0-9]+ {System.out.println("PUNTO FIJO");};
MIXTO:  ('-')?[0-9]+ (.)[0-9]+ ('E'|'e')('-')?[0-9]+ {System.out.println("MIXTO");};
//Sandra: Lo hice en 2 tokens, sale todo correcto
//String de comillas simples
STRING_CONST:('\'')([a-zA-Z]|[0-9]|' '|'\'\''|'"')+('\'') {
    int longuitud = getText().length();
    String s = getText().substring(1, longuitud-1);
    String s2= s.replace("\'\'", "\'");
    System.out.println(s2);};
//String de comillas dobles
STRING_CONST2: ('"')([a-zA-Z]|[0-9]|' '|'""'|'\'')+('"') {
    int longuitud = getText().length();
    String s = getText().substring(1, longuitud-1);
    String text = s.replace("\"\"", "\"");
    System.out.println(text);};
