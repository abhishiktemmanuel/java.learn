public class successor_21
{
    static void abc(String t)
    {
        t=t.toUpperCase();
        System.out.println("Input  = "+t);
        int l=t.length();
        System.out.print("Output = ");
        for (int i=0;i<=l-1;i++)
        {
            char d=t.charAt(i);
            if(Character.isLetter(d))
            {
                if(d!='Z')
                {
                    System.out.print(++d);
                }
                if(d=='Z')
                {
                    System.out.print("A");
                }
            
            }
            else 
            {
               System.out.print(d);
            }
        }
    }
}
 

