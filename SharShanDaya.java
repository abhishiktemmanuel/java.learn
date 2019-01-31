import java.util.*;
class SharShanDaya
{
    void main()
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter String");
        String str=ob.nextLine();
        String s1=""; String s2="";
        str=" "+str;
        int k=str.lastIndexOf(" ");
        System.out.print(str.substring(k+1)+" ");
        
        int l=str.length();
        for(int i=0;i<k;i++)
        {
            char d=str.charAt(i);
            
            
           s1=s1+d;
            
            
           
            
        }
         System.out.print(s1);
    }
}

           //Abhishikt Emmanuel Prakash