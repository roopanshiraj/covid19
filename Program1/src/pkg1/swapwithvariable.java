package pkg1;

import java.util.Scanner;

public class swapwithvariable {
	
	public static void main(String[] args) {
		
		int a, b, temp;
		
		System.out.println("Enter the values of a and b");
		Scanner s= new Scanner (System.in);
		a= s.nextInt();
		b= s.nextInt();
		System.out.println("Before Swapping \n" +a + "\n" +b);
		temp=a;
		a=b;
		b=temp;
		System.out.println("After Swapping \n" +a  +"\n" +b);
	}

}
