
public class vid66B_Switch_SC 
{

    //Display the type of website
    public static void main(String[] args)
    {
     String url="www.google.gov";
     String webType=url.substring(url.lastIndexOf(".")+1);

     switch (webType)
     {
         case "com":
             System.out.println("Commercial website");
             break;

         case "gov":
             System.out.println("Govt website");
             break;

         case "org":
             System.out.println("Organization website");
             break;

         default:
             System.out.println("Unknown website type");

     }
    }
}
