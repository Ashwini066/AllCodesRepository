package abstraction;

public class FullTimeEmployee extends EmployeeSuper {
	final int h=8;
	public void calculateSalary() 
	{
		
		double salary = paymentPerHour*h;
		System.out.println("Full time employee: ");
		System.out.println("Salary: " + salary);
	}

	public static void main(String[] args) {
		FullTimeEmployee obj = new FullTimeEmployee();
		obj.calculateSalary();
		
		Contractor obj1 = new Contractor(3);
		obj1.calculateSalary();
		

	}

}
