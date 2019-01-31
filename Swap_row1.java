//Swap each row
import java.util.*;
public class Swap_row1
{
    Scanner ob=new Scanner(System.in);
    int n=0;
    void size()
    {
        System.out.println("input order of matrix");
        n=ob.nextInt();
    }
    int a[][]=new int [n][n];
    void enter()
    {
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
            {
                System.out.println("input element at ("+(1+i)+","+(1+j)+")");
                a[i][j]=ob.nextInt();
            }
    }
    void swap()
    {
        int t=0;
        for(int i=0;i<n/2;i++)
            for(int j=0;j<n;j++)
            {
                a[i][j]=a[i][j]+a[n-i-1][j];
                a[n-i-1][j]=a[i][j]-a[n-i-1][j];
                a[i][j]=a[i][j]-a[n-i-1][j];
            }
    }
    void printo()
    {
        for (int i=0;i<n ;i++ ) 
        {
            for (int j=0;j<n ;j++ )
                System.out.print(a[i][j]+"  ");
            System.out.println();
        }	
    }
    public void main()
    {
        size();
        enter();
        printo();
        swap();
        printo();
    }
}