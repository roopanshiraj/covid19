package org.testing.testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testing.Assertions.Assertion1;
import org.testing.Base.BaseClass;
import org.testing.Pages.SignIn;
import org.testing.Pages.SignOut;
import org.testing.Pages.VideoPlay;
import org.testing.Utilities.LogsCapture;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC7 extends BaseClass {
	

	@Test
	public void videoPlayAndComment() throws InterruptedException
	{
		
		SignIn sg= new SignIn(driver,pr);
		sg.signInMethod("roopanshi.raj@technocompanion.com", "Roopanshi@123");
		LogsCapture.takeLogs("TC7", "Signin successful");
		Thread.sleep(5000);
		
		String expected_url= "https://www.youtube.com/";
		String actual_url= driver.getCurrentUrl();
		Assert.assertTrue(Assertion1.assert1(expected_url, actual_url));   //soft assertion
		System.out.println("Expected & Actual URL matched successfully");
		LogsCapture.takeLogs("TC7", "Expected & Actual URL matched successfully");
		
		String expectedEmailID= "roopanshi.raj@technocompanion.com";
		WebElement avatarImage= driver.findElement(By.xpath(pr.getProperty("avtimg")));
		avatarImage.click();
		WebElement loggedInId= driver.findElement(By.xpath(pr.getProperty("loggedEmailID")));
		String actualEmailID= loggedInId.getText();
		Assert.assertTrue((Assertion1.assert1(expectedEmailID, actualEmailID)));   //soft assertion
		System.out.println("Expected & Actual EMail ID matched successfully");
		LogsCapture.takeLogs("TC7", "Expected & Actual EMail ID matched successfully");
		
		VideoPlay vp= new VideoPlay(driver,pr);
		vp.videoPlayMethod();
		LogsCapture.takeLogs("TC7", "Video played successfully");
		Thread.sleep(5000);
		
		Actions ac= new Actions(driver);
		ac.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(5000);
		WebElement commenticon= driver.findElement(By.xpath(pr.getProperty("commenticon")));
		commenticon.click();
		ac.sendKeys(Keys.TAB).perform();
		Thread.sleep(5000);
		ac.sendKeys("Nice one").perform();
		Thread.sleep(5000);
		WebElement commentpost= driver.findElement(By.xpath(pr.getProperty("commentpost")));
		commentpost.click();
		System.out.println("Commented on Video");
		LogsCapture.takeLogs("TC7", "Commented on video successfully");
		Thread.sleep(5000);
		
		
		SignOut so= new SignOut(driver, pr);
		so.signOutMethod();
		LogsCapture.takeLogs("TC7", "Signout successful");
		Thread.sleep(5000);
		
		LogsCapture.takeLogs("TC7", "Testcase7 pass successfully");
	}	
	 
}
