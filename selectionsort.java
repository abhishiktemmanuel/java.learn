import java.util.*;
public class selectionsort
{
    public static void main()
    {
        Scanner o=new Scanner(System.in);
        System.out.println("enter size for array a");
        int n=o.nextInt();
        int a[]=new int[n];
        int t;int min;int pos;
        for(int i=0;i<n;i++)
        {
            int num=i+1;
            System.out.println("enter observation"+num);
            a[i]=o.nextInt();
        }
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
         for(int i=0;i<n;i++)
           {
                System.out.println(a[i]);
           }
    }
}
            