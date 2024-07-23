package JavaCodes;
class CalculateAvg
{
	static float result;
	public static float Avg(int a,int b,int c)
		{
			result=(a+b+c)/3;
			return result;
		}
	public static void main (String args[])
		{
		float f=CalculateAvg.Avg(10,12,13);
		System.out.println("Average is "+f);
		}
}		
		