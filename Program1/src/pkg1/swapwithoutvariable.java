package pkg1;

import java.util.Scanner;

public class swapwithoutvariable {

	public static void main(String[] args) {
		
       int a, b;
		
		System.out.println("Enter the values of a and b");
		Scanner s= new Scanner (System.in);
		a= s.nextInt();
		b= s.nextInt();
		System.out.println("Before Swapping \n" +a + "\n" +b);
		a= a+b;
		b= a-b;
		a= a-b;
		System.out.println("After Swapping \n" +a  +"\n" +b);
		
	}
}
