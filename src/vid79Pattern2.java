
public class vid79Pattern2 
{
	   public static void main(String[] args) {
	        System.out.println("-----------------Pattern-1---------------");
	        for (int i = 1; i <= 5; i++) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print(j + " ");
	            }
	            System.out.println("");
	        }
	        System.out.println("-----------------Pattern-2---------------");
	        int count = 0;
	        for (int i = 1; i <= 5; i++) {
	            for (int j = 1; j <= i; j++) {
	                ++count;
	                System.out.print(count + " ");
	            }
	            System.out.println("");
	        }
	        System.out.println("-----------------Pattern-3---------------");
	        for (int i = 1; i <= 5; i++)
	        {
	            for (int j = 1; j <= i; j++) {
	                System.out.print("*" + " ");
	            }
	            System.out.println("");

	        }
	        System.out.println("-----------------Pattern-4-method-a-------------");
	        for (int i = 5; i >= 1; i--)
	        {
	            for (int j = 1; j <= i; j++)
	            {
	                System.out.print(j + " ");
	            }
	            System.out.println("");
	        }
	        System.out.println("-----------------Pattern-4-method-b-------------");
	        for (int i = 1; i <= 5; i++)
	        {
	            for (int j = 1; j <=5-i+1; j++)
	            {
	                System.out.print(j + " ");
	            }
	            System.out.println("");
	        }
	        System.out.println("-----------------Pattern-5--------------");
	        for (int i = 1; i <= 5; i++)
	        {
	            for (int j = 1; j <=5-i+1; j++)
	            {
	                System.out.print(i + " ");
	            }
	            System.out.println("");
	        }
	        System.out.println("-----------------Pattern-6--------------");
	        for (int i = 1; i <= 5; i++)
	        {
	            for (int j = 1; j <=5-i+1; j++)
	            {
	                System.out.print("*" + " ");
	            }
	            System.out.println("");
	        }
	        System.out.println("-----------------Pattern-7--------------");
	       int countt=0;
	        for (int i = 1; i <= 5; i++)
	        {
	            for (int j = 1; j <=5-i+1; j++)
	            {
	                ++countt;
	                System.out.print(countt + " ");
	            }
	            System.out.println("");
	        }
	        System.out.println("-----------------Pattern-8--------------");
	        int counT=0;
	        for (int i = 1; i <= 5; i++)
	        {
	            for (int j = 1; j <=5-i+1; j++)
	            {
	                ++counT;
	                System.out.printf("%02d ",counT);
	            }
	            System.out.println("");
	        }
	    }

}
