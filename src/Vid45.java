
public class Vid45 
{
	public static void main(String[] args) 
	{//ASCII Code to string
		byte b[]= {65,66,67,68};//ASCII code
		
		String str=new String(b);
		System.out.println(str);
	//String to byte ASCII Code
		String str2="ABCD";
		byte[]	byteArray= str2.getBytes();
		for(byte dd:byteArray)
		{
			System.out.print(dd+" ,");
		}
		
	}
}
