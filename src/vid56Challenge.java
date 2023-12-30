
public class vid56Challenge 
{

    //find if the number is binary.
    //find if the number is Hexa-Decimal or not
    //find if the data is under date format (dd/mm/yyyy)

    public static void main(String[] args)
    {
        //since binary accept only 0 or 1 but can not be blank.
        int b=100110;
        String  h="3456ADE";
        String date="13/08/2023";
        String str=String.valueOf(b);//this method will turn int into string.
        System.out.println(b+" is a binary number = "+str.matches("[01]+"));
        System.out.println(h+" is a Hexa-decimal number ="+h.matches("[0-9A-F]+"));
        System.out.println(date.matches("[0-3][0-9]/[01][0-9]/[0-9]{4}"));


    }
}
