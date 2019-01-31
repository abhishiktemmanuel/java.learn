import java.util.*;
class linearsearch
{
    public static void main()
    {
        Scanner o=new Scanner(System.in);
        System.out.println("enter size for array ");
        int n=o.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            int num=i+1;
            System.out.println("enter observation "+num);
            a[i]=o.nextInt();
        }
         System.out.println("enter element to be found");
         int el=o.nextInt();
         int flag=0;int j=0;
         for(j=0;j<n;j++)
         {
             if (a[j]==el)
             {
                 flag=1;
                 break;
             }
         }
         if(flag==1)
        {
          System.out.println("element "+el+"was found in the given array at "+j);
        }
        else 
         System.out.println("!!element "+el+"was not found in the given array !!");
        }
    }