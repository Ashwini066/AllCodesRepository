package JavaCodes;

class Calculator
{
	public static void sum(int num1,int num2)
	{
		int sum=num1+num2;
		System.out.println("Sum is "+sum);
	}
	public static void diff(int num1,int num2)
	{
		int diff=num1-num2;
		System.out.println("Difference is "+diff);
	}
	public static void product(int num1,int num2)
	{
		int product=num1*num2;
		System.out.println("Product is "+product);
	}
	public static void divi(int num1,int num2)
	{
		int divi=num1+num2;
		System.out.println("Result is "+divi);
	}
	public static void main(String args[])
	{
		Calculator.sum(12,22);
		Calculator.diff(22,10);
		Calculator.product(15,9);
		Calculator.divi(12,6);
	}
}	