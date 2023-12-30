
public class vid49Strings 
{
	public void scenario1(String str)
	{
		String name="Mr. Shahrukh Khan";
		
		
		System.out.println(name.startsWith("Mr."));
		System.out.println(name.startsWith("Shah", 4));
		System.out.println(name.endsWith("Khan"));
		
		//verify whether given string is website.
				
				if(str.startsWith("www"))
				{
					System.out.println(str+" is a website");
				}
				
				//verify whether given string website is commercial website.
				if(str.endsWith(".com"))
				{
					System.out.println(str+ " is a commercial website");
				}
				else if(str.endsWith(".org"))
				{
					System.out.println(str+" is organization website");
				}
				else if(str.endsWith(".gov"))
				{
					System.out.println(str+" is Government website");
				}
				else if(str.endsWith(".in"))
				{
					System.out.println(str+" is an indian website");
				}
				else
				{
					System.out.println("We don't have any idea what kind of website is it.");
				}
	}
	public void scenario2(String str)
	{
		System.out.println(str.charAt(5));
		System.out.println(str.indexOf("."));
		System.out.println(str.indexOf("google"));//it will count from where the word starts
		//To get the second "." index 
		System.out.println(str.indexOf(".", 4));
		//if the given value is not found then it will return "-1".
		System.out.println(str.indexOf("&"));
		//if i want to get the last index of any character then it will search from right to left.
		System.out.println(str.lastIndexOf("."));
		//if i want to get the second last index of any character theh use below code.
		System.out.println(str.lastIndexOf(".", 9));
	}
	public static void main(String[] args) 
	{
		String str="www.google.com";
		vid49Strings ob=new vid49Strings();
		ob.scenario1(str);
		ob.scenario2(str);
	
	}
}
