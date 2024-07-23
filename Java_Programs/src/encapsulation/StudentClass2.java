package encapsulation;

public class StudentClass2 {
	
	

	public static void main(String[] args) {
		
		StudentClass1 obj = new StudentClass1();
		obj.setName("Joe");
		obj.setDept("Chemistry");
		obj.setEmail("xxx@gmail.com");
		
		System.out.println(obj.getName());
		System.out.println(obj.getDept());
		System.out.println(obj.getEmail());
		
		
		// TODO Auto-generated method stub

	}

}
