import java.util.*;
class patspi
{
    void main()
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("input no of rows/columns");
        int n=ob.nextInt();
        int c=0;
        int a[][]=new int [n][n];
        for (int i=0;i<n ;i++ ) 
        {
            for (int j=i;j<n ;j++ ) 
                a[j][i]=++c;
            i++;
            for (int j=(n-1);j>=i;j-- ) 
                a[j][i]=++c;
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(a[i][j]>0&&a[i][j]<10)
                    System.out.print(a[i][j]+"    ");
                if(a[i][j]>9&&a[i][j]<100)
                    System.out.print(a[i][j]+"   ");
                if(a[i][j]>99&&a[i][j]<1000)
                    System.out.print(a[i][j]+"  ");
                if(a[i][j]>999&&a[i][j]<10000)
                    System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}