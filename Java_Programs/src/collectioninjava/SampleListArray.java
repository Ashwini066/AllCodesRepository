package collectioninjava;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class SampleListArray {
	
	
	public static void main(String[] args) {
		
		List l1 = new ArrayList();
		l1.add("Apple");
		l1.add("Orange");
		l1.add("Banana");
		l1.add("Kiwi");
		System.out.println(l1);
		System.out.println(l1.size());
		System.out.println(l1.isEmpty());
		
		List <String> l2 = new ArrayList();
		l2.add("Pen");
		l2.add("Pencil");
		l2.add("Book");
		System.out.println(l2);
		
		
		System.out.println("Non-Generic Collection");
		
		ArrayList a1 = new ArrayList();
		a1.add("abc");
		a1.add(123);
		System.out.println(a1);
		
		
		System.out.println("Generic Collection");
		
		ArrayList <Integer> a2 = new ArrayList<Integer>();
		a2.add(1);
		a2.add(null);
		a2.add(6);
		System.out.println(a2);
		
		a2.remove(0);
		//a2.remove(6); //cannot remove element

		System.out.println(a2);
		
System.out.println(l1.contains("Orange"));
System.out.println(l1.contains(15));


l1.remove("Banana");
System.out.println(l1);

for (int i=0; i<l1.size(); i++)
{
	System.out.println(l1.get(i));
}
System.out.println("List using for each loop ");

for(String j:l2)    //for each loop
{
	System.out.println(j);
}

l1.remove(1);
System.out.println(l1);

System.out.println(l1.get(0));
System.out.println(l1.set(1,"Jackfruit"));
System.out.println(l1);

Collections.sort((l2));

System.out.println(l2);



l1.addAll(a1);
System.out.println(l1);


l1.removeAll(a1);
System.out.println(l1);


System.out.println("ITERATOR");


Iterator <String> i = l2.iterator();

while(i.hasNext())
{
	System.out.println(i.next());
}

i.remove();
System.out.println(l2);




}

}


