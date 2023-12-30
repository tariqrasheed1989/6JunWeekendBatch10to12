
public class vid46String 
{
	public static void main(String[] args) 
	{	
		String str="Java Program";
		String str2=new String("Java");
		char[] c= {'H','e','l','l','o'};
		String str3=new String(c,1,3);//here c is char reference, 1 is index of c[] and it will fetch till next 3 steps of index
		System.out.println(str3);
		
		byte b[]= {65,66,67,68};
		
		String str4=new String(b,2,2);//same as above
		System.out.println(str4);
		
	}
}
