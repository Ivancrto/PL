
public class Principal {

    private String principal;

    public Principal(){
        this.principal = "";
    }

    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String main) {
        this.principal = main;
    }

    public String addPrincipal(String s){
        this.principal = "void main (void){" + "\n" + s + "\n"+ "}\n";
        return principal;
    }

}
