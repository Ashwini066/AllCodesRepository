package JavaCodes;
class SumOfNumbers
{
	static int num1=12;
	static int num2=15;
	public static void sum()
	{
	int sum=num1+num2;
	System.out.println("Sum is :"+sum);	
	}
	public static void difference()
	{
	int difference=num1-num2;
	System.out.println("Difference is :"+difference);	
	}
	public static void product()
	{
	int product=num1*num2;
	System.out.println("Product is :"+product);	
	}
	public static void Division()
	{
	int result=num1/num2;
	System.out.println("Result is :"+result);	
	}
	public static void main(String args[])
	{	
		SumOfNumbers.sum();	
		SumOfNumbers.difference();	
		SumOfNumbers.product();	
		SumOfNumbers.Division();	
	}
}