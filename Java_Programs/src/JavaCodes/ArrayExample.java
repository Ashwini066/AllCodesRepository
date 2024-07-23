package JavaCodes;
import java.util.*;
class ArrayExample
{
	public static void main (String args[])
	{
		int arr[]= new int[4];
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		System.out.println("First Array");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		int a[]={5,6,7,8};
		System.out.println("Second Array");
			for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}	
	