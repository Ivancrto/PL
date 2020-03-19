// java -jar antlr-4.7.2-complete.jar Simple.g4

grammar Simple;

@lexer::members{
	@Override
	public void notifyListeners(LexerNoViableAltException e) {
		String text = this._input.getText(Interval.of(this._tokenStartCharIndex, this._input.index()));
		String msg = "¿QUE COÑO ES ESTO TIO?, APRENDE A ESCRIBIR: '" + this.getErrorDisplay(text) + "'";
		ANTLRErrorListener listener = this.getErrorListenerDispatch();
		listener.syntaxError(this, (Object)null, this._tokenStartLine, this._tokenStartCharPositionInLine, msg, e);
	}
}

prog:   classDef ; // match one or more class definitions

classDef
    :   'class' ID '{' member '}' // a class has one or more members
        {System.out.println("class "+$ID.text);}
    ;

member
    :   'int' ID ';'  {System.out.println("var "+$ID.text);}
    ;


INT :   [0-9]+ ;
ID  :   [a-zA-Z]+ ;
WS  :   [ \t\r\n]+ -> skip ;

//Aqui vamos a manejar el tema de los errores
/*ERRORES: .+? /*{
            void prog(){
                classDef();
            }
            void classDef(){
                cmp("class");
                cmp(ID);
                cmp("{");
                member();
                cmp("}");
            }
            void member(){
                cmp("int");
                cmp("id");
                cmp(";");
            }
};*/