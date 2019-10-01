package pkg1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
  
public class ReadWriteFile {
	
	public static void main(String[] args) throws IOException {       // Read data from file1 and write into file2
		
		File f1= new File ("C:\\Users\\hp\\Desktop\\input_file1.txt");
		FileReader fr= new FileReader(f1);
		BufferedReader b= new BufferedReader (fr);
		String s;
		File f2= new File ("C:\\Users\\hp\\Desktop\\input_file2.txt");
		FileWriter fw= new FileWriter (f2);
		BufferedWriter bw= new BufferedWriter (fw);
		
		while((s= b.readLine())!= null)
		{
			bw.write(s);
			bw.newLine();
		}
		bw.close();
					
		
	}

}
