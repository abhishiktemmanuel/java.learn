public class SUM
{
   long num;
   SUM()
   {
       num=0;
   }
   SUM(long n)
   {
       num=n;
   }
   long FindSum()
   {
        long sum=0;long digit=0;
        while(num>0)
        {
            digit=num%10;
            sum=sum+digit;
            num=num/10;
        }
        return(sum);
   }
   public static void main()
   {
        SUM s=new SUM();
        s.FindSum();
   }
}
    