package multipleinheritanceusinginterface;

public class ClassMultiple implements Interface1, Interface2 {
	
	public void print()

	{
		System.out.println(a);
	}
	public void display()
	{
		
	System.out.println(b);
	}
	public static void main(String[] args) {
		
		ClassMultiple obj = new ClassMultiple();
				obj.display();
		obj.print();
		
		// TODO Auto-generated method stub

	}

}
