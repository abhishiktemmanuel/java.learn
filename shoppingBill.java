import java.io.*;
public class shoppingBill
{
    public static void main(String args[])throws IOException
    {
        BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
        int flag1=0;
        System.out.println(" *                  *  ***********  *                * * *       ****       * *      * *  ***********");
        System.out.println("  *                *   *            *              *           *      *     *  *    *  *  *          ");                
        System.out.println("   *              *    *            *             *           *        *    *   *  *   *  *          ");   
        System.out.println("    *            *     *            *             *           *         *   *    **    *  *          "); 
        System.out.println("     *          *      *******      *             *           *         *   *          *  *******    ");  
        System.out.println("      *   **  *        *            *             *            *       *    *          *  *          ");   
        System.out.println("       * *  * *        *            *              *            *     *     *          *  *          ");   
        System.out.println("        *    *         ***********  ***********      * * *       ****       *          *  ***********"); 
        System.out.println();
        System.out.println();
        System.out.println("                               "+"* * * * * * *    * *       *");                                                                             
        System.out.println("                                     "+"*          *  *      *");    
        System.out.println("                                     "+"*          *   *     *");   
        System.out.println("                                     "+"*          *    *    *");       
        System.out.println("                                     "+"*          *     *   *");       
        System.out.println("                                     "+"*          *      *  *");       
        System.out.println("                               "+"* * * * * * *    *       * *");         
        System.out.println();
        System.out.println();
        System.out.println("                      "+"   * * * * * * *  *         *  * * * * * *");               
        System.out.println("                             "+"  *        *         *  *          ");                        
        System.out.println("                            "+"   *        *         *  *          ");                         
        System.out.println("                             "+"  *        * * * * * *  * * * *    ");                   
        System.out.println("                             "+"  *        *         *  *          ");                        
        System.out.println("                             "+"  *        *         *  *          ");                        
        System.out.println("                             "+"  *        *         *  * * * * * *");               
        System.out.println();
        System.out.println();
        System.out.println("                   "+"* *        * *           *         *            *          ");
        System.out.println("                   "+"*    *   *   *          * *        *            *          ");
        System.out.println("                   "+"*      *     *         *   *       *            *          ");
        System.out.println("                   "+"*            *        * * * *      *            *          ");
        System.out.println("                   "+"*            *       *       *     *            *          ");
        System.out.println("                   "+"*            *      *         *    *            *          ");
        System.out.println("                   "+"*            *     *           *   * * * * * *  * * * * * *");                               
        System.out.println();
        System.out.println("Can we please have your name for our information");
        String name=ob.readLine();
        int t=name.length();
        String name1="";
        for(int i=0;i<t;i++)
        {
            char x=name.charAt(i);
            if(x!=' ')
            {
                if(x!=' ')
                    name1=name1+x;
                else
                    break;
            }
        }
        //while(flag1==0)
        {
            System.out.println("hi "+name1+" Type entry to gain entry to the mall");
            String s=ob.readLine();
            if(s.equalsIgnoreCase("entry"))
            {
                System.out.println(" ");
                //while(flag1!=1)
                {
                    int x;
                    System.out.println("Enter the name of the shop you wish to visit");
                    System.out.println("For clothes------>Trends Boutique");
                    System.out.println("For Toys--------->Toys Emporium");
                    System.out.println("For Stationary--->Linc Pens");
                    System.out.println("For Flowers------>Pink Petals");
                    String ch=ob.readLine();
                    if(ch.equalsIgnoreCase("trends boutique"))
                    {
                        int bill=0;
                        int p=0;
                        while(p!=1)
                        {
                            System.out.println("WELCOME TO THE TRENDS BOUTIQUE");
                            System.out.println("Great Discounts Available ");
                            System.out.println("Special 10% discount for members");
                            System.out.println("State the number corresponding to the  item you wish to take");
                            System.out.println("1-->Trousers");
                            System.out.println("2-->Jeans");
                            System.out.println("3-->T-shirts");
                            System.out.println("4-->shoes");
                            int f=Integer.parseInt(ob.readLine());
                            int n;
                            switch(f)
                            {
                                case 1:
                                System.out.println("Each Trouser Costs Rs.700");
                                System.out.println("Enter the number of Trousers you wish to take");
                                System.out.println("Special Discount of 200 Rs. If You buy more than 4");
                                n=Integer.parseInt(ob.readLine());
                                System.out.println("You have bought "+ n);
                                bill=bill+(n*700);
                                if(n>4)
                                {
                                    System.out.print("You get a discount of Rs.200 as You bought more than 4 trousers");
                                    bill=bill-200;
                                }
                                break;
                                case 2:
                                System.out.println("Each pair of jeans costs Rs.1200");
                                System.out.println("Enter the number of jeans you want to buy");
                                n=Integer.parseInt(ob.readLine());
                                System.out.println("You have bought "+ n);
                                bill=bill+(n*1200);
                                System.out.println("Enter the size you wish to buy");
                                int m=Integer.parseInt(ob.readLine());
                                if(m>=34)
                                    System.out.println("Sorry, we have run out of stock");
                                break;
                                case 3:
                                System.out.println("Each T-shirt costs Rs.900");
                                System.out.println("Enter the number of T-Shirts you want to buy");
                                n=Integer.parseInt(ob.readLine());
                                System.out.println("You have bought "+ n);
                                bill=n*900;
                                break;
                                case 4:
                                System.out.println("1----->Red Shoes");
                                System.out.println("2----->Black shoes");
                                int c=Integer.parseInt(ob.readLine());

                                System.out.print("Enter the number of shoes you want to buy");
                                n=Integer.parseInt(ob.readLine());
                                System.out.println("You have bought "+ n);
                                if(c==1)
                                {
                                    System.out.println("Red shoes cost Rs.1500");
                                    bill=bill+(n*1500);
                                }
                                if(c==2)
                                {
                                    System.out.println("black Shoes cost Rs.2000");
                                    bill=bill+(n*1500);
                                }
                                else if( c!=1 && c!=2)
                                {
                                    System.out.println("This colour is not available");
                                }
                                break;
                            }
                            System.out.println("Enter 1 if You finished shopping");
                            p=Integer.parseInt(ob.readLine());
                        } 
                        System.out.println("If you are a member please press 7");
                        int member=Integer.parseInt(ob.readLine());
                        if(member==7)
                        {
                            System.out.println("You are getting a special members discount");
                            int disc=10/100*bill;
                            bill=bill-disc;
                        }
                        System.out.println("Your total Bill at the trends boutique is"+bill);
                    }

                    if( ch.equalsIgnoreCase("toys emporium"))
                    {
                        int bill=0;
                        int p=0;
                        while(p!=1)
                        {
                            System.out.println("WELCOME TO TOYS EMPORIUM");
                            System.out.println("Fixed priced Shop ");
                            System.out.println("But Special 10% discount for members");
                            System.out.println("State the number corresponding to the  item you wish to take");
                            System.out.println("1-->toy truck");
                            System.out.println("2-->Hot wheels");
                            System.out.println("3-->Barbie");
                            System.out.println("4-->Monopoly");
                            System.out.println("5-->Scrabble");
                            int f=Integer.parseInt(ob.readLine());
                            int n;
                            switch(f)
                            {
                                case 1:
                                System.out.println("Each Toy car costs Rs.700"+"how many do you want to buy");
                                n=Integer.parseInt(ob.readLine());
                                System.out.println("You have bought "+ n);
                                bill=bill+(n*700);
                                break;
                                case 2:
                                System.out.println("Each Hot Wheels Car Costs Rs.500"+" . How many do you want to purchase");
                                n=Integer.parseInt(ob.readLine());
                                System.out.println("You have bought "+ n);
                                bill=bill+(n*500);
                                break;
                                case 3:
                                System.out.println("Each barbie Costs Rs.999"+" . How many do you want to purchase");
                                n=Integer.parseInt(ob.readLine());
                                System.out.println("You have bought "+ n);
                                bill=bill+(n*999);
                                break;
                                case 4:
                                System.out.println("Monopoly costs rs 1400"+" . How many do you want to purchase");
                                n=Integer.parseInt(ob.readLine());
                                System.out.println("You have bought "+ n);
                                bill=bill+(n*1400);
                                break;
                                case 5:
                                System.out.println("Scrabble costs Rs.1000"+"How many do you want to buy");
                                n=Integer.parseInt(ob.readLine());
                                System.out.println("You have bought "+ n);
                                bill=bill+(n*1000);
                                break;
                            }
                            System.out.println("Enter 1 if You finished shopping");
                            p=Integer.parseInt(ob.readLine());
                        } 
                        System.out.println("If you are a member please press 7");
                        int member=Integer.parseInt(ob.readLine());
                        if(member==7)
                        {
                            System.out.println("You are getting a special members discount");
                            int disc=10/100*bill;
                            bill=bill-disc;
                        }
                        System.out.println("Your total Bill at the trends boutique is"+bill);
                    }
                    if(ch.equalsIgnoreCase("linc pens"))
                    {
                        int bill=0;
                        int p=0;
                        while(p!=1)
                        {
                            System.out.println("LINC PENS");
                            int arr[]=new int[5];
                            int q=0;
                            for(int i=0;i<5;i++)
                            {
                                q=arr[i];
                                q=q+2;
                            }
                            System.out.println("State the number corresponding to the  item you wish to take");
                            System.out.println("1-->uniball fine ");
                            System.out.println("2-->Uniball micro");
                            System.out.println("3-->Uniball Boxy");
                            System.out.println("4-->Faber Castle mechanical pencil");
                            System.out.println("5-->nataraj sharpener");
                            System.out.println("6-->Sketch pens");
                            System.out.println("7-->Apsara No-dust eraser");
                            System.out.println("8-->Long scale");
                            System.out.println("9-->flora pencils");
                            System.out.println("10->Classmate register");
                            int n=Integer.parseInt(ob.readLine());
                            int flag=0;
                            for(int i=0;i<5;i++)
                            {
                                if(arr[i]==n)
                                {
                                    System.out.println("Yes, this product is available here");
                                    flag=1; 
                                    break;
                                }
                            }
                            if(flag!=1)
                                System.out.println("Sorry, This product is Not available here");
                            switch(n)
                            {
                                case 2:
                                System.out.println("Each Uniball fine costs Rs.55"+"how many do you want to buy");
                                n=Integer.parseInt(ob.readLine());
                                bill=bill+(n*55);
                                System.out.println("You have bought "+ n);
                                System.out.println("Which colour do you want");
                                System.out.println("1-->Red");
                                System.out.println("2-->Black");
                                System.out.println("3-->Blue");
                                int c=Integer.parseInt(ob.readLine());         
                                break;
                                case 4:
                                System.out.println("Each Faber Castle Mechanical pencil costs Rs. 100+ . How many do you want to purchase");
                                n=Integer.parseInt(ob.readLine());
                                System.out.println("You have bought "+ n);
                                bill=bill+(n*100);
                                break;
                                case 6:
                                System.out.println("Sketch pen box costs rs. 109"+" . How many do you want to purchase");
                                n=Integer.parseInt(ob.readLine());
                                System.out.println("You have bought "+ n);
                                bill=bill+(n*109);
                                break;
                                case 8:
                                System.out.println("Long scale rs 14"+" . How many do you want to purchase");
                                n=Integer.parseInt(ob.readLine());
                                System.out.println("You have bought "+ n);
                                bill=bill+(n*14);
                                break;
                            }
                            System.out.println("Enter 1 if You finished shopping");
                            p=Integer.parseInt(ob.readLine());
                        } 
                        System.out.println("If you are a member please press 7");
                        int member=Integer.parseInt(ob.readLine());
                        if(member==7)
                        {
                            System.out.println("You are getting a special members discount");
                            int disc=10/100*bill;
                            bill=bill-disc;
                        }

                        System.out.println("Your total Bill at the Linc pens is"+bill);
                    }
                    if(ch.equalsIgnoreCase("pink petals"))
                    {
                        int bill=0;
                        int p=0;
                        while(p!=1)
                        {         
                            System.out.print("We have different colours of the flowers also");
                            System.out.println("We have all kind of flowers available for gifting and decoration purposes");
                            System.out.println("press 1 for Orchids");
                            System.out.println("Press 2 for Roses");
                            System.out.println("Press 3for Sunflowers");
                            System.out.println("Press 4for Pansy");
                            System.out.println("Press 5 for Dahlia");
                            int f=Integer.parseInt(ob.readLine());
                            int n;
                            switch(f)
                            {
                                case 1:
                                System.out.println("Pink");
                                System.out.println("Blue");
                                String color=ob.readLine();
                                System.out.println("How many do You want to buy");
                                n=Integer.parseInt(ob.readLine());
                                System.out.println("You have bought "+ n);
                                if(color.equalsIgnoreCase("Pink"))
                                {
                                    System.out.print("You are taking"+n+" Pink flowers that cost Rs. 70");
                                    bill=bill+(n*70);
                                }
                                else if(color.equalsIgnoreCase("Blue"))
                                {
                                    System.out.print("You are taking"+n+" blue flowers that cost Rs. 70");
                                    bill=bill+(n*80);
                                }
                                else
                                    System.out.print("This color is not available");
                                break;
                                case 2:
                                System.out.println("Black");
                                System.out.println("Red");
                                System.out.println("Pink");
                                color=ob.readLine();
                                System.out.println("How many do You want to buy");
                                n=Integer.parseInt(ob.readLine());
                                System.out.println("You have bought "+ n);
                                if(color.equalsIgnoreCase("black"))
                                {
                                    System.out.println("You are taking"+n+" black flowers that cost Rs. 15");
                                    bill=bill+(n*15);
                                }
                                else if(color.equalsIgnoreCase("red"))
                                {
                                    System.out.println("You are taking"+n+" red flowers that cost Rs. 20");
                                    bill=bill+(n*20);
                                }
                                else if(color.equalsIgnoreCase("Pink"))
                                {
                                    System.out.println("You are taking"+n+" red flowers that cost Rs. 40");
                                    bill=bill+(n*40);
                                }
                                else
                                    System.out.print("This color is not available");        
                                break;
                                case 3:
                                System.out.println("Each Sunflower Costs Rs.50"+" . How many do you want to purchase");
                                n=Integer.parseInt(ob.readLine());
                                System.out.println("You have bought "+ n);
                                bill=bill+(n*50);
                                break;
                                case 4:
                                System.out.println("Pansy costs rs 14"+" . How many do you want to purchase");
                                n=Integer.parseInt(ob.readLine());
                                System.out.println("You have bought "+ n);
                                bill=bill+(n*14);
                                break;
                                case 5:
                                System.out.println("Dahlia costs Rs.100"+"How many do you want to buy");
                                n=Integer.parseInt(ob.readLine());
                                System.out.println("You have bought "+ n);
                                bill=bill+(n*100);
                                break;
                            }
                            System.out.println("If Along with this you also want these flowers arranged then there is a surcharge of Rs.50");
                            System.out.println("Press 5");
                            int ar=Integer.parseInt(ob.readLine());
                            if(ar==5)
                                bill=bill+50;
                            System.out.println("Enter 1 if You finished shopping");
                            p=Integer.parseInt(ob.readLine());
                        } 
                        System.out.println("If you are a member please press 7");
                        int member=Integer.parseInt(ob.readLine());
                        if(member==7)
                        {
                            System.out.println("You are getting a special members discount");
                            int disc=10/100*bill;
                            bill=bill-disc;
                        }       
                        System.out.println("Your total Bill at the pink petals is"+bill);
                        /*System.out.println("If you want to go out of the mall press 1");
                        flag1=Integer.parseInt(ob.readLine());*/
                    }

                }
            }
        }
    }
}

           
            
            