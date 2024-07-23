package exception;

public class ThrowsDemoUnchecked {
	
	
	public static void show() throws ArithmeticException{
		{
			throw new ArithmeticException("an Unchecked Exception has occured");
		}
	}
	
	

	public static void main(String[] args) {
		
		show();
		
	}

}
