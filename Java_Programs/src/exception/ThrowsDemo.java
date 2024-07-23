package exception;

import java.io.IOException;

public class ThrowsDemo {
	
	public static void S()throws IOException
	{
		throw new IOException("Throwing a Checked Exception");
	}

	public static void main(String[] args) throws IOException
	{
		
		ThrowsDemo.S();
		
	}

}
