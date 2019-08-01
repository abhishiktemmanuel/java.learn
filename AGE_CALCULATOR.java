import java.util.*;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
class AGE_CALCULATOR{
    public static void main(){
        Scanner ob=new Scanner(System.in);
        DateFormat dateFormat= new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        System.out.println("INPUT YOUR BIRTH DATE in DD/MM/YYYY FORMAT");
        String bd=ob.nextLine();
        String td=dateFormat.format(date);
        int d=0,m=0,y=0,feb=28;
        y= Integer.valueOf(td.substring(6,10))-Integer.valueOf(bd.substring(6,10))-1;
        m= Integer.valueOf(td.substring(3,5))+11-Integer.valueOf(bd.substring(3,5));
        if(m>=12){
            y=y+1;
            m=m-12;
        }
        if(Integer.valueOf(bd.substring(6,10))%4==0&&Integer.valueOf(bd.substring(6,10))%100!=0)
            feb=29;
        else if(Integer.valueOf(bd.substring(6,10))%100==0&&Integer.valueOf(bd.substring(6,10))%400==0)
            feb=29;
        int md[]={31,feb,31,30,31,30,31,31,30,31,30,31};
        d=Integer.valueOf(td.substring(0,2))+md[Integer.valueOf(bd.substring(3,5))-1]-Integer.valueOf(bd.substring(0,2));
        if(d>31){
            m=m+1;
            d=d-31;
        }
        System.out.println("YOUR AGE IS ");
        System.out.println(d+"/"+m+"/"+y);
    }
}