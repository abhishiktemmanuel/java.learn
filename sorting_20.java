import java.util.*;
public class sorting_20
{
    static void abc ()
    {
        int m=10;
        String a[]=new String [m];
         int s=0;int i=0;int min=0;int g=0;
         Scanner obj= new Scanner(System.in);
         for (i=0;i<=m-1;i++)
         {
             System.out.print("Enter a string = ");
             a[i]=obj.nextLine();
            }
            for( g=0;g<=m-2;g++)
            {
                min=g;
                for (int j=g+1;j<=m-1;j++)
                {
                if(a[j].compareTo(a[min])<0)
                {
                    min=j;
                }
            }
            String t=a[g];
            a[g]=a[min];
            a[min]=t;
        }
        System.out.println("After Sorting");
        for (int k=0;k<=m-1;k++)
        {
            System.out.println(a[k]);
        }
    }
}
