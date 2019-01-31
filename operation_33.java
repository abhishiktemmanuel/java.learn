public class operation_33
{
    void main(String a,String b,char o)
    {
        int l=a.length();int y=b.length();
        int s=1;int g=0;
        int m=1;int n=0;
        for (int i=0;i<=l-1;i++)
        {
            char d=a.charAt(i);int f=d;
            int h=f-48;g=g*s+h; s=s*10;
        }
        for (int j=0;j<=y-1;j++)
        {
            char k=b.charAt(j);int u=k;
            int e=u-48;n=n*m+e;m=m*10;
        }
        double z=0.0;
        if(o=='*')
        {
            z=n*g;
            System.out.println("The result of "+a+o+b+" = "+z);
        }
        if(o=='-')
        {
            z=g-n;
            System.out.println("The result of "+a+o+b+" = "+z);
        }
        if(o=='/')
        {
            z=g/n;
            System.out.println("The result of "+a+o+b+" = "+z);
        }
        if(o=='+')
        {
            z=g+n;
            System.out.println("The result of "+a+o+b+" = "+z);
        }
        if(o=='%')
        {
            z=g%n;
            System.out.println("The result of "+a+o+b+" = "+z);
        }
    }
}
        
        
        
        
 

