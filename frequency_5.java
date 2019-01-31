import java.util.*;
public class frequency_5
{
    static void abc()
    {
        Scanner obj=new Scanner (System.in);
        System.out.println("Enter the String");
        String str=obj.nextLine();
        System.out.println("Enter the word");
        String w=obj.nextLine();
        String s="";
        int ctr =0;
        str =str+' ';
        int l=str.length();
        for (int i=0;i<=l-1;i++)
        {
            char d=str.charAt(i);
            if(d!=' ')
            {
                s+=d;
            }
            if(d==' ')
            {
                if (s.equalsIgnoreCase(w))
                {
                    ctr+=1;
                }
                s="";
            }
        }
        System.out.println("frequency of "+w+" in "+str+"= "+ctr);
    }
}
 
