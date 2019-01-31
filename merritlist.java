import java.util.*;
public class merritlist
{
    public static void main()
    {
        Scanner o=new Scanner(System.in);
        int n=40;
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            int num=i+1;
            System.out.println("enter marks of student "+(num+1));
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
        System.out.println("MERRIT LIST");
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]); 
        }
    }
}