
public class Subrutina {

    private String subrutinas;

    public Subrutina() {
        this.subrutinas = "";
    }

    public String getSubrutinas() {
        return subrutinas;
    }

    public void setSubrutinas(String subrutinas) {
        this.subrutinas = subrutinas;
    }

    public void comprobacion(String uno, String dos){
        if(!(uno).equals(dos)){
            System.out.println("El nombre de la implementación de la subrutina "+uno+ " no coincide con el nombre usado en su cierre "+dos);
        }
    }
    public String construirSubrutina(int esVoid, String ident,String paramlist, String dcllist, String sent, String sentlist ){
        String subrutinaPrima =  "void " + ident;
        if(esVoid==1){
            subrutinaPrima +="(void)";}
        else{
            subrutinaPrima += "("+paramlist+")";
        }
        subrutinaPrima +=  "{\n" + dcllist + sent+ sentlist +"}\n";
        return subrutinaPrima;
    }
}
