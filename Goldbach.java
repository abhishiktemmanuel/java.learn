import java.util.*;
class Goldbach
{
    Scanner ob=new Scanner(System.in);
    boolean isprime(int n)
    {
        boolean  b=false;

        int f=0;
        for (int i=1;i<=n ;i++ )
        {
            if (n%i==0)
            {
                f++;
            }	
        }
        if(f==2)
            b=true;
        else
            b=false;

        return b;
    }

    public void main()
    {   
        while (true)
        {
            int k=0;
            System.out.println("Enter Number");
            int n=ob.nextInt();
            if(n%2==0)
            {
                System.out.print("PRIME PAIRS ARE:");
                for(int i=1;i<n;i++)
                {
                    if(isprime(i)&&isprime(n-i))
                    {

                        System.out.println(i+"+"+(n-i));
                        System.out.print("                ");

                    }
                }

            }
            else
                System.out.println("INVALID INPUT NUMBER IS ODD");
        }
    }

}