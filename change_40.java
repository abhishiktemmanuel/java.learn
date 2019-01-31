
public class change_40
{
    static void abc()
    {
        String t="January 26 is celebrated as the Republic Day of India";
        String s="";t=t+' ';int l=t.length();
        for (int i=0;i<=l-1;i++)
        {
            char d=t.charAt(i);
            if(d!=' ')
            {
                s=s+d;
            }
            if(d==' ')
            {
                if(s.equalsIgnoreCase("26"))
                {
                    System.out.print("15");
                }
                else if(s.equalsIgnoreCase("january"))
                {
                    System.out.print("August");
                }
                else if(s.equalsIgnoreCase("republic"))
                {
                    System.out.print("Independence");
                }
                else
                {
                    System.out.print(s);
                }
                s="";
                System.out.print(" ");
            }
        }
    }
}
                    
                
 
