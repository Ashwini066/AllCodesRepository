package JavaCodes;
class StaticVoting
{
	static boolean eligible=false;
	public static boolean checkeligiblity(int age)
	{
		if(age>=18)
		{
			System.out.println("Candidate eligible to vote");
			eligible=true;
		}
		else
		{
			System.out.println("Candidate not eligible to vote");
			eligible=false;
		}
	return eligible;	
	}
	public static void main(String args[])
	{
		StaticVoting.checkeligiblity(34);
	}
}	
	
	
	
		