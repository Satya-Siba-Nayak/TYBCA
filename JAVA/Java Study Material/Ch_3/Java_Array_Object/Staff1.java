class Staff
{
    String name,bdate,des;
    int sal;
    Staff(String name,String bdate,String des,int sal)
    {
        this.name=name;
        this.bdate=bdate;
        this.des=des;
        this.sal=sal;
    }
    public void display()
    {
        System.out.println("Name : "+name);
        System.out.println("Birth Date : "+bdate);
        System.out.println("Designation : "+des);
        System.out.println("Salary : "+sal);
    }
}
public class Staff1 {
    public static void main(String args[])
    {
        Staff s1 = new Staff("Harsh","25 March 1995","Manager",76000);
        Staff s2 = new Staff("Sushma","9 August 1998","Employee",53000);
        s1.display();
        s2.display();
        if(s1.sal>s2.sal)
        {
            System.out.println(s1.name+" has the highest salary "+s1.sal);
        }
        else
        {
            System.out.println(s2.name+" has the highest salary "+s2.sal);
        }
    }
}
