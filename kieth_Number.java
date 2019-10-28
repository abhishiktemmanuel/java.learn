import java.util.*;
public class kieth_Number
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

    void main(){
        System.out.println("INPUT NUMBER TO BE CHECKED");
        int n=ob.nextInt();
        int a[]=new int[count(n)+1];
        print(a);
        a=fill(a,n);
        print(a);
        while(a[a.length-1]<n){
            a=repeat(a);
            print(a);
        }
        if(a[a.length-1]==n)
            System.out.println("KIETH NUMBER VERIFIED");
        else
            System.out.println("NOT A KIETH NUMBER");
    }
}