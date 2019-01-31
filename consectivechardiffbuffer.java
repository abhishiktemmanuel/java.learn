import java.io.*;
public class consectivechardiffbuffer
{
    public static void main(String args[])throws IOException
    {
        BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
        String a=ob.readLine();
        int l=a.length();
        int d=0;
        int c=0;
        for(int i=0;i<l-1;i++)
        {
            d=(int)a.charAt(i)-(int)a.charAt(i+1);
            if(d==1||d==-1)
            {
                c++;
            }
        }
        System.out.println("frequency of consective character="+c);
    }
}
