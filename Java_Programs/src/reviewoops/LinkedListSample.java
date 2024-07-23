package reviewoops;

import java.util.List;
import java.util.LinkedList;

public class LinkedListSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List <String> l1 = new LinkedList();
		l1.add("Apple");
		l1.add("Banana");
		l1.add("Orange");
		
		System.out.println("Last element " +((LinkedList) l1).getLast());
		
	}
	

}
