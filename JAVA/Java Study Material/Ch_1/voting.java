// Demon Stration on IF Statement
import java.io.*;
class voting
{
	public static void main (String args[]) throws IOException
	{
		System.out.println("Enter yourr age in Comleted years");
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader (reader);
		String text = in.readLine();
		int age = Integer.parseInt (text);
		if (age >= 18)
		{
			System.out.println("You are eligible for voting");
		}
		else
			System.out.println ("You hav wait for "   + (18-age) +   "years");
	}
}