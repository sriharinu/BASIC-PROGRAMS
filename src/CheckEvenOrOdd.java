//Program to check whether integer num is Odd or even

import java.util.Scanner;
public class CheckEvenOrOdd {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int num = sc.nextInt();                 //enter number to be verified

        if (num % 2 == 0)
            System.out.println(num + " is Even number");
        else
            System.out.println(num+ " is Odd number");

    }

}
