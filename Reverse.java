public class Reverse
{
    long num;
    Reverse()
    {}
    Reverse(long n)
    {
        num=n;
    }
    long findReverse()
    {
        long digit=0;long rev=0;
        while(num>0)
        {
            digit=num%10;
            rev=rev*10+digit;
            num=num/10;
        }
        return(rev);
    }
    public static void main()
    {
        Reverse r=new Reverse();
        r.findReverse();
    }
}    
