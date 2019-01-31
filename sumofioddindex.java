public class sumofioddindex
{
    public static void print(int ar[])
    {
        int sum=0;
        for(int i=0;i<15;i++)
        {
            if(i%2!=0)
            {
                sum=sum+ar[i];
            }
        }
        System.out.println("sum of integers at odd indexes="+sum);
    }
}