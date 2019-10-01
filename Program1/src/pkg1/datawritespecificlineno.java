package pkg1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class datawritespecificlineno {
	
	public void input (int line) throws IOException
	{
		File f= new File ("C:\\Users\\hp\\Desktop\\samplefile.txt");    //Create a method and pass the linecount and that method will write based upon that condition
		FileWriter fw= new FileWriter (f);
		BufferedWriter bw= new BufferedWriter (fw);
		int r=0;
		for (int i=0; i<=10 ; i++)
		{
			r= r+1;
			if (r==line)
			{
				bw.write("Welcome Roops");
         	}
			
			bw.newLine();
		}
		
		bw.close();
	}
	
	public static void main(String[] args) throws IOException {
		
		datawritespecificlineno dw= new datawritespecificlineno();
		Scanner s= new Scanner (System.in);
    	System.out.println("Enter the Line no on which you want to write");
    	int a= s.nextInt();
		dw.input(a);
	}
		
	}


