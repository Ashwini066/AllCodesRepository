package hierarchical;

public class Developer extends Employee
{
	public void devlpr()
	{
		System.out.println("devlpr Sam");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Developer d1=new Developer();
		d1.display();
		d1.devlpr();
		Tester t1=new Tester();
		t1.testerdet();
		t1.display();
		
	}
	

}
