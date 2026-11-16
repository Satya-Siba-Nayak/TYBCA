import java.util.*;
import java.io.*;
class NestedFor
{
	public static void main(String[] args)
	{
		int line,row,col,value=0;
		Scanner sc = new Scanner(System.in); 
		System.out.println("\n\nEnter the number of lines:= ");
		line= sc.nextInt();
		System.out.println("\nThe Pattern is \n");
		for(row=1;row<=line; row++)
		{
			for (col=1; col<= row;col++)
			{
				value++;
				System.out.print(" "+ value);
			}
			System.out.println();
		}
	}
}
