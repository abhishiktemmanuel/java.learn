class Worker
{
    protected String Name;
    protected double Basic;
    Worker()
    {
        Name="";
        Basic=0.0;
    }

    Worker(String NAM,double basic)
    {
        Name=NAM;
        Basic=basic;
    }

    void display()
    {
        System.out.println("NAME="+Name);
        System.out.println("BASIC PAY="+Basic);
    }

    void main()
    {
        Worker ob=new Worker();
        ob.display();
    }
}
