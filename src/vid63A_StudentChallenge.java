import java.util.Scanner;

public class vid63A_StudentChallenge 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter day in number");
        int day=sc.nextInt();

        if (day==1)
        {
            System.out.println(day+": Monday");
        }
        else if (day==2)
        {
            System.out.println(day+": Tuesday");
        }

        else if (day==3)
        {
            System.out.println(day+": Wednesday");
        }

        else if (day==4)
        {
            System.out.println(day+": Thursday");
        }

        else if (day==5)
        {
            System.out.println(day+": Friday");
        }

        else if (day==6)
        {
            System.out.println(day+": Saturday");
        }

        else if (day==7)
        {
            System.out.println(day+": Sunday");
        }
        else
        {
            System.out.println("Invalid day");
        }
    }
}
