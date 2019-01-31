 public class linearsearchof20nos
 {
     public static void main(int arr[],int k)
     {
         int flag=0;int i=0;
         for(i=0;i<20;i++)
         {
             if (arr[i]==k)
             {
                 flag=1;
                 break;
             }
         }
         if(flag==1)
        {
          System.out.println("element "+k+"was found in the given array at "+i);
        }
        else 
         System.out.println("!!element "+k+"was not found in the given array !!");
        }
    }