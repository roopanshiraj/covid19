package org.testing.Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	
	public ChromeDriver driver;
	public ChromeOptions options;
	public Properties pr;
		
		@BeforeMethod
		public void browserlaunch() throws IOException
		{
		options= new ChromeOptions();
		options.addArguments("--disable-notifications");
	    System.setProperty("webdriver.chrome.silentOutput", "true");	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Documents\\chromedriver.exe");
		driver= new ChromeDriver(options);
		File f= new File("../YTFrameWork_10thMay20/ObjectRepository.properties");
		FileInputStream fi= new FileInputStream(f);
		pr= new Properties();
		pr.load(fi);
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		}
		
		
		 @AfterMethod
		 public void close() throws InterruptedException 
	     {
			Thread.sleep(5000);	
		    driver.close();
	     }

}
