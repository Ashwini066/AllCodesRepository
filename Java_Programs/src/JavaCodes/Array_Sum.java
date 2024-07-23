package JavaCodes;
import java.util.*;
class Array_Sum {

	public static void main(String[] args) {
		System.out.println("Enter the array size");
		Scanner sc=new Scanner(System.in);
		int size= sc.nextInt();
		int arr[]= new int[size];
		int sum=0;
		System.out.println("Enter the numbers in array");
		for (int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int j=0;j<size;j++)
		{
			sum+=arr[j];
		}
		System.out.println("Sum of Array Elements "+sum);
		
	}

}
