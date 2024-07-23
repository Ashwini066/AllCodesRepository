package JavaCodes;
import java.util.Scanner;
class ATM
{
	static int currentbal=5000,depositamt,withdrwamt;
	public static boolean deposit(Scanner sc,boolean yes)
	{
	System.out.println("Enter the deposit amount");	
	depositamt=sc.nextInt();
	currentbal+=depositamt;
	System.out.println("Amount is credited to your account successfully");
	return yes;
	}
	public static boolean withdraw(Scanner sc,boolean yes)
	{
		System.out.println("Enter the amount to withdraw");
		withdrwamt=sc.nextInt();
		if (withdrwamt<currentbal)
		{
			currentbal-=withdrwamt;
			System.out.println("Amount Withdrawal Successfully completed");		
		}
		else if (withdrwamt==currentbal)
		{
			System.out.println("Please Maintain minimum balance of Rs.500");
			System.out.println("Enter amount less than Rs.4500");
		}
		else
		{
			System.out.println("Error!! Withdrawal amount greater than the available balance");
		}
		return yes;
	}	
	public  static void checkAccountbalance()
	{
			System.out.println("The outstanding balance is "+currentbal);
	}	
			
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Press any number");
		int option=sc.nextInt();
		switch(option)
		{
			case 1:
				ATM.deposit(sc, true);
				ATM.checkAccountbalance();
				break;
			case 2:
				ATM.withdraw(sc, true);
				ATM.checkAccountbalance();
				break;
			case 3:
				ATM.checkAccountbalance();
				break;
			case 4:	
				System.exit(0);
				break;
		}
	}
}	
	
	
	
	
		