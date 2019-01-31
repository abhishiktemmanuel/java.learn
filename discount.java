public class discount
{
  void showDiscount (int cost)
    {
        double total_cost=0,dis=0.0,net_amount=0;
    if(cost<=1000);
    {
    dis=cost*5/15;
    }
    if(cost>1000&&cost<=2000);
    {
    dis=cost*10/100;
    }
    if(cost>2000&&cost<=3000);
    {
    dis=cost*15/100;
    }
    if(cost>3000);
    {
    dis=cost*10/100;
    }
    System.out.println("discount="+dis);
  }
}