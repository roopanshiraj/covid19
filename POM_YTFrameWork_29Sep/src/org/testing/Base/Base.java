package org.testing.Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {
	
	public ChromeDriver driver;
	public Properties pr;
		
		@BeforeMethod
		public void browserlaunch() throws IOException
		{
		File f= new File("C:\\Users\\hp\\git\\LocalRepository\\POM_YTFrameWork_29Sep\\org.Properties");	
		FileInputStream fi= new FileInputStream (f);
		pr=new Properties();
		pr.load(fi);
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Documents\\JAVA Classes\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.youtube.com");
		driver.manage().window().maximize();
		}
		
		@AfterMethod
		 public void close() throws InterruptedException 
	    {
			Thread.sleep(5000);	
		    driver.close();
	    }

}
