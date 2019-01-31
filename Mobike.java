import java.util.*;
public class Mobike
{
    int bno;
    int phno;
    String name;
    int days;
    int charge;
    Scanner ob=new Scanner(System.in);
    void input()
    {
        bno=ob.nextInt();
        phno=ob.nextInt();
        name=ob.nextLine();
        days=ob.nextInt();
    }
    void compute()
    {
        if(days<=5)
        {
            charge=500*days;
        }
        else if(days>5&&days<=10)
        {
            charge=(500*5)+(400*days-5);
        }
    }
    void display()
    {
        System.out.println("Bike No.          Phone No.         Name               No. of days         Charge");
        System.out.println(bno+"      "+phno+"        "+name+"    "+days +"         "+charge);
    }
    public static void main()
    {
        Mobike m=new Mobike();
        m.input();
        m.compute();
        m.display();
    }
}
