import java.util.*;
class longestword
{
    void main()
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("ENTER STRING");
        String s=ob.nextLine();
        s=s+" ";
        int l=s.length();
        String s1="";int j=0;int ab=0;String s2="";
        for(int i=0;i<l;i++)
        {
            char k=s.charAt(i);
            if(k!=' ')
                s1=s1+k;
            else
            {
                j=s1.length();
                if(j>ab)
                    s2=s1;
                ab=Math.max(ab,j);
                s1="";
                j=0;
            }
        }
        System.out.println(s2+"="+ab);
    }
}