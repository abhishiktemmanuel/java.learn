public class division_34
{
    static void abc(String enter_string)
    {
        System.out.println("Orignal String = "+enter_string);
        String c="";
        String d="";
        String s="";
        int l=enter_string.length();
        for (int i=0;i<=l-1;i++)
        {
            char y=enter_string.charAt(i);
            if(Character.isLetter(y))
            {
                if(Character.isUpperCase(y))
                {
                    c=c+y;
                }
                if(Character.isLowerCase(y))
                {
                    s=s+y;
                }
            }
            if(Character.isDigit(y))
            {
                d=d+y;
            }
        }
        System.out.println("Capital letter word = "+c);
        System.out.println("Small letter word = "+s);
        System.out.println("Digit word = "+d);
    }
}
 

