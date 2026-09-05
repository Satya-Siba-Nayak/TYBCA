
// Formating Output Values

import java.io.*;
import java.text.*;
class NumberFormat
{
	public static void main(String args[]) throws IOException	// Any Input is in read as a String in Java
	{
		NumberFormat f = NumberFormat.getNumberInstance();
		f.setMaximumFractionDigits(2);
		f.setMinimuFractionDigits(2);
		System.out.println("Price Rs. ::" + f.format(89.198));
	}
}