import java.util.*;
class ENUMBER
{
    int binary(int n)
    {
        String t="";
        while(n>=1){
            t=n%2+t;
            n=n/2;}
        return Integer.valueOf(t);
    }

    int no1(int n){
        int t=binary(n);
        int c=0;
        while(t>=1){
            if((t%10)==1){
                ++c;
                t=t/10;}
            else
                t=t/10;}
        return c;
    }

    void main()
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("INPUT NUMBER TO BE CHECKED");
        int n=ob.nextInt();
        if(n>2&&n<100){
            System.out.println("BINARY EQUIVALENT:  "+binary(n));
            System.out.println("NUMBER OF 1's:   " +no1(n));
            if((no1(n)%2)==0)
                System.out.println("OUTPUT:  EVIL NUMBER");
            else
                System.out.println("OUTPUT:  NOT AN EVIL NUMBER");
        }
        System.out.println("OUTPUT:  NUMBER OUT OF RANGE");
    }
}
