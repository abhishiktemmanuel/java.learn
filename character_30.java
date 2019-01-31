public class character_30
{
    static void display ( String st)
    {
      st=st.toLowerCase();st=st+' ';
      int flag=0;int max=0;
      String  s="";String r="";
      int l=st.length();
      for (int i=0;i<=l-1;i++)
      {
        char d=st.charAt(i);
        if(d!=' ')
        {
           s=s+d;
           flag=flag+1;
        }
        if(d==' ')
        {
            if(max<flag)
            {
               max=flag;r=s;
            }
            s="";flag=0;
        }
      }
      int j=r.length();
      System.out.println("Number of character of largest word = "+j);
    }
}

    



