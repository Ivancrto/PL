import java.util.*;

public class Cabeceras {

    public HashMap<String,HashMap<String,String>> cabS= new HashMap<> (); //K= nombre subrutina V=HashMap de argumentos-->(k=nombreArgumento v=traduccionC)
    public HashMap<String,String> tiposFun= new HashMap<> (); //Asocia el nombre de la funcion con su tipo

    public Cabeceras(){
    }

    public void addSub(String nombre, String end){
        if(!nombre.equals (end)){
            System.out.println("El nombre de la declaracion de la subrutina "+nombre+ " no coincide con el nombre usado en el cierre "+end);
        }
        if(cabS.get (nombre)!=null){  //Si se trata de la implementacion  --> PARTE DE IVAN

        }
        else{
            cabS.put (nombre,(new HashMap<String, String> ()));
        }

    }
    public void addArgValuesSub(String nombre, String tipo, String inOut,String arg){
        String tipoAux=tipo;
        HashMap<String, String> argsS= cabS.get (nombre);
        String cadC = argsS.get(arg);
        //Comprobamos que el valor declarado coincide con una entrada de el mapa que contiene los argumentos de la cabecera
        if(cadC.isEmpty ()){
            System.out.println ("El argumento "+ arg+ "no esta declarado en la cabecera de la subrutina "+ nombre);
        }
        if((tipo).startsWith("char")){
            tipoAux="char ";
        }
        cadC=tipoAux+inOut+arg;
        argsS.put (arg,cadC);
        cabS.put (nombre,argsS);
    }

    public void addArgSubFun(String nombre, String arg){
        HashMap<String, String> args = cabS.get (nombre);
        args.put (arg,"");
        cabS.put (nombre,args);
    }

    public void addFun(String nombre){
        cabS.put (nombre,new HashMap<> ());
    }
    public void addTipoFun(String nombre, String tipo, String nombreTipo, String end){
        if(!nombre.equals (end)){
            System.out.println("El nombre de la funcion "+nombre+" y el nombre declarado en el end "+end+" no coinciden.");
        }
        if(!(nombre).equals(nombreTipo)){
            System.out.println("El nombre de la funcion "+nombre+" y el nombre asociado al tipo devuelto "+nombreTipo+" no coinciden.");
        }
        else if((cabS.get (nombreTipo))==null){
            System.out.println("El nombre de la funcion "+nombreTipo+" no existe.");
        }
        tiposFun.put (nombre,tipo);
    }
    public void addArgValuesFun(String nombre,String tipo,String arg){
        HashMap<String, String> cS = cabS.get (nombre);
        String cadC = cS.get (arg);
        String corchetes="";
        String tipoAux=tipo;
        if((tipo).startsWith("char")){
            corchetes="[]";
            tipoAux="char ";
        }
        cadC=tipo + arg +corchetes;
        cS.put (arg,cadC);
    }

    @Override
    public String toString() {
        String r="";
        for (Map.Entry<String, HashMap<String, String>> declaration : cabS.entrySet()) {
            String nombre = declaration.getKey();
            HashMap<String,String> arguments = declaration.getValue();

            if(tiposFun.get (nombre)!=null){    //Si se trata de una funcion, esta tendra una entrada en la tabla, con lo que se cumplirá la condicion
                r+=tiposFun.get (nombre) + nombre+"( ";
            }
            else{   //En esta rama entrarán las subrutinas
                r+="void " + nombre+"( ";
            }
            if(arguments.isEmpty ()){   //En caso de que la subrutina no tenga argumentos
                r+="void );" + "\n";
            }
            else {   //En el casod de que si tengan argumentos
                Collection<String> values = arguments.values ();
                int i = 0;
                for (String args : values) {

                    if (i == (values.size () - 1)) {   //Si se trata del ultimo elemento
                        r += args + " );" + "\n";
                    } else {
                        r += args + ",";
                    }
                }
            }
        }

        return r;
    }
}
