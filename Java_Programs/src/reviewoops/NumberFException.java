package reviewoops;

public class NumberFException {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a= 10;
		int b= 20;
		
try {
	int c = 2/0;
}
catch (ArithmeticException e) {
	System.out.println("Arithmetic exception is handled");
}
System.out.println(a);
System.out.println(b);

	System.out.println("Rest of the codes will be executed");
	}

}
