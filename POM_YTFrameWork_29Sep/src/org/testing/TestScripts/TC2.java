package org.testing.TestScripts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testing.Base.Base;
import org.testing.Pages.Login;
import org.testing.Utilities.Logs;
import org.testing.Utilities.Screenshot;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class TC2 extends Base{
	
	@Test
	public void loginandSubscriptionClick() throws InterruptedException, IOException
	{
		//String expected_email= "roops92banasthali@gmail.com";//
		Login l= new Login (driver, pr);
		l.signin("user1", "password1");
		
		/*WebElement email= driver.findElement(By.id(pr.getProperty("Email id")));
		String actual_email= email.getText();
		System.out.println (actual_email);
		Thread.sleep(5000);
		Assert.assertEquals(expected_email, actual_email);*/
		
		Logs.take_log("TC2",  "Login successfully for TC2");
		
		System.out.println("Click on Subscription");
		WebElement subscription= driver.findElement(By.xpath(pr.getProperty("subscription")));
		subscription.click();
		System.out.println("Clicked on Subscription");
		
		Logs.take_log("TC2",  "Successfully clicked on Subscription for TC2");
		
		Screenshot.take_screenshot(driver,"C:\\Users\\hp\\Desktop\\screenshotimages\\second.png");
		
		Logs.take_log("TC2",  "TC2 pass successfully");
	}
	

}
