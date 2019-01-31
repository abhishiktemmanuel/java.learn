class blackgold
{
    void main(int n)
    {
        int c=0;int b=n-1;int fa=0;int fb=0;
        for(int a=1;a<=n;a++,b--)
        {
        for(int i=1;i<=a;i++)
        {
            if(a%i==0)
                c=c+1;
        }
        if(c==2)
    {
         fa=a;
         c=0;
         for(int i=1;i<=b;i++)
        {
            if(b%i==0)
                c=c+1;
        }
        if(c==2)
         fb=b;
        }
        }
         System.out.println(n+"="+fa+"+"+fb);
    }
}
       