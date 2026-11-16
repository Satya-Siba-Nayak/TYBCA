// Programm illustrate  the Hiding the Super class variable

import java.io.*;
class E
{
	String X = "JAVA";
	//int a=200;
	//int b=200;
	E()
	{
		System.out.println("You are in the base class constructor");
	}
	int Add(int a,int b)
	{	//this.a=a;
		//this.b=b;
		int res= a+b;
		return res;
		
	}
	E(int a,int b)
	{	int res= a-b;
		System.out.println("Your Substraction Result is"+res);
	}
	void accept()
	{
		System.out.println("I am in the accept");
	}
} 
class F extends E
{
	String X = "COBAL";
	F()
	{
		//super();
		super(10,20);
	}
	void display ()
	{
		System.out.println( X );
		System.out.println(super.X);
		super.accept();
		System.out.println("Your Result is"+super.Add(20,10));
	}
}
class SuperDemo
{
	public static void main(String[] args) 
	{
		F f1 = new F();
		f1.display();
		
	}
} 

