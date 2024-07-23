package JavaCodes;
class AreaMethodOverloading
{
	float radius;
	int square;
	int length,breadth;
	public void AreaMethodOverloading(float r)
	{
	radius=r;	
	float area= 3.14f*r*r;
	System.out.println("Area of circle is "+area);
	}
	public void AreaMethodOverloading(int a)
	{
	square=a;
	int area= a*a;
	System.out.println("Area of square is "+area);
	}
	public  void AreaMethodOverloading(int l,int b)
	{
	length=l;
	breadth=b;
	int area= l*b;
	System.out.println("Area of Rectangle is "+area);
	}
	public static void main(String args[])
	{
		AreaMethodOverloading a= new AreaMethodOverloading();
		a.AreaMethodOverloading(2.5f);
		a.AreaMethodOverloading(7);
		a.AreaMethodOverloading(3,2);
		
	}
}	
	