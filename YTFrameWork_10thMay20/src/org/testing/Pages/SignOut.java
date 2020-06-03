package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testing.Utilities.LogsCapture;

public class SignOut {
	
	ChromeDriver driver;
	Properties pr;
	
	public SignOut(ChromeDriver driver, Properties pr)
	{
		this.driver= driver;
		this.pr=pr;
	}
	
	public void signOutMethod() throws InterruptedException
	{
		WebElement profileimg= driver.findElement(By.xpath(pr.getProperty("profileimage")));
		profileimg.click();
		Thread.sleep(5000);
		WebElement signout= driver.findElement(By.xpath(pr.getProperty("signout")));
		signout.click();
		System.out.println("Logged out successfully");
		
	}
	

}
