public class opposite_case_1
{
    public static void main(String s)
    {
        int l=s.length();
        System.out.println("Orignal String");
        System.out.println(s);
        System.out.println("New String");
        for (int i=0;i<=l-1;i++)
        {
            char d=s.charAt(i);
            if (Character.isLowerCase(d))
            {
                char m=Character.toUpperCase(d);
                System.out.print(m);
            }
            if(Character.isUpperCase(d))
            {
                char h=Character.toLowerCase(d);
                System.out.print(h);
            }
        }
    }
}
