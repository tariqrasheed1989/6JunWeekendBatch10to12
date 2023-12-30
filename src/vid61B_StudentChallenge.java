import java.util.Scanner;

public class vid61B_StudentChallenge 
{
	   // find grades for given marks
    public static void main(String[] args)
    {
        float Hindi,English,Maths,Total,Average;
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter Hindi Marks.");
        Hindi=sc.nextFloat();
        System.out.println("Please enter English Marks.");
        English=sc.nextFloat();
        System.out.println("Please enter Maths Marks.");
        Maths=sc.nextFloat();

        Total=Hindi+English+Maths;
        System.out.println("Total Marks are "+Total);
        Average=Total/3;

        if (Average>=70)
        {
            System.out.println("Grade A");
        }
        else if (Average>=60 && Average<70)
        {
            System.out.println("Grade B");
        }
        else if (Average>=50 && Average<60)
        {
            System.out.println("Grade C");
        }
        else if(Average>=40 && Average<50)
        {
            System.out.println("Grade D");
        }
        else {
            System.out.println("Grade F");
        }

    }
}
