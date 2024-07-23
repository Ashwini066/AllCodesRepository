package JavaCodes;
class MethodOverloading
{
	public static void average(int num1,int num2)
	{
		int result= (num1+num2)/2;
		System.out.println("Average is "+result);
	}
	public static void average(float num1,float num2)
	{
		float result= (num1+num2)/2;
		System.out.println("Average is "+result);
	}
	public static void average(int num1,int num2,int num3)
	{
		int result= (num1+num2+num3)/3;
		System.out.println("Average is "+result);
	}
	public static void average(int num1,float num2,float num3)
	{
		float result= (num1+num2+num3)/3;
		System.out.println("Average is "+result);
	}
	public static void main(String args[])
	{
		MethodOverloading.average(5,8);
		MethodOverloading.average(11.2f,89.6f);
		MethodOverloading.average(3,7,6);
		MethodOverloading.average(78,66.1f,54.2f);
	}	
}	
	
		
