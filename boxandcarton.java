import java.util.*;
class boxandcarton
{
    Scanner ob=new Scanner (System.in);
    int carton=0;
    int calc(int n,int k)
    {
        System.out.println("                       "+((k==6)?("  "):(" "))+k+" x "+(int)(n/k)+" = "+(k*(int)(n/k)));
        carton=carton+(int)(n/k);
        return (n-(k*(int)(n/k)));
    }
    public void main()
    {
        while(true)
        {
            System.out.println("INPUT NUMBER OF BOXES");
            int n=ob.nextInt();
            int m=n;
            n=calc(n,48);
            n=calc(n,24);
            n=calc(n,12);
            n=calc(n,6);
            n=n-(6*(int)(n/6));
            System.out.println("Remaining boxes                = "+n);
            System.out.println("Total number of boxes          = "+m);
            System.out.println("Total number of cartons        = "+((n>0)?(1+carton):carton));
        }
    }
}
