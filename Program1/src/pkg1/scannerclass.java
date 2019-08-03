package pkg1;

import java.util.Scanner;

public class scannerclass {
	
	public int sum(int a, int b)              // (a+b) (a-b)
	{
		int c;
		c= a +b;
		return c;
	}
	public int sub (int a, int b)
	{
		int c;
		c= a-b;
		return c;
	}
	public void mul(int a, int b)
	{
		int c;
		c= a*b;
		System.out.println("final result is" + c);
	}
	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the values of and b for sum");
		int a1= s.nextInt();
		int b1= s.nextInt();
		System.out.println("Enter the values of a and b for sub");
		int c1= s.nextInt();
		int d1= s.nextInt();
		scannerclass ref= new scannerclass();
		int sum_result= ref.sum(a1,b1);
		int sub_result= ref.sub(c1, d1);
		ref.mul(sum_result, sub_result);
					
	}

}
