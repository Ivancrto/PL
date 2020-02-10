grammar practica;

r: (ENTEROS | SPACE | PUNTOFIJO | EXPONENCIAL | MIXTO)+;
EXPONENCIAL : ('-')? [0-9]+ ('E'|'e') ('-')? [0-9]+ {System.out.println("EXPONENCIAL");};
ENTEROS :  ('-')? [0-9]+ {System.out.println("ENTERO");}; //'NUM_INT_CONST' (' ')*
SPACE: (' ') {System.out.println(" ");};
PUNTOFIJO : ('-')?[0-9]+(.)[0-9]+ {System.out.println("PUNTO FIJO");};
MIXTO:  ('-')?[0-9]+ (.)[0-9]+ ('E'|'e')('-')?[0-9]+ {System.out.println("MIXTO");};