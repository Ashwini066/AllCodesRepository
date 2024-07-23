package JavaCodes;
class ThisKeyword
{

	int num1,num2,sum;
	int num3,num4,product;
	int num5,num6,difference;
	public void sum(int num1,int num2)
	{

		this.num1=num1;
		this.num2=num2;
		sum=num1+num2;
		System.out.println("Sum is "+sum);
		this.product(12,11);
		this.difference(20,10);
	}
	public void product(int num3,int num4)
	{
		this.num3=num3;
		this.num4=num4;
		product=num3*num4;
		System.out.println("Product is "+product);
	}
	public void difference(int num5,int num6)
	{
		this.num5=num5;
		this.num6=num6;
		difference=num5-num6;
		System.out.println("Difference is "+difference);
	}
	public static void main(String args[])
	{
	ThisKeyword tk= new ThisKeyword();
	tk.sum(12,13);
	}
}	