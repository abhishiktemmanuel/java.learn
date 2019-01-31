public class name_13
{
    static void abc(String t)
    {
        t=' '+t;
        int l=t.length();
        int g=t.lastIndexOf(' ');
        for(int i=0;i<=g-1;i++)
        {
            char d=t.charAt(i);
            if(d==' ')
            {
                char m=t.charAt(i+1);
                System.out.print(m+".");
            }
        }
        String r=t.substring((g+1),l);
        System.out.print(r);
    }
}

