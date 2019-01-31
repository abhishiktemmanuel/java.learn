import java.util.*;
public class selectionsort40int
{
    public static void main()
    {
        Scanner o=new Scanner(System.in);
        System.out.println("selection sort of 40 integers in assending order");
        int n=40;
        int A[]=new int[n];
        int t;int min;int pos;
        for(int i=0;i<n;i++)
        {
            int num=i+1;
            System.out.println("enter observation"+num);
            A[i]=o.nextInt();
        }
        for(int i=0;i<(n-1);i++)
        {
            min=A[i];
            pos=i;
           for(int j=(i+1);j<n;j++)
           {
               if(A[j]<min)
               {
                   min=A[j];
                   pos=j;
                }
                t=A[i];
                A[i]=A[pos];
                A[pos]=t;
            }
          
        }
         for(int i=0;i<n;i++)
           {
                System.out.println(A[i]);
           }
    }
}
            