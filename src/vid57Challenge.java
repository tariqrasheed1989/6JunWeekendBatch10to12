
public class vid57Challenge 
{

    //remove the special characters from the string.
    //remove the extra space from the string.
    //Find number of words in a string.
    public static void main(String[] args)
    {
        String str="a!b@c%d^h%I  *1#2@3";
        String newStr=str.replaceAll("[^0-9a-zA-Z]","");
        System.out.println(newStr);
       //----------------------------------------

        String st="   Mere  desh ka naam     bharat      hai";
        //trim will only work for before or after
        System.out.println(st.replaceAll("\\s+"," ").trim());
        //----------------------------------------

        String line="the quick brown fox jumps over the little lazy dog";
        String[] wordsArr= line.split("\\s");
        System.out.println(wordsArr.length);
    }
}
