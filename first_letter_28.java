import java.util.*;
public class first_letter_28
{
    static void abc(char c)
    {
        String a[]=new String[20];
        Scanner obj=new Scanner (System.in);
        for (int i=0;i<=19;i++)
        {
            System.out.print("Enter a name = ");
            a[i]=obj.nextLine();
        }
        System.out.println("Name starting with "+c+" are follows");
        c=Character.toLowerCase(c);
        for (int y=0;y<=19;y++)
        {
            String s=a[y];
            s=s.toLowerCase();
            char m=s.charAt(0);
            if(c==m)
            {
                System.out.println(a[y]);
            }
        }
    }
}
            
            
 
