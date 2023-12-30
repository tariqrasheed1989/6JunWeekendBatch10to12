import java.util.Scanner;

public class vid63B_StudentChallenge 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the URL.");
        String url=sc.next();
        String protocol=url.substring(0,url.indexOf(":"));
        if(protocol.equals("http"))
        {
            System.out.println("Hypertext Transfer Protocol");
        }
        else if (protocol.equals("ftp"))
        {
            System.out.println("File Transfer Protocol");
        } else if (protocol.equals("https"))
        {
            System.out.println("Hypertext Transfer Protocol -SSL Certified");
        }

        String ext=url.substring(url.lastIndexOf(".")+1);

        if (ext.equals("com"))
        {
            System.out.println("Commercial Website");
        }
        else if (ext.equals("org"))
        {
            System.out.println("Organization");
        } else if (ext.equals("net"))
        {
            System.out.println("Network");
        }
    }
}
