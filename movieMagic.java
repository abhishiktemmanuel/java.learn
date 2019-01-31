import java.util.*;
public class movieMagic
{
    int year;
    String title;
    double rating;
    Scanner ob=new Scanner(System.in);
    movieMagic()
    {
        year=0;
        title="";
        rating=0.0;
    }
    void accept()
    {
        year=ob.nextInt();
        title=ob.nextLine();
        rating=ob.nextDouble();
    }
    void display()
    {
        System.out.print(title+"      "+year+"      "+rating+"      ");
        if(rating>=0.0&&rating<=2.0)
        {
            System.out.print("FLOP");
        }
        else if(rating>=2.1&&rating<=3.4)
        {
            System.out.print("SEMI-HIT");
        }
        else if(rating>=3.4&&rating<=4.5)
        {
            System.out.print("HIT");
        }
        else if(rating>=4.6&&rating<=5.0)
        {
            System.out.print("SUPER HIT");
        }
    }
    public static void main()
    {
        movieMagic obj=new movieMagic();
        obj.accept();
        obj.display();
    }
}