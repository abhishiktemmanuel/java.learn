public class are_to_was_3
{
    public static void main(String t)
    {
        System.out.println(t);
        t=t+' ';
        int l=t.length();
        String s="";
        for (int i=0;i<=l-1;i++)
        {
            char d=t.charAt(i);
            if(d!=' ')
            {
                s+=d;
            }
            if(d==' ')
            {
                if(s.equalsIgnoreCase("are"))
                {
                    System.out.print("was ");
                }
                else
                {
                    System.out.print(s+" ");
                }
                s="";
            }
        }
    }
}
 

