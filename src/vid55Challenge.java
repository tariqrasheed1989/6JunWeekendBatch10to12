
public class vid55Challenge 
{
	//find the email id on gmail id = "programmer@gmail.com"
    //separate email id before @ sign. output=programmer
    public static void username(String email) {
        String userName = email.substring(0, email.indexOf("@"));
        String domain = email.substring(email.indexOf("@")+1);
        System.out.println("Username : " + userName);
        System.out.println("Domain : "+ domain);

    }

    public static void validateEmail(String email) {
        String newHost = "hotmail";//our requirement
        if (email.matches(".*" + newHost + ".*")) {
            System.out.println(newHost + " is validated");
        } else {
            System.out.println(newHost + " not found.");
        }
    }

    public static void main(String[] args) {
        String email = "programmer1@hotmail.com";
        username(email);
        validateEmail(email);

    }
}
