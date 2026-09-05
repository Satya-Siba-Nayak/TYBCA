
// proram to illustrate the structure of Nested IF Statement

import java.io.*;
import java.util.*;
class Interest
{
	public static void main (String args[]) throws IOException
	{
		//InputStreamReader reader = new InputStreamReader(System.in);
		//BufferedReader in = new BufferedReader (reader);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Deposit amount :: ");
		int deposit = sc.nextInt();

		System.out.println("Enter the period of deposit :: ");
		int n = sc.nextInt();

		double rate ;

		if (deposit > 10000)
				rate = 0.11 ;
		else if (n > 2)
				rate = 0.10 ;
		else
				rate = 0.09 ;
		
		double interest = deposit * n * rate ;
		
		System.out.println("Interest to be paid = " + interest);

	}
}