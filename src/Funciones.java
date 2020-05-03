import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

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
    public void comprobacionArgumentos(String nombreF, String nombreA, Cabeceras cab){
        if(cab.getCabS().get(nombreF)==null){
            System.out.println("La función " + nombreF + " no fue declarado en la cabecera");
        } else if(cab.getCabS().get(nombreF).get(nombreA)==null){
            System.out.println("El argumento " + nombreA + " no fue declarado en la cabecera de " + nombreF  );
        }
    }


    public String construirFuncion(String tipo, String ident, String decFParamList, String dcllist, String sent, String sentlist, String exp, Cabeceras cab){
        String funcion = "";
        int index = cab.getCabOrdenadas().indexOf(ident);
        List<String> argumentos = cab.getArgsOrdenador().get(index);
        String argumentosF = "";
        if(!argumentos.isEmpty()){
            for(int i=0; i<=argumentos.size()-1; i++){
                if(i==argumentos.size()-1){
                    argumentosF += cab.getCabS().get(ident).get(argumentos.get(i));
                }else{
                    argumentosF += cab.getCabS().get(ident).get(argumentos.get(i)) + ", ";
                }
            }
            funcion= tipo + ident + "("+argumentosF+")" +"{\n" + dcllist+ sent+ sentlist + "return " + exp + ";\n}\n";
        }else{
            funcion= tipo + ident + "("+decFParamList+")" +"{\n" + dcllist+ sent+ sentlist + "return " + exp + ";\n}\n";
        }

        return funcion;
    }


    public String añadirPunterosCall(String idFun, String arg, Cabeceras cab, List<String> variables){
        String call = "";
        if(arg=="()"){
            call = idFun + arg;
        }else{
            call = idFun;
            String[] argP = arg.substring(1,arg.length()-1).split(",");
            int ind = 0;
            for(String i: cab.getArgsOrdenador().get(cab.getCabOrdenadas().indexOf(idFun))){
                if (cab.getCabS().get(idFun).get(i).contains("*") && variables.contains(argP[ind]) ){
                       arg= arg.replace(argP[ind], "&" + argP[ind]);
                }
                ind++;
            }
            call = idFun + arg;
        }

        return call;
    }

}
