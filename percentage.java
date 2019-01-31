public class percentage
{
    void percentage (int physics,int chemistry,int biology,int maths,int english1,int english2,int history,int geography,int sixthsubject,int hindi,int maximummarks)
    {
        {
        int a=physics*100/maximummarks;
        int b=chemistry*100/maximummarks;
        int c=biology*100/maximummarks;
        int d=maths*100/maximummarks;
        int e=english1*100/maximummarks;
        int f=english2*100/maximummarks;
        int g=history*100/maximummarks;
        int h=geography*100/maximummarks;
        int i=sixthsubject*100/maximummarks;
        int j=hindi*100/maximummarks;
        int percentage=(a+b+c+d+e+f+g+h+i+j)*10/maximummarks;
        System.out.println("total percentage="+percentage);
       }
    }
}