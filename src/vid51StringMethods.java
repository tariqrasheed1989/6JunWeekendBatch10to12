
public class vid51StringMethods 
{
	public static void main(String[] args) 
	{
		String str = "Java";
		String str2="java";
		String str3="python";
		String str4="Python";
		
		System.out.println(str3.equals(str4));
		System.out.println(str3.equalsIgnoreCase(str4));
		System.out.println(str2.compareTo(str3));
		//compare to method follow dictionary order
		System.out.println(str3.compareTo(str2));
		
		String lang1="java";
		String lang2="java";
		String lang3=new String("java");
		
		System.out.println(lang1.equals(lang2));
		//comparing two strings values
		System.out.println(lang1==(lang2));
		//comparing two strings references which is in pool
		System.out.println(lang3.equals(lang2));
		//comparing two string objects
		System.out.println(lang3==(lang2));
	}
}
