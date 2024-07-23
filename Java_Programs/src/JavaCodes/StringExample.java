package JavaCodes;
class StringExample
{
	public static void main(String args[])
	{
		String s1="hello";
		String s6= new String("Hello");
		String s2=" Welcome ";
		String s3=new String("Made in India");
		String s4= new String("Its Raining");
		String s5="HELLO";
		String s7=5+3+"Anu"+3+2;
		String s8="20";
		int a=19;
		/*System.out.println(s1);
		System.out.println(s2.length());
		s1=s1.concat(s2);
		System.out.println(s1);
		System.out.println(s3.charAt(3));
		System.out.println(s1==s2);
		System.out.println(s1==s6);
		System.out.println(s1.equals(s6));
		System.out.println(s1.equals(s5));
		System.out.println(s1.equalsIgnoreCase(s5));
		System.out.println(s1.compareTo(s2));*/
		System.out.println("+ Operator :"+s7);
		System.out.println("To upper case :"+s3.toUpperCase());
		System.out.println("To lower case :"+s3.toLowerCase());
		System.out.println("To Trim :"+s2.trim());
		System.out.println("To replace :"+s3.replace("India","China"));
		System.out.println("To start with :"+s4.startsWith("It"));
		System.out.println("To end with :"+s3.endsWith("ff"));
		s8=s8.valueOf(a);
		System.out.println("To check value of :"+s8);
		System.out.println("To check contains :"+s2.contains("come"));
		
		
		
		
		
	}
}	