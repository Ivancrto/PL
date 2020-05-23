package ClasesTraduccion;

import java.util.*;

public class Cabeceras {

    public List<String> cabOrdenadas= new LinkedList<> ();  //Almacena de forma ordenada la declaracion de las cabeceras
    public List<LinkedList<String>> argsOrdenador= new LinkedList<> ();   //La posicion correspponde con la de la funcion en cabOrdenadas
    public HashMap<String,HashMap<String,String>> cabS= new HashMap<> (); //K= nombre subrutina V=HashMap de argumentos-->(k=nombreArgumento v=traduccionC)
    public HashMap<String,String> tiposFun= new HashMap<> (); //Asocia el nombre de la funcion con su tipo
    private boolean error;  //True: si se ha producido un error durante la traduccion, Flase: en caso contrario

    public Cabeceras(){
        this.error = false;
    }


    //Metodo mediante el cual se añade una entrada en cabS con la clave "nombre", y se inserta de forma ordenada en cabOrdenadas
    public void addSub(String nombre){
        if(cabS.get (nombre)==null){
            HashMap mapa = new HashMap<String, String>();
            cabS.put (nombre,mapa);
            cabOrdenadas.add (nombre);
            int pos=cabOrdenadas.indexOf (nombre);
            argsOrdenador.add (pos,new LinkedList<> ());
        }

    }

    //Se encarga de mostrar el mensaje de error en caso de que no se use el mismo nombre de subrutina para la cabecera y el cierre de la declaracion de una subrutina
    public void compruebaCabSub(String nombre, String end, int linea, int columna){
        if(!nombre.equals (end)){
            System.out.println("Error en la linea "+  linea + " columna "+ columna + " el nombre de la declaracion de la subrutina "+nombre+ " no coincide con el nombre usado en el cierre "+end);
            this.error = true;
        }
    }


    //Añadimos los valores de los argumentos de una subrutina a su formato traducido en C, antes de su ejecución, se ha llamado antes a "addArgSubFun"
    static int contadorS = 0;
    public void addArgValuesSub(String nombre, String tipo, String inOut,String arg, int linea, int columna){
        String tipoAux=tipo;
        HashMap<String, String> argsS= cabS.get (nombre);
        String cadC = argsS.get(arg);
        //Comprobamos que el valor declarado coincide con una entrada de el mapa que contiene los argumentos de la cabecera
        if(cadC==null){
            System.out.println ("Error en la linea "+  linea + " columna "+ columna + ",el argumento "+ arg+ " no esta declarado en la cabecera de la subrutina "+ arg);
            this.error = true;
        }
        if((tipo).startsWith("char")){
            tipoAux="char ";
        }
        cadC=tipoAux+inOut+arg;
        argsS.put (arg,cadC);
        cabS.put (nombre,argsS);

        if(!argsOrdenador.get(cabOrdenadas.indexOf(nombre)).get(contadorS).equals(arg.trim())){
            String prueba = argsOrdenador.get(cabOrdenadas.indexOf(nombre)).get(contadorS);
            System.out.println("Error en la linea "+  linea + " columna "+ columna +", debido a la subrutina " + nombre + ", el argumento " + nombre + " no esta en el orden correcto");
            this.error=true;
        }
        contadorS++;
        if(contadorS>=argsOrdenador.get(cabOrdenadas.indexOf(nombre)).size()){
            contadorS=0;
        }


    }

    //Inicializamos las estructuras con los argumentos declarados en las cabeceras de la subrutina/funcion, para más adelante realizar comprobaciones sobre si se declara su tipo correctamente o si se declaran en el orden correcto
    public void addArgSubFun(String nombre, String arg){
        HashMap<String, String> args = cabS.get (nombre);
        if(cabS.get (nombre)==null){ //Como se va a llamar una vez por cada argumento a este método, debemos distinguir dos casos, que sea el primer argumento, y tengamos que inicializar el HashMap, o que no sea el primer argumento
            cabS.put (nombre,new HashMap<String, String>());
        }else{
            args.put (arg,"");
            cabS.put (nombre,args);
        }
        int pos=cabOrdenadas.indexOf (nombre);  //Como los indices coinciden, almacenamos el indice donde se encuentra el nombre de la subrutina para acceder a las variables ordenadas
        LinkedList<String> largs = argsOrdenador.get (pos);
        largs.addFirst (arg);
    }

    //Añadimos la cabecera de una funcion, inicializando con ella cabS, cabOrdenadas y argsOrdenador
    public void addFun(String nombre){
        cabS.put (nombre,new HashMap<> ());
        cabOrdenadas.add (nombre);
        int pos=cabOrdenadas.indexOf (nombre);
        argsOrdenador.add (pos,new LinkedList<> ());
    }

