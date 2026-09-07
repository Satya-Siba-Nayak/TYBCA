import java.util.Scanner;

class passenger_details
{
    int p_id;
    String p_name;
    void accept(int p_id,String p_name)
    {
        this.p_id = p_id;
        this.p_name = p_name;
    }
    void display()
    {
        System.out.printf("\n Passenger Id: %d \n Passenger Name: %s",p_id,p_name);
    }
}
public class Passenger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        passenger_details p[] = new passenger_details[10];
        for(int i=0;i<10;i++)
        {
            System.out.printf("\n Enter P_Id and P_Name of Passenger %d: ",i+1);
            int p_id = sc.nextInt();
            String p_name = sc.next();
            p[i] = new passenger_details();
            p[i].accept(p_id,p_name);
        }
        for(int i=0;i<10;i++)
        {
            p[i].display();
        }
    }
}
