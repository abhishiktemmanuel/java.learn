import java.util.*;
class matrixspecial{
    Scanner ob=new Scanner(System.in);
    Scanner ob1=new Scanner(System.in);
    void main(){
        System.out.println("INPUT ORDER OF MATRIX");
        int n=ob1.nextInt();
        int m=n-1;
        if(n>3&&n<10){
            String s[][]=new String[n+1][n+1]; 
            System.out.println("CHARACTER 1");
            String a=ob.nextLine();
            System.out.println("CHARACTER 2");
            String b=ob.nextLine();
            System.out.println("CHARACTER 3");
            String c=ob.nextLine();
            for(int i=1;i<m;i++)
                for(int j=1;j<m;j++)
                    s[i][j]=c;
            for(int i=0;i<n;i++)
            {
                s[0][i]=b;
                s[i][0]=b;
                s[m][n-i]=b;
                s[n-i][m]=b;
            }
            s[0][0]=a;
            s[m][m]=a;
            s[0][m]=a;
            s[m][0]=a;
            for(int i=0;i<n;i++){
                System.out.println();
                for(int j=0;j<n;j++)
                    System.out.print(s[i][j]);
            }
        }
        else
            System.out.println("SIZE OUT OF RANGE");
    }
}