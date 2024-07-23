package JavaCodes;
class StudentDetails
{
	String name;
	int rollno;
	public StudentDetails()
		{
			System.out.println("Default Constructor");
		}
	public StudentDetails(String n,int num)
	{
		name=n;
		rollno=num;

	}
	public void display()
	{
	System.out.println("Name is "+name);
	System.out.println("Roll num is "+rollno);
	}

	
	public static void main(String args[])
	{
		StudentDetails sd= new StudentDetails();
		StudentDetails sd1= new StudentDetails("Ashwini",10);
		StudentDetails sd2= new StudentDetails("Ashwin",11);
		sd1.display();
		sd2.display();
	}
	
}	
