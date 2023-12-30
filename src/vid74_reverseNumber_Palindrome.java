import java.util.Scanner;

public class vid74_reverseNumber_Palindrome 
{
    public static int reverse(int n)
    {
        int rev=0;

        while (n>0)
        {
         rev=rev*10+n%10;
         n=n/10;
        }
//        System.out.println(rev);
        return rev;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the number.");
        int num= sc.nextInt();
        System.out.println(reverse(num));

        if (num==reverse(num))
        {
            System.out.println(num+" is a palindrome number.");
        }
        else
        {
            System.out.println(num+" is not a palindrome number.");
        }


    }

}
