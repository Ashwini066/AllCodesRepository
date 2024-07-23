package interfacepackage;

public class Sample2 implements SampleInter{
	
	public void print()
	{
		System.out.println(a);
	}
	public void show()
	{
		System.out.println("show "+MAX_VALUE);
	}

	public static void main(String[] args) {
		SampleInter obj = new Sample2();
		obj.print();
		obj.show();
		
		// TODO Auto-generated method stub

	}

}
