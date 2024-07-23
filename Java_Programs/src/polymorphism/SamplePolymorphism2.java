package polymorphism;

public class SamplePolymorphism2 extends SamplePolymorphism1 {
	public void display(int c,int d)
	{
		super.display(2,8);
		int y= c+d;
		System.out.println("Child Sum " +y);
	}

	public static void main(String[] args) {
		SamplePolymorphism1 obj=new SamplePolymorphism2();
		obj.display(3,6);
		
	}
}
