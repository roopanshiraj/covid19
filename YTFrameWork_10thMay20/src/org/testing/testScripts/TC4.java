package org.testing.testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testing.Assertions.Assertion1;
import org.testing.Base.BaseClass;
import org.testing.Pages.SignIn;
import org.testing.Pages.SignOut;
import org.testing.Utilities.LogsCapture;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC4 extends BaseClass {
	

	@Test
	public void historyClick() throws InterruptedException
	{
		

		SignIn sg= new SignIn(driver,pr);
		sg.signInMethod("roopanshi.raj@technocompanion.com", "Roopanshi@123");
		LogsCapture.takeLogs("TC4", "Signin successful");
		Thread.sleep(5000);
		
		String expected_url= "https://www.youtube.com/";
		String actual_url= driver.getCurrentUrl();
		Assert.assertTrue(Assertion1.assert1(expected_url, actual_url));   //soft assertion
		System.out.println("Expected & Actual URL matched successfully");
		LogsCapture.takeLogs("TC4", "Expected & Actual URL matched successfully");
		
		String expectedEmailID= "roopanshi.raj@technocompanion.com";
		WebElement avatarImage= driver.findElement(By.xpath(pr.getProperty("avtimg")));
		avatarImage.click();
		WebElement loggedInId= driver.findElement(By.xpath(pr.getProperty("loggedEmailID")));
		String actualEmailID= loggedInId.getText();
		Assert.assertTrue((Assertion1.assert1(expectedEmailID, actualEmailID)));   //soft assertion
		System.out.println("Expected & Actual  Email ID matched successfully");
		LogsCapture.takeLogs("TC4", "Expected & Actual  Email ID matched successfully");
		
		WebElement history= driver.findElement(By.xpath(pr.getProperty("history")));
		history.click();
		System.out.println("Clicked on History");
		LogsCapture.takeLogs("TC4", "Clicked on History successfully");
		Thread.sleep(5000);
		
		SignOut so= new SignOut(driver, pr);
		so.signOutMethod();
		LogsCapture.takeLogs("TC4", "Signout successful");
		Thread.sleep(5000);
		
		LogsCapture.takeLogs("TC4", "Testcase4 pass successfully");
	}	
	 


}
