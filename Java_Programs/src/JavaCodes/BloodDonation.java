package JavaCodes;
import java.util.*;
class BloodDonation
	{
		public static void main (String args[])
			{
				Scanner sc= new Scanner(System.in);
				System.out.println("Enter the age ");
				int age= sc.nextInt();
				System.out.println("Enter the weight ");
				int weight= sc.nextInt();				
				if(age>=18)
				{
					if(weight>=50)
					{
						System.out.println("Eligible to blood donation");
					}
					else
					{
						System.out.println("Weight criteria not satisfied");
					}	
				}
				else
				{
				System.out.println("Age criteria not satisfied");
				}
			}
	}