public class program_35
{
    static void abc(String enter_string)
    {
        enter_string=enter_string.toUpperCase();
        System.out.println(enter_string);
        int l=enter_string.length();
        for (int i=0;i<=l-1;i++)
        {
            char d=enter_string.charAt(i);
            if(Character.isLetterOrDigit(d))
            {
                int c=0;
                for(int j=0;j<=l-1;j++)
                {
                    char m=enter_string.charAt(j);
                    if(d==m)
                    {
                        c+=1;
                    }
                }
                System.out.println("Frequency of "+d+" = "+c);
            }
            enter_string=enter_string.replace(d,' ');
        }
    }
}

