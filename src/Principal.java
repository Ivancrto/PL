import java.util.ArrayList;
import java.util.List;

public class Principal {

    private String principal;
    private List<String> variablesPrincipal;

    public Principal(){

        this.principal = "";
        this.variablesPrincipal = new ArrayList<>();
    }

    public String getPrincipal() {
        return principal;
    }

    public List<String> getVariablesPrincipal() {
        return variablesPrincipal;
    }

    public void insertarVariable(String v){
        variablesPrincipal.add(v);
    }

    public String addPrincipal(String dcllist, String sent, String sentlist){

        principal = "void main (void){" + "\n" + dcllist + sent + sentlist + "\n"+ "}\n";
        return principal;
    }

}
