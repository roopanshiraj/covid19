package pkg1;

import java.util.Scanner;

public class scannerclassexp {
	
	public int sum(int a, int b)
	{
		int c;
		c=a+b;
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
	public void div(int a, int b)
	{
		int c;
		c=a/b;
		System.out.println("Final result is" + c);
	}
	public static void main(String[] args) {
		
		Scanner s=new Scanner (System.in);
		System.out.println("Please enter the value of v1");
		int v1= s.nextInt();
		System.out.println("Please enter the value of v2");
		int v2= s.nextInt();
		System.out.println("Please enter the value of v3");
		int v3= s.nextInt();
		System.out.println("Please enter the value of v4");
		int v4= s.nextInt();
		System.out.println("Please enter the value of v5");
		int v5= s.nextInt();
		System.out.println("Please enter the value of v6");
		int v6= s.nextInt();
		
		scannerclassexp ref= new scannerclassexp();
		int sum1= ref.sum(v1, v2);
		int sub1= ref.sub(sum1, v3);
		int sum2= ref.sum(sub1, v4);
		int mul1= ref.mul(sum2, v5);
		ref.div(mul1, v6);	
	}
	
}
