import java.io.*;
class First
{
	int p,q;
	First(int p,int q)
	{
		this.p=p;
		this.q=q;
	}
	void show()
	{
		System.out.println("The value of p is ::"+p);
		System.out.println("The value of q is ::"+q);
	}
}
class Second extends First
{
	int r,s;
	Second(int p,int q,int r,int s)
	{
		super(p,q);	// Calls the base class constructor with two parametor , Super must be a first keyword in the subclass constructor
		this.r=r;
		this.s=s;
	}
	void show()
	{
		super.show(); // Calls the Base class Method
		System.out.println("The value of r is ::"+r);
		System.out.println("The value of s is ::"+s);
	}
	
}

class superMethodConstructor
{
	public static void main(String args[])  throws IOException
	{
		Second s1= new Second(10,20,30,40);
		s1.show();
	}
}