
class spiralcube
{
    void main(int n)
    {
        int a[][]=new int[n][n];
        int fj=0;
        int m=n;
        int lj=0;
        n++;
        int g=1;
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<m;j++)
            {
                a[i][j]=g++;
                System.out.print(a[i][j]+" ");
                fj=j;
            }
            System.out.println();
            for(int j=(i+1);j<m;j++)
            {
                a[j][fj]=g++;
                System.out.println(a[j][fj]+" ");

                lj=j;
            }
            fj=lj;
            for(int j=(fj-1);j>i;j--)
            {
                a[fj][j]=g++;
                System.out.print(a[fj][j]+" ");
                lj=j;
            }
            System.out.println();
            for(int j=(fj-1);j>i;j--)
            {
                a[j][lj]=g++;
                System.out.println(a[j][lj]+" ");
            }
            m--;
        }
        for(int i=0;i<m;i++)
        {
            System.out.println();
            for(int j=0;j<m;j++)
            {
                System.out.print(a[i][j]);
            }  
        }
    }
}
