public class serice_sum
{
    void main(int end_digit)
    {
        int a=1;int sum=0;
        for(int i=1 ; i<=end_digit;i++)
        {
            sum=sum+a;
            System.out.println(a);
            a=a+1;
        }
            System.out.print("sum of the numbers ="+sum);
        }
    }
