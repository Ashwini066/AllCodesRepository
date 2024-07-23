package polymorphism;

import java.util.*;

public class Onseason {
	
	String season;
	double cost;
	public void clothing() {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the season: ");
		  season = sc.next();
		  System.out.println("Enter the cost: ");
		  cost = sc.nextDouble();
		
	}
	
	public void discount()
	
	{ 
			cost=cost*0.15;
			System.out.println("Onseason Discount: " +cost);
	}

}

