package pkg1;

import java.util.Scanner;

public class Armstrongno {
	
	public static void main(String[] args) {
		
		int n, temp, rem, c=0;
		System.out.println("Enter any number");
		Scanner s= new Scanner(System.in);
		n= s.nextInt();
		temp = n;
		while (n>0)
		{
			rem= n%10;
			n= n/10;
			c= c + (rem* rem* rem);
		}
		if (temp==c)
		{
			System.out.println("Number is armstrong");
		}
		else
		{
			System.out.println("Number is not armstrong");
		}
	}

}
