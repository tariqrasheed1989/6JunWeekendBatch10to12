
public class vid70forLoop 
{
	    public static void main(String[] args)
	    {
	     for(int i=0;i<=10;i++)
	     {
	         System.out.println(i);
	     }

	     //now reverse it
	        System.out.println("-----------------------------\nScenario 2");
	        for(int j=10;j>=0;j--)
	        {
	            System.out.println(j);
	        }
	        System.out.println("-----------------------------\nScenario 3");
	      //it can be written like this also
	      int x=0;
	        for(;x<=5;x++)
	        {
	            System.out.println(x);
	        }

	        System.out.println("-----------------------------\nScenario 4");
	        //even we can also make it like do while loop

	        //it can be written like this also
	        System.out.println("----------------------------------\nx = "+x);
	        for(System.out.println("Hi");x<=12;x++)
	        {
	            System.out.println(x);
	        }

	        System.out.println("-----------------------------\nScenario 5");

	        for (int i=0,j=1;i<=10;i++,j=j*2)
	        {
	            System.out.println(i+" "+j);
	        }
	    }

	
}
