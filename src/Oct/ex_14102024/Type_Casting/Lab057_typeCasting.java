package Oct.ex_14102024.Type_Casting;

public class Lab057_typeCasting {
    public static void main(String[] args) {
        byte b=10;
        int i = b; // Widening  - Implicit casting done by JVM

        short s=10000;
        byte val=(byte)s;
        System.out.println(val); // Narrowing -  Explicit casting done by user

        int course =100;
        float GST = 18.5f;

        int total_price= course+(int) GST; // narrowing  - explicit typing casting  done by user
        System.out.println(total_price);  //output is 118, here we lost 0.5 due to narrowing type casting

    }
}
