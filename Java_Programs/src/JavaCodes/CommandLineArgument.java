package JavaCodes;
class CommandLineArgument
{
public static void main(String args[])
{
System.out.println(args[0]);
System.out.println(args[1]);
System.out.println(args[0] + args[1]);
int num1 = Integer.parseInt(args[2]);
int num2 = Integer.parseInt(args[3]);
int sum = num1 + num2;
System.out.println("Sum is:" +sum);
float num3 =  Float.parseFloat(args[4]);
float num4 =  Float.parseFloat(args[5]);
float sum2= num3+num4;
System.out.println("Sum is:" +sum2);
}
}