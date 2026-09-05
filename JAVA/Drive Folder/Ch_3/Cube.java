
// Program to find the cube of a given no using FUNCTION / METHOD

import java.io.*;
class Cube
{
	public static void main (String args[]) throws IOException
	{
		BufferedReader in = new BufferedReader (new InputStreamReader (System.in));
		System.out.println("Enter the no ::");
		String text = in.readLine();
		int n = Integer.parseInt(text);
		System.out.println("The Cube of thr given no is :: " + cube (n));
	}

	static int cube (int m)
	{
		int result ;
		result = m * m * m ;
		return result ;
	}

}


