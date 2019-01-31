import java.util.*;
class tokenizer
{
    void main()
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter sting");
        String str=ob.nextLine();
        StringTokenizer st=new StringTokenizer(str," ,.<>;':/?/|^%$#@!~`()-_=+*");
        int n=st.countTokens();
        String a[]=new String[n];
        for(int i=0;i<n;i++)
            a[i]=st.nextToken();
        //SDS
        for(int i=0;i<n;i++)
            System.out.print(a[i].charAt(0)+" ");
    }
}
