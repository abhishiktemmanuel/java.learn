public class palendrom
{
    void main(int n)//Give the number to be checked
    {
        int d;int s=0;int m=n;
    while(n!=0)
    {
        d=n%10;
        s=s*10+d;
        n=n/10;
    }
    if(s==m)
    {
        System.out.print("The no is palendrom");
    }
    else
    {
        System.out.print("Not palendrom");
    }
}
}