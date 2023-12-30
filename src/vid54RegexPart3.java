
public class vid54RegexPart3 
{
	//Quantifiers
    public static void main(String[] args)
    {
        //"*" is for more than 0 times. Ex: [abc]* this will repeat a,b,c n number of times.
        String str="aaabbbccc";
        System.out.println(str.matches("[abc]*"));
        //similary, [a-z]* any number of letter between a to z.
        String str2="tariq";
        System.out.println(str2.matches("[a-z]*"));
        //"+" is for one or more. Ex: [A-Z]+
        String str3="WORLD";
        System.out.println(str3.matches("[A-Z]+"));
        //{5} that means only 5 character are allowed.
        String str4="maisha";
        System.out.println(str4.matches("[a-z]{6}"));
        //{x,y} that mean between x and y range
        String str5="im";
        System.out.println(str5.matches("[a-z]{3,5}"));

       //----validate the mobile number----------
       String mobile="9812365678";
       if(mobile.matches("\\d{10}"))
       {
           System.out.println("Mobile number is validated");
       }
       else {
           System.out.println("Please enter correct mobile number");
       }
       //--------validate the email address-----------
        String email="abdulbari4343@gmail.com";
       //if(email.matches(".*"))// this will accept every website domain
       //if(email.matches(".*gmail.*"))//if user mention any other website it will fail
        if(email.matches("\\w*@gmail.*"))
        {
           System.out.println("Email address is validated.");
       }
       else
       {
           System.out.println("Please enter correct email address");
       }
    }
}
