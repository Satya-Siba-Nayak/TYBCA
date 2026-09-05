import java.io.*;
import java.net.*;
class HelloName
{
	public static void main(String args[]) throws IOException	// Any Input is in read as a String in Java
	{
		System.out.println("Enter your name::");
		//InputStreamReader reader = new InputStreamReader(System.in);	// Acccept String Input From Keyboard
		//BufferedReader in = new BufferedReader (reader);				// Buffers the String Input
		DataInputStream dis= new DataInputStream(System.in);
		char ch = (char)dis.read();			// String DataType
		System.out.println("Your name is::" + ch);
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
			
			*/
			