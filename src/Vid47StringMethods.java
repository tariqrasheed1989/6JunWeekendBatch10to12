
public class Vid47StringMethods 
{
	public static void main(String[] args) 
	{
		String str="Java";
		System.out.println(str.length());//this will return the length of string
		/*since Strings are immutable that means it cant be changed so we will create 
		 * another variable and put that changed string in new variable
		*/
		String str1=str.toLowerCase();
		String str2=str.toUpperCase();
		
		String userInput="      Welcome       ";
		String trimmed=userInput.trim();
		System.out.println(trimmed);
		
		String sub1=trimmed.substring(3);
		String sub2=trimmed.substring(3, 6);
		System.out.println(sub1);
		System.out.println(sub2);
		
		String rplc=trimmed.replace('l', 'L');
		System.out.println(rplc);
		
//Question: print rahulshettyacademy in "password 'rahulshettyacademy' to Login."
		String tempPwd="password 'rahulshettyacademy' to Login.";
		int startIndex=tempPwd.indexOf("'")+1;
		System.out.println(startIndex);
		int endIndex=tempPwd.indexOf("'", startIndex);
		System.out.println(endIndex);
		String Password=tempPwd.substring(startIndex, endIndex);
		System.out.println(Password);
	
	}
}
