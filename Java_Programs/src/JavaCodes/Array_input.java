package JavaCodes;
import java.util.*;
class Array_input {

	public static void main(String[] args) {
		System.out.println("Enter the array size");
		Scanner sc=new Scanner(System.in);
		int size= sc.nextInt();
		int arr[]= new int[size];
		System.out.println("Enter the numbers in array");
		for (int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Array Elements");
		for(int j=0;j<size;j++)
		{
			System.out.println(arr[j]);
		}
		System.out.println("elements used in for each loop");
		for(int a:arr)
		{
			System.out.println(a);
		}
	}

}
