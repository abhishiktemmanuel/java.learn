import java.util.*;
public class initials_38
{
    static void abc ()
    {
        Scanner obj=new Scanner (System.in);
        System.out.print("Enter First Name = ");
        String f=obj.nextLine();
        System.out.print("Enter Middle Name = ");
        String mi=obj.nextLine();
        System.out.print("Enter Last Name = ");
        String la=obj.nextLine();
        String t=f+" "+mi+" "+la;
        t=t.toUpperCase();
        t=' '+t;
        int l=t.length();
        for (int i=0;i<=l-1;i++)
        {
            char d=t.charAt(i);
            if(d==' ')
            {
                char m=t.charAt((i+1));
                System.out.print(m+".");
            }
        }
    }
}
 

