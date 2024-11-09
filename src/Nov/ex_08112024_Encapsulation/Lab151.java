package Nov.ex_08112024_Encapsulation;

public class Lab151 {
    public static void main(String[] args) {
        Website w=new Website("admin", "good password");

       String pass= w.viewCreds(false);
        System.out.println(pass);

    }
}
