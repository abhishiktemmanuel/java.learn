import java.io.*;
class KBC2
{
public static void main(String args[])throws IOException
{
BufferedReader cd=new BufferedReader(new InputStreamReader(System.in));

    System.out.println(" *                  *  *********** *                * * *       ***       *         *  ***********");
    System.out.println("  *                *   *           *              *           *     *     *  *    * *  *          ");                
    System.out.println("   *              *    *           *            *            *       *    *   *  *  *  *          ");   
    System.out.println("    *            *     *           *            *           *         *   *    **   *  *          "); 
    System.out.println("     *          *      *******     *            *           *         *   *         *  *******    ");  
    System.out.println("      *   **  *       *           *            *            *       *    *         *  *          ");   
    System.out.println("       * *  * *        *           *             *            *     *     *         *  *          ");   
    System.out.println("        *    *         *********** ***********     * * *        ***       *         *  ***********"); 
System.out.println("Welcome to 'KAUN BANEGA CROREPATI 2'");
System.out.println("What is your name");
String name =cd.readLine();
System.out.println("So lets us start the game with our Contstent"      +name);
System.out.println("Lets start the game");
System.out.println();
System.out.println();

System.out.println("Enter 1 to enter   'KAUN BANEGA CROREPATI 2'               ");

System.out.println();


int q,ans,ans2,a2,a3,a4,a5,a6,money=0,no=1,quit,a,correct,abc=1,av=1,flip=1;


int q1=1000;
int q2=3000;
int q3=5000;
int q4=10000;
int q5=20000;
int q6=40000;
int q7=80000;
int q8=160000;
int q9=320000;
int q10=640000;
int q11=1250000;
int q12=2500000;
int q13=5000000;
int q14=10000000;
int q15=20000000;


BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
a=Integer.parseInt(br.readLine());

System.out.println("press 0 to take help of your life lines");
System.out.println();


switch(a)
{
case 1:


System.out.println("Q1. What is the other name for anti-freeze?            ");
System.out.println("(1) Ethylene glycol                                                       (2) methanol");
System.out.println("(3) di-ethyl                                                              (4) ethnol");

correct=1;
ans=Integer.parseInt(br.readLine());
if(ans==0)
{
System.out.println("1. 50-50      ");     
System.out.println("2. Audiance vote  ");
System.out.println("3. Flip");

System.out.println();
ans2=Integer.parseInt(br.readLine());

switch(ans2)
{
case 1:
if(abc==1)
{
System.out.println("Computer please erase two wrong answers");
System.out.println("So your options are ");
System.out.println();
System.out.println("(1) Ethylene glycol                                               (2) ");
System.out.println("(3) di-ethyl                                                              (4) ");                                           
abc=0;
ans=Integer.parseInt(br.readLine());
break;
}
else
System.out.println("You Can Not use Your Lifeline twice ");
ans=Integer.parseInt(br.readLine());
break;

case 2:
if(av==1)
{
System.out.println("So audiance please vote for your contestent ");
System.out.println("(1) 05%                                                              (2) 45");
System.out.println("(3) 25%                                                              (4) 25");
av=0;
ans=Integer.parseInt(br.readLine());
}
else
System.out.println("You Can Not use Your Lifeline twice ");
ans=Integer.parseInt(br.readLine());
break;

case 3:
break;

default :
}}


if(ans==correct)
{
money=q1;
System.out.println("That is the write answer");
System.out.println("Total Money you WON =RS "+money);
}
if(ans==5)
{
money=0;
System.out.println("So you want to quit");
System.out.println("Write answer is ("+correct+")Ethylene glycol ");
System.out.println("Thank you for being on the show with us");
System.out.println("Amount you won =Rs"+money);
break;
}
if(ans!=correct)
{
money=0;
System.out.println("Sorry it's the wrong answer");
System.out.println("Write answer is ("+correct+")Ethylene glycol "); 
System.out.println("Better try your luck next time");
System.out.println("Thank you for being on the show with us");
System.out.println("Amount you won =Rs"+money);
break;
}
System.out.println();
System.out.println();









System.out.println("Q2. Which gas is used in chemical warfare?");
System.out.println("(1) mustard gas                                                  (2)  ethane ");
System.out.println("(3) chlorine gas                                                 (4)methane");

correct=1;
ans=Integer.parseInt(br.readLine());
if(ans==0)
{
System.out.println("1. 50-50      ");     
System.out.println("2. Audiance vote  ");
System.out.println("3. Flip");

System.out.println();
ans2=Integer.parseInt(br.readLine());

switch(ans2)
{
case 1:
if(abc==1)
{
System.out.println("Computer please erase two wrong answers");
System.out.println("So your options are ");
System.out.println();
System.out.println("(1) mustard gas                                                                (2) ");
System.out.println("(3) chlorine gas                                                   (4) ");                                           
abc=0;
ans=Integer.parseInt(br.readLine());
break;
}
else
System.out.println("You Can Not use Your Lifeline twice ");
ans=Integer.parseInt(br.readLine());
break;

case 2:
if(av==1)
{
System.out.println("So audiance please vote for your contestent ");
System.out.println("(1) 05%                                                              (2) 05");
System.out.println("(3) 25%                                                              (4) 65");
av=0;
ans=Integer.parseInt(br.readLine());
break;
}
else
System.out.println("You Can Not use Your Lifeline twice ");
ans=Integer.parseInt(br.readLine());
break;

case 3:
break;

default :
}}

if(ans==correct)
{
money=q2;
System.out.println("That is the write answer");
System.out.println("Total Money you WON =RS "+money);
}
if(ans==5)
{
money=0;
System.out.println("So you want to quit");
System.out.println("Write answer is ("+correct+")mustard gas  "); 
System.out.println("Thank you for being on the show with us");
System.out.println("Amount you won =Rs"+money);
break;
}
if(ans!=correct)
{
money=0;
System.out.println("Sorry it's the wrong answer");
System.out.println("Write answer is ("+correct+")mustard gas "); 
System.out.println("Better try your luck next time");
System.out.println("Thank you for being on the show with us");
System.out.println("Amount you won =Rs"+money);
break;
}
System.out.println();
System.out.println();














System.out.println("Q.3 When did second world come to an end ?");
System.out.println("(1) 1945                                                 (2)1914");
System.out.println("(3) 1939                                                 (4)1918");

correct=1;
ans=Integer.parseInt(br.readLine());
if(ans==0)
{
System.out.println("1. 50-50      ");     
System.out.println("2. Audiance vote  ");
System.out.println("3. Flip");

System.out.println();
ans2=Integer.parseInt(br.readLine());

switch(ans2)
{
case 1:
if(abc==1)
{
System.out.println("Computer please erase two wrong answers");
System.out.println("So your options are ");
System.out.println();
System.out.println("(1) 1945                                                          (2) ");
System.out.println("(3) 1939                                                          (4) ");                                           
abc=0;
ans=Integer.parseInt(br.readLine());
break;
}
else
System.out.println("You Can Not use Your Lifeline twice ");
ans=Integer.parseInt(br.readLine());
break;


case 2:
if(av==1)
{
System.out.println("So audiance please vote for your contestent ");
System.out.println("(1) 65%                                                              (2) 05");
System.out.println("(3) 25%                                                              (4) 05");
av=0;
ans=Integer.parseInt(br.readLine());
break;
}
else
System.out.println("You Can Not use Your Lifeline twice ");
ans=Integer.parseInt(br.readLine());
break;


case 3:
break;

default :
}}

if(ans==correct)
{
money=q3;
System.out.println("That is the write answer");
System.out.println("Total Money you WON =RS "+money);
}
if(ans==5)
{
money=0;
System.out.println("So you want to quit");
System.out.println("Write answer is ("+correct+")1945 "); 
System.out.println("Thank you for being on the show with us");
System.out.println("Amount you won =Rs"+money);
break;
}
if(ans!=correct)
{
money=0;
System.out.println("Sorry it's the wrong answer");
System.out.println("Write answer is ("+correct+")1945 "); 
System.out.println("Better try your luck next time");
System.out.println("Thank you for being on the show with us");
System.out.println("Amount you won =Rs"+money);
break;
}
System.out.println();
System.out.println();







System.out.println("Q.4 In which year does the olympic held ?");
System.out.println("(1) 776bc                                 (2)333bc ");
System.out.println("(3) 772bc                                 (4) 534bc");

correct=1;
ans=Integer.parseInt(br.readLine());
if(ans==0)
{
System.out.println("1. 50-50      ");     
System.out.println("2. Audiance vote  ");
System.out.println("3. Flip");

System.out.println();
ans2=Integer.parseInt(br.readLine());

switch(ans2)
{
case 1:
if(abc==1)
{
System.out.println("Computer please erase two wrong answers");
System.out.println("So your options are ");
System.out.println();
System.out.println("(1) 776bc                                       (2) ");
System.out.println("(3) 772bc                                           (4) ");                                           
abc=0;
ans=Integer.parseInt(br.readLine());
break;
}
else
System.out.println("You Can Not use Your Lifeline twice ");
ans=Integer.parseInt(br.readLine());
break;


case 2:
if(av==1)
{
System.out.println("So audiance please vote for your contestent ");
System.out.println("(1) 00%                                                              (2) 05");
System.out.println("(3) 90%                                                              (4) 05");
av=0;
ans=Integer.parseInt(br.readLine());
break;
}
else
System.out.println("You Can Not use Your Lifeline twice ");
ans=Integer.parseInt(br.readLine());
break;


case 3:
break;

default :
}}

if(ans==correct)
{
money=q4;
System.out.println("That is the write answer");
System.out.println("Total Money you WON =RS "+money);
}
if(ans==5)
{
money=0;
System.out.println("So you want to quit");
System.out.println("Write answer is ("+correct+")776bc       "); 
System.out.println("Thank you for being on the show with us");
System.out.println("Amount you won =Rs"+money);
break;
}
if(ans!=correct)
{
money=0;
System.out.println("Sorry it's the wrong answer");
System.out.println("Write answer is ("+correct+")776bc       "); 
System.out.println("Better try your luck next time");
System.out.println("Thank you for being on the show with us");
System.out.println("Amount you won =Rs"+money);
break;
}
System.out.println();
System.out.println();









System.out.println("Q.5 who was the firstIndian grand master ?");
System.out.println("(1) viswanathan anand                                         (2)Anand amritraj");
System.out.println("(3) leander peas                                         (4) Mahesh bhupati ");

correct=1;
ans=Integer.parseInt(br.readLine());
if(ans==0)
{
System.out.println("1. 50-50      ");     
System.out.println("2. Audiance vote  ");
System.out.println("3. Flip");

System.out.println();
ans2=Integer.parseInt(br.readLine());

switch(ans2)
{
case 1:
if(abc==1)
{
System.out.println("Computer please erase two wrong answers");
System.out.println("So your options are ");
System.out.println();
System.out.println("(1) viswanathan anand                                                          (2) ");
System.out.println("(3)                                                               (4) Mahesh bhupati");    
abc=0;
ans=Integer.parseInt(br.readLine());
break;
}
else
System.out.println("You Can Not use Your Lifeline twice ");
ans=Integer.parseInt(br.readLine());
break;


case 2:
if(av==1)
{
System.out.println("So audiance please vote for your contestent ");
System.out.println("(1) 25%                                                              (2) 25");
System.out.println("(3) 30%                                                              (4) 20");
av=0;
ans=Integer.parseInt(br.readLine());
break;
}
else
System.out.println("You Can Not use Your Lifeline twice ");
ans=Integer.parseInt(br.readLine());
break;


case 3:
break;

default :
}}

if(ans==correct)
{
money=q5;
System.out.println("That is the write answer");
System.out.println("Congratulations ! You have cleared FIRST round");
System.out.println("you have played well to get this amount");
System.out.println("Amount you won in this round is Rs"+money);
}
if(ans==5)
{
money=0;
System.out.println("So you want to quit");
System.out.println("Write answer is ("+correct+")viswanathan anand  "); 
System.out.println("Thank you for being on the show with us");
System.out.println("Amount you won =Rs"+money);
break;
}
if(ans!=correct)
{
money=0;
System.out.println("Sorry it's the wrong answer");
System.out.println("Write answer is ("+correct+")viswanathan anand "); 
System.out.println("Better try your luck next time");
System.out.println("Thank you for being on the show with us");
System.out.println("Amount you won =Rs"+money);
break;
}
System.out.println();
System.out.println();









System.out.println("Q.6 who is the Flying fox  ?");
System.out.println("(1) red bat                                       (2)fox bat");
System.out.println("(3) silver fox                                    (4)bat");

correct=2;
ans=Integer.parseInt(br.readLine());
if(ans==0)
{
System.out.println("1. 50-50      ");     
System.out.println("2. Audiance vote  ");
System.out.println("3. Flip");

System.out.println();
ans2=Integer.parseInt(br.readLine());

switch(ans2)
{
case 1:
if(abc==1)
{
System.out.println("Computer please erase two wrong answers");
System.out.println("So your options are ");
System.out.println();
System.out.println("(1) red bat                                                       (2)fox bat ");
System.out.println("(3)                                                               (4) ");    
abc=0;
ans=Integer.parseInt(br.readLine());
break;
}
else
System.out.println("You Can Not use Your Lifeline twice ");
ans=Integer.parseInt(br.readLine());
break;


case 2:
if(av==1)
{
System.out.println("So audiance please vote for your contestent ");
System.out.println("(1) 65%                                                              (2) 25");
System.out.println("(3) 06%                                                              (4) 04");
av=0;
ans=Integer.parseInt(br.readLine());
break;
}
else
System.out.println("You Can Not use Your Lifeline twice ");
ans=Integer.parseInt(br.readLine());
break;


case 3:
if(flip==1)
{
System.out.println("Q. When was League of Nations formed ?");
System.out.println("(1) 1920                                                 (2)1914");
System.out.println("(3) 1921                                                 (4)1928");
correct=1;
ans=Integer.parseInt(br.readLine());
if(ans==0)
{
System.out.println("1. 50-50      ");     
System.out.println("2. Audiance vote  ");
System.out.println("3. Flip");

System.out.println();
ans2=Integer.parseInt(br.readLine());

switch(ans2)
{
case 1:
if(abc==1)
{
System.out.println("Computer please erase two wrong answers");
System.out.println("So your options are ");
System.out.println();
System.out.println("(1) 1920                                                          (2) ");
System.out.println("(3) 1921                                                          (4) ");    
abc=0;
ans=Integer.parseInt(br.readLine());
break;
}
else
System.out.println("You Can Not use Your Lifeline twice ");
ans=Integer.parseInt(br.readLine());
break;

case 2:
if(av==1)
{
System.out.println("So audiance please vote for your contestent ");
System.out.println("(1) 45%                                                              (2) 15%");
System.out.println("(3) 35%                                                              (4) 05%");
av=0;
ans=Integer.parseInt(br.readLine());
break;
}
else
System.out.println("You Can Not use Your Lifeline twice ");
ans=Integer.parseInt(br.readLine());
break;

default :
}
}

if(ans==correct)
{
money=q6;
System.out.println("That is the right answer ");
System.out.println("Total Money you won ="+money); 
}
if(ans==5)
{
money=640000;
System.out.println("So you want to quit");
System.out.println("Write answer is ("+correct+")1920 "); 
System.out.println("Thank you for being on the show with us");
System.out.println("Amount you won =Rs"+money);
break;
}
if(ans!=correct)
{
money=640000;
System.out.println("Sorry it's the wrong answer");
System.out.println("Write answer is ("+correct+")1920 "); 
System.out.println("Better try your luck next time");
System.out.println("Thank you for being on the show with us");
System.out.println("Amount you won =Rs"+money);
System.out.println();
System.out.println();

break;
}
flip=0;
}

if(flip!=1)
System.out.println("You Can Not use Your Lifeline twice ");
ans=Integer.parseInt(br.readLine());
break;


default :
ans=Integer.parseInt(br.readLine());
break;
}}

if(ans==correct)
{
money=q6;
System.out.println("That is the write answer");
System.out.println("Total Money you WON =RS "+money);
}
if(ans==5)
{
money=20000;
System.out.println("So you want to quit");
System.out.println("Write answer is ("+correct+")fox bat"); 
System.out.println("Thank you for being on the show with us");
System.out.println("Amount you won =Rs"+money);
break;
}
if(ans!=correct)
{
money=20000;
System.out.println("Sorry it's the wrong answer");
System.out.println("Write answer is ("+correct+")fox bat "); 
System.out.println("Better try your luck next time");
System.out.println("Thank you for being on the show with us");
System.out.println("Amount you won =Rs"+money);
break;
}
System.out.println();
System.out.println();









System.out.println("Q.7  ?");
System.out.println("(1) Aristotle                                          (2) Goldsmith");
System.out.println("(3) Shelley                                            (4) Tsetung");

correct=1;
ans=Integer.parseInt(br.readLine());
if(ans==0)
{
System.out.println("1. 50-50      ");     
System.out.println("2. Audiance vote  ");
System.out.println("3. Flip");

System.out.println();
ans2=Integer.parseInt(br.readLine());

switch(ans2)
{
case 1:
if(abc==1)
{
System.out.println("Computer please erase two wrong answers");
System.out.println("So your options are ");
System.out.println();
System.out.println("(1) Aristotle                                                     (2) Goldsmith");
System.out.println("(3)                                                               (4) ");    
abc=0;
ans=Integer.parseInt(br.readLine());
break;
}
else
System.out.println("You Can Not use Your Lifeline twice ");
ans=Integer.parseInt(br.readLine());
break;


case 2:
if(av==1)
{
System.out.println("So audiance please vote for your contestent ");
System.out.println("(1) 40%                                                              (2) 40%");
System.out.println("(3) 15%                                                              (4) 05%");
av=0;
ans=Integer.parseInt(br.readLine());
break;
}
else
System.out.println("You Can Not use Your Lifeline twice ");
ans=Integer.parseInt(br.readLine());
break;


case 3:
if(flip==1)
{
System.out.println("Q. When was League of Nations formed ?");
System.out.println("(1) 1920                                                 (2)1914");
System.out.println("(3) 1921                                                 (4)1928");
correct=1;
ans=Integer.parseInt(br.readLine());
if(ans==0)
{
System.out.println("1. 50-50      ");     
System.out.println("2. Audiance vote  ");
System.out.println("3. Flip");

System.out.println();
ans2=Integer.parseInt(br.readLine());

switch(ans2)
{
case 1:
if(abc==1)
{
System.out.println("Computer please erase two wrong answers");
System.out.println("So your options are ");
System.out.println();
System.out.println("(1) 1920                                                          (2) ");
System.out.println("(3) 1921                                                          (4) ");    
abc=0;
ans=Integer.parseInt(br.readLine());
break;
}
else
System.out.println("You Can Not use Your Lifeline twice ");
ans=Integer.parseInt(br.readLine());
break;

case 2:
if(av==1)
{
System.out.println("So audiance please vote for your contestent ");
System.out.println("(1) 45%                                                              (2) 15%");
System.out.println("(3) 35%                                                              (4) 05%");
av=0;
ans=Integer.parseInt(br.readLine());
break;
}
else
System.out.println("You Can Not use Your Lifeline twice ");
ans=Integer.parseInt(br.readLine());
break;

default :
ans=Integer.parseInt(br.readLine());
break;
}}

if(ans==correct)
{
money=q7;
System.out.println("That is the right answer ");
System.out.println("Total Money you won ="+money); 
}
if(ans==5)
{
money=640000;
System.out.println("So you want to quit");
System.out.println("Write answer is ("+correct+")1920 "); 
System.out.println("Thank you for being on the show with us");
System.out.println("Amount you won =Rs"+money);
break;
}
if(ans!=correct)
{
money=640000;
System.out.println("Sorry it's the wrong answer");
System.out.println("Write answer is ("+correct+")1920 "); 
System.out.println("Better try your luck next time");
System.out.println("Thank you for being on the show with us");
System.out.println("Amount you won =Rs"+money);
System.out.println();
System.out.println();
break;
}
flip=0;
}

else
System.out.println("You Can Not use Your Lifeline twice ");
ans=Integer.parseInt(br.readLine());
break;


default :
ans=Integer.parseInt(br.readLine());
break;
}}

if(ans==correct)
{
money=q7;
System.out.println("That is the write answer");
System.out.println("Total Money you WON =RS "+money);
}
if(ans==5)
{
money=20000;
System.out.println("So you want to quit");
System.out.println("Write answer is ("+correct+")Aristotle"); 
System.out.println("Thank you for being on the show with us");
System.out.println("Amount you won =Rs"+money);
break;
}
if(ans!=correct)
{
money=20000;
System.out.println("Sorry it's the wrong answer");
System.out.println("Write answer is ("+correct+")Aristotle "); 
System.out.println("Better try your luck next time");
System.out.println("Thank you for being on the show with us");
System.out.println("Amount you won =Rs"+money);
break;
}
System.out.println();
System.out.println();








System.out.println("Q.8 The cheif aircraft manufacturing establishment in India is in...?");
System.out.println("(1) Nasik                                              (2)Barrackpur");
System.out.println("(3) Bangalore                                          (4)Kanpur");

correct=3;
ans=Integer.parseInt(br.readLine());
if(ans==0)
{
System.out.println("1. 50-50      ");     
System.out.println("2. Audiance vote  ");
System.out.println("3. Flip");

System.out.println();
ans2=Integer.parseInt(br.readLine());

switch(ans2)
{
case 1:
if(abc==1)
{
System.out.println("Computer please erase two wrong answers");
System.out.println("So your options are ");
System.out.println();
System.out.println("(1) Nasik                                                         (2) ");
System.out.println("(3) Bangalore                                                     (4) ");    
abc=0;
ans=Integer.parseInt(br.readLine());
break;
}
else
System.out.println("You Can Not use Your Lifeline twice ");
ans=Integer.parseInt(br.readLine());
break;


case 2:
if(av==1)
{
System.out.println("So audiance please vote for your contestent ");
System.out.println("(1) 40%                                                              (2) 15%");
System.out.println("(3) 40%                                                              (4) 05%");
av=0;
ans=Integer.parseInt(br.readLine());
break;
}
else
System.out.println("You Can Not use Your Lifeline twice ");
ans=Integer.parseInt(br.readLine());
break;


case 3:
if(flip==1)
{
System.out.println("Q. When was League of Nations formed ?");
System.out.println("(1) 1920                                                 (2)1914");
System.out.println("(3) 1921                                                 (4)1928");
correct=1;
ans=Integer.parseInt(br.readLine());
if(ans==0)
{
System.out.println("1. 50-50      ");     
System.out.println("2. Audiance vote  ");
System.out.println("3. Flip");

System.out.println();
ans2=Integer.parseInt(br.readLine());

switch(ans2)
{
case 1:
if(abc==1)
{
System.out.println("Computer please erase two wrong answers");
System.out.println("So your options are ");
System.out.println();
System.out.println("(1) 1920                                                          (2) ");
System.out.println("(3) 1921                                                          (4) ");    
abc=0;
ans=Integer.parseInt(br.readLine());
break;
}
else
System.out.println("You Can Not use Your Lifeline twice ");
ans=Integer.parseInt(br.readLine());
break;

case 2:
if(av==1)
{
System.out.println("So audiance please vote for your contestent ");
System.out.println("(1) 45%                                                              (2) 15%");
System.out.println("(3) 35%                                                              (4) 05%");
av=0;
ans=Integer.parseInt(br.readLine());
break;
}
else
System.out.println("You Can Not use Your Lifeline twice ");
ans=Integer.parseInt(br.readLine());
break;

default :
ans=Integer.parseInt(br.readLine());
break;
}}

if(ans==correct)
{
money=q8;
System.out.println("That is the right answer ");
System.out.println("Total Money you won ="+money); 
}
if(ans==5)
{
money=640000;
System.out.println("So you want to quit");
System.out.println("Write answer is ("+correct+")1920 "); 
System.out.println("Thank you for being on the show with us");
System.out.println("Amount you won =Rs"+money);
break;
}
if(ans!=correct)
{
money=20000;
System.out.println("Sorry it's the wrong answer");
System.out.println("Write answer is ("+correct+")1920 "); 
System.out.println("Better try your luck next time");
System.out.println("Thank you for being on the show with us");
System.out.println("Amount you won =Rs"+money);
System.out.println();
System.out.println();

break;
}
flip=0;
}
else
System.out.println("You Can Not use Your Lifeline twice ");
ans=Integer.parseInt(br.readLine());
break;


default :
ans=Integer.parseInt(br.readLine());
break;
}}

if(ans==correct)
{
money=q8;
System.out.println("That is the write answer");
System.out.println("Total Money you WON =RS "+money);
}
if(ans==5)
{
money=20000;
System.out.println("So you want to quit");
System.out.println("Write answer is ("+correct+")Bangalore"); 
System.out.println("Thank you for being on the show with us");
System.out.println("Amount you won =Rs"+money);
break;
}
if(ans!=correct)
{
money=20000;
System.out.println("Sorry it's the wrong answer");
System.out.println("Write answer is ("+correct+")Bangalore "); 
System.out.println("Better try your luck next time");
System.out.println("Thank you for being on the show with us");
System.out.println("Amount you won =Rs"+money);
break;
}
System.out.println();
System.out.println();







System.out.println("Q.9 which of these is not an insect ?");
System.out.println("(1) Cockroach                                           (2) Moth");
System.out.println("(3) Mosquito                                            (4) Spider");

correct=4;
ans=Integer.parseInt(br.readLine());
if(ans==0)
{
System.out.println("1. 50-50      ");     
System.out.println("2. Audiance vote  ");
System.out.println("3. Flip");

System.out.println();
ans2=Integer.parseInt(br.readLine());

switch(ans2)
{
case 1:
if(abc==1)
{
System.out.println("Computer please erase two wrong answers");
System.out.println("So your options are ");
System.out.println();
System.out.println("(1)                                                               (2) Moth");
System.out.println("(3)                                                               (4) Spider");    
abc=0;
ans=Integer.parseInt(br.readLine());
break;
}
else
System.out.println("You Can Not use Your Lifeline twice ");
ans=Integer.parseInt(br.readLine());
break;


case 2:
if(av==1)
{
System.out.println("So audiance please vote for your contestent ");
System.out.println("(1) 20%                                                              (2) 25");
System.out.println("(3) 20%                                                              (4) 35");
av=0;
ans=Integer.parseInt(br.readLine());
break;
}
else
System.out.println("You Can Not use Your Lifeline twice ");
ans=Integer.parseInt(br.readLine());
break;


case 3:
if(flip==1)
{
System.out.println("Q. When was League of Nations formed ?");
System.out.println("(1) 1920                                                 (2)1914");
System.out.println("(3) 1921                                                 (4)1928");
correct=1;
ans=Integer.parseInt(br.readLine());
if(ans==0)
{
System.out.println("1. 50-50      ");     
System.out.println("2. Audiance vote  ");
System.out.println("3. Flip");

System.out.println();
ans2=Integer.parseInt(br.readLine());

switch(ans2)
{
case 1:
if(abc==1)
{
System.out.println("Computer please erase two wrong answers");
System.out.println("So your options are ");
System.out.println();
System.out.println("(1) 1920                                                          (2) ");
System.out.println("(3) 1921                                                          (4) ");    
abc=0;
ans=Integer.parseInt(br.readLine());
break;
}
else
System.out.println("You Can Not use Your Lifeline twice ");
ans=Integer.parseInt(br.readLine());
break;

case 2:
if(av==1)
{
System.out.println("So audiance please vote for your contestent ");
System.out.println("(1) 45%                                                              (2) 15%");
System.out.println("(3) 35%                                                              (4) 05%");
av=0;
ans=Integer.parseInt(br.readLine());
break;
}
else
System.out.println("You Can Not use Your Lifeline twice ");
ans=Integer.parseInt(br.readLine());
break;
default :
ans=Integer.parseInt(br.readLine());
break;
}}

if(ans==correct)
{
money=q9;
System.out.println("That is the right answer ");
System.out.println("Total Money you won ="+money); 
}
if(ans==5)
{
money=20000;
System.out.println("So you want to quit");
System.out.println("Write answer is ("+correct+")1920 "); 
System.out.println("Thank you for being on the show with us");
System.out.println("Amount you won =Rs"+money);
break;
}
if(ans!=correct)
{
money=640000;
System.out.println("Sorry it's the wrong answer");
System.out.println("Write answer is ("+correct+")1920 "); 
System.out.println("Better try your luck next time");
System.out.println("Thank you for being on the show with us");
System.out.println("Amount you won =Rs"+money);
System.out.println();
System.out.println();

break;
}
flip=0;
}
else
System.out.println("You Can Not use Your Lifeline twice ");
ans=Integer.parseInt(br.readLine());
break;


default :
}}

if(ans==correct)
{
money=q9;
System.out.println("That is the write answer");
System.out.println("Total Money you WON =RS "+money);
}
if(ans==5)
{
money=20000;
System.out.println("So you want to quit");
System.out.println("Write answer is ("+correct+")Spider"); 
System.out.println("Thank you for being on the show with us");
System.out.println("Amount you won =Rs"+money);
break;
}
if(ans!=correct)
{
money=20000;
System.out.println("Sorry it's the wrong answer");
System.out.println("Write answer is ("+correct+")Spider "); 
System.out.println("Better try your luck next time");
System.out.println("Thank you for being on the show with us");
System.out.println("Amount you won =Rs"+money);
break;
}
System.out.println();
System.out.println();











System.out.println("Q.10 Which state is know as Abode of god ?");
System.out.println("(1) Gujrat                                          (2) Assam ");
System.out.println("(3)  Haryana                                         (4) Kerala");

correct=3;
ans=Integer.parseInt(br.readLine());
if(ans==0)
{
System.out.println("1. 50-50      ");     
System.out.println("2. Audiance vote  ");
System.out.println("3. Flip");

System.out.println();
ans2=Integer.parseInt(br.readLine());

switch(ans2)
{
case 1:
if(abc==1)
{
System.out.println("Computer please erase two wrong answers");
System.out.println("So your options are ");
System.out.println();
System.out.println("(1) Gujrat                                                     (2) ");
System.out.println("(3) Haryana                                                              (4) ");    
abc=0;
ans=Integer.parseInt(br.readLine());
break;
}
else
System.out.println("You Can Not use Your Lifeline twice ");
ans=Integer.parseInt(br.readLine());
break;


case 2:
if(av==1)
{
System.out.println("So audiance please vote for your contestent ");
System.out.println("(1) 40%                                                              (2) 40%");
System.out.println("(3) 15%                                                              (4) 05%");
av=0;
ans=Integer.parseInt(br.readLine());
break;
}
else
System.out.println("You Can Not use Your Lifeline twice ");
ans=Integer.parseInt(br.readLine());
break;


case 3:
if(flip==1)
{
System.out.println("Q. When was League of Nations formed ?");
System.out.println("(1) 1920                                                 (2)1914");
System.out.println("(3) 1921                                                 (4)1928");
correct=1;
ans=Integer.parseInt(br.readLine());
if(ans==0)
{
System.out.println("1. 50-50      ");     
System.out.println("2. Audiance vote  ");
System.out.println("3. Flip");

System.out.println();
ans2=Integer.parseInt(br.readLine());

switch(ans2)
{
case 1:
if(abc==1)
{
System.out.println("Computer please erase two wrong answers");
System.out.println("So your options are ");
System.out.println();
System.out.println("(1) 1920                                                          (2) ");
System.out.println("(3) 1921                                                          (4) ");    
abc=0;
ans=Integer.parseInt(br.readLine());
break;
}
else
System.out.println("You Can Not use Your Lifeline twice ");
ans=Integer.parseInt(br.readLine());
break;

case 2:
if(av==1)
{
System.out.println("So audiance please vote for your contestent ");
System.out.println("(1) 45%                                                              (2) 15%");
System.out.println("(3) 35%                                                              (4) 05%");
av=0;
ans=Integer.parseInt(br.readLine());
break;
}
else
System.out.println("You Can Not use Your Lifeline twice ");
ans=Integer.parseInt(br.readLine());
break;
default :
ans=Integer.parseInt(br.readLine());
break;
}}

if(ans==correct)
{
money=q10;
System.out.println("That is the right answer ");
System.out.println("Total Money you won ="+money); 
}
if(ans==5)
{
money=20000;
System.out.println("So you want to quit");
System.out.println("Write answer is ("+correct+")1920 "); 
System.out.println("Thank you for being on the show with us");
System.out.println("Amount you won =Rs"+money);
break;
}
if(ans!=correct)
{
money=640000;
System.out.println("Sorry it's the wrong answer");
System.out.println("Write answer is ("+correct+")1920 "); 
System.out.println("Amount you won =Rs"+money);
System.out.println();
System.out.println();

break;
}
flip=0;
}
else
System.out.println("You Can Not use Your Lifeline twice ");
ans=Integer.parseInt(br.readLine());
break;


default :
ans=Integer.parseInt(br.readLine());
break;
}}

if(ans==correct)
{
money=q10;
System.out.println("That is the write answer");
System.out.println("Congratulations ! You have cleared SECOND round");
System.out.println("Total Money you WON =RS "+money);
}
if(ans==5)
{
money=20000;
System.out.println("So you want to quit");
System.out.println("Write answer is ("+correct+")Haryana "); 
System.out.println("Thank you for being on the show with us");
System.out.println("Amount you won =Rs"+money);
break;
}
if(ans!=correct)
{
money=20000;
System.out.println("Sorry it's the wrong answer");
System.out.println("Write answer is ("+correct+")Haryana  ");
System.out.println("Better try your luck next time");
System.out.println("Thank you for being on the show with us");
System.out.println("Amount you won =Rs"+money);
break;
}
System.out.println();
System.out.println();








System.out.println("Q.11 The term cue is associated with game?");
System.out.println("(1) Hockey                                         (2) Billiards");
System.out.println("(3) Fottball                                       (4) cricket");

correct=2;
ans=Integer.parseInt(br.readLine());
if(ans==0)
{
System.out.println("1. 50-50      ");     
System.out.println("2. Audiance vote  ");
System.out.println("3. Flip");

System.out.println();
ans2=Integer.parseInt(br.readLine());

switch(ans2)
{
case 1:
if(abc==1)
{
System.out.println("Computer please erase two wrong answers");
System.out.println("So your options are ");
System.out.println();
System.out.println("(1)                                                               (2) Billiards ");
System.out.println("(3)  Fottball                                                     (4) ");    
abc=0;
ans=Integer.parseInt(br.readLine());
break;
}
else
System.out.println("You Can Not use Your Lifeline twice ");
ans=Integer.parseInt(br.readLine());
break;


case 2:
if(av==1)
{
System.out.println("So audiance please vote for your contestent ");
System.out.println("(1) 10%                                                              (2) 40%");
System.out.println("(3) 45%                                                              (4) 05%");
av=0;
ans=Integer.parseInt(br.readLine());
break;
}
else
System.out.println("You Can Not use Your Lifeline twice ");
ans=Integer.parseInt(br.readLine());
break;


case 3:
if(flip==1)
{
System.out.println("Q.When was League of Nations formed ?");
System.out.println("(1) 1920                                                 (2)1914");
System.out.println("(3) 1921                                                 (4)1928");
correct=1;
ans=Integer.parseInt(br.readLine());
if(ans==0)
{
System.out.println("1. 50-50      ");     
System.out.println("2. Audiance vote  ");
System.out.println("3. Flip");

System.out.println();
ans2=Integer.parseInt(br.readLine());

switch(ans2)
{
case 1:
if(abc==1)
{
System.out.println("Computer please erase two wrong answers");
System.out.println("So your options are ");
System.out.println();
System.out.println("(1) 1920                                                          (2) ");
System.out.println("(3) 1921                                                          (4) ");    
abc=0;
ans=Integer.parseInt(br.readLine());
break;
}
else
System.out.println("You Can Not use Your Lifeline twice ");
ans=Integer.parseInt(br.readLine());
break;

case 2:
if(av==1)
{
System.out.println("So audiance please vote for your contestent ");
System.out.println("(1) 45%                                                              (2) 15%");
System.out.println("(3) 35%                                                              (4) 05%");
av=0;
ans=Integer.parseInt(br.readLine());
break;
}
else
System.out.println("You Can Not use Your Lifeline twice ");
ans=Integer.parseInt(br.readLine());
break;
default :
ans=Integer.parseInt(br.readLine());
break;
}}

if(ans==correct)
{
money=q11;
System.out.println("That is the right answer ");
System.out.println("Total Money you won ="+money); 
}
if(ans==5)
{
money=20000;
System.out.println("So you want to quit");
System.out.println("Write answer is ("+correct+")1920 "); 
System.out.println("Thank you for being on the show with us");
System.out.println("Amount you won =Rs"+money);
break;
}
if(ans!=correct)
{
money=640000;
System.out.println("Sorry it's the wrong answer");
System.out.println("Write answer is ("+correct+")1920 "); 
System.out.println("Better try your luck next time");
System.out.println("Thank you for being on the show with us");
System.out.println("Amount you won =Rs"+money);

System.out.println();
System.out.println();

break;
}
flip=0;
}
else
System.out.println("You Can Not use Your Lifeline twice ");
ans=Integer.parseInt(br.readLine());
break;


default :
ans=Integer.parseInt(br.readLine());
break;
}}

if(ans==correct)
{
money=q11;
System.out.println("That is the write answer");
System.out.println("Total Money you WON =RS "+money);
}
if(ans==5)
{
money=640000;
System.out.println("So you want to quit");
System.out.println("Write answer is ("+correct+")Billiards "); 
System.out.println("Thank you for being on the show with us");
System.out.println("Amount you won =Rs"+money);
break;
}
if(ans!=correct)
{
money=640000;
System.out.println("Sorry it's the wrong answer");
System.out.println("Write answer is ("+correct+")Billiards  ");
System.out.println("Better try your luck next time");
System.out.println("Thank you for being on the show with us");
System.out.println("Amount you won =Rs"+money);
break;
}
System.out.println();
System.out.println();










System.out.println("Q.12 Who was the husband of Rani Lakshmi of Jhani ?");
System.out.println("(1) Gangadhar                                   (2)Nawab of oudh ");
System.out.println("(3) Nizam of Hydrabed                             (4) Pehwa baji rao ");

correct=1;
ans=Integer.parseInt(br.readLine());
if(ans==0)
{
System.out.println("1. 50-50      ");     
System.out.println("2. Audiance vote  ");
System.out.println("3. Flip");

System.out.println();
ans2=Integer.parseInt(br.readLine());

switch(ans2)
{
case 1:
if(abc==1)
{
System.out.println("Computer please erase two wrong answers");
System.out.println("So your options are ");
System.out.println();
System.out.println("(1) Gangadhar                                             (2) ");
System.out.println("(3) Nizam of Hydrabed                                          (4) ");    
abc=0;
ans=Integer.parseInt(br.readLine());
break;
}
else
System.out.println("You Can Not use Your Lifeline twice ");
ans=Integer.parseInt(br.readLine());
break;


case 2:
if(av==1)
{
System.out.println("So audiance please vote for your contestent ");
System.out.println("(1) 40%                                                              (2) 10%");
System.out.println("(3) 45%                                                              (4) 05%");
av=0;
ans=Integer.parseInt(br.readLine());
break;
}
else
System.out.println("You Can Not use Your Lifeline twice ");
ans=Integer.parseInt(br.readLine());
break;


case 3:
if(flip==1)
{
System.out.println("Q. When was League of Nations formed ?");
System.out.println("(1) 1920                                                 (2)1914");
System.out.println("(3) 1921                                                 (4)1928");
correct=1;
ans=Integer.parseInt(br.readLine());
if(ans==0)
{
System.out.println("1. 50-50      ");     
System.out.println("2. Audiance vote  ");
System.out.println("3. Flip");

System.out.println();
ans2=Integer.parseInt(br.readLine());

switch(ans2)
{
case 1:
if(abc==1)
{
System.out.println("Computer please erase two wrong answers");
System.out.println("So your options are ");
System.out.println();
System.out.println("(1) 1920                                                          (2) ");
System.out.println("(3) 1921                                                          (4) ");    
abc=0;
ans=Integer.parseInt(br.readLine());
break;
}
else
System.out.println("You Can Not use Your Lifeline twice ");
ans=Integer.parseInt(br.readLine());
break;

case 2:
if(av==1)
{
System.out.println("So audiance please vote for your contestent ");
System.out.println("(1) 45%                                                              (2) 15%");
System.out.println("(3) 35%                                                              (4) 05%");
av=0;
ans=Integer.parseInt(br.readLine());
break;
}
else
System.out.println("You Can Not use Your Lifeline twice ");
ans=Integer.parseInt(br.readLine());
break;
default :
ans=Integer.parseInt(br.readLine());
break;
}}

if(ans==correct)
{
money=q12;
System.out.println("That is the right answer ");
System.out.println("Total Money you won ="+money); 
}
if(ans==5)
{
money=640000;
System.out.println("So you want to quit");
System.out.println("Write answer is ("+correct+")1920 "); 
System.out.println("Thank you for being on the show with us");
System.out.println("Amount you won =Rs"+money);
if(ans!=correct)
{
money=640000;
System.out.println("Sorry it's the wrong answer");
System.out.println("Write answer is ("+correct+")1920 "); 
System.out.println("Better try your luck next time");
System.out.println("Thank you for being on the show with us");
System.out.println("Amount you won =Rs"+money);
break;
}
System.out.println();
System.out.println();

break;
}
flip=0;
}
else
System.out.println("You Can Not use Your Lifeline twice ");
ans=Integer.parseInt(br.readLine());
break;


default :
ans=Integer.parseInt(br.readLine());
break;
}}

if(ans==correct)
{
money=q12;
System.out.println("That is the write answer");
System.out.println("Total Money you WON =RS "+money);
}
if(ans==5)
{
money=640000;
System.out.println("So you want to quit");
System.out.println("Write answer is ("+correct+")Gangadhar  "); 
System.out.println("Thank you for being on the show with us");
System.out.println("Amount you won =Rs"+money);
break;
}
if(ans!=correct)
{
money=640000;
System.out.println("Sorry it's the wrong answer");
System.out.println("Write answer is ("+correct+")Gangadhar  "); 
System.out.println("Better try your luck next time");
System.out.println("Thank you for being on the show with us");
System.out.println("Amount you won =Rs"+money);
break;
}
System.out.println();
System.out.println();










System.out.println("Q.13 Which of these is a water soluble vitamin ?");
System.out.println("(1) Vitamin A                                          (2) Vitamin B");
System.out.println("(3) Vitamin C                                          (4) Vitamin D");

correct=3;
ans=Integer.parseInt(br.readLine());
if(ans==0)
{
System.out.println("1. 50-50      ");     
System.out.println("2. Audiance vote  ");
System.out.println("3. Flip");

System.out.println();
ans2=Integer.parseInt(br.readLine());

switch(ans2)
{
case 1:
if(abc==1)
{
System.out.println("Computer please erase two wrong answers");
System.out.println("So your options are ");
System.out.println();
System.out.println("(1)                                                               (2) ");
System.out.println("(3) Vitamin C                                                     (4) Vitamin D");    
abc=0;
ans=Integer.parseInt(br.readLine());
break;
}
else
System.out.println("You Can Not use Your Lifeline twice ");
ans=Integer.parseInt(br.readLine());
break;


case 2:
if(av==1)
{
System.out.println("So audiance please vote for your contestent ");
System.out.println("(1) 40%                                                              (2) 10%");
System.out.println("(3) 45%                                                              (4) 05%");
av=0;
ans=Integer.parseInt(br.readLine());
break;
}
else
System.out.println("You Can Not use Your Lifeline twice ");
ans=Integer.parseInt(br.readLine());
break;


case 3:
if(flip==1)
{
System.out.println("Q. When was League of Nations formed ?");
System.out.println("(1) 1920                                                 (2)1914");
System.out.println("(3) 1921                                                 (4)1928");
correct=1;
ans=Integer.parseInt(br.readLine());
if(ans==0)
{
System.out.println("1. 50-50      ");     
System.out.println("2. Audiance vote  ");
System.out.println("3. Flip");

System.out.println();
ans2=Integer.parseInt(br.readLine());

switch(ans2)
{
case 1:
if(abc==1)
{
System.out.println("Computer please erase two wrong answers");
System.out.println("So your options are ");
System.out.println();
System.out.println("(1) 1920                                                          (2) ");
System.out.println("(3) 1921                                                          (4) ");    
abc=0;
ans=Integer.parseInt(br.readLine());
break;
}
else
System.out.println("You Can Not use Your Lifeline twice ");
ans=Integer.parseInt(br.readLine());
break;

case 2:
if(av==1)
{
System.out.println("So audiance please vote for your contestent ");
System.out.println("(1) 45%                                                              (2) 15%");
System.out.println("(3) 35%                                                              (4) 05%");
av=0;
ans=Integer.parseInt(br.readLine());
break;
}
else
System.out.println("You Can Not use Your Lifeline twice ");
ans=Integer.parseInt(br.readLine());
break;
default :
ans=Integer.parseInt(br.readLine());
break;
}}

if(ans==correct)
{
money=q13;
System.out.println("That is the right answer ");
System.out.println("Total Money you won ="+money); 
}
if(ans==5)
{
money=640000;
System.out.println("So you want to quit");
System.out.println("Write answer is ("+correct+")1920 "); 
System.out.println("Thank you for being on the show with us");
System.out.println("Amount you won =Rs"+money);
break;
}
if(ans!=correct)
{
money=640000;
System.out.println("Sorry it's the wrong answer");
System.out.println("Write answer is ("+correct+")1920 "); 
System.out.println("Better try your luck next time");
System.out.println("Thank you for being on the show with us");
System.out.println("Amount you won =Rs"+money);

System.out.println();
System.out.println();

break;
}
flip=0;
}
else
System.out.println("You Can Not use Your Lifeline twice ");
ans=Integer.parseInt(br.readLine());
break;


default :
ans=Integer.parseInt(br.readLine());
break;
}}

if(ans==correct)
{
money=q13;
System.out.println("That is the write answer");
System.out.println("Total Money you WON =RS "+money);
}
if(ans==5)
{
money=640000;
System.out.println("So you want to quit");
System.out.println("Write answer is ("+correct+")Vitamin C "); 
System.out.println("Thank you for being on the show with us");
System.out.println("Amount you won =Rs"+money);
break;
}
if(ans!=correct)
{
money=640000;
System.out.println("Sorry it's the wrong answer");
System.out.println("Write answer is ("+correct+")Vitamin C "); 
System.out.println("Better try your luck next time");
System.out.println("Thank you for being on the show with us");
System.out.println("Amount you won =Rs"+money);
break;
}
System.out.println();
System.out.println();









System.out.println("Q.14 What is the National Emblem of Japan ?");
System.out.println("(1) Shamrock                                           (2) Chrysanthemus");
System.out.println("(3) Cresent                                            (4) Kangaroo");;

correct=2;
ans=Integer.parseInt(br.readLine());
if(ans==0)
{
System.out.println("1. 50-50      ");     
System.out.println("2. Audiance vote  ");
System.out.println("3. Flip");

System.out.println();
ans2=Integer.parseInt(br.readLine());

switch(ans2)
{
case 1:
if(abc==1)
{
System.out.println("Computer please erase two wrong answers");
System.out.println("So your options are ");
System.out.println();
System.out.println("(1)                                                               (2) Chrysanthemus");
System.out.println("(3) Cresent                                                       (4) ");    
abc=0;
ans=Integer.parseInt(br.readLine());
break;
}
else
System.out.println("You Can Not use Your Lifeline twice ");
ans=Integer.parseInt(br.readLine());
break;


case 2:
if(av==1)
{
System.out.println("So audiance please vote for your contestent ");
System.out.println("(1) 25%                                                              (2) 35%");
System.out.println("(3) 35%                                                              (4) 05%");
av=0;
ans=Integer.parseInt(br.readLine());
break;
}
else
System.out.println("You Can Not use Your Lifeline twice ");
ans=Integer.parseInt(br.readLine());
break;

case 3:
if(flip==1)
{
System.out.println("Q. When was League of Nations formed ?");
System.out.println("(1) 1920                                                 (2)1914");
System.out.println("(3) 1921                                                 (4)1928");
correct=1;
ans=Integer.parseInt(br.readLine());
if(ans==0)
{
System.out.println("1. 50-50      ");     
System.out.println("2. Audiance vote  ");
System.out.println("3. Flip");

System.out.println();
ans2=Integer.parseInt(br.readLine());

switch(ans2)
{
case 1:
if(abc==1)
{
System.out.println("Computer please erase two wrong answers");
System.out.println("So your options are ");
System.out.println();
System.out.println("(1) 1920                                                          (2) ");
System.out.println("(3) 1921                                                          (4) ");    
abc=0;
ans=Integer.parseInt(br.readLine());
break;
}
else
System.out.println("You Can Not use Your Lifeline twice ");
ans=Integer.parseInt(br.readLine());
break;

case 2:
if(av==1)
{
System.out.println("So audiance please vote for your contestent ");
System.out.println("(1) 45%                                                              (2) 15%");
System.out.println("(3) 35%                                                              (4) 05%");
av=0;
ans=Integer.parseInt(br.readLine());
break;
}
else
System.out.println("You Can Not use Your Lifeline twice ");
ans=Integer.parseInt(br.readLine());
break;
default :
ans=Integer.parseInt(br.readLine());
break;
}}

if(ans==correct)
{
money=q14;
System.out.println("That is the right answer ");
System.out.println("Total Money you won ="+money); 
}
if(ans==5)
{
money=640000;
System.out.println("So you want to quit");
System.out.println("Write answer is ("+correct+")1920 "); 
System.out.println("Thank you for being on the show with us");
System.out.println("Amount you won =Rs"+money);
break;
}
if(ans!=correct)
{
money=640000;
System.out.println("Sorry it's the wrong answer");
System.out.println("Write answer is ("+correct+")1920 "); 
System.out.println("Better try your luck next time");
System.out.println("Thank you for being on the show with us");
System.out.println("Amount you won =Rs"+money);
System.out.println();
System.out.println();

break;
}
flip=0;
}
else
System.out.println("You Can Not use Your Lifeline twice ");
ans=Integer.parseInt(br.readLine());
break;


default :
ans=Integer.parseInt(br.readLine());
break;
}}

if(ans==correct)
{
money=q14;
System.out.println("That is the right answer ");
System.out.println("Total Money you won ="+money); 
}
if(ans==5)
{
money=640000;
System.out.println("So you want to quit");
System.out.println("Write answer is ("+correct+")Chrysanthemus "); 
System.out.println("Thank you for being on the show with us");
System.out.println("Amount you won =Rs"+money);
break;
}
if(ans!=correct)
{
money=640000;
System.out.println("Sorry it's the wrong answer");
System.out.println("Write answer is ("+correct+")Chrysanthemus "); 
System.out.println("Better try your luck next time");
System.out.println("Thank you for being on the show with us");
System.out.println("Amount you won =Rs"+money);
break;
}
System.out.println();
System.out.println();









System.out.println("Q.15 The major tribal group of Bihar is that of... ?");
System.out.println("(1) Todas                                              (2) Santhals");
System.out.println("(3) Bhils                                              (4) None of these");

correct=2;
ans=Integer.parseInt(br.readLine());
if(ans==0)
{
System.out.println("1. 50-50      ");     
System.out.println("2. Audiance vote  ");
System.out.println("3. Flip");

System.out.println();
ans2=Integer.parseInt(br.readLine());

switch(ans2)
{
case 1:
if(abc==1)
{
System.out.println("Computer please erase two wrong answers");
System.out.println("So your options are ");
System.out.println();
System.out.println("(1)                                                               (2) Santhals");
System.out.println("(3) Bhils                                                         (4) ");    
abc=0;
ans=Integer.parseInt(br.readLine());
break;
}
else
System.out.println("You Can Not use Your Lifeline twice ");
ans=Integer.parseInt(br.readLine());
break;

case 2:
if(av==1)
{
System.out.println("So audiance please vote for your contestent ");
System.out.println("(1) 25%                                                              (2) 35%");
System.out.println("(3) 35%                                                              (4) 05%");
av=0;
ans=Integer.parseInt(br.readLine());
break;
}
else
System.out.println("You Can Not use Your Lifeline twice ");
ans=Integer.parseInt(br.readLine());
break;

case 3:
if(flip==1)
{
System.out.println("Q. When was League of Nations formed ?");
System.out.println("(1) 1920                                                 (2)1914");
System.out.println("(3) 1921                                                 (4)1928");
correct=1;
ans=Integer.parseInt(br.readLine());
if(ans==0)
{
System.out.println("1. 50-50      ");     
System.out.println("2. Audiance vote  ");
System.out.println("3. Flip");

System.out.println();
ans2=Integer.parseInt(br.readLine());

switch(ans2)
{
case 1:
if(abc==1)
{
System.out.println("Computer please erase two wrong answers");
System.out.println("So your options are ");
System.out.println();
System.out.println("(1) 1920                                                          (2) ");
System.out.println("(3) 1921                                                          (4) ");    
abc=0;
ans=Integer.parseInt(br.readLine());
break;
}
else
System.out.println("You Can Not use Your Lifeline twice ");
ans=Integer.parseInt(br.readLine());
break;

case 2:
if(av==1)
{
System.out.println("So audiance please vote for your contestent ");
System.out.println("(1) 45%                                                              (2) 15%");
System.out.println("(3) 35%                                                              (4) 05%");
av=0;
ans=Integer.parseInt(br.readLine());
break;
}
else
System.out.println("You Can Not use Your Lifeline twice ");
ans=Integer.parseInt(br.readLine());
break;
default :
ans=Integer.parseInt(br.readLine());
break;
}}

if(ans==correct)
{
money=q15;
System.out.println("That is the right answer ");
System.out.println("Total Money you won ="+money); 
}
if(ans==5)
{
money=640000;
System.out.println("So you want to quit");
System.out.println("Write answer is ("+correct+")1920 "); 
System.out.println("Thank you for being on the show with us");
System.out.println("Amount you won =Rs"+money);
break;
}
if(ans!=correct)
{
money=640000;
System.out.println("Sorry it's the wrong answer");
System.out.println("Write answer is ("+correct+")1920 "); 
System.out.println("Better try your luck next time");
System.out.println("Thank you for being on the show with us");
System.out.println("Amount you won =Rs"+money);

System.out.println();
System.out.println();

break;
}
flip=0;
}
else
System.out.println("You Can Not use Your Lifeline twice ");
ans=Integer.parseInt(br.readLine());
break;


default :
ans=Integer.parseInt(br.readLine());
break;
}}

if(ans==correct)
{
money=q15;
System.out.println("YOU HAVE CREATED HISTORY THAT'S RIGHT");
System.out.println("you have work hard to win the dream prize");
System.out.println("YOU WIN TWO CRORE RUPEES ");
System.out.println("HERE'S YOUR TWO CRORE RUPEES CHECK ");
System.out.println("THANK YOU FOR BEING ON THE SHOW ");
System.out.println("AUDIENCE PLEASE GIVE A BIG HAND ");
}
if(ans==5)
{
money=640000;
System.out.println("So you want to quit");
System.out.println("Write answer is ("+correct+")Santhals "); 
System.out.println("Thank you for being on the show with us");
System.out.println("Amount you won =Rs"+money);
break;}
if(ans!=correct)
{
money=640000;
System.out.println("Sorry it's the wrong answer");
System.out.println("Write answer is ("+correct+")Santhals "); 
System.out.println("Better try your luck next time");
System.out.println("Thank you for being on the show with us");
System.out.println("Amount you won =Rs"+money);
break;
}
System.out.println();
System.out.println();
break;
}
}
}






























