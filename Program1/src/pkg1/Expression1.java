package pkg1;

public class Expression1 {                //(((((10+2)+2)-2)*2)/2)
	
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
	public int mul (int a, int b)
	{
		int c;
		c= a*b;
		return c;
	}
	public void div (int a, int b)
	{
		int c;
		c= a/b;
		System.out.println("Final result is" + c);
	}
	public static void main(String[] args) {
		
		Expression1 ref = new Expression1();
		int sum1= ref.sum(10,2);
		int sum2= ref.sum(sum1, 2);
		int sub1=ref.sub(sum2,2);
		int mul1= ref.mul(sub1, 2);
	    ref.div(mul1, 2);		
				
 }

}
