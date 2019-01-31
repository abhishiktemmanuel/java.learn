public class find_26
{
    static void repeat(String t ,String wd)
    {
        int ctr=0;
        String s="";
        t=t+' ';
        int l=t.length();
        for(int i=0;i<=l-1;i++)
        {
            char d=t.charAt(i);
            if(d!=' ')
            {
                s=s+d;
            }
            if(d==' ')
            {
                if(s.equalsIgnoreCase(wd))
                {
                    ctr+=1;
                }
                s="";
            }
        }
        System.out.print("Frequency of "+wd+" = "+ctr);
    }
}
    
    
        
        
 

