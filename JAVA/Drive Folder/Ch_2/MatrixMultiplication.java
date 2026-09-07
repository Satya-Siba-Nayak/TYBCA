
// declare a matrix of 3*3 and find the 

import java.io.*;
import java.util.*;
class MatrixMultiplication
{
	public static void main (String args[]) throws IOException
	{
		final int row= 3;
		final int col = 3;
		Scanner sc = new Scanner(System.in);
		int mat1[][] = new int[row][col] ;
		int mat2[][] = new int[row][col] ;
		int mat3[][] = new int[row][col];
		System.out.println("Enter the"+ (row*col) + " element of a matrix 1- one by one :: ");
		for (int i=0 ; i<3 ; i++)
		{
			for (int j=0 ; j<3 ;j++)
			{
				mat1[ i ][ j ] = sc.nextInt();
			}
		}

		System.out.println("Entered First Matrix is :: ");
		for (int i=0 ; i<3 ; i++)
		{
			for (int j=0 ; j<3 ;j++)
			{
				System.out.print (mat1[ i ][ j ] + "\t");
			}
			System.out.println ("\n");
		}
		

		System.out.println("Enter the"+ (row*col) + " element of a matrix 2- one by one :: ");
		for (int i=0 ; i<3 ; i++)
		{
			for (int j=0 ; j<3 ;j++)
			{
				mat2[ i ][ j ] = sc.nextInt();
			}
		}

		System.out.println("Entered Second Matrix is :: ");
		for (int i=0 ; i<3 ; i++)
		{
			for (int j=0 ; j<3 ;j++)
			{
				System.out.print (mat2[ i ][ j ] + "\t");
			}
			System.out.println ("\n");
		}

		/* Multiplication logic */

		for (int i=0 ; i<3 ; i++)
		{
			for (int j=0 ; j<3 ;j++)
			{	
				 mat3[i][j]=0;
				 for (int k=0 ; k<3 ;k++)
				 {
					mat3[i][j]= mat3[i][j] + mat1[i][k]*mat2[k][j];
				 }
			}
			System.out.println ("\n");
		}

		/* Multiplication logic end*/

		System.out.println("Matrix multiplication is :: ");
		for (int i=0 ; i<3 ; i++)
		{
			for (int j=0 ; j<3 ;j++)
			{
				System.out.print (" " + mat3[ i ][ j ] + "\t");
			}
			System.out.println (" ");
		}
			
	}

}