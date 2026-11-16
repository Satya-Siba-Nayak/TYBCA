import java.util.*;
import java.util.Scanner;
import java.io.*;
import java.lang.String;

public class StringCountDemo
{
  public static void main(String args[])
	{
  		 String searchFor = "This";
 		 String base = "This is This method";
 		 int len = searchFor.length();
 		 int result = 0;
 		 if (len > 0)
		 {  
  			int start = base.indexOf(searchFor);
  			while (start != -1) 
			{
  				result++;
  				start = base.indexOf(searchFor, start+len);
  			}
		 }
  		 System.out.println(result);
 	 }
} 