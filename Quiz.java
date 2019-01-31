
 /**
 * Computer Project on Bournvita Quiz Contest.
 * This program consists of two main fields BQC Quiz Contest for single player and Inter School quiz Contest 
 * which is played between Two Teams.In BQC Quiz Contest 10 fiels with 10 Questions each are there and the 
 * user has to score more than 40 marks in one field to qualify for the All-Asia BQC Finals.Whereas in Inter 
 * School Quiz Contest there are 6 six rounds each having a question for the two teams.The team with maximum 
 * points at the end of the program wins the game.This program helps you to test your General Knowledge and 
 * also helps in winning a BQC Merit Certificate .
 * 
 * @author (Ankit Tulsyan) 
 * @Class  (Class X-B)
 * @Version (17/11/05)
 */
   //Two Java packages are used which have been imported from the library.
    import java.util.*;//to display the date and time
    import java.io.*;//to handle io exceptions
    public class Quiz 
    {
      //Constructor for objects of class Quiz
        String yname;
        Quiz()
        {
            yname="";
        }
        /*
        *Please Enter your Name 
        */
        Quiz(String main)
        {
            yname=main;
        }
        public void main()throws IOException
        {   
            BufferedReader inp=new BufferedReader(new InputStreamReader(System.in));                         
 
                Date getYear=new Date();
                //Used to print the current date and the year at which the program started
                 System.out.println("                                                                     <><><><><><><><><><><><><><><>");
                System.out.println("                                                                      "+getYear);
                 System.out.println("                                                                     <><><><><><><><><><><><><><><> ");
                // String Array used to store the name of the earlier champions and their details
                String namet2[]=new String [100];
                String zone[]=new String [100];
                String school2[]=new String [100];
                String email[]=new String [100];
                String answer[]=new String [100];
                String namet[]=new String[100];
                String currentyear[]=new String[100];
                String School[]=new String[100];
               namet[0]="Nirica Borges";
               namet[1]="Joe Christy";
               namet[2]="Shaambhavi Pandya";                                                                                                                                        
               namet[3]="Ela Verma";
               currentyear[0]="2001";
               currentyear[1]="2002";
               currentyear[2]="2003";
               currentyear[3]="2004";
               School[0]="Bombay International Scool,Mumbai";
               School[1]="Mount Saint Mary's School,New Delhi";
               School[2]="Bombay Scottish School,Mumbai";
               School[3]="Sacred Heart Convent School,Jamshedpur";
                int score=0,score1=0,score2=0;
                int c=3,n=1,b1,read,b3,m=1,ch6;
                String s1="";
                String a1="";
                String a2="";
                String a3="";
                String choice6="";
                String name2="";
                String school1="";
                String year="";
                System.out.println("                             Welcome to the Bournvita Quiz Contest");
                System.out.println("                             #####################################");
                System.out.println("______________________________________________________________________________________________________________");                                                       
                System.out.println("            oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo");
                System.out.println("            oooooooooooooooooooooooooooooooooooo############oooooooooooooooooooooooooooooooooooooo");
                System.out.println("            oooooooooooooooooooooooooooooooooo#################ooooooooooooooooooooooooooooooooooo");
                System.out.println("            oooooooooooooooooooooooooooooooo###################ooooooooooooooooooooooooooooooooooo");
                System.out.println("            ooooooooooooooooooooooooooooooo####################ooooooooooooooooooooooooooooooooooo");
                System.out.println("            oooooooooooooooooooooooooooooo##oooooooooooooo#####ooooooooooooooooooooooooooooooooooo");
                System.out.println("            oooooooooooooooooooooooooooooo##ooooooooooooooo####ooooooooooooooooooooooooooooooooooo");
                System.out.println("            ooooooooooooooooooooooooooooooo#oooooooooooooo###ooooooooooooooooooooooooooooooooooooo");
                System.out.println("            oooooooooooooooooooooooooooooooo#oooooooooooo##ooooooooooooooooooooooooooooooooooooooo");
                System.out.println("            oooooooooooooooooooooooooooooooooooooooooooo##oooooooooooooooooooooooooooooooooooooooo");
                System.out.println("            oooooooooooooooooooooooooooooooooooooooooo##oooooooooooooooooooooooooooooooooooooooooo");
                System.out.println("            oooooooooooooooooooooooooooooooooooooooooo##oooooooooooooooooooooooooooooooooooooooooo");
                System.out.println("            oooooooooooooooooooooooooooooooooooooooooo#ooooooooooooooooooooooooooooooooooooooooooo");
                System.out.println("            oooooooooooooooooooooooooooooooooooooooooo#ooooooooooooooooooooooooooooooooooooooooooo");
                System.out.println("            oooooooooooooooooooooooooooooooooooooooooo#ooooooooooooooooooooooooooooooooooooooooooo");
                System.out.println("            oooooooooooooooooooooooooooooooooooooooooo#ooooooooooooooooooooooooooooooooooooooooooo");
                System.out.println("            oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo");  
                System.out.println("            ooooooooooooooooooooooooooooooooooooooooo###oooooooooooooooooooooooooooooooooooooooooo");
                System.out.println("            oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo");
                System.out.println("______________________________________________________________________________________________________________");    
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println("                                        Press Enter to Begin");
            String sa1=inp.readLine();
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println();
            System.out.print("                                          Hi!");
            System.out.println(                                             yname);
            System.out.println("                                          ################");
            System.out.println("                                 Welcome to the Bournivita Quiz Contest");                             
            System.out.println("                                 ######################################");
            System.out.println();
            int i=1;
            while(i==1)
             {  
             //Menu Displaying The Category of Questions
            System.out.println("<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>");
            System.out.println("<> Press 1 to play BQC Quiz Contest [For Single Player]       <>");
            System.out.println("<> Press 2 to play Inter School Quiz Contest [For Two Teams]  <>");
            System.out.println("<> Press 3 to see our Different Logos                         <>");
            System.out.println("<> Press 4 to see our BQC Winners Book                        <>");
            System.out.println("<> Press 5 to see our Viewers Question                        <>");
            System.out.println("<> Press 6 to Exit The Program                                <>");
            System.out.println("<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>");
            System.out.println("                                          Enter Your Choice");
            System.out.print("                                                   ");        
            String sp=inp.readLine();
            int mn=Integer.parseInt(sp);
            switch(mn)
            {   
            
                case 1:
                // Displays the Rules and Regulations of the Game
                System.out.println("______________________________________________________________________________________________________________ ");
                System.out.println("                                     Rules and Regulations ");
                System.out.println("                                     *********************");
                System.out.println("______________________________________________________________________________________________________________ ");
                System.out.println("1.)This game can be played by one person only.The computer acts as the Quiz Master");
                System.out.println("There are different fields having four options each.There are 10 questions in each field");
                System.out.println("Remember,the Quiz Master's(computers) decision shall be final");
                System.out.println();
                System.out.println("2.)Each question in these 9 sections from(2-10) offers four optional answers ");
                System.out.println("You have to Press the correct option number. ");
                System.out.println("                        Example: For option 2");
                System.out.println("                Press 2 in front of the option Answer");
                System.out.println();
                System.out.println("3.)There is '+10' points for each correct answer and '-5' points for the wrong answer");
                System.out.println();
                System.out.println("4.)If you score above 40 points then you qualify for our Finals");
                System.out.println();
                System.out.println("5.)There is also a Speed Round having 5 Sets in option no.11 .You have to choose");
                System.out.println("one of the rounds among these 5 Sets .");
                System.out.println();
                System.out.println("6.)The scoring system for the speed round is '+10' for the correct answer and no negative");                  System.out.println("marking for the wrong answers.");
                System.out.println();
                System.out.println("7.)In order to qualify for the finals in th speed round your score should be greater than");
                System.out.println("or equal to 50 points");
                System.out.println();
                System.out.println("8.)If you attain the above given marks you qualify directly for the All-Asia Finals");
                System.out.println("and you get a Merit Certificate");
                System.out.println();
                System.out.println("_______________________________________________________________________________________________________________");
                System.out.println("                                         Press 'Enter' to continue");
                System.out.print("                                                   ");  
                a3=inp.readLine();
                System.out.println("                                         Please select your field");
                System.out.println("                                         ########################");
            System.out.println("Press 1  for  Computer & Internet ");
            System.out.println("Press 2  for  India");
            System.out.println("Press 3  for  Geography");
            System.out.println("Press 4  for  Movies & Entertainment");
            System.out.println("Press 5  for  Sports");
            System.out.println("Press 6  for  Science And Wildlife");
            System.out.println("Press 7  for  Mixed Bag");
            System.out.println("Press 8  for  Take Your Pick");
            System.out.println("Press 9  for  History");
            System.out.println("Press 10 for  Speed Round");
            System.out.println("Press 11 to to return to the Main Menu");
            System.out.println("______________________________________________________________________________________________________________");
            System.out.println("                       Each question in this section offers four optional answers.");
            System.out.println("                                       Which one is correct ?");
            System.out.println("                                     Put on your Thinking Caps !!! ");
            System.out.println("______________________________________________________________________________________________________________ ");
            System.out.println("                                          Enter Your Choice");
            System.out.print("                                                   ");                                             
            s1=inp.readLine();          
            int ch=Integer.parseInt(s1);
             switch(ch)
            {   
                                         
                // The comments used in case '1' are similar for the first 10 cases till the Speed Round    
                
                case 1:
                // Displays Questions on Computer and Internet  
                System.out.println("Q1.A museum dedicated to which person might you see at www.althorp.com?");
                System.out.println("1.)Prince Charles");
                System.out.println("2.)Lady Diana");
                System.out.println("3.)Queen Victoria");
                System.out.println("4.)Queen Elizabeth");
                System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==2)
                {
                score=score+10;
                System.out.println("Your answer is correct");
                }
                else
                {
                score=score-5;
                System.out.println("Sorry!your answer is incorrect");
                System.out.println("The correct answer is Lady Diana");
                }
                System.out.println();
                 
                System.out.println("Q2.The processing speed of a computer is measured in ?");
                System.out.println("1.)Mega Byte");
                System.out.println("2.)16-bit,32bit etc.");
                System.out.println("3.)Mega Hertz");
                System.out.println("4.)None of the above");
                System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==3)
                {
                score=score+10;
                System.out.println("Your answer is correct");
                }
                else
                {
                score=score-5;
                System.out.println("Sorry!your answer is incorrect");
                System.out.println("The correct answer is Mega Hertz");
                }
                System.out.println();
                
                System.out.println("Q3.DOS is a  .................. ?");
                System.out.println("1.)A single user operating system");
                System.out.println("2.)Multi-user operating system");
                System.out.println("3.)Single user but multi-programming system");
                System.out.println("4.)Multi-user and multi-programming system");
                System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==1)
                {
                score=score+10;
                System.out.println("Your answer is correct");
                }
                else
                {
                score=score-5;
                System.out.println("Sorry!your answer is incorrect");
                System.out.println("The correct answer is A single user operating system");
                }
                System.out.println();
                 
                    
                System.out.println("Q4.Which of the following is not a software package ?");
                System.out.println("1.)UNIX");
                System.out.println("2.)MICR");
                System.out.println("3.)PC DOS");
                System.out.println("4.)MICHELANGELO VIRUS");
                System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==2)
                {
                score=score+10;
                System.out.println("Your answer is correct");
                }
                else
                {
                score=score-5;
                System.out.println("Sorry!your answer is incorrect");
                System.out.println("The correct answer is MICR");
                }
                System.out.println();
                 
                System.out.println("Q5.Which of the following is an interactive programming language ?");
                System.out.println("1.)COBOL");
                System.out.println("2.)FORTRAN");
                System.out.println("3.)PASCAL");
                System.out.println("4.)None of the above");
                System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==3)
                {
                score=score+10;
                System.out.println("Your answer is correct");
                }
                else
                {
                score=score-5;
                System.out.println("Sorry!your answer is incorrect");
                System.out.println("The correct answer is PASCAL");
                }
                System.out.println();
                 
                System.out.println("Q6.In which of the following computer languages,binary digits are used to ");
                System.out.println("write a program ?");
                System.out.println("1.)ADA");
                System.out.println("2.)Binary language");
                System.out.println("3.)Machine Language");
                System.out.println("4.)Source Language");
                System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==3)
                {
                score=score+10;
                System.out.println("Your answer is correct");
                }
                else
                {
                score=score-5;
                System.out.println("Sorry!your answer is incorrect");
                System.out.println("The correct answer is Machine Language");
                }
                System.out.println();
                 
                System.out.println("Q7.Which of the following facility is not available in any Word Processing package ?");
                System.out.println("1.)Bold Face Printing");
                System.out.println("2.)Assigning value to variables");
                System.out.println("3.)Spelling check");
                System.out.println("4.)Inseritng new paragraph in a text");
                System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==2)
                {
                score=score+10;
                System.out.println("Your answer is correct");
                }
                else
                {
                score=score-5;
                System.out.println("Sorry!your answer is incorrect");
                System.out.println("The correct answer is Assigning value to variables");
                }
                System.out.println();
                 
                System.out.println("Q8.Which of the following is not a unit of the computer ?");
                System.out.println("1.)Control Unit");
                System.out.println("2.)Secondary Storage Unit");
                System.out.println("3.)Arithmetic Storage unit");
                System.out.println("4.)Primary Stotage Unit");
                System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==2)
                {
                score=score+10;
                System.out.println("Your answer is correct");
                }
                else
                {
                score=score-5;
                System.out.println("Sorry!your answer is incorrect");
                System.out.println("The correct answer is Secondary Storage Unit");
                }
                System.out.println();
                 
                System.out.println("Q9.Which of the following has the more memory capacity ?");
                System.out.println("1.)RAM");
                System.out.println("2.)ROM");
                System.out.println("3.)Floppy Disk");
                System.out.println("4.)Hard Disk");
                System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==4)
                {
                score=score+10;
                System.out.println("Your answer is correct");
                }
                else
                {
                score=score-5;
                System.out.println("Sorry!your answer is incorrect");
                System.out.println("The correct answer is Hard Disk");
                }
                System.out.println();
                 
                System.out.println("Q10.A source program is written in .............. ?");
                System.out.println("1.)High Level Language");
                System.out.println("2.)English Language");
                System.out.println("3.)Machine Language");
                System.out.println("4.)Symbolic Language");
                System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==1)
                {
                //When the user choses the correct option, the marks according to the option will be added in totalMarks
                score=score+10;
                System.out.println("Your answer is correct"); 
                //Displays the Total Score
                 System.out.println("______________________________________________________________________________________________________________");
                System.out.println("                                    Your Total Score for the round is  "+score);
                }
                else
                {
                score=score-5;
                System.out.println("Sorry!your answer is incorrect");
                System.out.println("The correct answer is High Level Language");
                System.out.println("______________________________________________________________________________________________________________");
                System.out.println("                                   Your Total Score for the round is  "+score);
                }
                if(score>40)
                {
                // If score exceeds 40 then displays the Merit Certificate by calling the function 'certificate'    
                certificate();
                System.out.println("                  Press 'Enter' to see the Date,Time and other details of our All-Asia Finals");                                         
                a2=inp.readLine();          
                System.out.println("                  Our Finals will be held on 21st November 2005 at our studio here at Mumbai");   
                System.out.println("______________________________________________________________________________________________________________");                             
                while(m==1)
                {
                //Displays the BQC Winners Book    
            System.out.println("_______________________________________________________________________________________________________________");
            System.out.println("                                           Welcome to our 'BQC Winners Book'");
            System.out.println("_______________________________________________________________________________________________________________");
            System.out.println("Press 1 to sign our Winners Book");
            System.out.println("Press 2 to read the name of our Former Champions");
            System.out.println("Press 0 to Continue Further");
            System.out.println("                                             Enter Your Choice:");
            choice6=inp.readLine();
            ch6=Integer.parseInt(choice6);
            System.out.println();
            switch(ch6)
            {
                case 1:
                //Stores the name and other details of the contestant in the array 
                c++;
                System.out.println("_______________________________________________________________________________________________________________");
                System.out.println("                                            Welcome to our 'BQC Winners Book'");
                System.out.println("_______________________________________________________________________________________________________________");
                System.out.println("Enter Your Name:");
                name2=inp.readLine();
                namet[c]=name2;
                System.out.println("Enter the current year:");
                year=inp.readLine();
                currentyear[c]=year;
                System.out.println("Enter Your School:");
                school1=inp.readLine();
                School[c]=school1;
                System.out.println("");
                System.out.println("                                        Thank you for signing our 'BQC Winners Book'"); 
                System.out.println("                                        ############################################");
                System.out.println("_______________________________________________________________________________________________________________");
                System.out.println("                                        Press Enter to Return to our'BQC Winners Book'");
                s1=inp.readLine();              
                break;
                
                case 2:
               //Displays the name of the earlier champions and the current year champion of the BQC
               //Displays the name using the String Array.
               System.out.println("______________________________________________________________________________________________________________");
               System.out.println("                                  Welcome to read the name of our Former Champions of BQC");
               System.out.println("______________________________________________________________________________________________________________");
               for(read=0;read<=c;read++)
               {
               System.out.println("                                                   "+currentyear[read]);
               System.out.println("                                       "+School[read]);
               System.out.println("                                                 "+namet[read]); 
               System.out.println("                                       #################################");                
               }
                System.out.println("Press Enter to Return to our 'BQC Winners Book'");
                s1=inp.readLine();                
                break;
            
                case 0:
                m=-1;
                break;
                }}}
                else
                {
                System.out.println("                   %%%%%%%%%Sorry!You couldn't qualify for the All-Asia Finals%%%%%%%%");
                System.out.println("______________________________________________________________________________________________________________");
                }
                //While Loop used here takes you back to the main menu or helps you to exit the program
                System.out.println("______________________________________________________________________________________________________________");
                System.out.println("    If you want to go back to the Main menu press '1' or else if you want to Stop here then press '0'");
                System.out.println("                                          Enter Your Choice");
                System.out.print("                                                   ");  
                a3=inp.readLine();
                b3=Integer.parseInt(a3);
                if(b3==1)
                {
                i=1;
                System.out.println("                                       Welcome back to the Main Menu");
                }
                else
                {
                i=0;
                System.out.println("______________________________________________________________________________________________________________");    
                System.out.print("                             Thank you ");
                System.out.print(                                  yname);
                System.out.println(" for playing the Bournvita Quiz Contest");
                System.out.println("                             %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
                System.out.println();    
                System.out.println("______________________________________________________________________________________________________________");
                System.out.println("                                          Winner of the Viewer's Question");
                System.out.println("______________________________________________________________________________________________________________");
                for(read=1;read<=n;read++)
                {
                // Displays the name of the Winner Of the Viewers question
                System.out.println("                                            ############################");    
                System.out.println("                                            "+namet2[read]);
                System.out.println("                                            "+zone[read]);
                System.out.println("                                            "+school2[read]);
                System.out.println("                                            "+email[read]); 
                System.out.println("                                            ############################");    
                System.out.println("______________________________________________________________________________________________________________");   
                }
                }
                break;
    
                case 2:
                System.out.println("Q1.What is the name of India's highest peak?");
                System.out.println("1.)Mt.Godwin Austin");
                System.out.println("2.)Nanga Parbat");
                System.out.println("3.)Dhaulagiri");
                System.out.println("4.)Kanchanjunga");
                System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==1)
                {
                score=score+10;
                System.out.println("Your answer is correct");
                }
                else
                {
                score=score-5;
                System.out.println("Sorry!your answer is incorrect");
                System.out.println("The correct answer is Mt.Godwin Austin");
                }
                System.out.println();
              
                System.out.println("Q2.Think Logically.Which Indian city should have the most Handicapped visitors?");
                System.out.println("1.)Lucknow");
                System.out.println("2.)Jaipur");
                System.out.println("3.)Mumbai");
                System.out.println("4.)Nagpur");
                System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==2)
                {
                score=score+10;
                System.out.println("Your answer is correct");
                }
                else
                {
                score=score-5;
                System.out.println("Sorry!your answer is incorrect");
                System.out.println("The correct answer is Jaipur");
                }
                System.out.println();
                 
                System.out.println("Q3.Which famous person,a teacher by profession,passed away on Teacher's Day?");
                System.out.println("1.)Pt.Jawahar Lal Nehru");
                System.out.println("2.)Rabindranath Tagore");
                System.out.println("3.)Dr.S.Radhakrishnan");
                System.out.println("4.)Mother Teresa");
                System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==4)
                {
                score=score+10;
                System.out.println("Your answer is correct");
                }
                else
                {
                score=score-5;
                System.out.println("Sorry!your answer is incorrect");
                System.out.println("The correct answer is Mother Teresa");
                }
                System.out.println();
                 
                System.out.println("Q4.Most Indian coins are circular.What geometric shape are the 20 paise coins currently in use?");
                System.out.println("1.)Pentagonal");
                System.out.println("2.)Hexagonal");
                System.out.println("3.)Circular");
                System.out.println("4.)Square");
                System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==2)
                {
                score=score+10;
                System.out.println("Your answer is correct");
                }
                else
                {
                score=score-5;
                System.out.println("Sorry!your answer is incorrect");
                System.out.println("The correct answer is Hexagonal");
                }
                System.out.println();
                 
                System.out.println("Q5.The centre proposes to come out with a number of new states.");
                System.out.println("What name has been proposed for what was originally to be called Jharkhand?");
                System.out.println("1.)Vanachal");
                System.out.println("2.)Anchal");
                System.out.println("3.)Khand");
                System.out.println("4.)Jhanchal");
                System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==1)
                {
                score=score+10;
                System.out.println("Your answer is correct");
                }
                else
                {
                score=score-5;
                System.out.println("Sorry!your answer is incorrect");
                System.out.println("The correct answer is Vanachal");
                }
                System.out.println();
                
                System.out.println("Q6.Numerically,how many times does hundred appear on the one ");
                System.out.println("hundred Rupees featuring Mahatma Gandhi?");
                System.out.println("1.)Five Times");
                System.out.println("2.)Four Times");
                System.out.println("3.)Six Times");
                System.out.println("4.)Seven Times");
                System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==3)
                {
                score=score+10;
                System.out.println("Your answer is correct");
                }
                else
                {
                score=score-5;
                System.out.println("Sorry!your answer is incorrect");
                System.out.println("The correct answer is Six Times ");
                }
                System.out.println();
                 
                System.out.println("Q7.What is the Indian euivalent of aniseed ");
                System.out.println("1.)Haldi");
                System.out.println("2.)Sauf");
                System.out.println("3.)Jeera");
                System.out.println("4.)Dhaniya Dana");
                System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==2)
                {
                score=score+10;
                System.out.println("Your answer is correct");
                }
                else
                {
                score=score-5;
                System.out.println("Sorry!your answer is incorrect");
                System.out.println("The correct answer is Sauf ");
                }
                System.out.println();
                 
                System.out.println("Q8.According to Hindu Mythology,all plants were created from which part of Brahma?");
                System.out.println("1.)His Hair");
                System.out.println("2.)His Nabhi");
                System.out.println("3.)His Feet");
                System.out.println("4.)His Hands");
                System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==1)
                {
                score=score+10;
                System.out.println("Your answer is correct");
                }
                else
                {
                score=score-5;
                System.out.println("Sorry!your answer is incorrect");
                System.out.println("The correct answer is His Hair ");
                }
                System.out.println();
                
                System.out.println("Q9.Who sang and danced under the Kadamba tree?");
                System.out.println("1.)Lord Buddha");
                System.out.println("2.)Meera Bai");
                System.out.println("3.)Lord Krishna and Radha");
                System.out.println("4.)Lord Mahavira");
                System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==3)
                {
                score=score+10;
                System.out.println("Your answer is correct");
                }
                else
                {
                score=score-5;
                System.out.println("Sorry!your answer is incorrect");
                System.out.println("The correct answer is Lord Krishna and Radha ");
                }
                System.out.println();
                
                System.out.println("Q10.Which is India's first planned Industrial city?");
                System.out.println("1.)Mangalore");
                System.out.println("2.)Bangalore");
                System.out.println("3.)Nagpur");
                System.out.println("4.)Jamshedpur");
                System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==4)
                {
                score=score+10;
                System.out.println("Your answer is correct");
                 System.out.println("______________________________________________________________________________________________________________");
                System.out.println("                                     Your Total score for the round is  "+score);
                }
                else
                {
                score=score-5;
                System.out.println("Sorry!your answer is incorrect");
                System.out.println("The correct answer is Jamshedpur ");
                 System.out.println("______________________________________________________________________________________________________________");
                System.out.println("                                    Your Total score for the round is "+score);
                }
                if(score>40)
                {
                certificate();
                System.out.println("                  Press 'Enter' to see the Date,Time and other details of our All-Asia Finals");                                         
                a2=inp.readLine();          
                System.out.println("                  Our Finals will be held on 21st November 2005 at our studio here at Mumbai");
                System.out.println("______________________________________________________________________________________________________________");
                while(m==1)
                {
                    System.out.println("_______________________________________________________________________________________________________________");
            System.out.println("                                           Welcome to our 'BQC Winners Book'");
            System.out.println("_______________________________________________________________________________________________________________");
            System.out.println("Press 1 to sign our Winners Book");
            System.out.println("Press 2 to read the name of our Former Champions");
            System.out.println("Press 0 to Continue Further");
            System.out.println("                                             Enter Your Choice:");
            choice6=inp.readLine();
            ch6=Integer.parseInt(choice6);
            System.out.println();
            switch(ch6)
            {
                case 1:
                c++;
                System.out.println("_______________________________________________________________________________________________________________");
                System.out.println("                                           Welcome to our 'BQC Winners Book'");
                System.out.println("_______________________________________________________________________________________________________________");
                System.out.println("Enter Your Name:");
                name2=inp.readLine();
                namet[c]=name2;
                System.out.println("Enter the current year:");
                year=inp.readLine();
                currentyear[c]=year;
                System.out.println("Enter Your School:");
                String lo=inp.readLine();
                School[c]=lo;
                System.out.println("");
                System.out.println("                                        Thank you for signing our 'BQC Winners Book'"); 
                System.out.println("                                        ############################################");
                System.out.println("_______________________________________________________________________________________________________________");
                System.out.println("                                        Press Enter to Return to our 'BQC Winners Book'");
                s1=inp.readLine();              
                break;
                
                case 2:
               System.out.println("______________________________________________________________________________________________________________");
                System.out.println("                                  Welcome to read the name of our Former Champions of BQC");
                  System.out.println("______________________________________________________________________________________________________________");
                for(read=0;read<=c;read++)
                {     
                System.out.println("                                                   "+currentyear[read]);
                System.out.println("                                       "+School[read]);
                System.out.println("                                                 "+namet[read]); 
                  System.out.println("                                       #################################");                
                }
                System.out.println("Press Enter to Return to our 'BQC Winners Book'");
                s1=inp.readLine();                
                break;
            
                case 0:
                m=-1;
                break;
                }}}
                else
                System.out.println("                   %%%%%%%%%Sorry!You couldn't qualify for the All-Asia Finals%%%%%%%%");
                System.out.println("______________________________________________________________________________________________________________");
                System.out.println();
                
                System.out.println("    If you want to go back to the Main menu press '1' or else if you want to Stop here then press '0'");
                System.out.println("                                          Enter Your Choice");
                System.out.print("                                                   ");  
                a3=inp.readLine();
                b3=Integer.parseInt(a3);
                if(b3==1)
                {
                i=1;
                System.out.println("                                       Welcome back to the Main Menu");
                }
                else
                {
                i=0;
                System.out.print("                             Thank you ");
                System.out.print(                                  yname);
                System.out.println(" for playing the Bournvita Quiz Contest");
                System.out.println("                             %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
                System.out.println("______________________________________________________________________________________________________________");
                System.out.println("                                          Winner of the Viewer's Question");
                System.out.println("______________________________________________________________________________________________________________");
                for(read=1;read<=n;read++)
                {     
                System.out.println("                                            ############################");    
                System.out.println("                                            "+namet2[read]);
                System.out.println("                                            "+zone[read]);
                System.out.println("                                            "+school2[read]);
                System.out.println("                                            "+email[read]); 
                System.out.println("                                            ############################");    
                System.out.println("______________________________________________________________________________________________________________");               
                }
                }
                break;
                 
                case 3:
                System.out.println("Q1.Which river rises in the north of the Kanker mountain range");
                System.out.println("in Bastar District of Madhya Pradesh?");
                System.out.println("1.)Chambal");
                System.out.println("2.)Betwa");
                System.out.println("3.)Son");
                System.out.println("4.)Mahanadi");
                System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==4)
                {
                score=score+10;
                System.out.println("Your answer is correct");
                }
                else
                {
                score=score-5;
                System.out.println("Sorry!your answer is incorrect");
                System.out.println("The correct answer is Mahanadi");
                }  
                System.out.println();
               
                System.out.println("Q2.Which pass,literally meaning 'Pile of dead bodies' in Tibetan");
                System.out.println("is the only accessinto Lahaul?");
                System.out.println("1.)Zojila");
                System.out.println("2.)Kunzam");
                System.out.println("3.)Khyber");
                System.out.println("4.)Rohtang");
                System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==4)
                {
                score=score+10;
                System.out.println("Your answer is correct");
                }
                else
                {
                score=score-5;
                System.out.println("Sorry!your answer is incorrect");
                System.out.println("The correct answer is Rohtang");
                }
                System.out.println();
                
                System.out.println("Q3.Which Channel separates the Laccadive group of islands");
                System.out.println("from the Minicoy group of islands?");
                System.out.println("1.)Palk Straits");
                System.out.println("2.)Ten degree Channel");
                System.out.println("3.)Ninie degree Channel");
                System.out.println("4.)Seven degree Channel");
                System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==3)
                {
                score=score+10;
                System.out.println("Your answer is correct");
                }
                else
                {
                score=score-5;
                System.out.println("Sorry!your answer is incorrect");
                System.out.println("The correct answer is Nine Degree Channel");
                }
                System.out.println();
                 
                System.out.println("Q4.Which Indian Town was known as Koil or Kol in ancient times ?");
                System.out.println("1.)Agra");
                System.out.println("2.)Aligarh");
                System.out.println("3.)Kannauj");
                System.out.println("4.)Kanpur");
                System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==2)
                {
                score=score+10;
                System.out.println("Your answer is correct");
                }
                else
                {
                score=score-5;
                System.out.println("Sorry!your answer is incorrect");
                System.out.println("The correct answer is Aligarh");
                }   
                System.out.println();
                 
                System.out.println("Q5.On the banks of which river was the medeival capital city ");
                System.out.println("Vijayanagara located ?");
                System.out.println("1.)Kaveri");
                System.out.println("2.)Krishna");
                System.out.println("3.)Godavari");
                System.out.println("4.)Tungbhadra");
                System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==4)
                {
                score=score+10;
                System.out.println("Your answer is correct");
                }
                else
                {
                score=score-5;
                System.out.println("Sorry!your answer is incorrect");
                System.out.println("The correct answer is Tungbhadra");
                }   
                System.out.println();
                 
                System.out.println("Q6.Through which two oceans does the International Date Line run ?");
                System.out.println("1.)Pacific & Arctic ocean");
                System.out.println("2.)Pacific & Antarctic ocean");
                System.out.println("3.)Arctic & Antarctic ocean");
                System.out.println("4.)Arctic & Indian ocean");
                System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==1)
                {
                score=score+10;
                System.out.println("Your answer is correct");
                }
                else
                {
                score=score-5;
                System.out.println("Sorry!your answer is incorrect");
                System.out.println("The correct answer is Pacific and Arctic Ocean");
                }   
                System.out.println();
                 
                System.out.println("Q7.Which city is Pakistan's only major port ?");
                System.out.println("1.)Islamabad");
                System.out.println("2.)Karachi");
                System.out.println("3.)Lahore");
                System.out.println("4.)Hyderabad");
                System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==2)
                {
                score=score+10;
                System.out.println("Your answer is correct");
                }
                else
                {
                score=score-5;
                System.out.println("Sorry!your answer is incorrect");
                System.out.println("The correct answer is Karachi");
                }
                System.out.println();
                 
                System.out.println("Q8.Which sacred city derives its name from the river that flows through it ?");
                System.out.println("1.)Ujjain");
                System.out.println("2.)Vrindavan");
                System.out.println("3.)Mathura");
                System.out.println("4.)Varanasi");
                System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==4)
                {
                score=score+10;
                System.out.println("Your answer is correct");
                }
                else
                {
                     score=score-5;
                 System.out.println("Sorry!your answer is incorrect");
                 System.out.println("The correct answer is Varanasi");
                 }   
                 System.out.println();
             
                System.out.println("Q9.Which former Indian princely state lies between Assam and Bangladesh ?");
                System.out.println("1.)Agartala");
                System.out.println("2.)Tripura");
                System.out.println("3.)Mizoram");
                System.out.println("4.)Burma");
                System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==2)
                {
                score=score+10;
                System.out.println("Your answer is correct");
                }
                else
                {
                     score=score-5;
                 System.out.println("Sorry!your answer is incorrect");
                 System.out.println("The correct answer is Tripura");
                 }   
                 System.out.println();
                
                System.out.println("Q10.Together with the US and Australia, which country produces over half of the  ?");
                System.out.println("world's gold ?");
                System.out.println("1.)India");
                System.out.println("2.)Brazil");
                System.out.println("3.)South Africa");
                System.out.println("4.)New Zealand");
                System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==3)
                {
                score=score+10;
                System.out.println("Your answer is correct");
                 System.out.println("______________________________________________________________________________________________________________");
                System.out.println("                                      Your Total Score for the round is  "+score);
                 }
                else
                {
                 score=score-5;
                 System.out.println("Sorry!your answer is incorrect");
                 System.out.println("The correct answer is South Africa");
                  System.out.println("______________________________________________________________________________________________________________");
                 System.out.println("                                     Your Total Score for the round is"+score);
                 }   
                  if(score>40)
                 {
                 certificate();
                 System.out.println("                  Press 'Enter' to see the Date,Time and other details of our All-Asia Finals");                                         
                 a2=inp.readLine();          
                 System.out.println("                  Our Finals will be held on 21st November 2005 at our studio here at Mumbai");
                 System.out.println("______________________________________________________________________________________________________________");
                while(m==1)
                {
                     System.out.println("______________________________________________________________________________________________________________");
            System.out.println("                                           Welcome to our 'BQC Winners Book'");
             System.out.println("______________________________________________________________________________________________________________");
            System.out.println("Press 1 to sign our Winners Book");
            System.out.println("Press 2 to read the name of our Former Champions");
            System.out.println("Press 0 to Continue Further");
            System.out.println("                                             Enter Your Choice:");
            choice6=inp.readLine();
            ch6=Integer.parseInt(choice6);
            System.out.println();
            switch(ch6)
            {
                case 1:
                c++;
                 System.out.println("______________________________________________________________________________________________________________");
                System.out.println("                                             Welcome to our 'BQC Winners Book'");
                 System.out.println("______________________________________________________________________________________________________________");
                System.out.println("Enter Your Name:");
                name2=inp.readLine();
                namet[c]=name2;
                System.out.println("Enter the current year:");
                year=inp.readLine();
                currentyear[c]=year;
                System.out.println("Enter Your School:");
                school1=inp.readLine();
                School[c]=school1;
                System.out.println("");
                System.out.println("                                        Thank you for signing our 'BQC Winners Book'"); 
                System.out.println("                                        ############################################");
                 System.out.println("______________________________________________________________________________________________________________");
                System.out.println("                                        Press Enter to Return to our'BQC Winners Book'");
                s1=inp.readLine();              
                break;
                
                case 2:
               System.out.println("______________________________________________________________________________________________________________");
                System.out.println("                                  Welcome to read the name of our Former Champions of BQC");
                  System.out.println("______________________________________________________________________________________________________________");
                for(read=0;read<=c;read++)
                {     
                System.out.println("                                                   "+currentyear[read]);
                System.out.println("                                       "+School[read]);
                System.out.println("                                                 "+namet[read]); 
                  System.out.println("                                       #################################");                
                }
                System.out.println("Press Enter to Return to our 'BQC Winners Book'");
                s1=inp.readLine();                
                break;
            
                case 0:
                m=-1;
                break;
                }}}
                 else
                 System.out.println("                   %%%%%%%%%Sorry!You couldn't qualify for the All-Asia Finals%%%%%%%%");
                 System.out.println("______________________________________________________________________________________________________________");
                 System.out.println();
                 
                System.out.println("    If you want to go back to the Main menu press '1' or else if you want to Stop here then press '0'");
                System.out.println("                                          Enter Your Choice");
                   System.out.print("                                                   ");  
                String ak=inp.readLine();
                int al=Integer.parseInt(ak);
                if(al==1)
                {
                i=1;
                System.out.println("                                       Welcome back to the Main Menu");
                }
                else
                {
                i=0;
                System.out.print("                             Thank you ");
                System.out.print(                                  yname);
                System.out.println(" for playing the Bournvita Quiz Contest");
                System.out.println("                             %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
                System.out.println("______________________________________________________________________________________________________________");
                System.out.println("                                          Winner of the Viewer's Question");
                System.out.println("______________________________________________________________________________________________________________");
                for(read=1;read<=n;read++)
                {     
                System.out.println("                                            ############################");    
                System.out.println("                                            "+namet2[read]);
                System.out.println("                                            "+zone[read]);
                System.out.println("                                            "+school2[read]);
                System.out.println("                                            "+email[read]); 
                System.out.println("                                            ############################");    
                System.out.println("______________________________________________________________________________________________________________");             
                }
                }
                break;
                 
                case 4: 
                System.out.println("Q1.Which actress made her debut in the 1970 film Sawan Bhadon ?");
                System.out.println("1.)Sridevi");
                System.out.println("2.)Hema Malini");
                System.out.println("3.)Jaya Pradha");
                System.out.println("4.)Rekha");
                System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==4)
                {
                score=score+10;
                System.out.println("Your answer is correct");
                }
                else
                {
                    score=score-5;
                 System.out.println("Sorry!your answer is incorrect");
                 System.out.println("The correct answer is Rekha");
                 } 
                 System.out.println();
                
                System.out.println("Q2.Which writer scripted Hrishikesh Mukherjee's 1971 film Guddi ?");
                System.out.println("1.)Kamana Chandra");
                System.out.println("2.)Gulzar");
                System.out.println("3.)Kishore Kumar");
                System.out.println("4.)Javed Akhtar");
                 System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==2)
                {
                score=score+10;
                System.out.println("Your answer is correct");
                }
                else
                {
                    score=score-5;
                 System.out.println("Sorry!your answer is incorrect");
                 System.out.println("The correct answer is Gulzar");
                 } 
                 System.out.println();
                 
                System.out.println("Q3.The Telugu film Jayasimha was the debut vehicle for which actress ?");
                System.out.println("1.)Meena Kumari");
                System.out.println("2.)Waheeda Rahman");
                System.out.println("3.)Jayalalitha");
                System.out.println("4.)Vyjayanthimala");
                 System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==2)
                {
                score=score+10;
                System.out.println("Your answer is correct");
                }
                else
                {
                    score=score-5;
                 System.out.println("Sorry!your answer is incorrect");
                 System.out.println("The correct answer is Waheeda Rahman");
                 } 
                 System.out.println();
                
                System.out.println("Q4.How do we better know the Bollywood villain Hamid Ali Khan ?");
                System.out.println("1.)Pran");
                System.out.println("2.)Kadar Khan");
                System.out.println("3.)Jeevan");
                System.out.println("4.)Ajit");
                System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==4)
                {
                score=score+10;
                System.out.println("Your answer is correct");
                }
                else
                {
                    score=score-5;
                 System.out.println("Sorry!your answer is incorrect");
                 System.out.println("The correct answer is Ajit");
                 } 
                 System.out.println();
                
                System.out.println("Q5.Which film actress wrote verses in Urdu using the pen name 'Naaz' ?");
                System.out.println("1.)Meena Kumari");
                System.out.println("2.)MadhuBala");
                System.out.println("3.)Nargis");
                System.out.println("4.)Waheeda Rahman");
                System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==1)
                {
                score=score+10;
                System.out.println("Your answer is correct");
                }
                else
                {
                    score=score-5;
                 System.out.println("Sorry!your answer is incorrect");
                 System.out.println("The correct answer is Meena Kumari");
                 } 
                 System.out.println();
                
                System.out.println("Q6.Which come character has a jungle companion called 'Cheetah' ?");
                System.out.println("1.)Tarzan");
                System.out.println("2.)Mogli");
                System.out.println("3.)Phantom");
                System.out.println("4.)Hercules");
                System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==1)
                {
                score=score+10;
                System.out.println("Your answer is correct");
                }
                else
                {
                    score=score-5;
                 System.out.println("Sorry!your answer is incorrect");
                 System.out.println("The correct answer is Tarzan");
                 } 
                 System.out.println();
                
                System.out.println("Q7.Tintin on his way to Tibet stopped over in two Indian cities.Name them ?");
                System.out.println("1.)Delhi and Jaipur");
                System.out.println("2.)Jaipur and Patna");
                System.out.println("3.)Delhi and Patna");
                System.out.println("4.)Jaipur and Agra");
                System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==3)
                {
                score=score+10;
                System.out.println("Your answer is correct");
                }
                else
                {
                    score=score-5;
                 System.out.println("Sorry!your answer is incorrect");
                 System.out.println("The correct answer is Delhi and Patna");
                 } 
                 System.out.println();
                
                System.out.println("Q8.Which cartoon duo's first film together was called Puss gets the Boot ?");
                System.out.println("1.)Sylvester and Tweety");
                System.out.println("2.)Tom and Jerry");
                System.out.println("3.)Scooby Doo");
                System.out.println("4.)Swat Cat");
                System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==2)
                {
                score=score+10;
                System.out.println("Your answer is correct");
                }
                else
                {
                    score=score-5;
                 System.out.println("Sorry!your answer is incorrect");
                 System.out.println("The correct answer is Tom and Jerry");
                 } 
                 System.out.println();
                 
                System.out.println("Q9.Which Indian actor's real name is Yusuf Khan ?");
                System.out.println("1.)Kadar Khan");
                System.out.println("2.)Amjad Khan");
                System.out.println("3.)Sanjeev Kumar");
                System.out.println("4.)Dilip Kumar");
                System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==4)
                {
                score=score+10;
                System.out.println("Your answer is correct");
                }
                else
                {
                    score=score-5;
                 System.out.println("Sorry!your answer is incorrect");
                 System.out.println("The correct answer is Dilip Kumar");
                 } 
                 System.out.println();
                 
                System.out.println("Q10.In which country would you hear'Tagalog pop' ?");
                System.out.println("1.)Australia");
                System.out.println("2.)Philippines");
                System.out.println("3.)China");
                System.out.println("4.)South Africa");
                System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==2)
                {
                score=score+10;
                System.out.println("Your answer is correct");
                 System.out.println("______________________________________________________________________________________________________________");
                System.out.println("                                    Your Total Score for the round is  "+score);
                }
                else
                {
                    score=score-5;
                 System.out.println("Sorry!your answer is incorrect");
                 System.out.println("The correct answer is Philippines");
                  System.out.println("______________________________________________________________________________________________________________");
                 System.out.println("                                   Your Total Score for the round is  "+score);
                 } 
                  if(score>40)
                  {
                 certificate();
                 System.out.println("                  Press 'Enter' to see the Date,Time and other details of our All-Asia Finals");                                         
                 a2=inp.readLine();          
                 System.out.println("                  Our Finals will be held on 21st November 2005 at our studio here at Mumbai");
                  System.out.println("______________________________________________________________________________________________________________");
                while(m==1)
                {
                     System.out.println("______________________________________________________________________________________________________________");
            System.out.println("                                           Welcome to our 'BQC Winners Book'");
             System.out.println("______________________________________________________________________________________________________________");
            System.out.println("Press 1 to sign our Winners Book");
            System.out.println("Press 2 to read the name of our Former Champions");
            System.out.println("Press 0 to Continue Further");
            System.out.println("                                             Enter Your Choice:");
            choice6=inp.readLine();
            ch6=Integer.parseInt(choice6);
            System.out.println();
            switch(ch6)
            {
                case 1:
                c++;
                 System.out.println("______________________________________________________________________________________________________________");
                System.out.println("                                          Welcome to our 'BQC Winners Book'");
                 System.out.println("______________________________________________________________________________________________________________");
                System.out.println("Enter Your Name:");
                name2=inp.readLine();
                namet[c]=name2;
                System.out.println("Enter the current year:");
                year=inp.readLine();
                currentyear[c]=year;
                System.out.println("Enter Your School:");
                school1=inp.readLine();
                School[c]=school1;
                System.out.println("");
                System.out.println("                                        Thank you for signing our 'BQC Winners Book'"); 
                System.out.println("                                        ############################################");
                 System.out.println("______________________________________________________________________________________________________________");
                System.out.println("                                        Press Enter to Return to our'BQC Winners Book'");
                s1=inp.readLine();              
                break;
                
                case 2:
                
                System.out.println("______________________________________________________________________________________________________________");
                System.out.println("                                  Welcome to read the name of our Former Champions of BQC");
                  System.out.println("______________________________________________________________________________________________________________");
                for(read=0;read<=c;read++)
                {     
                System.out.println("                                                   "+currentyear[read]);
                System.out.println("                                       "+School[read]);
                System.out.println("                                                 "+namet[read]); 
                  System.out.println("                                       #################################");                
                }
                System.out.println("Press Enter to Return to our 'BQC Winners Book'");
                s1=inp.readLine();                
                break;
            
                case 0:
                m=-1;
                break;
                }}}
                 else
                 System.out.println("                   %%%%%%%%%Sorry!You couldn't qualify for the All-Asia Finals%%%%%%%%");
                 System.out.println("______________________________________________________________________________________________________________");
                 System.out.println();
                
                 System.out.println("    If you want to go back to the Main menu press '1' or else if you want to Stop here then press '0'");
                 System.out.println("                                          Enter Your Choice");
                 System.out.print("                                                   ");  
                 a3=inp.readLine();
                 b3=Integer.parseInt(a3);
                 if(b3==1)
                 {
                 i=1;
                 System.out.println("                                       Welcome back to the Main Menu");
                 }
                 else
                 {
                 i=0;
                 System.out.print("                             Thank you ");
                 System.out.print(                                  yname);
                 System.out.println(" for playing the Bournvita Quiz Contest");
                 System.out.println("                             %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
                 System.out.println("______________________________________________________________________________________________________________");
                System.out.println("                                          Winner of the Viewer's Question");
                System.out.println("______________________________________________________________________________________________________________");
                for(read=1;read<=n;read++)
                {     
                System.out.println("                                            ############################");    
                System.out.println("                                            "+namet2[read]);
                System.out.println("                                            "+zone[read]);
                System.out.println("                                            "+school2[read]);
                System.out.println("                                            "+email[read]); 
                System.out.println("                                            ############################");    
                System.out.println("______________________________________________________________________________________________________________");              
                }
                 }
                 break;
                 
                case 5:
                System.out.println("Q1.If Leander is called Lea for short, what is Bhupathi called ?");
                System.out.println("1.)Bhu");
                System.out.println("2.)Bhupesh");
                System.out.println("3.)Hesh");
                System.out.println("4.)Mahesh");
                System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==3)
                {
                score=score+10;
                System.out.println("Your answer is correct");
                }
                else
                {
                    score=score-5;
                 System.out.println("Sorry!your answer is incorrect");
                 System.out.println("The correct answer is Hesh");
                 } 
                 System.out.println();
                 
                System.out.println("Q2.Former criacket umpire Dickie Bird has a favourite cap,which is ");
                System.out.println("not a cricket cap.Which sport does it belong to ?");
                System.out.println("1.)It is a Golf cap");
                System.out.println("2.)It is a basket-ball cap ");
                System.out.println("3.)It is a Baseball cap");
                System.out.println("4.)It is a Swimming cap");
                System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==1)
                {
                score=score+10;
                System.out.println("Your answer is correct");
                }
                else
                {
                    score=score-5;
                 System.out.println("Sorry!your answer is incorrect");
                 System.out.println("The correct answer is 'It is a Golf cap' " );
                 } 
                 System.out.println();
                 
                System.out.println("Q3.If a batsman scores 25 runs in 25 balls, what is his strike rate ?");
                System.out.println("1.)50 percent");
                System.out.println("2.)75 percent ");
                System.out.println("3.)100 percent");
                System.out.println("4.)150 percent");
                System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==3)
                {
                score=score+10;
                System.out.println("Your answer is correct");
                }
                else
                {
                    score=score-5;
                 System.out.println("Sorry!your answer is incorrect");
                 System.out.println("The correct answer is 100 percent" );
                 } 
                 System.out.println();
                 
                System.out.println("Q4.After which cricketer is the great stadium at St. John's Wood named ?");
                System.out.println("1.)Sir Donald Bradman");
                System.out.println("2.)Vivian Richards");
                System.out.println("3.)Thomas Lords");
                System.out.println("4.)Narendra Hirwani");
                System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==3)
                {
                score=score+10;
                System.out.println("Your answer is correct");
                }
                else
                {
                    score=score-5;
                 System.out.println("Sorry!your answer is incorrect");
                 System.out.println("The correct answer is Thomas Lords" );
                 } 
                 System.out.println();
                 
                System.out.println("Q5.Assuming there was no injury time at all,and the golden goal was scored ");
                System.out.println("in the last minute of play, how long was the match ?");
                System.out.println("1.)90 Minutes");
                System.out.println("2.)120 Minutes");
                System.out.println("3.)145 Minutes");
                System.out.println("4.)50 Minutes");
                System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==2)
                {
                score=score+10;
                System.out.println("Your answer is correct");
                }
                else
                {
                    score=score-5;
                 System.out.println("Sorry!your answer is incorrect");
                 System.out.println("The correct answer is 120 Minutes" );
                 } 
                 System.out.println();
                 
                System.out.println("Q6.At which Olympic sport does competition take place over 90,70,60,50 and 30 metres ?");
                System.out.println("1.)Archery");
                System.out.println("2.)Javelin Throw");
                System.out.println("3.)Hurdles");
                System.out.println("4.)Swimming");
                System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==1)
                {
                score=score+10;
                System.out.println("Your answer is correct");
                }
                else
                {
                    score=score-5;
                 System.out.println("Sorry!your answer is incorrect");
                 System.out.println("The correct answer is Archery" );
                 } 
                 System.out.println();
                 
                System.out.println("Q7.How better do we know the cricketer S.A. Khan ?");
                System.out.println("1.)Abid Ali");
                System.out.println("2.)Abbas Ali Baig ");
                System.out.println("3.)Salim Durrani");
                System.out.println("4.)Saim Khan");
                System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==3)
                {
                score=score+10;
                System.out.println("Your answer is correct");
                }
                else
                {
                    score=score-5;
                 System.out.println("Sorry!your answer is incorrect");
                 System.out.println("The correct answer is Salim Durrani" );
                 } 
                 System.out.println();
                 
                System.out.println("Q8.How better do we know the cricketer Nanik Bhardwaj ?");
                System.out.println("1.)Lala Amarnath");
                System.out.println("2.)Madan Lal ");
                System.out.println("3.)Tilak Raj");
                System.out.println("4.)Sunil Gavaskar");
                System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==1)
                {
                score=score+10;
                System.out.println("Your answer is correct");
                }
                else
                {
                    score=score-5;
                 System.out.println("Sorry!your answer is incorrect");
                 System.out.println("The correct answer is Lala Amarnath" );
                 } 
                 System.out.println();
                 
                System.out.println("Q9.Shiva Keshavan was the only Indian representative at.... ?");
                System.out.println("1.)The 1998 Nagano Winter Olympics");
                System.out.println("2.)The World Cup in France");
                System.out.println("3.)The 1998 Asian Games");
                System.out.println("4.)The Nuclear disarmament talks in Geneva");
                System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==1)
                {
                score=score+10;
                System.out.println("Your answer is correct");
                }
                else
                {
                    score=score-5;
                 System.out.println("Sorry!your answer is incorrect");
                 System.out.println("The correct answer is The 1998 Nagano Winter Olympics" );
                 } 
                 System.out.println();
                 
                System.out.println("Q10.Who was India's first Grand Master in Chess ?");
                System.out.println("1.)Mohan Lalwani");
                System.out.println("2.)Pravin Thipsay");
                System.out.println("3.)Vishwanathan Anand");
                System.out.println("4.)Dibyendu Barua");
                System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==3)
                {
                score=score+10;
                System.out.println("Your answer is correct");
                 System.out.println("______________________________________________________________________________________________________________");
                System.out.println("                                  Your Total Score for the round is   "+score);
                } 
                else
                {
                    score=score-5;
                 System.out.println("Sorry!your answer is incorrect");
                 System.out.println("The correct answer is Vishwanathan Anand" );
                  System.out.println("______________________________________________________________________________________________________________");
                 System.out.println("                                 Your Total Score for the round is   "+score);
                 }   
                  if(score>40)
                 {
                 certificate();
                 System.out.println("                  Press 'Enter' to see the Date,Time and other details of our All-Asia Finals");                                         
                 a2=inp.readLine();          
                 System.out.println("                  Our Finals will be held on 21st November 2005 at our studio here at Mumbai");
                 System.out.println("______________________________________________________________________________________________________________");
                while(m==1)
                {
                     System.out.println("______________________________________________________________________________________________________________");
            System.out.println("                                           Welcome to our 'BQC Winners Book'");
            System.out.println("______________________________________________________________________________________________________________");
            System.out.println("Press 1 to sign our Winners Book");
            System.out.println("Press 2 to read the name of our Former Champions");
            System.out.println("Press 0 to Continue Further");
            System.out.println("                                             Enter Your Choice:");
            choice6=inp.readLine();
            ch6=Integer.parseInt(choice6);
            System.out.println();
            switch(ch6)
            {
                case 1:
                c++;
                 System.out.println("______________________________________________________________________________________________________________");
                System.out.println("                                            Welcome to our 'BQC Winners Book'");
                 System.out.println("______________________________________________________________________________________________________________");
                System.out.println("Enter Your Name:");
                name2=inp.readLine();
                namet[c]=name2;
                System.out.println("Enter the current year:");
                year=inp.readLine();
                currentyear[c]=year;
                System.out.println("Enter Your School:");
                school1=inp.readLine();
                School[c]=school1;
                System.out.println("");
                System.out.println("                                        Thank you for signing our 'BQC Winners Book'"); 
                System.out.println("                                        ############################################");
                 System.out.println("______________________________________________________________________________________________________________");
                System.out.println("                                        Press Enter to Return to our'BQC Winners Book'");
                s1=inp.readLine();              
                break;
                
                case 2:
                System.out.println("______________________________________________________________________________________________________________");
                System.out.println("                                  Welcome to read the name of our Former Champions of BQC");
                  System.out.println("______________________________________________________________________________________________________________");
                for(read=0;read<=c;read++)
                {     
                System.out.println("                                                   "+currentyear[read]);
                System.out.println("                                       "+School[read]);
                System.out.println("                                                 "+namet[read]); 
                  System.out.println("                                       #################################");                
                }
                System.out.println("Press Enter to Return to our 'BQC Winners Book'");
                s1=inp.readLine();                         
                break;
            
                case 0:
                m=-1;
                break;
                }}} 
                 else
                 System.out.println("                   %%%%%%%%%Sorry!You couldn't qualify for the All-Asia Finals%%%%%%%%");
                 System.out.println("______________________________________________________________________________________________________________");
                 System.out.println();
                 
                System.out.println("    If you want to go back to the Main menu press '1' or else if you want to Stop here then press '0'");
                System.out.println("                                          Enter Your Choice");
                System.out.print("                                                   ");  
                a3=inp.readLine();
                b3=Integer.parseInt(a3);
                if(b3==1)
                {
                i=1;
                System.out.println("                                       Welcome back to the Main Menu");
                }
                else
                {
                i=0;
                System.out.print("                             Thank you ");
                System.out.print(                                 yname);
                System.out.println(" for playing the Bournvita Quiz Contest");
                System.out.println("                             %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
                System.out.println("______________________________________________________________________________________________________________");
                System.out.println("                                          Winner of the Viewer's Question");
                System.out.println("______________________________________________________________________________________________________________");
                for(read=1;read<=n;read++)
                {     
                System.out.println("                                            ############################");    
                System.out.println("                                            "+namet2[read]);
                System.out.println("                                            "+zone[read]);
                System.out.println("                                            "+school2[read]);
                System.out.println("                                            "+email[read]); 
                System.out.println("                                            ############################");    
                System.out.println("______________________________________________________________________________________________________________");                
                }
                }
                break;
                 
                case 6:
                System.out.println("Q1.In British India,which animal was often called 'Brother Stripes' ?");
                System.out.println("1.)Leopard");
                System.out.println("2.)Tiger");
                System.out.println("3.)Zebra");
                System.out.println("4.)Lion");
                System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==2)
                {
                score=score+10;
                System.out.println("Your answer is correct");
                }
                else
                {
                    score=score-5;
                 System.out.println("Sorry!your answer is incorrect");
                 System.out.println("The correct answer is Tiger");
                 } 
                 System.out.println();
                 
                System.out.println("Q2.What item of daily use,which we often carry in our pockets,is");
                System.out.println("usually made of Al-Mag ?");
                System.out.println("1.)Keys");
                System.out.println("2.)Mobile Phones");
                System.out.println("3.)Coins");
                System.out.println("4.)Hankerchief");
                System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==3)
                {
                score=score+10;
                System.out.println("Your answer is correct");
                }
                else
                {
                    score=score-5;
                 System.out.println("Sorry!your answer is incorrect");
                 System.out.println("The correct answer is Coins");
                 } 
                 System.out.println();
                 
                System.out.println("Q3.How do we better know 'Prickly Pear' ?");
                System.out.println("1.)Fruit");
                System.out.println("2.)Animal");
                System.out.println("3.)Cactus");
                System.out.println("4.)Pickle");
                System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==3)
                {
                score=score+10;
                System.out.println("Your answer is correct");
                }
                else
                {
                    score=score-5;
                 System.out.println("Sorry!your answer is incorrect");
                 System.out.println("The correct answer is Cactus");
                 } 
                 System.out.println();
                 
                System.out.println("Q4.Why didn't Alexander Graham Bell's mother and wife use the telephone ");
                System.out.println("he invented ?");
                System.out.println("1.)They were both deaf");
                System.out.println("2.)They were both Dumb");
                System.out.println("3.)They didn't knew how to use it");
                System.out.println("4.)They were both handicapped");
                System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==1)
                {
                score=score+10;
                System.out.println("Your answer is correct");
                }
                else
                {
                    score=score-5;
                 System.out.println("Sorry!your answer is incorrect");
                 System.out.println("The correct answer is 'They were both deaf' ");
                 } 
                 System.out.println();
                 
                System.out.println("Q5.The bones in which part of our body is popularly called the hammer, ");
                System.out.println("anvil and stirrups ?");
                System.out.println("1.)Bones in the Legs");
                System.out.println("2.)Bones in the Hands");
                System.out.println("3.)Bones in the Nose");
                System.out.println("4.)Bones in the Ears");
                System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==4)
                {
                score=score+10;
                System.out.println("Your answer is correct");
                }
                else
                {
                    score=score-5;
                 System.out.println("Sorry!your answer is incorrect");
                 System.out.println("The correct answer is 'Bones in the Ears' ");
                 } 
                 System.out.println();
                 
                System.out.println("Q6.Who gave Bacteria their name ?");
                System.out.println("1.)Antony Van Leeuwenhoek");
                System.out.println("2.)Thomas Schleiden");
                System.out.println("3.)Louis Pasteur");
                System.out.println("4.)Ned Kelly");
                System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==3)
                {
                score=score+10;
                System.out.println("Your answer is correct");
                }
                else
                {
                    score=score-5;
                 System.out.println("Sorry!your answer is incorrect");
                 System.out.println("The correct answer is Louis Pasteur ");
                 } 
                 System.out.println();
                 
                System.out.println("Q7.The metal copper derives its name from which country ?");
                System.out.println("1.)Cuprous");
                System.out.println("2.)Cyprus");
                System.out.println("3.)Cape Town");
                System.out.println("4.)Cuba");
                System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==2)
                {
                score=score+10;
                System.out.println("Your answer is correct");
                }
                else
                {
                    score=score-5;
                 System.out.println("Sorry!your answer is incorrect");
                 System.out.println("The correct answer is Cyprus ");
                 } 
                 System.out.println();
                 
                System.out.println("Q8.Name the place where you can see India's largest animals in the ");
                System.out.println("same environment ?");
                System.out.println("1.)Bharatpur Bird Sanctuary");
                System.out.println("2.)Jim Corbett National Park");
                System.out.println("3.)Kaziranga National Park");
                System.out.println("4.)Gir National Park and Lion Sanctuary");
                System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==3)
                {
                score=score+10;
                System.out.println("Your answer is correct");
                }
                else
                {
                    score=score-5;
                 System.out.println("Sorry!your answer is incorrect");
                 System.out.println("The correct answer is Kaziranga National Park ");
                 } 
                 System.out.println();
                 
                System.out.println("Q9.Which Gland swells to form a Goitre ?");
                System.out.println("1.)The Thyroid gland");
                System.out.println("2.)The Sweat gland");
                System.out.println("3.)The Adrenal gland");
                System.out.println("4.)The Thymus gland");
                System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==1)
                {
                score=score+10;
                System.out.println("Your answer is correct");
                }
                else
                {
                    score=score-5;
                 System.out.println("Sorry!your answer is incorrect");
                 System.out.println("The correct answer is The Thyroid gland ");
                 } 
                 System.out.println();
                 
                System.out.println("Q10.What did Van Helmont describe as,'something which cannot be confined ");
                System.out.println("in a vessel nor reduced to a visible body ?");
                System.out.println("1.)Mercury");
                System.out.println("2.)Gas");
                System.out.println("3.)Liquid");
                System.out.println("4.)Platinum");
                System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==2)
                {
                score=score+10;
                System.out.println("Your answer is correct");
                 System.out.println("______________________________________________________________________________________________________________");
                System.out.println("                                    Your Total score for the round is  "+score);
                }
                else
                {
                    score=score-5;
                 System.out.println("Sorry!your answer is incorrect");
                 System.out.println("The correct answer is Gas ");
                  System.out.println("______________________________________________________________________________________________________________");
                 System.out.println("                                   Your Total score for the round is  "+score);
                 } 
                  if(score>40)
                  {
                 certificate();
                 System.out.println("                  Press 'Enter' to see the Date,Time and other details of our All-Asia Finals");                                         
                 a2=inp.readLine();          
                 System.out.println("                  Our Finals will be held on 21st November 2005 at our studio here at Mumbai");
                 System.out.println("______________________________________________________________________________________________________________");
                while(m==1)
                {
                     System.out.println("______________________________________________________________________________________________________________");
                     System.out.println("                                           Welcome to our 'BQC Winners Book'");
                     System.out.println("______________________________________________________________________________________________________________");
                     System.out.println("Press 1 to sign our Winners Book");
                     System.out.println("Press 2 to read the name of our Former Champions");
                     System.out.println("Press 0 to Continue Further");
                     System.out.println("                                             Enter Your Choice:");
                     choice6=inp.readLine();
                     ch6=Integer.parseInt(choice6);
                     System.out.println();
                     switch(ch6)
                     {
                         
                    case 1:
                    c++;
                    System.out.println("______________________________________________________________________________________________________________");
                    System.out.println("                                              Welcome to our 'BQC Winners Book'");
                    System.out.println("______________________________________________________________________________________________________________");
                    System.out.println("Enter Your Name:");
                    name2=inp.readLine();
                    namet[c]=name2;
                    System.out.println("Enter the current year:");
                    year=inp.readLine();
                    currentyear[c]=year;
                    System.out.println("Enter Your School:");
                    school1=inp.readLine();
                    School[c]=school1;
                    System.out.println("");
                    System.out.println("                                        Thank you for signing our 'BQC Winners Book'"); 
                    System.out.println("                                        ############################################");
                    System.out.println("______________________________________________________________________________________________________________");
                    System.out.println("                                        Press Enter to Return to our'BQC Winners Book'");
                    s1=inp.readLine();              
                    break;
                
                    case 2:
                    System.out.println("______________________________________________________________________________________________________________");
                    System.out.println("                                  Welcome to read the name of our Former Champions of BQC");
                    System.out.println("______________________________________________________________________________________________________________");
                    for(read=0;read<=c;read++)
                    {     
                    System.out.println("                                                   "+currentyear[read]);
                    System.out.println("                                       "+School[read]);
                    System.out.println("                                                 "+namet[read]); 
                    System.out.println("                                       #################################");                
                    }
                    System.out.println("Press Enter to Return to our 'BQC Winners Book'");
                    s1=inp.readLine();                
                    break;
            
                    case 0:
                    m=-1;
                    break;
                    }}}  
                    else
                 System.out.println("                   %%%%%%%%%Sorry!You couldn't qualify for the All-Asia Finals%%%%%%%%");
                 System.out.println("______________________________________________________________________________________________________________");
                 System.out.println();
                 
                System.out.println("    If you want to go back to the Main menu press '1' or else if you want to Stop here then press '0'");
                System.out.println("                                          Enter Your Choice");
                System.out.print("                                                   ");  
                a3=inp.readLine();
                b3=Integer.parseInt(a3);
                if(b3==1)
                {
                i=1;
                System.out.println("                                       Welcome back to the Main Menu");
                }
                else
                {
                i=0;
                System.out.print("                             Thank you ");
                System.out.print(                                  yname);
                System.out.println(" for playing the Bournvita Quiz Contest"); 
                System.out.println("                             %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
                System.out.println("______________________________________________________________________________________________________________");
                System.out.println("                                          Winner of the Viewer's Question");
                System.out.println("______________________________________________________________________________________________________________");
                for(read=1;read<=n;read++)
                {     
                System.out.println("                                            ############################");    
                System.out.println("                                            "+namet2[read]);
                System.out.println("                                            "+zone[read]);
                System.out.println("                                            "+school2[read]);
                System.out.println("                                            "+email[read]); 
                System.out.println("                                            ############################");    
                System.out.println("______________________________________________________________________________________________________________");           
                }
                }
                break;
                 
                case 7:
                System.out.println("Q1.The world's first coins bearing the date AD 2000 were realeased in 1997 in ");
                System.out.println("which country ?");
                System.out.println("1.)China");
                System.out.println("2.)New Zealand");
                System.out.println("3.)Australia");
                System.out.println("4.)South Africa");
                System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==3)
                {
                score=score+10;
                System.out.println("Your answer is correct");
                }
                else
                {
                    score=score-5;
                 System.out.println("Sorry!your answer is incorrect");
                 System.out.println("The correct answer is Australia");
                 } 
                 System.out.println();
                 
                System.out.println("Q2.If Scotland is known for its bagpipes,which instrument is the national ");
                System.out.println("emblem of Ireland ?");
                System.out.println("1.)Guitar");
                System.out.println("2.)Flute");
                System.out.println("3.)Harp");
                System.out.println("4.)Violin");
                System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==3)
                {
                score=score+10;
                System.out.println("Your answer is correct");
                }
                else
                {
                     score=score-5;
                 System.out.println("Sorry!your answer is incorrect");
                 System.out.println("The correct answer is Harp");
                 } 
                 System.out.println();
                 
                System.out.println("Q3.In a French resturant,if you ordered 'poissons' what would you be eating ?");
                System.out.println("1.)Poison");
                System.out.println("2.)Fish");
                System.out.println("3.)Pasta");
                System.out.println("4.)Chicken");
                System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==2)
                {
                score=score+10;
                System.out.println("Your answer is correct");
                }
                else
                {
                     score=score-5;
                 System.out.println("Sorry!your answer is incorrect");
                 System.out.println("The correct answer is Fish");
                 } 
                 System.out.println();
                 
                System.out.println("Q4.What is the retiring age of the UN Secretary General ?");
                System.out.println("1.)67 years");
                System.out.println("2.)75 years");
                System.out.println("3.)90 years");
                System.out.println("4.)There is no retiring age");
                System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==4)
                {
                score=score+10;
                System.out.println("Your answer is correct");
                }
                else
                {
                     score=score-5;
                 System.out.println("Sorry!your answer is incorrect");
                 System.out.println("The correct answer is There is no retiring age");
                 } 
                 System.out.println();
                 
                System.out.println("Q5.In Arab countries,what is a souk ?");
                System.out.println("1.)A Fair");
                System.out.println("2.)A Market ");
                System.out.println("3.)A Festival");
                System.out.println("4.)A Dish for eating");
                System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==2)
                {
                score=score+10;
                System.out.println("Your answer is correct");
                }
                else
                {
                     score=score-5;
                 System.out.println("Sorry!your answer is incorrect");
                 System.out.println("The correct answer is 'A Market' ");
                 } 
                 System.out.println();
                 
                System.out.println("Q6.Which is the only country that does not celebrate a National or Independence Day ?");
                System.out.println("1.)Pakistan");
                System.out.println("2.)Saudi Arabia ");
                System.out.println("3.)Great Britain");
                System.out.println("4.)Japan");
                System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==3)
                {
                score=score+10;
                System.out.println("Your answer is correct");
                }
                else
                {
                     score=score-5;
                 System.out.println("Sorry!your answer is incorrect");
                 System.out.println("The correct answer is Britain ");
                 } 
                 System.out.println();
                 
                System.out.println("Q7.Which vegetable was regarded by the ancients as a symbol of charity ");
                System.out.println("because of its many layers ?");
                System.out.println("1.)Onion");
                System.out.println("2.)Cabbage ");
                System.out.println("3.)Cauliflower");
                System.out.println("4.)Gourd");
                System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==1)
                {
                score=score+10;
                System.out.println("Your answer is correct");
                }
                else
                {
                     score=score-5;
                 System.out.println("Sorry!your answer is incorrect");
                 System.out.println("The correct answer is Onion ");
                 } 
                 System.out.println();
                 
                System.out.println("Q8.In which place is 'Canto pop' very popular ?");
                System.out.println("1.)The philippines");
                System.out.println("2.)Indonesia");
                System.out.println("3.)Thailand");
                System.out.println("4.)Honk Kong");
                System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==4)
                {
                score=score+10;
                System.out.println("Your answer is correct");
                }
                else
                {
                     score=score-5;
                 System.out.println("Sorry!your answer is incorrect");
                 System.out.println("The correct answer is Honk kong ");
                 } 
                 System.out.println();
                 
                System.out.println("Q9.Found at the confluence of the Kelang and Gombek rivers,what does");
                System.out.println(" Kuala Lumpur mean ?");
                System.out.println("1.)Land of the Koalas");
                System.out.println("2.)Muddy river mouth");
                System.out.println("3.)The place to fish");
                System.out.println("4.)Sorrow of Malaysia");
                 System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==2)
                {
                score=score+10;
                System.out.println("Your answer is correct");
                }
                else
                {
                     score=score-5;
                 System.out.println("Sorry!your answer is incorrect");
                 System.out.println("The correct answer is Muddy river mouth ");
                 } 
                 System.out.println();
                 
                System.out.println("Q10.Which spicy liquid comes from the Chinese meaning 'Pickled fish brine ?");
                System.out.println("1.)Mint sauce");
                System.out.println("2.)Herbal tea");
                System.out.println("3.)Ketchup");
                System.out.println("4.)Hot and sour soup");
                System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==3)
                {
                score=score+10;
                System.out.println("Your answer is correct");
                 System.out.println("______________________________________________________________________________________________________________");
                System.out.println("                                    Your Total Score for the round is  "+score);
                }
                else
                {
                     score=score-5;
                 System.out.println("Sorry!your answer is incorrect");
                 System.out.println("The correct answer is Ketchup ");
                  System.out.println("______________________________________________________________________________________________________________");
                 System.out.println("                                   Your Total Score for the round is  "+score);
                } 
                 if(score>50)
                 {
                 certificate();
                 System.out.println("                  Press 'Enter' to see the Date,Time and other details of our All-Asia Finals");                                         
                 a2=inp.readLine();          
                 System.out.println("                  Our Finals will be held on 21st November 2005 at our studio here at Mumbai");
                 System.out.println("______________________________________________________________________________________________________________");
                while(m==1)
                { 
                System.out.println("______________________________________________________________________________________________________________");
                System.out.println("                                           Welcome to our 'BQC Winners Book'");
                System.out.println("______________________________________________________________________________________________________________");
                System.out.println("Press 1 to sign our Winners Book");
                System.out.println("Press 2 to read the name of our Former Champions");
                System.out.println("Press 0 to Continue Further");
                System.out.println("                                             Enter Your Choice:");
                choice6=inp.readLine();
                ch6=Integer.parseInt(choice6);
                System.out.println();
                switch(ch6)
                {
                case 1:
                c++;
                 System.out.println("______________________________________________________________________________________________________________");
                 System.out.println("                                             Welcome to our 'BQC Winners Book'");
                 System.out.println("______________________________________________________________________________________________________________");
                System.out.println("Enter Your Name:");
                name2=inp.readLine();
                namet[c]=name2;
                System.out.println("Enter the current year:");
                year=inp.readLine();
                currentyear[c]=year;
                System.out.println("Enter Your School:");
                school1=inp.readLine();
                School[c]=school1;
                System.out.println("");
                System.out.println("                                        Thank you for signing our 'BQC Winners Book'"); 
                System.out.println("                                        ############################################");
                 System.out.println("______________________________________________________________________________________________________________");
                System.out.println("                                        Press Enter to Return to our'BQC Winners Book'");
                s1=inp.readLine();              
                break;
                
                case 2:
                System.out.println("______________________________________________________________________________________________________________");
                System.out.println("                                  Welcome to read the name of our Former Champions of BQC");
                  System.out.println("______________________________________________________________________________________________________________");
                for(read=0;read<=c;read++)
                {     
                System.out.println("                                                   "+currentyear[read]);
                System.out.println("                                       "+School[read]);
                System.out.println("                                                 "+namet[read]); 
                  System.out.println("                                       #################################");                
                }
                System.out.println("Press Enter to Return to our 'BQC Winners Book'");
                s1=inp.readLine();                
                break;
            
                case 0:
                m=-1;
                break;
                }}} 
                 else
                 System.out.println("                   %%%%%%%%%Sorry!You couldn't qualify for the All-Asia Finals%%%%%%%%");
                 System.out.println("______________________________________________________________________________________________________________");
                 System.out.println();
              
                System.out.println("    If you want to go back to the Main menu press '1' or else if you want to Stop here then press '0'");
                System.out.println("                                          Enter Your Choice");
                System.out.print("                                                   ");  
                a3=inp.readLine();
                b3=Integer.parseInt(a3);
                if(b3==1)
                {
                i=1;
                System.out.println("                                       Welcome back to the Main Menu");
                }
                else
                {
                i=0;
                System.out.print("                             Thank you ");
                System.out.print(                                  yname);
                System.out.println(" for playing the Bournvita Quiz Contest");
                System.out.println("                             %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
                System.out.println("______________________________________________________________________________________________________________");
                System.out.println("                                          Winner of the Viewer's Question");
                System.out.println("______________________________________________________________________________________________________________");
                for(read=1;read<=n;read++)
                {     
              System.out.println("                                            ############################");    
                System.out.println("                                            "+namet2[read]);
                System.out.println("                                            "+zone[read]);
                System.out.println("                                            "+school2[read]);
                System.out.println("                                            "+email[read]); 
                System.out.println("                                            ############################");    
                System.out.println("______________________________________________________________________________________________________________");           
                }
                }
                break;
                 
                case 8:
                System.out.println("Q1.In Bangladesh's local parlance what are known as 'baby taxis' ?");
                System.out.println("1.)Motorised cycle rickshaws");
                System.out.println("2.)Marutis converted into taxis");
                System.out.println("3.)Rented Bicycles");
                System.out.println("4.)Carriages drawn by ponies");
                System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==1)
                {
                score=score+10;
                System.out.println("Your answer is correct");
                }
                else
                {
                    score=score-5;
                 System.out.println("Sorry!your answer is incorrect");
                 System.out.println("The correct answer is Motorised cycle rickshaws");
                 } 
                 System.out.println();
                 
                System.out.println("Q2.Originally called Li'l Folks,which comic strip completed 50 years in 1998 ?");
                System.out.println("1.)Dennis the Menace");
                System.out.println("2.)Peanuts");
                System.out.println("3.)Henry");
                System.out.println("4.)Tom and Jerry");
                System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==2)
                {
                score=score+10;
                System.out.println("Your answer is correct");
                }
                else
                {
                    score=score-5;
                 System.out.println("Sorry!your answer is incorrect");
                 System.out.println("The correct answer is Peanuts");
                 } 
                 System.out.println();
                 
                System.out.println("Q3.Coined by playwright K.Capek,which device comes from Czech meaning 'forced labour' ?");
                System.out.println("1.)Mixer-Grinder");
                System.out.println("2.)Robot");
                System.out.println("3.)Vacuum Cleaner");
                System.out.println("4.)Computer");
                System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==2)
                {
                score=score+10;
                System.out.println("Your answer is correct");
                }
                else
                {
                    score=score-5;
                 System.out.println("Sorry!your answer is incorrect");
                 System.out.println("The correct answer is Robot ");
                 } 
                 System.out.println();
                 
                System.out.println("Q4.French crepe,Italian cannelloni and the Indian dosa are variations of ?");
                System.out.println("1.)Bread");
                System.out.println("2.)Papad");
                System.out.println("3.)Pancake");
                System.out.println("4.)Poison");
                System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==3)
                {
                score=score+10;
                System.out.println("Your answer is correct");
                }
                else
                {
                    score=score-5;
                 System.out.println("Sorry!your answer is incorrect");
                 System.out.println("The correct answer is Pancake ");
                 } 
                 System.out.println();
                 
                System.out.println("Q5.What does the Grand Champion of Sumo wrestling receive at the end of a tournament ?");
                System.out.println("1.)A year's supply of sushi");
                System.out.println("2.)101 designer Kimonos");
                System.out.println("3.)A holiday in Hawai");
                System.out.println("4.)Rice,chestnuts,grapes,pears,onions and a vehicle");
                System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==4)
                {
                score=score+10;
                System.out.println("Your answer is correct");
                }
                else
                {
                    score=score-5;
                 System.out.println("Sorry!your answer is incorrect");
                 System.out.println("The correct answer is 'Rice,chestnuts,grapes,pears,onions and a vehicle' ");
                 }  
                 System.out.println();
                 
                System.out.println("Q6.A Jacuzzi is ........... ?");
                System.out.println("1.)A Reaggae music band");
                System.out.println("2.)A large bath with underwater jets of water");
                System.out.println("3.)An antelope found in Europe");
                System.out.println("4.)A car that operates on land and in water");
                System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==2)
                {
                score=score+10;
                System.out.println("Your answer is correct");
                }
                else
                {
                    score=score-5;
                 System.out.println("Sorry!your answer is incorrect");
                 System.out.println("The correct answer is 'A large bath with underwater jets of water' ");
                 }  
                 System.out.println();
                 
                System.out.println("Q7.Who are often referred to as 'Brownies' ?");
                System.out.println("1.)Sun-tanned life guards");
                System.out.println("2.)Chocolate Biscuits");
                System.out.println("3.)Junior Girl Guides");
                System.out.println("4.)People who love that colour");
                System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==3)
                {
                score=score+10;
                System.out.println("Your answer is correct");
                }
                else
                {
                    score=score-5;
                 System.out.println("Sorry!your answer is incorrect");
                 System.out.println("The correct answer is 'Junior Girl Guides' ");
                 }  
                 System.out.println();
                 
                System.out.println("Q8.A Gibbon is ........ ?");
                System.out.println("1.)A stamp collector");
                System.out.println("2.)A bow-tie");
                System.out.println("3.)The smallest in the ape family");
                System.out.println("4.)A satin ribbon");
                System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==3)
                {
                score=score+10;
                System.out.println("Your answer is correct");
                }
                else
                {
                    score=score-5;
                 System.out.println("Sorry!your answer is incorrect");
                 System.out.println("The correct answer is 'The smallest in the ape family' ");
                 }  
                 System.out.println();
                 
                System.out.println("Q9.Which hadicraft gets its name from the French meaning 'chewed paper' ?");
                System.out.println("1.)Block printing");
                System.out.println("2.)Paper mache");
                System.out.println("3.)Origami");
                System.out.println("4.)Macrame");
                System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==4)
                {
                score=score+10;
                System.out.println("Your answer is correct");
                }
                else
                {
                    score=score-5;
                 System.out.println("Sorry!your answer is incorrect");
                 System.out.println("The correct answer is 'Macrame' ");
                 }  
                 System.out.println();
                 
                System.out.println("Q10.What was so special about the pink wedding sari worn by Indira and Sonia Gandhi ?");
                System.out.println("1.)It was spun by Nehru while he was in prison");
                System.out.println("2.)At 15 metres,it was unusually long");
                System.out.println("3.)It was of pure silk and had real gold borders");
                System.out.println("4.)It came from Harrods of London");
                System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==1)
                {
                score=score+10;
                System.out.println("Your answer is correct");
                 System.out.println("______________________________________________________________________________________________________________");
                System.out.println("                                   Your Total Score for the round is   "+score);
                }
                else
                {
                    score=score-5;
                 System.out.println("Sorry!your answer is incorrect");
                 System.out.println("The correct answer is 'It was spun by Nehru while he was in prison' ");
                  System.out.println("______________________________________________________________________________________________________________");
                 System.out.println("                                  Your Total Score for the round is   "+score);
                } 
                 if(score>40)
                  {
                 certificate();
                 System.out.println("                  Press 'Enter' to see the Date,Time and other details of our All-Asia Finals");                                         
                 a2=inp.readLine();          
                 System.out.println("                  Our Finals will be held on 21st November 2005 at our studio here at Mumbai");
                 System.out.println("______________________________________________________________________________________________________________");
                while(m==1)
                {
                     System.out.println("______________________________________________________________________________________________________________");
            System.out.println("                                           Welcome to our 'BQC Winners Book'");
             System.out.println("______________________________________________________________________________________________________________");
            System.out.println("Press 1 to sign our Winners Book");
            System.out.println("Press 2 to read the name of our Former Champions");
            System.out.println("Press 0 to Continue Further");
            System.out.println("                                             Enter Your Choice:");
            choice6=inp.readLine();
            ch6=Integer.parseInt(choice6);
            System.out.println();
            switch(ch6)
            {
                case 1:
                c++;
                 System.out.println("______________________________________________________________________________________________________________");
                System.out.println("                                               Welcome to our 'BQC Winners Book'");
                 System.out.println("______________________________________________________________________________________________________________");
                System.out.println("Enter Your Name:");
                name2=inp.readLine();
                namet[c]=name2;
                System.out.println("Enter the current year:");
                year=inp.readLine();
                currentyear[c]=year;
                System.out.println("Enter Your School:");
                school1=inp.readLine();
                School[c]=school1;
                System.out.println("");
                System.out.println("                                        Thank you for signing our 'BQC Winners Book'"); 
                System.out.println("                                        ############################################");
                 System.out.println("______________________________________________________________________________________________________________");
                System.out.println("                                        Press Enter to Return to our'BQC Winners Book'");
                s1=inp.readLine();              
                break;
                
                case 2:
               System.out.println("______________________________________________________________________________________________________________");
                System.out.println("                                  Welcome to read the name of our Former Champions of BQC");
                  System.out.println("______________________________________________________________________________________________________________");
                for(read=0;read<=c;read++)
                {     
                System.out.println("                                                   "+currentyear[read]);
                System.out.println("                                       "+School[read]);
                System.out.println("                                                 "+namet[read]); 
                  System.out.println("                                       #################################");                
                }
                System.out.println("Press Enter to Return to our 'BQC Winners Book'");
                s1=inp.readLine();                
                break;
            
                case 0:
                m=-1;
                break;
                }}}
                 else
                 System.out.println("                   %%%%%%%%%Sorry!You couldn't qualify for the All-Asia Finals%%%%%%%%");
                 System.out.println("______________________________________________________________________________________________________________");
                 System.out.println();
               
                System.out.println("    If you want to go back to the Main menu press '1' or else if you want to Stop here then press '0'");
                System.out.println("                                          Enter Your Choice");
                System.out.print("                                                   ");  
                a3=inp.readLine();
                b3=Integer.parseInt(a3);
                if(b3==1)
                {
                i=1;
                System.out.println("                                       Welcome back to the Main Menu");
                }
                else
                {
                i=0;
                System.out.print("                             Thank you ");
                System.out.print(                                  yname);
                System.out.println(" for playing the Bournvita Quiz Contest");
                System.out.println("                             %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
                System.out.println("______________________________________________________________________________________________________________");
                System.out.println("                                          Winner of the Viewer's Question");
                System.out.println("______________________________________________________________________________________________________________");
                for(read=1;read<=n;read++)
                {     
               System.out.println("                                            ############################");    
                System.out.println("                                            "+namet2[read]);
                System.out.println("                                            "+zone[read]);
                System.out.println("                                            "+school2[read]);
                System.out.println("                                            "+email[read]); 
                System.out.println("                                            ############################");    
                System.out.println("______________________________________________________________________________________________________________");           
                }
                }
                break;
                 
                case 9: 
                System.out.println("Q1.Which war saw the end of these three great dynasties - hohenzollerns, ");
                System.out.println("Habsburg and the Romanovs  ?");
                System.out.println("1.)The Crimean War");
                System.out.println("2.)World War 1");
                System.out.println("3.)The Vietnam War");
                System.out.println("4.)World War 2");
                System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==2)
                {
                score=score+10;
                System.out.println("Your answer is correct");
                }
                else
                {
                    score=score-5;
                 System.out.println("Sorry!your answer is incorrect");
                 System.out.println("The correct answer is World War 1");
                 } 
                 System.out.println();
                 
                System.out.println("Q2.If Shah Jahan's wife is buried in the Taj Mahal,which Mughal emperor's ");
                System.out.println("wife is buried in Bibi ka Maqbara ?");
                System.out.println("1.)Babur");
                System.out.println("2.)Akbar");
                System.out.println("3.)Jahangir");
                System.out.println("4.)Aurangzeb");
                System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==4)
                {
                score=score+10;
                System.out.println("Your answer is correct");
                }
                else
                {
                       score=score-5;
                 System.out.println("Sorry!your answer is incorrect");
                 System.out.println("The correct answer is Aurangzeb");
                 } 
                 System.out.println();
                          
                System.out.println("Q3.Which historical event occured when Lord Chelmsford was Viceroy of India ?");
                System.out.println("1.)Quit India Movement");
                System.out.println("2.)The Jallianwala Bagh Tragedy");
                System.out.println("3.)The Black Hole Tragedy");
                System.out.println("4.)The First Great War of Independence");
                System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==2)
                {
                score=score+10;
                System.out.println("Your answer is correct");
                }
                else
                {
                       score=score-5;
                 System.out.println("Sorry!your answer is incorrect");
                 System.out.println("The correct answer is The Jallianwala Bagh Tragedy ");
                 } 
                 System.out.println();
                 
                System.out.println("Q4.Why are the Aryankas also called the 'Forest books' ?");
                System.out.println("1.)As they were written in the forest");
                System.out.println("2.)As they guided the jungle-dwelling hermits");
                System.out.println("3.)As IFS officers use them extensively");
                System.out.println("4.)As they provided details on Indian forests");
                System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==2)
                {
                score=score+10;
                System.out.println("Your answer is correct");
                }
                else
                {
                       score=score-5;
                 System.out.println("Sorry!your answer is incorrect");
                 System.out.println("The correct answer is As they guided the jungle-dwelling hermits ");
                 } 
                 System.out.println();
                 
                System.out.println("Q5.What was the motto of the Arya Samaj ?");
                System.out.println("1.)Swaraj is my birthright");
                System.out.println("2.)Liberty,Equality,Fraternity");
                System.out.println("3.)All men are equal");
                System.out.println("4.)Back to the Vedas");
                System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==4)
                {
                score=score+10;
                System.out.println("Your answer is correct");
                }
                else
                {
                       score=score-5;
                 System.out.println("Sorry!your answer is incorrect");
                 System.out.println("The correct answer is Back to the Vedas ");
                 } 
                 System.out.println();
                 
                System.out.println("Q6.Why are the followers of Zoroastrianism called Parsees ?");
                System.out.println("1.)It is the Persian word for 'follower'");
                System.out.println("2.)It came from 'Percy',a common name in the community");
                System.out.println("3.)As they wre originally from Persia");
                System.out.println("4.)As it means 'fire worshipper'");
                System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==3)
                {
                score=score+10;
                System.out.println("Your answer is correct");
                }
                else
                {
                       score=score-5;
                 System.out.println("Sorry!your answer is incorrect");
                 System.out.println("The correct answer is As they wre originally from Persia ");
                 }
                 System.out.println();
                 
                System.out.println("Q7.Which Mughal emperor wrote poetry under the pen name Zafar ?");
                System.out.println("1.)Auranzeb");
                System.out.println("2.)Bahadur Shah II");
                System.out.println("3.)Nadir Shah");
                System.out.println("4.)Shah Jahan");
                System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==2)
                {
                score=score+10;
                System.out.println("Your answer is correct");
                }
                else
                {
                       score=score-5;
                 System.out.println("Sorry!your answer is incorrect");
                 System.out.println("The correct answer is Bahadur Shah II ");
                 } 
                 System.out.println();
               
                System.out.println("Q8.When elections were held in ancient Greece,what vegetable was used for voting ?");
                System.out.println("1.)Beans");
                System.out.println("2.)Poatatoes");
                System.out.println("3.)Tomatoes");
                System.out.println("4.)Onions");
                System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==1)
                {
                score=score+10;
                System.out.println("Your answer is correct");
                }
                else
                {
                       score=score-5;
                 System.out.println("Sorry!your answer is incorrect");
                 System.out.println("The correct answer is Beans ");
                 } 
                 System.out.println();
                 
                System.out.println("Q9.Which Indian ruler was so fascinated by the tiger that he had a tiger ");
                System.out.println("throne built and many of his possessions had tiger stripes on them ?");
                System.out.println("1.)Sher Shah Suri");
                System.out.println("2.)Nadir Shah");
                System.out.println("3.)Tipu Sultan");
                System.out.println("4.)Aurangzeb");
                System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==3)
                {
                score=score+10;
                System.out.println("Your answer is correct");
                }
                else
                {
                       score=score-5;
                 System.out.println("Sorry!your answer is incorrect");
                 System.out.println("The correct answer is Tipu Sultan ");
                 } 
                 System.out.println();
                 
                System.out.println("Q10.in 493 BC whom did Ajatshatru assassinate to assume the throne of Magadha ?");
                System.out.println("1.)Chandragupta Maurya");
                System.out.println("2.)Bimbisara");
                System.out.println("3.)Prasenjit");
                System.out.println("4.)Bindusara");
                System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==2)
                {
                score=score+10;
                System.out.println("Your answer is correct");
                 System.out.println("______________________________________________________________________________________________________________");
                System.out.println("                                    Your Total Score for the round is  "+score);
                }
                else
                {
                       score=score-5;
                 System.out.println("Sorry!your answer is incorrect");
                 System.out.println("The correct answer is Bimbisara ");
                  System.out.println("______________________________________________________________________________________________________________");
                 System.out.println("                                   Your Total Score for the round is  "+score);
                 }
                  if(score>40)
                  {
                 certificate();
                 System.out.println("                  Press 'Enter' to see the Date,Time and other details of our All-Asia Finals");                                         
                 a2=inp.readLine();          
                 System.out.println("                  Our Finals will be held on 21st November 2005 at our studio here at Mumbai");
                 System.out.println("______________________________________________________________________________________________________________");
                while(m==1)
                {
                 System.out.println("______________________________________________________________________________________________________________");
                 System.out.println("                                           Welcome to our 'BQC Winners Book'");
                 System.out.println("______________________________________________________________________________________________________________");
                System.out.println("Press 1 to sign our Winners Book");
                System.out.println("Press 2 to read the name of our Former Champions");
                System.out.println("Press 0 to Continue Further");
                System.out.println("                                             Enter Your Choice:");
                choice6=inp.readLine();
                ch6=Integer.parseInt(choice6);
                System.out.println();
                switch(ch6)
                {
                case 1:
                c++;
                 System.out.println("______________________________________________________________________________________________________________");
                System.out.println("                                            Welcome to our 'BQC Winners Book'");
                 System.out.println("______________________________________________________________________________________________________________");
                System.out.println("Enter Your Name:");
                name2=inp.readLine();
                namet[c]=name2;
                System.out.println("Enter the current year:");
                year=inp.readLine();
                currentyear[c]=year;
                System.out.println("Enter Your School:");
                school1=inp.readLine();
                School[c]=school1;
                System.out.println("");
                System.out.println("                                        Thank you for signing our 'BQC Winners Book'"); 
                System.out.println("                                        ############################################");
                 System.out.println("______________________________________________________________________________________________________________");
                System.out.println("                                        Press Enter to Return to our'BQC Winners Book'");
                s1=inp.readLine();              
                break;
                
                case 2:
                System.out.println("______________________________________________________________________________________________________________");
                System.out.println("                                  Welcome to read the name of our Former Champions of BQC");
                System.out.println("______________________________________________________________________________________________________________");
                for(read=0;read<=c;read++)
                {     
                System.out.println("                                                   "+currentyear[read]);
                System.out.println("                                       "+School[read]);
                System.out.println("                                                 "+namet[read]); 
                  System.out.println("                                       #################################");                
                }
                System.out.println("Press Enter to Return to our 'BQC Winners Book'");
                s1=inp.readLine();                  
                break;
            
                case 0:
                m=-1;
                break;
                }}}
                 else
                 System.out.println("                   %%%%%%%%%Sorry!You couldn't qualify for the All-Asia Finals%%%%%%%%");
                 System.out.println("______________________________________________________________________________________________________________");
                 System.out.println();
               
                System.out.println("    If you want to go back to the Main menu press '1' or else if you want to Stop here then press '0'");
                System.out.println("                                          Enter Your Choice");
                System.out.print("                                                   ");  
                a3=inp.readLine();
                b3=Integer.parseInt(a3);
                if(b3==1)
                {
                i=1;
                System.out.println("                                       Welcome back to the Main Menu");
                }
                else
                {
                i=0;
                System.out.print("                             Thank you ");
                System.out.print(                                 yname);
                System.out.println(" for playing the Bournvita Quiz Contest"); 
                System.out.println("                             %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
                System.out.println("______________________________________________________________________________________________________________");
                System.out.println("                                          Winner of the Viewer's Question");
                System.out.println("______________________________________________________________________________________________________________");
                for(read=1;read<=n;read++)
                {     
                System.out.println("                                            ############################");    
                System.out.println("                                            "+namet2[read]);
                System.out.println("                                            "+zone[read]);
                System.out.println("                                            "+school2[read]);
                System.out.println("                                            "+email[read]); 
                System.out.println("                                            ############################");    
                System.out.println("______________________________________________________________________________________________________________");
                }
                }
                break;
                                    
                 case 10:
                 System.out.println("                                          Press  1  for Set  I");
                 System.out.println("                                          Press  2  for Set  II");
                 System.out.println("                                          Press  3  for Set  III");
                 System.out.println("                                          Press  4  for Set  IV");
                 System.out.println("                                          Press  5  for Set  V");
                 System.out.print("Enter Your Choice : ");
                 String ab=inp.readLine();          
                 int cha=Integer.parseInt(ab);
                 switch(cha)
                 {
                 
                case 1: 
                timer();
                System.out.println("Q1.Who is older :");
                System.out.println("1.)Rahul Gandhi");
                System.out.println("2.)Priyanka Gandhi");
                System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==1)
                {
                score=score+10;
                System.out.println("Your answer is correct");
                }
                else
                {
                 System.out.println("Sorry!your answer is incorrect");
                 System.out.println("The correct answer is Rahul Gandhi");
                 } 
                 System.out.println();
                 
                System.out.println("Q2.Which moves faster :");
                System.out.println("1.)A Rickshaw");
                System.out.println("2.)An Auto Rickshaw");
                System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==2)
                {
                score=score+10;
                System.out.println("Your answer is correct");
                }
                else
                {
                 System.out.println("Sorry!your answer is incorrect");
                 System.out.println("The correct answer is Auto Rickshaw");
                 } 
                 System.out.println();
                 
                System.out.println("Q3.Gentlemen wearing glasses are allowed to be cricket umpires ?");
                System.out.println("1.)Agree");
                System.out.println("2.)Disagree");
                System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==1)
                {
                score=score+10;
                System.out.println("Your answer is correct");
                }
                else
                {
                 System.out.println("Sorry!your answer is incorrect");
                 System.out.println("The correct answer is Agree");
                 } 
                 System.out.println();
                 
                System.out.println("Q4.Which metro has a Diamond Harbour  ?");
                System.out.println("1.)Calcutta");
                System.out.println("2.)Mumbai");
                System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==1)
                {
                score=score+10;
                System.out.println("Your answer is correct");
                }
                else
                {
                 System.out.println("Sorry!your answer is incorrect");
                 System.out.println("The correct answer is Calcutta");
                 } 
                 System.out.println();
                 
                System.out.println("Q5.The Lahore Gate,an entrance to the Red Fort is in which country ?");
                System.out.println("1.)India");
                System.out.println("2.)Australia");
                System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==1)
                {
                score=score+10;
                System.out.println("Your answer is correct");
                }
                else
                {
                 System.out.println("Sorry!your answer is incorrect");
                 System.out.println("The correct answer is Indian");
                 } 
                 System.out.println();
                 
                System.out.println("Q6.Which has more caffeine ?");
                System.out.println("1.)Tea");
                System.out.println("2.)Coffee");
                System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==2)
                {
                score=score+10;
                System.out.println("Your answer is correct");
                }
                else
                {
                 System.out.println("Sorry!your answer is incorrect");
                 System.out.println("The correct answer is Coffee");
                 } 
                 System.out.println();
                 
                System.out.println("Q7.Rumplestiltskin was a giant ape ?");
                System.out.println("1.)Serious");
                System.out.println("2.)Joking");
                System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==2)
                {
                score=score+10;
                System.out.println("Your answer is correct");
                }
                else
                {
                 System.out.println("Sorry!your answer is incorrect");
                 System.out.println("The correct answer is Joking");
                 } 
                 System.out.println();
                 
                System.out.println("Q8.How many watts are used in one kilowatt hour ?");
                System.out.println("1.)100");
                System.out.println("2.)1000");
                System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==2)
                {
                score=score+10;
                System.out.println("Your answer is correct");
                timer2();
                System.out.println("______________________________________________________________________________________________________________");
                System.out.println("                                Your Total score for the round is  "+score);
                }
                else
                {
                 System.out.println("Sorry!your answer is incorrect");
                 System.out.println("The correct answer is 1000 watts");
                 timer2();
                 System.out.println("______________________________________________________________________________________________________________");
                 System.out.println("                                Your Total score for the round is  "+score);
                 } 
                  if(score>=50)
                  {
                 certificate();
                 System.out.println("                  Press 'Enter' to see the Date,Time and other details of our All-Asia Finals");                                         
                 a2=inp.readLine();          
                 System.out.println("                  Our Finals will be held on 21st November 2005 at our studio here at Mumbai");
                 System.out.println("______________________________________________________________________________________________________________");
                 while(m==1)
                {
                     System.out.println("______________________________________________________________________________________________________________");
            System.out.println("                                           Welcome to our 'BQC Winners Book'");
             System.out.println("______________________________________________________________________________________________________________");
            System.out.println("Press 1 to sign our Winners Book");
            System.out.println("Press 2 to read the name of our Former Champions");
            System.out.println("Press 0 to Continue Further");
            System.out.println("                                             Enter Your Choice:");
            choice6=inp.readLine();
            ch6=Integer.parseInt(choice6);
            System.out.println();
            switch(ch6)
            {
                case 1:
                c++;
                 System.out.println("______________________________________________________________________________________________________________");
                System.out.println("                                              Welcome to our 'BQC Winners Book'");
                 System.out.println("______________________________________________________________________________________________________________");
                System.out.println("Enter Your Name:");
                name2=inp.readLine();
                namet[c]=name2;
                System.out.println("Enter the current year:");
                year=inp.readLine();
                currentyear[c]=year;
                System.out.println("Enter Your School:");
                school1=inp.readLine();
                School[c]=school1;
                System.out.println("");
                System.out.println("                                        Thank you for signing our 'BQC Winners Book'"); 
                System.out.println("                                        ############################################");
                 System.out.println("______________________________________________________________________________________________________________");
                System.out.println("                                        Press Enter to Return to our'BQC Winners Book'");
                s1=inp.readLine();              
                break;
                
                case 2:
                System.out.println("______________________________________________________________________________________________________________");
                System.out.println("                                  Welcome to read the name of our Former Champions of BQC");
                  System.out.println("______________________________________________________________________________________________________________");
                for(read=0;read<=c;read++)
                {     
                System.out.println("                                                   "+currentyear[read]);
                System.out.println("                                       "+School[read]);
                System.out.println("                                                 "+namet[read]); 
                  System.out.println("                                       #################################");                
                }
                System.out.println("Press Enter to Return to our 'BQC Winners Book'");
                s1=inp.readLine();                   
                break;
            
                case 0:
                m=-1;
                break;
                }}}     
                else
                System.out.println("                   %%%%%%%%%Sorry!You couldn't qualify for the All-Asia Finals%%%%%%%%");
                System.out.println("______________________________________________________________________________________________________________");
                System.out.println();
                System.out.println("    If you want to go back to the Main menu press '1' or else if you want to Stop here then press '0'");
                System.out.println("                                          Enter Your Choice");
                System.out.print("                                                   ");  
                a3=inp.readLine();
                b3=Integer.parseInt(a3);
                if(b3==1)
                {
                i=1;
                System.out.println("                                       Welcome back to the Main Menu");
                }
                else
                {
                i=0;
                System.out.print("                             Thank you ");
                System.out.print(                                  yname);
                System.out.println(" for playing the Bournvita Quiz Contest");
                System.out.println("                             %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
                System.out.println("______________________________________________________________________________________________________________");
                System.out.println("                                          Winner of the Viewer's Question");
                System.out.println("______________________________________________________________________________________________________________");
                for(read=1;read<=n;read++)
                {     
                System.out.println("                                            ############################");    
                System.out.println("                                            "+namet2[read]);
                System.out.println("                                            "+zone[read]);
                System.out.println("                                            "+school2[read]);
                System.out.println("                                            "+email[read]); 
                System.out.println("                                            ############################");    
                System.out.println("______________________________________________________________________________________________________________");        
                }
                }
                break;
                 
                case 2:
                timer();
                System.out.println("Q1.Every railway platform in India is of the same size ?");
                System.out.println("1.)Serious");
                System.out.println("2.)Joking");
                System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==2)
                {
                score=score+10;
                System.out.println("Your answer is correct");
                }
                else
                {
                 System.out.println("Sorry!your answer is incorrect");
                 System.out.println("The correct answer is Joking");
                 } 
                 System.out.println();
                 
                System.out.println("Q2.In appreciation of a speech,do Indian MPs : ");
                System.out.println("1.)Clap thier hands");
                System.out.println("2.)Thump their desks");
                System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==2)
                {
                score=score+10;
                System.out.println("Your answer is correct");
                }
                else
                {
                 System.out.println("Sorry!your answer is incorrect");
                 System.out.println("The correct answer is Thump their desks");
                 } 
                 System.out.println();
                 
                System.out.println("Q3.In the US,who are usually taller :");
                System.out.println("1.)Astronauts");
                System.out.println("2.)Basketball players");
                System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==2)
                {
                score=score+10;
                System.out.println("Your answer is correct");
                }
                else
                {
                 System.out.println("Sorry!your answer is incorrect");
                 System.out.println("The correct answer is Basketball players");
                 } 
                 System.out.println();
                 
                System.out.println("Q4.What is the common name for the young of a bear and lion :");
                System.out.println("1.)Cub");
                System.out.println("2.)Calf");
                System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==1)
                {
                score=score+10;
                System.out.println("Your answer is correct");
                }
                else
                {
                 System.out.println("Sorry!your answer is incorrect");
                 System.out.println("The correct answer is Cub");
                 } 
                 System.out.println();
                 
                System.out.println("Q5.Siam is the old name for which country");
                System.out.println("1.)Thailand");
                System.out.println("2.)Hongkong");
                System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==1)
                {
                score=score+10;
                System.out.println("Your answer is correct");
                }
                else
                {
                 System.out.println("Sorry!your answer is incorrect");
                 System.out.println("The correct answer is Thialand");
                 } 
                 System.out.println();
                 
                System.out.println("Q6.What kind of museum is Madame Tussaud famous for");
                System.out.println("1.)Wax Museum");
                System.out.println("2.)Plastic Museum");
                System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==1)
                {
                score=score+10;
                System.out.println("Your answer is correct");
                }
                else
                {
                 System.out.println("Sorry!your answer is incorrect");
                 System.out.println("The correct answer is Wax Museum");
                 } 
                 System.out.println();
                 
                System.out.println("Q7.What language is commonly spoken in Brazil ?");
                System.out.println("1.)Brazilian");
                System.out.println("2.)Portuguese");
                System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==2)
                {
                score=score+10;
                System.out.println("Your answer is correct");
                }
                else
                {
                 System.out.println("Sorry!your answer is incorrect");
                 System.out.println("The correct answer is Portuguese");
                 } 
                 System.out.println();
                
                System.out.println("Q8.Which tennis player shares a name with an Indian pace bowler ?");
                System.out.println("1.)Leander Paes");
                System.out.println("2.)Prahlad Srinath");
                System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==2)
                {
                score=score+10;
                System.out.println("Your answer is correct");
                timer2();
                System.out.println("______________________________________________________________________________________________________________");
                System.out.println("                                Your Total score for the round is  "+score);
                }
                else
                {
                 System.out.println("Sorry!your answer is incorrect");
                 System.out.println("The correct answer is Prahlad Srinath");
                  timer2();
                  System.out.println("______________________________________________________________________________________________________________");
                 System.out.println("                                Your Total score for the round is  "+score);
                 } 
                  if(score>=50)
                 {
                 certificate();
                 System.out.println("                  Press 'Enter' to see the Date,Time and other details of our All-Asia Finals");                                         
                 a2=inp.readLine();          
                 System.out.println("                  Our Finals will be held on 21st November 2005 at our studio here at Mumbai");
                 System.out.println("______________________________________________________________________________________________________________");
                 while(m==1)
                 { 
                 System.out.println("______________________________________________________________________________________________________________");
                 System.out.println("                                           Welcome to our 'BQC Winners Book'");
                 System.out.println("______________________________________________________________________________________________________________");
                 System.out.println("Press 1 to sign our Winners Book");
                 System.out.println("Press 2 to read the name of our Former Champions");
                 System.out.println("Press 0 to Continue Further");
                 System.out.println("                                             Enter Your Choice:");
                 choice6=inp.readLine();
                 ch6=Integer.parseInt(choice6);
                 System.out.println();
                 switch(ch6)
                 {
                 case 1:
                 c++;
                System.out.println("______________________________________________________________________________________________________________");
                System.out.println("                                             Welcome to our 'BQC Winners Book'");
                System.out.println("______________________________________________________________________________________________________________");
                System.out.println("Enter Your Name:");
                name2=inp.readLine();
                namet[c]=name2;
                System.out.println("Enter the current year:");
                year=inp.readLine();
                currentyear[c]=year;
                System.out.println("Enter Your School:");
                school1=inp.readLine();
                School[c]=school1;
                System.out.println("");
                System.out.println("                                        Thank you for signing our 'BQC Winners Book'"); 
                System.out.println("                                        ############################################");
                 System.out.println("______________________________________________________________________________________________________________");
                System.out.println("                                        Press Enter to Return to our'BQC Winners Book'");
                s1=inp.readLine();              
                break;
                
                case 2:
                System.out.println("______________________________________________________________________________________________________________");
                System.out.println("                                  Welcome to read the name of our Former Champions of BQC");
                  System.out.println("______________________________________________________________________________________________________________");
                for(read=0;read<=c;read++)
                {     
                System.out.println("                                                   "+currentyear[read]);
                System.out.println("                                       "+School[read]);
                System.out.println("                                                 "+namet[read]); 
                  System.out.println("                                       #################################");                
                }
                System.out.println("Press Enter to Return to our 'BQC Winners Book'");
                s1=inp.readLine();                         
                break;
            
                case 0:
                m=-1;
                break;
                }}} 
                 else
                 System.out.println("                   %%%%%%%%%Sorry!You couldn't qualify for the All-Asia Finals%%%%%%%%");
                 System.out.println("______________________________________________________________________________________________________________");
                 System.out.println();
                 
                System.out.println("    If you want to go back to the Main menu press '1' or else if you want to Stop here then press '0'");
                System.out.println("                                          Enter Your Choice");
                System.out.print("                                                   ");  
                a3=inp.readLine();
                b3=Integer.parseInt(a3);
                if(b3==1)
                {
                i=1;
                System.out.println("                                       Welcome back to the Main Menu");
                }
                else
                {
                i=0;
                System.out.print("                             Thank you ");
                System.out.print(                                  yname);
                System.out.println(" for playing the Bournvita Quiz Contest");
                System.out.println("                             %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
                System.out.println("______________________________________________________________________________________________________________");
                System.out.println("                                          Winner of the Viewer's Question");
                System.out.println("______________________________________________________________________________________________________________");
                for(read=1;read<=n;read++)
                {     
                System.out.println("                                            ############################");    
                System.out.println("                                            "+namet2[read]);
                System.out.println("                                            "+zone[read]);
                System.out.println("                                            "+school2[read]);
                System.out.println("                                            "+email[read]); 
                System.out.println("                                            ############################");    
                System.out.println("______________________________________________________________________________________________________________");                
                }
                }
                break;
                 
                case 3:
                timer();
                System.out.println("Q1.The Hindu newspaper is more popular in : ?");
                System.out.println("1.)South India");
                System.out.println("2.)North India");
                System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==1)
                {
                score=score+10;
                System.out.println("Your answer is correct");
                }
                else
                {
                 System.out.println("Sorry!your answer is incorrect");
                 System.out.println("The correct answer is South India");
                 } 
                 System.out.println();
                 
                System.out.println("Q2.Naved and Javed Jafri are brothers : ?");
                System.out.println("1.)Serious");
                System.out.println("2.)Joking");
                System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==1)
                {
                score=score+10;
                System.out.println("Your answer is correct");
                }
                else
                {
                 System.out.println("Sorry!your answer is incorrect");
                 System.out.println("The correct answer is Serious");
                 } 
                 System.out.println();
                 
                System.out.println("Q3.Cricket umpires usually use :");
                System.out.println("1.)Cellphones");
                System.out.println("2.)Walkie-talkies");
                System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==2)
                {
                score=score+10;
                System.out.println("Your answer is correct");
                }
                else
                {
                 System.out.println("Sorry!your answer is incorrect");
                 System.out.println("The correct answer is Walkie-talkies");
                 } 
                 System.out.println();
                 
                System.out.println("Q4.What is thrown off a ship to keep it in place ?");
                System.out.println("1.)Anchor");
                System.out.println("2.)Knot");
                System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==1)
                {
                score=score+10;
                System.out.println("Your answer is correct");
                }
                else
                {
                 System.out.println("Sorry!your answer is incorrect");
                 System.out.println("The correct answer is Anchor");
                 } 
                 System.out.println();
                 
                System.out.println("Q5.What was the anem of the strong son of Zeus ?");
                System.out.println("1.)Hercules");
                System.out.println("2.)Apollo");
                System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==1)
                {
                score=score+10;
                System.out.println("Your answer is correct");
                }
                else
                {
                 System.out.println("Sorry!your answer is incorrect");
                 System.out.println("The correct answer is Hercules");
                 } 
                 System.out.println();
                 
                System.out.println("Q6.When eating traditional Andhra food,what leaf would you eat on ?");
                System.out.println("1.)Papaya");
                System.out.println("2.)Banana");
                System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==2)
                {
                score=score+10;
                System.out.println("Your answer is correct");
                }
                else
                {
                 System.out.println("Sorry!your answer is incorrect");
                 System.out.println("The correct answer is Banana");
                 } 
                 System.out.println();
                 
                System.out.println("Q7.Surat is famous for cutting whaich precious stone ?");
                System.out.println("1.)Diamond");
                System.out.println("2.)Sapphire");
                System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==1)
                {
                score=score+10;
                System.out.println("Your answer is correct");
                }
                else
                {
                 System.out.println("Sorry!your answer is incorrect");
                 System.out.println("The correct answer is Diamond");
                 } 
                 System.out.println();
                 
                System.out.println("Q8.Which continent has the Great Barrier Reef ?");
                System.out.println("1.)Asia");
                System.out.println("2.)Australia");
                System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==2)
                {
                score=score+10;
                System.out.println("Your answer is correct");
                timer2();
                System.out.println("______________________________________________________________________________________________________________");
                System.out.println("                                Your Total score for the round is  "+score);
                }
                else
                {
                 System.out.println("Sorry!your answer is incorrect");
                 System.out.println("The correct answer is Australia");
                 timer2();
                 System.out.println("______________________________________________________________________________________________________________");
                 System.out.println("                                Your Total score for the round is  "+score);
                 } 
                  if(score>=50)
                  {
                 certificate();
                 System.out.println("                  Press 'Enter' to see the Date,Time and other details of our All-Asia Finals");                                         
                 a2=inp.readLine();          
                 System.out.println("                  Our Finals will be held on 21st November 2005 at our studio here at Mumbai");
                 System.out.println("______________________________________________________________________________________________________________");
                 while(m==1)
                 {
                 System.out.println("______________________________________________________________________________________________________________");
                 System.out.println("                                           Welcome to our 'BQC Winners Book'");
                 System.out.println("______________________________________________________________________________________________________________");
                 System.out.println("Press 1 to sign our Winners Book");
                 System.out.println("Press 2 to read the name of our Former Champions");
                 System.out.println("Press 0 to Continue Further");
                 System.out.println("                                             Enter Your Choice:");
                 choice6=inp.readLine();
                 ch6=Integer.parseInt(choice6);
                 System.out.println();
                 switch(ch6)
                 {
                 case 1:
                 c++;
                 System.out.println("______________________________________________________________________________________________________________");
                 System.out.println("                                            Welcome to our 'BQC Winners Book'");
                 System.out.println("______________________________________________________________________________________________________________");
                 System.out.println("Enter Your Name:");
                 name2=inp.readLine();
                 namet[c]=name2;
                 System.out.println("Enter the current year:");
                 year=inp.readLine();
                 currentyear[c]=year;
                 System.out.println("Enter Your School:");
                 school1=inp.readLine();
                 School[c]=school1;
                 System.out.println("");
                 System.out.println("                                        Thank you for signing our 'BQC Winners Book'"); 
                 System.out.println("                                        ############################################");
                 System.out.println("______________________________________________________________________________________________________________");
                 System.out.println("                                        Press Enter to Return to our'BQC Winners Book'");
                 s1=inp.readLine();              
                 break;
                
                case 2:
                System.out.println("______________________________________________________________________________________________________________");
                System.out.println("                                  Welcome to read the name of our Former Champions of BQC");
                System.out.println("______________________________________________________________________________________________________________");
                for(read=0;read<=c;read++)
                {     
                System.out.println("                                                   "+currentyear[read]);
                System.out.println("                                       "+School[read]);
                System.out.println("                                                 "+namet[read]); 
                System.out.println("                                       #################################");                
                }
                System.out.println("Press Enter to Return to our 'BQC Winners Book'");
                s1=inp.readLine();                
                break;
            
                case 0:
                m=-1;
                break;
                }}} 
                 else
                 System.out.println("                   %%%%%%%%%Sorry!You couldn't qualify for the All-Asia Finals%%%%%%%%");
                 System.out.println("______________________________________________________________________________________________________________");
                 System.out.println();
                 
                 System.out.println("    If you want to go back to the Main menu press '1' or else if you want to Stop here then press '0'");
                 System.out.println("                                          Enter Your Choice");
                 System.out.print("                                                   ");  
                 a3=inp.readLine();
                 b3=Integer.parseInt(a3);
                 if(b3==1)
                 {
                 i=1;
                 System.out.println("                                       Welcome back to the Main Menu");
                 }
                 else
                 {
                 i=0;
                 System.out.print("                             Thank you ");
                 System.out.print(                                  yname);
                 System.out.println(" for playing the Bournvita Quiz Contest");
                 System.out.println("                             %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
                 System.out.println("______________________________________________________________________________________________________________");
                System.out.println("                                          Winner of the Viewer's Question");
                System.out.println("______________________________________________________________________________________________________________");
                for(read=1;read<=n;read++)
                {     
                System.out.println("                                            ############################");    
                System.out.println("                                            "+namet2[read]);
                System.out.println("                                            "+zone[read]);
                System.out.println("                                            "+school2[read]);
                System.out.println("                                            "+email[read]); 
                System.out.println("                                            ############################");    
                System.out.println("______________________________________________________________________________________________________________");            
                }
                 }
                 break;
                 
                case 4:
                timer(); 
                System.out.println("Q1.According to the proverb,how many stitches are saved by a stitch in time ?");
                System.out.println("1.)Nine");
                System.out.println("2.)Five");
                System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==1)
                {
                score=score+10;
                System.out.println("Your answer is correct");
                }
                else
                {
                 System.out.println("Sorry!your answer is incorrect");
                 System.out.println("The correct answer is Nine");
                 } 
                 System.out.println();
                 
                System.out.println("Q2.All the World Cup football matches in 1998 were played in paris ?");
                System.out.println("1.)Serious");
                System.out.println("2.)Joking");
                System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==2)
                {
                score=score+10;
                System.out.println("Your answer is correct");
                }
                else
                {
                 System.out.println("Sorry!your answer is incorrect");
                 System.out.println("The correct answer is Joking");
                 } 
                 System.out.println();
                 
                System.out.println("Q3.A person who studies rocks is called a rock star ?");
                System.out.println("1.)Serious");
                System.out.println("2.)Joking");
                System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==2)
                {
                score=score+10;
                System.out.println("Your answer is correct");
                }
                else
                {
                 System.out.println("Sorry!your answer is incorrect");
                 System.out.println("The correct answer is Joking");
                 } 
                 System.out.println();
                 
                System.out.println("Q4.What do olive branches on the Un flag symbolise ?");
                System.out.println("1.)Peace");
                System.out.println("2.)Fertility");
                System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==1)
                {
                score=score+10;
                System.out.println("Your answer is correct");
                }
                else
                {
                 System.out.println("Sorry!your answer is incorrect");
                 System.out.println("The correct answer is Peace");
                 } 
                 System.out.println();
                 
                System.out.println("Q5.Lenin and Stalin were leaders of which country ?");
                System.out.println("1.)Russia");
                System.out.println("2.)France");
                System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==1)
                {
                score=score+10;
                System.out.println("Your answer is correct");
                }
                else
                {
                 System.out.println("Sorry!your answer is incorrect");
                 System.out.println("The correct answer is Russia");
                 } 
                 System.out.println();
                 
                     
                System.out.println("Q6.Which actor sang for the first time ever in the film Ghulam ?");
                System.out.println("1.)Sanjay Dutt");
                System.out.println("2.)Aamir Khan");
                System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==1)
                {
                score=score+10;
                System.out.println("Your answer is correct");
                }
                else
                {
                 System.out.println("Sorry!your answer is incorrect");
                 System.out.println("The correct answer is Aamir Khan");
                 } 
                 System.out.println();
                 
                             
                System.out.println("Q7.In which field did Rabindranath Tagore received his Nobel Prize ?");
                System.out.println("1.)Literature");
                System.out.println("2.)Philosophy");
                System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==1)
                {
                score=score+10;
                System.out.println("Your answer is correct");
                }
                else
                {
                 System.out.println("Sorry!your answer is incorrect");
                 System.out.println("The correct answer is Literature");
                 } 
                 System.out.println();
                 
                                   
                System.out.println("Q8.Which channel separates England and France ?");
                System.out.println("1.)Ten degree Channel");
                System.out.println("2.)English Channel");
                System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==2)
                {
                score=score+10;
                System.out.println("Your answer is correct");
                 timer2();
                 System.out.println("______________________________________________________________________________________________________________");
                System.out.println("                                Your Total score for the round is  "+score);
                }
                else
                {
                 System.out.println("Sorry!your answer is incorrect");
                 System.out.println("The correct answer is English channel");
                 timer2();
                 System.out.println("______________________________________________________________________________________________________________");
                 System.out.println("                                Your Total score for the round is  "+score);
                 } 
                  if(score>=50)
                  {
                 certificate();
                 System.out.println("                  Press 'Enter' to see the Date,Time and other details of our All-Asia Finals");                                         
                 a2=inp.readLine();          
                 System.out.println("                  Our Finals will be held on 21st November 2005 at our studio here at Mumbai");
                 System.out.println("______________________________________________________________________________________________________________");
                 while(m==1)
                 {
                 System.out.println("______________________________________________________________________________________________________________");
                 System.out.println("                                           Welcome to our 'BQC Winners Book'");
                 System.out.println("______________________________________________________________________________________________________________");
                 System.out.println("Press 1 to sign our Winners Book");
                 System.out.println("Press 2 to read the name of our Former Champions");
                 System.out.println("Press 0 to Continue Further");
                 System.out.println("                                             Enter Your Choice:");
                 choice6=inp.readLine();
                 ch6=Integer.parseInt(choice6);
                 System.out.println();
                 switch(ch6)
                 {
                 case 1:
                 c++;
                System.out.println("______________________________________________________________________________________________________________");
                System.out.println("                                             Welcome to our 'BQC Winners Book'");
                System.out.println("______________________________________________________________________________________________________________");
                System.out.println("Enter Your Name:");
                name2=inp.readLine();
                namet[c]=name2;
                System.out.println("Enter the current year:");
                year=inp.readLine();
                currentyear[c]=year;
                System.out.println("Enter Your School:");
                school1=inp.readLine();
                School[c]=school1;
                System.out.println("");
                System.out.println("                                        Thank you for signing our 'BQC Winners Book'"); 
                System.out.println("                                        ############################################");
                System.out.println("______________________________________________________________________________________________________________");
                System.out.println("                                        Press Enter to Return to our'BQC Winners Book'");
                s1=inp.readLine();              
                break;
                
                case 2:
                System.out.println("______________________________________________________________________________________________________________");
                System.out.println("                                  Welcome to read the name of our Former Champions of BQC");
                System.out.println("______________________________________________________________________________________________________________");
                for(read=0;read<=c;read++)
                {     
                System.out.println("                                                   "+currentyear[read]);
                System.out.println("                                       "+School[read]);
                System.out.println("                                                 "+namet[read]); 
                System.out.println("                                       #################################");                
                }
                System.out.println("Press Enter to Return to our 'BQC Winners Book'");
                s1=inp.readLine();                      
                break;
            
                 case 0:
                 m=-1;
                 break;
                 }}}  
                 else
                 System.out.println("                   %%%%%%%%%Sorry!You couldn't qualify for the All-Asia Finals%%%%%%%%");
                 System.out.println("______________________________________________________________________________________________________________");
                 System.out.println();
                 
                 System.out.println("    If you want to go back to the Main menu press '1' or else if you want to Stop here then press '0'");
                 System.out.println("                                          Enter Your Choice");
                 System.out.print("                                                   ");  
                 a3=inp.readLine();
                 b3=Integer.parseInt(a3);
                 if(b3==1)
                 {
                 i=1;
                 System.out.println("                                       Welcome back to the Main Menu");
                 }
                 else
                 {
                 i=0;
                 System.out.print("                             Thank you ");
                 System.out.print(                                 yname);
                 System.out.println(" for playing the Bournvita Quiz Contest");
                 System.out.println("                             %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
                 System.out.println("______________________________________________________________________________________________________________");
                System.out.println("                                          Winner of the Viewer's Question");
                System.out.println("______________________________________________________________________________________________________________");
                for(read=1;read<=n;read++)
                {     
                System.out.println("                                            ############################");    
                System.out.println("                                            "+namet2[read]);
                System.out.println("                                            "+zone[read]);
                System.out.println("                                            "+school2[read]);
                System.out.println("                                            "+email[read]); 
                System.out.println("                                            ############################");    
                 System.out.println("______________________________________________________________________________________________________________");   
                }
                 }
                 break;
                 
                case 5:
                timer();
                System.out.println("Q1.Who is buried at Shantivan :?");
                System.out.println("1.)Indira Gandhi");
                System.out.println("2.)Jawaharlal Nehru");
                System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==2)
                {
                score=score+10;
                System.out.println("Your answer is correct");
                }
                else
                {
                 System.out.println("Sorry!your answer is incorrect");
                 System.out.println("The correct answer is Jawaharlal Nehru");
                 } 
                 System.out.println();
                
                System.out.println("Q2.Toy trains run on :?");
                System.out.println("1.)Broad Guage tracks");
                System.out.println("2.)Narrow Guage tracks");
                System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==2)
                {
                score=score+10;
                System.out.println("Your answer is correct");
                }
                else
                {
                 System.out.println("Sorry!your answer is incorrect");
                 System.out.println("The correct answer is Narrow Guage tracks");
                 } 
                 System.out.println();
                
                System.out.println("Q3.Name the blood vessel that begins with the word 'cap' ?");
                System.out.println("1.)Capillary");
                System.out.println("2.)Capsularity");
                System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==1)
                {
                score=score+10;
                System.out.println("Your answer is correct");
                }
                else
                {
                 System.out.println("Sorry!your answer is incorrect");
                 System.out.println("The correct answer is Capillary");
                 } 
                 System.out.println();   
                
                System.out.println("Q4.Who received the Chess Oscar in 1998 ?");
                System.out.println("1.)Vishwanathan Anand");
                System.out.println("2.)Gary Kasporov");
                System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==1)
                {
                score=score+10;
                System.out.println("Your answer is correct");
                }
                else
                {
                 System.out.println("Sorry!your answer is incorrect");
                 System.out.println("The correct answer is Vishwanathan Anand");
                 } 
                 System.out.println();      
                
                System.out.println("Q5.Oxygen and hydorgen are the two elements which make up which liquid ?");
                System.out.println("1.)Milk");
                System.out.println("2.)Water");
                System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==2)
                {
                score=score+10;
                System.out.println("Your answer is correct");
                }
                else
                {
                 System.out.println("Sorry!your answer is incorrect");
                 System.out.println("The correct answer is Vishwanathan Anand");
                 } 
                 System.out.println();      
                      
                System.out.println("Q6.What colour would you associate with Communist China ?");
                System.out.println("1.)Red");
                System.out.println("2.)Orange");
                System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==1)
                {
                score=score+10;
                System.out.println("Your answer is correct");
                }
                else
                {
                 System.out.println("Sorry!your answer is incorrect");
                 System.out.println("The correct answer is Red");
                 } 
                 System.out.println();      
                
                System.out.println("Q7.Diamonds can have different colours  ?");
                System.out.println("1.)Serious");
                System.out.println("2.)Joking");
                System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==1)
                {
                score=score+10;
                System.out.println("Your answer is correct");
                }
                else
                {
                 System.out.println("Sorry!your answer is incorrect");
                 System.out.println("The correct answer is Serious");
                 } 
                 System.out.println();      
                
                System.out.println("Q8.Which joins a muscle to a bone  ?");
                System.out.println("1.)A Tendon");
                System.out.println("2.)A Ligament");
                System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==1)
                {
                score=score+10;
                System.out.println("Your answer is correct");
                 timer2();
                 System.out.println("______________________________________________________________________________________________________________");
                 System.out.println("                            Your Total Score for the speed round is  "+score); 
                 }
                 else
                 {
                 System.out.println("Sorry!your answer is incorrect");
                 System.out.println("The correct answer is A Tendon");
                 timer2();
                 System.out.println("______________________________________________________________________________________________________________");
                 System.out.println("                            Your Total Score for the speed round is  "+score);
                 } 
                 if(score>=50)
                 {
                 certificate();
                 System.out.println("                  Press 'Enter' to see the Date,Time and other details of our All-Asia Finals");                                         
                 a2=inp.readLine();          
                 System.out.println("                  Our Finals will be held on 21st November 2005 at our studio here at Mumbai");
                 System.out.println("______________________________________________________________________________________________________________");
                while(m==1)
                {
                     System.out.println("______________________________________________________________________________________________________________");
            System.out.println("                                           Welcome to our 'BQC Winners Book'");
             System.out.println("______________________________________________________________________________________________________________");
            System.out.println("Press 1 to sign our Winners Book");
            System.out.println("Press 2 to read the name of our Former Champions");
            System.out.println("Press 0 to Continue Further");
            System.out.println("                                             Enter Your Choice:");
            choice6=inp.readLine();
            ch6=Integer.parseInt(choice6);
            System.out.println();
            switch(ch6)
            {
                case 1:
                c++;
                System.out.println("______________________________________________________________________________________________________________");
                System.out.println("                                             Welcome to our 'BQC Winners Book'");
                 System.out.println("______________________________________________________________________________________________________________");
                System.out.println("Enter Your Name:");
                name2=inp.readLine();
                namet[c]=name2;
                System.out.println("Enter the current year:");
                year=inp.readLine();
                currentyear[c]=year;
                System.out.println("Enter Your School:");
                school1=inp.readLine();
                School[c]=school1;
                System.out.println("");
                System.out.println("                                        Thank you for signing our 'BQC Winners Book'");
                System.out.println("                                        ############################################");
                 System.out.println("______________________________________________________________________________________________________________");
                System.out.println("                                        Press Enter to Return to our'BQC Winners Book'");
                s1=inp.readLine();              
                break;
                
                case 2:
                System.out.println("______________________________________________________________________________________________________________");
                System.out.println("                                  Welcome to read the name of our Former Champions of BQC");
                  System.out.println("______________________________________________________________________________________________________________");
                for(read=0;read<=c;read++)
                {     
                System.out.println("                                                   "+currentyear[read]);
                System.out.println("                                       "+School[read]);
                System.out.println("                                                 "+namet[read]); 
                  System.out.println("                                       #################################");                
                }
                System.out.println("Press Enter to Return to our 'BQC Winners Book'");
                s1=inp.readLine();                
                break;
            
                case 0:
                m=-1;
                break;
                }}}
                
                else
                System.out.println("                   %%%%%%%%%Sorry!You couldn't qualify for the All-Asia Finals%%%%%%%%");  
                System.out.println("______________________________________________________________________________________________________________");
                System.out.println();
                
                System.out.println("    If you want to go back to the Main menu press '1' or else if you want to Stop here then press '0'");
                System.out.println("                                          Enter Your Choice");
                System.out.print("                                                   ");  
                a3=inp.readLine();
                b3=Integer.parseInt(a3);
                if(b3==1)
                {
                i=1;
                System.out.println("                                       Welcome back to the Main Menu");
                }
                else
                {
                i=0;
                System.out.print("                             Thank you ");
                System.out.print(                                  yname);
                System.out.println(" for playing the Bournvita Quiz Contest");
                System.out.println("                             %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
                System.out.println("______________________________________________________________________________________________________________");
                System.out.println("                                          Winner of the Viewer's Question");
                System.out.println("______________________________________________________________________________________________________________");
                for(read=1;read<=n;read++)
                {
                System.out.println("                                            ############################");    
                System.out.println("                                            "+namet2[read]);
                System.out.println("                                            "+zone[read]);
                System.out.println("                                            "+school2[read]);
                System.out.println("                                            "+email[read]); 
                System.out.println("                                            ############################");    
                System.out.println("______________________________________________________________________________________________________________");   
                }
                }
                break;             
                default:
                System.out.println("Wrong Choice");
                }}
                break;
                
                      
                case 2:
                System.out.println("WELCOME TO 'THE Inter School Quiz'");
                System.out.println("==========================================================================================================================");
                System.out.println("                                     Rules and Regulations ");
                System.out.println("                                     *********************");
                System.out.println(" 1.Two schools will play this contest.Only one person will reprsent his or her school");
                System.out.println();
                System.out.println(" 2.This Quiz cosists of [6] rounds");
                System.out.println();
                System.out.println(" 3.Each question carries 10 points.");
                System.out.println();
                System.out.println(" 4.There are 4 options for each question(choose only one option).");
                System.out.println();
                System.out.println(" 5.There is a negative marking of [-5] for a wrong answer.");
                System.out.println();
                System.out.println(" 6.Your total points are displayed at the end of each round ");
                System.out.println();
                System.out.println(" 7.The School which has the highest score at the end of the round wins the contest");;
                System.out.println();
                System.out.println(" 8.If the points of the two schools are equal then the winner will be chosen by the"); 
                System.out.println("   computer and its decision shall be final ");
                System.out.println();
                System.out.println(" 9.If you win the Inter School Quiz Contest you get a BQC Winner's Certificate");
                System.out.println("=========================================================================================================================");
                System.out.println("                                             First Team ");
                System.out.println("                                             ########## ");
                System.out.print("Enter your School name :");
                String school3=inp.readLine();
                System.out.print("Enter your Name:");
                String a4=inp.readLine();
                System.out.println("                                             Second Team");
                System.out.println("                                             ########### ");
                System.out.print("Enter your School name :");
                String school4=inp.readLine();
                System.out.print("Enter your Name:");
                String a5=inp.readLine();
                System.out.println("========================================================================================================================");
                System.out.println("Press 'Enter' to start the game.");
                a1=inp.readLine();

                System.out.println("                        !~!~!~!~!~!~!Lets enter the Ist round of the game(Sports) !~!~!~!~!~!~!");
                System.out.println("                                    #############################################"); 
                System.out.println();
                System.out.println("______________________________________________________________________________________________________________");   
                System.out.println("                                           This question is for "+school3+":");
                System.out.println("______________________________________________________________________________________________________________");   
                System.out.println();
                System.out.println("Q1.Inwhat dice game does a shooter win if he rolls a 7 or 11 in his first roll?");   
                System.out.println("(1)Hazard");
                System.out.println("(2)Chuck-a-Luck");
                System.out.println("(3)Craps");
                System.out.println("(4)Roulette");
                System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==3)
                {
                score=score2+10;
                System.out.println("congratulations!!! you have gained " +score2+" points");
                System.out.println("---------------------------------------------");
                }
                else
                {
                score2=score2-5;
                System.out.println("Sorry your answer is incorrect");
                System.out.println("The correct answer is Craps");
                System.out.println("You are left with "+score2+" points");
                }
  
                System.out.println();
                System.out.println("______________________________________________________________________________________________________________");   
                System.out.println("                                           This question is for "+school4+":");
                System.out.println("______________________________________________________________________________________________________________");   
                System.out.println();
                System.out.println("Q2.Who among the following boxers claimed to 'float like a butterfly,sting like a bee'?");   
                System.out.println("(1)George Foreman");
                System.out.println("(2)Muhammad Ali");
                System.out.println("(3)Larry Holmes"); 
                System.out.println("(4)Evander Holyfield");
                System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==2)
                {
                score1=score1+10;
                System.out.println("congratulations!!! you have gained " +score1+" points");
                System.out.println("---------------------------------------------");
                }
                else
                {
                score1=score1-5;
                System.out.println("Sorry ! your answer is incorrect");
                System.out.println("The correct answer is Muhammad Ali");
                System.out.println("You are left with "+score1+" points");
                }
  
                System.out.println();
                System.out.println("                               -----------------------------------------");
                System.out.println("                               Your Total score after the first Round is :");
                System.out.println("                                  "+school3+" has "+score2+" points");
                System.out.println("                                  "+school4+" has "+score1+" points");
                System.out.println("                               -----------------------------------------");
                System.out.println();
                System.out.println("                        !~!~!~!~!~!~!Lets move to the 2nd round[Random Choice].!~!~!~!~!~!~!");
                System.out.println("                                    ##########################################");
                System.out.println();
                System.out.println("______________________________________________________________________________________________________________");   
                System.out.println("                                           This question is for "+school3+":");
                System.out.println("______________________________________________________________________________________________________________");   
                System.out.println();
                System.out.println("Q1.Which of the following sport is also called 'Angling'?");   
                System.out.println("(1)Yachting");
                System.out.println("(2)Fishing");
                System.out.println("(3)Canoeing");
                System.out.println("(4)Swimming");
                System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==2)
                {
                    score2=score2+10;
                    System.out.println("congratulations!!! you have gained " +score2+" points");
                    System.out.println("---------------------------------------------");
                    }
                    else
                    {
                        score2=score2-5;
                        System.out.println("Sorry ! Your answer is incorrect.");
                        System.out.println("The correct answer is Fishing");
                        System.out.println("You are left with "+score2+" points");
                        }
  
                 System.out.println();
                 System.out.println("______________________________________________________________________________________________________________");   
                 System.out.println("                                           This question is for "+school4+":");
                 System.out.println("______________________________________________________________________________________________________________");   
                 System.out.println();
                 System.out.println("Q2.What word is widely used to refer to small breeds of horses ?");   
                 System.out.println("(1)Donkey");
                 System.out.println("(2)Pony");
                 System.out.println("(3)Quarter Horse");
                 System.out.println("(4)Mule");
                 System.out.print("Answer. ");
                 a1=inp.readLine();
                 b1=Integer.parseInt(a1);
                 if(b1==2)
                 {
                     score1=score1+10;
                     System.out.println("congratulations!!! you have gained " +score1+" points");
                     System.out.println("---------------------------------------------");
                     }
                     else
                     {
                         score1=score1-5;
                         System.out.println("Sorry ! Your answer is incorrect.");
                         System.out.println("The correct answer is Pony");
                         System.out.println("You are left with "+score1+" points");
                         }
  
  
                System.out.println("                               -------------------------------------------");
                System.out.println("                               Your Total score after the Second Round is :");
                System.out.println("                                    "+school3+" has  "+score2+" points");
                System.out.println("                                    "+school4+" has  "+score1+" points");
                System.out.println("                               -------------------------------------------");
                System.out.println();
                System.out.println("                        !~!~!~!~!~!~!Lets move to the 3rd round[History]!~!~!~!~!~!~!");
                System.out.println("                                     ###################################");
                System.out.println();
                System.out.println("______________________________________________________________________________________________________________");   
                System.out.println("                                           This question is for "+school3+":");
                System.out.println("______________________________________________________________________________________________________________");   
                System.out.println();
                System.out.println("Q1.Which war was also known as the Great War?");   
                System.out.println("(1)World War I");
                System.out.println("(2)World War II");
                System.out.println("(3)American Revolution"); 
                System.out.println("(4)Sino-Russain War");
                System.out.print("Answer. ");
                a1=inp.readLine();
                b1=Integer.parseInt(a1);
                if(b1==1)
                {
                    score2=score2+10;
                    System.out.println("congratulations!!! you have gained " +score2+" points");
                    System.out.println("---------------------------------------------");
                    }
                    else
                    {
                        score2=score2-5;
                        System.out.println("Sorry ! Your answer is incorrect.");
                        System.out.println("The correct answer is World War I");
                        System.out.println("You are left with "+score2+" points");
                        }
  
                 System.out.println();
                 System.out.println("______________________________________________________________________________________________________________");   
                 System.out.println("                                           This question is for "+school4+":");
                 System.out.println("______________________________________________________________________________________________________________");   
                 System.out.println();
                 System.out.println("Q2.Which explorer led the first cicumnavigation of the world?");   
                 System.out.println("(1)Ferdinand Magellan");
                 System.out.println("(2)John Cabot");
                 System.out.println("(3)Vasco Da Gama");  
                 System.out.println("(4)Diogo Gomes");
                 System.out.print("Answer. ");
                 a1=inp.readLine();
                 b1=Integer.parseInt(a1);
                 if(b1==1)
                 {
                 score1=score1+10;
                 System.out.println("congratulations!!! you have gained " +score1+" points");
                 System.out.println("---------------------------------------------");
                 }
                 else
                 {
                     score1=score1-5;
                     System.out.println("Sorry ! Your answer is incorrect.");
                     System.out.println("The correct answer is Ferdinand Magellan");
                     System.out.println("You are left with "+score1+" points");
                     }
  
  
                 System.out.println("                                     ------------------------------------------");
                 System.out.println("                                    Your Total score after the Third Round is :");
                 System.out.println("                                          "+school3+" has  "+score2+" points");
                 System.out.println("                                          "+school4+" has  "+score1+" points");
                 System.out.println("                                     ------------------------------------------");
                 System.out.println();
                 System.out.println("                        !~!~!~!~!~!~!Lets move to the 4th round[Science]!~!~!~!~!~!~!");
                 System.out.println("                                     ###################################");
                 System.out.println();
                 System.out.println("______________________________________________________________________________________________________________");   
                 System.out.println("                                           This question is for "+school3+":");
                 System.out.println("______________________________________________________________________________________________________________");   
                 System.out.println();
                 System.out.println("Q7.What do giant Pandas eat?");
                 System.out.println("(1)Rubber Plants");
                 System.out.println("(2)Smaller Animals");
                 System.out.println("(3)Roots");
                 System.out.println("(4)Bamboo");
                 System.out.print("Answer. ");
                 a1=inp.readLine();
                 b1=Integer.parseInt(a1);
                 if(b1==4)
                 {
                 score2=score2+10;
                 System.out.println("congratulations!!! you have gained " +score2+" points");
                 System.out.println("---------------------------------------------");
                 }
                 else
                 {
                 score2=score2-5;
                 System.out.println("Sorry ! Your answer is incorrect.");
                 System.out.println("The correct answer is Bamboo");
                 System.out.println("You are left with "+score2+" points");
                 }
  
                 System.out.println();
                 System.out.println("______________________________________________________________________________________________________________");   
                 System.out.println("                                           This question is for "+school4+":");
                 System.out.println("______________________________________________________________________________________________________________");   
                 System.out.println();
                 System.out.println("Q2.The smallest bird in the world is of what type?");   
                 System.out.println("(1)Hummingbird");
                 System.out.println("(2)Kingfisher");
                 System.out.println("(3)Finch");        
                 System.out.println("(4)Sparrow");
                 System.out.print("Answer. ");
                 a1=inp.readLine();
                 b1=Integer.parseInt(a1);
                 if(b1==1)
                 {
                 score1=score1+10;
                 System.out.println("congratulations!!! you have gained " +score1+" points");
                 System.out.println("---------------------------------------------");
                 }
                 else
                 {
                 score1=score1-5;
                 System.out.println("Sorry ! Your answer is incorrect.");
                 System.out.println("The correct answer is Hummingbird");
                 System.out.println("You are left with "+score1+" points");
                 }
  
  
                 System.out.println("                                  -------------------------------------------");
                 System.out.println("                                 Your Total score after the Fourth Round is :");
                 System.out.println("                                       "+school3+" has  "+score2+" points");
                 System.out.println("                                       "+school4+" has  "+score1+" points");
                 System.out.println("                                  --------------------------------------------");
                 System.out.println();
                 System.out.println("                        !~!~!~!~!~!~!Lets move to the 5th round [Literature]!~!~!~!~!~!~!");
                 System.out.println("                                     #######################################");
                 System.out.println();
                 System.out.println("______________________________________________________________________________________________________________");   
                 System.out.println("                                           This question is for "+school3+":");
                 System.out.println("______________________________________________________________________________________________________________");   
                 System.out.println();
                 System.out.println("Q1.who wrote songs of innocence and somgs of experience?");
                 System.out.println("(1)William Wordsworth");
                 System.out.println("(2)Christopher Smart");
                 System.out.println("(3)William Blake");       
                 System.out.println("(4)William Ainsworth");
                 System.out.print("Answer. ");
                 a1=inp.readLine();
                 b1=Integer.parseInt(a1);
                 if(b1==3)
                 {
                     score2=score2+10;
                     System.out.println("congratulations!!! you have gained " +score2+" points");
                     System.out.println("---------------------------------------------");
                     }
                     else
                     {
                         score2=score2-5;
                         System.out.println("Sorry ! Your answer is incorrect.");
                         System.out.println("The correct answer is William Blake");
                         System.out.println("You are left with "+score2+" points");
                     }
  
                  System.out.println();
                  System.out.println("______________________________________________________________________________________________________________");   
                  System.out.println("                                           This question is for "+school4+":");
                  System.out.println("______________________________________________________________________________________________________________");   
                  System.out.println();
                  System.out.println("Q2.Who wrote the epic poem Paradise Lost?");   
                  System.out.println("(1)Alexander Pope");
                  System.out.println("(2)Geoffrey Chaucer");
                  System.out.println("(3)Edmund Spencer");   
                  System.out.println("(4)John Milton");
                  System.out.print("Answer. ");
                  a1=inp.readLine();
                  b1=Integer.parseInt(a1);
                  if(b1==4)
                  {
                  score1=score1+10;
                  System.out.println("congratulations!!! you have gained " +score1+" points");
                  System.out.println("---------------------------------------------");
                  }
                  else
                  {
                  score1=score1-5;
                  System.out.println("Sorry ! Your answer is incorrect.");
                  System.out.println("The correct answer is John Milton");
                  System.out.println("You are left with "+score1+" points");
                  }
  
                  System.out.println("                                        ------------------------------------------");
                  System.out.println("                                        Your Total score after the Fifth Round is :");
                  System.out.println("                                            "+school3+" has  "+score2+" points");
                  System.out.println("                                            "+school4+" has  "+score1+" points");
                  System.out.println("                                        ------------------------------------------");
                  System.out.println("                        !~!~!~!~!~!~!Lets move to the 6th round(Geography)!~!~!~!~!~!~!");
                  System.out.println("                                     #####################################");
                  System.out.println();
                  System.out.println("______________________________________________________________________________________________________________"); 
                  System.out.println("                                           This question is for "+school3+":");
                  System.out.println("______________________________________________________________________________________________________________"); 
                  System.out.println();
                  System.out.println("Q1.The islands of Honshu,Hokkaido,Kyushu and Shikoku form the main part of which country?");
                  System.out.println("(1)Phillippines");
                  System.out.println("(2)Japan");
                  System.out.println("(3)Indonesia");    
                  System.out.println("(4)Micronesia");
                  System.out.print("Answer. ");
                  a1=inp.readLine();
                  b1=Integer.parseInt(a1);
                  if(b1==2)
                  {
                  score2=score2+10;
                  System.out.println("congratulations!!! you have gained " +score2+" points");
                  System.out.println("---------------------------------------------");
                  }
                  else
                  {
                  score2=score2-5;
                  System.out.println("Sorry ! Your answer is incorrect.");
                  System.out.println("The correct answer is Japan");
                  System.out.println("You are left with "+score2+" points");
                  }
  
                  System.out.println();
                  System.out.println("______________________________________________________________________________________________________________"); 
                  System.out.println("                                           This question is for "+school4+":");
                  System.out.println("______________________________________________________________________________________________________________"); 
                  System.out.println();
                  System.out.println("Q2.What si the capital of Russia?");   
                  System.out.println("(1)Moscow");
                  System.out.println("(2)St.Petersburg");
                  System.out.println("(3)Omsk");     
                  System.out.println("(4)Volgograd");
                  System.out.print("Answer. ");
                  a1=inp.readLine();
                  b1=Integer.parseInt(a1);
                  if(b1==1)
                  {
                  score1=score1+10;
                  System.out.println("congratulations!!! you have gained " +score1+" points");
                  System.out.println("---------------------------------------------");
                  }
                  else
                  {
                  score1=score1-5;
                  System.out.println("Sorry ! Your answer is incorrect");
                  System.out.println("The correct answer is Moscow");
                  System.out.println("You are left with "+score1+" points");
                  }
                  System.out.println();
                  System.out.println("                                  --------------------------------------------");
                  System.out.println("                                 Your Total score after the first Round is :");
                  System.out.println("                                        "+school3+" has  "+score2+" points");
                  System.out.println("                                       "+school4+" has  "+score1+" points");
                  System.out.println("                                  --------------------------------------------");
                  if(score2>score1)
                  {
                System.out.println("                     ************Congrats!You Won The Inter School Quiz Contest**************");
                System.out.println();
                System.out.println("______________________________________________________________________________________________________________");    
                System.out.println("##############################################################################################################");
                System.out.println("##                                                                                                          ##");
                System.out.println("##                                                      BQC                                                 ##");
                System.out.println("##                                               www.allasiabqc.com                                         ##");
                System.out.println("##                 (If you are a quiz buff,you can find some real mind-benders at www.allasiabqc.com)       ##");
                System.out.println("##                                                                                                          ##");
                System.out.println("##                                            Certificate of Merit                                          ##");
                System.out.println("##                                                                                                          ##");
                System.out.print("##            This is to certify that Mr./Ms.");
                System.out.print(a4);
                System.out.println(" has won the Inter School Quiz Contest 2005                                                                 ##");
                System.out.println("##              held at Amitabh Bachchan Complex at Allahabad on November 14th,2005.                        ##");
                System.out.println("##                                                                                                          ##");
                System.out.println("## Bharat Puri                                                                       Derek O Brien          ##");
                System.out.println("## Director-Sales & Marketing                                                        Quiz Master            ##");
                System.out.println("## Cadbury India Limited                                                             Bournvita Quiz Contest ##");
                System.out.println("##                                                                                                          ##");
                System.out.println("##                                                Our Sponsors                                              ##");
                System.out.println("## Sun                                                                                Wipro                 ##");
                System.out.println("## Microsystems                                                                       Applying Thought      ##");
                System.out.println("## The Network is the Computer                                                                              ##");
                System.out.println("##                                                                                                          ##");  
                System.out.println("##############################################################################################################");
                System.out.println("______________________________________________________________________________________________________________");
                while(m==1)
                {
              System.out.println("______________________________________________________________________________________________________________");
              System.out.println("                                           Welcome to our 'BQC Winners Book'");
              System.out.println("______________________________________________________________________________________________________________");
              System.out.println("Press 1 to sign our Winners Book");
              System.out.println("Press 2 to read the name of our Former Champions");
              System.out.println("Press 0 to Continue Further");
              System.out.println("                                             Enter Your Choice:");
              choice6=inp.readLine();
              ch6=Integer.parseInt(choice6);
              System.out.println();
              switch(ch6)
               {
                case 1:
                c++;
                 System.out.println("______________________________________________________________________________________________________________");
                System.out.println("                                            Welcome to our 'BQC Winners Book'");
                 System.out.println("______________________________________________________________________________________________________________");
                System.out.println("Enter Your Name:");
                name2=inp.readLine();
                namet[c]=name2;
                System.out.println("Enter the current year:");
                year=inp.readLine();
                currentyear[c]=year;
                System.out.println("Enter Your School:");
                school1=inp.readLine();
                School[c]=school1;
                System.out.println("");
                System.out.println("                                        Thank you for signing our 'BQC Winners Book'"); 
                System.out.println("                                        ############################################");
                 System.out.println("______________________________________________________________________________________________________________");
                System.out.println("                                        Press Enter to Return to our'BQC Winners Book'");
                a1=inp.readLine();              
                break;
                
                case 2:
                System.out.println("______________________________________________________________________________________________________________");
                System.out.println("                                  Welcome to read the name of our Former Champions of BQC");
                System.out.println("______________________________________________________________________________________________________________");
                for(read=0;read<=c;read++)
                {     
                System.out.println("                                                   "+currentyear[read]);
                System.out.println("                                       "+School[read]);
                System.out.println("                                                 "+namet[read]); 
                  System.out.println("                                       #################################");                
                }
                System.out.println("Press Enter to Return to our 'BQC Winners Book'");
                s1=inp.readLine();                  
                break;
            
                case 0:
                m=-1;
                break;
                }}}
                
                else
                {
                System.out.println("                     ************Congrats!You Won The Inter School Quiz Contest**************");
                System.out.println();
                System.out.println("______________________________________________________________________________________________________________");    
                System.out.println("##############################################################################################################");
                System.out.println("##                                                                                                          ##");
                System.out.println("##                                                      BQC                                                 ##");
                System.out.println("##                                               www.allasiabqc.com                                         ##");
                System.out.println("##                 (If you are a quiz buff,you can find some real mind-benders at www.allasiabqc.com)       ##");
                System.out.println("##                                                                                                          ##");
                System.out.println("##                                            Certificate of Merit                                          ##");
                System.out.println("##                                                                                                          ##");
                System.out.print("##            This is to certify that Mr./Ms.");
                System.out.print(a5);
                System.out.println(" has won the Inter School Quiz Contest 2005                                                                 ##");
                System.out.println("##              held at Amitabh Bachchan Complex at Allahabad on November 14th,2005.                        ##");
                System.out.println("##                                                                                                          ##");
                System.out.println("## Bharat Puri                                                                       Derek O Brien          ##");
                System.out.println("## Director-Sales & Marketing                                                        Quiz Master            ##");
                System.out.println("## Cadbury India Limited                                                             Bournvita Quiz Contest ##");
                System.out.println("##                                                                                                          ##");
                System.out.println("##                                                Our Sponsors                                              ##");
                System.out.println("## Sun                                                                                Wipro                 ##");
                System.out.println("## Microsystems                                                                       Applying Thought      ##");
                System.out.println("## The Network is the Computer                                                                              ##");
                System.out.println("##                                                                                                          ##");  
                System.out.println("##############################################################################################################");
                System.out.println("______________________________________________________________________________________________________________");
                System.out.println();
                 while(m==1)
                {
             System.out.println("______________________________________________________________________________________________________________");
             System.out.println("                                           Welcome to our 'BQC Winners Book'");
             System.out.println("______________________________________________________________________________________________________________");
            System.out.println("Press 1 to sign our Winners Book");
            System.out.println("Press 2 to read the name of our Former Champions");
            System.out.println("Press 0 to Continue Further");
            System.out.println("                                             Enter Your Choice:");
            choice6=inp.readLine();
            ch6=Integer.parseInt(choice6);
            System.out.println();
            switch(ch6)
            {
                case 1:
                c++;
                 System.out.println("______________________________________________________________________________________________________________");
                System.out.println("                                            Welcome to our 'BQC Winners Book'");
                 System.out.println("______________________________________________________________________________________________________________");
                System.out.println("Enter Your Name:");
                name2=inp.readLine();
                namet[c]=name2;
                System.out.println("Enter the current year:");
                year=inp.readLine();
                currentyear[c]=year;
                System.out.println("Enter Your School:");
                school1=inp.readLine();
                School[c]=school1;
                System.out.println("");
                System.out.println("                                        Thank you for signing our 'BQC Winners Book'"); 
                System.out.println("                                        ############################################");
                 System.out.println("______________________________________________________________________________________________________________");
                System.out.println("                                        Press Enter to Return to our'BQC Winners Book'");
                s1=inp.readLine();              
                break;
                
                case 2:
                System.out.println("______________________________________________________________________________________________________________");
                System.out.println("                                  Welcome to read the name of our Former Champions of BQC");
                System.out.println("______________________________________________________________________________________________________________");
                for(read=0;read<=c;read++)
                {     
                System.out.println("                                                   "+currentyear[read]);
                System.out.println("                                       "+School[read]);
                System.out.println("                                                 "+namet[read]); 
                  System.out.println("                                       #################################");                
                }
                System.out.println("Press Enter to Return to our 'BQC Winners Book'");
                s1=inp.readLine();                  
                break;
            
                case 0:
                m=-1;
                break;
                }}}
                System.out.println("______________________________________________________________________________________________________________");
                
                System.out.println("    If you want to go back to the Main menu press '1' or else if you want to Stop here then press '0'");
                System.out.println("                                          Enter Your Choice");
                System.out.print("                                                   ");  
                a3=inp.readLine();
                b3=Integer.parseInt(a3);
                if(b3==1)
                {
                i=1;
                System.out.println("                                       Welcome back to the Main Menu");
                }
                else
                {
                i=0;
                System.out.print("                             Thank you ");
                System.out.print(                                 yname);
                System.out.println(" for playing the Bournvita Quiz Contest"); 
                System.out.println("                             %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
                System.out.println("______________________________________________________________________________________________________________");
                System.out.println("                                          Winner of the Viewer's Question");
                System.out.println("______________________________________________________________________________________________________________");
                for(read=1;read<=n;read++)
                {     
                System.out.println("                                            ############################");    
                System.out.println("                                            "+namet2[read]);
                System.out.println("                                            "+zone[read]);
                System.out.println("                                            "+school2[read]);
                System.out.println("                                            "+email[read]); 
                System.out.println("                                            ############################");    
                System.out.println("______________________________________________________________________________________________________________");
                }}
                break;
                
                case 3:
                System.out.println("            oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo");
                System.out.println("            oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo"); 
                System.out.println("            oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo");  
                System.out.println("            ooooooo#############ooooooooooooo################ooooooooooooooo##################oooooo");
                System.out.println("            ooooooo##oooooooooo##oooooooooo##oooooooooooooooo##oooooooooo##ooooooooooooooooooooooooo"); 
                System.out.println("            ooooooo##oooooooooo##oooooooooo##oooooooooooooooo##oooooooooo##ooooooooooooooooooooooooo"); 
                System.out.println("            ooooooo##oooooooooo##oooooooooo##oooooooooooooooo##oooooooooo##ooooooooooooooooooooooooo");
                System.out.println("            ooooooo##oooooooooo##oooooooooo##oooooooooooooooo##oooooooooo##ooooooooooooooooooooooooo");
                System.out.println("            ooooooo##oooooooooo##oooooooooo##oooooooooooooooo##oooooooooo##ooooooooooooooooooooooooo");
                System.out.println("            ooooooo############oooooooooooo##oooooooooooooooo##oooooooooo##ooooooooooooooooooooooooo");                                     
                System.out.println("            ooooooo##oooooooooo##oooooooooo##oooooooooo##oooo##oooooooooo##ooooooooooooooooooooooooo");
                System.out.println("            ooooooo##oooooooooo##oooooooooo##ooooooooooo##ooo##oooooooooo##ooooooooooooooooooooooooo");
                System.out.println("            ooooooo##oooooooooo##oooooooooo##ooooooooooooo##o##oooooooooo##ooooooooooooooooooooooooo");
                System.out.println("            ooooooo##oooooooooo##oooooooooo##ooooooooooooooo###oooooooooo##ooooooooooooooooooooooooo");
                System.out.println("            ooooooo############ooooooooooooo#################o#ooooooooooooo####################oooo");  
                System.out.println("            ooooooooooooooooooooooooooooooooooooooooooooooooooo##ooooooooooooooooooooooooooooooooooo");
                System.out.println("            oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo"); 
                System.out.println("            oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo");  
                System.out.println("            oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo"); 
                System.out.println("______________________________________________________________________________________________________________");    
                System.out.println("                                       Press 'Enter' to see the next logo");                                         
                String sop2=inp.readLine(); 
                System.out.println("______________________________________________________________________________________________________________");
                        
                System.out.println("            oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo");
                System.out.println("            oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo");
                System.out.println("            oooooooooooooooooooooooooooooooooooo############oooooooooooooooooooooooooooooooooooooo");
                System.out.println("            oooooooooooooooooooooooooooooooooo#################ooooooooooooooooooooooooooooooooooo");
                System.out.println("            oooooooooooooooooooooooooooooooo###################ooooooooooooooooooooooooooooooooooo");
                System.out.println("            ooooooooooooooooooooooooooooooo####################ooooooooooooooooooooooooooooooooooo");
                System.out.println("            oooooooooooooooooooooooooooooo##oooooooooooooo#####ooooooooooooooooooooooooooooooooooo");
                System.out.println("            oooooooooooooooooooooooooooooo##ooooooooooooooo####ooooooooooooooooooooooooooooooooooo");
                System.out.println("            ooooooooooooooooooooooooooooooo#oooooooooooooo###ooooooooooooooooooooooooooooooooooooo");
                System.out.println("            oooooooooooooooooooooooooooooooo#oooooooooooo##ooooooooooooooooooooooooooooooooooooooo");
                System.out.println("            oooooooooooooooooooooooooooooooooooooooooooo##oooooooooooooooooooooooooooooooooooooooo");
                System.out.println("            oooooooooooooooooooooooooooooooooooooooooo##oooooooooooooooooooooooooooooooooooooooooo");
                System.out.println("            oooooooooooooooooooooooooooooooooooooooooo##oooooooooooooooooooooooooooooooooooooooooo");
                System.out.println("            oooooooooooooooooooooooooooooooooooooooooo#ooooooooooooooooooooooooooooooooooooooooooo");
                System.out.println("            oooooooooooooooooooooooooooooooooooooooooo#ooooooooooooooooooooooooooooooooooooooooooo");
                System.out.println("            oooooooooooooooooooooooooooooooooooooooooo#ooooooooooooooooooooooooooooooooooooooooooo");
                System.out.println("            oooooooooooooooooooooooooooooooooooooooooo#ooooooooooooooooooooooooooooooooooooooooooo");
                System.out.println("            oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo");  
                System.out.println("            ooooooooooooooooooooooooooooooooooooooooo###oooooooooooooooooooooooooooooooooooooooooo");
                System.out.println("            oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo");
                System.out.println("            ooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo"); 
                System.out.println("______________________________________________________________________________________________________________");    
                System.out.println("                                       Press 'Enter' to see the next logo");                                         
                String so6=inp.readLine();          
                System.out.println("______________________________________________________________________________________________________________");                                            
                System.out.println("                   #############             ################               ##################");
                System.out.println("                   ##oooooooooo##          ##oooooooooooooooo##          ##ooooooooooooooooooo "); 
                System.out.println("                   ##oooooooooo##          ##oooooooooooooooo##          ##ooooooooooooooooooo"); 
                System.out.println("                   ##oooooooooo##          ##oooooooooooooooo##          ##ooooooooooooooooooo");
                System.out.println("                   ##oooooooooo##          ##oooooooooooooooo##          ##ooooooooooooooooooo");
                System.out.println("                   ##oooooooooo##          ##oooooooooooooooo##          ##ooooooooooooooooooo");
                System.out.println("                    ###########            ##oooooooooooooooo##          ##ooooooooooooooooooo");                                     
                System.out.println("                   ##oooooooooo##          ##oooooooooo##oooo##          ##ooooooooooooooooooo");
                System.out.println("                   ##oooooooooo##          ##ooooooooooo##ooo##          ##ooooooooooooooooooo");
                System.out.println("                   ##oooooooooo##          ##ooooooooooooo##o##          ##ooooooooooooooooooo");
                System.out.println("                   ##oooooooooo##          ##ooooooooooooooo###          ##ooooooooooooooooooo");
                System.out.println("                   #############             #################o#           ####################");  
                System.out.println("                                                                ##");     
                System.out.println("______________________________________________________________________________________________________________");    
                System.out.println("                                       Press 'Enter' to see the next logo");                                         
                String so2=inp.readLine();          
                System.out.println("______________________________________________________________________________________________________________");                                        
                System.out.println("                   #############             ################               ##################");
                System.out.println("                   ##          ##          ##                ##          ##                    "); 
                System.out.println("                   ##          ##          ##                ##          ##                    "); 
                System.out.println("                   ##          ##          ##                ##          ##                    ");
                System.out.println("                   ##          ##          ##                ##          ##                    ");
                System.out.println("                   ##          ##          ##                ##          ##                    ");
                System.out.println("                   #############           ##                ##          ##                    ");                                     
                System.out.println("                   ##          ##          ##          ##    ##          ##                    ");
                System.out.println("                   ##          ##          ##           ##   ##          ##                    ");
                System.out.println("                   ##          ##          ##             ## ##          ##                    ");
                System.out.println("                   ##          ##          ##               ###          ##                    ");
                System.out.println("                   #############             ###################           ####################");  
                System.out.println("                                                                ##");
                System.out.println("______________________________________________________________________________________________________________");    
                System.out.println("                                       Press 'Enter' to see the next logo");                                         
                String so3=inp.readLine();          
                System.out.println("______________________________________________________________________________________________________________");                                         
                System.out.println("                                                ############");
                System.out.println("                                              #################");
                System.out.println("                                            ###################");
                System.out.println("                                           ####################");
                System.out.println("                                          ##              #####");
                System.out.println("                                          ##               ####");
                System.out.println("                                           #              ###");
                System.out.println("                                            #            ##");
                System.out.println("                                                        ##");
                System.out.println("                                                       ##");
                System.out.println("                                                      ##");
                System.out.println("                                                      #");
                System.out.println("                                                      #");
                System.out.println("                                                      #");
                System.out.println("                                                      #");
                System.out.println();
                System.out.println("                                                     ###");
                System.out.println("______________________________________________________________________________________________________________");    
                System.out.println("                                       Press 'Enter' to see the next logo");                                         
                String so4=inp.readLine();          
                System.out.println("______________________________________________________________________________________________________________");                                            
                System.out.println("            oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo");
                System.out.println("            oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo");
                System.out.println("            oooooooooooooooooooooooooooooooooooo            oooooooooooooooooooooooooooooooooooooo");
                System.out.println("            oooooooooooooooooooooooooooooooooo                 ooooooooooooooooooooooooooooooooooo");
                System.out.println("            oooooooooooooooooooooooooooooooo                   ooooooooooooooooooooooooooooooooooo");
                System.out.println("            ooooooooooooooooooooooooooooooo                    ooooooooooooooooooooooooooooooooooo");
                System.out.println("            oooooooooooooooooooooooooooooo  oooooooooooooo     ooooooooooooooooooooooooooooooooooo");
                System.out.println("            oooooooooooooooooooooooooooooo  ooooooooooooooo    ooooooooooooooooooooooooooooooooooo");
                System.out.println("            ooooooooooooooooooooooooooooooo oooooooooooooo   ooooooooooooooooooooooooooooooooooooo");
                System.out.println("            oooooooooooooooooooooooooooooooo oooooooooooo  ooooooooooooooooooooooooooooooooooooooo");
                System.out.println("            oooooooooooooooooooooooooooooooooooooooooooo  oooooooooooooooooooooooooooooooooooooooo");
                System.out.println("            oooooooooooooooooooooooooooooooooooooooooo  oooooooooooooooooooooooooooooooooooooooooo");
                System.out.println("            oooooooooooooooooooooooooooooooooooooooooo  oooooooooooooooooooooooooooooooooooooooooo");
                System.out.println("            oooooooooooooooooooooooooooooooooooooooooo ooooooooooooooooooooooooooooooooooooooooooo");
                System.out.println("            oooooooooooooooooooooooooooooooooooooooooo ooooooooooooooooooooooooooooooooooooooooooo");
                System.out.println("            oooooooooooooooooooooooooooooooooooooooooo ooooooooooooooooooooooooooooooooooooooooooo");
                System.out.println("            oooooooooooooooooooooooooooooooooooooooooo ooooooooooooooooooooooooooooooooooooooooooo");
                System.out.println("            oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo");  
                System.out.println("            ooooooooooooooooooooooooooooooooooooooooo   oooooooooooooooooooooooooooooooooooooooooo");
                System.out.println("            oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo");
                System.out.println("            ooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo"); 
                System.out.println("______________________________________________________________________________________________________________");    
                System.out.println("                                       Press 'Enter' to see the next logo");                                         
                String so5=inp.readLine();          
                System.out.println("______________________________________________________________________________________________________________");                                            
                System.out.println("            oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo");
                System.out.println("            oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo"); 
                System.out.println("            oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo");  
                System.out.println("            ooooooo             ooooooooooooo                ooooooooooooooo                    oooo");
                System.out.println("            ooooooo  oooooooooo  oooooooooo  oooooooooooooooo  oooooooooo  ooooooooooooooooooooooooo"); 
                System.out.println("            ooooooo  oooooooooo  oooooooooo  oooooooooooooooo  oooooooooo  ooooooooooooooooooooooooo"); 
                System.out.println("            ooooooo  oooooooooo  oooooooooo  oooooooooooooooo  oooooooooo  ooooooooooooooooooooooooo");
                System.out.println("            ooooooo  oooooooooo  oooooooooo  oooooooooooooooo  oooooooooo  ooooooooooooooooooooooooo");
                System.out.println("            ooooooo  oooooooooo  oooooooooo  oooooooooooooooo  oooooooooo  ooooooooooooooooooooooooo");
                System.out.println("            ooooooo            oooooooooooo  oooooooooooooooo  oooooooooo  ooooooooooooooooooooooooo");                                     
                System.out.println("            ooooooo  oooooooooo  oooooooooo  oooooooooo  oooo  oooooooooo  ooooooooooooooooooooooooo");
                System.out.println("            ooooooo  oooooooooo  oooooooooo  ooooooooooo  ooo  oooooooooo  ooooooooooooooooooooooooo");
                System.out.println("            ooooooo  oooooooooo  oooooooooo  ooooooooooooo  o  oooooooooo  ooooooooooooooooooooooooo");
                System.out.println("            ooooooo  oooooooooo  oooooooooo  ooooooooooooooo   oooooooooo  ooooooooooooooooooooooooo");
                System.out.println("            ooooooo            ooooooooooooo                 o ooooooooooooo                    oooo");  
                System.out.println("            ooooooooooooooooooooooooooooooooooooooooooooooooooo  ooooooooooooooooooooooooooooooooooo");
                System.out.println("            oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo"); 
                System.out.println("            oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo");  
                System.out.println("            oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo"); 
                System.out.println("______________________________________________________________________________________________________________");    
                System.out.println("                                       Thank You for viewing our logos");                                         
                System.out.println();
                System.out.println("_______________________________________________________________________________________________________________");
                System.out.println("    If you want to go back to the Main menu press '1' or else if you want to Stop here then press '0'");
                System.out.println("                                          Enter Your Choice");
                System.out.print("                                                   ");  
                a3=inp.readLine();
                b3=Integer.parseInt(a3);
                if(b3==1)
                {
                i=1;
                 System.out.println("                                       Welcome back to the Main Menu");
                 }
                else
                {
                i=0;
                System.out.println("______________________________________________________________________________________________________________");
                System.out.println("                                          Winner of the Viewer's Question");
                System.out.println("______________________________________________________________________________________________________________");
                for(read=1;read<=n;read++)
                {     
                System.out.println("                                            ############################");    
                System.out.println("                                            "+namet2[read]);
                System.out.println("                                            "+zone[read]);
                System.out.println("                                            "+school2[read]);
                System.out.println("                                            "+email[read]); 
                System.out.println("                                            ############################");    
                System.out.println("______________________________________________________________________________________________________________");              
                }
                }
                break;
                
                case 4:
                System.out.println("______________________________________________________________________________________________________________");
                System.out.println("                                  Welcome to read the name of our Former Champions of BQC");
                System.out.println("______________________________________________________________________________________________________________");
                for(read=0;read<=c;read++)
                {     
                System.out.println("                                                   "+currentyear[read]);
                System.out.println("                                       "+School[read]);
                System.out.println("                                                 "+namet[read]); 
                System.out.println("                                       #################################");                
                }
                System.out.println("Press Enter to Return to Main Menu");
                s1=inp.readLine();                
                break;
                
                case 6:
                System.out.println("                        Thank You! " +yname+ " for playing the Bournvita Quiz Contest ");
                i=-1;
                System.out.println("______________________________________________________________________________________________________________");
                System.out.println("                                          Winner of the Viewer's Question");
                System.out.println("______________________________________________________________________________________________________________");
                for(read=1;read<=n;read++)
                {     
                System.out.println("                                            ############################");    
                System.out.println("                                            "+namet2[read]);
                System.out.println("                                            "+zone[read]);
                System.out.println("                                            "+school2[read]);
                System.out.println("                                            "+email[read]); 
                System.out.println("                                            ############################");    
                System.out.println("______________________________________________________________________________________________________________");              
                }
                break;
                
                case 5:
                System.out.println("______________________________________________________________________________________________________________");  
                System.out.println("                                    <><><><><><><><><><><><><><><><><><>");
                System.out.println("                                    Hi!Welcome to our 'Viewers Question'");
                System.out.println("                                    <><><><><><><><><><><><><><><><><><>");
                System.out.println("              You can directly participate in the BQC Contest by answering a simple Question");
                System.out.println("              ##############################################################################");
                System.out.println("                                                Here's your question");
                System.out.println("                                                %%%%%%%%%%%%%%%%%%%%");
                System.out.println("Which of these cricketers has scored the maximum number of centuries in one-day matches ?");
                System.out.println("1.) Garfield Sobers");
                System.out.println("2.) Sachin Tendulkar");
                System.out.println("3.) Allan Border");
                System.out.println("4.) Brian Lara");
                System.out.print("Answer. ");
                a1=inp.readLine();
                answer[n]=a1;
                b1=Integer.parseInt(answer[n]);
                if(b1==2)
                {
                System.out.println("Your Answer is correct");
                 System.out.println("______________________________________________________________________________________________________________");          
                System.out.println("                                            Please fill your details");
                System.out.println("                                           ##########################");
                System.out.println();
                System.out.println("Pleaes Enter Your Name:");
                name2=inp.readLine();
                namet2[n]=name2;
                System.out.println("Enter your Zone");
                String z=inp.readLine();
                zone[n]=z;
                System.out.println("Enter Your School");
                String s=inp.readLine();
                school2[n]=s;
                System.out.println("Enter Your E-mail Address");
                year=inp.readLine();
                email[n]=year;
                System.out.println("");
                System.out.println("                                        Thank you for filling the details"); 
                System.out.println("                                        #################################");
                System.out.println("                        You can see the Reults of the Viewers Question on Exiting the Program"); 
                System.out.println("                        #####################################################################");
                }   
                else
                {
                System.out.println("Sorry!your answer is incorrect");
                }
                System.out.println("______________________________________________________________________________________________________________");
                System.out.println("                                        Press Enter to Return to the Main Menu");
                s1=inp.readLine();
                break;
                
                default:
                System.out.println("                                                    Wrong Choice");
                System.out.println("                                          Please Enter Your Choice Again");
                break;
                }}}
          
                void certificate()
                {
                System.out.println("                     ************Congrats!You Qualified for the All Asia Finals**************");
                System.out.println();
                System.out.println("______________________________________________________________________________________________________________");    
                System.out.println("##############################################################################################################");
                System.out.println("##                                                                                                          ##");
                System.out.println("##                                                      BQC                                                 ##");
                System.out.println("##                                               www.allasiabqc.com                                         ##");
                System.out.println("##                 (If you are a quiz buff,you can find some real mind-benders at www.allasiabqc.com)       ##");
                System.out.println("##                                                                                                          ##");
                System.out.println("##                                            Certificate of Merit                                          ##");
                System.out.println("##                                                                                                          ##");
                System.out.print("##              This is to certify that Mr./Ms. ");
                System.out.print(yname);
                System.out.println(" has been qualified for the All-Asia finals                                                                 ##");                                                                                                                  
                System.out.println("##              in the Bournvita Quiz Contest 2005,in the middles group held at Amitabh Bachchan            ##");
                System.out.println("##              Complex at Allahabad on November 14th,2005.                                                 ##");
                System.out.println("##                                                                                                          ##");
                System.out.println("## Bharat Puri                                                                       Derek O Brien          ##");
                System.out.println("## Director-Sales & Marketing                                                        Quiz Master            ##");
                System.out.println("## Cadbury India Limited                                                             Bournvita Quiz Contest ##");
                System.out.println("##                                                                                                          ##");
                System.out.println("##                                                Our Sponsors                                              ##");
                System.out.println("## Sun                                                                                Wipro                 ##");
                System.out.println("## Microsystems                                                                       Applying Thought      ##");
                System.out.println("## The Network is the Computer                                                                              ##");
                System.out.println("##                                                                                                          ##");  
                System.out.println("##############################################################################################################");
                System.out.println("______________________________________________________________________________________________________________");
                }
                void timer()
                {
                System.out.println("                               ###################################");
                System.out.println("                               You started your speed round at  ");            
                Date d1=new Date();                                                           
                System.out.println("                                  "+d1);                       
                System.out.println("                               #################################### ");
                }
                void timer2()
                {
                System.out.println("                               #################################### ");    
                System.out.println("                               You completed your speed round at :");            
                Date d2=new Date();
                System.out.println("                                 "+d2);
                System.out.println("                               #################################### ");
                }}
                
               /**                            
                 *                          VARIABLE DECLARATION
                 *INTEGER VARIABLES
                 * i=1    ==> Used in while loop for returming to the main menu
                 * c=3    ==> Used as three names are stored in the array.To display those names using for loop
                 * n=1    ==> Used in for loop to display the name of winner of Viewers Question
                 * b=1    ==> Used to convert answer in Integer form
                 * a=2    ==> Used to read the choice inputted by the user for seeing the details of finals
                 * b=3    ==> Used for conerting the String value into Integer Form
                 * m=1    ==> Used in While loop to display the Winners Book
                 * ch6    ==> Used to convert the String Value in Integer Form
                ____________________________________________________________________________________________
                 *STRING VARIABLES
                 *a=1     ==> For storing & reading the answer inputted by the user
                 *a=2     ==> For storing & reading the option inputted by the user to see the details of All-Asia finals
                 *a=3     ==> For storing & reading the option inputted by the user to return to the main menu
                 *choice6 ==> For storing & reading the choice inputted in the Winners Book
                 *name2   ==> For storing & reading the name inputted by the user
                 *year    ==> For storing & reading the year inputted by the user
                 *school1 ==> For storing & reading the school inputted by the user
                ____________________________________________________________________________________________
                *String Array Variables
                *namet       ==> Used for storing the name of the Former BQC Champions 
                *namet2      ==> Used for storing the name of the participant of Viewers Question
                *School      ==> used for storing the name of the school of the Former Champions
                *cuurentyear ==> Used for storing the year in which the participants paricipated 
                *zone        ==> Used for storing the zone of the participant of Viewers Question
                *answer      ==> Used for storing the answer of the participant of Viewers Question
                *school2     ==> Used for storing the school of the participant of Viewers Question
                *email       ==> Used for storing the email of the participant of Viewers Question
                ____________________________________________________________________________________________
                */