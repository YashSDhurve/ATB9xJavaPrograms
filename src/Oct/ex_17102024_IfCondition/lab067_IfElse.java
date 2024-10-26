package Oct.ex_17102024_IfCondition;

import java.util.Scanner;

public class lab067_IfElse {
    public static void main(String[] args) {

       // int age= 20;

        System.out.println("Enter your age");

        Scanner sc= new Scanner(System.in);
        int age = sc.nextInt();

        if(age>=18){
            System.out.println("Allowed to vote");
        }
        else{
            System.out.println("Note allowed to vote");
        }


    }
}
