public class largest_string_29
{
    static void display ( String st)
    {
       st=st.toLowerCase();st=st+' ';
       int ctr=0;int max=0;
       String  s="";String r="";
       int l=st.length();
       for (int i=0;i<=l-1;i++)
       {
         char d=st.charAt(i);
         if(d!=' ')
         {
             s=s+d;ctr+=1;
         }
         if(d==' ')
         {
            if(max<ctr)
            {
               max=ctr;r=s;
            }
            s="";ctr=0;
         }
       }
      System.out.println("Largest word = "+r);
      int j=r.length();int awww=0;
      for (int y=0;y<=j-1;y++)
      {
        char k=r.charAt(y);
        if(k=='a'||k=='e'||k=='i'||k=='o'||k=='u')
        {
            awww+=1;
        }
      }
      System.out.println("Number of Vowels = "+awww);
    }
}




