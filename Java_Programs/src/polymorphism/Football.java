package polymorphism;

public class Football extends Sports{
	
	public void play()
	{ 
		System.out.println("Play Football");
	
	}

	public static void main(String[] args) {
		
		Sports obj;
		obj = new Sports();
		obj.play();
		obj = new Cricket();
		obj.play();
		obj = new Football();
		obj.play();
		
		
		// TODO Auto-generated method stub

	}

}
