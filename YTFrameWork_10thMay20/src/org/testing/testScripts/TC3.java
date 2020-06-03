package org.testing.testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.logging.Logs;
import org.testing.Assertions.Assertion1;
import org.testing.Base.BaseClass;
import org.testing.Pages.SignIn;
import org.testing.Pages.SignOut;
import org.testing.Utilities.LogsCapture;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class TC3 extends BaseClass{
	

	@Test
	public void libraryClick() throws InterruptedException
	{
		
		SignIn sg= new SignIn(driver,pr);
		sg.signInMethod("roopanshi.raj@technocompanion.com", "Roopanshi@123");
		LogsCapture.takeLogs("TC3", "Signin successful");
		Thread.sleep(5000);
		
		String expected_url= "https://www.youtube.com/";
		String actual_url= driver.getCurrentUrl();
		Assert.assertEquals(actual_url, expected_url);      //hard assertion
		System.out.println("Expected & Actual URL matched successfully");
		LogsCapture.takeLogs("TC3", "Expected & Actual URL matched successfully");
		
		String expectedEmailID= "roopanshi.raj@technocompanion.com";
		WebElement avatarImage= driver.findElement(By.xpath(pr.getProperty("avtimg")));
		avatarImage.click();
		WebElement loggedInId= driver.findElement(By.xpath(pr.getProperty("loggedEmailID")));
		String actualEmailID= loggedInId.getText();
		if (Assertion1.assert1(expectedEmailID, actualEmailID))   //soft assertion
		{
			LogsCapture.takeLogs("TC3", "Expected & Actual  Email ID matched successfully");
		}
		else
		{
			LogsCapture.takeLogs("TC3", "Expected & Actual  Email ID didn't matched");
		}
		
		WebElement library= driver.findElement(By.xpath(pr.getProperty("library")));
		library.click();
		System.out.println("Clicked on Library");
		LogsCapture.takeLogs("TC3", "Clicked on Library successfully");
		Thread.sleep(5000);
		
		SignOut so= new SignOut(driver, pr);
		so.signOutMethod();
		LogsCapture.takeLogs("TC3", "Signout successful");
		Thread.sleep(5000);
		
		LogsCapture.takeLogs("TC3", "Testcase3 pass successfully");
	}	
	
	

}
