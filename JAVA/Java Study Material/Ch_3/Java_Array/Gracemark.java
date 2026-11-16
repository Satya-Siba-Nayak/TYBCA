/* Demon Stration on Concept of one dimentional array

  Program : : Gracemark of each subject only  if marks is less than 100 */

import java.io.*;
import java.util.*;
class ava
{
public static void main (String args[])	 throws IOException
{
	Scanner sc = new Scanner(System.in);
	int a[] = new int[5]; 	// declaration of array variable with allocation of array itself
	String text ;
	System.out.println("Enter the five  marks one by one    : : ");
		
	for (int i=0 ; i<5 ;i++)
	{
		a[i] = sc.nextInt();
	}


	for (int i=0 ; i<5 ;i++)
	{
		a[i] = a[i] + 5 ;
		if (a[i] > 100 )
		{	
			a[i] = 100 ;
		}
	}

	System.out.println("Marks after modifiction (+5) are printed below :: ");
	for (int i = 0 ; i< 5 ; i++)
		System.out.println (a[i]);
		
		
}
}