package JavaCodes;
class ConstructorArea
{
	float radius;
	int square;
	int length,breadth;
	public ConstructorArea(float r)
	{
	radius=r;	
	float area= 3.14f*r;
	System.out.println("Area of circle is "+area);
	}
	public ConstructorArea(int a)
	{
	square=a;
	int area= a*a;
	System.out.println("Area of square is "+area);
	}
	public  ConstructorArea(int l,int b)
	{
	length=l;
	breadth=b;
	int area= l*b;
	System.out.println("Area of Rectangle is "+area);
	}
	public static void main(String args[])
	{
		ConstructorArea a= new ConstructorArea(4);
		ConstructorArea a1=new ConstructorArea(1.2f);
		ConstructorArea a2=new ConstructorArea(10,5);
	}
}	
	