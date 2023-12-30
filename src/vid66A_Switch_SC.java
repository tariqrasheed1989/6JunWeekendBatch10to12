import java.util.Scanner;

public class vid66A_Switch_SC 
{

    //display the name of the day based on the given number
    public static void getDay(int num)
    {
        switch (num)
        {
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Invalid number");
        }
    }

    public static void getMonth(int num)
    {
        switch (num)
        {
            case 1:
                System.out.println("Jan");
                break;

            case 2:
                System.out.println("Feb");
                break;

            case 3:
                System.out.println("Mar");
                break;

            case 4:
                System.out.println("Apr");
                break;

            case 5:
                System.out.println("5");
                break;

            case 6:
                System.out.println("June");
                break;

            case 7:
                System.out.println("July");
                break;

            case 8:
                System.out.println("Aug");
                break;

            case 9:
                System.out.println("Sep");
                break;

            case 10:
                System.out.println("Oct");
                break;

            case 11:
                System.out.println("Nov");
                break;

            case 12:
                System.out.println("Dec");
                break;

            default:
                System.out.println("Invalid month number");
        }
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the number");
        int num=sc.nextInt();
        getDay(num);
        getMonth(num);
    }
	
}
