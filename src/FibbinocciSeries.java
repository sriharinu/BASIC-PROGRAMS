//Program to find Fibinocci series upto n (also nth fbbinocci series term)

import java.util.Scanner;
public class FibbinocciSeries
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n= sc.nextInt();

        int F[] = new int[n];
        F[0]=1;
        F[1]=1;
        System.out.print(F[0]+ " " +F[1]);


        for(int i=2; i<=n-1; i++)
        {
            F[i]= F[i-1]+F[i-2];  //f(n) = f(n-1) + f(n-2)
            System.out.print(" "+F[i]);    // Prints Fibbinocci series upto n 
        }
        
        System.out.println("\nThe nth term of Fibbinocci series is: "+F[n-1]);

    }
}
