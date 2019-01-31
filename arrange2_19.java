public class arrange2_19
{
    static void abc(String t)
    {
        t=t.toLowerCase();
        System.out.print("Arranged String = ");
        int l=t.length();
        for (char j='z';j>='a';j--)
        {
            for (int i=0;i<=l-1;i++)
            {
                char d=t.charAt(i);
                if(d==j)
                {
                    System.out.print(d);
                }
                
            }
        }
        
    }
}
    
                    
 

