
public class vid53RegexPart2 
{
    public static void main(String[] args)
    {//-----------Simple Patterns------------------
    	//"." dot means any character
        String str="m";
        System.out.println(str.matches("."));
    //This will match "India" with other given string "India" - "abc"
        String str2="India";
        System.out.println(str2.matches("India"));
     //[abc] any of the letters a,b or c.
      //  String str3="b";
          String str3="c";
        System.out.println(str3.matches("[abc]"));

      //[^abc] any single character except a,b,c
            String str4="d";
            System.out.println(str4.matches("[^abc]"));
      //[a-z] any one character between a to z
            String str5="d";
            System.out.println(str4.matches("[a-z]"));
      //[a-z] any one character between a to z
        String str6="d";
        System.out.println(str4.matches("[A-Z]"));
        //[abc][xy] first alphabet can be from a,b,c and second from x or y.
        String str7="ay";
        System.out.println(str7.matches("[abc][xy]"));
        //[a-z1-9] any single character between a to z and 1 to 9
        String str8="2";
        System.out.println(str8.matches("[a-z1-9]"));

        //[a-z][1-9] any two character between a to z for first character and 1 to 9 for second
        String str9="c2";
        System.out.println(str9.matches("[a-z][1-9]"));

        //[A|B] any single character either A or B
        String str10="B";
        System.out.println(str10.matches("[A|B]"));
    	
    	//--------------META CHARACTERS----------------------
        //"\\d" for digits
        String strr = "8";
        System.out.println(strr.matches("\\d"));
        //"\\D" is for no digits allowed
        String strr2 = "8";//we can put any character except digit to make it true
        System.out.println(strr2.matches("\\D"));
        //"\\s" to allow space accept single character
        String strr3=" ";
        System.out.println(strr3.matches("\\s"));
        //"\\S" everything except space
        String strr4="$";
        System.out.println(strr4.matches("\\S"));
        //"\\w" any alphabet or digit
        String strr5="0";
        System.out.println(strr5.matches("\\w"));
        //"\\W" any alphabet or digit
        String strr6="&";
        System.out.println(strr6.matches("\\W"));
        
}
}