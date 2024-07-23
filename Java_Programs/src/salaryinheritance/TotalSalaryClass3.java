package salaryinheritance;


public  class TotalSalaryClass3 extends CalculateSalary
{
	double totalsalary;
	
	public void salaryInHand()
	
	{
		 totalsalary =  basicpay + hra + bonus - pf - deduction;
	}
	
	public void salarySlip()
	{
		System.out.println("Salary Slip : ");
		System.out.println("Basicpay: " +basicpay);
		System.out.println("Deduction: " +deduction);
		System.out.println("Bonus: " +bonus);
		System.out.println("HRA: " +hra);
		System.out.println("PF: " +pf);
		System.out.println("Totals Salary: " +totalsalary);
	}
	
	public static void main(String[] args) {
		TotalSalaryClass3 s= new TotalSalaryClass3();
		s.salary();
		s.salarybreaking();
		
		s.salaryInHand();
		s.salarySlip();
		

	}


}
