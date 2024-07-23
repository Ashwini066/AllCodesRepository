package JavaCodes;
class CountNum
{
	public static void main (String args[])
	{
		int start=10;
		int counteven=0;
		int countodd=0;
		while (start<=20)
		{
			if(start%2==0)
			{
				counteven=counteven+1;
			}
			else
			{
				countodd=countodd+1;
			}
			start++;
		}
	System.out.println("Count of even numbers " +counteven);
	System.out.println("Count of odd numbers " +countodd);
	}
}	