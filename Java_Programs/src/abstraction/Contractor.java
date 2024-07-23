package abstraction;

public class Contractor extends EmployeeSuper
{

	int workingHours;
	public void calculateSalary() 
	{
		
		System.out.println("Part time employee");
	}
	public Contractor(int workingHours) {
		
		System.out.println("Salary: "+ paymentPerHour* workingHours);
	
		
	}
}
		










	
