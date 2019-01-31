
public class armstrong
{
    void main(int n)//enter the number
    {
        int d;int s=0;int m=n;
        while(n!=0)
        {
         d=n%10;
         s=s+(d*d*d);
         n=n/10;
        }
        if(s==m)
        System.out.print("No is armstrong");
        else
        System.out.print("not armstrong");
    }
}
