//Program to check whether string str is Palindrome or not
import java.util.Scanner;
public class PalindromeOfString {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String");

        String str = sc.nextLine();

        int size = str.length();
        int j= size-1;
        boolean flag = true;

        for(int i=0; i< size/2 ; i++)
        {
                if(str.charAt(i) != str.charAt(j))
                    flag = false;
                j--;
        }

        if(flag)
            System.out.println(str+ " is a palindrome");
        else
            System.out.println(str+ " is not a palindrome");
        }


}

