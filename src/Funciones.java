public class Funciones {

    private String funciones;

    public Funciones() {
        this.funciones = "";
    }

    public String getFunciones() {
        return funciones;
    }

    public void setFunciones(String funciones) {
        this.funciones = funciones;
    }

    public void comprobacion(String uno, String dos, String tres, String cuatro){
        if(!(uno).equals(cuatro)){
            System.out.println("El nombre de la implementacion de la funcion "+uno+ " no coincide con el nombre usado en el cierre "+cuatro);
        }
        //Tercera comprobacion:
        if(!(uno).equals(dos)){
            System.out.println("El nombre de la funcion "+uno+" y el nombre asociado al tipo devuelto en su implementacion "+dos+" no coinciden con los declarados en la interfaz.");

        }
        //Tercera comprobacion parte dos:
        if(!(uno).equals(tres)){
            System.out.println("La variable de valor de retorno "+tres+" no coincide con el nombre de la funcion "+uno);
        }
    }
    public String construirFuncion(String tipo, String ident, String decFParamList, String dcllist, String sent, String sentlist, String exp){
        String funcion;
        funcion= tipo + ident + "("+decFParamList+")" +"{\n" + dcllist+ sent+ sentlist + "return " + exp + ";\n}\n";
        return funcion;
    }

}
