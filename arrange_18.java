
public class arrange_18
{
    static void abc(String t)
    {
        t=t.toUpperCase();
        System.out.print("Arranged String = ");
        int l=t.length();
        for (int j='A';j<='Z';j++)
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
    
                    
 
