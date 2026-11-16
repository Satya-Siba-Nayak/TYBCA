import java.util.Scanner;

class emp_
{
    int emp_no;
    String emp_name,designation;
    emp_(int emp_no,String emp_name,String designation)
    {
        this.emp_no =  emp_no;
        this.emp_name = emp_name;
        this.designation = designation;
    }
    void display()
    {
        System.out.printf("\n Employee No: %d \n Employee Name: %s \n Employee Designation: %s",emp_no,emp_name,designation);
    }
}

class emp_salary extends emp_
{
    float emp_salary;
    emp_salary(int emp_no,String emp_name,String designation)
    {
        super(emp_no,emp_name,designation);
        if(designation.equalsIgnoreCase("Manager"))
        {
            this.emp_salary = 70000 ;
        }
        else if(designation.equalsIgnoreCase("Employee"))
        {
            this.emp_salary = 50000;
        }
        else if(designation.equalsIgnoreCase("Worker"))
        {
            this.emp_salary = 40000;
        }

    }
    void display() {
        super.display();
        System.out.printf("\n Employee Salary: %f",emp_salary);
    }
}

public class EmpSal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("\n Enter Employee No, Name and Designation:");
        int id = sc.nextInt();
        String name = sc.next();
        String designation = sc.next();

        emp_salary emp_s = new emp_salary(id,name,designation);
        emp_s.display();
        sc.close();
    }
}