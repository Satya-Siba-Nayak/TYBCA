import java.util.*;
class Q5{

public int SumOfDigit(int num){
	int sum = 0;
	while(num > 0){
		sum += (num % 10);
		num/= 10;
	}
	
	return sum;
}


public static void main(String[] args){
	Scanner sc = new Scanner(System.in); 

	Q5 obj = new Q5();
	System.out.println("Enter Number : ");
	int num = sc.nextInt();
	System.out.println("sum of Digits is : "+ obj.sumOfDig(num));
	
	
}
}
