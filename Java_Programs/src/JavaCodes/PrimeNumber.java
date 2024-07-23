package JavaCodes;
import java.util.*;
class PrimeNumber
{
	public static void main(String args[])
	{
		System.out.println("Enter the number");
		Scanner sc= new Scanner(System.in);
		int num= sc.nextInt();
		boolean prime=true;
		if(num==1)
		{
			prime=false;
		}
		else
		{
			for (int i=2;i*i<num;i++)
			{			
				if(num%i==0)
				{
					prime=false;
					break;	
				}
			}
		}	
		if(prime==true)
		{
			System.out.println("Prime number");
		}
		else
		{
			System.out.println("Not a Prime number");
		}	
	}
}	
