package JavaCodes;
import java.util.*;
class WhileLoop
{
	public static void main (String args[])
	{
		System.out.println("Enter the first number");
		Scanner c= new Scanner(System.in);
		int i= c.nextInt();
		System.out.println("Numbers are");
		while(i<=25)
			{
			System.out.print(i);
			i++;
			}
	}
}	
	
