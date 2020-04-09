package org.testing.TestScripts;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testing.Base.Base;
import org.testing.Pages.Login;
import org.testing.Pages.Video_Play;
import org.testing.Utilities.Logs;
import org.testing.Utilities.Screenshot;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class TC4 extends Base{
	
	@Test
	public void videoPlayAndSubscribe() throws InterruptedException, IOException
	{
		//String expected_email= "roops92banasthali@gmail.com";//
		Login l= new Login (driver, pr);
		l.signin("user1", "password1");
		
		/*WebElement email= driver.findElement(By.id(pr.getProperty("Email id")));
		String actual_email= email.getText();
		System.out.println (actual_email);
		Thread.sleep(5000);
		Assert.assertEquals(expected_email, actual_email); */
		
		Logs.take_log("TC4",  "Login successfully for TC4");
		
		Video_Play v= new Video_Play(driver, pr);
		v.video(2);
		
		Logs.take_log("TC4", "Video played successfully for TC4");
		
		System.out.println("Subscribe the video played");
		Thread.sleep(5000);
		WebElement subscribe= driver.findElement(By.xpath(pr.getProperty("subscribe")));
		subscribe.click();
		System.out.println("Channel subscribed");
		
		Logs.take_log("TC4",  "Channel subscribed successfully for TC4");
		
		Screenshot.take_screenshot(driver,"C:\\Users\\hp\\Desktop\\screenshotimages\\fourth.png");
		
		Logs.take_log("TC4",  "TC4 pass successfully");
	
  }
}