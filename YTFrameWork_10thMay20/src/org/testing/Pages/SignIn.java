package org.testing.Pages;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignIn {
	
	ChromeDriver driver;
	Properties pr;
	
	public SignIn(ChromeDriver driver, Properties pr)
	{
		this.driver= driver;
		this.pr=pr;
	}
	
	public void signInMethod(String userName, String pswd) throws InterruptedException
	{
		WebElement signin= driver.findElement(By.xpath(pr.getProperty("signin")));
		signin.click();
		WebElement email= driver.findElement(By.xpath(pr.getProperty("email")));
		email.sendKeys(userName);
		WebElement next= driver.findElement(By.xpath(pr.getProperty("next")));
		next.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement password= driver.findElement(By.xpath(pr.getProperty("password")));
		password.sendKeys(pswd);
		Thread.sleep(5000);
		WebElement finalnext= driver.findElement(By.xpath(pr.getProperty("finalnext")));
		finalnext.click();
		System.out.println("Login successful");
	}

}
