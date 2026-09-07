
// Program to illustrate the " Use Of Constructor " concept
/* 	-- Java  provides  a special concept called as Constructor for creating  an object of a class and 
	   initializing its instance variable.
	
	-- Name of constructor method should be same as class name.
	
	-- It is generally declared as public.
	
	-- It does not have a return type , not even void.
	
	-- Constructors are not a genral Java methods it is Special type of method 
	
	-- We cannot invoke constructor on existing object
	
	-- We  can  only use / invoke  constructor  only in  combination  with new operator.
	
	-- If the constructor are not define in the class , then the Java compiler 
	   automatically generate and execute a constructor that has no argument 
	
	-- Such constructor called as default constructor  
*/


import java.io.*;
class Rectangle1
{
	int length , width;
	Rectangle1 (int a , int b)	// Constructor
	{
		length = a; 
		width = b ;

	}
	int rectangleArea() // method declaration for calculate Area 
	{
		int area;
		area = length * width ;
		return area ;
	}

	int rectanglePerimeter( )  // method declaration for calculate Perimeter
	{
		int perimeter ;
		perimeter = 2 * (length + width);
		return perimeter ;
	}
}

class Rectangledemo
{
	public static void main (String args[]) throws IOException
	{
		 /* BufferedReader in = new BufferedReader (new InputStreamReader (System.in));
		System.out.println("Enter the lenth of first rectangle");
			String text1 = in.readLine();
			int len = Integer.parseInt(text1);

		System.out.println("Enter the width of first rectangle") ;
			String text2 = in.readLine();
			int wid = Integer.parseInt(text1) ; */

		Rectangle1 r1 = new Rectangle1 (10 , 5);
		System.out.println("Area of Rectangle == " + r1.rectangleArea());
		System.out.println("Perimeter of Rectangle == " + r1.rectanglePerimeter());

	    	Rectangle1 r2 = new Rectangle1 (7, 4);
		System.out.println("Area of  Second Rectangle == " + r2.rectangleArea());
		System.out.println("Perimeter of  Second Rectangle == " + r2.rectanglePerimeter());

	}
}



