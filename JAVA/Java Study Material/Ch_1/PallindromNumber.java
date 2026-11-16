import java.io.*;
import java.util.*;
class PallindromNumber
{
    // Iterative function to reverse the digits of number
  	static int reversNumber(int n)
    	{
        		int reversed_number = 0;
        		while (n > 0)
		{
            			reversed_number = reversed_number * 10 + n % 10;
            			n = n / 10;
       		 }
        		return reversed_number;
    	}

    	// Main function
    	public static void main(String[] args)
    	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check palindrom");
		int n = sc.nextInt();
        		int reverseN = reversNumber(n);
       		System.out.println("Reverse of n = " + reverseN);

       		// Checking if n is same as reverse of number
       		 if (n == reverseN)
            			System.out.println("Number is Palindrome = Yes");
       	 	else
            			System.out.println("Number is Palindrome = No");
    	}
}