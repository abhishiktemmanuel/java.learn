import java.util.*;
class commonn
{
    void abc()
    {
        Scanner o=new Scanner(System.in);
        System.out.println("enter size for array a");
        int n=o.nextInt();
        int a[]=new int[n];
        
        int k=0;
        for(int i=0;i<n;i++)
        {
            System.out.println("enter next observations of array a");
            a[i]=o.nextInt();
        }
        System.out.println("enter size for array b");
        int m=o.nextInt();
        int b[]=new int[m];
        for(int i=0;i<m;i++)
        { 
            System.out.println("enter next observations of array b");
            b[i]=o.nextInt();
        }
         for(int i=0;i<m;i++)
        {
             for(int j=0;i<n;j++)
             {
                   if(b[i]==a[j])
                     {
                       System.out.println(b[i]);
                     }
                    
                 
             }
        }
        
   }
}        
            
           
            
            
            