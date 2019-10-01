package pkg1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class specificdataread {
	
	public void readLine (int strt, int end) throws IOException
	{
		File f= new File ("C:\\Users\\hp\\Desktop\\filewrite.txt");  // Create a method pass the starting line number and end line number and that method will read the data of that range
		FileReader fr= new FileReader (f);
		BufferedReader br= new BufferedReader (fr);
		String s;
		int r=0;
		while ((s=br.readLine())!= null)
		{
			r= r+1;
			if ((r>=strt) && (r<=end))
			{
				System.out.println(s);
			}
	}
	
	
	}
	    public static void main(String[] args) throws IOException {
			
	    	specificdataread sf= new specificdataread();
	    	Scanner s= new Scanner (System.in);
	    	System.out.println("Enter the starting and End Line no");
	    	int a= s.nextInt();
	    	int b= s.nextInt();
	    	sf.readLine(a,b);
		}
	

}

