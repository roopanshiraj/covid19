package pkg1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class filewrite5inputs {
	
	public static void main(String[] args) throws IOException {
		
		File f= new File ("C:\\Users\\hp\\Desktop\\filewrite.txt");  // Take 5 inputs from user and write in a file
		FileWriter fw= new FileWriter (f);
		BufferedWriter bw= new BufferedWriter (fw);
		Scanner s= new Scanner (System.in);
		System.out.println("Enter the data which you want to enter for 5 lines");
		for (int i=0; i<5; i++)
		{
			String a= s.next();
			bw.write(a);
			bw.newLine();
		}
		
		bw.close();
		System.out.println("Data Entered");
		
	}

}
