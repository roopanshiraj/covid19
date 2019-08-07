package pkg1;

import java.util.Scanner;

public class Factorial {
	
	public static void main(String[] args) {
		
		int n, fact=1;
		System.out.println("Enter any no. whose factorial you want");
		Scanner s= new Scanner (System.in);
		n= s.nextInt();
		for (int i=1; i<=n; i++)
		{
			fact= fact*i;
		}
		System.out.println("Factorial of no is" + fact);
	}

}
