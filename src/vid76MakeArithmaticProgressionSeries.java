import java.util.Scanner;

public class vid76MakeArithmaticProgressionSeries 
{
	   public static void getAP(int start,int dif, int term)
	    {//5,10,15
	        for (int i=0;i<term;i++)
	        {
	            System.out.print(start+", ");
	            start=start+dif;
	        }

	        }
	    public static void main(String[] args)
	    {
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Please enter the starting number.");
	        int start=sc.nextInt();
	        System.out.println("Please enter the common difference among numbers.");
	        int difference=sc.nextInt();
	        System.out.println("Please enter the terms of number");
	        int term=sc.nextInt();
	        getAP(start,difference,term);
	    }

}
