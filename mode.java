import java.util.*;
class mode
{
    void abc()
    {
        Scanner o=new Scanner(System.in);
        System.out.println("enter size");
        int n=o.nextInt();
        int a[]=new int[n];
        int c[]=new int[n];
        for(int i=0;i<n;i++)
        {
            
            System.out.println("enter next observations");
            a[i]=o.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            int j=0;
            c[i]=0;
            while(j<n)
            {
                
                int k=a[i];
                int p=a[j];
                if(k==p)
                
                
                {
                    c[i]++;
                }
                j++;
            }
        }
        int m=c[0];
        for(int i=0;i<n;i++)
        {
            
            m=Math.max(m,c[i]);
            
            }
            int mod=0;
        for(int i=0;i<n;i++)
        {
            int ck=c[i];
            if(m==ck)
            {
                mod=a[i];
        }
        
        

    }
    System.out.println("MODE="+mod);
}
}


