public class compareoverload
{
    void compare(int a,int b)
    {
        System.out.println(Math.max(a,b));
    }
     void compare(char a,char b)
    {
        System.out.println(Math.max((int)a,(int)b));
    }
     void compare(String a,String b)
    {
        int p=a.length();
        int q=b.length();
        System.out.println(Math.max(p,q));
    }
}
    