import java.util.*;
public class linear20int
{
    public static void main()
    {
        Scanner o=new Scanner(System.in);
        System.out.println("BEGIN TO ENTER 20 INTEGERS IN THE ARRAY");
        int n=20;
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            int num=i+1;
            System.out.println("enter observation "+num);
            a[i]=o.nextInt();
        }
         System.out.println("enter number 'num' to be found");
         int num=o.nextInt();
         int flag=0;int j=0;
         for(j=0;j<n;j++)
         {
             if (a[j]==num)
             {
                 flag=1;
                 break;
             }
         }
         if(flag==1)
        {
          System.out.println("element "+num+"was found in the given array at "+j);
        }
        else 
         System.out.println("number not found");
        }
}