class perimeter
{
	protected double a,b;
	perimeter(double a1,double b1)
	{
		a=a1;
		b=b1;
	}
	double calculate()
	{
		double p=2*(a+b);
		return p;
	}
	void show()
	{
		System.out.println("Perimeter="+calculate());
	}
}