package pkg1;

import java.util.Scanner;

public class table {
	
	public static void main(String[] args) {
		
		int n, i, table;
		System.out.println("Enter any no");
		Scanner s= new Scanner (System.in);
		n= s.nextInt();
		System.out.println("Table of" +n + "is \n");
	
		for (i=1; i<=10; i++)
		{
			table= n*i;
			System.out.println(n+ "*" + i + "=" + table);
		}
	}

}
