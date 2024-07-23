package finalkeyword;

public  class Sample1 { //if  'public final class Sample1' , it cannot subclass sample2
	final int number; // blank final variable/uninitialized final variable

	
	public Sample1()

	{
		number = 6;    //can initialize only inside a constructor
	}

	public final void print() {
		System.out.println("Print Number");
	}
}
