package Oct.ex_17102024_IfCondition;

import java.util.Scanner;

public class Lab_071 {
    public static void main(String[] args) {
        // Take input from the user
        // check whether the number is even or odd

        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        if(number%2 == 0){
            System.out.println("The number is even");
        }
        else {
            System.out.println("The number is odd");
        }

     sc.close();

    }

}
