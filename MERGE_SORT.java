import java.util.*;
class MERGE_SORT
{
    Scanner ob=new Scanner(System.in);
    public void main()
    {
        System.out.println("ENTER LENGTH OF ARRAY A");
        int n=ob.nextInt();
        int a[]=new int[n];
        for (int i=0;i<n ;i++ ) 
        {
            System.out.println((1+i)+".INPUT IN ARRAY A");
            a[i]=ob.nextInt();   
        }
        System.out.println("ENTER LENGTH OF ARRAY B");
        int m=ob.nextInt();
        int b[]=new int[m];
        for (int i=0;i<m ;i++ ) 
        {
            System.out.println((1+i)+".INPUT IN ARRAY B");
            b[i]=ob.nextInt();   
        }
        int c[]=new int[n+m];
        int i=0,k=0,j=0;
        while(i<n&&j<m)
        {
            if(a[i]<b[j])
            {
                c[k]=a[i];
                i++;
                k++;
            }
            else if(b[j]<a[i])
            {
                c[k]=b[j];
                j++;
                k++;
            }
            else
            {
                c[k]=a[i];
                i++;
                j++;
                k++;
            }
        }
        if(i<n)
        {
            for(int l=i;l<n;l++)
            {
                c[k]=a[l];
                k++;
            }
        }
        if(j<m)
        {
            for(int l=j;l<m;l++)
            {
                c[k]=b[l];
                k++;
            }
        }
        for (i=0;i<k ;i++ ) 
        {
            System.out.print(c[i]+",");   
        }
    }
}