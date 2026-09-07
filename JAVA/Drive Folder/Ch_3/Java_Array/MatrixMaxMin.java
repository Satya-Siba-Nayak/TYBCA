/* wajp to find out max and min from each row of a matrix*/

import java.util.Scanner;
public class MatrixMaxMin
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		int rows = sc.nextInt();
		System.out.print("Enter the number of columns: ");
		int cols = sc.nextInt();

		int[][] matrix = new int[rows][cols];

		System.out.println("Enter the elements of the matrix:");
		for (int i = 0; i < rows; i++) 
		{
			for (int j = 0; j < cols; j++) 
			{
				matrix[i][j] = sc.nextInt();
			}	
		}

	 	System.out.println("The matrix is:");
		for (int i = 0; i < rows; i++) 
		{
			for (int j = 0; j < cols; j++) 
			{
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

		for (int i = 0; i < rows; i++) 
		{
			int max = matrix[i][0];
			int min = matrix[i][0];

			for (int j = 1; j < cols; j++)
 			{
			if (matrix[i][j] > max) 
			{
				max = matrix[i][j];  
			}
			if (matrix[i][j] < min) 
			{
				min = matrix[i][j];  
			}
		}

			System.out.println("Row " + (i + 1) + " -> Max: " + max + ", Min: " + min);
	}

		sc.close();
	}
}