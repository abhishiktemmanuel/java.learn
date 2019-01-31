public class palindrome_string_14
   {
    static void abc ( String t)
    {
        System.out.println("Orignal String = "+t);
    t=t.toLowerCase();
  String  s="";
   String r="";
    int l=t.length();
    for (int i=0;i<=l-1;i++)
    {
        char d= t.charAt(i);
        s=s+d;
        r=d+r;
    }
    System.out.println("Reverse string = "+r);
    if (s.equals(r))
    {
        System.out.println("Palindrome");
    }
    else
    {
        System.out.println("Not palindrome");
        System.out.print("New Palindrome word = "+s+r);
    }
}
}


