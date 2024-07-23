package JavaCodes;
import java.util.*;
class FibonacciSeries {

	public static void main(String[] args) {
		System.out.println("Enter the limit");
		Scanner sc= new Scanner (System.in);
		int limit=sc.nextInt();
		int num1=0;
		int num2=1;
		System.out.println(num1);
		System.out.println(num2);
		for(int i=2;i<limit;i++)
		{
			int num3=num1+num2;
			System.out.println(num3);
			num1=num2;
			num2=num3;
		}
		

	}

}
