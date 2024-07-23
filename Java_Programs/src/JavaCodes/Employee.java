package JavaCodes;
class Employee
{
	String name;
	int age;
	public Employee(String name,int age)
		{
		
		this.name=name;
		this.age=age;
		
		}
	public void display()
		{
		System.out.println("Name is "+name);
		System.out.println("Age is "+age);
		this.manager();
		}
	public void manager()
	{
		System.out.println("Manager is Anu");
	}
	public Employee()
	{
		this("Ashwini",29);
		System.out.println("Location is Chennai");
	}
		
	public static void main(String args[])
		{
		Employee e1=new Employee();
		e1.display();
		Employee e2=new Employee("Ashwin",27);
		e2.display();
		}	
}
