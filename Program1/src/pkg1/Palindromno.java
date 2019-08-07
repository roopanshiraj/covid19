package pkg1;

import java.util.Scanner;

public class Palindromno {
	
	public static void main(String[] args) {
		
		int n, temp, rem, rev=0;
		System.out.println("Enter any number");
		Scanner s= new Scanner(System.in);
		n=s.nextInt();
		temp=n;
		while (n>0)
		{
			rem= n%10;
			rev= (rev*10) + rem;
			n= n/10;
		}	
			if (temp==rev)
			{
				System.out.println("Number is palindrome");
			}
			else
			{
				System.out.println("Number is not palindrome");
			}
			}
		}
	


