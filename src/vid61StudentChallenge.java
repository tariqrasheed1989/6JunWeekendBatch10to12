import java.util.Scanner;

public class vid61StudentChallenge 
{

    //find a number is odd or even
    //Find person is young or old


    public void getEvenOddNumber(int num)
    {
        if(num%2==0)
        {
            System.out.println(num+" is an even number");
        }
        else
        {
            System.out.println(num+" is an odd number");
        }
    }
    public void getYoungOld(int age)
    {
        if(age>=0 && age<14)
        {
            System.out.println("This person is a kid");
        } else if (age>=14 && age<55)
        {
            System.out.println("This person is young");
        }
        else
        {
            System.out.println("This person has become Old now");
        }
    }
    public static void main(String[] args)
    {
        vid61StudentChallenge ob=new vid61StudentChallenge();
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter any number.");
        int num=sc.nextInt();
        ob.getEvenOddNumber(num);
        ob.getYoungOld(num);

    }
}
