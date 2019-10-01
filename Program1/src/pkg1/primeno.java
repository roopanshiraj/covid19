package pkg1;

import java.util.Scanner;

public class primeno {
	
	public static void main(String[] args) {
		
		int n, count=0;
		System.out.println("Enter any number");
		Scanner s= new Scanner(System.in);
		n= s.nextInt();
		for(int i=2; i<=n/2; i++)
		{
			if (n%i==0)
			{
				System.out.println("Number is not prime");
				count = 1;
				break;
			}
		}
		
		if (count==0)
		{
			System.out.println("Number is prime");
		}
		
		    
	}
		

}
