import java.util.*;
public class noofthe
{
    void main()
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter String");
        String t=ob.nextLine();
        int l=t.length();
        int c=0;
        for(int i=0;i<l;i++)
        {
            int j=i;
            char d=t.charAt(j);
            if(d=='t'||d=='T')
            {
                if(t.charAt(j+1)=='h'||t.charAt(j+1)=='H')
                {
                    if(t.charAt(j+2)=='e'||t.charAt(j+2)=='E')
                    {
                        c++;
                    
                    }
                }
            }
        }
        System.out.println("No of 'the' in the given string ="+c);
    }
}
