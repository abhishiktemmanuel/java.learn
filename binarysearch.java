import java.util.*;
class binarysearch
{
    void abc()
    {
        Scanner o=new Scanner(System.in);
        System.out.println("enter size for array a");
        int n=o.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            int num=i+1;
            System.out.println("enter observation"+num);
            a[i]=o.nextInt();
        }
        System.out.println("enter element to be found");
        int el=o.nextInt();
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