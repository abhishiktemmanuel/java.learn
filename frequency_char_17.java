public class frequency_char_17
{
    static void abc(String t)
    {
        t=t.toUpperCase();
        System.out.println(t);
        int l=t.length();
        for (int i=0;i<=l-1;i++)
        {
            char d=t.charAt(i);
            if(Character.isLetterOrDigit(d))
            {
                int ctr=0;
                for(int j=0;j<=l-1;j++)
                {
                    char m=t.charAt(j);
                    if(d==m)
                    {
                        ctr+=1;
                    }
                }
                System.out.println("Frequency of "+d+" = "+ctr);
            }
            t=t.replace(d,' ');
        }
    }
}

