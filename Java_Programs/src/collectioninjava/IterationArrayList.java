package collectioninjava;

import java.util.ArrayList;
import java.util.Iterator;

public class IterationArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> c = new ArrayList<Integer>(); 
		c.add (12);
		c.add(33);
		c.add(25);
		c.add(0);
		c.add(29);
		c.add(17);
		System.out.println(c);
		
		Iterator <Integer> i = c.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}

		

		
		


	}

}
