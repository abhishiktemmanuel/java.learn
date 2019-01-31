/** Write an application for a restaurant for allowing the customers to order for their
particular
food item and
 * finally generate the bill amount to be paid.
 */
import java.io.*;
import java.util.*;
public class Restraunt
{
    static String a[]=new String[100];static int number=0,num2=0; //declaring variables
    static double bill=0; //a[]- Storing orders;number & num2-setting place in the
    public static void Run()throws IOException
    {
        String enter;
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        do{ //using do-while loop to make loop work at least once to show all
            //orders
            System.out.println(" Welcome to The Delight");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

            System.out.println("\n");
            System.out.println("Take a look at the varieties from around the world which only we offer:");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

            System.out.println(" MAIN MENU");
            System.out.println(" 1. ITALIAN RAGE & MEXICAN SALSA");
            System.out.println(" 2. CHINESE DRAGONS");
            System.out.println(" 3. DAKSHIN TOPS");
            System.out.println(" 4. PUNJAB MAIL");
            System.out.println(" 5. NAWAABI DASTAAN");
            System.out.println("______________________________________________________________________________________");

            System.out.println("Make your choice ");//Taking user input in character form by typecasting

            int ch=Integer.parseInt(buf.readLine());
            System.out.println("\n\n\n\n\n\n\n");
            switch(ch) //Applying switch to enter another function(here- food section)
            {
                case 1:
                ita();
                break;
                case 2:
                cni();
                break;
                case 3:
                dak();
                break;
                case 4:
                pun();
                break;
                case 5:
                naw();
                break;
                default:
                System.out.println("Invalid choice:");
                break;
            }
            System.out.println("-------------------------------------------------------------------------------------");
            System.out.println("To continue ordering, type'continue'");
            System.out.println("To stop ordering, type'back'");
            enter=buf.readLine();
        }
        while(enter.equalsIgnoreCase("continue")); //checking input by function equalsIgnoreCase
        System.out.println("\n\n\n\n\n\n\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println("\t\t RECEIPT"); // printing bill
        System.out.println("_______________________________________________________________________________________________\n\n");

        System.out.println("Item\t\t\t Quantity\t\t Cost");
        System.out.println("-----------------------------------------------------------------------------------------------");
        for(number=0;number<num2;number++)
        {
            System.out.println(a[number]+" ");
        }
        double tax=8*bill/100; //taking tax rate at 8% storing tax in variable tax
        bill=bill+tax;
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
        System.out.println("Tax rate 8%/-");
        System.out.println("Total taxes Rs. "+tax);
        System.out.println("------------------------------------------------------------------------------------------------");
        System.out.println("Total amount (inc. of tax)"+bill+"/-\n");

        System.out.println("________________________________________________________________________________________________");

        System.out.println("\t\t\t\t Thank you for choosing us");
        System.out.println("\t\t\t\t Dined at");
        System.out.println("\t\t\t\t THE DELIGHT LIMITED");
        System.out.println("\t\t\t\t 101 Rocking Avenue");
        System.out.println("\t\t\t\t outlet no. 23");
        System.out.println("\t\t\t\t Kolkata 700987");
        System.out.println("\t\t\t\t West Bengal");
        System.out.println("\t\t\t\t phn +91-33-2534-5061");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        number=0;num2=0;bill=0;
    }

    static void ita()throws IOException //initiating a new function
    {
        String enter=("cont"); //taking variable 'enter' to initialise string
        Scanner inpt=new Scanner(System.in);

        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        do{
            System.out.println("~~~~~~~~~~~~~~~~~~~~~ITALIAN RAGE & MEXICANSALSA~~~~~~~~~~~~~~~~~~~~~~~~~\n");

            System.out.println(" Choose your order number corresponding to the item and type it:\n\n");
            System.out.println("----------------------------------------------------------------------------");
            System.out.println(" 1. Cheese,capsicum pizza Rs. 140");
            System.out.println(" 2. Cheese,margerita pizza Rs. 160");
            System.out.println(" 3. Chicken pizza(with jalapeno) Rs. 180");
            System.out.println(" 4. Chicken pizza(no jalapeno) Rs. 160");
            System.out.println(" 5. Ultimate pizza(Veg.) Rs. 250");
            System.out.println(" 6. Ultimate pizza(Non. Veg.) Rs. 300");
            System.out.println(" 7. Cheese pepperoni pizza Rs. 275");
            System.out.println(" 8. Tacho with chips Rs. 165");
            System.out.println(" 9. Bean casserole Rs. 200");
            System.out.println(" 10. Macaroni in Arabiatta Sauce Rs. 150");
            System.out.println(" 11. Nacho with salsa dip Rs. 80\n");
            int num=Integer.parseInt(buf.readLine()); //reading orders inputted
            System.out.println("Enter No. of plates:"); //taking no.of.orders
            int order=Integer.parseInt(buf.readLine());
            switch(num) //using switch to enter order as per user's choice
            {
                case 1:
                a[number]=("Cheese,capsicum pizza "+order+" \tRs. 140");
                //saving order inputted in an array
                number++;
                num2++;
                bill=bill+(140*order);
                break;
                case 2:
                a[number]=("Cheese,margerita pizza "+order+" \tRs. 160");
                bill=bill+(160*order);
                number++;
                num2++;
                break;
                case 3:
                a[number]=("Chicken pizza(with jalapeno) "+order+" \tRs. 180");
                bill=bill+(180*order);
                number++;
                num2++;
                break;
                case 4:
                a[number]=("Chicken pizza(no jalapeno) "+order+" \tRs. 160");
                bill=bill+(160*order);
                number++;
                num2++;
                break;
                case 5:
                a[number]=("Ultimate pizza(Veg.) "+order+" \t Rs. 250");
                bill=bill+(250*order);
                number++;
                num2++;
                break;
                case 6:
                a[number]=("Ultimate pizza(Non. Veg.) "+order+" \t Rs. 300");
                bill=bill+(300*order);
                number++;
                num2++;
                break;
                case 7:
                a[number]=("Cheese pepperoni pizza "+order+" \tRs. 275");
                bill=bill+(275*order);
                number++;
                num2++;
                break;
                case 8:
                a[number]=("Tacho with chips "+order+"\t Rs. 165");
                bill=bill+(165*order);
                number++;
                num2++;
                break;
                case 9:
                a[number]=("Bean casserole "+order+" \tRs. 200");
                bill=bill+(200*order);
                number++;
                num2++;
                break;
                case 10:
                a[number]=("Macaroni in Arabiatta Sauce "+order+" \tRs. 150");
                bill=bill+(150*order);
                number++;
                num2++;
                break;
                case 11:
                a[number]=("Nacho with salsa dip "+order+"\t Rs. 80");
                bill=bill+(80*order);
                number++;
                num2++;
                break;
                default:
                System.out.println("Invalid choice:");
                break;
            }
            System.out.println("To continue:type 'cont'\nTo return to main menu:press 'enter'");
            enter=buf.readLine();
        }
        while(enter.equalsIgnoreCase("cont"));
        System.out.println("\n");
    }

    static void cni()throws IOException //initiating a new function
    {
        String enter=("cont"); //taking variable 'enter' to initialise string
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        do{
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~CHINESEDRAGONS~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

            System.out.println("\n Choose your order number corresponding to the item and typeit:\n\n");

            System.out.println(" 1. Veg. Chowmein(Singapore) Rs. 120");
            System.out.println(" 2. Chicken Chowmein(Singapore) Rs. 140");
            System.out.println(" 3. Chicken Chowmein(Schezwan) Rs. 150");
            System.out.println(" 4. Veg. Chowmein(Schezwan) Rs. 140");
            System.out.println(" 5. Chilli Chicken Rs. 150");
            System.out.println(" 6. American Chopsuey(Non-Veg.) Rs. 200");
            System.out.println(" 7. American Chopsuey(Veg.) Rs. 175");
            System.out.println(" 8. Chilli Paneer Rs. 125");
            System.out.println(" 9. Diced veggies in Hong Kong Sauce Rs. 180");
            System.out.println(" 10. Diced chicken in Hong Kong Sauce Rs. 200");
            System.out.println(" 11. Malaysian Fried Rice Rs. 160"+"\n");
            int num=Integer.parseInt(buf.readLine()); //reading orders inputted
            System.out.println("Enter No. of plates:");
            int order=Integer.parseInt(buf.readLine());
            switch(num)
            {
                case 1: //saving order inputted in an array
                a[number]=("Veg. Chowmein(Singapore) "+order+"\t Rs. 120");
                number++;
                num2++;
                bill=bill+(120*order);
                break;
                case 2:
                a[number]=("Chicken Chowmein(Singapore) "+order+" \tRs. 140");
                bill=bill+(140*order);
                number++;
                num2++;
                break;
                case 3:
                a[number]=("Chicken Chowmein(Schezwan) "+order+" \tRs.150");

                bill=bill+(150*order);
                number++;
                num2++;
                break;
                case 4:
                a[number]=("Veg. Chowmein(Schezwan) "+order+" \tRs.140");

                bill=bill+(140*order);
                number++;
                num2++;
                break;
                case 5:
                a[number]=("Chilli Chicken "+order+"\t Rs. 150");
                bill=bill+(150*order);
                number++;
                num2++;
                break;
                case 6:
                a[number]=("American Chopsuey(Non-Veg.) "+order+"\t Rs. 200");
                bill=bill+(200*order);
                number++;
                num2++;
                break;
                case 7:
                a[number]=("American Chopsuey(Veg.) "+order+"\t Rs. 175");
                bill=bill+(175*order);
                number++;
                num2++;
                break;
                case 8:
                a[number]=("Chilli Paneer "+order+" \tRs. 125");
                bill=bill+(125*order);
                number++;
                num2++;
                break;
                case 9:
                a[number]=("Diced veggies in Hong Kong Sauce " +order+" \tRs.180");

                bill=bill+(180*order);
                number++;
                num2++;
                break;
                case 10:
                a[number]=("Diced chicken in Hong Kong Sauce "+order+"\t Rs.200");

                bill=bill+(200*order);
                number++;
                num2++;
                break;
                case 11:
                a[number]=("Malaysian Fried Rice "+order+" \tRs. 160");
                bill=bill+(160*order);
                number++;
                num2++;
                break;
                default:
                System.out.println("Invalid choice:");
                break;
            }
            System.out.println("To continue:type 'cont'\nTo return to main menu:press 'enter'");
            enter=buf.readLine();
        }
        while(enter.equalsIgnoreCase("cont"));
        System.out.println("");
    }

    static void dak()throws IOException //initiating a new function
    {
        String enter=("cont"); //taking variable 'enter' to initialise string
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        do{
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~DAKSHINTOPS~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

            System.out.println("\n Choose your order number corresponding to the item and typeit:\n\n");

            System.out.println(" 1. Sambhar Bada Rs. 60");
            System.out.println(" 2. Rava Idli Rs. 70");
            System.out.println(" 3. Paper Plain Dosa Rs. 50");
            System.out.println(" 4. Plain Dosa Rs. 60");
            System.out.println(" 5. Masala Dosa Rs. 90");
            System.out.println(" 6. Mysore Masala Dosa Rs. 110");
            System.out.println(" 7. Rava Uttapam(Tomato) Rs. 110");
            System.out.println(" 8. Rava Uttapam(Onion) Rs. 120");
            System.out.println(" 9. Rava Uttapam(Tomato & Onion) Rs. 150");
            System.out.println(" 10. Paneer Masala Dosa Rs. 150");
            System.out.println(" 11. Upma with sambhar Rs. 100"+"\n");
            int num=Integer.parseInt(buf.readLine()); //reading orders inputted
            System.out.println("Enter No. of plate:");
            int order=Integer.parseInt(buf.readLine());
            switch(num)
            {
                case 1: //saving order inputted in an array
                a[number]=("Sambhar Bada "+order+" \tRs. 60");
                number++;
                num2++;
                bill=bill+(60*order);
                break;
                case 2:
                a[number]=("Rava Idli "+order+" \t Rs. 70");
                bill=bill+(70*order);
                number++;
                num2++;
                break;
                case 3:
                a[number]=("Paper Plain Dosa "+order+" \t Rs. 50");
                bill=bill+(50*order);
                number++;
                num2++;
                break;
                case 4:
                a[number]=("Plain Dosa "+order+" \t Rs. 60");
                bill=bill+(60*order);
                number++;
                num2++;
                break;
                case 5:
                a[number]=("Masala Dosa "+order+" \tRs. 90");
                bill=bill+(90*order);
                number++;
                num2++;
                break;
                case 6:
                a[number]=("Mysore Masala Dosa "+order+"\t Rs. 110");
                bill=bill+(110*order);
                number++;
                num2++;
                break;
                case 7:
                a[number]=("Rava Uttapam(Tomato) "+order+"\t Rs. 110");
                bill=bill+(110*order);
                number++;
                num2++;
                break;
                case 8:
                a[number]=("Rava Uttapam(Onion) "+order+"\t Rs. 120");
                bill=bill+(120*order);
                number++;
                num2++;
                break;
                case 9:
                a[number]=("Rava Uttapam(Tomato & Onion) "+order+"\t Rs. 150");
                bill=bill+(150*order);
                number++;
                num2++;
                break;
                case 10:
                a[number]=("Paneer Masala Dosa "+order+" \tRs. 150");
                bill=bill+(150*order);
                number++;
                num2++;
                break;
                case 11:
                a[number]=("Upma with sambhar "+order+" \tRs. 100");
                bill=bill+(100*order);
                number++;
                num2++;
                break;
                default:
                System.out.println("Invalid choice:");
                break;
            }
            System.out.println("To continue:type 'cont'\nTo return to main menu:press 'enter'");
            enter=buf.readLine();
        }
        while(enter.equalsIgnoreCase("cont"));
        System.out.println("\n");
    }

    static void pun()throws IOException //initiating a new function
    {
        String enter=("cont"); //taking variable 'enter' to initialise string
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        do{
            System.out.println("~~~~~~~~~~~~~~~~~~~~~PUNJABMAIL~~~~~~~~~~~~~~~~~~~~~~~~~");

            System.out.println("\nChoose your order number corresponding to the item and type it:\n\n");
            System.out.println(" 1. Dal Makhani Rs. 60");
            System.out.println(" 2. Dal Fry - Rs. 50");
            System.out.println(" 3. Paneer Butter Masala - Rs. 90");
            System.out.println(" 4. Shahi Paneer - Rs. 90");
            System.out.println(" 5. Khoya Paneer - Rs. 80");
            System.out.println(" 6. Tandoori Chicken(full) - Rs. 200");
            System.out.println(" 7. Tandoori Chicken(half) - Rs. 110");
            System.out.println(" 8. Butter Chicken - Rs. 125");
            System.out.println(" 9. Afghani Chicken - Rs. 125");
            System.out.println(" 10. Handi Chicken - Rs. 150");
            System.out.println(" 11. Chicken Dahi Kalimirch - Rs. 125"+"\n");
            int num=Integer.parseInt(buf.readLine()); //reading orders inputted
            System.out.println("Enter No. of plates:");
            int order=Integer.parseInt(buf.readLine());
            switch(num)
            {
                case 1: //saving order inputted in an array
                a[number]=("Dal Makhani "+order+"\t Rs. 60");
                number++;
                num2++;
                bill=bill+(60*order);
                break;
                case 2:
                a[number]=("Dal Fry "+order+" \tRs. 50");
                bill=bill+(50*order);
                number++;
                num2++;
                break;
                case 3:
                a[number]=("Paneer Butter Masala "+order+"\t Rs. 90");
                bill=bill+(90*order);
                number++;
                num2++;
                break;
                case 4:
                a[number]=("Shahi Paneer "+order+" \tRs. 90");
                bill=bill+(90*order);
                number++;
                num2++;
                break;
                case 5:
                a[number]=("Khoya Paneer "+order+"\t Rs. 80");
                bill=bill+(80*order);
                number++;
                num2++;
                break;
                case 6:
                a[number]=("Tandoori Chicken(full) "+order+"\t Rs. 200");
                bill=bill+(200*order);
                number++;
                num2++;
                break;
                case 7:
                a[number]=("Tandoori Chicken(half) "+order+"\t Rs. 110");
                bill=bill+(110*order);
                number++;
                num2++;
                break;
                case 8:
                a[number]=("Butter Chicken "+order+"\t Rs. 125");
                bill=bill+(125*order);
                number++;
                num2++;
                break;
                case 9:
                a[number]=("Afghani Chicken "+order+"\t Rs. 125");
                bill=bill+(125*order);
                number++;
                num2++;
                break;
                case 10:
                a[number]=("Handi Chicken "+order+" \tRs. 150");
                bill=bill+(150*order);
                number++;
                num2++;
                break;
                case 11:
                a[number]=("Chicken Dahi Kalimirch "+order+"\t Rs. 125");
                bill=bill+(125*order);
                number++;
                num2++;
                break;
                default:
                System.out.println("Invalid choice:");
                break;
            }
            System.out.println("To continue:type 'cont'\nTo return to main menu:press 'enter'");
            enter=buf.readLine();
        }
        while(enter.equalsIgnoreCase("cont"));
        System.out.println("\n");
    }

    static void naw()throws IOException //initiating a new function
    {
        String enter=("cont"); //taking variable 'enter' to initialise string
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        do{
            System.out.println("~~~~~~~~~~~~~~~~~~NAWAABIDASTAAN~~~~~~~~~~~~~~~~~~~~~");

            System.out.println("\n Choose your order number corresponding to the item and typeit:\n\n");

            System.out.println(" 1. Gobhi Musallam Rs. 100");
            System.out.println(" 2. Murg Musallam Rs. 150");
            System.out.println(" 3. Hari-bhari Kebab Rs. 120");
            System.out.println(" 4. Gilauti Kebab Rs. 150");
            System.out.println(" 5. Murg Lahori Rs. 175");
            System.out.println(" 6. Rogan Josh Rs. 200");
            System.out.println(" 7. Hyderabadi Paya Rs. 275");
            System.out.println(" 8. Hyderabadi Biryani(Non. Veg) Rs. 200");
            System.out.println(" 9. Hyderabadi Biryani(Veg) Rs. 175");
            System.out.println(" 10. Seekh Kebeb Rs. 150");
            System.out.println(" 11. Kulcha/Sheermal Rs. 20");
            int num=Integer.parseInt(buf.readLine()); //reading orders inputted
            System.out.println("Enter No. of plates:");
            int order=Integer.parseInt(buf.readLine());
            switch(num)
            {
                case 1: //saving order inputted in an array
                a[number]=("Gobhi Musallam "+order+"\t Rs. 100");
                number++;
                num2++;
                bill=bill+(100*order);
                break;
                case 2:
                a[number]=("Murg Musallam "+order+"\t Rs. 150");
                bill=bill+(150*order);
                number++;
                num2++;
                break;
                case 3:
                a[number]=("Hari-bhari Kebab "+order+"\t Rs.120");
                bill=bill+(120*order);
                number++;
                num2++;
                break;
                case 4:
                a[number]=("Gilauti Kebab "+order+"\t Rs. 150");
                bill=bill+(150*order);
                number++;
                num2++;
                break;
                case 5:
                a[number]=("Murg Lahori "+order+" \tRs. 175");
                bill=bill+(175*order);
                number++;
                num2++;
                break;
                case 6:
                a[number]=("Rogan Jos "+order+"\t Rs.200");
                bill=bill+(200*order);
                number++;
                num2++;
                break;
                case 7:
                a[number]=("Hyderabadi Paya "+order+"\t Rs. 275");
                bill=bill+(275*order);
                number++;
                num2++;
                break;
                case 8:
                a[number]=("Hyderabadi Biryani(Non. Veg) "+order+" \tRs. 200");
                bill=bill+(200*order);
                number++;
                num2++;
                break;
                case 9:
                a[number]=("Hyderabadi Biryani(Veg) "+order+"\t Rs. 175");
                bill=bill+(175*order);
                number++;
                num2++;
                break;
                case 10:
                a[number]=("Seekh Kebab "+order+"\t Rs. 150");
                bill=bill+(150*order);
                number++;
                num2++;
                break;
                case 11:
                a[number]=("Kulcha/Sheermal "+order+" \tRs. 20");
                bill=bill+(20*order);
                number++;
                num2++;
                break;
                default:
                System.out.println("Invalid choice:");
                break;
            }
            System.out.println("To continue:type 'cont'\nTo return to main menu:press 'enter'");
            enter=buf.readLine();
        }
        while(enter.equalsIgnoreCase("cont"));
        System.out.println("\n");
    }
}