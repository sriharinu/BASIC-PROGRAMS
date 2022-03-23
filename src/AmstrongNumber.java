//Program to Check whether the number is Armstrong number  or not
import java.util.Scanner;

public class AmstrongNumber
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();

        int n=num;
        int sum = 0, rem;
        while(n!=0)
        {
            rem = n%10;
            sum+= Math.pow(rem,3);  //cube of a remainder by Math.pow(int x, int y);
            n = n/10;
        }
        if(sum == num)
            System.out.println(num+" is an Armstrong number");
        else
            System.out.println(num+" is not  an Armstrong number");

    }
}
