public class yes_4
{
    static void abc(String t)
    {
        t=t+' ';
        int ctr =0;
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
                if(s.equalsIgnoreCase("yes"))
                {
                    ctr+=1;
                }
                s="";
            }
        }
        System.out.print("Frequency of yes = "+ctr);
    }
}
    

