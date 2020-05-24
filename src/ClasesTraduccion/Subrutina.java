package ClasesTraduccion;

import java.util.List;

public class Subrutina {

    private String subrutinas;
    private boolean error;

    public Subrutina() {
        this.subrutinas = "";
        this.error = false;
    }

    public String getSubrutinas() {
        return subrutinas;
    }

    public void setSubrutinas(String subrutinas) {
        this.subrutinas = subrutinas;
    }

    public boolean isError() {
        return error;
    }
    //Realizamos las comprobaciones de la subrutina, si estas no se cumplen se muestra por consola el error y no obtendremos el fichero de la traducción
    public void comprobacion(String uno, String dos, int linea, int columna){
        if(!(uno).equals(dos)){
            System.out.println("Error en la linea "+  linea + " columna "+ columna + " el nombre de la implementación de la subrutina "+uno+ " no coincide con el nombre usado en su cierre "+dos);
            this.error = true;
        }
    }
    //Tras realizar la comprobación en el metodo anterior, creamos la subrutina como se espera en  C
    public String construirSubrutina(int esVoid, String ident, String paramlist, String dcllist, String sent, String sentlist, Cabeceras cab, String norman, int linea){


        String subrutinaPrima =  "void " + ident;
        if(esVoid==1){
            subrutinaPrima +="(void)";}
        else{
            comprobacionCAB(paramlist, norman,ident, linea);
            int index = cab.getCabOrdenadas().indexOf(ident);
            List<String> argumentos = cab.getArgsOrdenador().get(index);
            String argumentosF = "";
            for(int i=0; i<=argumentos.size()-1; i++){
                if(i==argumentos.size()-1 && cab.getCabS().get(ident).get(argumentos.get(i)).contains("*")){
                    argumentosF += cab.getCabS().get(ident).get(argumentos.get(i));
                    String arg = cab.getCabS().get(ident).get(argumentos.get(i));
                    sent = sent.replace(arg.substring(arg.indexOf("*")+1), arg.substring(arg.indexOf("*")));
                    sentlist = sentlist.replace(arg.substring(arg.indexOf("*")+1), arg.substring(arg.indexOf("*")));
                }else if(i==argumentos.size()-1){
                    argumentosF += cab.getCabS().get(ident).get(argumentos.get(i));
                }
                else if(cab.getCabS().get(ident).get(argumentos.get(i)).contains("*")){
                    argumentosF += cab.getCabS().get(ident).get(argumentos.get(i)) + ", ";
                    String arg = cab.getCabS().get(ident).get(argumentos.get(i));
                   String a2 = arg.substring(arg.indexOf("*"));
                    String a3 = arg.substring(arg.indexOf("*")+1);
                    sent = sent.replace(arg.substring(arg.indexOf("*")+1), arg.substring(arg.indexOf("*")));
                    sentlist = sentlist.replace(arg.substring(arg.indexOf("*")+1), arg.substring(arg.indexOf("*")));
                }else{
                    argumentosF += cab.getCabS().get(ident).get(argumentos.get(i)) + ", ";
                }
            }
            subrutinaPrima += "("+argumentosF+")";
        }
        subrutinaPrima +=  "{\n" + dcllist + sent+ sentlist +"}\n";
        return subrutinaPrima;
    }

    public void comprobacionCAB(String uno, String dos, String funcion, int linea){
        String[] one = uno.split(" ");
        String[] two = dos.split(" ");
        for(int i=0; i<=one.length-1; i++){
            if(!one[i].equals(two[i])){
                System.out.println("Error en la subrutina " + funcion + "en la linea " + linea +", el argumento de la cabecera es " + one[i] + " y se esperaba " + two[i] );
            }
        }

    }

}
