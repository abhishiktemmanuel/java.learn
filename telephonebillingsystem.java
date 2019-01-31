 /*PRERNA BIRLA
 *CLASS 10 C
 *PROJECT
 *Topic:To calculate each month's telephone bill
 */
    import java.io.*;
    class telephonebillingsystem
    {
        public static void main(                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    )throws IOException
        {   
            BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("MENU");
            System.out.println("Input the following data to get your telephone bill");
            System.out.println("Input your name");
            String s=ob.readLine();
            System.out.println("Input your address");
            String str=ob.readLine();
            System.out.println("Input your phone number");
            String pn=ob.readLine();
            System.out.println("Input the no. of local calls");
            int lc=Integer.parseInt(ob.readLine());
            System.out.println("Input the no. of trunk calls");
            int tc=Integer.parseInt(ob.readLine());
            System.out.println("Input Phonogram charge");
            //Phonogram charge depends upon the amount of matter
            double pc=Double.parseDouble(ob.readLine());
            System.out.println("Input the total time for which local calls are made(in minutes)");
            int m=Integer.parseInt(ob.readLine());
            System.out.println("Input the total time for which trunk calls are made(in minutes)");
            int M=Integer.parseInt(ob.readLine());
            System.out.println("Input the previous month's bill");
            double p=Double.parseDouble(ob.readLine());
            System.out.println("Input the amount paid last month");
            double lm=Double.parseDouble(ob.readLine());
            System.out.println("Input 1 if you have a broadband connection");
            System.out.println("Input 2 if you do not have a broadband connection");
            
            int ch=Integer.parseInt(ob.readLine());
            double band=0.0;
            switch(ch)
            {
                case 1:
                band=475.0;
                break;
                case 2:     
                band=0.0;
                break;
            }
            int tcalls=lc+tc;
            int cc=tc-100;//to get the number of chargeable calls
            System.out.println("    "+"YOUR MONTHLY BILL");
            System.out.println("        "+s);
            System.out.println("        "+str);
            System.out.println();
            System.out.println();
            System.out.println("    "+pn);
            System.out.println();
            System.out.println("Total calls"+"   "+"Free calls"+"   "+"Chargeable calls");
            System.out.println("   "+tc+"           "+"100"+"               "+cc);
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            double fcharge=360.00;
            System.out.println("Fixed Monthly Charges"+"    "+fcharge);
            double bill;
            double amt;
            
            //For Local calls the present rates are Re.1 for 3 minutes
            double m1=(double)m/3;//to get the total charges on local calls
            System.out.println("Local Call Charge"+"    "+m1);
            //For STD calls,the present rates are Re.1 for 1 minute
            double m2=(double)M/1;//to get the total charges on STD calls
            System.out.println("Trunk Call Charge"+"    "+m2);
            double stax=((fcharge+m1)*10)/100;
            System.out.println("Service Tax"+"  "+stax);
            double c;
            double d;
            if(p>lm)
            {
                d=p-lm;
                c=0.0;
            }
            else if(p<lm)
            {
                d=0.0;
                c=lm-p;
            }
            else 
            {
                d=0.0;
                c=0.0;
            }
            System.out.println("Credit"+"  "+c);
            System.out.println("Debit"+"   "+d);
            System.out.println("Phonogram Charge"+"   "+pc);
            amt=fcharge+m1+m2+pc+c+d+stax;
            System.out.println("TOTAL CHARGE"+"    "+amt);
            double scharge=(25*amt)/100;
            System.out.println("Surcharge"+"  "+scharge);
            bill=amt+scharge;
            System.out.println("Amount Payable"+"    "+bill);
            System.out.println("        "+"THANK YOU");
        }
    }  
    
    





















