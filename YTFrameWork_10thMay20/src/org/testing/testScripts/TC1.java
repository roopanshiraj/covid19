package org.testing.testScripts;

import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testing.Assertions.Assertion1;
import org.testing.Base.BaseClass;
import org.testing.Pages.SignIn;
import org.testing.Pages.SignOut;
import org.testing.Utilities.DateCalculation;
import org.testing.Utilities.LogsCapture;
import org.testing.Utilities.ScreenShotCapture;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC1 extends BaseClass{
	

	
	@Test
	public void trendingClick() throws InterruptedException, IOException
	{
		
		SignIn sg= new SignIn(driver,pr);
		sg.signInMethod("roopanshi.raj@technocompanion.com", "Roopanshi@123");
		LogsCapture.takeLogs("TC1", "Signin successful");
		Thread.sleep(5000);
		
		String expected_url= "https://www.youtube.com/";
		String actual_url= driver.getCurrentUrl();
		Assert.assertEquals(actual_url, expected_url);      //hard assertion
		System.out.println("Expected & Actual URL matched successfully");
		LogsCapture.takeLogs("TC1", "Expected & Actual URL matched successfully");
		
		String expectedEmailID= "roopanshi.raj@technocompanion.com";
		WebElement avatarImage= driver.findElement(By.xpath(pr.getProperty("avtimg")));
		avatarImage.click();
		WebElement loggedInId= driver.findElement(By.xpath(pr.getProperty("loggedEmailID")));
		String actualEmailID= loggedInId.getText();
		Assert.assertTrue((Assertion1.assert1(expectedEmailID, actualEmailID)));   //soft assertion
		System.out.println("Expected & Actual E-Mail ID matched successfully");
		LogsCapture.takeLogs("TC1", "Expected & Actual E-Mail ID matched successfully");
		
		WebElement trending= driver.findElement(By.xpath(pr.getProperty("trending")));
		trending.click();
		System.out.println("Clicked on Trending");
		LogsCapture.takeLogs("TC1", "Clicked on Trending successfully");
		Thread.sleep(5000);
		
		SignOut so= new SignOut(driver, pr);
		so.signOutMethod();
		LogsCapture.takeLogs("TC1", "Signout successful");
		Thread.sleep(5000);
		
		String classname= this.getClass().getSimpleName();
		String path= "C:\\screenshots\\"+ DateCalculation.dateCalculation()+"_"+ classname+ ".png" ;
		ScreenShotCapture.takeScreenShot(driver, path);
		System.out.println("Screenshot captured successfully");
		LogsCapture.takeLogs("TC1", "Screenshot captured successfully");
		
		LogsCapture.takeLogs("TC1", "Testcase1 pass successfully");
		
	}	
	


}
