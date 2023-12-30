import java.util.Scanner;

public class vid72_FactorialOfNumber 
{

	//factorial of a number = 1*2*3*4*5
    public static void main(String[] args)
    {
        System.out.println("Till what number you want the factorial?");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int factorial=1;
        for (int i=1;i<=num;i++)
        {
            factorial=factorial*i;
        }
        System.out.println(factorial);
    }
}
