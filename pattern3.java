class pattern3
{
   void j()
   {
       int sp=4;int k=5;
       for(int i=1;i<=5;i++)
       {
           for(int j=1;j<=sp;j++)
           {
               System.out.print(" ");
            }
            
           for(int j=5;j>=k;j--)
           {
               System.out.print(j);
            }
            sp--;
            k--;
            System.out.println();
        }
    }
}
