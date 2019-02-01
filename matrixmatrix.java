import java.util.*;
public class matrixmatrix{
    Scanner ob=new Scanner (System.in);
    int c[][];
    int m,n,m1,n1;
    int[][] addition(int a[][], int b[][]){
        if(m==m1&&n==n1)
            for(int i = 0 ; i<m ;i++)
                for (int j =0;j<n;j++)
                    c[i][j]=a[i][j]+b[i][j];
        return c;
    }

    int[][] subtract(int a[][], int b[][]){
        if(m==m1&&n==n1){
            for(int i = 0 ; i<m ;i++)
                for (int j =0;j<n;j++)
                    c[i][j]=a[i][j]-b[i][j];
        }
        return c;
    }

    int[][] multiply(int a[][], int b[][]){
        if(n==m1){
            for (int i=0;i<m;i++)
                for (int j=0;j<n1;j++)
                    for (int k=0;k<n1;k++)
                        c[i][j]=c[i][j]+(a[i][k]*b[k][j]);
        }
        return c;
    }

    int[][] sortrow(int a[][]){
        for (int k= 0;k<m;k++)
            for(int i=0;i<(n-1);i++)
                for(int j=0;j<(n-1-i);j++)
                    if(a[k][j]>a[k][j+1]){
                        int t=a[k][j];
                        a[k][j]=a[k][j+1];
                        a[k][j+1]=t;
        }
        return a;
    }

    int[][] sortcolumn(int a[][]){
        for (int k= 0;k<n;k++)
            for(int i=0;i<(m-1);i++)
                for(int j=0;j<(m-1-i);j++)
                    if(a[k][j]>a[k][j+1]){
                        int t=a[k][j];
                        a[k][j]=a[k][j+1];
                        a[k][j+1]=t;
        }
        return a;
    }

    void sumrowcolumn(int a[][]){   
        int s=0,s1=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                s=s+a[i][j];
                s1=s1+a[j][i];
            }
            System.out.print("SUM OF ROW "+(1+i)+"="+s+"   ");
            s=0;
            System.out.println("SUM OF COLUMN "+(1+i)+"="+s1+"   ");
            s1=0;
        }
    }

    void sumdiagonal(int a[][]){
        if(m==n){
            int s=0;
            for(int i=0;i<m;i++)
                s=s+a[i][i];
            System.out.println("SUM OF LEFT DIAGONAL = "+s);
            s=0;
            for(int i=0 ,j=(m-1);i<m&&j>=0;i++,j--)
                s=s+a[i][j];
            System.out.println("SUM OF RIGHT DIAGONAL = "+s);
            s=0;
        }
    }

    int[][] transpose(int a[][]){
        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++){
                int t=a[j][i];
                a[j][i]=a[i][j];
                a[i][j]=t;
            }
        return a;
    }

    void main()
    {
        System.out.println("Enter number of rows");
        int m=ob.nextInt();
        System.out.println("Enter number of columns");
        int n=ob.nextInt();
        int a[][]=new int[m+1][n+1];
        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++){
                System.out.println("ENTER ELEMENT AT"+(1+i)+","+(1+j));
                a[i][j]=ob.nextInt();
            }
        System.out.println("ENTER 1 FOR SINGLE ARRAY OPPERATIONS");
        System.out.println("ENTER 2 FOR DOUBLE ARRAY OPPERATIONS");
        int choice=ob.nextInt();
        switch(choice)
        {
            case 2:
            System.out.println("Enter number of rows");
            int m1=ob.nextInt();
            System.out.println("Enter number of columns");
            int n1=ob.nextInt();
            int b[][]=new int[m1+1][n1+1];
            for(int i=0;i<m1;i++)
                for(int j=0;j<n1;j++){
                    System.out.println("ENTER ELEMENT AT"+(1+i)+","+(1+j));
                    b[i][j]=ob.nextInt();
            }
            System.out.println("ENTER 1 FOR TWO MATRIX ADDITION");
            System.out.println("ENTER 2 FOR TWO MATRIX SUBTRACTION");
            System.out.println("ENTER 3 FOR TWO MATRIX MULTIPLICATION");
            int choice1= ob.nextInt();
            // Addition
            if(choice1==1)
                c=addition(a,b);
            //subtract
            if(choice1==2)
                c=subtract(a,b);
            //multiply matrices
            if(choice1==3)
                c=multiply(a,b);
            break;
            case 1:
            System.out.println("ENTER 1 TO SORT ROW WISE ");
            System.out.println("ENTER 2 TO SORT COLUMN WISE");
            System.out.println("ENTER 3 TO FIND SUM OF ROWS AND COLUMNS");
            System.out.println("ENTER 4 TO FIND SUM OF DIAGONALS");
            System.out.println("ENTER 5 TO TRANSPOSE");
            int choice2= ob.nextInt();
            //SORT ROW
            if(choice2==1)
                c=sortrow(a);
            //SORT COLUMN
            if(choice2==2)
                c=sortcolumn(a);
            //sum of rows and columns
            if(choice2==3)
                sumrowcolumn(a);
            //sum of diagonals
            if(choice2==3)
                sumdiagonal(a);
            //transpose
            if(choice2==3)
                c=transpose(a);
            break;
        }
    }
}