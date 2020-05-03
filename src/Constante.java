
public class Constante {

    private String constantes;

    public Constante(){
        this.constantes = "";
    }

    public String getDefine() {
        return constantes;
    }

    public void setDefine(String define) {
        this.constantes = define;
    }

    public void addConstante(String nombre, String valor){
        constantes = "#define " + nombre + " " + valor + "\n" + constantes;
    }
    public void addConstante(String conjuntoConstante){
        String[] parts = conjuntoConstante.split(",");
        String cAux = "";
        for(String i:parts){
            cAux +=  "#define " + i + "\n";
        }
        constantes =  cAux +constantes ;
    }
}
