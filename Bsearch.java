public class Bsearch
{
    public static void main(int val[],int num)
    {
        int min;int pos;int t;
        int a[]=new int[15];
        for(int i=0;i<15;i++)
        {
            a[i]=val[i];
        }
        for(int i=0;i<14;i++)
        {
            min=val[i];
            pos=i;
            for(int j=i+1;j<15;j++)
            {
                if(min>val[j])
                {
                    min=val[j];
                    pos=j;
                }
                t=val[i];
                val[i]=val[pos];
                val[pos]=t;
            }
        }
        t=0;
        for(int i=0;i<15;i++)
        {
            if(a[i]==val[i])
            {
                t++;
            }
        }
        if (t==15)
        System.out.println("Array is sorted in accending order");
        else
        System.out.println("Array is not sorted in accending order");
        int beg=0;int end=15;int mid=0;int flag=0;int n;
        while(beg<=end)
        {
            mid=(beg+end)/2;
            if(a[mid]==num)
            {
                flag=1;
                n=num;
                break;
            }
            else if(a[mid]>num)
            {
                end=mid-1;
            }
            else if(a[mid]<num)
            {
                beg=mid+1;
            }
        }
        if(flag==1)
        System.out.println(mid);
        else
        System.out.println("cannot find integer "+num);
    }
}