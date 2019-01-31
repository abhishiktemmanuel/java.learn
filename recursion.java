import java.util.*;
class recursion
{
    int sumn(int n)
    {
        if(n>0)
        {
            return n+sumn(--n);
        }
        else
         return 0;
    }
    
    
    void main()
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("input value");
        int n=ob.nextInt();
        System.out.println(sumn(n));
    }
}
        
        
        