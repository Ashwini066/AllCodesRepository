package JavaCodes;
import java.util.Scanner;
class SimpleIfCondition
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number 1:");
		int num1 = sc.nextInt();
		System.out.println("Enter number 2:");
		int num2 = sc.nextInt();
		int sum=num1+num2;
		if(sum>50)
			{
				System.out.println("Sum is:"+sum);
			}
	}
}	