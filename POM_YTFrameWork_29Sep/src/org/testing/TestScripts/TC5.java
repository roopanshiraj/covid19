package org.testing.TestScripts;


import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testing.Base.Base;
import org.testing.Pages.Login;
import org.testing.Utilities.Logs;
import org.testing.Utilities.Screenshot;
import org.testing.assertions.Assert1;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class TC5 extends Base {
	
	@Test
	public void loginAndHistoryClick() throws InterruptedException, IOException
	{
		String expected_url= "https://accounts.google.com/signin/v2/sl/pwd?service=youtube&uilel=3&passive=true&continue=https%3A%2F%2Fwww.youtube.com%2Fsignin%3Faction_handle_signin%3Dtrue%26app%3Ddesktop%26hl%3Den%26next%3D%252F&hl=en&ec=65620&flowName=GlifWebSignIn&flowEntry=ServiceLogin&cid=1&navigationDirection=forward"; 
		
		Login l= new Login (driver, pr);
		l.signin("user1", "password1");
		
        String actual_url= driver.getCurrentUrl();
        System.out.println(actual_url);
        Thread.sleep(5000);
		
		Assert.assertTrue (Assert1.assert1(expected_url, actual_url));
		
		Assert.assertTrue(true);
		
		Logs.take_log("TC5",  "Login successfully for TC5");
		
		System.out.println("Click on History");
		WebElement history= driver.findElement(By.xpath(pr.getProperty("history")));
		history.click();
		System.out.println("Clicked on History");
		
		Logs.take_log("TC5",  "Successfully clicked on History for TC5");
		
		Screenshot.take_screenshot(driver,"C:\\Users\\hp\\Desktop\\screenshotimages\\fifth.png");
		
		Logs.take_log("TC5",  "TC5 pass successfully");

   }
	
}
