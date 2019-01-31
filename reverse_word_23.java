public class reverse_word_23
{
    static void abc(String t)
    {
        String s="";
        t=t+' ';
        int l=t.length();
        System.out.println("Input  = "+t);
        System.out.print("Output = ");
        for (int i=0;i<=l-1;i++)
        {
            char d=t.charAt(i);
            if(d!=' ')
            {
                s=d+s;
            }
            if(d==' ')
            {
                System.out.print(s+" ");
                s="";
            }
        }
    }
}
 

