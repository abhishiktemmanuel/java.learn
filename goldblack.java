class goldblack
{
    void main(int n)
    {
        int a;int b;int fa=0;int fb=0;int c=0;int c1=0;
        for(a=1;a<=n;a++)
        {
            for(int i=1;i<=a;i++)
            {
                if(a%i==0)
                  c=c+1;
            }
            if(c==2)
            {
                fa=a;
               /* c=0;
                System.out.print(a);
                for(int i=1;i<=b;i++)
                {
                   if(b%i==0)
                     c1=c1+1;
                }
                if(c1==2)
                {
                    fb=b;
                    System.out.println("18="+fa+"+"+fb);
                    break;
                }**/
            }
            b=n-fb;
            for(int i=1;i<=b;i++)
            {
                if(b%i==0)
                  c=c+1;
            }
            if(c==2)
            {
                fb=b;
        }
        
    }
    System.out.print(n+"="+fa+"+"+fb);
}
}