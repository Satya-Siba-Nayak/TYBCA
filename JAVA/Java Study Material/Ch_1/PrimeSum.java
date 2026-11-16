import java.io.*;
public class PrimeSum 
{
    // Function to check if a number is prime
    public static boolean isPrime(int num) 
	{
       		 if (num <= 1) 
		{
           			 return false; // Numbers less than or equal to 1 are not prime
        		}
        			// Check for divisibility from 2 up to the square root of the number
        			// This is an optimization as factors always come in pairs, one of which
        			// is less than or equal to the square root.
       		 for (int i = 2; i <= num - 1; i++)
		{
            			if (num % i == 0) 
			{
                				return false; // If divisible, it's not prime
           	 		}
        		}
        		return true; // If no divisors found, it's prime
    }

 // Function to calculate the sum of prime numbers up to n
 public int static sumPrimesUpToN(int n) 
	{
        		int sum = 0;
      		for (int i = 2; i <= n; i++) 
		{
            			if (isPrime(i)) 

			{
               			 sum += i; // Add to sum if it's a prime number
            			}
       		 }
        		return sum;
   	 }

    public static void main(String[] args) 
	{
       		 int limit = 17; // Example limit
       		 int primeSum = sumPrimesUpToN(limit);
      		 System.out.println("Sum of prime numbers up to " + limit + ": " + primeSum);
   	 }
}
