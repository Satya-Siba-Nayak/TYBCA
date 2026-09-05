import java.io.*;
class AsciiDemo
{
	public static void main(String args[])
	{
	char ch;
	try
	{
		DataInputStream dis = new DataInputStream(System.in);
		System.out.println("Enter the character");
		ch = (char)(dis.read());
		System.out.println("User enterd character is "+ ch);
		System.out.println("Ascii value of character is"+ (int)ch);
	}
	catch(Exception e)
	{
		System.out.println("Error"+e);
	}
		
	}
}