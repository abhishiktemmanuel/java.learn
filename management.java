import java.util.*;
class management
{
    static void main()
    {
     Scanner inpt=new Scanner(System.in);   
     String origname[]=new String[10];
     String origsub[]=new String[10];
     String phygrp1name[]=new String[10]; 
     String phygrp2name[]=new String[10]; 
     String chemgrp1name[]=new String[10]; 
     String chemgrp2name[]=new String[10]; 
     String histgrp1name[]=new String[10]; 
     String histgrp2name[]=new String[10]; 
     String geoggrp1name[]=new String[10]; 
     String geoggrp2name[]=new String[10]; 
     String compgrp1name[]=new String[10]; 
     String compgrp2name[]=new String[10];
     int phycnt=0;int chemcnt=0;int histcnt=0;int geogcnt=0;int compcnt=0;int a=0;int b=0;
     System.out.println("Enter name and two subjects seperated by ' ~ ' .");
     System.out.println("e.g- Subject1~Subject2");
     for(int i=0;i<origname.length;i++)
     {
         System.out.print(i+".)");
         origname[i]=inpt.nextLine();
         origsub[i]=inpt.nextLine();
     }
     
     //for(int i=0;i<origname.length;i++)
     //{
      //System.out.println(origname[i] +"   "+ origsub[i]);
     //}
     for(int i=0;i<origsub.length;i++)
     {
         String sub=origsub[i];
         int n=sub.indexOf('~');
         String sub1=sub.substring(0,n);
         String sub2=sub.substring(n+1);
         //System.out.println(sub1+"   "+sub2);
         if(sub1=="phy" || sub2=="phy")
         {
             ++phycnt;
             if(phycnt<=19)
             {
                 phygrp1name[a]=origname[i];
                 ++a;
             }
             else
             { histgrp1name[b]=origname[i];++b;}
             
         }
         
         if(sub1=="chem" || sub2=="chem")
         {
             ++chemcnt;
             if(chemcnt<=19)
             {
                 chemgrp1name[a]=origname[i];
                 ++a;
             }
             else
             { chemgrp1name[b]=origname[i];++b;}
             
         }
         
         if(sub1=="hist" || sub2=="hist")
         {
             ++histcnt;
             if(histcnt<=19)
             {
                 histgrp1name[a]=origname[i];
                 ++a;
             }
             else
             { histgrp1name[b]=origname[i];++b;}
             
         }
         
         if(sub1=="geog" || sub2=="geog")
         {
             ++geogcnt;
             if(geogcnt<=19)
             {
                 geoggrp1name[a]=origname[i];
                 ++a;
             }
             else
             { geoggrp1name[b]=origname[i];++b;}
             
         }
         
         if(sub1=="comp" || sub2=="comp")
         {
             ++compcnt;
             if(compcnt<=19)
             {
                 compgrp1name[a]=origname[i];
                 ++a;
             }
             else
             { compgrp1name[b]=origname[i];++b;}
             
         }
         
          for(int j=0;j<20;i++)
          {
           System.out.println(phygrp1name[j] +"   "+ phygrp2name[j] );
          }
          
          for(int j=0;j<20;i++)
          {
           System.out.println(chemgrp1name[j] +"   "+ chemgrp2name[j] );
          }
          
          for(int j=0;j<20;i++)
          {
           System.out.println(histgrp1name[j] +"   "+ histgrp2name[j] );
          }
          
          for(int j=0;j<20;i++)
          {
           System.out.println(compgrp1name[j] +"   "+ compgrp2name[j] );
          }
          
          for(int j=0;j<20;i++)
          {
           System.out.println(geoggrp1name[j] +"   "+ geoggrp2name[j] );
          }
          
          
         
     }
     
     
         
    }
   }
