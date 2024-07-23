package encapsulation;

import java.util.Scanner;

public class User {
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Bank obj = new Bank();
		System.out.println("Enter the pin: ");
		obj.validatePin();
	}
}
		
	
	

	

