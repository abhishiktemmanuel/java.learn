public class check
{
    void prime(long num)
    {
        long d=0;int c=0;
       while(num!=0)
       {
         d=num%10;
        for(int i=1;i<=d;i++)
        {
            if(d%i==0)
            {
                c=c+1;
            }
        }
        if(c==2)
        {
        System.out.println(d);
        }
         num=num/10;
       }
    }
    void prime(int n,int m)
    {
        int c=0;int c1=0;int flag=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                c=c+1;
            }
        }
        if(c==2)
        {
        System.out.println(n+"is prime");
        flag=1;
        }
        else
        System.out.println(n+"is not prime");
        for(int i=1;i<=m;i++)
        {
            if(m%i==0)
            {
                c1=c1+1;
            }
        }
        if(c1==2)
        {
        System.out.println(m+"is prime");
        flag=2;
        }
        else
        System.out.println(m+"is not prime");
        if(flag==2)
        {
            if((n-m)==2||(m-n)==2)
            {
                System.out.println("Twin-prime");
            }
            else
            {
                System.out.println("not twin prime");
            }

        }
    }
}
                