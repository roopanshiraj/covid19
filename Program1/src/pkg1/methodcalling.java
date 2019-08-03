package pkg1;

public class methodcalling {
	
	public void method1()
	{
		this.method1(1, 2);
		System.out.println("I am Default method");
	}
	public void method1(int a)
	{
		this.method1();
		System.out.println("I am 1 parameterized method");
		
	}
	public  void method1 (int a, int b)
	{
		System.out.println("I am 2 parameterized method");
		
	}
	public  void method1 (int a, int b, int c)
	{
		this.method1(1);
		System.out.println("I am 3 parameterized method");
	}
	
	public static void main(String[] args) {
		
		methodcalling ref = new methodcalling();
		ref.method1(1, 2, 3);
		
	}

}
