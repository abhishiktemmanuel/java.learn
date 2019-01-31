public class success_the_vowel_36
{
   static void abc(String t)
   {
       t=t.toLowerCase();
       int l=t.length();
       for(int i=0;i<=l-1;i++)
       {
           char d =t.charAt(i);
           if (d=='a'||d=='e'||d=='i'||d=='o'||d=='u')
           {
               System.out.print(++d);
            }
            else
            {
                System.out.print(d);
            }
        }
    }
}

