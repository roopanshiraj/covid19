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
import org.testing.assertions.Assert1;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class TC3 extends Base{
	
	@Test
	public void videoPlayAndLike() throws InterruptedException, IOException
	{
		String expected_url= "https://accounts.google.com/signin/v2/sl/pwd?service=youtube&uilel=3&passive=true&continue=https%3A%2F%2Fwww.youtube.com%2Fsignin%3Faction_handle_signin%3Dtrue%26app%3Ddesktop%26hl%3Den%26next%3D%252F&hl=en&ec=65620&flowName=GlifWebSignIn&flowEntry=ServiceLogin&cid=1&navigationDirection=forward";
		
		Login l= new Login (driver, pr);
		l.signin("user1", "password1");
		
		String actual_url= driver.getCurrentUrl();
		System.out.println(actual_url);
		Thread.sleep(5000);
		
		Assert.assertTrue (Assert1.assert1(expected_url, actual_url));
		
		Assert.assertTrue(true); 
		
		Logs.take_log("TC3",  "Login successfully for TC3");
		
		Video_Play v= new Video_Play(driver, pr);
		v.video(2);
		
		Logs.take_log("TC3", "Video played successfully for TC3");
		
		System.out.println("Like the video played");
		Thread.sleep(5000);
		WebElement like= driver.findElement(By.xpath(pr.getProperty("like")));
		like.click();
		System.out.println("Video liked");
		
		Logs.take_log("TC3",  "Video liked successfully for TC3");
		
		Screenshot.take_screenshot(driver,"C:\\Users\\hp\\Desktop\\screenshotimages\\third.png");
		
		Logs.take_log("TC3",  "TC3 pass successfully");
	}
	

}
