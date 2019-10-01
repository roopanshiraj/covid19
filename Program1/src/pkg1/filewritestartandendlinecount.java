package pkg1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class filewritestartandendlinecount {
	
	public void input (int strtlinecount , int endlinecount) throws IOException
	{
		File f= new File ("C:\\Users\\hp\\Desktop\\filewrite.txt");  //Create a method and pass the linecount and that method will write based upon that condition
		FileWriter fw= new FileWriter (f);
		BufferedWriter bw= new BufferedWriter (fw);
		int r=0;
		for (int i=0; i<=10 ; i++)
		{
			r= r+1;
			if ((r>=strtlinecount) && (r<=endlinecount))
			{
				bw.write("Welcome Roops");
         	}
			
			bw.newLine();
		}
		
		bw.close();
	}
	
		
	    public static void main(String[] args) throws IOException {
			
	    	filewritestartandendlinecount fl= new filewritestartandendlinecount();
	    	Scanner s= new Scanner (System.in);
	    	System.out.println("Enter the starting and End Line counton which you want to write data ");
	    	int a= s.nextInt();
	    	int b= s.nextInt();
	    	fl.input (a, b);
		}
	

}	




