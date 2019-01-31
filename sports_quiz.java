import java.util.*;
public class sports_quiz
{
void main()
{
System.out.println("WELCOME TO THE SPORTS QUIZ - MASTER BLASTER QUIZ");
Scanner in=new Scanner(System.in);
System.out.println("Please enter your name");
String s=in.nextLine();
System.out.println("RULES FOR THE QUIZ");
System.out.println("1.There will be 15 questions asked ");
System.out.println("2.Each question carries 5 marks");
System.out.println("3.Four options will be provided for each");
System.out.println("4.One has to select one of the options by pressing one of the options 1,2,3 or 4 ");
System.out.println("5.It is compulsory to answer each question");
System.out.println("THE MASTER BLASTER QUIZ BEGINS NOW");
int n=0;
int ch=0;
System.out.println("QUESTION 1:");
System.out.println("Who won the 2010 FIFA Football World Cup ?");
System.out.println("Options :");
System.out.println("1.BRAZIL"+"\t"+"2.ITALY"+"\t"+"3.SPAIN"+"\t"+"4.GERMANY");
System.out.println("your choice:");
ch=in.nextInt();
switch(ch)
{
case 3:
System.out.println("correct");
n=n+5;
break;
default:
System.out.println("SORRY");
System.out.println("Correct answer is SPAIN");
}
System.out.println("QUESTION 2:");
System.out.println("Which is the most successful country at the FIFA Football World Cup?");
System.out.println("Options :");
System.out.println("1.BRAZIL"+"\t"+"2.GERMANY"+"\t"+"3.ITALY"+"\t"+"4.ARGENTINA");
System.out.println("your choice:");
ch=in.nextInt();
switch(ch)
{
case 1:
System.out.println("correct");
n=n+5;
break;
default:
System.out.println("SORRY");
System.out.println("Correct answer is BRAZIL");
}
System.out.println("QUESTION 3");
System.out.println("Which is the oldest football club in India?");
System.out.println("Options");
System.out.println("1.MOHUN BAGAN AC"+"\t"+"2.EAST BENGAL FC"+"\t"+"3.BENGALURU FC"+"\t"+"4.CHURCHILL BROTHERS");
System.out.println("your choice");
ch=in.nextInt();
switch(ch)
{
case 1:
System.out.println("correct");
n=n+5;
break;
default:
System.out.println("SORRY");
System.out.println("Correct answer is MOHUN BAGAN");
}
System.out.println("QUESTION 4");
System.out.println("How many hockey golds has India won at the Olympics?");
System.out.println("Options:");
System.out.println("1.SEVEN"+"\t"+"2.FOUR"+"\t"+"3.TWO"+"\t"+"4.EIGHT");
System.out.println("your choice");
ch=in.nextInt();
switch(ch)
{
case 4:
System.out.println("correct");
n=n+5;
break;
default:
System.out.println("SORRY");
System.out.println("Correct answer is EIGHT");
}
System.out.println("QUESTION 5");
System.out.println("In which year did India win its last Olympics gold in hockey under Mohd. Shahid?");
System.out.println("Options:");
System.out.println("1.1980"+"\t"+"2.1964"+"\t"+"3.1956"+"\t"+"4.1984");
System.out.println("your choice");
ch=in.nextInt();
switch(ch)
{
case 1:
System.out.println("correct");
n=n+5;
break;
default:
System.out.println("SORRY");
System.out.println("Correct answer is 1980");
}
System.out.println("QUESTION 6");
System.out.println("How many Olympic golds have been won by Usain Bolt?");
System.out.println("Options:");
System.out.println("1.TWO"+"\t"+"2.SIX"+"\t"+"3.NINE"+"\t"+"4.FIVE");
System.out.println("your choice");
ch=in.nextInt();
switch(ch)
{
case 3:
System.out.println("correct");
n=n+5;
break;
default:
System.out.println("SORRY");
System.out.println("Correct answer is NINE");
}
System.out.println("QUESTION 7");
System.out.println("Which person has won the maximum number of Olympic medals?");
System.out.println("Options:");
System.out.println("1.USAIN BOLT"+"\t"+"2.MICHAEL PHELPS"+"\t"+"3.JUSTIN GATLIN"+"\t"+"4.LIONEL MESSI");
System.out.println("your choice");
ch=in.nextInt();
switch(ch)
{
case 2:
System.out.println("correct");
n=n+5;
break;
default:
System.out.println("SORRY");
System.out.println("Correct answer is MICHAEL PHELPS");
}
System.out.println("QUESTION 8");
System.out.println("Who won the first medal for India at the Rio Olympics?");
System.out.println("Options:");
System.out.println("1.DIPA KARMAKAR"+"\t"+"2.PV SINDHU"+"\t"+"3.SAKSHI MALIK"+"\t"+"4.JITU RAI");
System.out.println("your choice");
ch=in.nextInt();
switch(ch)
{
case 3:
System.out.println("correct");
n=n+5;
break;
default:
System.out.println("SORRY");
System.out.println("Correct answer is SAKSHI MALIK");
}
System.out.println("QUESTION 9");
System.out.println("Which team India displace to become test no. 1 after beating New Zealand in Kolkata?");
System.out.println("Options:");
System.out.println("1.AUSTRALIA"+"\t"+"2.SOUTH AFRICA"+"\t"+"3.ENGLAND"+"\t"+"4.PAKISTAN");
System.out.println("your choice");
ch=in.nextInt();
switch(ch)
{
case 4:
System.out.println("correct");
n=n+5;
break;
default:
System.out.println("SORRY");
System.out.println("Correct answer is PAKISTAN");
}
System.out.println("QUESTION 10");
System.out.println("Who is the youngest player to 10,000 runs in test cricket?");
System.out.println("Options:");
System.out.println("1.ALAISTAR COOK"+"\t"+"2.SACHIN TENDULKAR"+"\t"+"3.RICKY PONTING"+"\t"+"4.BRIAN LARA");
System.out.println("your choice");
ch=in.nextInt();
switch(ch)
{
case 1:
System.out.println("correct");
n=n+5;
break;
default:
System.out.println("SORRY");
System.out.println("Correct answer is ALAISTAR COOK");
}
System.out.println("QUESTION 11");
System.out.println("Who was the first spinner to take 700 wickets in test cricket?");
System.out.println("Options:");
System.out.println("1.ANIL KUMBLE"+"\t"+"2.M MURALIDHARAN"+"\t"+"3.SHANE WARNE"+"\t"+"4.SAEED AJMAL");
System.out.println("your choice");
ch=in.nextInt();
switch(ch)
{
case 3:
System.out.println("correct");
n=n+5;
break;
default:
System.out.println("SORRY");
System.out.println("Correct answer is SHANE WARNE");
}
System.out.println("QUESTION 12");
System.out.println("Who won the Golde Boot in FIFA World Cup in Brazil, 2014?");
System.out.println("Options:");
System.out.println("1.THOMAS MUELLER"+"\t"+"2.LIONEL MESSI"+"\t"+"3.NEYMAR JR."+"\t"+"4.JAMES RODRIGUEZ");
System.out.println("your choice");
ch=in.nextInt();
switch(ch)
{
case 4:
System.out.println("correct");
n=n+5;
break;
default:
System.out.println("SORRY");
System.out.println("Correct answer is JAMES RODRIGUEZ");
}
System.out.println("QUESTION 13");
System.out.println("Which team did India beat in the final to win the cricket world cup in 1983?");
System.out.println("Options:");
System.out.println("1.PAKISTAN"+"\t"+"2.WEST INDIES"+"\t"+"3.AUSTRALIA"+"\t"+"4.ENGLAND");
System.out.println("your choice");
ch=in.nextInt();
switch(ch)
{
case 2:
System.out.println("correct");
n=n+5;
break;
default:
System.out.println("SORRY");
System.out.println("Correct answer is WEST INDIES");
}
System.out.println("QUESTION 14");
System.out.println("Which Pakistani bowler made debut in the same match with Sachin Tendulkar of India?");
System.out.println("Options:");
System.out.println("1.WAQAR YOUNIS"+"\t"+"2.WASIM AKRAM"+"\t"+"3.IMRAN KHAN"+"\t"+"4.SHOAIB AKHTAR");
System.out.println("your choice");
ch=in.nextInt();
switch(ch)
{
case 1:
System.out.println("correct");
n=n+5;
break;
default:
System.out.println("SORRY");
System.out.println("Correct answer is WAQAR YOUNIS");

}
System.out.println("QUESTION 15");
System.out.println("Who has won the badminton world championship twice ?");
System.out.println("Options:");
System.out.println("1.PV SINDHU"+"\t"+"2.CAROLINA MARIN"+"\t"+"3.SUN YU"+"\t"+"4.SAINA NEHWAL");
System.out.println("your choice");
ch=in.nextInt();
switch(ch)
{
case 2:
System.out.println("correct");
n=n+5;
break;
default:
System.out.println("SORRY");
System.out.println("Correct answer is CAROLINA MARIN");
}
double p=(double)n/75*100;
System.out.println("YOUR SCORE="+p+"%");
System.out.println("THANK YOU");
}
}



