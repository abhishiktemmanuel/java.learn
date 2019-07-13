import java.util.*;
class all_pallendrom{
    Scanner ob=new Scanner(System.in);
    void main(){
        System.out.println("ENTER WORD");
        String s=" "+ob.nextLine()+" ";
        for(int i=1,k=0;i<s.length()-1;i++,k=0)
            while(s.charAt(i-k)==s.charAt(i+k))
                System.out.println(s.substring((i-k),(i+(++k))));
    }
}
/*import java.util.*;
class all_pallendrom{
    Scanner ob=new Scanner (System.in);
    void main(){
        int t=1,k=0;
        System.out.println("ENTER WORD");
        String s=" "+ob.nextLine()+" ";
        for(int i=1;i<s.length()-1;i++,t=1,k=0)
            while(t==1)
                if(s.charAt(i-k)==s.charAt(i+k))
                    System.out.println(s.substring((i-k),(i+(++k))));
                else
                    t=0;
    }
}*/