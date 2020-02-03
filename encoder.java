import java.util.*;
class encoder
{
    public static void main(String args[])
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("INPUT STRING");//ASK USER FOR STRING INPUT
        String s=ob.nextLine();//INPUT STRING
        s=s+" ";//SPACE ADDED AT THE END OF STRING TO AVOID 'INDEX OUT OF BOUNDS EXCEPTION'
        String s1="";//STRING TO STORE DECODED MESSAGE
        System.out.println("INPUT SHIFT VALUE");//ASK USER FOR SHIFT VALUE INPUT
        int sv=ob.nextInt();//INPUT SHIFT VALUE
        if(sv<26&&sv>-1)//CONDITION TO CHECK INPUTED SHIFT VALUE IS WITHIN RANGE
        {
            for(int i=0;i<(s.length()-1);i++)//LOOP TO READ EACH CHARACTER OF THE INPUTTED STRING
            {
                char d=s.charAt(i);//CHARACTER EXTRACTION
                int nd=(int)d;//FINDING ASCII VALUE OF CHARACTER
                nd=nd+sv-1;//SHIFTING CHARACTER VALUE
                if(nd>90)//CHECKING IF MODIFIED CHARACTER IS WITHIN RANGE
                    nd=nd-26;
                char k=(char)nd;//MODIFYING CHARACTER
                if(s.charAt(i+1)==d&&k=='Q')//CHECKING IF CONSECTIVE 'Q' ARE FORMED
                {
                    s1=s1+" ";//REPLACING CONSECTIVE 'Q' WITH SPACE
                    i++;
                }
                    else if(d!=' ')//AVOIDING UNWANTED SPACES
                    s1=s1+k;//CREATING MODIFIED STRING WITH USEFULL MESSAGE
            }
            System.out.println(s1);//PRINTING DECODED MESSAGE
        }
        else//CONDITION TO EXIT PROGRAM
            System.exit(0);
    }
}