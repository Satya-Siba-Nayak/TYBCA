import java.util.Scanner;

abstract class person
{
    	int no;
   	String name,address;
	//abstract accept(int no,String name,String address);
	//abstract display();
    void accept(int no,String name,String address)
    {
        this.no = no;
        this.name = name;
        this.address = address;
    }
    void display()
    {
        System.out.printf("\n Details: \n No: %d \n Name: %s \n Address: %s",no,name,address);
    }
}

class employee extends person
{
    @Override
    void accept(int no, String name, String address)
	{
        	super.accept(no, name, address);
    	}

    @Override
    void display() {
       super.display();
	System.out.printf("\n Details: \n No: %d \n Name: %s \n Address: %s",no,name,address);
    }
}

class worker extends person
{
    @Override
    void accept(int no, String name, String address) {
        super.accept(no, name, address);
    }

    @Override
    void display() {
        super.display();
    }
}

public class AbstarctClassExample {
    public static void main(String[] args) {
        int Choice;
        int no;
        String name,address;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.printf("\n 1.Employee \n 2.Worker \n 3.Exit");
            System.out.printf("\n Enter your choice:");
            Choice = sc.nextInt();
            switch (Choice)
            {
                case 1: employee emp = new employee();
                    System.out.printf("\n Enter Employee No:");
                    no = sc.nextInt();
                    System.out.printf("\n Enter Employee Name:");
                    name = sc.next();
                    System.out.printf("\n Enter Employee Address:");
                    address = sc.next();
                emp.accept(no,name,address);
                emp.display();
                break;

                case 2: worker wk = new worker();
                    System.out.printf("\n Enter Worker No:");
                    no = sc.nextInt();
                    System.out.printf("\n Enter Worker Name:");
                    name = sc.next();
                    System.out.printf("\n Enter Worker Address:");
                    address = sc.next();
                wk.accept(no,name,address);
                wk.display();
		case 3:
		break;	
		}
        }while (Choice!=3);
    }
}
