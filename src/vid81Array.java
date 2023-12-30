
public class vid81Array 
{
    public static void main(String[] args)
    {
        int [] a={1,2,3,4,5};
        //iterate an array
        for (int i=0;i<a.length;i++)//here, "length" is the property of array not method
        {
            System.out.println(a[i]);
        }
        //let's reverse it
        System.out.println("-----reversed---------");
        for (int j=a.length;j>=0;j--)
        {
            System.out.println(j);
        }
        //with the help of for each loop
        System.out.println("-----with the help of for each loop----");
        for(int x:a)//we can not reverse using for each loop
        {
            System.out.println(x);
        }
    }

}
