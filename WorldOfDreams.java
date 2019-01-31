/**
 * Objective of program - 1. TO know about dreams,
 *                        2. know about six types of dreams,
 *                        3. Get your dream symbol interpretated,
 *                        4. Perform your Dream Interpretation Test,
 *                        5. Sleep Analysis
 *                        6. Visit our Guestbook
 *                        7. Acknowledgements
 * @author (Prathmesh Bharadwaj X-A
 *          Abhishikt Emmanuel Prakash X-C
 *          Kaivalya Gupta X-A) 
 */
import java.util.*;//to display date
import java.io.*;//to handle io excepception
public class WorldOfDreams //class WorldOfDreams
{  
    public static void main(String arg[])throws IOException //function main
    {
        BufferedReader menu = new BufferedReader(new InputStreamReader(System.in));//to input through terminal window
         System.out.println("                                        Welcome To The World Of Dreams");
         System.out.println("                                        %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
         Date date1=new Date();
         System.out.println("                                                                                   "+date1);//to print date
         System.out.println("Please Enter your Name");
         String username=menu.readLine();//to input user`s name in terminal window
         System.out.println("                             Hi!" +username +" Welcome To our Dream Interpreting Program ");
         System.out.println("                           ########################################################");
         System.out.println("                     You have now Entered a New Mysterious World of Dreams with us");
         System.out.println("                   Follow some Simple instruction & you`ll soon Discover the Mystery of your Dreams");
        int i=1;
        while(i==1)// loop for continuing Main Menu
        {
        //Main Menu    
        System.out.println("______________________________________________________________________________________________________________");    
        System.out.println("                                               Main Menu");
        System.out.println("1.What are Dreams");
        System.out.println("2.Types of Dreams");
        System.out.println("3.Dream Analysis Dictionary ");
        System.out.println("4.The Dream Interpretation test");
        System.out.println("5.Sleep Analysis");
        System.out.println("6.Visit our Guestbook");
        System.out.println("7.Acknowledgements");
        System.out.println("8.Exit");        
        System.out.println("______________________________________________________________________________________________________________");    
        System.out.println("                                            Enter Your Choice: ");
        String choice=menu.readLine();//to enter user`s choice in terminal window
        int ch=Integer.parseInt(choice);//To convert user`s choice from String to intger form
        System.out.println();
        String s1;        
        switch(ch)// to choose field on basis of choice in Main Menu
        {
            case 1:
            // displays the meaning of dreams
            System.out.println("                                             What are Dreams?");
            System.out.println("                                            ##################");
            System.out.println("Dreams are a communication of body, mind and spirit in a symbolic communicative environmental state of being");
            System.out.println("To a certain extent, we dream all the time. Even when we are awake! But the process is functioning in our ");
            System.out.println("subconscious mind, out of view from our window. If defined precisely, they may not be referred to as dreams");
            System.out.println("technically, but the activity is very closely related. During certain cycles of brain activity while asleep,");   
            System.out.println("we can view these dreams with our conscious mind and record them in our memory. (this is why we sometimes");
            System.out.println("remember them).");
            System.out.println("Well, with the above kept in mind (especially the order from chaos) try to imagine this.; Your brain mind");
            System.out.println("and spirit, while at rest review and analysis in it's own way long term, short term and spirit memory. It");
            System.out.println("kicks around emotions, thoughts, ideas, actions and interactions of the short term memory. It has in it's");
            System.out.println("background and the trends of your life to influence it. Your mind is also processing spiritual data, your");
            System.out.println("beliefs, whether or not you violated them, your information gained through psychic intuition and of course,");
            System.out.println("any communication from God. ALL this data, as well as your subconscious reading between the  of what people");
            System.out.println("do and tell you, is then processed unsupervised by you! All this data is a form of chaos, and your mind puts");
            System.out.println("it all together in a form of visual screenplay, a  medley of sight, sound,emotion and imagined interactivity.");
            System.out.println("This is a dream!");
            System.out.println("______________________________________________________________________________________________________________");
            System.out.println("Press Enter to go back to Main Menu");
            s1=menu.readLine();//To hold the pogram till user press Enter
            break;
            
            case 2:
            String s2; 
            int j=1;
            while(j==1)//loop to continue Types of dreams
            {
            System.out.println("______________________________________________________________________________________________________________");
            System.out.println("                                    There are six types of dreams :");
            System.out.println("1.Factual Dreams");
            System.out.println("2.Prophetic Dreams");
            System.out.println("3.Problem-Solving Dreams");
            System.out.println("4.Recurring Dreams");
            System.out.println("5.Nightmares");
            System.out.println("6.Lucid Dreams");
            System.out.println("press 0 to Return to Main Menu");
            System.out.println("______________________________________________________________________________________________________________");
            System.out.println("                                          Enter Your Choice: ");
            String choice2=menu.readLine();//to enter user`s choice in terminal window
            int ch2=Integer.parseInt(choice2);//To convert user`s choice from String to intger form
            System.out.println();
            switch(ch2)//to display type of dream according to user`s choice
            {
                case 1:
                System.out.println("Factual Dreams :");
                System.out.println("    Factual dreams simply record,finish off or replay some event that took place that day in the dremer`s ");   
                System.out.println("waking life,rather like holding up a photograph of a scene before sticking it into the great 'photogaph album'");
                System.out.println("of that person`s memory bank. ");
                System.out.println("    Another type of factual dream that can occur is really quite intriguing. Here,the dream weaves into a ");
                System.out.println("story, a sound or a smell that the dreamer picks up while he or she is still fast asleep.For example,a ");
                System.out.println("ringing doorbell might be woven into a dream of a wedding scene with ringing church bells.factual dreams");
                System.out.println("are sometimes also known as `residual`dreams, whereas those that weave in sounds and smells are called ");
                System.out.println("`vigilant` dreams.");                
                System.out.println("");
                System.out.println("Press Enter to go back to 'Types of Dreams'");
                s2=menu.readLine();//To hold the pogram till user press Enter
                break;
                
                case 2:
                System.out.println("Prophetic Dreams :");
                System.out.println("    Prophetic dreams, also referred to as precognitive dreams,are dreams that seemingly foretell the future.One");
                System.out.println("rational theory to explain this phenomenon is that our dreaming mind is able to piece out bits of information");
                System.out.println("and observation that we normally overlook or that we do not seriously consider. In other words,our unconscious");
                System.out.println("mind knows what is coming before we consciously piece together the same information.");               
                System.out.println("    Profetic Dreams are warning dreams. They show us events that will happen in the future.For example,you might");
                System.out.println("dream about a plane crash and when you wake up the next day, you hear the news of a jumbo jet crashing in the ");
                System.out.println("Atlantic Ocean and a massive rescue mission is under way to find the survivors");
                System.out.println("");         
                System.out.println("Press Enter to go back to 'Types of Dreams'");
                s2=menu.readLine();
                break;
                
                case 3:
                System.out.println("Problem-Solving Dreams :");
                System.out.println("    If you ever have a problem that you need to work out,whether it`s an emotional worry,a decision you");
                System.out.println("have to make,or a piece of homework you simply can`t understand, you should think about it justbefore");
                System.out.println("you fall asleep and quietly ask your subconscious to show you how to solve it in your dream that night.");
                System.out.println("If you`re lucky you`ll have what`s known as a `problem-solving dream`and when you wake up in the morning ");
                System.out.println("you`ll have the answer you need.Try it,With a bit of practice it can really achieve some starling results.");
                System.out.println(" Several inventors throughout history have admitted that some of their best inventions came into them");
                System.out.println("in a dream like this.");                
                System.out.println();  
                System.out.println("Press Enter to go back to 'Types of Dreams'");
                s2=menu.readLine();
                break;
                
                case 4:
                System.out.println("Recurring Dreams :");
                System.out.println("    Recurring dreams repeat themselves with little variation in story or theme. These dreams may be positive,");
                System.out.println("most often they are nightmares.Dreams may reccur because a conflict depicted in the dream remains unresolved");            
                System.out.println("and ignored. These dreams go on occuring   until the dreamer recongnizes the message and deals with it. Once");                 
                System.out.println(" you have found a resolution to the problem, your recurring dreams may cease.");
                System.out.println("");
                System.out.println("Press Enter to go back to 'Types of Dreams'");
                s2=menu.readLine();
                break;
                
                case 5:
                System.out.println("Nightmares :");
                System.out.println("A nightmare is a disturbing dream that causes the dreamer to wake up feeling anxious and frightened.Nightmares");
                System.out.println("may be a response to real life trauma and situations. These type of nightmares fall under a special category ");             
                System.out.println("called Post-traumatic stress nightmare(PSN). Nightmares may also occur because we have ignored or refused to ");
                System.out.println("accept a particular life situation.Research shows that most of the people who have regular nightmares have had");
                System.out.println("a family. history of psychiatric problems,bad drug experiences,people who have contemplated suicide,and rocky");
                System.out.println("relationships. Nightmares are an indication of a fear & worry that needs to be acknowledged and confronted. It");
                System.out.println("is a way for our subconscious to make up take notice-'Pay attention!'");
                System.out.println("");
                System.out.println("Press Enter to go back to 'Types of Dreams'");
                s2=menu.readLine();
                break;              
                
                case 6:
                System.out.println("Lucid Dreams :");
                System.out.println("Lucid dreams occurs when you realize you are dreaming in the middle of your dream.(Like-Wait a second. This is");
                System.out.println("only a dream!) Most dreamers wake themselves up once they realize that they are only dreaming. Other dreamers ");
                System.out.println("have cultivated the skill to remain in the lucid state of dreaming. They become an active participant in their");
                System.out.println("dream, make decisions in their dreams and influence the dream's outcome without awakening.");
                System.out.println("");  
                System.out.println("Press Enter to go back to 'Types of Dreams'");
                s2=menu.readLine();
                break;
                
                case 0:
                j=-1;//to exit from loop
                System.out.println();
                break;
                
                default:
                System.out.println("                                                Wrong Choice");
                System.out.println("                                        Enter Your Choice Again:");
            }}
            break;         
            
            case 3:
            int k=1,l=1;
            while(k==1)//loop to continue Dream Analysis Dictionary
            { 
            System.out.println("                                    Dream Analysis Dictionary:");           
            System.out.println("Select the range of your Dream Symbol :");
            System.out.println("Press 1 if your dream Symbol lies between A-C");
            System.out.println("Press 2 if your dream Symbol lies between D-G");
            System.out.println("Press 3 if your dream Symbol lies between H-L");
            System.out.println("Press 4 if your dream Symbol lies between M-P");
            System.out.println("Press 5 if your dream Symbol lies between Q-S");
            System.out.println("Press 6 if your dream Symbol lies between T-Z");
            System.out.println("(For Example,if you saw Treasure in your dream press 6)");
            System.out.println("Press 0 to Return to Main Menu");
            System.out.println("______________________________________________________________________________________________________________");
            System.out.println("                                        Enter Your Choice: ");
            String choice3=menu.readLine();
            int ch3=Integer.parseInt(choice3);            
            System.out.println();
            String choice5;
            int ch5;
            switch(ch3)
            {                
                case 1:
                l=1;
                while(l==1)//loop to continue
                {
                System.out.println("Select the Symbol you saw in your Dream :");
                System.out.println("1.Aliens");                
                System.out.println("2.Angel");
                System.out.println("3.Animals");
                System.out.println("4.Attack");
                System.out.println("5.Baby");
                System.out.println("6.Ball");
                System.out.println("7.Beach");
                System.out.println("8.Bed");
                System.out.println("9.Blood");
                System.out.println("10.Body or Body parts");
                System.out.println("11.Book");
                System.out.println("12.Burglary");
                System.out.println("13.Candle");
                System.out.println("14.Cave");
                System.out.println("15.Children");
                System.out.println("16.Climbing");
                System.out.println("17.Clothes");
                System.out.println("18.Computer ");
                System.out.println("19.Crowd");
                System.out.println("Press 0 to Return to 'Dream Analysis'");
                System.out.println("______________________________________________________________________________________________________________");
                System.out.println("                                      Enter your Choice");
                choice5=menu.readLine();
                ch5=Integer.parseInt(choice5);                
                System.out.println();
                switch(ch5)
                {
                   case 1:
                   System.out.println("Aliens:");
                   System.out.println("    There are currently so many films and books about extra terrestrials and and flyinf saucers that it is not");
                   System.out.println("surprising to learn that dreams about aliens are now are fairly common and simply replay in the sleeping mind");
                   System.out.println("what was seen on the television or at the cinema hall during the day .however,because aliens, and indeed all");
                   System.out.println("foreigners, are strange to us  and speak in a language we dont understand, dreaming about them suggest that");
                   System.out.println("we are confused or uncertain about some thing that is happening in our lives at the moment .For example,you");
                   System.out.println("might have this sort of dream when you move house and find yourself in a new neighbourhood or when you change");
                   System.out.println("schools and everything around you is diffirent and unfamiliar.");
                   System.out.println();
                   System.out.println("Press Enter to go back to 'Dream Symbol from A-Z'");
                   s1=menu.readLine();
                   break;
                   
                   case 2:
                   System.out.println("Angel:");
                   System.out.println("    Take a note of what an angel gives you or says to you in a dream because they act as messengers, bringing");
                   System.out.println("you important infaomation from deep inside your conscious, or else they tell you news of thing to come. Their");
                   System.out.println(" other role, of course, is that of protector or gaurdian angel. To see an angel in your dream,then,is telling");
                   System.out.println(" you that someone, or something , is protecting you in your waking life.");
                   System.out.println("");
                   System.out.println("Press Enter to go back to 'Dream Symbol from A-Z'");
                   s1=menu.readLine();
                   break;
                   
                   case 3:
                   System.out.println("Animals:");
                   System.out.println("    To see animals in your dream, represents your own physical characteristic, primitive desires, and sexual nature, ");
                   System.out.println("depending on the qualities of the particular animal. Animals symbolizes the untamed and uncivilized aspects of yourself.");
                   System.out.println("Thus, to dream that you are fighting with an animal signifies a hidden part of yourself that you are trying to reject");                 
                   System.out.println("and push back into your subconscious. Refer to the specific animal in your dream. To dream that animals can talk, ");
                   System.out.println("represents superior knowledge. Its message is often some form of wisdom. Alternatively, a talking animal denotes your ");
                   System.out.println("potential to be all that you can be.To dream that you are saving the life of an animal,suggests that you are successfully ");
                   System.out.println("acknowledging certain emotions and characteristics represented by the animal. The dream may also stem from feelings of . ");
                   System.out.println("inadequacy or being overwhelmed");
                   System.out.println("");
                   System.out.println("Press Enter to go back to 'Dream Symbol from A-Z'");
                   s1=menu.readLine();
                   break;
                   
                   case 4:
                   System.out.println("Attack:");
                   System.out.println("    To dream that you attack someone,indicates that your ill-mood and temper may cause harm to other.You are ");
                   System.out.println("releasing some pent-up frustration and anger.You feel that you have been wronged.Such feelings may be easier");
                   System.out.println("and safer for you to express in your dream. To dream that you are being attacked by someone, signifies ");                
                   System.out.println("questions on your character and the need for you to defend yourself. You are feeling stressed,vulnerable and ");
                   System.out.println("helpless.You may also be faced with difficult changed in your waking life.To dream that you are being attacked ");
                   System.out.println("by an animal, is a warning to be careful with those around you. Take notice on who you know in your waking like ");
                   System.out.println("that shares and exhibits the same qualities of the animal that attacked you in your dream.To dream that you kill  ");
                   System.out.println("an attacking animal, signifies that your life will be saved by a stranger.");
                   System.out.println("");
                   System.out.println("Press Enter to go back to 'Dream Symbol from A-Z'");
                   s1=menu.readLine();
                   break;
                   
                   case 5:
                   System.out.println("Baby:");
                   System.out.println("    Babies symbolize your ideas or your own potential gifts and talents. A baby can also represent a project");
                   System.out.println("that you want to work on and giving birth to a baby means you 're ready to start. If you great love for the");
                   System.out.println("baby then you are enjoying what you are doing. happy babies are usually a sign offeeling contentend secured.");
                   System.out.println("But if baby cries and annoys you,the dream is telling you that you`re frustated with what's going on in your");
                   System.out.println("walking life or that your project or idea is not woking out well. A tiny baby or one thats born prematurely ");
                   System.out.println("could be warning that your idea hasn't been thought through propely and that you need to spend more time on");                
                   System.out.println("it to get things right . This dream is telling you not to give up but that if you cocentrate on what you are");
                   System.out.println(" doing  you'll get good results. its also saying keep on going as you are, dont make any changes because the");
                   System.out.println("time isn't right to start anything new yet.However, if the baby grows and takes few steps, that's the signal");
                   System.out.println("for youto move on to something new.");
                   System.out.println("");
                   System.out.println("Press Enter to go back to 'Dream Symbol from A-Z'");
                   s1=menu.readLine();
                   break;
                   
                   case 6:
                   System.out.println("Ball:");
                   System.out.println("    To see or play with a ball in your dream, symbolizes completeness and wholeness. It may also indicate that you need to");
                   System.out.println("be more in tune with the inner child within. To dream that you are watching a ball game, indicates that you need to take ");
                   System.out.println("more of an initiative. Your lack of action may  stem from your shyness which you must overcome. Perhaps you are too over ");                
                   System.out.println("self-conscious.");
                   System.out.println("");
                   System.out.println("Press Enter to go back to 'Dream Symbol from A-Z'");
                   s1=menu.readLine();
                   break;
                   case 7:
                   System.out.println("Beach:");
                   System.out.println("    Most people have fun at the seaside,so dreaming about lazing or messing about on the beach is a reminder");
                   System.out.println("of fun and games. If you are sunbathing on the beach,your unconscious may be telling you it`s time to relax");
                   System.out.println("more,spend time on your hobbies or take up a new interest.If you`re wlking all alone on the beach without a");
                   System.out.println("single person in sight, you may feel lonely or left out at this time in your life: perhaps you are missing");
                   System.out.println("your friends or someone special you really care for. But if you stand and look out to sea, it means you`re");
                   System.out.println("ready to face a new challenge,you`re ready to start again. Of course, being at the beach means that you are");                
                   System.out.println("close to the sea and water is linked to our feelings. If the sea is turbulent, you could be very upset about");
                   System.out.println("something. But if it is calm, then so you are.");
                   System.out.println("");
                   System.out.println("Press Enter to go back to 'Dream Symbol from A-Z'");
                   s1=menu.readLine();
                   break;
                   
                   case 8:
                   System.out.println("Bed:");
                   System.out.println("    Have you been burning the candle at both ends recently, staying up late and generally not getting enough");
                   System.out.println("beuty sleep? if so,you may well dream about bed - a whacking hint from your unconscious telling you that you");
                   System.out.println("are tired and its about time you had an early night. beds can also symbolize comfort, as well as our privacy");
                   System.out.println("and security. if you've had a difficult day and perhaps have been failing a bit got at,you may dream of your");
                   System.out.println("bed that night, because thats the place where you feel safe and warm. Some times you might dream that you`re");
                   System.out.println("in a strange bed in a room you don`t recongnize.This may be anticipating a move: perhaps you`ll staying over");                
                   System.out.println(" at a friends house soon, or may be going off on a holiday.To dream that you`re making the bed may be asign ");
                   System.out.println("that you`re ready for a new relationship.");
                   System.out.println("");
                   System.out.println("Press Enter to go back to 'Dream Symbol from A-Z'");
                   s1=menu.readLine();
                   break;
                   
                   case 9:
                   System.out.println("Blood:");
                   System.out.println("    There are several meanings that can be applied to blood in a dream. Firstly,sinse its essential to life,");
                   System.out.println("a dream where you are bleeding can suggest that, for some reason you are being drained or losing your life ");
                   System.out.println("energy, either because you`re under stress or under the weather - perhaps you have caught a cold or flu and");
                   System.out.println("because blood is red, it may simply be representing some of the things we associate with that colour, like");
                   System.out.println("heat , warmth, anger, or passion.");
                   System.out.println("");
                   System.out.println("Press Enter to go back to 'Dream Symbol from A-Z'");
                   s1=menu.readLine();
                   break;
                   
                   case 10:
                   System.out.println("Body or body parts:");
                   System.out.println("    If you dream about your head,your arm,your leg or any other bit of your anatomy,it may be a premonition.");
                   System.out.println("For example, if you see yourself rubbing your foot, it might be a sign that you will be doing some activity");
                   System.out.println("where you could stub your toe or trip and sprain your ankle. it is quite common to compensate in a dream for");
                   System.out.println("what we have`nt got in our walking lives. So, a timid,gentle girl might see her self as a strong, confident");
                   System.out.println("lad in her dreams; someone who`s afraid of the sea may become a champion swimmer; and someone who can't walk");
                   System.out.println("at all may of him triumphantly playing fot ball with his mates. in the Symbolizm of dream language, however");                
                   System.out.println("particular parts of body have their own significanse. Dreming of ears, for instance, may mean that you are ");
                   System.out.println("not listning to what some one is trying to tell you, whilst dreaming of clsed eyes could be arning you that");
                   System.out.println("someone is trying to decieve you");
                   System.out.println("");
                   System.out.println("Press Enter to go back to 'Dream Symbol from A-Z'");
                   s1=menu.readLine();
                   break;
                   
                    case 11:
                   System.out.println("Books");
                   System.out.println("    To see books in your dream,indicates calmness.You will advance toward your goals at a slow and steady pace. Books also ");
                   System.out.println("symbolize knowledge, intellect, information and wisdom.  To see dusty books in your dream, denotes forgotten knowledge or  ");
                   System.out.println("previous chapters of your life. To see children's books in your dream, memories and a collection of personal memories from ");
                   System.out.println("your own childhood. It may also suggest your desire to escape from reality and retreat into some fantasy world. To see a ");
                   System.out.println("satanic book in your dream, symbolizes your one-sided way of thinking and looking at things. You are trying to denounce any ");
                   System.out.println("responsibility in your actions amd are putting forth a little effort as possible.");                
                   System.out.println("");
                   System.out.println("Press Enter to go back to 'Dream Symbol from A-Z'");
                   s1=menu.readLine();
                   break;
                   
                    case 12:
                   System.out.println("Burglary:");
                   System.out.println("    This is a fear dream because although theft of any sort is unpleasant, burglary in particular leaves us");                   
                   System.out.println("feeling voilated. A house symblizes your body, so to dream of your house being burgled may mean that you are");
                   System.out.println("worried about being attacked in some way. you might have this dream in real life, for example,you are afraid");
                   System.out.println("of bullies, or if you have been physically threatened by somebody. if you do have this sort of dream under ");
                   System.out.println("these circumstances, it would be worth talking your problems through with a sympathetic person. this dream ");
                   System.out.println("might alternatively imply that someone has said something nasty about you & unjustly blackened your reputation");                
                   System.out.println("but of course there is also a posibility that this dream is alerting ypu to the lack of security you have in");
                   System.out.println("your house which could make it an easy target for burglars. let your parents know about these anxieties:they");
                   System.out.println("may take extra precautions from now on and make sure they lock all the doors and windows.");
                   System.out.println("");
                   System.out.println("Press Enter to go back to 'Dream Symbol from A-Z'");
                   s1=menu.readLine();
                   break;
                   
                    case 13:
                   System.out.println("Candle:");
                   System.out.println("Candle lighten the darkness, so to dream of one suggest hope and improvement in some way. Remember,where there");
                   System.out.println("is light there is hope. if you`ve had a difficult problem on your mind, seeing yourself lightening a candle in");
                   System.out.println("your dream will mean that you`ll find the solution soon. if you blow out a candle,you may be wanting to put an");
                   System.out.println("end to certain situation - or a certain relationship - in your life.if the candle sputters or is blown out by");
                   System.out.println("the wind, a disappointment may be in store.");
                   System.out.println("");
                   System.out.println("Press Enter to go back to 'Dream Symbol from A-Z'");
                   s1=menu.readLine();
                   break;
                   
                    case 14:
                   System.out.println("Cave:");
                   System.out.println("    A dream about cave can have several interpretations depending on the rest of action in the dream.Sometimes");
                   System.out.println("it can represent the dak recesses if mind, the parts about ourselves that we do not fully understand, may be");
                   System.out.println("negetive characterstics in our nature. that we do not want to what we possess. so, if you dream you are in a");
                   System.out.println("cave and you light it up with a torch, it means you`re exploring hidden ideas or talkents: maybe it`s a sign");
                   System.out.println(" that you`re begining to develop some ofyour talent abilities. Take note of anything that may be written on ");
                   System.out.println("walls as this could be a message to you from your unconscious mind. also, notice any objects in the cave as");                
                   System.out.println("they may have a strong bearing on what`s going on inyour life at that moment. You can look up such objects");
                   System.out.println("under their alphabetical listening to find out what they mean and how they relate to this dream. if you`re ");
                   System.out.println("afraid to enter the cave, ask yourself what could be inside that you dont wnt to see. For example, if it`s a");
                   System.out.println("bear or snake, these symbolize your fear in life.");
                   System.out.println("");
                   System.out.println("Press Enter to go back to 'Dream Symbol from A-Z'");
                   s1=menu.readLine();
                   break;
                   
                   case 15:                   
                   System.out.println("Children:");
                   System.out.println("    Children can represent future hopes and ambitions. If you dream of a child and a parent together, it may");
                   System.out.println("be showing you a symbolic comparison between:immaturity vs maturity, youth vs old, impotence vs power, naivety");
                   System.out.println("vs wisdom, intuition vs logic, unconscious vs conscious. which of these interpretations is relevent to you,");
                   System.out.println("depends on what else happens in your dream and whatis currently going on in your life.");
                   System.out.println("");
                   System.out.println("Press Enter to go back to 'Dream Symbol from A-Z'");
                   s1=menu.readLine();
                   break;
                   
                   case 16:                   
                   System.out.println("Climbing:");
                   System.out.println("    Whether you`re going up a ladder, making your way way up a flight of stairs,or scaling a mountain,climbing");
                   System.out.println("in a dream symbolizes your need to succeed and conquer. this is essentially  a dream about ambition. An easy");
                   System.out.println("climb up a wide, carpeted staircase means taht you`ll achieve what you want without any hassle. the harder the");
                   System.out.println("climb, the more difficult you feel it will be to attain your goal in life, especially if there are obsticles ");
                   System.out.println("like huge boulders in your path, or if the stairs are rickety or dangerous. if you reach the top, you know you");                
                   System.out.println("have the power to achieve the goal. Decending or climbing downwads, especially if you trip & stumble, may be ");
                   System.out.println("warning you of problems or setbscks to come. if you`re climbing down the stairs to the basement or a dungeon,");
                   System.out.println("it suggest that you`re tring to explore some hidden worries or that you want to control you fears.");
                   System.out.println("");
                   System.out.println("Press Enter to go back to 'Dream Symbol from A-Z'");
                   s1=menu.readLine();
                   break;                   
                                      
                   case 17:                   
                   System.out.println("Clothes:");
                   System.out.println("    One can tell what people are like, by the clothes they wear. In dreams, clothes can say a lot about you ");
                   System.out.println("personally and about your state of mind. For example,if you`re wearing new clothes it suggest you`re confident");
                   System.out.println("and if you`re buying new clothes it could mean that you want a new image. Ragged clothes,  of course, would be");
                   System.out.println("opposite, suggesting a lack of confidence, or a feeling that you don`t come up to scratch,or that others judge");
                   System.out.println("you,as inferior to themselves. Dreaming that you`re wearing wrong clothes for the occasion is an enbarrassment");                
                   System.out.println("dream suggesting that you are afraidof showing yourself up in public.");
                   System.out.println("");
                   System.out.println("Press Enter to go back to 'Dream Symbol from A-Z'");
                   s1=menu.readLine();
                   break;
                   
                   case 18:                   
                   System.out.println("Computer:");
                   System.out.println("    This dream may be saying something about your skills. If you are playing a computer game, typing something");
                   System.out.println("or programming competently, your unconscious is confirming your talents and abilities. If you are making mess");
                   System.out.println("of things on the computer, perhaps you are trying to point out your self that you could do better if you try ");
                   System.out.println("harder. Take a note of what`s on the screen, as this in itself may be significant to the meaning of this dream");
                   System.out.println("alternatively, remember that computers work logically, so that to dream of writing a computer rogram may be a");                
                   System.out.println("message that you can solve a problem in your walking life by working at iy logically and systematically."); 
                   System.out.println("");
                   System.out.println("Press Enter to go back to 'Dream Symbol from A-Z'");
                   s1=menu.readLine();
                   break;
                  
                   case 19:                   
                   System.out.println("Crowd:");
                   System.out.println("    Are you being pushed by the crowd, or are you with a gang of mates & having fun? if you`re being pulled or");
                   System.out.println("pushed about in your dream, it may be a message that you are being pushed or pulled around by someone, swept ");
                   System.out.println("along by other people or hustled by a relationship. Ask your slf whether you`re being pressurized into doing");
                   System.out.println("things you really do not like. if you are having a good time with a group of your mates,this dream is telling");
                   System.out.println("you that you feel intune with friends anf relaxed in company."); 
                   System.out.println("");
                   System.out.println("Press Enter to go back to 'Dream Symbol from A-Z'");
                   s1=menu.readLine();
                   break;
                   
                   case 0:
                   l=-1;//to exit from loop
                   System.out.println("");
                   break;
                   
                   default:
                   System.out.println("                                                Wrong Choice");
                   System.out.println("                                        Enter Your Choice Again:");
                   
                }}                
                break; 
                
                case 2:
                l=1;
                while(l==1)
                {
                System.out.println("Select the Symbol you saw in your Dream :");
                System.out.println("1.Death");                
                System.out.println("2.Doctor");
                System.out.println("3.Dragon");
                System.out.println("4.Dream");
                System.out.println("5.Eating");
                System.out.println("6.Enemy");
                System.out.println("7.Exams");
                System.out.println("8.Exlosion");
                System.out.println("9.Falling");
                System.out.println("10.Family");
                System.out.println("11.Fashions");                
                System.out.println("12.Fire");
                System.out.println("13.Foreign Country");
                System.out.println("14.Forest");
                System.out.println("15.Friend");
                System.out.println("16.Games");
                System.out.println("17.Ghost");
                System.out.println("18.Girlfriend");
                System.out.println("19.Graveyard");
                System.out.println("Press 0 to Return to 'Dream Analysis'");
                System.out.println("______________________________________________________________________________________________________________");
                System.out.println("                                      Enter your Choice");
                choice5=menu.readLine();
                ch5=Integer.parseInt(choice5);                
                System.out.println("");
                switch(ch5)
                {
                   case 1:
                   System.out.println("Death:");
                   System.out.println("    To dream about the death of a loved one, suggests that you are lacking a certain aspect or quality that");
                   System.out.println("the loved one embodies. Ask yourself what makes this person special or what do you like about him.It is that");
                   System.out.println("very quality that you are lacking in your own relationship or circumstances. Alternatively,it indicates that");
                   System.out.println("whatever that person represents has no part in your own life.");
                   System.out.println("");
                   System.out.println("Press Enter to go back to 'Dream Symbol from D-G'");
                   s1=menu.readLine();
                   break;
                   
                   case 2:
                   System.out.println("Doctor:");
                   System.out.println("    To dream that you are seeing the doctor, denotes discouraging illness and strife amongst members of your");
                   System.out.println("family. It may signal your need for emotional and spiritual healing. To dream of a doctor in the social life");
                   System.out.println("atmosphere, foretells of good health and prosperity.To dream that you marry a doctor, forewarns that you are");
                   System.out.println("being deceived by someone or a situation.");
                   System.out.println("");
                   System.out.println("Press Enter to go back to 'Dream Symbol from D-G'");
                   s1=menu.readLine();
                   break;
                   
                   case 3:
                   System.out.println("Dragon:");
                   System.out.println("    To see a dragon in your dream,signifies that you tend to let yourself get carried away by your passion.");
                   System.out.println("This kind of behavior may lead you into trouble. You need to exercise some self-control. In the eastern ");
                   System.out.println("cultures, dragons are seen as spiritual creatures symbolizing good luck and fortune.");
                   System.out.println("");
                   System.out.println("Press Enter to go back to 'Dream Symbol from D-G'");
                   s1=menu.readLine();
                   break;
                   
                   case 4:
                   System.out.println("Dream:");
                   System.out.println("    To dream that you are dreaming, signifies your emotional state. You are excessively worried and fearful");
                   System.out.println("about a situation or circumstance that you are going through.");                  
                   System.out.println("");
                   System.out.println("Press Enter to go back to 'Dream Symbol from D-G'");
                   s1=menu.readLine();
                   break;
                   
                   case 5:
                   System.out.println("Eating:");
                   System.out.println("    To dream that you are eating alone, signifies loss, loneliness, and depression. You may feel rejected,");
                   System.out.println("excluded, and cut off from social/family ties. Eating may be a replacement for companionship and provide ");
                   System.out.println("comfort for you. Alternatively, eating alone may reflect independent needs. Also consider the pun,'what's");
                   System.out.println(" eating you up?' in reference to anxiety that you may be feeling.");
                   System.out.println("");
                   System.out.println("Press Enter to go back to 'Dream Symbol from D-G'");
                   s1=menu.readLine();
                   break;
                   
                   case 6:
                   System.out.println("Enemy:");
                   System.out.println("    To see your enemy in your dream,represents opposing ideas and contradictory attitudes.It also indicates");
                   System.out.println("something that you are in denial about or someone whom you are rejecting. Enemies may also represent the ");
                   System.out.println("enemies within and your inner conflict with yourself. To dream that you are dealing with the enemies,");
                   System.out.println("represents a resolution to some inner conflict or waking life problem.");
                   System.out.println("");
                   System.out.println("Press Enter to go back to 'Dream Symbol from D-G'");
                   s1=menu.readLine();
                   break;
                   case 7:
                   System.out.println("Exams:");
                   System.out.println("    To dream that you are taking an exam, signifies insecurities, fear of not meeting others' expectations,");
                   System.out.println("and fear of failure.");
                   System.out.println("");
                   System.out.println("Press Enter to go back to 'Dream Symbol from D-G'");
                   s1=menu.readLine();
                   break;
                   
                   case 8:
                   System.out.println("Explosion:");
                   System.out.println("    To see explosions in your dream,signifies a loss and displeasure in business.It may also mean that your");
                   System.out.println("repressed emotions and rage have come to the surface in a forceful and violent manner. To dream that your ");
                   System.out.println("face becomes blackened or mutilated by the explosion, signifies that you will be confronted with unjust ");
                   System.out.println("accusations and may suffer the consequences.");
                   System.out.println("");
                   System.out.println("Press Enter to go back to 'Dream Symbol from D-G'");
                   s1=menu.readLine();
                   break;
                   
                   case 9:
                   System.out.println("Falling:");
                   System.out.println("    To dream that you fall and are not frightened, signifies that you will overcome your adversities with ");
                   System.out.println("ease. To dream that you fall and are frightened, indicates a lack of control, insecurity,or lack of support");
                   System.out.println("in your waking life. You may be experiencing some major struggle and/or overwhelming problem. It may denote");
                   System.out.println("that you have failed to achieve a goal that you have set forth for yourself. To dream that you are free - ");
                   System.out.println("falling through water, indicates that you are feeling overwhelmed with emotions. You may feel that it is ");
                   System.out.println("easier to give up then to try to stay afloat or prevent yourself from going under.");                
                   System.out.println("");
                   System.out.println("Press Enter to go back to 'Dream Symbol from D-G'");
                   s1=menu.readLine();
                   break;
                   
                   case 10:
                   System.out.println("Family:");
                   System.out.println("    To see your own family in high spirits in your dream, symbolizes harmony and happiness.To see them glo");
                   System.out.println("foretells of disappointment and sadness.");
                   System.out.println("");
                   System.out.println("Press Enter to go back to 'Dream Symbol from D-G'");
                   s1=menu.readLine();
                   break;
                   
                   case 11:
                   System.out.println("Fashions:");
                   System.out.println("Dreaming about fashion and clothes is all wrapped up with the image we have of ourselves and wiht how we think ");
                   System.out.println("other people see us.If you dream that you are dressed in old fashioned clothes ,perhaps you are secretly worried ");
                   System.out.println("that your friend's think you are a nerd.But if what you are wearing in the dream has great street cred and everyone");
                   System.out.println("is admiring your clothes,it means you are aconfident person, oyu are well balanced and you feel you fit in well with");
                   System.out.println("your mates.Note what coloures you see in your dreams as these can be very significant.");
                   System.out.println("");
                   System.out.println("Press Enter to go back to 'Dream Symbol from D-G'");
                   s1=menu.readLine();
                   break;
                   
                   case 12:
                   System.out.println("Fire:");
                   System.out.println("    Depending on the context of your dream, to see fire in your dream can symbolizes destruction, passion,");
                   System.out.println("desire, illumination, transformation, enlightenment, or anger. It may suggest that something old is  ");                
                   System.out.println("passing and something new is entering your life. Your thoughts and views are changing. In particular, if"); 
                   System.out.println("the fire is under control or contained in one area, it is a metaphor of your own internal fire and inner ");
                   System.out.println("transformation. It also represents your drive and motivation.");
                   System.out.println("");
                   System.out.println("Press Enter to go back to 'Dream Symbol from D-G'");
                   s1=menu.readLine();
                   break;
                   
                   case 13:
                   System.out.println("Foreign Country:");
                   System.out.println("Dreaming that you are in foreign country where you don't recognize anyone or anything means that you might ");
                   System.out.println("soon find yourself in an unusual place or a confusing situation.If you try to talk to strangers and they can't");
                   System.out.println("understanding what you're saying,it may be that in your waking life you're finding it difficult to make yourself");
                   System.out.println("understood");
                   System.out.println("");
                   System.out.println("Press Enter to go back to 'Dream Symbol from D-G'");
                   s1=menu.readLine();
                   break;
                   
                   case 14:
                   System.out.println("Forest:");
                   System.out.println("    To dream that you are in or walking through the forest, signifies a transitional phase.  You may be  ");
                   System.out.println("following your instincts.To dream that you are lost in a forest, signifies that you are searching through ");
                   System.out.println("your unconscious for a better understanding of yourself");
                   System.out.println("");
                   System.out.println("Press Enter to go back to 'Dream Symbol from D-G'");
                   s1=menu.readLine();
                   break;
                   
                   case 15:
                   System.out.println("Friend");                
                   System.out.println("    To see your friends in your dream, signifies aspects of your personality that you have rejected, but  "); 
                   System.out.println("are ready to integrate these rejected part of yourself.  The relationships you have with those around you"); 
                   System.out.println("are important in learning about yourself. Additionally, this symbol foretells of happy tidings from them ");
                   System.out.println("and the arrival of good news. To see your childhood friend in your dream, signifies regression into your ");
                   System.out.println("past where you had no responsibilities and things were much simpler and carefree. You may be wanting to ");
                   System.out.println("escape the the pressures and stresses of adulthood. Consider the relationship you had with this friend and");
                   System.out.println("the lessons that were learned. Alternatively, the childhood friend may be suggesting that you have been"); 
                   System.out.println("acting in a childish manner and you need to start acting like an adult. To dream that your best friend is  ");
                   System.out.println("dying, suggests that  some aspect or quality that your best friend possess is dying within your own self. ");
                   System.out.println("");
                   System.out.println("Press Enter to go back to 'Dream Symbol from D-G'");
                   s1=menu.readLine();
                   break;
                   
                   case 16:
                   System.out.println("Games:");
                   System.out.println("    To  dream that you are playing games, signifies relaxation or competition. It may also represent the ");
                   System.out.println("rules you play by.");
                   System.out.println("");
                   System.out.println("Press Enter to go back to 'Dream Symbol from D-G'");
                   s1=menu.readLine();
                   break;
                   
                   case 17:
                   System.out.println("Ghost:");
                   System.out.println("    In general,ghosts symbolizes aspects of yourself that you fear.This may involve a painful memory,");
                   System.out.println("guilt,or some repressed thoughts.You may be afraid of death and dying.Alternatively,ghosts are representative");
                   System.out.println("of something that is no longer obtainable or within reach.It indicates a feeling of disconnection from life");
                   System.out.println("and society.This dream may be a calling for you to move on and abandon your outdated modes of thinking and ");
                   System.out.println("behavior.To dream that you reach out to touch a ghost,but it disappears,indicates that you are taking steps ");                
                   System.out.println("to acknowledging some painful or repressed thoughts even though you are not ready to fully confront them.To see");
                   System.out.println("the ghost of a living relative or friend in your dream,signifies that you are in danger of malice acts by that ");
                   System.out.println("person.To see the ghost of a dead friend/relative in your dream,suggests guilt and regrets concerning the past ");
                   System.out.println("relationships with that particular person");
                   System.out.println("");
                   System.out.println("Press Enter to go back to 'Dream Symbol from D-G'");
                   s1=menu.readLine();
                   break;
                   
                   case 18:
                   System.out.println("Girlfriend:");
                   System.out.println("    To see your girlfriend in your dream,represents your waking relationship with her and how you feel about"); 
                   System.out.println("her.To see a girlfriend in your dream,represents your playful,innocent,and childlike nature.Perhaps you have ");
                   System.out.println("been behaving prematurely.To dream about a girl that you just met,represents your anxieties and thoughts of");                
                   System.out.println("whether you had made a good impression on her and what she thought of you.If she told you that she disliked ");
                   System.out.println("you in the dream,then it may be an excuse for you to dismiss her and not pursue a relationship that is beyond ");
                   System.out.println("");
                   System.out.println("Press Enter to go back to 'Dream Symbol from D-G'");
                   s1=menu.readLine();
                   break;
                   
                   case 19:
                   System.out.println("Graveyard:");
                   System.out.println("    To dream that you are at a graveyard,represents the discarded aspects of yourself.It is also a fear of the ");
                   System.out.println("unknown.Alternative, it indicates a loss or a period of mourning.");
                   System.out.println("");
                   System.out.println("Press Enter to go back to 'Dream Symbol from D-G'");
                   s1=menu.readLine();
                   break;
                   
                   case 0:
                   l=-1;//to exit from loop
                   System.out.println("");
                   break;
                   
                   default:
                   System.out.println("                                                Wrong Choice");
                   System.out.println("                                        Enter Your Choice Again:");
                   
                }}
                break;
                
                case 3:
                l=1;
                while(l==1)
                {
                System.out.println("Select the Symbol you saw in your Dream :");
                System.out.println("1.House");                
                System.out.println("2.Headmaster/mistress");
                System.out.println("3.Illness");
                System.out.println("4.Invisibility");
                System.out.println("5.Jewellery");
                System.out.println("6.Journey");
                System.out.println("7.Key");
                System.out.println("8.Killing");
                System.out.println("9.Ladder");
                System.out.println("10.Light");
                System.out.println("Press 0 to Return to 'Dream Analysis'");
                System.out.println("________________________________________________________________________________________________________________");
                System.out.println("                                      Enter your Choice");
                choice5=menu.readLine();
                ch5=Integer.parseInt(choice5);                
                System.out.println("");
                switch(ch5)
                {
                   case 1:
                   System.out.println("House:");
                   System.out.println("    To see a house in your dream,represents your own soul and self.Specific rooms in the house indicate a specific");             
                   System.out.println("aspect of your psyche.In general,the attic represents your intellect,the basement represents the unconscious,etc.");
                   System.out.println("If the house is empty,then it indicates feelings of insecurity.If the house is shifting,then it suggests that you");
                   System.out.println("are going through some personal changes and changing your belief system.To dream that you are cleaning your house.");
                   System.out.println("signifies your need to clear out your thoughts and getting rid of old ways.You are seeking self-improvement.If you");
                   System.out.println("live with others in your waking life,but dream that you are living alone,suggests that you need to take new steps ");
                   System.out.println("toward independence.You need to accept responsibilities and be more self-reliant");
                   System.out.println("");
                   System.out.println("Press Enter to go back to 'Dream Symbol from D-G'");
                   s1=menu.readLine();
                   break;
                   
                   case 2:
                   System.out.println("Headmaster/mistress:");
                   System.out.println("In general headmasters or headmistresses represent authority figures.but,because these are teachers and it's ");
                   System.out.println("their job to instruct us, head teachers in a dream can stand for our consciences, guiding us and pointing out ");
                   System.out.println("right from wrong. sometimes our parents can be confused with headmasters/mistresses and vice versa.");
                   System.out.println("");
                   System.out.println("Press Enter to go back to 'Dream Symbol from H-L'");
                   s1=menu.readLine();
                   break;
                   
                   case 3:
                   System.out.println("Illness:");
                   System.out.println("Illness");
                   System.out.println("    To dream of an illness in your dream, denotes despair,unpleasant changes,and an emotional breakdown.The");
                   System.out.println(" illness may be symbolic of your inability to cope with a situation and you see that being ill is an easy");
                   System.out.println("way out.On a more direct note,this dream may signal you to pay close attention to your health especially to");
                   System.out.println("the areas of body revealed in the dream");
                   System.out.println("");
                   System.out.println("Press Enter to go back to 'Dream Symbol from H-L'");
                   s1=menu.readLine();
                   break;
                   
                   case 4:
                   System.out.println("Invisibility:");
                   System.out.println("    To dream that people or objects are disappearing right before your eyes, signifies your anxiety and ");
                   System.out.println("insecurities over the notion that loved ones might disappear out of your life. You may feel that you cannot ");
                   System.out.println("depend on someone and feel that you are alone and inadequate.You need to work on your self-image & self-esteem.");
                   System.out.println("Alternatively,to dream that someone is disappearing suggests that you may not have given sufficient attention ");
                   System.out.println("to those aspects/qualities of that person within your own self.");
                   System.out.println("");
                   System.out.println("Press Enter to go back to 'Dream Symbol from H-L'");
                   s1=menu.readLine();
                   break;
                   
                   case 5:
                   System.out.println("Jewellery:");
                   System.out.println("dreaming about jewellery is a type of wish-fulfilment dream. bright, shiny gems signify your ambitions.");
                   System.out.println("To lose or break your jewellery warns of problems ahead, whilst dirty or tarnished jewellery may mean ");
                   System.out.println("quarrels and disappointment lie ahead .If you find an item of jewellery ,though it could mean you are in");
                   System.out.println("for a spot of good luck. A necklace symbolizes happiness. Dreaming of diamonds means you will win. Pearls  ");
                   System.out.println("are like teardrops and are therefore associated with sadness. Earrings draw your attention to your ear,");                
                   System.out.println("this dream may be telling you to listen more carefully to what you are being told,or you my soon be getting ");
                   System.out.println("some good news.");
                   System.out.println("");
                   System.out.println("Press Enter to go back to 'Dream Symbol from H-L'");
                   s1=menu.readLine();
                   break;
                   
                   case 6:
                   System.out.println("Journey:");
                   System.out.println("    To dream that you are going on a journey,signifies profits,self-discovery or progress.The scenery you ");
                   System.out.println("see in your journey is telling of your feelings & circumstances you may be currently experiencing.To dream");                
                   System.out.println("that your friends go on a journey,signifies delightful and welcomed change and harmony. ");
                   System.out.println("");
                   System.out.println("Press Enter to go back to 'Dream Symbol from H-L'");
                   s1=menu.readLine();
                   break;
                   case 7:
                   System.out.println("Key:");
                   System.out.println("    To see a key in your dream,symbolizes opportunities,access,control,secrets,or responsibilities. You may");
                   System.out.println("be locking away your own inner feelings and emotions. To dream that you lose your keys,signifies your fear ");
                   System.out.println("of losing your position or status in life. You may have lost control of yourself. It may also foretells of  ");
                   System.out.println("unexpected changes and unpleasant adventures.If you give your key away,then it suggests that you have given");
                   System.out.println("up control of some situation or responsibility. To dream that you find keys,signifies that you have found a ");
                   System.out.println("solution to a problem. To see broken keys in your dream,signifies many quarrels and possibly a break-up. To");
                   System.out.println("hear the sounds of keys rattling,indicates that you have the right attitude toward life. You are heading in");                
                   System.out.println("the right direction and asking all the right questions in the process.It is also a sign of decisive action.");
                   System.out.println("");
                   System.out.println("Press Enter to go back to 'Dream Symbol from H-L'");
                   s1=menu.readLine();
                   break;
                   
                   case 8:
                   System.out.println("Killing:");
                   System.out.println("    If you are killing someone in your dreams, you are probably expressing hostile feelings. Consider this an ");
                   System.out.println("opportunity to look at your negative feelings and decide what would be the best and the least destructive way ");
                   System.out.println("to address them. If you are a witness to a killing, you may be reflecting on changes going on around you that ");
                   System.out.println("you don't particularly like.");
                   System.out.println("");
                   System.out.println("Press Enter to go back to 'Dream Symbol from H-L'");
                   s1=menu.readLine();
                   break;
                   
                   case 9:
                   System.out.println("Ladder:");
                   System.out.println("    To dream that you are climbing up a ladder,suggests that you have reached a new level of achievement ");
                   System.out.println("and higher awareness.It is indicative of prosperity,hard work and efforts. You may also be looking things ");
                   System.out.println("from a different perspective. Alternatively,it may indicate meditation and prayer. You are setting forth on");
                   System.out.println("a spiritual path.Consider also the phrase ofclimbing the social ladder in which you have achieved status,");
                   System.out.println("power,or an important goal.To dream that you are climbing down a ladder,suggests that you are escaping from");
                   System.out.println("your spiritual responsibilities.It is an indication of much disappointments.To dream that someone is holding ");
                   System.out.println("a ladder for you,signifies that you will find success and rise to prominence with the support of others. To");                
                   System.out.println("dream that you fall from a ladder, denotes the hardships, risks or failures you are faced with in your ");
                   System.out.println("endeavors.To see a broken ladder in your dream,indicates consistent failures in your undertakings. You may ");
                   System.out.println("feel handicapped in pursuit of your goals.To dream that you escape by means of a ladder, signifies that you ");
                   System.out.println("will be successful after much struggle and obstacles.");
                   System.out.println("");
                   System.out.println("Press Enter to go back to 'Dream Symbol from H-L'");
                   s1=menu.readLine();
                   break;
                   
                   case 10:
                   System.out.println("Light:");
                   System.out.println("    To see light in your dream,denotes a clear mind,plain understanding,and insight. Light has been shed on");
                   System.out.println("a once cloudy situation or problem.You have found the truth to a situation or an answer to a problem.To see");
                   System.out.println("a bright light in your dream,indicates that you need to move toward a higher level of awareness and feeling.");                
                   System.out.println("Bright light dreams are sometimes common for those who are near death");
                   System.out.println("");
                   System.out.println("Press Enter to go back to 'Dream Symbol from H-L'");
                   s1=menu.readLine();
                   break;
                   
                   case 0:
                   l=-1;//to exit from loop
                   System.out.println("");
                   break;
                   
                   default:
                   System.out.println("                                                Wrong Choice");
                   System.out.println("                                        Enter Your Choice Again:");
                   
                }}
                break;
                
                case 4:
                l=1;
                while(l==1)
                {
                System.out.println("Select the Symbol you saw in your Dream :");
                System.out.println("1.Marriage");                
                System.out.println("2.Money");
                System.out.println("3.Nightmare");
                System.out.println("4.Numbers");
                System.out.println("5.Old People");
                System.out.println("6.Palace");
                System.out.println("7.Party");
                System.out.println("8.Perfume");
                System.out.println("9.Presents");
                System.out.println("10.Prison");
                System.out.println("11.Prize");
                System.out.println("12.Plants");
                System.out.println("Press 0 to Return to 'Dream Analysis'");
                System.out.println("________________________________________________________________________________________________________________");
                System.out.println("                                      Enter your Choice");
                choice5=menu.readLine();
                ch5=Integer.parseInt(choice5);                
                System.out.println("");
                switch(ch5)
                {
                   case 1:
                   System.out.println("Marriage:");
                   System.out.println("    To see a marriage in your dream,signifies commitment,harmony or transition.You'll undergo an important"); 
                   System.out.println("developmental transitional phase. It may also represent the unification of formerly separate or opposite ");
                   System.out.println("aspects of yourself.In particular,it may represent the union of masculine or feminine aspects of yourself.");
                   System.out.println("To dream of a proposal of marriage, suggests that some situation will take a turn for the worse. To dream ");
                   System.out.println("that you are getting married to your ex, suggests that you have accepted aspects of that relationship and ");
                   System.out.println("learned from those past mistakes.Alternatively,it means that a current relationship shares some commonality ");
                   System.out.println("with your previous relationship with your ex. However, you will not make those same mistakes.");                
                   System.out.println("");
                   System.out.println("Press Enter to go back to 'Dream Symbol from M-P'");
                   s1=menu.readLine();
                   break;
                   
                   case 2:
                   System.out.println("Money");
                    System.out.println("    To see or win money in your dream, symbolizes that success and prosperity is within your reach. Money may");    
                   System.out.println("represent confidence,self-worth,success, or values. You have much belief in yourself. Alternatively, dreaming");
                   System.out.println("about money, refers to your attitudes about love and matters of heart. In particular, finding money indicates");
                   System.out.println("your quest for love or for power.To dream that you lose money,signifies temporary unhappiness in the home and");
                   System.out.println("a few setbacks in your affairs. You may be feeling weak, vulnerable, and out of control in your waking life.");    
                   System.out.println("Additionally,you may be lacking ambition, power and self-esteem.To dream about giving money away,is analogous");
                   System.out.println("to giving love.You are looking for love.To see others giving money away,suggests that you are feeling ignored");
                   System.out.println("or neglected.Someone is not paying enough attention and showing enough affection toward you.To dream that you");
                   System.out.println("have no money, denotes that you have a fear of losing your place in the world or that you feel that you lack");    
                   System.out.println("the abilities needed to achieve some desired goal. You may be overlooked or neglected by others. ");
                   System.out.println("");
                   System.out.println("Press Enter to go back to 'Dream Symbol from D-G'");
                   s1=menu.readLine();
                   break;
                   
                   case 3:
                   System.out.println("Nightmare:");
                   System.out.println("    If you have nightmares, try to understand the fears and the events in those dreams. They ");
                   System.out.println("suggest that you might be holding on to be traumatic or guilt based conflicts.You may have a lot");
                   System.out.println("of powerful negative feelings that require reconciliation.If nightmares continue for an extended");
                   System.out.println("period of time, the individual should consider obtaining professional counseling services. Night");
                   System.out.println("mares are a direct result of overwhelming feelings of fear and helplessness, or a result of an ");
                   System.out.println("unprocessed traumatic experience. A nightmare is any dream that wakes you up because of its ");                
                   System.out.println("frightening and overwhelming images.");
                   System.out.println("");
                   System.out.println("Press Enter to go back to 'Dream Symbol from D-G'");
                   s1=menu.readLine();
                   break;
                   
                   case 4:
                   System.out.println("Numbers:");
                   System.out.println("    To see numbers in your dream, signifies unsettled conditions in business resulting in uneasiness and dis-");    
                   System.out.println("satisfaction.Numbers have been recognised as powerful symbols by civilizations and cultures throughout history.");
                   System.out.println("They play a particularly relevant role in mystical and religious traditions.Just think how many refrences there ");
                   System.out.println("are to a particular numbers in the Bible:One,Three,and Seven especially stand out.Jung one of the greatest experts");
                   System.out.println("on dreams recognised the significance on the numbers in our dreams and made study of their symbolism.1-refer to your");
                   System.out.println("self 2-to refer to a couple.3-symbolises talent creativity and self expressions.Steady ,solid,hardwork is the meaning");
                   System.out.println("behing the number 4.Adventure and Number 5 go together.6 symbolises honesty and reliability.7 is a bit of high Brow number ");
                   System.out.println("with links to knowledge and wisdom.8 symbolises money wealth and riches.9 is associated with kindness and generosity.");                
                   System.out.println("10 symbolises of perfection anfd completion");
                   System.out.println("");
                   System.out.println("Press Enter to go back to 'Dream Symbol from D-G'");
                   s1=menu.readLine();
                   break;
                   
                   case 5:
                    System.out.println("Old People");
                   System.out.println("    An old woman in your dreams symbolizes wisdom. Dreaming about old people may attempt to bring the dreamer into ");
                   System.out.println("awareness of the larger meaning of ones life. Old people in dreams represent wisdom and maturity. They may appear in our ");
                   System.out.println("dreams at times of confusion and lack of direction, or when we need consultation and help in decision-making.");
                   System.out.println("");
                   System.out.println("Press Enter to go back to 'Dream Symbol from D-G'");
                   s1=menu.readLine();
                   break;
                   
                   case 6:
                   System.out.println("Palace");
                   System.out.println("    To see a palace in your dream, symbolizes the prominence and wealth. You are ready to utilize your full ");    
                   System.out.println("potential.To dream that you are the owner of a palace, signifies that success is right within your reach.");
                   System.out.println("");
                   System.out.println("Press Enter to go back to 'Dream Symbol from D-G'");
                   s1=menu.readLine();
                   break;
                   
                   case 7:
                   System.out.println("Party:");
                   System.out.println("    To dream that you are at a party, suggests that you need to get out more and enjoy yourself. If the party");    
                   System.out.println("is bad, then it indicates that you are unsure of your social skills.");
                   System.out.println("");
                   System.out.println("Press Enter to go back to 'Dream Symbol from D-G'");
                   s1=menu.readLine();
                   break;
                   
                   case 8:
                   System.out.println("Perfume:");
                   System.out.println("    To dream that you are spraying or wearing perfume,suggests that you are seeking for more pleasure in your");    
                   System.out.println("life. It is symbolic of your sexuality, sensuality, and indulgence.");
                   System.out.println("");
                   System.out.println("Press Enter to go back to 'Dream Symbol from D-G'");
                   s1=menu.readLine();
                   break;
                   
                   case 9:
                   System.out.println("Presents:");
                   System.out.println("    To dream that you are giving a present, signifies your generosity towards others. Alternatively, you may ");
                   System.out.println("be trying to express some feeling or have something awkward to say that has to be carefully packaged.To dream");    
                   System.out.println(" that you receive a gift, denotes your tremendous luck in fortune and love. You are being rewarded for a job ");
                   System.out.println("well done and are held in high esteem by those around you.");
                   System.out.println("");
                   System.out.println("Press Enter to go back to 'Dream Symbol from D-G'");
                   s1=menu.readLine();
                   break;
                   
                   case 10:
                   System.out.println("Prizon:");
                   System.out.println("    To dream that you`re in prison,signifies that you are being censored and not allowed to express yourself.");
                   System.out.println("To dream that someone else is in prison,signifies an aspect of yourself that you`re unable to express freely.");
                   System.out.println("To dream that you or someone is released from the prison, denotes that you need to make major changes to your");
                   System.out.println("walking life. Eventually, you will overcome your misfortune.");    
                   System.out.println("");
                   System.out.println("Press Enter to go back to 'Dream Symbol from D-G'");
                   s1=menu.readLine();
                   break;
                   
                   case 11:
                   System.out.println("Prize:");
                   System.out.println("    To dream that you receive a prize, denotes that you have achieved some outstanding accomplishment or had ");
                   System.out.println("made significant progress in personal endeavors. You feel pleased and proud of yourself.");    
                   System.out.println("");
                   System.out.println("Press Enter to go back to 'Dream Symbol from D-G'");
                   s1=menu.readLine();
                   break;
                   
                   case 12:
                   System.out.println("Plants:");
                   System.out.println("    To see plants in your dream,indicates fertility,spiritual development,growth or the potential for growth.");    
                   System.out.println("Alternatively, the appearance of plants in your dreams reflects your caring and loving nature. In particular,");
                   System.out.println("to see indoor plants in your dream, suggests that your growth is being hindered or slowed in some way.You are");
                   System.out.println("experiencing a lack of independence.Alternatively,the dream signify your desire to be closer to nature.if you");
                   System.out.println("are estranged from your children, then the plants can be seen as a representative for your your children");    
                   System.out.println("");
                   System.out.println("Press Enter to go back to 'Dream Symbol from D-G'");
                   s1=menu.readLine();
                   break;
                   
                   case 0:
                   l=-1;//to exit from loop
                   System.out.println("");
                   break;
                   
                   default:
                   System.out.println("                                                Wrong Choice");
                   System.out.println("                                        Enter Your Choice Again:");
                   
                }}
                break;
                
                case 5:
                l=1;
                while(l==1)
                {
                System.out.println("Select the Symbol you saw in your Dream :");
                System.out.println("1.Quarrel");                
                System.out.println("2.Race");
                System.out.println("3.Rain");
                System.out.println("4.Robot");
                System.out.println("5.Royality");
                System.out.println("6.School");
                System.out.println("7.Sea");
                System.out.println("8.Sex");
                System.out.println("9.Snakes");
                System.out.println("10.Storm");
                System.out.println("Press 0 to Return to 'Dream Analysis'");
                System.out.println("________________________________________________________________________________________________________________");
                System.out.println("                                      Enter your Choice");
                choice5=menu.readLine();
                ch5=Integer.parseInt(choice5);                
                System.out.println("");
                switch(ch5)
                {
                   case 1:
                   System.out.println("Quarrel:");
                   System.out.println("    To dream that you are quarreling with a certain person, signifies that there is some hidden hard feelings");
                   System.out.println("and conflict toward that person and you are having difficulties talking about. This dream functions to help ");    
                   System.out.println("open that line of communication with that person in your waking life. To overhear quarreling in your dream, ");
                   System.out.println("denotes unsatisfactory business dealings.");
                   System.out.println("");
                   System.out.println("Press Enter to go back to 'Dream Symbol from Q-S'");
                   s1=menu.readLine();
                   break;
                   
                   case 2:
                   System.out.println("Race:");    
                   System.out.println("    To dream that you are in a race, signifies that others are envious of your achievements and want it for ");
                   System.out.println("themselves. If you win the race, then it denotes that you will overcome your competitors. Alternatively,this");
                   System.out.println("dream may also be an indication for you to slow down or take a different coarse in life.Often this dream can");
                   System.out.println("reveal your competitive nature and how you tend to measure yourself against others.");    
                   System.out.println("");
                   System.out.println("Press Enter to go back to 'Dream Symbol from Q-S'");
                   s1=menu.readLine();
                   break;
                   
                   case 3:
                   System.out.println("Rain:");
                   System.out.println("    To dream that you get wet from the rain, signifies that you will soon be cleansed from your troubles and");
                   System.out.println("problems. Rain also symbolizes fertility and renewal.To see and hear rain falling,symbolizes forgiveness and");
                   System.out.println("grace. To dream that you`re watching the rain from a window, indicates that spiritual ideas and insights are");
                   System.out.println("being brought to you awareness. It may also symbolize fortune and love. To hear the tapping of the rain on ");
                   System.out.println("the roof, denotes spiritual ideas and blessings coming to mind. It may also suggests that you will receive ");
                   System.out.println("much joy from your home life.");
                   System.out.println("");
                   System.out.println("Press Enter to go back to 'Dream Symbol from Q-S'");
                   s1=menu.readLine();
                   break;
                   
                   case 4:
                   System.out.println("Robot:");
                   System.out.println("    To see a robot in your dream,indicates that you are going about life in a mechanical and rigid way. You ");
                   System.out.println("have lost the ability to express your feelings. Alternatively, a robot may symbolize the way you view your ");
                   System.out.println("working life");
                   System.out.println("");
                   System.out.println("Press Enter to go back to 'Dream Symbol from Q-S'");
                   s1=menu.readLine();
                   break;
                   
                   case 5:
                   System.out.println("Royalty:");
                   System.out.println("People often dream about kings, queens, members of the royal family or other important celebrities, but the  ");                
                   System.out.println("essential thing is how you figure in these dreams. If you are the royal person and the acting condescendingly,  ");
                   System.out.println("your unconscious may be telling you that you are becoming a little too big for your boots! But if a member  ");
                   System.out.println("of the royal family snubs you or belittles you in any way, your dream is suggesting that you have a low self   ");
                   System.out.println("image and that you need to believe in your talents and assert yourself a little more. sometimes,dreaming about  ");
                   System.out.println("royalty indicates a desire to be noticed.");
                   System.out.println("");
                   System.out.println("Press Enter to go back to 'Dream Symbol from Q-S'");
                   s1=menu.readLine();
                   break;
                   
                   case 6:
                   System.out.println("School:");
                   System.out.println("    To dream that you are in school, signifies feelings of inadequacy and childhood insecurities that have  ");
                   System.out.println("never been resolved.It may relate to anxieties about performance and abilities.You may also be going through");
                   System.out.println("a spiritual learning experience. If you are still in school and dream about school, then it will naturally ");
                   System.out.println("serve as a backdrop to your dream world. Alternatively, a dream that takes place in school may be a metaphor ");
                   System.out.println("for the lessons that you are learning from your waking life.");
                   System.out.println("");
                   System.out.println("Press Enter to go back to 'Dream Symbol from Q-S'");
                   s1=menu.readLine();
                   break;
                   
                   case 7:
                   System.out.println("Sea:");
                   System.out.println("    To see the sea in your dream, represents your unconscious and your transition between your unconscious ");
                   System.out.println("and conscious. It also often represents your emotions. The dream may also be a pun on your understanding and");
                   System.out.println("perception of a situation.I see or perhaps there is something you need to see more clearly.Alternatively,");
                   System.out.println("the dream may indicate a need to reassure yourself or offer reassurance to someone.");
                   System.out.println("");
                   System.out.println("Press Enter to go back to 'Dream Symbol from Q-S'");
                   s1=menu.readLine();
                   break;
                   
                   case 8:
                   System.out.println("Sex:");
                   System.out.println("    To dream about sex refers to the psychological completion and the integration of contrasting aspects of ");
                   System.out.println("self.You need to be more receptive and incorporate aspects of your dream sex partner into your own character.");
                   System.out.println("Alternatively and a more direct interpretation of the dream, may be your libido's way of telling you that it ");
                   System.out.println("is been too long since you have had sex. It may indicate repressed sexual desires and your needs for physical");
                   System.out.println("and emotional love. To dream about sex with someone other than your spouse or significant other, suggests ");
                   System.out.println("dissatisfaction with the physical side of your relationship. On the other hand, it may be harmless fantasy.In");                
                   System.out.println("such situations, you may find that you are less inhibited sexually and you can even bring that sense of ");
                   System.out.println("adventure to your existing relationship.");
                   System.out.println("");
                   System.out.println("Press Enter to go back to 'Dream Symbol from Q-S'");
                   s1=menu.readLine();
                   break;
                   
                   case 9:
                   System.out.println("Snakes");
                   System.out.println("    To see a snake or be bitten by one in your dream,signifies hidden fears and worries that are threatening"); 
                   System.out.println("you.Your dream may be alerting you to something in your waking life that you are not aware of or that has not  ");
                   System.out.println("yet surfaced. The snake may also be seen as phallic and thus symbolize dangerous and forbidden sexuality. The ");
                   System.out.println("snake may also refer to a person around you who is callous,ruthless,and can't be trusted.As a positive symbol,");
                   System.out.println(" snakes represent transformation, knowledge and wisdom. It is indicative of self-renewal and positive changes. ");
                   System.out.println("");
                   System.out.println("Press Enter to go back to 'Dream Symbol from Q-S'");
                   s1=menu.readLine();
                   break;
                   
                   case 10:
                   System.out.println("Storm");
                   System.out.println("    To see a storm in your dream, signifies overwhelming struggle, shock, devastating loss and catastrophe in ");
                   System.out.println("your personal affairs. The storm also represents unexpressed fears or emotions,such as anger,rage,turmoil,etc.");
                   System.out.println("On a more positive note,the storm signifies the rising of spirit within.To dream that you take cover in a storm,");
                   System.out.println("foretells that whatever disturbance or problems is occurring in your life will quickly blow over. Consider also ");
                   System.out.println("the phrase weather the storm, which suggests your ability and strength to withstand whatever comes");
                   System.out.println("");
                   System.out.println("Press Enter to go back to 'Dream Symbol from Q-S'");
                   s1=menu.readLine();
                   break;
                   
                   case 0:
                   l=-1;//to exit from loop
                   System.out.println("");
                   break;
                   
                   default:
                   System.out.println("                                                Wrong Choice");
                   System.out.println("                                        Enter Your Choice Again:");
                   
                }}
                break;
                
                case 6:
                l=1;
                while(l==1)
                {
                System.out.println("Select the Symbol you saw in your Dream :");
                System.out.println("1.Teacher");                
                System.out.println("2.Telephone");
                System.out.println("3.Toilet");
                System.out.println("4.Treasure");
                System.out.println("5.Tunnel");
                System.out.println("6.Umbrella");
                System.out.println("7.Uniform");
                System.out.println("8.Volcano");
                System.out.println("9.Walking");
                System.out.println("10.water");
                System.out.println("11.Window");
                System.out.println("12.Zoo");
                System.out.println("Press 0 to Return to 'Dream Analysis'");
                System.out.println("________________________________________________________________________________________________________________");
                System.out.println("                                      Enter your Choice");
                choice5=menu.readLine();
                ch5=Integer.parseInt(choice5);                
                System.out.println("");
                switch(ch5)
                {
                   case 1:
                   System.out.println("Teacher");
                   System.out.println("    To see your teacher (past or present) in your dream, suggests that you are seeking some advice, guidance, or");
                   System.out.println("knowledge.You are heading into a new path in life and ready to learn by example or from a past experience.Consider ");
                   System.out.println("your own personal experiences with that particular teacher.What subject was taught? Alternatively,it may relate to ");
                   System.out.println("issues with authority and seeking approval.You may going through a situation in your waking life where you feel that");
                   System.out.println("you are being treated like a student or in which you feel you are being put to a test");
                   System.out.println("");
                   System.out.println("Press Enter to go back to 'Dream Symbol from T-Z'");
                   s1=menu.readLine();
                   break;
                   
                   case 2:
                   System.out.println("Telephone:");
                   System.out.println("    To see or hear a telephone in your dream, signifies a message from your unconscious or some sort of ");
                   System.out.println("telepathic communication. You may be forced to confront issues which you have tried to avoid. To dream that ");
                   System.out.println("you do not want to answer the ringing telephone, indicates lack of communication. There is a situation or ");
                   System.out.println("relationship that you are tying to keep at a distance. To dream that you have trouble hearing over the ");
                   System.out.println("telephone,signifies that you are the center of some malicious gossip.To dream that you are having a telephone"); 
                   System.out.println("conversation with someone your know,signifies an issue that you need to confront with that person. This issue ");
                   System.out.println("may have to do with letting go some part of yourself.");
                   System.out.println("");
                   System.out.println("Press Enter to go back to 'Dream Symbol from T-Z'");
                   s1=menu.readLine();
                   break;
                   
                   case 3:
                   System.out.println("Toilet:");
                   System.out.println("    To see a toilet in your dream, symbolizes a release of emotions or getting rid of something in your life  ");
                   System.out.println("that is useless. To see a clogged toilet in your dream, signifies that you are holding in and keeping your ");
                   System.out.println(" feelings to yourself. Your emotions have been pent up too long. To see an overflowing toilet in your dream,  ");
                   System.out.println("denotes your desires to fully express your emotions.");
                   System.out.println("");
                   System.out.println("Press Enter to go back to 'Dream Symbol from T-Z'");
                   s1=menu.readLine();
                   break;
                   
                   case 4:
                   System.out.println("Treasure:");
                   System.out.println("    To dream that you find treasures,signifies that you have unveiled some hidden skill or talent. You will"); 
                   System.out.println("also receive an expected helping hand in your road to success. To dream that you lose treasures, denotes bad ");
                   System.out.println("luck in business and the revolving door of friends that has passed through your life.To see a treasure chest  ");
                   System.out.println("in your dream, represents your hidden talents. It also represents a sense of security and belonging. You are ");
                   System.out.println("content with where you are in a situation or relationship. To dream that you are looking though the treasure  ");
                   System.out.println("chest, suggests that you are trying to recapture something valuable from your past.");
                   System.out.println("");
                   System.out.println("Press Enter to go back to 'Dream Symbol from T-Z'");
                   s1=menu.readLine();
                   break;
                   
                   case 5:
                   System.out.println("Tunnel:");
                   System.out.println("    To see a tunnel in your dream, represents the vagina, womb, and birth. Thus it may refer to a need for ");
                   System.out.println("security and nurturance.To dream that you are going through a tunnel,suggests that you are exploring aspects ");
                   System.out.println("of your unconscious.You are opening yourself to a brand new awareness.Alternatively,it indicates your limited  ");
                   System.out.println("perspective. To see the light at the end of a tunnel, symbolizes hope.");
                   System.out.println("");
                   System.out.println("Press Enter to go back to 'Dream Symbol from T-Z'");
                   s1=menu.readLine();
                   break;
                   
                   case 6:
                   System.out.println("Umbrella:");
                   System.out.println("    To see an umbrella in your dream, suggests that you are putting up a shield against your emotions and ");
                   System.out.println("trying to avoid dealing with them.It is also symbolic of emotional security.If the umbrella is leaking,then ");
                   System.out.println("it indicates that you are unprepared in facing your problems.To dream that you cannot open you umbrella and ");
                   System.out.println("it is raining, then it suggests that you are open to confronting your own feelings and letting your emotions ");
                   System.out.println("come to the surface.");
                   System.out.println("");
                   System.out.println("Press Enter to go back to 'Dream Symbol from T-Z'");
                   s1=menu.readLine();
                   break;
                   case 7:
                   System.out.println("Uniform:");
                   System.out.println("    To see a person in uniform, indicates that you may be conforming too much and living in too much of a ");
                   System.out.println("regimented manner. Also, you may need to fit in and stop going against the crowd. To see people in strange ");
                   System.out.println("uniforms, signifies disruption");
                   System.out.println("");
                   System.out.println("Press Enter to go back to 'Dream Symbol from T-Z'");
                   s1=menu.readLine();
                   break;
                   
                   case 8:
                   System.out.println("volcano:");
                   System.out.println("    To see a volcano in your dream, denotes violent disputes or repressed thoughts. Your emotions are about");
                   System.out.println("to erupt. Your honesty and fair character may also be threatened or attacked");
                   System.out.println("");
                   System.out.println("Press Enter to go back to 'Dream Symbol from T-Z'");
                   s1=menu.readLine();
                   break;
                   
                   case 9:
                   System.out.println("Walking:");
                   System.out.println("    To dream that you are walking with ease, represents the way you are moving through life and progress ");
                   System.out.println("toward your goals. Consider your destination.To dream that you have difficulties walking, indicates that ");
                   System.out.println("you are reluctant and hesitant in proceeding forward in some situation. You may also be trying to distance");
                   System.out.println("yourself from certain life experiences. The difficulty in walking is a reflection of your current situation");
                   System.out.println("and the obstacles that you are experiencing.To dream that you are walking at night,signifies discontent and");
                   System.out.println("struggle for contentment.");
                   System.out.println("");
                   System.out.println("Press Enter to go back to 'Dream Symbol from T-Z'");
                   s1=menu.readLine();
                   break;
                   
                   case 10:
                   System.out.println("Water:");
                   System.out.println("    To see water in your dream, symbolizes your unconscious and your emotional state of mind. Water is the ");
                   System.out.println("living essence of the psyche and the flow of life energy.  It is also symbolic of spirituality, knowledge, ");
                   System.out.println("healing and refreshment.To dream water is boiling,suggests that you are expressing some emotional turmoil. ");
                   System.out.println("It also may mean that feelings from your unconscious are surfacing and ready to be acknowledged.To see calm, ");
                   System.out.println("clear water in your dream, signifies that you are in tune with your spirituality. It denotes serenity, peace ");
                   System.out.println("of mind, and rejuvenation.");
                   System.out.println("");
                   System.out.println("Press Enter to go back to 'Dream Symbol from T-Z'");
                   s1=menu.readLine();
                   break;
                                      
                   case 11:
                   System.out.println("Window:");                
                   System.out.println("    To see windows in your dream,signifies bright hopes,vast possibilities and insight. To dream that you are ");
                   System.out.println("looking out the window, signifies your outlook on life, your consciousness, point of view, awareness, and ");
                   System.out.println("intuition. You may be reflecting on a decision and seeking guidance. If  you are looking in the window,then ");
                   System.out.println("it indicates that you are doing some soul searching and looking within yourself.To see shut windows in your ");
                   System.out.println("dream,signifies desertion and abandonment.To see shattered and broken windows, denotes misery and disloyalty.");
                   System.out.println("");
                   System.out.println("Press Enter to go back to 'Dream Symbol from T-Z'");
                   s1=menu.readLine();
                   break;
                   
                   case 12:
                   System.out.println("Zoo:");
                   System.out.println("    If you dream that you are having a pleasent day out at the zoo, it suggests that you'll be meeting new "); 
                   System.out.println("people and having a good time soon. If the animals looked unhappy in their cages, your dream may be telling ");
                   System.out.println("you that you feel trapped either by a problem or by the situation you are in, in your waking life. If the ");                
                   System.out.println("animals escape, it may be your unconscious telling you that you too can find a way out of your problems.");
                   System.out.println("");
                   System.out.println("Press Enter to go back to 'Dream Symbol from T-Z'");
                   s1=menu.readLine();
                   break;
                   
                   case 0:
                   l=-1;//to exit from loop
                   System.out.println("");
                   break;
                   
                   default:
                   System.out.println("                                                Wrong Choice");
                   System.out.println("                                        Enter Your Choice Again:");
                   
                }}
                break;
                
                case 0:
                k=-1;
                System.out.println();  
                break;
                
                default:
                System.out.println("                                                Wrong Choice");
                System.out.println("                                        Enter Your Choice Again:");
                
            }}
            break;
            
            case 4://THE DREAM INTERPRETATION TEST
            // string array to store question for the test
            String ques[]={"I've dreamt of being chased or attacked.",
                "I've had dreams in which I was falling.",
                "I've had dreams in which I was lost.",
                "I've dreamt that I'm performing on stage and I don't know my lines.",
                "I've had dreams in which I was flying.",
                "I've had dreams that included beautiful natural scenery.",
                "I've had dreams in which I've tried to talk or scream and I couldn't.",
                "I've dreamt of being lovingly or passionately embraced.",
                "I've had dreams in which I was not in my physical body.",
                "I've dreamt that extensive damage was done to my house.",
                "I dreamt of being healed or recovering from sickness.",
                "I've had dreams in which I find something that I'd previously lost.",
                "I've dreamt of walls or structures collapsing.",
                "I've had dreams in which I received jewellery as a gift.",
                "I've dreamt that I or someone I know was reborn.",
                "I've had dreams about someone saying they are really dead.",
                "I've had dreams involving unsafe or bad road conditions.",
                "I've dreamt of shopping and finding the perfect outfit for a special occasion.",
                "I've had dreams in which I'm missing my ticket or other travel documents.",
                "I've had dreams in which I'm packed and ready to go on a holiday with plenty of time to spare.",
                "I've had dreams involving time pressure while taking an exam.",
                "I've dreamt that obstacles got in my way as I'm trying to catch a plane or other kind of transport.",
                "I've dreamt of driving skillfully or of being able to stop the car in time to avoid a collision.",
                "I've had dreams in which I've done well on a test.",
                "I've had dreams in which I was wearing clothing that was inappropriate to the situation I was in.",
                "I've had dreams in which I was pleasantly warmed by the sun.",
                "I've had dreams in which others applauded or congratulated me for a good performance.",
                "I've dreamt that I caught my plane, train, or other form of transport.",
                "I've had dreams in which I've had casual conversations with someone in my life who has passed away.",
                "I've dreamt of driving on a beautiful day with favorable road conditions."};
            String answer,back,choice8;            
            int t,ans=1,n=1,back1,ch8;
            double score;
            while(n==1)//loop to continue test
            {                
            score=0;
            System.out.println("______________________________________________________________________________________________________________");
            System.out.println("                                       Welcome to THE DREAM INTERPRETATION TEST");
            System.out.println("    Dreams can provide a window into your subconscious mind. They reveal your deepest desires,fears,hopes and");
            System.out.println("wishes that you might not even be aware of.Take our Dream Interpretation Test & find out what your Dream Theme");            
            System.out.println("reveals about you!");
            System.out.println("    There are 3 Sets of questions Each containing 10 questions. Answer all to know about your mental state on ");           
            System.out.println("basis of your dreams.");
            System.out.println();
            System.out.println("                                                    SET I");
            //loop to print the questions and input of results 
            for(t=0;t<10;t++)
            {
            System.out.println("Question "+(t+1));
            System.out.println(ques[t]);
            System.out.println("1.Never");
            System.out.println("2.Once or twice");
            System.out.println("3.Three or four times");
            System.out.println("4.Repeatedly");
            System.out.println("Enter Your Choice:");
            answer=menu.readLine();
            ans=Integer.parseInt(answer);
            System.out.println();
            switch(ans)//to add score according to choice of user
            {
                case 1:
                score+=4;
                break;
                
                case 2:
                score+=3;
                break;
                
                case 3:
                score+=2;
                break;
                
                case 4:
                score+=1;
                break;
                
                default:
                t--;//to go back to same question
                System.out.println("                                                Wrong Choice");
                System.out.println("                                        Enter Your Choice Again:");
                System.out.println();                  
            }}
            System.out.println("Press 0 to Exit Test and know the results");
            System.out.println("Press 1 to continue Set II");
            choice8=menu.readLine();
            ch8=Integer.parseInt(choice8);
            if(ch8!=0)
            {
            System.out.println("");           
            
            System.out.println("                                                    SET II");
            //loop to print the questions and input of results 
            for(t=10;t<20;t++)
            {
            System.out.println("Question "+(t+1));
            System.out.println(ques[t]);
            System.out.println("1.Never");
            System.out.println("2.Once or twice");
            System.out.println("3.Three or four times");
            System.out.println("4.Repeatedly");
            System.out.println("Enter Your Choice:");
            answer=menu.readLine();
            ans=Integer.parseInt(answer);
            System.out.println();
            switch(ans)//to add score according to choice of user
            {
                case 1:
                score+=4;
                break;
                
                case 2:
                score+=3;
                break;
                
                case 3:
                score+=2;
                break;
                
                case 4:
                score+=1;
                break;
                
                default:
                t--;//to go back to same question
                System.out.println("                                                Wrong Choice");
                System.out.println("                                        Enter Your Choice Again:");
                System.out.println();                  
            }}
            System.out.println("Press 0 to Exit Test and know the results");
            System.out.println("Press 1 to continue Set III");
            choice8=menu.readLine();
            ch8=Integer.parseInt(choice8);
            if(ch8!=0)
            {
            System.out.println("");
            System.out.println("                                                    SET III");
            //loop to print the questions and input of results 
            for(t=20;t<30;t++)
            {
            System.out.println("Question "+(t+1));
            System.out.println(ques[t]);
            System.out.println("1.Never");
            System.out.println("2.Once or twice");
            System.out.println("3.Three or four times");
            System.out.println("4.Repeatedly");
            System.out.println("Enter Your Choice:");
            answer=menu.readLine();
            ans=Integer.parseInt(answer);
            System.out.println();
            switch(ans)//to add score according to choice of user
            {
                case 1:
                score+=4;
                break;
                
                case 2:
                score+=3;
                break;
                
                case 3:
                score+=2;
                break;
                
                case 4:
                score+=1;
                break;
                
                default:
                t--;//to go back to same question
                System.out.println("                                                Wrong Choice");
                System.out.println("                                        Enter Your Choice Again:");
                System.out.println();                  
            }}}}
            //when all the questions have been answered, the total marks and the user's result will be shown
            System.out.println("______________________________________________________________________________________________________________");
            System.out.println("                          Your DREAM INTERPRETATION TEST has been successfully performed.");
            System.out.println("                                               Here are your results");
            double percent=(score/(t*4))*100;//since is no. of questions & maximum marks for each question is 4
            System.out.println("You have scored "+score+" marks out of "+(t*4));
            System.out.println("Your score out of 100 is "+percent);
            System.out.println();
            //if the totalMarks is less than or equal to 25% then this result will be shown on the terminal window
            if(percent<=25)
            {
                System.out.println("    This type of dreaming you`re not reaching your full potential. It has a negative impact on all aspects"); 
                System.out.println("of life such as relationship,your emotional health and level of motivation. As a result of your behaviour,");
                System.out.println("others may view you as being critical, inexpressive, inhibited, detached, cold, or even condescending.");
                System.out.println("Your difficulties relating to others and dealing successfully with your own emotions may have a negative"); 
                System.out.println("impact on your health. Chances are that you also have difficulty bouncing back from life's problems."); 
                System.out.println("    You can improve your situation by being regular at your work and being cheerful and at every point if life,");
                System.out.println("you should think a lot before taking any decision & should take care of yourself");
                System.out.println("");
            } 
            //if the totalMarks is greater than 25% and lesser or equal to 50% ,then this result will be shown on the terminal window
            else if(percent>25 && percent<=50)
            {
                System.out.println("    This type of dreaming means that you can sometimes recognize your emotions and of others also. You are");
                System.out.println("also able to communicate some of your feelings effectively but you are not able to or you don't want to ");
                System.out.println("express them in a more effective manner. Although you are able to recognize and label some of your feelings,");
                System.out.println("but this can be done in a more effective way. You need to reconcile your feelings and needs with others ");
                System.out.println("invloved in a more satisfactory way. By learning and practicing new skills and more effective ways of dealing");
                System.out.println("with people, you could improve your situation.");
                System.out.println("    You should also try to express your needs more and move into a 'more cozy zone of comfort' with your loved");
                System.out.println("ones and friends.You'll be happier - and those around you will understand you better,and be grateful for the");
                System.out.println("feedback.The benefits will be numerous,including stronger relationships, a more successful career and  better");
                System.out.println(" emotional health. Most of all, you will be an all-around happier person.");
                System.out.println("");                
            }
            //if the totalMarks is greater than 50% and lesser or equal to 75% ,then this result will be shown on the terminal window
            else if(percent>50 && percent<=75)
            {
                System.out.println("    This type of dreaming means that, in general, you are able to express your feelings clearly in appropriate");
                System.out.println("situations. You are optimistic and positive, and adapt well to changed circumstances. You deal effectively");
                System.out.println("with stress, interact with others and communicate adequately.You are comfortable with yourself, and you know");
                System.out.println("and appreciate your talents and strong points as well as your weaknesses. You are able to motivate");
                System.out.println("yourself, find the energy and the strength necessary to complete what you need to do to reach your goals.");
                System.out.println("You are one of the resilient people who bounce back after major drawbacks, survive hardship without bitterness,");
                System.out.println("and still manage to empathize with others. These skills will certainly bring you long-term benefits such as ");
                System.out.println("stronger relationships, better health and personal happiness.");
                System.out.println("");
                
            }
            //if the totalMarks is greater than 75%, then this result will be shown on the terminal window
            else 
            {
                System.out.println("    The recurrent theme of your dream life is Mastery. You're dreaming about maximizing opportunities and ");
                System.out.println("achieving well-deserved success. They involve scenarios in which you're doing something well or mastering");
                System.out.println("particular skills and talents. This means that in some area of your waking life,you are adequately prepared");
                System.out.println("and things are working out just the way you want.");
                System.out.println("These are dreams that involve having a positive experience.In these dreams you can go anywhere you wish.");
                System.out.println("According to dream theorists, thesesort of means that you feel well prepared in your life. When you have a");
                System.out.println("dream like the one above, your unconscious mind is revealing your confidence and pleasure in feeling ready ");
                System.out.println("for life's challenges.");
                System.out.println("");
            }
            System.out.println("Press 1 to go back to 'THE DREAM INTERPRETATION TEST'");
            System.out.println("Press 0 to Return to Main Menu");  
            back=menu.readLine();
            back1=Integer.parseInt(back);
            if(back1==0)
            n=-1;//to exit from loop
            }
            break;
            
            case 5:
            int r=1;
            String choice7;
            int ch7;
            while(r==1)//loop to continue the task as per user`s choice
            {
            System.out.println("                                               Sleep Analysis");
            System.out.println("       Follow the simple Instructions to know your character on basis of your sleeping sence");
            System.out.println("");
            System.out.println("1.Side sleeper:");
            System.out.println("Do you sleep sideways lying on one arm?");
            System.out.println("1.Yes");
            System.out.println("2.No");
            System.out.println("Enter Your Choice:");
            choice7=menu.readLine();
            ch7=Integer.parseInt(choice7);            
            System.out.println("");
            //if user inputs 1(Yes) then result will be shown otherwise moves to another question
            if(ch7==1)
            {             
            System.out.println("Side sleeper:");
            System.out.println("   You are gentle, polite sincere and loving. well,nothing is perfect. Built up your self-confidence and learn");
            System.out.println("to accept mistakes and imperfection. happiness will then come your way.");
            System.out.println(""); 
            }
            
            System.out.println("2.Side sleeper with knee bended:");
            System.out.println("Do you sleep sideways with knee bended?");
            System.out.println("1.Yes");
            System.out.println("2.No");
            System.out.println("Enter Your Choice:");
            choice7=menu.readLine();
            ch7=Integer.parseInt(choice7);            
            System.out.println("");
            if(ch7==1)
            {             
            System.out.println("side sleeper with knee bended:");
            System.out.println("    You are inclined to be fussy always whining and complaining. nervousness is probably your second name. You");
            System.out.println("tense up easily and get overly excited over small matters. life isn't such a big deal. learn to relax.");      
            System.out.println(""); 
            }
            
            System.out.println("3.Unknown covering from head to toe:");
            System.out.println("Do you sleep covering yourself with bedsheet from head to toe?");
            System.out.println("1.Yes");
            System.out.println("2.No");
            System.out.println("Enter Your Choice:");
            choice7=menu.readLine();
            ch7=Integer.parseInt(choice7);            
            System.out.println("");
            if(ch7==1)
            {             
            System.out.println("Unknown covering from head to toe:");
            System.out.println("    You may appear a real machi in public,but deep down inside you are weak and shy. you tend to keep loads of");
            System.out.println("secret. if you encounter any problem, you will rather keep it to yourself and agonise over it than ask for ");
            System.out.println("help. no wonder you grimace in your sleep!");
            System.out.println(""); 
            }
            System.out.println("4.Unknown cuddled up:");
            System.out.println("Do you unknownly cuddled up ?");
            System.out.println("1.Yes");
            System.out.println("2.No");
            System.out.println("Enter Your Choice:");
            choice7=menu.readLine();
            ch7=Integer.parseInt(choice7);            
            System.out.println("");
            if(ch7==1)
            {             
            System.out.println("Unknown cuddled up");
            System.out.println("    You usually feel lonely and depressed because you are obsessed with your past faliure and setbacks.You are");
            System.out.println(" hesitant and indecisive, giving others an impression that love has been missing in you life.");
            System.out.println(""); 
            }
            
            System.out.println("5.Back sleeper with legs crossed:");
            System.out.println("Do you on your back with your legs crossed?");
            System.out.println("1.Yes");
            System.out.println("2.No");
            System.out.println("Enter Your Choice:");
            choice7=menu.readLine();
            ch7=Integer.parseInt(choice7);            
            System.out.println("");
            if(ch7==1)
            {             
            System.out.println("Back sleeper with your legs crossed:");      
            System.out.println("    Anyone who sleeps with crossed legs is said to be self-obsessed and finds difficulty in accepting changes.");
            System.out.println("Solitude is your priority. yes, your redeeming quality is your threshold for tolerence! ");
            System.out.println(""); 
            }
            
            System.out.println("6.Back sleeper with arms crossed to support the head:");
            System.out.println("Do you on your back with your arms crossed to support the head?");
            System.out.println("1.Yes");
            System.out.println("2.No");
            System.out.println("Enter Your Choice:");
            choice7=menu.readLine();
            ch7=Integer.parseInt(choice7);            
            System.out.println("");
            if(ch7==1)
            {             
            System.out.println("Back sleeper with arms crossed to support the head :");
            System.out.println("    You are highly intelligent and enthusiastic to learn. yet sometimes you are filled with cranky ideas which");
            System.out.println(" people find hard to follow. you take good care of your family, but the problem is you hardly love anybody.");
            System.out.println(""); 
            }
            
            System.out.println("7.Tummy sleeper sleeping on the stomach:");
            System.out.println("Do you on your stomach?");
            System.out.println("1.Yes");
            System.out.println("2.No");
            System.out.println("Enter Your Choice:");
            choice7=menu.readLine();
            ch7=Integer.parseInt(choice7);            
            System.out.println("");
            if(ch7==1)
            {             
            System.out.println("Tummy sleeper sleeping on the stomach:");      
            System.out.println("    If you sleep facedown all night, you are likely to be narrow-minded. You are probably self-centered and ");
            System.out.println("always force people to comply with your own needs. you are also likely to be reckless and desultory. Its time");
            System.out.println("to change your sleeping posture.?    ");
            System.out.println(""); 
            }
            
            System.out.println("8.Side sleeping lying on one side:");
            System.out.println("Do you sleep sideways lying on one side?");
            System.out.println("1.Yes");
            System.out.println("2.No");
            System.out.println("Enter Your Choice:");
            choice7=menu.readLine();
            ch7=Integer.parseInt(choice7);            
            System.out.println("");
            if(ch7==1)
            {             
            System.out.println("Side sleping lying on one side:");
            System.out.println("    This posture indicates that you are a confident person. you will see success in whatever you undertake, ");
            System.out.println("owning to your unrelentness endeavour. people who sleep on there right side with their right arm streaching ");
            System.out.println("over their head and lying on their right side are said to be blessed with power and fortune. ");
            System.out.println(""); 
            }
            
            System.out.println("9.Side sleeper curling up :");
            System.out.println("Do you sleep sideways curling up ?");
            System.out.println("1.Yes");
            System.out.println("2.No");
            System.out.println("Enter Your Choice:");
            choice7=menu.readLine();
            ch7=Integer.parseInt(choice7);            
            System.out.println("");
            if(ch7==1)
            {             
            System.out.println("Side sleeper curling up :");
            System.out.println("    Selfish,jealous and vindictive are words that describe you.People around you got to be careful not to step");
            System.out.println("on your toes as you are easily irritated!");
            System.out.println(""); 
            }
            
            System.out.println("10.Back sleeper with arms and legs sprad out:");
            System.out.println("Do you on your back with arms and legs sprad out?");
            System.out.println("1.Yes");
            System.out.println("2.No");
            System.out.println("Enter Your Choice:");
            choice7=menu.readLine();
            ch7=Integer.parseInt(choice7);            
            System.out.println("");
            if(ch7==1)
            {             
            System.out.println("Back sleeper with arms and legs sprad out:");
            System.out.println("    What a liberty - living soul! Well, this posture reveals your true identity. Comfort - lover and beauty -");
            System.out.println("worshipper,you are also a real spendthrift(but luckly you earn as much). Your other desireable trait is that ");
            System.out.println("you area bit nosy and seem to enjoy gossiping.");
            System.out.println("");
            }
            System.out.println("                                     Your Sleep Analysis is finished");
            System.out.println("Press 1 to 'Return to Sleep Analysis'");
            System.out.println("Press 0 to 'Return to Main Menu'");
            choice7=menu.readLine();
            r=Integer.parseInt(choice7);
            }   
            break;
            
            case 6:            
            int m=1;
            //string array to store name of viewers
            String name[]=new String[100];
            name[0]="Ankit Tulsyan";
            name[1]="Atul Modi";
            name[2]="Apoorva Gupta";
            name[3]="Akash Dixit";
            //string array to store e mail id`s of viewers
            String email[]=new String[100];
            email[0]="ankittulsyany2k@yahoo.com";
            email[1]="atul_modi8490@tahoo.com";
            email[2]="apoorvagupta001@yahoo.com";
            email[3]="akashdixit1990@rediffmail.com";
            //string array to store location of viewers
            String location[]=new String[100];
            location[0]="New york";
            location[1]="Sweden";
            location[2]="Brazil";
            location[3]="India";
            //string array to store date of viewing
            String date[]=new String[100];
            date[0]="November 5 2005";
            date[1]="November 7 2005";
            date[2]="November 11 2005";
            date[3]="November 14 2005";
            //string array to store viewa of viewers about the program
            String comments[]=new String[100];
            comments[0]="This is very nice program.The interpretations are interesting and mostly accurate.";
            comments[1]="I like it a lot and so far i think i can have my dream test that needs to be taken.Thanks for creating this.";
            comments[2]="Your program is pretty informative. My dreams are really vivid and the dictionacy helps alot. Thanks!!! ";
            comments[3]="I love it.It seems to always have the correct answer to my dreams - it reflects the things that are going on in my life.";
            int c=3;
            int read;
            while(m==1)//loop to continue the task as per user`s choice
            {
            System.out.println("________________________________________________________________________________________________________________");    
            System.out.println("                                           Welcome to our Guestbook");
            System.out.println("________________________________________________________________________________________________________________");    
            System.out.println("Press 1 to sign our Guestbook");
            System.out.println("Press 2 to read our Guestbook");
            System.out.println("Press 0 to Return to Main Menu");
            System.out.println("                                         Enter Your Choice:");
            String choice6=menu.readLine();
            int ch6=Integer.parseInt(choice6);
            System.out.println();
            switch(ch6)
            {
                case 1:       
                //to enter data for signing the guestbook
                c++;//counter for subscript 
                System.out.println("                              You are most welcome to sign our Guestbook");
                System.out.println("Enter Your Full Name:");
                String name1=menu.readLine();//string to store name
                name[c]=name1;//to store string in string array
                System.out.println("Enter Your E-Mail:");
                String e=menu.readLine();//string to store email
                email[c]=e;//to store string in string array
                System.out.println("Enter Your Location:");
                String lo=menu.readLine();//string to store location
                location[c]=lo;//to store string in string array
                System.out.println("Enter Date:");
                String d=menu.readLine();//string to store date
                date[c]=d;//to store string in string array
                System.out.println("Enter Your Views about our program:");
                String co=menu.readLine();//string to store views of user
                comments[c]=co;  //to store string in string array
                System.out.println("");
                System.out.println("                                        Thank you for signing our Guestbook"); 
                System.out.println("Press Enter to Return to 'Visit Our Guestbook'");
                s1=menu.readLine();                
                break;
                
                case 2:
                //to display stored and current signed names in guestbook
                System.out.println("                                           Welcome to read our Guestbook"); 
                //for loop to print guestbook
                for(read=0;read<=c;read++)
                {
                System.out.println("Name:");
                System.out.println("   "+name[read]);
                System.out.println("E-Mail:");
                System.out.println("   "+email[read]);
                System.out.println("Location:");
                System.out.println("   "+location[read]);
                System.out.println("Date:");
                System.out.println("   "+date[read]);
                System.out.println("Wrote...");
                System.out.println("   "+comments[read]);
                System.out.println("");
                }
                System.out.println("Press Enter to Return to 'Visit Our Guestbook'");
                s1=menu.readLine();                
                break;
                
                case 0:
                m=-1;//to exit loop
                break;
                
                default:
                System.out.println("                                                Wrong Choice");
                System.out.println("                                        Enter Your Choice Again:");                
            }}
            break;
            
            case 7:
            System.out.println("______________________________________________________________________________________________________________");
            System.out.println("                                             Acknowledgements");
            System.out.println("                                           ###################");
            System.out.println("    I greatly acknowledge the contribution of the undermentioned persons. I really could not have accomplished");
            System.out.println("the work on this program without the help, encouragement, support and and advice of undermentioned persons.");
            System.out.println("");
            System.out.println("* Mr. Manish Seksaria - Computer Teacher of Seth Anandram Japuria School who taught us every thing and He ");
            System.out.println("                        willingly helped us in our project and encouraged us do better at every point of time.");
            System.out.println("");
            System.out.println("* Mr. Sigmund Frued  -  Author of the book 'The Interpretation of Dreams' from where I could have a complete ");
            System.out.println("                        study on Dream Analysis and Dream Interpretation.");
            System.out.println("");
            System.out.println("* Mrs. Lori Reid     -  Author of the book 'Dreams' published by 'Scolastic Book Club' for providing details ");
            System.out.println("                        about Dream Symbols, Types of Dreams & Interpretations of Dream Symbols.");
            System.out.println("");
            System.out.println("* www.Tikletest.com  -  An internet site which gave halp for preparing THE DREAM INTERPRETATION TEST.");
            System.out.println("");
            System.out.println("       So, I would like to thank will all my heart to all of them for their respective contributions.");
            System.out.println("      My special thanks to Seth Anandram Japuria School Computer Society for cordinating with my work.");
            System.out.println("");
            System.out.println("______________________________________________________________________________________________________________");
            System.out.println("Press Enter to Return to 'Main Menu'");
            s1=menu.readLine();
            break;
            
            
            case 8:
            System.out.println("                                                   Exit");
            System.out.println("                                       Thank you for using this program");
            System.out.println("                                   You can now close the terminal window");            
            System.out.println("                                 ###########################################");
            System.out.println("                                                                                        Made By :-"); 
            System.out.println("                                                                                            Shivam Agarwal");
            System.out.println("                                                                                                 X - B");
            i=-1;//to exit from main loop 
            break;
                        
            default:// main default
            System.out.println("                                                Wrong Choice");
            System.out.println("                                        Enter Your Choice Again:");
        }// brace of main switch
        }// brace of main while loop
    }// brace of function
}// brace of class

/*
 *                                      VARIABLE DECLARATION
 * VARIABLE      DATA TYPE      INFORMATION
 * choice        (String)        To store choice of user in 'Main Menu'
 * choice2       (String)        To store choice of user in 'Types of Dreams'
 * choice3       (String)        To store choice of user in 'Dream Dictionary'
 * choice5       (String)        To store choice of user in 'dream symbols'
 * choice6       (String)        To store choice of user in 'Guestbook'
 * choice7       (String)        To store choice of user in 'Sleep analysis'
 * choice8       (String)        To store choice of user in 'THE DREAM INTERPRETATION TEST'
 * s1            (String)        To hold the pogram till user press Enter 
 * s2            (String)        To hold the pogram till user press Enter
 * name1         (String)        To store name of user in Guestbook
 * e             (String)        To store email id of user in Guestbook
 * lo            (String)        To store location of user in Guestbook
 * d             (String)        To store date of user in Guestbook
 * co            (String)        To store views of user in Guestbook
 * 
 * 
 * i              (int)          Used in while loop of 'Main Menu'
 * j              (int)          Used in while loop of 'Types of Dreams'
 * k              (int)          Used in while loop of 'Dream Dictionary'
 * l              (int)          Used in while loop of 'Dream symbols'
 * m              (int)          Used in while loop of 'Guestbook'
 * n              (int)          Used in while loop of 'THE DREAM INTERPRETATION TEST'
 * t              (int)          Used in for loop of 'THE DREAM INTERPRETATION TEST' to print questions
 * r              (int)          Used in while loop of 'Sleep analysis'
 * c              (int)          Used to store subscript to call value fomm array in 'Guestbook'
 * ch             (int)          To convert user`s choice from String to intger form
 * ch1            (int)          To convert user`s choice from String to intger form
 * ch2            (int)          To convert user`s choice from String to intger form
 * ch3            (int)          To convert user`s choice from String to intger form
 * ch5            (int)          To convert user`s choice from String to intger form
 * ch6            (int)          To convert user`s choice from String to intger form
 * ch7            (int)          To convert user`s choice from String to intger form
 * ch8            (int)          To convert user`s choice from String to intger form
 * ans            (int)          To convert user`s choice from String to intger form
 * back1          (int)          To convert user`s choice from String to intger form
 * read           (int)          Used in for loop to print guestbook
 * 
 * score         (double)        To calculate score of dream interpretation test 
 * percent       (double)        To calculate of score   
 * date1          (Date)         To display date 
 */   
