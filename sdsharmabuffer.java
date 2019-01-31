import java.io.*;
public class sdsharmabuffer
{
    public static void main(String args[])throws IOException
    {
        BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
        String s=ob.readLine();
        s=s.trim();
        s=" "+s;
        int sp=s.lastIndexOf(" ");
        for(int i=0;i<sp;i++)
        {

            if(s.charAt(i)==' '&&s.charAt(i+1)!=' ')
            {
                System.out.print(s.charAt(i+1)+" ");
            }
        }
        System.out.print(s.substring(sp));
    }
}
