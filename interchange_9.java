public class interchange_9
{
    static void abc (String F , String S)
    {
        System.out.print("Before Interchange ");
        System.out.println("String F = "+F+" String S = "+S);
        String s="";
        s=F;
        F=S;
        S=s;
        System.out.print("After Interchange ");
        System.out.println("String F = "+F+" String S = "+S);
    }
}

