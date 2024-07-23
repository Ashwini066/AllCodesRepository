package JavaCodes;
import java.util.*;
class DoWhile
{
	public static void main(String args[])
	{
		System.out.println("Enter the Limit");
		Scanner cs= new Scanner(System.in);
		int limit=cs.nextInt();
		int i=0;
		do
		{
			System.out.println("Hello World");
			i++;
		}while(i>=limit);
	}
}	
			