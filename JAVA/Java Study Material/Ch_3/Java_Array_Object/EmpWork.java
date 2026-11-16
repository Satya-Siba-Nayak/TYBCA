import java.util.Scanner;
abstract class Person{
    abstract public void display();
}
class Employee extends Person{
    int eno;
    String ename,address;
    Employee(int eno,String ename,String address){
        this.eno=eno;
        this.ename=ename;
        this.address=address;
    }
    public void display()
    {
        System.out.println("Employee Id:"+eno);
        System.out.println("Employee Name:"+ename);
        System.out.println("Employee Address:"+address);
    }
}
class Worker extends Person{
    int wno;
    String wname,address;
    Scanner sc=new Scanner(System.in);
    Worker(int wno,String wname,String address){
        this.wno=wno;
        this.wname=wname;
        this.address=address;
    }
    public void display()
    {
        System.out.println("Worker Id:"+wno);
        System.out.println("Worker Name:"+wname);
        System.out.println("Worker Address:"+address);
    }
    
}
class EmpWork{
    public static void main(String args[])
    {
       Employee e=new Employee(101,"Ram","Mumbai");
       e.display();
       Worker w=new Worker(11,"Raj","Mumbai");
       w.display();
    }
}