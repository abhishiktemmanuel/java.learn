import java.util.*;
class ratio{
    Scanner ob=new Scanner(System.in);
    void main()
    {
        System.out.println("NUMERATOR");
        int n=ob.nextInt();
        System.out.println("DEN0MINATOR");
        int d=ob.nextInt();
        int N=n,D=d;
        for(int i=2;i<=Math.max(n,d);i=i)
        {
            if(N%i==0&&D%i==0)
            {
                N=N/i;
                D=D/i;
            }
            else
                i++ ;
        }
        System.out.println(N+"/"+D);
    }
}
