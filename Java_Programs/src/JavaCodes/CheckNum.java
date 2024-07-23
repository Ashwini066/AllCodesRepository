package JavaCodes;
import java.util.*;
class CheckNum
	{
		public static void main (String args[])
			{
				Scanner c= new Scanner(System.in);
				System.out.println("Enter Number");
				int num =c.nextInt();
				if(num % 2 == 0)
				{
					System.out.println("Number is even");
				}
				else
				{
					System.out.println("Number is odd");
				}	
			}
	}		
