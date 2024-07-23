package encapsulation;

public class EnClass1 {
	
	private long accNum;
	private String name;
	private int salary;
	
	public void setter(long accNum, String name, int salary)
	{
		this.accNum=accNum;
		this.name=name;
		this.salary=salary;
	}
public void getter()
{
	System.out.println("Acc Number: " +accNum);
	System.out.println("Name: " +name);
	System.out.println("Salary: "+salary);
	
}
}
