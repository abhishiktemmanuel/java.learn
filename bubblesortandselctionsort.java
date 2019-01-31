import java.util.*;
public class bubblesortandselctionsort
{
    public static void main()
    {
       Scanner o=new Scanner(System.in);
       System.out.println("BEGIN TO ENTER 100 NUMBERS");
       int n=100;
       int a[]=new int[n];
       for(int i=0;i<n;i++)
       {
           int num=i+1;
           a[i]=o.nextInt();
       }
       System.out.println("UNSORTED ARRAY          ");
       for(int i=0;i<n;i++)
       {
           System.out.println("   "+a[i]+"                       ");
       }
       for(int i=0;i<(n/2)-1;i++)
           {
           
           for(int j=0;j<(((n/2)-1)-i);j++)
           {
              if(a[j]<a[j+1])
              {
                 int t=a[j];
                 a[j]=a[j+1];
                 a[j+1]=t;
              }
           }
           
       }
       int t;int min;int pos;
       for(int i=n/2;i<n;i++)
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
        System.out.println("SORTED ARRAY");
       for(int i=0;i<n;i++)
       {
            System.out.println(a[i]); 
       }
    }
}