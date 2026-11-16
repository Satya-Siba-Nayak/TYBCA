import java.util.Scanner;

public class DecimalToBinary 
{
    public static void main(String[] args) 
	{
        		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Decimal Number: ");
      	  	int num = sc.nextInt();
		System.out.print("Enter Size of the array");
      	  	int size = sc.nextInt();

        		int binary[] = new int[size];
        		int index = 0;

        		while (num > 0) 
		{
            			binary[index] = num % 2;   // Store remainder
            			num = num / 2;             // Update quotient
            			index++;
       	 	}

        		System.out.print("Binary Number = ");
		
		for (int i = index - 1; i >= 0; i--) 
		{
            			System.out.print(binary[i]);
       		 }
   	 }
}
