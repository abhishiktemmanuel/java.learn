import java.util.*;
class hello_barfi
{
    Scanner ob=new Scanner(System.in);
    void main()
    {
        while(true)
        {
            System.out.println("ENTER WORD");
            String S=ob.nextLine();//"hello";
            String s=" "+S+" ";
            int sp=S.length();
            for (int j=0;j<=S.length();j++ )
            {
                for (int i=0;i<sp;i++)
                {
                    System.out.print(" ");
                }
                for (int i=(S.length()-j);i<S.length();i++)
                {
                    System.out.print(s.charAt(i+1));
                }
                System.out.print("-");
                for (int i=0;i<j;i++)
                {
                    System.out.print(s.charAt(i+1));
                }
                sp--;
                System.out.println();

            }
            s=S;
            for (int j=0;j<S.length();j++ )
            {
                sp++;
                for (int i=0;i<=sp;i++)
                {
                    System.out.print(" ");
                }
                for (int i=1+sp;i<S.length();i++)
                {
                    System.out.print(s.charAt(i));
                }
                System.out.print("-");
                for (int i=0;i<(S.length()-sp-1);i++)
                {
                    System.out.print(s.charAt(i));
                }
                System.out.println();

            }
        }
    }
}