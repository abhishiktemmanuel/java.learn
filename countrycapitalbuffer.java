import java.io.*;
public class countrycapitalbuffer
{
   public static void main(String argr[])throws IOException
   {
       BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
       String country[]=new String[10];
       String capital[]=new String[10];
       for(int i=0;i<10;i++)
       {
           System.out.println("enter country");
           country[i]=ob.readLine();
           System.out.println("enter capital of "+country[i]);
           capital[i]=ob.readLine();
       }
       String findcountry=ob.readLine();
       for(int i=0;i<10;i++)
       {
           if(country[i]==findcountry)
           {
               System.out.print("CAPITAL OF "+findcountry+" IS "+capital[i]);
               break;
           }
       }
   }
}
