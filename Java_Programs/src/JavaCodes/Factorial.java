package JavaCodes;
class Factorial
{
	static int factorial=1,num=5;
	public static int factorial()
	{
		for(int i=1;i<=num;i++)
		{
			factorial=factorial*i;			
		}
	return factorial;
	}
	public static void main(String args[])
	{
		System.out.println("Factorial of " +num +" is " +Factorial.factorial());
	}
}	