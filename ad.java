class ad
{
	void abc(int n)
	{
		double a=Math.sqrt(5);
		for (int j=0;j<n ;j++ )
		 {
		 	double d=(1/a)*(Math.pow((1+a)/2,j)-Math.pow((1-a)/2,j));
		 	System.out.println((int)d);
			
		}
	}
}