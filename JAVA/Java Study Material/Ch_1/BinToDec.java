import java.util.*;
class BinToDec
{

	public int BinToDec(String s)
	{
		int num = 0;
		int Base = 1;
		int i = s.length()-1;
		while(i >= 0)
		{
			if(s.charAt(i) == '1')
			{
			//num += Base;
			num=num+Base;
			}
			//Base *= 2;
			Base=Base*2;
			i--;
		}
		return num;
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in); 
		BinToDec obj = new BinToDec();
		System.out.println("Enter Binary Number : ");
		String num = sc.nextLine();
		System.out.println("Binary to Decimal : " + obj.BinToDec(num));
	
	}
}
