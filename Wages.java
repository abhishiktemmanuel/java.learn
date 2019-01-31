public class Wages extends Worker
{
    protected double hrs,rate,wage,ovtamt;
    Wages()
    {
        hrs=0.0;
        rate=0.0;
        wage=0.0;
        ovtamt=0.0;
    }
    Wages(String Name,double Basic,double hrs1,double rate1)
    {
        super(Name,Basic);
        hrs=hrs1;
        rate=rate1;
    }
    double overtime()
    {
        ovtamt=hrs*rate;
        return(ovtamt);
    }
    void display()
    {
        super.display();
        wage=ovtamt+Basic;
        System.out.println("NAME="+Name);
        System.out.println("HOURS OF WORK="+hrs);
        System.out.println("RATE OF OVERTIME="+rate);
        System.out.println("OVERTIME PAY="+ovtamt);
        System.out.println("WAGE="+wage);
    }
     void main()
    {
        Wages ob=new Wages();
        ob.overtime();
        ob.display();
    }
}