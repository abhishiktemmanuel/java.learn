public class prime
{
    void main(int n)//Input a number to check it is prime or not
    {
        int c=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                c=c+1;
            }
        }
        if(c==2)
        {
        System.out.println("Number is prime");
        }
        else

        {
        System.out.println("not pime");
        }
}
}