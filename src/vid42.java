import java.util.Scanner;

public class vid42 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		int x, y;
		String name;
		System.out.println("What is your name?");
		name=sc.next();
		System.out.println(name+" X ki value dalen");
		x=sc.nextInt();
		System.out.println(name+" Y ki value dalen");
		y=sc.nextInt();
		
		System.out.println("Sum of "+x+" and "+y+" is "+(x+y)+".");
		
		
	}
}
