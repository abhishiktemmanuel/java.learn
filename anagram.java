import java.util.*;
public class anagram
{
    Scanner ob=new Scanner(System.in);
    public void main()
    {
        System.out.println("ENTER FIRST WORD");
        String a=ob.nextLine();
        System.out.println("ENTER SECOND WORD");
        String b=ob.nextLine();  
        int c=0;      
        if(a.length()==b.length())
        {
            for(int i=0;i<a.length();i++)
                for(int j=0;j<b.length();j++)
                    if(a.charAt(i)==b.charAt(j))
                        c++;
            if(c==a.length())
                System.out.println("ANAGRAM");
            else
                System.out.println("NOT ANAGRAM");
        }
        else
                System.out.println("NOT ANAGRAM");
    }
}
