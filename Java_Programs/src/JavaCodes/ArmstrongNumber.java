package JavaCodes;
import java.util.*;
import java.lang.*;
class ArmstrongNumber {

	public static void main(String[] args) {
	int reversednum=0;
		int power=0;
		System.out.println("Enter the number :");
		Scanner sc= new Scanner (System.in);
		int number=sc.nextInt();
		int orginalnum=number;
		while(number>0)
		{
			number=number/10;
			power++;
		}
	
		number=orginalnum;
		while(number!=0)
		{
			int digit = number % 10;
			reversednum+=Math.pow(digit,power);
			number=number/10;
		}
		if (orginalnum==reversednum)
		{
			System.out.println("Armstrong Number");
		}
		else
		{
			System.out.println("Not an Armstrong number");
		}	
		}

}
