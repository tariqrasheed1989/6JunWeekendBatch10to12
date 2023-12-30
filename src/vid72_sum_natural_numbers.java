import java.util.Scanner;

public class vid72_sum_natural_numbers 
{//1+2+3+4+5+6
    public static void main(String[] args)
    {
        System.out.println("Till what number, you want the sum?");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;

        for (int i=1;i<=n;i++)
        {
            sum=sum+i;
        }
        System.out.println(sum);
    }

}
