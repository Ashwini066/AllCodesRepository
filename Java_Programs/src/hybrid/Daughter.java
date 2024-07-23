package hybrid;

public class Daughter extends Father 
{
	
	public void d()
	{
		System.out.println("Daughter of Roy is Rose");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Daughter d1= new Daughter();
		d1.grandpa();
		d1.fathername();
		d1.d();
		
		Son s1= new Son();
		s1.grandpa();
		
		s1.fathername();
		s1.s();
		
		
	}

}
