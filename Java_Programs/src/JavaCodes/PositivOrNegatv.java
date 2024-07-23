package JavaCodes;
import java.util.*;
class PositivOrNegatv
	{
		public static void main (String args[])
			{
				Scanner sc= new Scanner(System.in);
				System.out.println("Enter the number ");
				int num= sc.nextInt();
				if (num>0)
				{
					System.out.println("Number is a positive number");
				}
				else
				{
					System.out.println("Number is a negative number");
				}
			}
	}		