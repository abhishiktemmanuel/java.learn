import java.util.*;
class Angle
{
    int deg , min;
    Scanner ob=new Scanner(System.in);
    Angle()
    {
        deg=0;
        min=0;
    }

    void input()
    {
        System.out.println("ENTER ANGLE");
        deg=ob.nextInt();
        min=ob.nextInt();
    }

    void display()
    {
        System.out.println("Degree="+deg);
        System.out.println("Min="+min);
    }

    Angle sumofAngle(Angle T1,Angle T2)
    {
        Angle T3=new Angle();
        T3.deg=T1.deg+T2.deg;
        T3.min=T1.min+T2.min;
        if (T3.min>=60) 
        {
            T3.deg++;
            T3.min=60;
        }
        return T3;
    }

    void main() 
    {
        Angle ob1=new Angle();
        Angle ob2=new Angle();
        Angle ob3=new Angle();
        ob1.input();
        ob2.input();
        ob3=sumofAngle(ob1,ob2);
        ob3.display();
        ob1.display();
        ob2.display();
    }
}