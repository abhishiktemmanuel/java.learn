public class reverse_string_6
{
    static void abc(String t)
    {
        System.out.println ("Orignal String = "+t);
        String rev="";
        String s="";
        t=t+' ';
        int l=t.length();
        for(int i=0;i<=l-1;i++)
        {
            char d=t.charAt(i);
            if (d!=' ')
            {
                s+=d;
            }
            if(d==' ')
            {
                rev=s+rev;
                rev=' '+rev;
                s="";
            }
        }
        System.out.println("Reverse String = "+rev);
    }
}

