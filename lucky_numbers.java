import java.util.*;
public class lucky_numbers
{
    Scanner ob=new Scanner (System.in);
    void main()
    {
        System.out.println("Enter number of terms");
        int n=ob.nextInt();
        System.out.println("Enter Array");
        int a[]=new int[n+1];
        for(int i=0;i<n;i++)
            a[i]=i+1;
        for(int cut=1;cut<n/2;cut++)
            for(int Do=cut;Do<n;Do=Do+cut)
                for(int ab=Do;ab<n;ab++)
                    a[ab]=a[ab+1];
        for(int i=0;i<n;i++)
          System.out.print(a[i]+",");
    }
}
