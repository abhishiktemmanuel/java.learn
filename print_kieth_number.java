import java.util.*;
public class print_kieth_number
{
    Scanner ob=new Scanner (System.in);
    int count(int n){
        String s=String.valueOf(n);
        return s.length();
    }

    int[] fill(int a[],int n){
        int s=0;
        for(int i=a.length-2;i>=0;i--){
            a[i]=n%10;
            s=s+a[i];
            n=n/10;
        }
        a[a.length-1]=s;
        return a;
    }

    int[] repeat(int a[]){
        int s=0;
        for(int i=1;i<a.length;i++){
            s=s+a[i];
            a[i-1]=a[i];
        }
        a[a.length-1]=s;
        return a;
    }

    void print(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+",");
        }
        System.out.println();
    }

    void check(int n){
        int a[]=new int[count(n)+1];
        a=fill(a,n);
        while(a[a.length-1]<n)
            a=repeat(a);
        if(a[a.length-1]==n)
            System.out.println(n+",");
    }

    void main(int m)
    {
        for(int i=10;i<m;i++)
            check (i);
    }
}