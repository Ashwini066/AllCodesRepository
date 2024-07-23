package JavaCodes;
class Variables
{
	static int num1=1; //Ststic variable
	int num2=2;//Instance variable
	public void display()
	{	
	System.out.println(num1);
	System.out.println(num2);
	}
	public static void main(String args[])
	{
	int num3=3;
	System.out.println("Static variable is " +num1);
	//System.out.println("Instance variable is "+num2);
	System.out.println("local variable is "+num3);
	}
}	