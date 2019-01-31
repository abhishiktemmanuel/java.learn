import java.util.*;
class uppercaseno
{
    void main()
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("ENTER STRING");
        String str=ob.nextLine();
        int l=str.length();
        int u=0;
        for(int i=0;i<l;i++)
        {
            char d=str.charAt(i);
            if(d>='A'&&d<'Z')
            {
                u++;
            }
            System.out.println("NO OF UPPER CASE="+u);
        }
    }
}
