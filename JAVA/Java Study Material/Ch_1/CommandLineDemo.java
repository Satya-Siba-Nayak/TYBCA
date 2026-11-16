import java.io.*;
class CommandLineDemo
{
	public static void main(String args[])
	{
		System.out.println("\n command line areguments are");
		for(int i=0; i<args.length;i++)
		{
			System.out.println("Args"+(i+1)+"="+args[i]);
		}
	}
}