public class successor2_22
{
    static void abc(String t)
    {
        t=t.toLowerCase();
        System.out.println("Input  = "+t);
        int l=t.length();
        System.out.print("Output = ");
        for (int i=0;i<=l-1;i++)
        {
            char d=t.charAt(i);
            if(Character.isLetter(d))
            {
                if(d!='z')
                {
                    System.out.print(++d);
                }
                if(d=='z')
                {
                    System.out.print("a");
                }
            
            }
            else 
            {
               System.out.print(d);
            }
        }
    }
}
 

