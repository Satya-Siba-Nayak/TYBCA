import java.io.*;
class CommandLineMaxNo
{
	public static void main(String args[])
	{
		int max=0,t;
		try
		{
			max =  Integer.parseInt(args[0]);
			System.out.println("\n length of the arrray"+args.length);
			for(int i=1; i<args.length;i++)
			{
				t= Integer.parseInt(args[i]);
				if(max<t)
				{
				 	max= t;
				}
			}
		System.out.println("\n Maximum number through command line areguments are"+max);
		}
		catch(Exception e)
		{
			System.out.println("Error"+e);
		}
		
	}
}