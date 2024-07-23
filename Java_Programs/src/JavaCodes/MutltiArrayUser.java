
package JavaCodes;
import java.util.*;

class MutltiArrayUser
{
	public static void main(String args[])
	{
		System.out.println("Enter the row size");
		Scanner sc=new Scanner(System.in);
		int rowsize= sc.nextInt();
		System.out.println("Enter the coloumn size");
		int colsize= sc.nextInt();
		int arr[][]= new int[rowsize][colsize];
		System.out.println("Enter the array elements");
		for(int i=0;i<rowsize;i++)
		{
			for(int j=0;j<colsize;j++)
				{
					arr[i][j]=sc.nextInt();
				}
		}
		System.out.println("Array elements are");
		for(int i=0;i<rowsize;i++)
		{
			for(int j=0;j<colsize;j++)
		{
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
		}		
	}
}	
		