package JavaCodes;
class StaticPalindrome
{
	static int reversednum,orginalnum;
	public static int reverse(int num)
	{
		orginalnum=num;
		while(num!=0)
		{
			int digit=num%10;
			reversednum=reversednum*10+digit;
			num=num/10;
		}
		return reversednum;
	}
	public static void checkpalindrome()
	{
		if(orginalnum==reversednum)
		{
			System.out.println("Number is palindrome");
		}
		else
		{
			System.out.println("Number is not a palindrome");
		}
	}
	public static void main(String args[])
	{
		StaticPalindrome.reverse(1221);
		StaticPalindrome.checkpalindrome();
	}
}	