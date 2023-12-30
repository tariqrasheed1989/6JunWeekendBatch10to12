import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class vid53Regex 
{//source link:  https://youtu.be/emRxXBZHcBE
	public static void main(String[] args) 
	{
		//sample 1
//		Pattern pattern = Pattern.compile("Learn Java");
//		Matcher matcher= pattern.matcher("Learn Java");
		
		//sample 2
//		Pattern pattern = Pattern.compile("[abc]");
		//it will only match if any of a,b,c will be entered in matcher.
//		Matcher matcher= pattern.matcher("d");//now try to put any or a,b,c to match
	
		
		//sample 3
//		Pattern pattern = Pattern.compile("[a-z]");
		//it will match any one character between a to z.
//		Matcher matcher= pattern.matcher("g");
	
		
		//Sample 4
//		Pattern pattern = Pattern.compile("[0-9]");
		//it will match number between 0 to 9
//		Matcher matcher= pattern.matcher("1");
		
		//Sample 5
		Pattern pattern = Pattern.compile("[^abc]");
		//it will match any value except a,b,c
		Matcher matcher= pattern.matcher("d");
		
		if(matcher.matches())
		{
			System.out.println("Pattern matches successfully.");
		}
		else
		{
			System.out.println("Invalid Format");
		}
		
		String myText="Welcome to The jungle";
		Pattern pattern2 = Pattern.compile("[a-z]+");
		//it will only match the small letters
		Matcher matcher2= pattern2.matcher(myText);
		
		while(matcher2.find())
		{
			System.out.println(myText.substring(matcher2.start(), matcher2.end()));
		}
	}
}
