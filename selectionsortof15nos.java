import java.util.*;
public class selectionsortof15nos
{
     public static void main()
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("FOR NUMBER OF TERMS=15");
        int a[]=new int[15];
        int min;int pos;int t;
        for(int i=0;i<15;i++)
        {
            System.out.println("enter term "+i);
            a[i]=obj.nextInt();
        }
        
        for(int i=0;i<(15-1);i++)
        {
            min=a[i];
            pos=i;
            for(int j=(i+1);j<15;j++)
            {
                if(min<a[j])
                {
                    min=a[j];
                    pos=j;
                }
                t=a[i];
                a[i]=a[pos];
                a[pos]=t;
            }
        }
        for(int i=0;i<15;i++)
        {
            System.out.println(a[i]);
        }
    }
}
