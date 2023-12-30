import java.util.Scanner;

public class vid72_DisplayMultiplicationTable 
{
    public  static void getTable(int num)
    {
        for (int i=1;i<=10;i++)
        {
            System.out.println(num+"X"+i+" = "+num*i);
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a number.");
        int num=sc.nextInt();
        getTable(num);
    }

}
