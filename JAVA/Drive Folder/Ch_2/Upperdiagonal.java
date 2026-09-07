// declare a matrix of 3*3 and display the upperdiagonal elements of an array

import java.io.*;
class Upperdiagonal
{
	public static void main (String args[]) throws IOException
	{
		BufferedReader in = new BufferedReader (new InputStreamReader (System.in));
		String text ;
		int a[][] = new int[3][3] ;
		System.out.println("Enter the element one by one :: ");
		for (int i=0 ; i<3 ; i++)
		{
			for (int j=0 ; j<3 ;j++)
			{
				text =  in.readLine();
				a[ i ][ j ] = Integer.parseInt(text);
			}
		}
		System.out.println ("Upper Diagonal Element are ::") ;
		for (int i=0 ; i<3 ;i++)
		{
			for (int j=0 ; j<3 ; j++)
			{
				if (j>i)
					System.out.println(a[ i ][ j ]);
			}
		}
		
		
	}

}