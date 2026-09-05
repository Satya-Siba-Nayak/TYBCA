// Demon Stration while Statement
import java.io.*;
import java.util.*;
class Prime
{
	public static void main (String args[]) throws IOException
	{

		//InputStreamReader reader = new InputStreamReader (System.in);
		//BufferedReader in = new BufferedReader (reader);
		//String text = in.readLine();
		//int number = Integer.parseInt(text);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Whole No.      : : ");
		int number= sc.nextInt();
		boolean flag = false ;
		for(int i = 2 ; i <= number - 1 ; i++)   			// i * i <= num
		{
			if (number % i == 0)
			{
				flag = true ;
				break;
			}
		}
		if (flag)
			System.out.println("The Given Number is not a Prime Number  ");
		else
			System.out.println("The Given Number is a Prime Number  ");
	}
}