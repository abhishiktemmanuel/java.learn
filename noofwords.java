public class noofwords
{
    void main (String t) 
    {
        int c=0;String m="";int wc=0;
        int l=t.length();
        {
            for(int i=0;i<l;i++)
            {
                char d=t.charAt(i);
                if(d==' ')
                {
                    c=c+1;
                }
                
                
                    while(d!=' ')
                    {
                        m=m+d;
                    }
                    wc=wc+1;
                    m="";
                
                String k=m;
                
                
                
            }
            System.out.println("no of spaces ="+c);
                 System.out.println("no of words ="+wc);
        }
    }
}