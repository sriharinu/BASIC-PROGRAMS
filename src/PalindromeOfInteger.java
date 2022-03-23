//Program to check whether integer num is Palindrome or not

import java.util.Scanner;
public class PalindromeOfInteger {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int n = num;
        int rev=0;

        while(n!=0)
        {
            rev = (rev*10) + n%10;
            n = n/10;

        }
        if (rev == num)
           System.out.println(num+ " is a palindrome");
        else
            System.out.println(num+ " is not a palindrome");


    }
}
