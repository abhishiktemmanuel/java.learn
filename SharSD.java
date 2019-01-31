import java.util.*;
class SharSD
{
    void main()
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter String");
        String str=ob.nextLine();
        str=" "+str;
        int k=str.lastIndexOf(" ");
        System.out.print(str.substring(k+1));
        
        int l=str.length();
        for(int i=0;i<k;i++)
        {
            char d=str.charAt(i);
            {
            if(d==' ')
            System.out.print(" "+str.charAt(i+1));
            
            }
        }
         System.out.print(" ");
    }
}

           //Abhishikt Emmanuel Prakash