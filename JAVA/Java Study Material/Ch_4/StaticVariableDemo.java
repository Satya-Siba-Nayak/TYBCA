// Programm illustrate value assign on static variable

import java.io.*;
class sample
{
	static int i ; static int j = 2 ; static int k;
	static String s1 ; static String s2 = "WElcome";
	static boolean flag ;
} 
class StaticVariableDemo
{
	public static void main(String[] args) 
	{
		System.out.println (sample.i);

		System.out.println (sample.j);

		System.out.println (sample.k);

		System.out.println (sample.s1);

		System.out.println (sample.s2);

		System.out.println (sample.flag);

	}
} 

/*  OUT PUT--
F:\Java- MCA-2009-Material(Final)\All_Chapters\JavaExample\Ch_5>java StaticVaria
bleDemo
0
2
0
null
WElcome
false

F:\Java- MCA-2009-Material(Final)\All_Chapters\JavaExample\Ch_5> 
*/

