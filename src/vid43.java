
public class vid43 
{
	public static void main(String[] args) 
	{
		int x=10;
		float y=00.67f;
		char s='A';
		System.out.printf("Hello %d %e %s world\n",x,y,s);
		
		System.out.format("%3$s %1$f %2$d", y,x,s);
	}
}
