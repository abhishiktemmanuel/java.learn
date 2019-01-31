import java.util.*;
class COMPUTERECURSION
{
    Scanner ob=new Scanner(System.in);
    char x;
    void vowel_change(String str,int i,String s)
    {
        if(i<str.length())
        {
            x=str.charAt(i);
            if(x=='A'||x=='a'||x=='E'||x=='e'||x=='I'||x=='i'||x=='O'||x=='o'||x=='U'||x=='u')
            {
                s=s+(char)(1+(int)x);
                vowel_change(str,++i,s);
            }
            else
            {
                s=s+x;
                vowel_change(str,++i,s);
            }
        }
        else
            System.out.println(s);
    }

    void main()
    {
        while (true)
        {
            System.out.println("ENTER STRING");
            String str=ob.nextLine();
            vowel_change(str,0,"");
        }
    }
}
