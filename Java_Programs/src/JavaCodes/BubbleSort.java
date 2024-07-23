package JavaCodes;
import java.util.*;
class BubbleSort
{
	public static void main(String args[])
	{
		System.out.println("Enter the row size of the array");
		Scanner sc= new Scanner(System.in);
		int rowsize=sc.nextInt();
		System.out.println("Enter the column size of the array");
		int columnsize=sc.nextInt();
		int arr[][]=new int[rowsize][columnsize];
		System.out.println("Enter the array elements");
		for(int i=0;i<rowsize;i++)
		{
			for (int j=0;j<columnsize;j++)
				{
					arr[i][j]=sc.nextInt();
				}
		}
	}
}
