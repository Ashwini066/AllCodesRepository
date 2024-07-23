package collectioninjava;

import java.util.ArrayList;
import java.util.List;

public class SearchArrayElement {

	public static void main(String[] args) {

		List l1 = new ArrayList();
		l1.add("Car");
		l1.add("Bike");
		l1.add("Cycle");
		l1.add("Bus");
		
		System.out.println(l1);
		
		System.out.println(l1.contains("Train"));
		System.out.println(l1.contains("Cycle"));


		
		
	}

}
