
public class vid44 
{
	public static void main(String[] args) 
	{
		int a=3;
		System.out.printf("%d\n",a);//print value of a, we took %d because it is an integer
		//for integer we take %d
		
		System.out.printf("%3d\n",a);//width example
		//here 3 is the place value(width) in %3d, so a will be at the 3rd place value.
		System.out.printf("%03d\n",a);//width with flag example
		//0 after % and before 3 will fill all the blank values with 0.
		int b=-10;
		System.out.printf("%(3d\n",b);
		//if i mention"(" bracket for negative number then it will show number in (number).
		
		System.out.printf("%+d\n",a);
		
		float x=123.5f;
		System.out.printf("%6.2f\n",x);
		//here 6 is the 6 place value and .2 is it will show 2 decimal places after .
		
		String y="Java";
		System.out.printf("%5s\n",y);
		//it will start space from the left side
		System.out.printf("%-5s",y);
		//it will add spaces in the end.
	}
}
