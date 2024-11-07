package Oct.ex_11102024_Operators;

public class Lab042 {
    public static void main(String[] args) {
        int a=10;
        int b=20;
       int c=a+b;  // operator + worked as a Arithmatic operator(sum) in case of int data type
        System.out.println(c);

        String name1="Yash";
        String name2="Dhurve";

        String fullName=name1+name2; // operator + used for Concatination  in case of String data type
        System.out.println(fullName);

        // + operator behaves differently depending on the data type
        // This is called as Operator Overloading

        System.out.println(name1+name2+a+b);
        System.out.println(a+b+name1+name2);
        System.out.println(name1+name2+(a+b));


    }
}
