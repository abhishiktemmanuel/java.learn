import java.util.*;
class column_sort
{
    Scanner ob=new Scanner (System.in);
    void main()
    {
        int t=0;
        System.out.println("Enter number of rows");
        int m=ob.nextInt();
        System.out.println("Enter number of columns");
        int n=ob.nextInt();
        if(m>2&&n<11)
        {
            int a[][]=new int[m][n];
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    System.out.println("ENTER ELEMENT AT"+(1+i)+","+(1+j));
                    a[i][j]=ob.nextInt();
                }
            }
            System.out.println("INPUTED MATRIX");
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    System.out.print(a[i][j]);
                }
                System.out.println();
                
            }
            //Sorting
            for(int i=0;i<m;i++)
            {
                for(int k=0;k<n-1;k++)
                {
                    for(int j=0;j<n-k-1;j++)
                    {
                        if(a[i][j]>a[i][j+1])
                        {
                            t=a[i][j];
                            a[i][j]=a[i][j+1];
                            a[i][j+1]=t;
                        }
                    }
                }
            }
            //Print
            System.out.println("SORTED MATRIX");
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    System.out.print(a[i][j]);
                }
                System.out.println();
                
            }
        }
    }
}
