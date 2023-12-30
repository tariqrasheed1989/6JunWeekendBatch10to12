
public class vid64Switch 
{

	 public static void main(String[] args)
	    {
	            String menu="Open";

	            switch (menu)
	            {
	                case "File": System.out.println("Open new file");
	                break;

	                case "Save": System.out.println("Save the current file.");
	                break;

	                case "Open": System.out.println("Open the file.");
	                break;

	                default: System.out.println("No valid action taken");
	            }

	        }
}
