import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("\n Enter any five numbers:");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        float d = sc.nextFloat();
        float e = sc.nextFloat();
       float result =  (a+b+c+d+e)/5;
       System.out.println("Average of five number is: "+ result);
    }
}
