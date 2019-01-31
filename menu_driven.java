import java.util.*;
public class menu_driven
{
    void main()
    {
        System.out.println("PRESS 1.  TO CHECK A NUMBER IS PRIME OR NOT");
        System.out.println("PRESS 2.  TO CHECK NUMBER IS ARMSTRONG OR NOT");
        System.out.println("PRESS 3.  TO ADD TWO NUMBERS");
        System.out.println("PRESS 4.  TO FIND DIFFRENCE OF THE TWO NUMBERS");
        System.out.println("PRESS 5.  TO FIND THE PRODUCT OF TWO NUMBERS");
        System.out.println("PRESS 6.  TO FIND THE QUOTIENT OBTAINED ON DIVIDING TWO NUMBERS");
        System.out.println("PRESS 7.  TO FIND THE REMAINDER OBTAINED ON DIVIDING TWO NUMBERS");
        System.out.println("PRESS 8.  TO CALCULATE THE TOTAL PERCENTAGE OF A STUDENT");
        System.out.println("PRESS 9.  TO CALCULATE THE AREA OF RECTANGLE");
        System.out.println("PRESS 10. TO CALCULATE THE AREA OF SQUARE");
        System.out.println("PRESS 11. TO CALCULATE THE AREA OF TRIANGLE");
        System.out.println("PRESS 12. TO CALCULATE THE AREA OF SPHERE");
        System.out.println("PRESS 13. TO CALCULATE THE VOLUME OF A CUBOID");
        System.out.println("PRESS 14. TO CALCULATE THE VOLUME OF A CUBE");
        System.out.println("PRESS 15. TO CALCULATE THE VOLUME OF A SPHERE");
        System.out.println("PRESS 16. TO CALCULATE THE VOLUME OF CYLINDER");
        System.out.println("PRESS 17. TO CLACULATE AMOUNT ON SIMPLE INTREST");
        System.out.println("PRESS 18. TO CLACULATE AMOUNT ON COMPUND INTREST");
        System.out.println("PRESS 19. TO CALCULATE nth TERM USING ARITHEMATIC PROGRESSION");
        System.out.println("PRESS 20. TO CLACULATE SQUARE ROOT");
        System.out.println("PRESS 21. TO CLACULATE THE VALUE OF NUMBER a TO THE POWER n");
        System.out.println("ENTER CHOICE");
        Scanner obj=new Scanner(System.in);
        int choice= obj.nextInt();
        switch(choice)
        {
        case 1 :
         System.out.println("ENTER THE NUMBER");
        int n=obj.nextInt();
        
        int c=0;
        for( int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                c=c+1;
            }
        }
        if(c==2)
        {
        System.out.println("Number is prime");
        }
        else

        
        System.out.println("not pime");
        break;
        
        case 2: 
        
        System.out.println("ENTER THE NUMBER");
        int n_=obj.nextInt();
        
        int d;int k;int s=0;int m=n_;
        while(n_!=0)
        {
         d=n_%10;
         k=d*d*d;
         s=s+k;
         n_=n_/10;
        }
        if(s==m)
        {
        System.out.print("No is armstrong");
        }
        else
        {
        System.out.print("not armstrong");
        }
        break;
        
        case 3:
        
         System.out.println("ENTER THE FIRST NUMBER");
        double A=obj.nextInt();
        
         System.out.println("ENTER THE SECOND NUMBER");
        double B=obj.nextInt();
        double sum=A+B;
        System.out.println("sum="+sum);
        break;
          
        case 4:
        
         System.out.println("ENTER THE FIRST NUMBER");
        double enter_the_first__number=obj.nextInt();
        
         System.out.println("ENTER THE SECOND NUMBER");
        double enter_the_second__number=obj.nextInt();
        double diffrence=enter_the_first__number-enter_the_second__number;
        System.out.println("Difference="+diffrence);
        break;
        
        case 5:
        
         System.out.println("ENTER THE FIRST NUMBER");
        double the_first__number=obj.nextInt();
        
         System.out.println("ENTER THE SECOND NUMBER");
        double the_second__number=obj.nextInt();
        double prod=the_first__number*the_second__number;
        System.out.println("Product="+prod);
        break;
 
        case 6:
         System.out.println("ENTER THE DIVIDENT");
         double a=obj.nextInt();
         
         System.out.println("ENTER THE DIVISER");
         double b=obj.nextInt();
        double q=a/b;
        System.out.println("Quotient="+q);
        break;
        
        case 7:
         System.out.println("ENTER THE DVIDENT");
          int a__=obj.nextInt();
         
         System.out.println("ENTER THE DIVISER");
         int b__=obj.nextInt();
        int r=a__%b__;
        System.out.println("remainder="+r);
        break;
        
        case 8:
         System.out.println("ENTER THE MAXIMUM MARKS THAT CAN BE OBTAINED");
         double maximummarks=obj.nextInt();
         System.out.println("ENTER THE MARKS OBTAINED IN PHYSICS");
          double physics=obj.nextInt();
         System.out.println("ENTER THE MARKS OBTAINED IN CHEMISTRY");
          double chemistry=obj.nextInt();
         System.out.println("ENTER THE MARKS OBTAINED IN ENDLISH LITERATURE");
          double english2=obj.nextInt();
         System.out.println("ENTER THE MARKS OBTAINED IN ENGLISH LANGUGE");
          double english1=obj.nextInt();
         System.out.println("ENTER THE MARKS OBTAINED IN MATHS");
          double maths=obj.nextInt();
         System.out.println("ENTER THE MARKS OBTAINED IN HISTORY");
          double history=obj.nextInt();
         System.out.println("ENTER THE MARKS OBTAINED IN SIXTH SUBJECT");
          double sixthsubject=obj.nextInt();
         System.out.println("ENTER THE MARKS OBTAINED IN GEOGRAPHY");
          double geography=obj.nextInt();
         System.out.println("ENTER THE MARKS OBTAINED IN HINDI");
          double hindi=obj.nextInt();
         System.out.println("ENTER THE MARKS OBTAINED IN BIOLOGY");
          double biology=obj.nextInt();
        double a___=physics*100/maximummarks;
        double b___=chemistry*100/maximummarks;
        double c___=biology*100/maximummarks;
        double d___=maths*100/maximummarks;
        double e___=english1*100/maximummarks;
        double f___=english2*100/maximummarks;
        double g___=history*100/maximummarks;
        double h___=geography*100/maximummarks;
        double i___=sixthsubject*100/maximummarks;
        double j___=hindi*100/maximummarks;
        double percentage=(a___+b___+c___+d___+e___+f___+g___+h___+i___+j___)*10/maximummarks;
        System.out.println("total percentage="+percentage);
        break;
        
        case 9:
        System.out.println("ENTER THE LENGTH");
          double l=obj.nextInt();
          System.out.println("ENTER THE BREDTH");
          double b____=obj.nextInt();
        double k_=l*b____;
        System.out.println("Area of the given rectangle="+k_);
        break;
        
        case 10:
        System.out.println("ENTER THE LENGTH 0f any one side");
          double a____=obj.nextInt();
         
        double km=a____*a____;
        System.out.println("Area of the given square="+km);
        break;
        
        case 11:
        System.out.println("ENTER THE HEIGHT of the triangle");
          double h=obj.nextInt();
          System.out.println("ENTER THE LENGTH OF BASE of the triangle");
          double b_____=obj.nextInt();
        double kn=1/2*b_____*h;
        System.out.println("Area of the given triangle="+kn);
        break;
        
        case 12:System.out.println("ENTER THE RADIUS of the sphere");
          double r1=obj.nextInt();
          
        double ko=22/7*r1*r1;
        System.out.println("Area of the given circle="+ko);
        break;
        
        case 13:System.out.println("ENTER THE LENGTH of the cubid");
          double lm=obj.nextInt();
          System.out.println("ENTER THE HEIGHT of the cuboid");
          double hm=obj.nextInt();
          System.out.println("ENTER THE BREDTH of the cuboid");
          double bm=obj.nextInt();
        double kz=lm*bm*hm;
        System.out.println("Volume of the given cuboid="+kz);
        break;
        
        case 14:System.out.println("ENTER THE LENGTH of any side of the given cube");
          double am=obj.nextInt();
        double kl=am*am*am;
        System.out.println("Volume of the given cube="+kl);
        break;
        
        case 15:
        System.out.println("ENTER THE RADIUS of the given sphere");
          double ro=obj.nextInt();
        double k1=4/3*22/7*ro*ro*ro;
        System.out.println("Volume of the given sphere="+k1);
        break;
        
        case 16:
        System.out.println("ENTER THE height of the cylinder");
          double ho=obj.nextInt();
          System.out.println("ENTER THE RADIUS of the cylinder");
          double rm=obj.nextInt();
        double k0=22/7*rm*rm*ho;
        System.out.println("Volume of the given cylinder="+k0);
        break;
        
        case 17:
        System.out.println("ENTER THE PRINCIPAL ");
          double p=obj.nextInt();
          System.out.println("ENTER THE RATE OF INTREST");
          double rj=obj.nextInt();
          System.out.println("ENTER THE TIME");
          double t=obj.nextInt();
        double e=p*rj*t/100;
        double kj=e+p;
        System.out.println("AMOUNT ON SIMPLE INTREST FOR GIVEN PRINCIPAL="+kj);
        break;
        
        case 18:System.out.println("ENTER THE PRINCIPAL");
          double P=obj.nextInt();
        System.out.println("ENTER THE RATE OF INTREST");
          double rK=obj.nextInt();
          System.out.println("ENTER THE TIME");
          double N=obj.nextInt();
          
        double e0=rK/100;
        double kk=P*Math.pow(1+e0,N);
        System.out.println("AMOUNT ON COMPOUND INTREST FOR GIVEN PRINCIPAL="+kk);
        break;
        
        case 19:
        
        System.out.println("ENTER THE FIRST TERM IN THE SERISE");
        
        double ap=obj.nextInt();
         System.out.println("ENTER THE SECQUENCE OF THE TERM TO BE FOUND");
        
        double ap1=obj.nextInt();
         System.out.println("ENTER THE COMMON DIFFRENCE in the sequence ");
        
        double ap2=obj.nextInt();
        double AP=ap+(ap1-1)*ap2;
         System.out.println("THE VALUE UF THE SEQUENCE UF THE TERM IS="+AP);
        
        
        break;
        case 20:
        System.out.println("ENTER THE NUMBER TO CALCULATE IT's SQUARE ROOT");
        double root=obj.nextInt();
        
        double root1=Math.sqrt(root);
            System.out.print("THE SQUARE ROOT OF "+root);
            System.out.println(" IS="+root1);
        break;
        case 21:
        System.out.println("ENTER THE NUMBER");
        double sq=obj.nextInt();
        System.out.print("ENTER THE POWER TO WHICH");
        System.out.print(+sq);
        System.out.println("IS RAISE TO");
        double sq1=obj.nextInt();
        double SQ=Math.pow(sq,sq1);
            System.out.print("THE VALUE OF");
            System.out.print(" "+sq);
            System.out.print("TO THE POWER");
            System.out.print(" "+sq1);
            System.out.println(" is="+SQ);
        break;
        default :
        System.out.println("!!WRONG CHOICE PLEASE RETRY!!");
        int cha=obj.nextInt();
        choice=cha;
         switch(choice)
         {
             
         }
    }
}
}


        
        
    