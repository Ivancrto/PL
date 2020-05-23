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

    //Crea el string define con su nombre y valor cuando solo hay 1
    public void addConstante(String nombre, String valor){
        constantes = "#define " + nombre + " " + valor + "\n" + constantes;
        allConstantes.add(nombre);
    }
    //Cuando le llega un lista de constantes, este metodo separa las contantes y las escribe separadas en distintos define
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
