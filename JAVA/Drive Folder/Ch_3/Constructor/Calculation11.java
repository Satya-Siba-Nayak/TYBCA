/*Constructor and Functions in Java
====================================================================================
What is Constructor?
==> Is a special function in java, It is used to create the object of the class also
        constructor will never return anything(int,char,string) , so it return the object of the class.
===> Name of the class and name of the constructor must be same.

What is Function in java?
==> Function is used to perform specifc task
==> Function may or may not be return value of type int/char/string/array/ class object
===> we need to declare the function
==> We need to define the function


====================================================================================
*/
import java.io.*;
import java.util.*;
class Calculation11
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no one");
		int no1= sc.nextInt();
		System.out.println("Enter no two");
		int no2= sc.nextInt();
		Addition a1= new Addition(no1,no2);
		int sub= a1.Substraction(no1,no2);
		System.out.println("Substration is"+sub);

		Multiplication m1= new Multiplication();
		int multipli = m1.multi(no1,no2); 
		System.out.println("Multiplication is"+multipli );
	}
}
class Addition
{
	
	public Addition(int no1,int no2)                       // Constructor
	{
		int res = no1+no2;
		System.out.println("Addition is"+res);
	}
	int Substraction(int no1,int no2)                   // Function
	{
		int res = no1-no2;
		return res;
	}
	
}
class Multiplication
{
	int multi(int no1,int no2)                   // Function
	{
		int res = no1*no2;
		return res;
	}
	Multiplication()
	{
		System.out.println("This is Multiplication Constructor");
	}
}

