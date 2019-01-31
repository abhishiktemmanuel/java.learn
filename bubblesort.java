import java.util.*;
class bubblesort
{
    void abc()
    {
        Scanner o=new Scanner(System.in);
        System.out.println("ENTER A IF YOU WANT THE ARRAY TO BE ARRANGED IN ASCENDING ORDER");
         System.out.println("ENTER D IF YOU WANT THE ARRAY TO BE ARRANGED IN DECENDING ORDER");
         String choice=o.nextLine();
        System.out.println("enter size for array");
        int n=o.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            int num=i+1;
            System.out.println("enter observation"+(num+1));
            a[i]=o.nextInt();
        }
         
         if (choice=="A"||choice=="a")
         {
         for(int i=0;i<(n-1);i++)
          {
             for(int j=0;j<(n-1-i);j++)
           {
            if(a[j]>a[j+1])
            {
                int t=a[j];
                a[j]=a[j+1];
                a[j+1]=t;
            }
           }
           }
        
         System.out.println("Entered array is rearranged in ascending order");
         
        }
        
        if(choice=="D"||choice=="d")
        {
           for(int i=0;i<(n-1);i++)
           {
           for(int j=0;j<(n-1-i);j++)
           {
            if(a[j]<a[j+1])
            {
                int t=a[j];
                a[j]=a[j+1];
                a[j+1]=t;
            }
           }
           }
           System.out.println("Entered array is rearranged in decending order");
           
        }
        if(choice!="A"||choice!="a"||choice!="D"||choice!="d")
         System.out.println("!!WRONG CHOICE!!");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]); 
        }
   }
}