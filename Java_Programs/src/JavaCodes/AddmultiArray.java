package JavaCodes;
import java.util.*;
class AddmultiArray
{
	public static void main(String args[])
	{
		System.out.println("Enter the row size of Array 1");
		Scanner sc= new Scanner(System.in);
		int rowsize_a=sc.nextInt();
		System.out.println("Enter the column size of Array 1");
		int colsize_a=sc.nextInt();
		int a[][]= new int[rowsize_a][colsize_a];
		System.out.println("Enter the row size of Array 2");
		int rowsize_b=sc.nextInt();
		System.out.println("Enter the column size of Array 2");
		int colsize_b=sc.nextInt();
		int b[][]= new int[rowsize_b][colsize_b];
		int c[][] = new int[rowsize_a][colsize_a] ;
		if(rowsize_a==rowsize_b && colsize_a==colsize_b)
		{
			System.out.println("Enter the elements of Array 1");
				for(int i=0;i<rowsize_a;i++)
				{
					for (int j=0;j<colsize_a;j++)
					{
						a[i][j]=sc.nextInt();
					}
				}
				System.out.println("Enter the elements of Array 2");
				for(int i=0;i<rowsize_b;i++)
				{
					for (int j=0;j<colsize_b;j++)
					{
						b[i][j]=sc.nextInt();
					}
				}
				
				System.out.println("Sum of the array's");
				for(int i=0;i<rowsize_a;i++)
				{
					for(int j=0;j<colsize_a;j++)
					{
						c[i][j]=a[i][j]+b[i][j];
						System.out.print(c[i][j]+" ");
					}
				System.out.println();
				}
			}
		else
		{
				System.out.println("Array sizes are different");
		}		
	}	
}		
		