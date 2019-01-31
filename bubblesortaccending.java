import java.util.*;
public class bubblesortaccending
{
    public static void main()
    {
        Scanner o=new Scanner(System.in);
        System.out.println("enter size for array");
        int n=o.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            int num=i+1;
            System.out.println("enter observation"+num);
            a[i]=o.nextInt();
        }
        for(int i=0;i<(n-1);i++)
          {
             for(int j=0;j<(n-1-i);j++)
           {
            if(a[j]>a[j+1])
            {
                int t=a[j];
                a[j]=a[j+1];
                a[j+1]=t;
            }
           }
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]); 
        }
   }
}