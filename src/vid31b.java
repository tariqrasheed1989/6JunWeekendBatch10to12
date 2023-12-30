import java.util.Scanner;

public class vid31b 
{
	public static void main(String[] args) 
	{
		int a,b,c;
		float s;
		double area;
		System.out.println("Enter 3 sides of triangle");
		Scanner sc=new Scanner (System.in);
		a= sc.nextInt();
		b= sc.nextInt();
		c= sc.nextInt();
		
		s=(a+b+c)/2f; //or we can write s=(float)(a+b+c)/2;
		
		System.out.println(s);
		area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("Area is "+area);
	}
}
