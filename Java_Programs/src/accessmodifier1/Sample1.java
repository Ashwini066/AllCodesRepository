package accessmodifier1;

public class Sample1 
{
	protected int x=2;
	
	protected void num()
	{
		System.out.println(x);
	}
	


	public static void main(String[] args) 
	{
		Sample1 obj = new Sample1();
		obj.num();       // TODO Auto-generated method stub

	}

}
