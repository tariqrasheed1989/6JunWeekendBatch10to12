
public class vid80Pattern3 
{
    public static void main(String[] args)
    {

        System.out.println("------------------Pattern 1----------------");
        for (int i=1;i<=5;i++)
        {
            for (int j=1;j<=5;j++)
            {
                if (j>=i)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }

        System.out.println("------------------Pattern 2----------------");
        for (int i=1;i<=5;i++)
        {
            for (int j=1;j<=5;j++)
            {
                if (i+j>5)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }

        System.out.println("------------------Pattern 3----------------");
        for (int i=1;i<=5;i++)
        {
            for (int j=1;j<=5;j++)
            {
                if (i+j>5)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }

            }
            for(int k=2;k<=i;k++)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }

    }

}
