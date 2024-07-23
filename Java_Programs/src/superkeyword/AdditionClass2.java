package superkeyword;

public class AdditionClass2 extends AdditionSuper 
{
	public void  check() {
		int x= super.addition();
		if (x % 10 == 0)
		{
			System.out.println(" Sum is divisible by 10  ");
		}
		else
		{
			System.out.println(" Sum "+x + " is not divisible by 10");
		}
	}
	public static void main(String[] args) {
		AdditionClass2 r = new AdditionClass2();
		r.check();
	}
}
