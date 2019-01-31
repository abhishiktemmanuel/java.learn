import java.util.*;
public class toggle
{
    void main()
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter string");
        String t=ob.nextLine();
        int l=t.length();
        for(int i=0;i<l;i++)
        {
            char d=t.charAt(i);
            if(d>='A'&&d<='Z')
            {
                System.out.print(Character.toLowerCase(d));
            }
            else
            {
                System.out.print(Character.toUpperCase(d));
            }
        }
    }
}