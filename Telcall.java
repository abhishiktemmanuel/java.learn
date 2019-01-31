import java.util.*;
class Telcall
{
    long phno;
    String name;
    int n;
    double amt;
    Telcall(long PHONE_NUMBER,int NUMBER_OF_CALLS,String NAME)
    {
        phno=PHONE_NUMBER;
        name=NAME;
        n=NUMBER_OF_CALLS;
        amt=500.0;
    }

    void compute()
    {
        if(n>=1&&n<=100)
            amt=amt;
        else if(n>100&&n<=200)
            amt=amt+(1*n);
        else if (n>200&&n<=300)
            amt=amt+(n*1.20);
        else if (n>300)
            amt=amt+(n*1.50); 
    }

    void display()
    {
        System.out.print("Phone Number       Name");
        if(name.length()>4)
            for(int i=1;i<=(name.length());i++)
                System.out.print(" ");
        else
            System.out.print("       ");
        System.out.println("Total Calls       Amount");
        System.out.print(phno+"           "+name+"    "+n);
        if(String.valueOf(n).length()<11)
            for(int i=1;i<=(18-String.valueOf(n).length());i++)
                System.out.print(" ");
        else
            for(int i=1;i<=(4-String.valueOf(n).length());i++)
                System.out.print(" ");
        System.out.print(amt);
    }

}
