public class volomeoverload
{
    void volume(float side)
    {
        float volume=side*side*side;
        System.out.print("Volume of cube="+volume);
    }
    void volume(double radius)
    {
        double volume=(4/3.0)*3.141*radius*radius*radius;
        System.out.print("Volume of sphere="+volume);
    }
    void volume(double length,double breadth,double height)
    {
        double volume=length*breadth*height;
        System.out.print("Volume of cuboid="+volume);
    }
}
    