package reviewoops;

public class PartTimeWorker extends Emploer{
	int salary = 1000;
	
	
	public void show()
	{
	System.out.println("Parttime Worker "+salary);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PartTimeWorker e1 = new PartTimeWorker();
		e1.show();
		e1.displ();
		FullTimeWorker e2 = new FullTimeWorker();
		e2.display();
		e2.displ();
				

	}

}
