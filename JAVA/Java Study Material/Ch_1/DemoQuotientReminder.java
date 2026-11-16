/* Demo on Mod operator . finding quotient and reminder */

import java.io.*;
import java.util.*;
class DemoQuotientReminder
{
	public static void main (String args[]) throws IOException
	{
		int num1,num2,rem,quo;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two integer numbers : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		quo = num1/num2;
		rem = num1%num2;
		System.out.println("Number1  "+num1+"\t Number2 " +num2);
		System.out.println("\n Quotient := "+ quo);
		System.out.println("\n Reminder := "+ rem);	
	}
}
