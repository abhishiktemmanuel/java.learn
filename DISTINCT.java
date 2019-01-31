import java.util.*;
class DISTINCT
{
    Scanner ob=new Scanner(System.in);
    public void main()
    {
        System.out.println("input starting number");
        int i=ob.nextInt();
        System.out.println("input ending number");
        int a=ob.nextInt();
        while(i<=a)
        {
            i++;
            int flag=0;
            int t=i;
            String no=String.valueOf(i);
            while(t!=0)
            {
                String tn=String.valueOf(t%10);
                t=t/10;
                for(int k=0;k<no.length();k++)
                    if(no.charAt(k)==tn.charAt(0))
                        flag++;
            }
            if(flag==no.length())
                System.out.print(i+",");
        }
    }
}