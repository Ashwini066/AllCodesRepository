package JavaCodes;
class ConstructorOverload
{
	String name;
	int rollno;
	String standard;
	public ConstructorOverload()
		{
			System.out.println("Default Constructor");
		}
	public ConstructorOverload(String n,int num)
	{
		name=n;
		rollno=num;

	}
	public ConstructorOverload(String b)
	{
		standard=b;
	}
	public void display()
	{
	System.out.println("Name is "+name);
	System.out.println("Roll num is "+rollno);
	System.out.println("Class is "+standard);
	}

	
	public static void main(String args[])
	{
		ConstructorOverload co= new ConstructorOverload();
		ConstructorOverload co1= new ConstructorOverload("Ashwini",10);
		ConstructorOverload co2= new ConstructorOverload("Tenth");
		co1.display();
		co2.display();
	}
	
}	
