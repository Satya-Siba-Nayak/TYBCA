
// Program to illustrate the "Method  Overloading " concept

import java.io.*;
class Rectangle
{
	public static void main (String args[]) throws IOException
	{
		Rectangle1 r ;
		System.out.println("The Maximum of first two numbers are " + maxi (a,b));

		System.out.println("The Maximum of Given Three numbers are " + maxi (a,b,c));
	}

	int maxi (int m , int n)
	{
		if (m > n)
		return m ;

		else
		return n ;
	}

	int maxi (int m , int n , int k)
		{
			return maxi (maxi (m , n) , k);
		}

}


