package org.testing.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelHandling {
	
	public void readSpecificCellData(String path, int row, int cell ) throws 
	IOException
		{                                                                                                                //C:\\Users\\hp\\Desktop\\Shrinixssf.xlsx
			File f= new File(path);
			FileInputStream fi= new FileInputStream(f);
			XSSFWorkbook xw= new XSSFWorkbook(fi);
			XSSFSheet xs= xw.getSheetAt(0);
			XSSFRow xr= xs.getRow(row-1);
			XSSFCell xc= xr.getCell(cell-1);
			System.out.println(xc.getStringCellValue());
			
		}
	
	public void readSpecificRowData(String path, int row) throws IOException
	{
		File f= new File(path);
		FileInputStream fi= new FileInputStream(f);
		XSSFWorkbook xw= new XSSFWorkbook(fi);
		XSSFSheet xs= xw.getSheetAt(0);
		XSSFRow xr= xs.getRow(row-1);
		
		int cells= xr.getPhysicalNumberOfCells();
		for(int j=0; j<cells; j++)
		{
			XSSFCell xc= xr.getCell(j);
			System.out.print(xc.getStringCellValue() + "  ");
		}
		System.out.println();
	}
	
	public void readRowsBasedUponRangeStart(String path, int rowStart, int rowEnd) throws IOException                  //   C:\\Users\\hp\\Desktop\\apachepoi.xlsx
	{                                                                                                                  //C:\\Users\\hp\\Desktop\\Shrinixssf.xlsx
		File f= new File(path);                                                
		FileInputStream fi= new FileInputStream(f);
		XSSFWorkbook xw= new XSSFWorkbook(fi);
		XSSFSheet xs= xw.getSheetAt(0);
		
		for (int i=rowStart-1; i<rowEnd; i++)
		{
		   XSSFRow xr= xs.getRow(i);
	       int cells= xr.getPhysicalNumberOfCells();
		      for(int j=0; j<cells; j++)
		        {
			      XSSFCell xc= xr.getCell(j);
			      System.out.print(xc.getStringCellValue() + "  ");
		        }
		      System.out.println();
		 }
	}
		
		  public static void main(String[] args) throws IOException {
			  
			  String f= "C:\\Users\\hp\\Desktop\\apachepoi.xlsx" ;
			  ExcelHandling sd= new ExcelHandling();
			  System.out.println("Enter the row no and cell no whose data you want to read");
			  Scanner s= new Scanner(System.in);
			  int a= s.nextInt();
			  int b= s.nextInt();
			  sd.readSpecificCellData(f, a, b);
			  
			  System.out.println("Enter the row number whose data you want to read");
			  int a1= s.nextInt();
	          sd.readSpecificRowData(f, a1);
	          
	          System.out.println("Enter the initial row number number and the end row number whose data you want to read");
	  		  int a2= s.nextInt();
	  		  int b2= s.nextInt();
	  		  sd.readRowsBasedUponRangeStart(f,a2,b2);
			  
			
		}

}
