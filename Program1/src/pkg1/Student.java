package pkg1;

public class Student {
	
	int age;
	int roll_no ;
	public void display1()
	{
		System.out.println("first method");
	}
	public void display() 
	{
		System.out.println("second method");	
	}
	public static void main(String[] args) {
		
	Student ref = new Student();
	ref.age= 20;
	ref.roll_no = 10;
	ref.display1();
	ref.display();
	System.out.println("Age is" + ref.age);
	System.out.println("Roll No is" + ref.roll_no);
	
	
	}	

}
