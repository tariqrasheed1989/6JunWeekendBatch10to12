import java.util.Scanner;

public class vid76Fibonacci 
{
	   public static void main(String[] args)
	    {
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Please enter 'a' value.");
	        int a=sc.nextInt();
	        System.out.println("Please enter 'b' value.");
	        int b=sc.nextInt();
	        int c=0;
	        System.out.print(a+", "+b+", ");
	        for (int i=2;i<10;i++)
	        {

	            c=a+b;
	            System.out.print(c+", ");
	            a=b;
	            b=c;

	        }

	    }

}
