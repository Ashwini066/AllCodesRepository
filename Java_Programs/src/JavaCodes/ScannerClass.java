package JavaCodes;
import java.util.Scanner;
class ScannerClass
{
	public static void main(String args[])
	{
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter your name ");
	String name = sc.nextLine();
	System.out.println("The name is "+name);
	System.out.println("Enter your place ");
	String place = sc.next();
	System.out.println("The place is"+place);
	System.out.println("Enter your age ");
	int age = sc.nextInt();
	System.out.println("The age is "+age);
	System.out.println("Enter a float number ");
	float f = sc.nextFloat();
	System.out.println("The float number is "+f);
	System.out.println("Enter a String ");
	char c = sc.next().charAt(3);
	System.out.println("The char is "+c);
	System.out.println("Enter a double number ");
	double d = sc.nextDouble();
	System.out.println("The double number is "+d);
	System.out.println("Sky is blue");
	boolean b= sc.nextBoolean();
	System.out.println("The answer is "+b);
	}
}	
	