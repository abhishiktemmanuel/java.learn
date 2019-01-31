public class Rectangle
{
    float length;
    float breadth;
    float area;
    Rectangle()
    {
        length=0;
        breadth=0;
    }
    Rectangle(float L,float B)
    {
        length=L;
        breadth=B;
    }
    float FindArea()
    {
        area=length*breadth;
        return(area);
    }
    public static void main()
    {
        Rectangle R=new Rectangle();
        R.FindArea();
    }
}

        