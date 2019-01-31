public class space_words_2
{
    public static void main(String t)
    {
        t=t+' ';
        int l=t.length();
        int s=0;
        int w=0;
        for (int i=0;i<=l-1;i++)
        {
            char d=t.charAt(i);
            if(d==' ')
            {
                s=s+1;
                char m=t.charAt(i-1);
                if(Character.isLetterOrDigit(m))
                {
                    w=w+1;
                }
            }
        }
        System.out.println("No of spaces = "+(s-1));
        System.out.println("No of words = "+w);
    }
}
            

