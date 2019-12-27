import java.util.*;
public class adjoint_of_matrix
{
    public static void main()
    {
        Scanner ob =new Scanner(System.in);
        int n=3;
        double p=0;
        int a[]=new int[4];
        int A[][]=new int[n][n];
        double B[][]=new double[n][n];
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++){
                System.out.println("INPUT VALUE AT ("+(1+i)+","+(1+j)+")");
                A[i][j]=ob.nextInt();
            }
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++){
                int k=-1;
                for(int i1=0;i1<n;i1++)
                    for(int j1=0;j1<n;j1++){
                        if(i1==i)
                            ++i1;
                        if(j1==j)
                            ++j1;
                        if(i1==n||j1==n){}
                        else{
                            a[++k]=A[i1][j1];
                            //System.out.print(a[k]+"("+i1+","+j1+")"+A[i1][j1]+" ");
                        }
                    }
                //System.out.println();
                B[j][i]=(a[0]*a[3]-a[2]*a[1])*(Math.pow(-1,(2+i+j)));
            }
        for (int i=0;i<n;i++){
            System.out.println();
            for (int j=0;j<n;j++){
                if(B[i][j]<0)
                    p=B[i][j]*(-1);
                else
                    p=B[i][j];
                if(p>=0&&p<10)
                    System.out.print(B[i][j]+"    ");
                if(p>9&&p<100)
                    System.out.print(B[i][j]+"   ");
                if(p>99&&p<1000)
                    System.out.print(B[i][j]+"  ");
                if(p>999&&p<10000)
                    System.out.print(B[i][j]+" ");
            }
        }
    }
}
