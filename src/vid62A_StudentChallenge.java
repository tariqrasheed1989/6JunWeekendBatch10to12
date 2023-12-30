import java.util.Scanner;

public class vid62A_StudentChallenge 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the number.");
        String str=sc.next();
      //  String str="101011";
        if (str.matches("[01]+"))
        {
            System.out.println("This is binary number and Radix is 2");
        } else if (str.matches("[0-7]+"))
        {
            System.out.println("This is octal number and Radix is 8");
        }
        else if (str.matches("[0-9]+"))
        {
            System.out.println("This is Decimal number and Radix is 10");
        }
        else if(str.matches("[0-9A-F]+"))
        {
            System.out.println("This is Hexadecimal number and Radix is 16 ");
        }
        else
        {
            System.out.println("Not a valid number");
        }
    }
}
