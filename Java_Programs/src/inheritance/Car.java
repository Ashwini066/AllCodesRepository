package inheritance;

public class Car  extends Vehicle
{
int speed = 40;
public void display()
{
	System.out.println(speed);
}
	public static void main(String[] args) 
	{
		Car obj1 = new Car();
		obj1.display();
		obj1.vplay();    // TODO Auto-generated method stub

	}

}
