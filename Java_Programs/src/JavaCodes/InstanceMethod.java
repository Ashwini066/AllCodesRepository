package JavaCodes;
class InstanceMethod
{
	int num1=10,num2=15;
	public void sum()
	{
		int sum=num1+num2;
		System.out.println("Sum is "+sum);
	}
	public void difference(int a,int b)
	{
		int diff=a-b;
		System.out.println("Difference is "+diff);
	}
	public static void main(String args[])
	{
	InstanceMethod obj1= new InstanceMethod();
	obj1.sum();
	obj1.difference(10,5);
	}
}