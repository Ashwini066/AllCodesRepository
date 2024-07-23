package exception;

public class SampleException {

	public static void main(String[] args) {
		
		int a= 10;
		int b= 20;
		int s= a + b;
		
		try 
		{
		int div = 5/0;
		int arr[]=new int[3];
		arr[5]=8;
		}
		/*catch(ArithmeticException div)
		{
		System.out.println("division by zero is not possible");
		}
		
		/*catch(ArrayIndexOutOfBoundsException obj)
		{
			System.out.println("Array Index Out of bound"); //will not be shown in output
		}*/
		
		/*catch(Exception e)
		{
			System.out.println("Parent Exception");
		}*/
		
		finally
		{
			System.out.println("Finally block will always execute");
		}
		
		
		System.out.println("Rest of code will be excecuted ");
	}

}
