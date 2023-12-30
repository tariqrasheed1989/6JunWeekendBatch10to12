
public class vid52StringMethods 
{
	public static void main(String[] args) 
	{
		String str1="Pyramid";//store in pool
		String str2="Pyramid";//store in pool
		String str3=new String("Pyramid");//store in heap
		System.out.println(str1==str2);
		System.out.println(str1==str3);//reference are different
		System.out.println(str1.equals(str3));//contents of string are same.
		
		String wonders="China Wall";//Char "C" ASCII code is 67 
		String wonder=new String("china Wall");//char "c" ASCII code is in 90s.
		System.out.println(wonders.compareTo(wonder));//China is less than china as per ASCII code.
		
		
		System.out.println(wonders.contains("Wall"));
		//concate
		System.out.println(str1.concat(wonder));
		
		//converting anytype of data in string
		int data=8835;
		String data1=String.valueOf(data);
		
	}
}
