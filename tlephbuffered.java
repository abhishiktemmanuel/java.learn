import java.io.*;
public class tlephbuffered
{
    public static void main(String args[])throws IOException
    {
        BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
        long arr[]=new long[10];
        String ar[]=new String[10];
        long t=0;
        String n="";
        for(int i=0;i<10;i++)
        {
            System.out.println("Enter telephone number");
            arr[i]=Long.parseLong(ob.readLine());
            System.out.println("Enter name");
            ar[i]=ob.readLine();
        }
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9-i;j++)
            {
                if(arr[j]<arr[j+1])
                {
                    t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                    n=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=n;
                }
            }
        }
        for(int i=0;i<10;i++)
        {
            System.out.println(ar[i]+"            "+arr[i]);
        }
    }
}