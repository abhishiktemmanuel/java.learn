import java.util.*;
public class doublearrray
{
   void main()
   {
       Scanner ob=new Scanner(System.in);
       int a[][]=new int[3][3];
       int t=0;
       
               System.out.println("enter element");
       for(int i=0;i<3;i++)
       {
           for(int j=0;j<3;j++)
           {
               a[i][j]=ob.nextInt();
            }
            System.out.println();
        }
        for(int i=0;i<3;i++)
       {
           for(int j=0;j<3;j++)
           {
               System.out.print(a[i][j]);
            }
             System.out.println();
            }
             System.out.println(); System.out.println(); System.out.println(); System.out.println();
       for(int i=0;i<3;i++)
       {
           for(int j=0;j<3;j++)
           {
               t=a[i][j];
               a[i][j]=a[j][i];
               a[j][i]=t;
            }
            }
       for(int i=0;i<3;i++)
       {
           for(int j=0;j<3;j++)
           {
               System.out.print(a[i][j]);
            }
             System.out.println();
            }
    }
}
