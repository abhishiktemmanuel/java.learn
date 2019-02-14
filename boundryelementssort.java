import java.util.*;
class boundryelementssort
{
    Scanner ob=new Scanner(System.in);
    void main()
    {
        System.out.println("Enter order of matrix");
        int n=ob.nextInt();
        System.out.println("Input numbers");
        int a[][]=new int[n][n];
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                a[i][j]=ob.nextInt();
        int b[]=new int[(4*n)-3];
        int r=0,c=-1,p=1,k=0;
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<(n-i);j++)
            {
                c=c+p;
                b[k]=a[r][c];
                k++;
            }
            for(int j=0;j<(n-i-1);j++)
            {
                r=r+p;
                b[k]=a[r][c];
                k++;
            }
            p=p*(-1);
        }
        for(int i=0;i<((4*n)-4);i++)
        {
            for(int j=0;j<((4*n)-4-i);j++)
            {
                if(b[j]<b[j+1])
                {
                    int t=b[j];
                    b[j]=b[j+1];
                    b[j+1]=t;
                }
            }
        }
        for(int i=0;i<(4*n -3);i++)
         System.out.println(b[i]);
        r=0;c=-1;p=1;k=-1;
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<(n-i);j++)
            {
                c=c+p;
                a[r][c]=b[++k];
            }
            for(int j=0;j<(n-i-1);j++)
            {
                r=r+p;
                a[r][c]=b[++k];
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
            for(int i=0;i<n;i++)
        {
            System.out.println();
            for(int j=0;j<n;j++)
            {
                System.out.print(a[i][j]);
            }  
        }
    }
}