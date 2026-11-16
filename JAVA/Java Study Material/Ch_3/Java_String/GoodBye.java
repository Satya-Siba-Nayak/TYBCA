import java.util.Scanner;
public class GoodBye {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int count=0;
        while(true)
        {
            System.out.println("Enter a line:");
            String str=sc.nextLine();
            if(str.contains("Good Bye"))
            {
                break;
            }
            else if(str.contains("India") || str.contains("Hello"))
            {
                count++;
            }
        }
        System.out.println("This is the lines in which Good Bye pattern was found : "+count);
        sc.close();
    }
}
