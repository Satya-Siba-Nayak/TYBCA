import java.util.*;
import java.io.*;
class NestedForChar
{
	public static void main(String[] args)
	{
		int line,row,col;
		char ch='A';
		Scanner sc = new Scanner(System.in); 
		System.out.println("\n\nEnter the number of lines:= ");
		line= sc.nextInt();
		System.out.println("\nThe Pattern is \n");
		for(row=1;row<=line; row++)
		{
			for (col=1; col<= row;col++)
			{
				System.out.print(" "+ ch);
			}
			System.out.println();
			ch++;
		}
	}
}
