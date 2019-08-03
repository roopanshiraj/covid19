package pkg1;

public class Expression2 {              // (((((10/2)+2)-3)*2)
	
	public int div (int a, int b)
	{
		int c;
		c= a/b;
		return c;
	}
	public int sum (int a, int b)
	{
		int c;
		c= a+b;
		return c;
	}
	public int sub (int a, int b)
	{
		int c;
		c= a-b;
		return c;
	}
	public void mul (int a, int b)
	{
		int c;
		c= a*b;
		System.out.println("Final result is" + c);
	}
	public static void main(String[] args) {
		
		Expression2 ref= new Expression2();
		int div1= ref.div(10, 2);
		int sum1= ref.sum(div1,2);
		int sub1= ref.sub(sum1, 3);
		ref.mul(sub1, 2);
				
	}

}
