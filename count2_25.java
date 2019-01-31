public class count2_25
{
    static void abc(String t)
    {
        System.out.println ("Orignal String = "+t);
        String rev="";
        String s="";
        t=t+' ';
        int l=t.length();
        for(int i=0;i<=l-1;i++)
        {
            char d=t.charAt(i);
            if (d!=' ')
            {
                s+=d;
            }
            if(d==' ')
            {
                rev=s+rev;
                rev=' '+rev;
                s="";
            }
        }
        System.out.println("Reverse String = "+rev);
        t=t.toLowerCase();
        int vov=0;
        for (int j=0;j<=l-1;j++)
        {
            char k=t.charAt(j);
            if(k=='a'||k=='e'||k=='i'||k=='o'||k=='u')
            {
                vov+=1;
            }
        }
        System.out.println("Number of Vowels = "+vov);
        System.out.println("Number of Characters = "+(l-1));
    }
}
 

