package collectioninjava;

import java.util.ArrayList;

public class RemoveArrayElement {

	public static void main(String[] args) {
		
        ArrayList<Float> a1 = new ArrayList<Float>();

		for (float i = (float) 4.1; i<= 9.8; i++)
			a1.add(i);
		System.out.println(a1);
		
		a1.remove(3);
		System.out.println(a1);

		 for (float i = 0; i < a1.size(); i++)
				System.out.println(a1.get((int) i) + " ");
	 
	}

}
 