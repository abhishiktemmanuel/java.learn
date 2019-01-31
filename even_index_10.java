public class even_index_10
{
    static void abc (String t)
    {
        int l=t.length();
        System.out.print("Char at even index = ");
        for (int i=2;i<=l-1;i++)
        {
            char d=t.charAt(i);
            if(i%2==0)
            {
                System.out.print(d);
            }
        }
    }
}

