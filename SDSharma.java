import java.util.*;
public class SDSharma
{
    void main()
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter String");
        String t=ob.nextLine();
        t=" "+t;
        int l=t.length();
        int a=t.lastIndexOf(" ");
        for(int i=0;i<a;i++)
        {
            char k=t.charAt(i);
            {
                if(k==' ')
                {
                    System.out.print(t.charAt(i+1));
                    System.out.print(" ");
                }    
            }
        }
        System.out.print(t.substring(a+1));
    }
}
        
