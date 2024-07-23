package exception;

public class CustomException {
	
	public static void validateAge(int age) throws LicenseException
	{
		if (age<18)
		{
			throw new LicenseException("Not Eligible");
		}
		else
		{
			System.out.println("Eligible");
		}
	}

	public static void main(String[] args) {
		
		try {
			CustomException.validateAge(2);
		}
		catch(LicenseException obj)
		{
			System.out.println(obj);
		
		}
		
		// TODO Auto-generated method stub

	}

}
