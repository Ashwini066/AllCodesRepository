package exception;

import java.io.IOException;

public class ThrowDemo {
	
	public static void sum(int a, int b)
	{
		int c = a+b;
		if (c> 10)
		{
			throw new ArithmeticException ("Arithmetic Exception");
		}
		else
		{
			throw new ArrayIndexOutOfBoundsException("Throwing an Exception");
			
		}
	}
	public static void main(String[] args)
	
	{
		try {
		ThrowDemo.sum(3, 14);
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("Exception Handled");
		}
		
	}

}
