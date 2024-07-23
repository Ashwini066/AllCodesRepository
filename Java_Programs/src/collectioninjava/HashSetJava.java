package collectioninjava;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetJava {

	public static void main(String[] args) {
		
		HashSet set = new HashSet();
		
		set.add(12);
		set.add(11);
		set.add("Apple");
		set.add('S');
		
		System.out.println(set);
		
		HashSet <String> set2 = new HashSet<String>();
		set2.add("XXX");
		set2.add("Abc");
		set2.add("YYY");
		

		System.out.println(set2);
		
		Iterator <String> it = set2.iterator();
		
		while(it.hasNext())
				{
			System.out.println(it.next());
				}
		
	set2.remove("Abc")	;
	System.out.println(set2);
	
	System.out.println(set2.size());
	
	//Collections.sort(set2); //cannot be resolved
	
	set2.add("YYY");
	set2.add(null);
	set2.add("Bus");
	set2.add(null);

	System.out.println(set2);
	
	set.addAll(set2);
	
	
	System.out.println(set);
	
	set.removeAll(set2);
	System.out.println(set);


	}
	
	}


