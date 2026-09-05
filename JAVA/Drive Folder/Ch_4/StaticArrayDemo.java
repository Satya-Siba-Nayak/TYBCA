// Programm illustrate  a use of static initialize block

import java.io.*;
class Block
{
	static int x[] ;
	static // static blok are used when we assign values to a  set of static variables ,  when class is loaded in to programs memory
	{
		x = new int [5];
		for (int i=0 ; i<5 ; i++ )
			x[i] = i ;
	}
} 
class StaticArrayDemo
{
	public static void main(String[] args) 
	{
		for (int i=0 ; i<5 ;i++ )
			System.out.println (Block.x[i]); // class is loaded and static block are called
	}
} 
/* Output -- 0 1 2 3 4  */
