package JavaCodes;
import java.util.*;
class Discount
{
	
static float totalamt,final_price;
	public static float getprice(Scanner sc)
	{
		
		System.out.println("Enter the Product 1 and price");
		String  item1= sc.nextLine();
		float p1=sc.nextFloat();
		sc.nextLine();
		
		System.out.println("Enter the Product 2 and price");
		String  item2= sc.nextLine();
		float p2=sc.nextFloat();
		sc.nextLine();
		
		System.out.println("Enter the Product 3 and price");
		String  item3= sc.nextLine();
		float p3=sc.nextFloat();
		sc.nextLine();
		
		totalamt=p1+p2+p3;
		return totalamt;
	}	
	public static float checkdiscount()
	{
		if (totalamt>=5000)
		{ 
			final_price=totalamt-(0.2f*totalamt);
			
		}
		else
		{
			System.out.println("Amount not eligible for discount");
			final_price=totalamt;
		}
	return final_price;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Discount.getprice(sc);
		System.out.println("Final price is "+Discount.checkdiscount());
	}

}

