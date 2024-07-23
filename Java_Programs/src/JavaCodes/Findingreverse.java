package JavaCodes;
class Findingreverse
{
	int num; int digits;int reversed;
	public Findingreverse(int num)
		{
			this.num=num;
			while(num!=0)
			{
				digits=num%10;
				reversed=reversed*10+digits;
				num=num/10;
				
			}
		}
	public Findingreverse()
	{
		this(4321);
		System.out.println("Reversed number is "+reversed);
	}
	public static void main(String args[])
	{
		Findingreverse fr= new Findingreverse();
	}
}	