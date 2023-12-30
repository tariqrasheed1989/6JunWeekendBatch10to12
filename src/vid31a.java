import java.util.Scanner;

public class vid31a 
{
	public static void main(String[] args) 
	{
		int base, hight;
		float area;
		System.out.println("Please enter base and hight");
		Scanner sc=new Scanner(System.in);
		base=sc.nextInt();
		hight=sc.nextInt();
		
		area=(base*hight)/2f;
		
		System.out.println("Area of a triangle is "+area);
	}
}
