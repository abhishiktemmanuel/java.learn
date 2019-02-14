import java.util.*                                        ;
class truthtable                                          {
    Scanner ob=new Scanner(System.in)                     ;
    void main()                                           {
        System.out.println("ENTER NUMBER OF TERMS 'n'")            ;
        int n=ob.nextInt()                                ;
        int d=(int)Math.pow(2,n)                          ;
        int a[][]=new int[d][n]                           ;
        int x=0                                           ;
        if(x<=n)
            for(int r=0;r<d;r++)                          {
                int c=n-1;x=r                             ;
                while(c>=0)                               {
                    a[r][c]=x%2                           ;
                    c--                                   ;
                    x=x/2;                                }                               
                                                          }
        for(int i=0;i<d;i++)                              {
            System.out.print(i+"  ")                      ;
            for(int j=0;j<n;j++)                          {
                System.out.print(a[i][j]+" ");            }
            System.out.println();                         }
                                                          }
                                                          }
