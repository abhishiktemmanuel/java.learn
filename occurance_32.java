public class occurance_32
{
    public static void main(String t ,String s1)
    {
        t=t.toLowerCase();s1=s1.toLowerCase();
        t=t+' ';int l=t.length();
        int c=0; String s="";
        for (int i=0;i<=l-1;i++)
        {
            char d=t.charAt(i);
            if (d!=' ')
            {
                s=s+d;
            }
            if(d==' ')
            {
                int p=s.length();
                for(int j=0;j<=p-3;j++)
                {
                    String s2=s.substring(j,(j+3));
                    if (s2.equals(s1))
                    {
                        c+=1;
                    }
                }
                s="";
            }
        }
        System.out.print("Occurance of "+s1+" = "+c);
    }
}
            
 

