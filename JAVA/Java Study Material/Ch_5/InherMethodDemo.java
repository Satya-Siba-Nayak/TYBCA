// Programm illustrate  the inheritance of a Method

import java.io.*;
class Q 
{
	void display1()
	{
		System.out.println("Good Morning");
	}

	void display2()
	{
		System.out.println("Good Afternoon");
	}
} 
class R extends Q
{
}
class S extends R
{
	void display3()
	{
		System.out.println("Good Evening");
	}
}
class InherMethodDemo
{
	public static void main(String[] args) 
	{
		S s1 = new S();
		s1.display1();
		s1.display2();
		s1.display3();

	}
} 

