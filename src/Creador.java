import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class Creador {


    private Constante constantes;
    private Cabeceras cabezera;
    private Funciones funciones;
    private Subrutina subrutina;
    private String fusionFuncionSubrutina;
    private Principal principal;


    public Creador() {
        this.constantes = new Constante();
        this.cabezera = new Cabeceras();
        this.funciones = new Funciones();
        this.subrutina = new Subrutina();
        this.fusionFuncionSubrutina = "";
        this.principal = new Principal();
    }

    public Constante getConstantes() {
        return constantes;
    }

    public Cabeceras getCabezera() {
        return cabezera;
    }

    public void setCabezera(Cabeceras cabezera) {
        this.cabezera = cabezera;
    }

    public Funciones getFunciones() {
        return funciones;
    }

    public Subrutina getSubrutina() {
        return subrutina;
    }

    public String getFusionFuncionSubrutina() {
        return fusionFuncionSubrutina;
    }

    public Principal getPrincipal(){ return principal; }

    public void fusion(String textFS){
        this.fusionFuncionSubrutina += textFS + "\n";
    }

    File file = new File("codigo.c");
    FileWriter fr;
    public void insertTxtC(String t){
        {
            try {
                fr = new FileWriter(file, true);
                fr.write(t);
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }}

    public HashMap<String,Integer> mapVarSub= new HashMap<String,Integer>(); //Clave=nombre de la variable ; Valor=Numero de accesos;
    public HashMap<String, HashMap<String,String[]>> comprobacionPunteroFunc = new HashMap<String, HashMap<String,String[]>>();

    public void comprobar(String id){
        if(mapVarSub.get(id)==null){
            System.out.println("La variable "+id+" no coincide con ningun argumento.");
        }
        else{
            if(mapVarSub.get(id)==1){
                System.out.println("La declaracion de la variable "+id+" se ha repetido.");
            }
            mapVarSub.put(id,1);
        }
    }
    public void comprobarTodosSub(){    //Se encarga de comprobar que se han declarado todas las variables
        if(mapVarSub.containsValue(0)){
            System.out.println("Hay variables sin declarar.");
        }
    }

    //Este método se va a encargar de manejar las comillas de los STRING_CONST de fortran por comillas para el lenguaje C
    public String strConstComillas(String sConst){
        String cadenaCorrecta = "";
        String s = sConst;
        if(sConst.contains ("+")){
            String[] separacion = sConst.split("\\+");
            int ind = 0;
            for(String i: separacion){
                if(i.charAt(i.length()-1)==' ' && i.charAt(0)==' '){
                    i = i.substring(1, i.length()-1);
                }else if(i.charAt(0)==' '){
                    i = i.substring(1, i.length());
                }else if(i.charAt(i.length()-1)==' '){
                    i = i.substring(0, i.length()-1);
                }
                if(i.substring(1, i.length()-1).contains("\"")){
                    i = i.substring(1, i.length()-1).replaceAll("\"", "\\\\\"");
                    if(ind == separacion.length-1){
                        cadenaCorrecta += "\"" + i + "\"";
                    }else{
                        cadenaCorrecta += "\"" + i + "\" + ";
                    }
                }else{
                    if(i.charAt(0)=='\''){
                        i = "\"" +  i.substring(1, i.length()-1) +  "\"";
                    }
                    if(ind == separacion.length-1){
                        cadenaCorrecta +=   i;
                    }else{
                        cadenaCorrecta +=  i + " + ";
                    }
                }
                ind++;
            }
            cadenaCorrecta = cadenaCorrecta.replaceAll("\\\\\"\\\\\"","\\\\\"");
            cadenaCorrecta = cadenaCorrecta.replaceAll("''","'");
            return cadenaCorrecta;
        }
        else{
            cadenaCorrecta = cadenaCorrecta.replaceAll("\\\\\"\\\\\"","\\\\\"");
            cadenaCorrecta = cadenaCorrecta.replaceAll("''","'");
            return cadenaCorrecta;
        }

    }

    //Metodo para tabular todo el String que reciba
    public String tabulacion(String t) {
        int cont = 0;
        String fin= "";
        String [] lineas = t.split("\n");
        for(String linea: lineas){
            if(linea.contains("{")){
                String t1="";
                for (int i=0; i<cont; i++){
                    t1+= "\t";
                }
                cont= cont+1;
                fin+= t1 + linea+ "\n";
            }
            else{
                if(linea.contains("}")){
                    cont=cont-1;
                }
                String t1="";
                for (int i=0; i<cont; i++){
                    t1+= "\t";
                }
                fin += t1 + linea + "\n";
            }
        }
        return fin;
    }

}
