package polymorphism;

public class Offseason extends Onseason {
	
	public void discount()
	{
		super.discount();
		this.cost=cost;
		 cost = cost*40;
		System.out.println(cost);
	}
	

	public static void main(String[] args) {
		
		Onseason obj;
		obj = new Onseason();
		obj.clothing();
		obj.discount();
		obj = new Offseason();
		obj.discount();
		

	}

}
