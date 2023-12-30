import java.util.Scanner;

public class vid73_Loop_Armstrong 
{
    //separate each digit
    //get the count of digits
    //Check whether number is Armstrong or not.
    public static void getDigit(int n)
    {//123
        int digit=0;
        int num=n;
        int count=0;
        int ArmstrongSum=0;
        while (n!=0)//while(n>0)
        {
            digit=n%10;//3
            System.out.println(digit);
            ArmstrongSum=ArmstrongSum+(digit*digit*digit);
            count++;
            n=n/10;
        }
        System.out.println("Total digits are "+count);
        if (ArmstrongSum==num)
        {
            System.out.println(num+" is an armstrong number.");
        }
        else
        {
            System.out.println(num+" is not an armstrong number.");
        }
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the number.");
        int n=sc.nextInt();
        getDigit(n);

    }

}
