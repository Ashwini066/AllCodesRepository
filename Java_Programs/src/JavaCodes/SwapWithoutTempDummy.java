package JavaCodes;
import java.util.*;
class SwapWithoutTempDummy 
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter First number:");
		int num1=sc.nextInt();
		System.out.println("Enter second number:");
		int num2=sc.nextInt();
		System.out.println("Numbers before Swap:"+num1 +" " +num2);
		num1=num1*num2;
        num2=num1/num2;
        num1=num1/num2;
		System.out.println("Numbers before Swap:"+num1 +" " +num2);
	}	
}