package aggregation;

public class Student {
	
	String name;
	int rollNum;
	
	Address as;
	
	public Student(String name, int rollNum, Address as )
	{
		this.name =name;
		this.rollNum =rollNum;
		this.as=as;
	}
	
	public void details()
	{
		System.out.println("Name " +name + ", Roll Number: " +rollNum);
		System.out.println("Address: " +as.houseNum + as.housename + as.city + as.pin);
		
	}
	
	public static void main(String[] args)
	{
		
		Address obj = new Address(113, "XyZY",23456, "Kochi");
		
		Student st = new  Student ("Rose", 21, obj);
		st.details();
	}

}
