package multilevel;

public class BabyDog extends Dog 
{
	String col="golden";
	public void dis()
	{
		System.out.println(col);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		BabyDog d1= new BabyDog();
		d1.display();
		d1.show();
		d1.dis();
		
	}

}
