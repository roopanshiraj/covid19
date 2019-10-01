package pkg1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Readspecificline {

	
	public void readline (int line) throws IOException
	{
	
        File f= new File ("C:\\Users\\hp\\Desktop\\filewrite.txt"); // Create a method and pass the line number and that method will give the data corresponding to that line number.
        FileReader fr= new FileReader (f);
	    BufferedReader br= new BufferedReader (fr);
		String s;
		int r=0;
		while ((s=br.readLine())!= null)
		{
			r= r+1;
			if ((r==line))
			{
				System.out.println(s);
			}	
	}
	
	
	
}
	public static void main(String[] args) throws IOException {
		
		Readspecificline rl= new Readspecificline();
    	Scanner s= new Scanner (System.in);
    	System.out.println("Enter the Line no you want to read");
    	int a= s.nextInt();
    	rl.readline(a);
    	
	}
}
