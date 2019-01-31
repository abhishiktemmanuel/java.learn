public class finder
{
    int start;
    int last;
    finder()
    {}
    finder(int s,int L)
    {
        start=s;
        last=L;
    }
    static int checkPrime(int d)
    {
        int c=0;
        for(int i=1;i<=d;i++)
        {
            if(d%i==0)
            {
                c=c+1;
            }
        }
        if(c==2)
        d=1;
        else
        d=-1;
        return(d);
    }
    void printPrime()
    {
        int d=0;
        for(int j=start;j<=last;j++)
        {
           j=d;
           finder.checkPrime(d);
           if(d==1)
           System.out.println(j);
           
        }
    }
    public void main()
    {
        finder F=new finder();
        
        F.printPrime();
    }
}
        

