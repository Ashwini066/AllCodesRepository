package JavaCodes;
class ReverseConstructor
{
	int num; int digits;int reversed;
	public ReverseConstructor(int num)
		{
			this.num=num;
			while(num!=0)
			{
				digits=num%10;
				reversed=reversed*10+digits;
				num=num/10;
				
			}
		}
	public ReverseConstructor()
	{
		this(4321);
		System.out.println("Reversed number is"+reversed);
	}
	public static void main(String args[])
	{
		ReverseConstructor fr= new ReverseConstructor();
	}
}	