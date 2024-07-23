package abstraction;

public class DemoChild extends Demo {
	public void print() {
		System.out.println("Abstract method body implementation is in child class");
	}

	public static void main(String[] args) {
		
		DemoChild obj = new DemoChild();
		obj.display();
		obj.print();
	}
}