    //Asociamos el tipo a la funcion correspondiente, notificando además los errores correspondientes en caso de que sea necesario
    public void addTipoFun(String nombre, String tipo, String end, String nombreTipo, int linea, int columna){

        if(!nombre.equals(end)){
            System.out.println("Error en la linea "+  linea + " columna "+ columna + " el nombre de la declaracion de la funcion "+nombre+ " no coincide con el nombre usado en el cierre "+end);
            this.error = true;
        }
        if(!(nombre).equals(nombreTipo)){
            System.out.println("Error en la linea "+  linea + " columna "+ columna + "el nombre de la funcion "+nombre+" y el nombre asociado al tipo devuelto "+nombreTipo+" no coinciden.");
            this.error = true;
        }
        else if((cabS.get (nombreTipo))==null){
            System.out.println("Error en la linea "+  linea + " columna "+ columna +" el nombre de la funcion "+nombreTipo+" no existe.");
            this.error = true;
        }
        tiposFun.put (nombre,tipo);

    }

    //Añadimos los argumentos asociados a una funcion, notificando error, en caso de que no se realice correctamente la declaracion de argumentos
    static int contador = 0;
    public void addArgValuesFun(String nombre,String tipo,String arg, int linea, int columna){  //Le asignamos un formato a los argumentos de la declaracion de funciones

        HashMap<String, String> cS = cabS.get (nombre);
        if(cS.get (arg)==null){
            System.out.println("Error en la linea "+  linea + " columna "+ columna +" el argumento "+arg+"no se corresponde a ninguno que se haya declarado en la cabecera de la funcion "+arg);
            this.error = true;
        }
        String cadC = cS.get (arg);
        String corchetes="";
        String tipoAux=tipo;
        if((tipo).startsWith("char")){
            corchetes="[]";
            tipoAux="char ";
        }
        cadC=tipo + arg +corchetes;
        cS.put (arg,cadC);

        int p = argsOrdenador.get(cabOrdenadas.indexOf(nombre)).size();
        if(!argsOrdenador.get(cabOrdenadas.indexOf(nombre)).get(contador).equals(arg.trim())){
            String prueba = argsOrdenador.get(cabOrdenadas.indexOf(nombre)).get(contador);
            System.out.println("Error en la linea "+  linea + " columna "+ columna +", debido a la funcion " + nombre + ", el argumento " + nombre + " no esta en el orden correcto");
            this.error=true;
        }
        contador++;
        if(contador>=argsOrdenador.get(cabOrdenadas.indexOf(nombre)).size()){
            contador=0;
        }

    }

    @Override
    public String toString() {

        String r="";
        for (String nombre:cabOrdenadas) {
            HashMap<String, String> arguments = cabS.get (nombre);
            if(tiposFun.get (nombre)!=null){    //Si se trata de una funcion, esta tendra una entrada en la tabla, con lo que se cumplirá la condicion
                r+=tiposFun.get (nombre) + nombre+"( ";
            }
            else{   //En esta rama entrarán las subrutinas
                r+="void " + nombre+"( ";
            }
            if(arguments.isEmpty ()){   //En caso de que la subrutina no tenga argumentos
                r+="void );" + "\n";
            }
            else {   //En el caso de que si tengan argumentos
                List<String> argsOrd= argsOrdenador.get (cabOrdenadas.indexOf (nombre));
                int i = 0;
                for (String args : argsOrd) {
                    if (i == (argsOrd.size () -1)) {   //Si se trata del ultimo elemento
                        r +=  arguments.get(args) + " );" + "\n";
                    } else {
                        r +=   arguments.get(args) + ", " +
                                "" ;
                    }
                    i++;
                }
            }
        }

        return r;
    }

    //Método que devuelve true en caso de que se haya producido un error durante la traduccion del codigo
    public boolean isError() {
        return error;
    }

    //Getters/Setters...
    public List<String> getCabOrdenadas() {
        return cabOrdenadas;
    }

    public void setCabOrdenadas(List<String> cabOrdenadas) {
        this.cabOrdenadas = cabOrdenadas;
    }

    public HashMap<String, HashMap<String, String>> getCabS() {
        return cabS;
    }

    public void setCabS(HashMap<String, HashMap<String, String>> cabS) {
        this.cabS = cabS;
    }

    public HashMap<String, String> getTiposFun() {
        return tiposFun;
    }

    public void setTiposFun(HashMap<String, String> tiposFun) {
        this.tiposFun = tiposFun;
    }

    public List<LinkedList<String>> getArgsOrdenador() {
        return argsOrdenador;
    }
}
