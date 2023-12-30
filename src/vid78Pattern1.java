
public class vid78Pattern1 
{
    //output
    /*
            1 2 3 4 5
            1 2 3 4 5
            1 2 3 4 5
            1 2 3 4 5
            1 2 3 4 5
     */
    public static void main(String[] args)
    {
        System.out.println("---------------Pattern-1-----------------");
        for (int i=1;i<=5;i++)
        {
            for (int j=1;j<=5;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println("");
        }
        System.out.println("---------------Pattern-2-----------------");
        for (int i=1;i<=5;i++)
        {
            for (int j=1;j<=5;j++)
            {
                System.out.print(i+" ");
            }
            System.out.println("");
        }
        System.out.println("---------------Pattern-3-----------------");
        for (int i=1;i<=5;i++)
        {
            for (int j=1;j<=5;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println("");
        }
        System.out.println("---------------Pattern-3-----------------");
        int count=0;
        for (int i=1;i<=5;i++)
        {
            for (int j=1;j<=5;j++)
            {
                ++count;
                System.out.format("%02d ",count);
            }
            System.out.println("");
        }


    }

}
