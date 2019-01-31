import java.util.*;
public class library
{
     int acc_num;
     String title;
     String author;
     Scanner ob=new Scanner(System.in);
     void input()
     {
        acc_num=ob.nextInt();
        title=ob.nextLine();
        author=ob.nextLine();
     }
     void compute()
     {
       int days=ob.nextInt();
       int fine=days*2;
     }
     void display()
     {
       System.out.println("Account number="+acc_num+"    "+"Title="+title+"    "+"Author="+author);
     }
     void main()
     {
       library L=new library();
       L.input();
       L.compute();
       L.display();
     }
}

    