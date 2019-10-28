import java.util.*;
public class linear_regression
{
    public static void ratio(int N,int D)
    {
        for(int i=2;i<=Math.max(N,D);i=i)
        {
            if(N%i==0&&D%i==0)
            {
                N=N/i;
                D=D/i;
            }
            else
                i++ ;
        }
        System.out.print(N+"/"+D);
    }

    public static String space(int num)
    {
        if(num>0&&num<10)
            return "        ";
        if(num>9&&num<100)
            return"       ";
        if(num>99&&num<1000)
            return"      ";
        if(num>999&&num<10000)
            return"     ";
        if(num>9999&&num<100000)
            return"    ";
        if(num>99999&&num<1000000)
            return"   ";
        if(num>999999&&num<10000000)
            return"  ";
            if(num>9999999&&num<100000000)
            return" ";
        else 
            return " ";
    }

    public static void main(String args[])
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("INPUT n");
        int n=ob.nextInt();
        int x[]=new int[n];
        int y[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("INPUT VALUE OF X AT OBSERVATION "+(1+i)+" ");
            x[i]=ob.nextInt();
            System.out.print("INPUT VALUE OF Y AT OBSERVATION "+(1+i)+" ");
            y[i]=ob.nextInt();
        }
        int sx=0,sy=0,sx2=0,sy2=0,sxy=0;
        System.out.println("X    "+"Y      "+"X^2      "+"Y^2      "+"XY       ");
        for(int i=0;i<n;i++)
        {
            sx=x[i]+sx;
            sy=y[i]+sy;
            sx2=(x[i]*x[i])+sx2;
            sy2=(y[i]*y[i])+sy2;
            sxy=(x[i]*y[i])+sxy;
            System.out.println(x[i]+space(x[i])+y[i]+space(y[i])+(x[i]*x[i])+space(x[i]*x[i])+(y[i]*y[i])+space(y[i]*y[i])+space(x[i]*y[i])+(x[i]*y[i]));
        }
        System.out.println(sx+space(sx)+sy+space(sy)+sx2+space(sx2)+sy2+space(sy2)+(sxy));
        double cov=((n*sxy)-(sx*sy))/(n*n);
        double rox=Math.pow((((n*sx2)-((sx*sx)))/(n*n)),0.5);
        double roy=Math.pow((((n*sy2)-((sy*sy)))/(n*n)),0.5);
        double bxy=cov/(((n*sy2)-((sy*sy)))/(n*n));
        double byx=cov/(((n*sx2)-((sx*sx)))/(n*n));
        double r=Math.pow((bxy*byx),0.5);
        if(bxy<0&&byx<0)
            r=r*(-1);
        System.out.print("cov(x,y)=");
        ratio(((n*sxy)-(sx*sy)),(n*n));
        System.out.println("="+cov);
        System.out.print("standard deviation of x=sqrt(");
        ratio((n*sx2)-((sx*sx)),(n*n));
        System.out.println(")="+rox);
        System.out.print("standard deviation of y=sqrt(");
        ratio((n*sy2)-((sy*sy)),(n*n));
        System.out.println(")="+roy);
        System.out.print("bxy=");
        ratio(((n*sxy)-(sx*sy)),((n*sy2)-((sy*sy))));
        System.out.println("="+bxy);
        System.out.print("byx=");
        ratio(((n*sxy)-(sx*sy)),((n*sx2)-((sx*sx))));
        System.out.println("="+byx);
        System.out.println("r="+r);
    }
}
