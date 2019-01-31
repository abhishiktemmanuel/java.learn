public class ASCII_code_12
{
    static void abc (String t)
    {
        int l=t.length();
        for(int a=0;a<=l-1;a++)
        {
            char d=t.charAt(a);
            for (int i=97;i<=122;i++)
            {
                char m=(char)i;
                if(d==m)
                {
                    System.out.println(m+"     "+i);
                }
            }
            for (int j=65;j<=90;j++)
            {
                char n =(char)j;
                if(d==n)
                {
                    System.out.println(n+"     "+j);
                }
            }
            if(d==' ')
                {
                 System.out.println("Space=32");
                }
            }
        }
    }

