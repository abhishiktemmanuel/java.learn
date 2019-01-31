import java.util.*;
class abc
{
    void main()
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("ENTER STRING");
        String str=ob.nextLine();
        int l=str.length();
        int i=0;int c=0;int p=0;int c1=0;int c2=0;int cj=0;String s="";
    for(i=0;i<l;i++)
        {
        char d=str.charAt(i);
        if(d>='a'&&d<'z')
        c=c+1;
        }
        System.out.println("no of lowercase ="+c);
        for(i=0;i<l;i++)
        {
        char d=str.charAt(i);
        if(d>='A'&&d<'Z')
        cj=cj+1;
        }
        System.out.println("no of uppercase ="+cj);
        for(i=0;i<l;i++)
        {
            
        char d=str.charAt(i);
        {
            if(d>='0'&&d<='9')
            p=p+1;
        }
        
    }
    System.out.println("no of digits ="+p);
    for (i=0;i<l;i++)
    {
        char d=str.charAt(i);
        {
           if( d=='a'||d=='A'||d=='e'||d=='E'||d=='i'||d=='I'||d=='o'||d=='O'||d=='u'||d=='U')
            c1=c1+1;
        }
    }
    System.out.println("no of vowels="+c1);
    for(i=0;i<l;i++)
    {
        char d=str.charAt(i);
        {
            if(d==' ')
            c2=c2+1;
        }
        
    }
    System.out.println("no of spaces="+c2);
        int oooooo=c2+1;
        System.out.println("no of words="+oooooo);
    for(i=0;i<l;i++)
    {
        char d=str.charAt(i);
        s=d+s;
    }
    System.out.println(s);
    }
}