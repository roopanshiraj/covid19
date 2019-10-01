package org.testing.TestScripts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testing.Base.Base;
import org.testing.Pages.Login;
import org.testing.Pages.Video_Play;
import org.testng.annotations.Test;

public class TC4 extends Base{
	
	@Test
	public void videoPlayAndSubscribe() throws InterruptedException
	{
		Login l= new Login (driver, pr);
		l.signin("user1", "password1");
		
		Video_Play v= new Video_Play(driver, pr);
		v.video(2);
		
		System.out.println("Subscribe the video played");
		Thread.sleep(5000);
		WebElement subscribe= driver.findElement(By.xpath(pr.getProperty("subscribe")));
		subscribe.click();
		System.out.println("Channel subscribed");
	
  }
}