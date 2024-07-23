package JavaCodes;
import java.util.*;
class Details
{
	static String name;
	static int age;
	public static void enterdetails()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");	
		name=sc.nextLine();
		System.out.println("Enter your age");
		age=sc.nextInt();
	}

	public static void  printdetails()
	{
	System.out.println("Name is "+name);
	System.out.println("Age is "+age);
	}
	public static void main(String args[])
	{
	Details.enterdetails();
	Details.printdetails();
	}
}	