package JavaCodes;
import java.util.*;
class DrivingLicense
	{
		public static void main (String args[])
			{
			Scanner sc= new Scanner(System.in);
			System.out.println("To check eligiblity enter your age");
			int age= sc.nextInt();
			if (age>16)
				{
					System.out.println("Eligible for driving license");
				}
			else
				{
				System.out.println("Not Eligible for driving license");
				}
			}
	}		
				