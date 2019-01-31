import java.util.*;
class hittarth
{
    public static void main()
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("INPUT SENTENCE");
        String aK1=ob.nextLine();
        aK1=aK1.toUpperCase();
        System.out.println("INPUT A FIVE LETTER WORD");
        String a=ob.nextLine(); 
        System.out.println("INPUT CHARACTER TO BE REJECED");
        a=a+ob.next().charAt(0);
        a=a.toUpperCase();
        String arr[][]=new String [5][5];
        int b[]=new int[6];
        for(int i=0;i<5;i++)
        {
            arr[0][i]=String.valueOf(a.charAt(i));
            b[i]=(int)(a.charAt(i));
        }
        b[5]=(int)(a.charAt(5));
        int n=0,m=1;
        for(int i=65;i<91;i++)
        {
            if(i==b[0]||i==b[1]||i==b[2]||i==b[3]||i==b[4]||i==b[5])
            {}
            else
            {
                arr[m][n]=String.valueOf((char)i);
                if(n==4)
                {
                    m++;
                    n=0;
                }
                else
                    n++;
            }
        }
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }
        String aK="";
        StringTokenizer st=new StringTokenizer(aK1," ,.<>;':/?/|^%$#@!~`()-_=+*");
        n=st.countTokens();
        for(int i0=0;i0<n;i0++)
        {
            aK=st.nextToken()+" ";
            int r=0;int c=0;
            for(int ij=0;ij<(aK.length()-1);ij++)
            {
                if(aK.charAt(ij+1)!=' ')
                {
                    char d=aK.charAt(ij);
                    for(int i=0;i<5;i++)
                    {
                        for(int j=0;j<5;j++)
                        {
                            if(arr[i][j].equals(String.valueOf(d)))
                            {
                                r=i;
                                break;
                            }
                        }
                    } 
                    d=aK.charAt(ij+1);
                    for(int i=0;i<5;i++)
                    {
                        for(int j=0;j<5;j++)
                        {
                            if(arr[i][j].equals(String.valueOf(d)))
                            {
                                c=j;
                                break;
                            }
                        }
                    } 
                    System.out.print(arr[r][c]);

                    d=aK.charAt(ij+1);
                    for(int i=0;i<5;i++)
                    {
                        for(int j=0;j<5;j++)
                        {
                            if(arr[i][j].equals(String.valueOf(d)))
                            {
                                r=i;
                                break;
                            }
                        }
                    } 
                    d=aK.charAt(ij);
                    for(int i=0;i<5;i++)
                    {
                        for(int j=0;j<5;j++)
                        {
                            if(arr[i][j].equals(String.valueOf(d)))
                            {
                                c=j;
                                break;
                            }
                        }
                    } 
                    System.out.print(arr[r][c]);
                    ij++;
                }
            }
            System.out.print(" ");
        }
    }
}