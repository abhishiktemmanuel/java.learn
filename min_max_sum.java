import java.util.*;
public class min_max_sum
{
    public static void main()
    {
       
        int min=0;int pos=0;int sum=0;int t;
       
        int a[]={2,5,4,1,3};
        int n=a.length;
        for(int i=0;i<(n-1);i++)
        {
            min=a[i];
            pos=i;
           for(int j=(i+1);j<n;j++)
           {
               if(a[j]<min)
               {
                   min=a[j];
                   pos=j;
                }
                t=a[i];
                a[i]=a[pos];
                a[pos]=t;
            }
          
        }
         System.out.println("Minimum value:"+a[0]);
         System.out.println("Maximum value:"+a[n-1]);
         System.out.println("Sum of the elements:"+sum);
    }
}