package JavaCodes;
class Findgrade
{
	int m1,m2,m3,total_marks;
	public Findgrade(int m1,int m2,int m3)
	{
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
		total_marks= m1+m2+m3;
		System.out.println("Total Marks is " +total_marks);
		this.getgrade();
		
		
	}
	public void getgrade()
	{

		if (total_marks>=250 && total_marks<=300)
			{
				System.out.println("Grade is A");
			}
		else if (total_marks>=200 && total_marks<=249)
			{
				System.out.println("Grade is B");
			}
		else if (total_marks>=125 && total_marks<=199)
			{
				System.out.println("Grade is C");
			}
		else
			{
			System.out.println("Fail");
			}
	}		

	public static void main(String args[])
	{
		
		Findgrade fd=new Findgrade(100,90,80);
		Findgrade gd=new Findgrade(50,40,30);
	}
}