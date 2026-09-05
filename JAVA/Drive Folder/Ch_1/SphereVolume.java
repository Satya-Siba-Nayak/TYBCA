import java.io.*;

class SphereVolume 
{
	public static void main(String args[]) throws IOException
	{
		
			System.out.println("Enter the radius of the sphere::");
			InputStreamReader reader = new InputStreamReader(System.in);
			BufferedReader in = new BufferedReader (reader);
			String text = in.readLine();					// String DataType
			double r = Double.parseDouble (text);			// Double DataType
			double volume = (4.0 / 3.0) * 3.14 * r * r * r ;
			System.out.println ("Radius of the sphere  :: " + r);
			System.out.println ("Volume of the sphere  :: " + volume);
		
		 
	}

		
}

	/*
NOTE :

1. system.in == 
			--  Here system is the class and in is the object of the system class which is used to accept the input in to java program
			-- Also system.in is the buffer which stores the string input received by the user in terms of bytecode
			
2. InputStreamReader ==
			--  InputSreamreader is the one of Sream class define in the java
			--  It converts the bytecode into the character code 
			-- Therefore here InputStremreder object i.e reader in above program accept a single character at time not entire string
			
3. BufferedReader ==
			--  Inoreder to compare this/ above limitation Java uses BufferedReader class 
			-- Therefore we pass the InputStreamReader object into BufferedReader class
			-- It Bufferes the entire string and show the output
			-- readLine is the method belongs to BufferedReader class which will reads the string from buffers.

4. Double.parseDouble() ==
			--  Double is the predefined class in java and parseDouble() is the method belongs to the Double class
			     for converting string / byte code into the type Double.
				 
			-- IMP -- parseDouble() or  these are the methods defines / declares as a static in the Double class 
				    Therefore we directly accesss that method without creating object of the Double class
				     Similerlly for Integer.parseInt()
	*/