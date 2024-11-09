package Nov.ex_08112024_Encapsulation;

public class Website {
    private String username;
    private String password;

    public Website(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String viewCreds(boolean isAuth){
        if (isAuth){
            return username+" "+password;
        }
        else {
            return "Invalid crdentials";
        }
    }
}
