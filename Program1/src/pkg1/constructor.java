package pkg1;

public class constructor {
	
	public constructor() {
		
		this(1,2,3,4);
		 System.out.println("Default constructor");
	}
	public constructor(int a)
	{
		this();
		System.out.println("One parameterized constructor");
	}
	public constructor(int a, int b)
	{ 
		this(1,2,3);
		System.out.println("Two parameterized constructor");
	}
	public constructor(int a, int b, int c)
	{
		this(1);
		System.out.println("Three parameterized constructor");
	}
	public constructor(int a, int b, int c, int d)
	{
		System.out.println("Four parameterized constructor");
	}
	public static void main(String[] args) {
		
		constructor ref= new constructor(1,2);
		
	}
	
}
