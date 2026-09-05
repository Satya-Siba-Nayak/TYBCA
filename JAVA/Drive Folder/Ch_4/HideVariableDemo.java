// Programm illustrate  the Hiding the Super class variable

import java.io.*;
class B
{
	int i= 11;
} 
class C extends B
{
	int i = 556 ;
}
class HideVariableDemo
{
	public static void main(String[] args) 
	{
		C c1 = new C();
		System.out.println("Value of i in classs C ::" + c1.i);
	}
} 

/* output :: Value of i in classs C :: 556 */