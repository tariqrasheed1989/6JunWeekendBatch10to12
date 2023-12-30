
public class vid59ConditionalStatements 
{
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = 15;
        if (a > 0) {
            System.out.println("Positive Value");
        } else {
            System.out.println("Negative Value");
        }

        if (a > b && a > c) {
            System.out.println(a);
        } else {
            if (b > c) {
                System.out.println(b);
            } else {
                System.out.println(c);
            }
        }
    }
}
