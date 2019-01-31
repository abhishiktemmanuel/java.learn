import java.util.*;
public class pelendrom
{
    void main()
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter string");
        String t=ob.nextLine();
        String rev="";
        t=t.toLowerCase();
        t=' '+t+' ';
        int l=t.length();
        for(int i=0;i<l;i++)
        {
            char d=t.charAt(i);
            rev=d+rev;
        }
        if(t.equals(rev))
        {
         System.out.println("palendrom");
        }
        else
        {             
         System.out.println("not palendrom");
        }
    }
}
    
