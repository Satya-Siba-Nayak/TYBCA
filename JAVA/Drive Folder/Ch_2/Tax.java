// Demon Stration on Switch Statement
import java.io.*;
import java.util.*;
class Tax
{
	public static void main (String args[]) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Income      : : ");
		int income = sc.nextInt();
		
		System.out.println("Enter Employee category ::");
		int emp_category = sc.nextInt();
		
		double allownce_rate = 0;
		switch (emp_category)
			{
				case 1 : allownce_rate = 0.05 ;
						 break;
				case 2 : allownce_rate = 0.07 ;
						 break;
				case 3 : allownce_rate = 0.10 ;
						 break;
				default: allownce_rate = 0.1; 
				
		}

		double allowance = income * allownce_rate ;
		System.out.println("Allownce to be paid      :  " + allowance);

	}
}

/*  OUTPUT---

	Enter the Income : 10000
	Enter the Employee Category : 1
	Allowance to be paid : 500.0

*/