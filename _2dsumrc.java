import java.util.*;
class _2dsumrc
{
    void p(int a)
    {System.out.print(a);}

    void pl(int a)
    {System.out.println(a);}

    void sln(String t)
    {System.out.println(t);}

    void ln()
    {System.out.println();}

    void main()
    {
        Scanner ob=new Scanner((System.in));
        sln("Enter number of rows");
        int n=ob.nextInt();
        sln("Enter number of columns");
        int m=ob.nextInt();
        int a[][]=new int[n][m];
        int r[]=new int[n];
        int c[]=new int[m];
        int d=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                sln("Enter element "+(j+1)+" of row "+(i+1));
                a[i][j]=ob.nextInt();
                r[i]=r[i]+a[i][j];
                c[j]=c[j]+a[i][j];
                if(n==m&&i==j)
                 d=d+a[i][j];
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
            }
        }
        for(int i=0;i<n;i++)
        {pl(r[i]);}
        for(int i=0;i<m;i++)
        {pl(c[i]);}
        pl(d);
    }
}