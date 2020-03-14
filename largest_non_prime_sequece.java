import java.util.*;
public class largest_non_prime_sequece
{
    Scanner ob=new Scanner (System.in);
    boolean prime(int n)
    {
        int c=0;
        for(int i=1;i<=n;i++)
            if(n%i==0)
                c++;
        if(c==2)
            return true;
        else
            return false;
    }

    void print(int sv,int ev)
    {
        for(int i=sv;i<ev;i++)
            System.out.print(i+",");
        System.out.print(ev);
    }

    public void main(String args{})
    {
        System.out.println("INPUT NUMBER");
        int n=ob.nextInt();
        int sv=0,ev=0,ev1=0,sv1=0;
        for(int i=1;i<n;i++)
        {
            if(prime(i)==false)
            {
                if(prime(1+i))
                    ev=i;
                if(prime(i-1))
                    sv=i;
            }
            else
            {
                if((ev-sv)>(ev1-sv1))
                {
                    ev1=ev;
                    sv1=sv;					
                }
            }
        }
        print(sv1,ev1);
    }
}
