import java.util.*;
public class Spiral_matrix
{

    public static void main()
    {
        while(true)
        {
            Scanner ob=new Scanner(System.in);
            System.out.println("ENTER ORDER OF MATRIX");
            int n=ob .nextInt();
            int a[][]=new int [n][n];
            for(int i=0;i<n;i++)
                for(int j=0;j<n;j++)
                    a[i][j]=0;
            int r=0;int c=-1;int p=1;int x=0;
            for(int i=0;i<n;i++)
            {
                for (int j=0;j<(n-i) ;j++ ) 
                {
                    c=c+p;
                    a[r][c]=++x;    
                }
                for (int j=0;j<(n-i-1) ;j++ ) 
                {
                    r=r+p;
                    a[r][c]=++x;    
                }
                p=p*(-1);
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
}