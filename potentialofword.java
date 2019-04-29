import java.util.*;
class potentialofword{
    void main(){
        Scanner ob=new Scanner(System.in);
        System.out.println("INPUT A SENTANCE");
        String str=ob.nextLine();
        boolean d=true;
        for(int i=0;i<str.length();i++){
            int as=(int)(str.charAt(i));
            if((as<65&&as>90)||str.charAt(i)!='.'||str.charAt(i)!=','||str.charAt(i)!='?'||str.charAt(i)!='!')
                d=false;
        }
        if(d){
            StringTokenizer st=new StringTokenizer(str," ,.?!");
            int n=st.countTokens();
            String s[]=new String[n];
            int p[]=new int[n];
            for(int i=0;i<n;i++){
                s[i]=st.nextToken();
                for(int j=0;j<s[i].length();j++)
                    p[i]=p[i]+(int)(s[i].charAt(j));
            }
            for(int i=0;i<n;i++)
                System.out.println(s[i]+" =    "+p[i]);
            for(int i=0;i<n-1;i++)
                for(int j=0;j<n-i-1;j++)
                    if(p[j]>p[j+1])
                    {
                        int t=p[j];
                        p[j]=p[j+1];
                        p[j+1]=t;
                        String T=s[j];
                        s[j]=s[j+1];
                        s[j+1]=T;
                    }
            System.out.println();
            for(int i=0;i<n;i++)
                System.out.print(s[i]+" ");
        }
        else
        System.out.println("INVALID INPUT");
    }
}

