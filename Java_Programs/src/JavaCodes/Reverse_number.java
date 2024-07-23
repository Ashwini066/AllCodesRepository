package JavaCodes;
import java.util.*;
class Reverse_number {

	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc= new Scanner(System.in);
		int number=sc.nextInt();
		int reversednum=0;
		while(number!=0)
		{
		int digit= number % 10;
		reversednum= reversednum*10 + digit;
		number=number/10;			
		}
	   System.out.print(reversednum);
	}

}
