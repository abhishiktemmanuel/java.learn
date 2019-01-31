public class areaoverload
{
    void area(double length,double breadth)
    {
        double area=length*breadth;
        System.out.print("Area of rectangle="+area);
    }
    void area(float side)
    {
        float area=side*side;
        System.out.print("Area of square="+area);
    }
    void area(double radius)
    {
        double area=3.141*radius*radius;
        System.out.print("Area of circle="+area);
    }
}
 