class Area extends perimeter
{
	protected double h,area;
	Area(double h1,double a,double b)
	{
		super(a,b);
		h=h1;
	}
	void doarea()
	{
		area=b*h;
	}
	void show()
	{
		super.show();
		System.out.println(area);
	}
}