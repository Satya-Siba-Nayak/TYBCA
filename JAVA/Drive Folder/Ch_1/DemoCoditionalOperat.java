// Demo on Coditional operator-- >       ? :
import java.io.*;
import java.util.*;
class DemoCoditionalOperat
{
	public static void main (String args[]) throws IOException
	{
		String snum;
		int a,b,c,max1,max;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the First No.      : : ");
		a = sc.nextInt();
		System.out.println("Enter the Second No.      : : ");
		b = sc.nextInt();
		System.out.println("Enter the Third No.      : : ");
		c = sc.nextInt();
		
		max1=a>b?a:b;
		max=max1>c?max1:c;
		
		System.out.println("Number one is       : : "+a);
		System.out.println("Number Second is       : : "+b);
		System.out.println("Number Third is       : : "+c);

		System.out.println("Maximum Number is       : : "+max);	
	}
}