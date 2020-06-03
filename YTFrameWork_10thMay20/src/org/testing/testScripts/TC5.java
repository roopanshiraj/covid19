package org.testing.testScripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testing.Assertions.Assertion1;
import org.testing.Base.BaseClass;
import org.testing.Pages.SignIn;
import org.testing.Pages.SignOut;
import org.testing.Pages.VideoPlay;
import org.testing.Utilities.DateCalculation;
import org.testing.Utilities.LogsCapture;
import org.testing.Utilities.ScreenShotCapture;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC5 extends BaseClass {
	
	@Test
	public void videoPlayAndLike() throws InterruptedException, IOException
	{
		String classname= this.getClass().getSimpleName();
		String path= "C:\\screenshots\\"+ DateCalculation.dateCalculation()+"_"+ classname+ ".png" ;
		
		SignIn sg= new SignIn(driver,pr);
		sg.signInMethod("roopanshi.raj@technocompanion.com", "Roopanshi@123");
		LogsCapture.takeLogs("TC5", "Signin successful");
		Thread.sleep(5000);
		
		String expected_url= "https://www.youtube.com/";
		String actual_url= driver.getCurrentUrl();
		Assert.assertTrue(Assertion1.assert1(expected_url, actual_url));   //soft assertion
		System.out.println("Expected & Actual URL matched successfully");
		LogsCapture.takeLogs("TC5", "Expected & Actual URL matched successfully");
		
		String expectedEmailID= "roopanshi.raj@technocompanion.com";
		WebElement avatarImage= driver.findElement(By.xpath(pr.getProperty("avtimg")));
		avatarImage.click();
		WebElement loggedInId= driver.findElement(By.xpath(pr.getProperty("loggedEmailID")));
		String actualEmailID= loggedInId.getText();
		Assert.assertTrue((Assertion1.assert1(expectedEmailID, actualEmailID)));   //soft assertion
		System.out.println("Expected & Actual EMail ID matched successfully");
		LogsCapture.takeLogs("TC5", "Expected & Actual EMail ID matched successfully");
		
		
		ScreenShotCapture.takeScreenShot(driver, path);
		System.out.println("Screenshot of signin page captured successfully");
		LogsCapture.takeLogs("TC5", "Screenshot of signin page captured successfully");
		
		VideoPlay vp= new VideoPlay(driver,pr);
		vp.videoPlayMethod();
		LogsCapture.takeLogs("TC5", "Video played successfully");
		Thread.sleep(5000);
			
		try {
			ScreenShotCapture.takeScreenShot(driver, path);
		    }
		catch(IOException e)
		{
			System.out.println("There is some issue in screenshot capturing");
		}
		
		System.out.println("Screenshot of videoplay page captured successfully");
		LogsCapture.takeLogs("TC5", "Screenshot of videoplay page captured successfully");
		
        WebElement like= driver.findElement(By.xpath(pr.getProperty("like")));
		like.click();
		System.out.println("Liked the video played");
		LogsCapture.takeLogs("TC5", "Liked the video played successfully");
		Thread.sleep(5000);
		
		SignOut so= new SignOut(driver, pr);
		so.signOutMethod();
		LogsCapture.takeLogs("TC5", "Signout successful");
		Thread.sleep(5000);
		
		LogsCapture.takeLogs("TC5", "Testcase5 pass successfully");
	}	
	 
	
}
