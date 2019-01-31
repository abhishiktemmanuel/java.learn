import java.util.*;
class Q10gone_wrong_but_still_good
{
    Scanner ob=new Scanner(System.in);
    void main()
    {
        System.out.println("ENTER STING");
        String str=ob.nextLine();
        StringTokenizer s=new StringTokenizer (str," ,.?'/|");
        int n=s.countTokens();
        String arr[]=new String[n];
        int flag=0;
        for(int i=0;i<n;i++)
          arr[i]=s.nextToken();
        for(int i=0;i<n;i++)
        {
          for(int j=1+i;j<n;j++)
            {
                
                if(arr[i].equals(arr[j]))
               {
                   flag=1;
                   break;
                  // System.out.println(arr[i]);
               }
            }
           if(flag==1)
           System.out.println(arr[i]);
           flag=0;
            }
        }
    }
//MAHENDRA SINGH DHONI IS THE CAPTAIN OF THE INDIAN CRICKET TEAM SAURAV GANGOLI IS THE EX-CAPTAIN OF THE INDIAN CRICKET TEAM

