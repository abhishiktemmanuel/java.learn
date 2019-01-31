import java.util.*;
public class sum_of_type_of_numbers
{
    public static void main()
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter number of terms");
        int n=obj.nextInt();
        int a[]=new int[n];
        int sum=0;int sume=0;int sumo=0;int terminate=0;
        for(int i=0;i<n;i++)
        {
            System.out.println("enter term "+i);
            a[i]=obj.nextInt();
            if(a[i]==0)
            {
                terminate=1;
                break;
            }
            
        }
        if(terminate!=1)
        {
        for(int i=0;i<n;i++)
        {
            if(a[i]<0)
            {
                sum=sum+a[i];
            }
            else if(a[i]>0)
            {
               if(a[i]%2==0)
               {
                   sume=sume+a[i];
               }
               else
               {
                   sumo=sumo+a[i];
               }
            }
        }
        
            if(sume==0)
            {
               System.out.println("Sum of negative numbers="+sum);
               System.out.println("Sum of positive odd numbers="+sumo);
               System.out.println("No positive even numbers");
            }
            else if(sumo==0)
            {
               System.out.println("Sum of negative numbers="+sum);
               System.out.println("Sum of positive even numbers="+sume);
               System.out.println("No positive odd numbers");
            }
            else if(sum==0)
            {
               System.out.println("Sum of positive odd numbers="+sumo);
               System.out.println("Sum of positive even numbers="+sume);
               System.out.println("No negative numbers");
            }
            else
            {
               System.out.println("Sum of positive odd numbers="+sumo);
               System.out.println("Sum of positive even numbers="+sume);
               System.out.println("Sum of negative numbers="+sum);
            }
        
        }
    }
}

        