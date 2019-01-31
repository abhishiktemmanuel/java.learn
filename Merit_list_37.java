import java.util.*;
public class Merit_list_37
{
    static void abc (int N)
    {
        int max=0;int m=N;
        String n[]=new String[m];
        double a[]=new double[m];
        Scanner obj=new Scanner (System.in);
        Scanner e=new Scanner (System.in);
        for (int i=0;i<=m-1;i++)
        {
            System.out.print("Enter Student's name = ");
            n[i]=obj.nextLine();
            n[i]=n[i].toUpperCase();
            System.out.print("Enter his Marks = ");
            a[i]=e.nextDouble();

        }
        
        for (int k=0;k<=m-2;k++)
        {
                max=k;
                for(int j=k+1;j<=m-1;j++)
                {
                    if(a[max]<a[j])
                    {
                        max=j;
                    }
                }
                
                double h=a[k];String v=n[k];a[k]=a[max];
                n[k]=n[max];a[max]=h;n[max]=v;
            
        }
            System.out.println("Sorted list according to rank");
            for (int g=0;g<=m-1;g++)
            {
                System.out.println("Rank "+(g+1)+" = "+n[g]);
            }
        }
    }

 

