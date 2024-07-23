package JavaCodes;
class VariablesDefault
{
	static int num1; //Ststic variable
	int num2;//Instance variable
	public void display()
	{	
	System.out.println(num1);
	System.out.println(num2);
	}
	public static void main(String args[])
	{
	int num3=10;
	System.out.println("Static variable is " +num1);
	//System.out.println("Instance variable is "+num2);
	System.out.println("local variable is "+num3);
	}
}	