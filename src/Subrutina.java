import java.util.HashMap;
import java.util.List;

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
    public String construirSubrutina(int esVoid, String ident, String paramlist, String dcllist, String sent, String sentlist, Cabeceras cab){
        String subrutinaPrima =  "void " + ident;
        if(esVoid==1){
            subrutinaPrima +="(void)";}
        else{
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
}
