// Program to find the position of occurence of a given no. in the array

import java.io.*;
import java.util.Scanner;
class PositionNumber
{
	public static void main (String args[])	 throws IOException
	{

		Scanner sc = new Scanner(System.in);
		boolean flag = false ;
		int a[] = new int[5];
		int i ;
		String text ;
		System.out.println("Enter the five marks one by one ::");
		try{		
			for (i=0 ; i<5 ;i++)
				{
						a[i] = sc.nextInt();
				}
			System.out.println("Enter the marks to be searched ::");
			int b = sc.nextInt();
			for (i=0 ; i<5 ;i++)
				{
					if (b== a[i])
					{
						flag = true ;
						break ;
					}
				}
			if (flag)
				System.out.println ("The position of occurence is ::" + (i + 1));
			else
				System.out.println ("Given mark is not present ");
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
}