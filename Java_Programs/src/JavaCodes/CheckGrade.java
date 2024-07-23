package JavaCodes;
import java.util.*;
class CheckGrade
	{
		public static void main (String args[])
			{
				Scanner sc= new Scanner(System.in);
				System.out.println("Enter the mark :");
				int mark= sc.nextInt();
				if(mark>=81 && mark<=100)
				{
					System.out.println("Grade A");
				}
				else if (mark>=71 && mark<=80)
				{
					System.out.println("Grade B");
				}
				else if (mark>=61 && mark<=70)
				{
					System.out.println("Grade C");
				}
				else if (mark>=40 && mark<=60)
				{
					System.out.println("Grade D");
				}
				else
				{
					System.out.println("Failed");
				}
			}
	}		
			