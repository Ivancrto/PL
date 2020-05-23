package ClasesTraduccion;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Creador {


    private Constante constantes;
    private Cabeceras cabecera;
    private Funciones funciones;
    private Subrutina subrutina;
    private String fusionFuncionSubrutina;
    private Principal principal;
    public static String nameFichero;

    public Creador() {
        this.constantes = new Constante();
        this.cabecera = new Cabeceras();
        this.funciones = new Funciones();
        this.subrutina = new Subrutina();
        this.fusionFuncionSubrutina = "";
        this.principal = new Principal();
    }

    public Constante getConstantes() {
        return constantes;
    }

    public Cabeceras getCabecera() {
        return cabecera;
    }

    public void setCabecera(Cabeceras cabezera) {
        this.cabecera = cabezera;
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
    //Crea el fichero si la cabecera no contiene un error
    public void crear(){
        if(!cabecera.isError() && !subrutina.isError() && !funciones.isError()){
            File file = new File("src/ResultadosTraduccion/" + nameFichero.substring(0,nameFichero.indexOf("."))+".c");
            file.delete();
            FileWriter fr;
            try {
                fr = new FileWriter(file, true);
                fr.write(tabulacion(constantes.getDefine() + "\n" + cabecera.toString() + "\n"+  fusionFuncionSubrutina + principal.getPrincipal() ));
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }


    //Este método se va a encargar de manejar las comillas de los STRING_CONST de fortran por comillas para el lenguaje C
    public String strConstComillas(String sConst){
        String cadenaCorrecta = "";
        if(sConst.contains ("+")){
            String[] separacion = sConst.split("\\+");
            for(int i=0; i<=separacion.length-1; i++){
                if(separacion.length-1==i){
                    cadenaCorrecta += SimpleDoble(separacion[i]);
                }else{
                    cadenaCorrecta += SimpleDoble(separacion[i])+ " + ";
                }
            }
            return  cadenaCorrecta ;
        }
        else{
            cadenaCorrecta += SimpleDoble(sConst);
            return  cadenaCorrecta ;
        }
    }

    public String SimpleDoble(String s){

        if(s.trim().charAt(0)=='\"'){
            s = s.trim().replace("\"\"", "\\\"");        
            return "\"" + s.substring(1, s.length()-1) + "\"";
        }else{
            s = s.trim().replace("''", "'");
            s = s.replace("\"", "\\\"");
            return  "\"" + s.substring(1, s.length()-1) + "\"";
        }
    }



    //Metodo para tabular todo el String que reciba
    public String tabulacion(String t) {
        int cont = 0;
        String fin= "";
        String [] lineas = t.split("\n");
        for(String linea: lineas){
            if(linea.contains("{")){ //Las siguientes linea
                String t1="";
                for (int i=0; i<cont; i++){
                    t1+= "\t";
                }
                cont= cont+1;
                fin+= t1 + linea+ "\n";
            }
            else{
                if ((linea.contains(":") && linea.contains("case")) || linea.contains("default")){
                    cont=cont-1;
                    String t1="";
                    for (int i=0; i<cont; i++){
                        t1+= "\t";
                    }
                    cont=cont+1;
                    fin += t1 + linea + "\n";
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
        }
        return fin;
    }

}
