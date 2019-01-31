import java.io.*;
public class binarysearchbuffer
{
     public static void main(String args[])throws IOException
    {
        BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter size for array a");
        int n=Integer.parseInt(ob.readLine());
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            int num=i+1;
            System.out.println("enter observation"+num);
            a[i]=Integer.parseInt(ob.readLine());
        }
         System.out.println("enter element to be found");
         int el=Integer.parseInt(ob.readLine());
         int beg=0;
         int last=n-1;
         int flag=0;
         while(beg<=last)
         {
             int mid=(beg+last)/2;
             if(a[mid]==el)
             {
                 flag=1;
                 break;
             }
             else if(a[mid]>el)
             {
                 beg=0;
                 last=mid-1;
             }
             else if(a[mid]<el)
             {
                 beg=mid+1;   
                 last=n-1;
             }  
         }   
          if(flag==1)
        {
          System.out.println("element "+el+"was found in the given array");
        }
        else 
         System.out.println("!!element "+el+"was not found in the given array !!");
        }
    }
