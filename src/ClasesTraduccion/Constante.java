package ClasesTraduccion;

import java.util.ArrayList;
import java.util.List;

public class Constante {

    private String constantes;
    private List<String> allConstantes;

    public Constante(){
        this.constantes = "";
        allConstantes = new ArrayList<>();
    }

    public String getDefine() {
        return constantes;
    }

    public void setDefine(String define) {
        this.constantes = define;
    }

    public List<String> getAllConstantes() {
        return allConstantes;
    }


    public void addConstante(String nombre, String valor){
        constantes = "#define " + nombre + " " + valor + "\n" + constantes;
        allConstantes.add(nombre);
    }
    public void addConstante(String conjuntoConstante){
        String[] parts = conjuntoConstante.split(",");
        String cAux = "";
        for(String i:parts){
            allConstantes.add(i.substring(0,i.indexOf(" ")));
            cAux +=  "#define " + i + "\n";
        }
        constantes =  cAux +constantes ;
    }
}
