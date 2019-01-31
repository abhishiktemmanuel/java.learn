public class vowels_16
{
    static void abc (String t)
    {
        t=t+' ';
        int V=0;
        int v=0;
        int l=t.length();
        int w=0;
        for (int i=0;i<=l-1;i++)
        {
            char d=t.charAt(i);
            if(d==' ')
            {
                char m=t.charAt(i-1);
                if(Character.isLetterOrDigit(m))
                {
                    w+=1;
                }
            }
            if(d=='a'||d=='e'||d=='i'||d=='o'||d=='u')
            {
                v+=1;
            }
            if(d=='A'||d=='E'||d=='I'||d=='O'||d=='U')
            {
                V+=1;
            }
        }
        System.out.println("No of capital letter vowels = "+V);
        System.out.println("No of small letter vowels = "+v);
        System.out.println("No of words = "+w);
    }
}
 
