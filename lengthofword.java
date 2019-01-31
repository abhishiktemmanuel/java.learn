import java.util.*;
class lengthofword
{
    void main()
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("ENTER STRING");
        String s=ob.nextLine();
        s=s+" ";
        int l=s.length();
        {
            String s1="";int j=0;
            for(int i=0;i<l;i++)
            {
                char k=s.charAt(i);
                if(k!=' ')
                {
                    s1=s1+k;
                }
                else
                {
                    System.out.println(s1+" "+s1.length());
                    s1="";
                }
                 
            }
            
                
               
        }
    }
}

