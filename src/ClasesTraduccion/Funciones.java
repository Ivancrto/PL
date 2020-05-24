package ClasesTraduccion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Funciones {

    private String funciones;
    private boolean error;

    public Funciones() {
        this.funciones = "";
        this.error = false;
    }

    public String getFunciones() {
        return funciones;
    }

    public void setFunciones(String funciones) {
        this.funciones = funciones;
    }

    public boolean isError() {
        return error;
    }
    //Mediante el siguiente metodo, realizamos todas las comprobaciones necesarias, si no se cumplen lanzara un mensaje por
    //consola y no obtendremos el fichero de salida
    public void comprobacion(String uno, String dos, String tres, String cuatro, int linea, int columna){
        if(!(uno).equals(cuatro)){
            System.out.println("Error en la linea "+  linea + " columna "+ columna +" el nombre de la implementacion de la funcion "+uno+ " no coincide con el nombre usado en el cierre "+cuatro);
            this.error = true;
        }
        //Tercera comprobacion:
        if(!(uno).equals(dos)){
            System.out.println("Error en la linea "+  linea + " columna "+ columna +" el nombre de la funcion "+uno+" y el nombre asociado al tipo devuelto en su implementacion "+dos+" no coinciden con los declarados en la interfaz.");
            this.error = true;
        }
        //Tercera comprobacion parte dos:
        if(!(uno).equals(tres)){
            System.out.println("Error en la linea "+  linea + " columna "+ columna + " la variable de valor de retorno "+tres+" no coincide con el nombre de la funcion "+uno);
            this.error = true;
        }
    }
    //Mediante el siguiente metodo, realizamos todas las comprobaciones necesarias de los argumentos, si no se cumplen lanzara un mensaje por
    //consola y no obtendremos el fichero de salida
    public void comprobacionArgumentos(String nombreF, String nombreA, Cabeceras cab, int linea, int columna){
        if(cab.getCabS().get(nombreF)==null){
            System.out.println("Error en la linea "+  linea + " columna "+ columna + " no se declaro la función "+ nombreF);
            this.error = true;
        }
        if(cab.getCabS().get(nombreF)==null){
            System.out.println("Error en la linea "+  linea + " columna "+ columna + " la función " + nombreF + " no fue declarado en la cabecera");
            this.error = true;
        } else if(cab.getCabS().get(nombreF).get(nombreA)==null){
            System.out.println("Error en la linea "+  linea + " columna "+ columna + " el argumento " + nombreA + " no fue declarado en la cabecera de " + nombreF  );
            this.error = true;
        }
    }

    //Despues de realizar las comprobaciones, con los dos metodos de arriba, creamos la función como debería de ser en C
    public String construirFuncion(String tipo, String ident, String decFParamList, String dcllist, String sent, String sentlist, String exp, Cabeceras cab, String norman, int linea){
        String funcion = "";
        int index = cab.getCabOrdenadas().indexOf(ident);
        List<String> argumentos = cab.getArgsOrdenador().get(index);
        String argumentosF = "";
        if(!argumentos.isEmpty()){
            comprobacionCAB(decFParamList,norman,ident, linea);
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

    public void comprobacionCAB(String uno, String dos, String funcion, int linea){
        String[] one = uno.split(" ");
        String[] two = dos.split(" ");
        for(int i=0; i<=one.length-1; i++){
            if(!one[i].equals(two[i])){
                System.out.println("Error en la funcion " + funcion + " en la linea " + linea +", el argumento de la cabecera es " + one[i] + " y se esperaba " + two[i] );
            }
        }

    }



    //Parte de notable, añadir los punteros y & para la asignacion de valor en los punteros
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
