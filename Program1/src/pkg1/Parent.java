package pkg1;

public class Parent {
	
	public Parent() {
         
		this(1,2,3);
		System.out.println("Parent default constructor");

	}
	
	public Parent(int a) {
		
		this(1,2);
		System.out.println("Parent one parameterized constructor");

	}
	
	public Parent(int a, int b) {
		 
		this();
		System.out.println("Parent two parameterized constructor");

	}
	
	public Parent(int a, int b, int c) {
		   
		System.out.println("Parent three parameterized constructor");

	}

}
