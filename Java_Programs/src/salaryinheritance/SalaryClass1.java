package salaryinheritance;
import java.util.*;

public class SalaryClass1 
{
  double basicpay,deduction, bonus;
	public void salary() 
	{
		
	 Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the basic pay: ");
	 basicpay = sc.nextDouble();
	
	System.out.println("Enter the deduction amount: ");
	 deduction = sc.nextDouble();
	
	System.out.println("Enter the bonus received: ");
	 bonus = sc.nextDouble();
	sc.close();
	}
	
	
}
