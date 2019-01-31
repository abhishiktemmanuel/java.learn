public class factorial
{
    int num;
    int f;
    factorial()
    {
        f=1;
    }
    factorial(int n)
    {
        num=n;
    }
    int GetFactorial()
    {
        for(int i=1;i<num;i++)
        {
            f=f*i;
        }
        return(f);
    }
    public static void main()
    {
        factorial f=new factorial();
        f.GetFactorial();
    }
}
