package pkg1;

import java.util.Scanner;

public class Armstrongno {
	
	public static void main(String[] args) {
		
		int n, temp, rem, sum=0;
		System.out.println("Enter any number");
		Scanner s= new Scanner(System.in);
		n= s.nextInt();
		temp = n;
		while (n>0)
		{
			rem= n%10;
			sum= sum + (rem* rem* rem);
			n= n/10;
			
		}
		if (temp==sum)
		{
			System.out.println("Number is armstrong");
		}
		else
		{
			System.out.println("Number is not armstrong");
		}
	}

}
