import java.util.*;
public class employee
{
    int pan;
    String name;
    double taxincome;
    double tax;
    Scanner ob=new Scanner(System.in);
    void input()
    {
        pan=ob.nextInt();
        name=ob.nextLine();
        taxincome=ob.nextDouble();
        tax=ob.nextDouble();
    }
    void calc()
    {
        tax=taxincome*tax;
    }
    void display()
    {
        System.out.println(pan+"    "+name+"    "+taxincome+"    "+tax);
    }
    public static void main()
    {
        employee obj=new employee();
        obj.input();
        obj.calc();
        obj.display();
    }
}
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        