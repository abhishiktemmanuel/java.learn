import java.util.*;
public class piglatin
{
    void main()
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter string");
        String t=ob.nextLine();
        int l=t.length();
        for(int i=0;i<l;i++)
        {
            char d=t.charAt(i);
            if(d=='a'||d=='e'||d=='i'||d=='o'||d=='u'||d=='A'||d=='E'||d=='I'||d=='O'||d=='U')
            {
                System.out.print(t.substring(i));
                System.out.print(t.substring(0,i));
                System.out.print("AY");
                break;
            }
        }
    }
}