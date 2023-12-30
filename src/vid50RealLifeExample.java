import java.util.Scanner;

public class vid50RealLifeExample 
{//Take 16 digits card number from user and validate if it start with 4 and 5 otherwise invalidate
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter your 16 digits card number.");
	
		String card=sc.nextLine();
		if(card.length()!=16)
		{
			System.out.println("Please enter 16 digits not less than or more than that!");
			return;
		}
		int firstDigit= Character.getNumericValue(card.charAt(0));
		//by default charAt was providing Unicode value so converted into numeric value.
		if(firstDigit==4)
		{
			System.out.println("This valid visa card");
		}
		else
		{
			System.out.println("This is invalid card");
		}
	}
}
