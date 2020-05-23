package ClasesTraduccion;

import java.util.ArrayList;
import java.util.List;

public class Principal {

    private String principal;
    private List<String> variablesPrincipal;
    //Constructor de principal
    public Principal(){

        this.principal = "";
        this.variablesPrincipal = new ArrayList<>();
    }
    //Metodo get
    public String getPrincipal() {
        return principal;
    }
    //Metodo que devuelve la lista de variables
    public List<String> getVariablesPrincipal() {
        return variablesPrincipal;
    }
    //Metodo que inserta la variable en la lista de variables del main
    public void insertarVariable(String v){
        variablesPrincipal.add(v);
    }

    //Se le añade los tokens del main de la gramatica en un mismo string por este metodo
    public String addPrincipal(String dcllist, String sent, String sentlist){

        principal = "void main (void){" + "\n" + dcllist + sent + sentlist + "\n"+ "}\n";
        return principal;
    }

}
