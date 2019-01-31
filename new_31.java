public class new_31
{
    static void abc(String s1 ,String s2)
    {
        System.out.println("S1 = "+s1);
        System.out.println("S2 = "+s2);
        String nam=s1+" "+s2;
        System.out.println("NAM = "+nam);
        int l=nam.length();
        System.out.print("New String = ");
        for (int i=0;i<=l-1;i++)
        {
            char d=nam.charAt(i);
            if (Character.isLowerCase(d))
            {
                char m=Character.toUpperCase(d);
                System.out.print(m);
            }
            if(Character.isUpperCase(d))
            {
                char p=Character.toLowerCase(d);
                System.out.print(p);
            }
            if(d==' ')
            {
                System.out.print(" ");
            }
        }
    }
}
