import java.util.*;
import java.io.*;

public class HEALTH_ANALYSIS
{
    static void main()throws IOException
    {

        System.out.println( "#       #  #########        #        #         #########  #       #");
        System.out.println( "#       #  #               # #       #             #      #       #");
        System.out.println( "#       #  #              #   #      #             #      #       #");
        System.out.println( "#########  #####         #######     #             #      #########");
        System.out.println( "#       #  #            #       #    #             #      #       #");
        System.out.println( "#       #  #           #         #   #             #      #       #");
        System.out.println( "#       #  #########  #           #  #########     #      #       #");
        System.out.println();
        System.out.println("      #        #       #        #        #     #     #    ####  #########     ####");
        System.out.println("     # #       ##      #       # #       #      #   #    #         #         #   ");
        System.out.println("    #   #      # #     #      #   #      #       # #     #         #         #    ");
        System.out.println("   #######     #  #    #     #######     #        #      #         #         #   ");
        System.out.println("  #       #    #   #   #    #       #    #        #      #         #         #  ");
        System.out.println(" #         #   #    #  #   #         #   #        #      #         #         # ");
        System.out.println("#           #  #     # #  #           #  ######## #   ####     #########  #### ");
        System.out.println();

        BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("HEALTH ANALYSIS");
        System.out.println("Made by Abhishikt Emmanuel Prakash & Aditya Omar, Class 10th");
        System.out.println("Description-In today's world, there is a need of a constant health check.");
        System.out.println("This project aims at printing the individual's health report in accordance with the data entered by him/her.");
        System.out.println();
        int run=1;
        //Main menu 

        while (run!=0)
        {
            System.out.println("MAIN MENU");
            System.out.println("Press 1 to check your OBESITY LEVEL via Bio Mass Index");
            System.out.println("Press 2 to check the amount of protein you need per day using PROTEIN POWER FORMULA");
            System.out.println("Press 3 for Calorie Calculator");
            System.out.println("Press 4 for BMR");
            System.out.println("Please enter your choice");
            int choice=Integer.parseInt(ob.readLine());
            String name;
            double height;
            double weight;

            //Choice Input

            switch(choice)
            {
                case 1:                     //checks the BMI
                System.out.println("BMI is an internationally used measure of obesity.");
                System.out.println("Enter Your Name");
                name = ob.readLine();
                System.out.println("Enter Your Height In CENTIMETRES");
                height=Double.parseDouble(ob.readLine());
                height=height/100;
                System.out.println("Enter Your Weight In KILOGRAMS");
                weight=Double.parseDouble(ob.readLine());
                System.out.println("Your BMI Report is given below ==>");
                double bmi = weight/(height*height);
                System.out.println("Name - "+name);
                System.out.println("Height - "+height+" m");
                System.out.println("Weight - "+weight+" Kgs");
                System.out.println("Bio Mass Index (BMI) - "+bmi);

                if(bmi<=18.5)
                {
                    System.out.println("You Are UNDERWEIGHT ");
                    System.out.println("Your BMI is less than NORMAL Bio Mass Index Range which is 18.5 to 24.9");
                }

                if(bmi>18.5 && bmi<=24.9)
                {
                    System.out.println("You Are Of Normal Weight");
                    System.out.println(" Your BMI NORMAL and is in the Bio Mass Index Range which is 18.5 to 24.9 ");
                }

                if(bmi>24.9)
                {
                    System.out.println("You Are OVER-WEIGHT");
                    System.out.println("You Are Over Weight as your BMI is more than Bio Mass Index Range which is 18.5 to 24.9");
                }

                System.out.println("To exit the program, press 0. To return to the Main Menu, press any other number.");
                run=Integer.parseInt(ob.readLine());
                System.out.println();
                break;
                case 2:
                System.out.println("Please Provide some details To furnish the daily protein requirement");
                System.out.println("Enter Your Weight");
                weight=Integer.parseInt(ob.readLine());
                System.out.println("In which category will you classify yourself");
                System.out.println("Enter 1 if you are Sedentary- A person who gets no physical activity ");
                System.out.println("Enter 2 If you are Moderately Active- Someone who exercises 20-30 minutes two or three times per week ");
                System.out.println("Enter 3 If you are Active- Someone who exercises 30 minutes or more three to five times per week");
                System.out.println("Enter 4 If you are Very Active- A person who exercises an hour or more at least five times per week ");
                System.out.println("Enter 5 If you are an Athlete- A competitive athlete who trains twice a day for an hour or more");
                int h=Integer.parseInt(ob.readLine());
                double pro=0;

                switch(h)
                {
                    case 1:
                    pro=0.5;
                    break;
                    case 2:
                    pro=0.6;
                    break;
                    case 3:
                    pro=0.7;
                    break;
                    case 4:
                    pro=0.8;
                    break;
                    case 5:
                    pro=1.0;
                    break;
                    default:
                }

                double protein=pro*(weight*2.205);
                System.out.println("Your daily diet should contain atleast "+protein+" gms of protein");
                System.out.println("Data calculated on the basis of measures given by World Health Organisation");
                System.out.println("To exit the program, press 0. To return to the Main Menu, press any other number.");
                run=Integer.parseInt(ob.readLine());
                System.out.println();
                break;
                case 3:
                int pi=0;
                double calorie=0;
                System.out.println("You will be asked a series of quesion and your calories will be calculated on the basis of answers given by you");
                System.out.println("Press any NUMBER and then ENTER when you are ready");
                int nouse=Integer.parseInt(ob.readLine());
                System.out.println("Do you take anything from the list below in a day? Press 1 for 1 YES , 2 for NO");
                System.out.println("Bread , Chapati , Other Indian Breads");
                int bread = Integer.parseInt(ob.readLine());

                if(bread==1)
                {
                    System.out.println("How many pieces Of the prescribed item do you take in one day?");
                    pi = Integer.parseInt(ob.readLine());
                    calorie=78.3*pi;
                }
                System.out.println("Do you take anything from the list below in a day? Press 1 for YES , 2 for NO");
                System.out.println("Boiled Fish/Mutton , Potatoes");
                int fish=Integer.parseInt(ob.readLine());
                pi=0;
                if(fish==1)
                {
                    System.out.println("How many pieces Of the prescribed item do you take in one day?");
                    pi=Integer.parseInt(ob.readLine());
                    calorie=calorie+(pi*100);
                }
                System.out.println("Do you take anything from the list below in a day? Press 1 for YES , 2 for NO");
                System.out.println("Tandoori Chicken, Cooked Chicken, Veg. dish with onions & tomatoes ");
                int chick=Integer.parseInt(ob.readLine());
                if(chick==1)
                {
                    System.out.println("How many pieces of the prescribed item do you take in one day?"); 
                    pi=Integer.parseInt(ob.readLine());
                    calorie=calorie+(pi*300);
                }
                System.out.println("Do you take anything from the list below in a day? Press 1 for YES , 2 for NO");
                System.out.println("Pulses(like DAL), Curd, Yoghurt");
                int dal=Integer.parseInt(ob.readLine());
                pi=0;
                if(dal==1)
                {
                    System.out.println("How many cups of the prescribed item do you take in one day?");
                    pi=Integer.parseInt(ob.readLine());
                    calorie=calorie+(pi*250);
                }
                System.out.println("Do you take anything from the list below in a day? Press 1 for YES , 2 for NO");
                System.out.println("Sandwich, Pakoda , Samosa , Meat Puff , Bhel Puri, French Fries, Other Snacks");
                int sam=Integer.parseInt(ob.readLine());
                if(sam==1)
                {
                    System.out.println("How many pieces of the prescribed item do you take in one day");
                    pi=Integer.parseInt(ob.readLine());
                    calorie=calorie+(pi*250);
                }
                System.out.println("Do you take NORMAL Indian Vegetables?");
                System.out.println("Press 1 for Yes , 2 for NO");
                int veg=Integer.parseInt(ob.readLine());
                if(veg==1)
                {
                    System.out.println("How much vegetable do you take in one day? Unit: 80gm = 1 unit");
                    pi=Integer.parseInt(ob.readLine());
                    calorie=calorie+(pi*250);
                }
                System.out.println("Do you take anything drom the list below in a day? Press 1 for YES , 2 for NO");
                System.out.println("Chocolate, Icecream, Other SweetMeats");
                int swe=Integer.parseInt(ob.readLine());
                if(swe==1)
                {
                    System.out.println("How many pieces of the prescribed item do you take in one day? Unit: 40gm = 1 pc.");
                    pi=Integer.parseInt(ob.readLine());
                    calorie=calorie+(pi*250);
                }
                int checking=0;
                System.out.println("You approx. gain "+calorie+" Calories per day");
                if(calorie>1200)
                {
                    System.out.println("You gain "+(calorie-1200)+" Calories more than a normal healthy person");
                    checking=1;
                }
                if(calorie<1000)
                {
                    checking=2;
                    System.out.println("You gain "+(1200-calorie)+" Calories less than a normal healthy person");
                }
                if(checking==0)
                {
                    System.out.println("Your Calorie Gain is normal");
                }
                System.out.println("To exit the program, press 0. To return to the Main Menu, press any other number.");
                run=Integer.parseInt(ob.readLine());
                System.out.println();
                break;
                case 4:
                // Setup variables and scanner
                Scanner input = new Scanner(System.in);
                int age = 0, Height = 0, Weight = 0;
                char gender, activity;
                String error="";
                double bmr = 0;

                // Welcome message
                System.out.println("This program will calculate the number of 230 calorie\ncandy bars to eat to maintain your weight.");

                // Prompt for user information
                System.out.print("\t[Q1] What is your age in years? ");
                age = input.nextInt();
                System.out.print("\t[Q2] What is your total height __ feet ");
                int ho = input.nextInt();
                System.out.print("\t[Q2] __ Inches");
                int h_1= input.nextInt();
                System.out.print("\t[Q3] What is your weight in Kilogram? ");
                int w = input.nextInt();
                System.out.print("\t[Q4] Enter 'M' (or 'm') for male calculation or 'F' (or 'f') for female: ");
                gender=input.next().charAt(0);
                System.out.println("\t[Q5] Are you:\n\t\tA. Sedentary\n\t\tB. Somewhat active (exercise occasionally)\n\t\tC. Active (exercise 3-4 days per week)\n\t\tD. Highly active (exercise every day)\n");
                System.out.print("\t[Q6] Enter A, B, C, or D: ");
                activity = input.next().charAt(0);

                input.close(); // Close the Scanner input

                //Weight in pounds

                Weight= w*2;

                //Height in feet

                Height= ho*12+h_1;

                // Calculate BMR based on gender
                switch(gender) 
                {
                    case 'F':
                    case 'f':
                    bmr = 655 + (4.3 * Weight) + (4.7 * Height) - (4.7 * age);
                    break;
                    case 'M':
                    case 'm':
                    bmr = 66 + (6.3 * Weight) + (12.9 * Height) - (6.8 * age);
                    break;
                    default:
                    error = "Invalid entry for gender.";
                }

                // Modify BMR based on activity level
                switch (activity) 
                {
                    case 'A':
                    case 'a':
                    // Sedentary: Increase BMR by 20%
                    bmr += bmr*0.2;
                    break;
                    case 'B':
                    case 'b':
                    // Somewhat active: Increase BMR by 30%
                    bmr += bmr*0.3;
                    break;
                    case 'C':
                    case 'c':
                    // Active: Increase BMR by 40%
                    bmr += bmr*0.4;
                    break;
                    case 'D':
                    case 'd':
                    // Highly active: Increase BMR by 50%
                    bmr += bmr*0.5;
                    break;
                    default:
                    error = "Invalid entry for activity level.";

                }

                if (error.length() != 0) 
                {
                    // If there is an error, print it instead of the results
                    System.out.println(error);
                } else 
                {
                    double b= Math.round(bmr/230);
                    double m= 230*b;
                    System.out.println("\n\tWith those measurements, you should eat " + b+ " candy bars per day to maintain the same weight.");
                    System.out.println("or " +m+"  calories per day");
                }

                System.out.println("To exit the program, press 0. To return to the Main Menu, press any other number.");
                run=Integer.parseInt(ob.readLine());
                System.out.println();

            }
        }

    }

}