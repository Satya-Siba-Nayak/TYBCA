import java.util.Scanner;
class Student
{
    	int rollno;
    	String name;
    	Student(int rollno,String name)
   	 {
       	 	this.rollno=rollno;
        		this.name=name;
		
   	 }
    	public void display()
   	 {
       	 System.out.println("Rollno : "+rollno);
        	System.out.println("Name : "+name);
    	}
}
class Marks extends Student
{
    
   	 Marks(int rollno, String name) 
	{
        		super(rollno, name);
			super.display();
        		
  	 }
    	int mtheory,mpract,tot;
    	Scanner sc=new Scanner(System.in);

	
    	public int setmarks()
    	{
      	  	System.out.println("Enter theory marks of Java out of 100: ");
        		mtheory=sc.nextInt();
        		System.out.println("Enter practical marks of Java out of 100: ");
        		mpract=sc.nextInt();
        		tot=mtheory+mpract;
        		return tot;
    	}
    	public int getmarks()
	{
    	return tot;
	}
	
}
public class FinalMarks 
{
    public static void main(String args[])
    {
       /// Student s=new Student(45,"Rohit");
      //  s.display();
        Marks m=new Marks(45,"Rohit");
        m.setmarks();
        int x=m.getmarks();
        System.out.println("Total marks:"+x);
    }
}
