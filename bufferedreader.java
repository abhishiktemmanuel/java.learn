import java.io.*;
class bufferedreader
{
    public static void main(String args[])throws IOException
    {
        BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENTER NUMBERS");
        int a=Integer.parseInt(ob.readLine());
        long b=Long.parseLong(ob.readLine());
        double c=Double.parseDouble(ob.readLine());
        float d=Float.parseFloat(ob.readLine());
        double avg=(a+b+c+d)/4.0;
        System.out.print(avg);
    }
}