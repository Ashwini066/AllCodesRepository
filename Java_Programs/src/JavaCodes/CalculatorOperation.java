package JavaCodes;
class CalculatorOperation
{
	static int sum,diff,product,result;
	public static int sum(int a,int b)
		{
			sum=a+b;
			return sum;
		}
	public static int diff(int a,int b)
		{
			diff=a-b;
			return diff;
		}
	public static int product (int a,int b)
		{
			product=a*b;
			return product;
		}		
	public static int divi (int a,int b)
		{
			result=a/b;
			return result;
		}	
		
	public static void main (String args[])
		{
		System.out.println("Sum is "+CalculatorOperation.sum(12,10));
		System.out.println("Difference is "+CalculatorOperation.diff(22,15));
		System.out.println("Product is "+CalculatorOperation.product(11,13));
		System.out.println("Division result is "+CalculatorOperation.divi(9,3));
		}
}		
		