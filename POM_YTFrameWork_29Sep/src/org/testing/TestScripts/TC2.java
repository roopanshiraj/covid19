package org.testing.TestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testing.Base.Base;
import org.testing.Pages.Login;
import org.testng.annotations.Test;

public class TC2 extends Base{
	
	@Test
	public void loginandSubscriptionClick() throws InterruptedException
	{
		Login l= new Login (driver, pr);
		l.signin("user1", "password1");
		System.out.println("Click on Subscription");
		WebElement subscription= driver.findElement(By.xpath(pr.getProperty("subscription")));
		subscription.click();
		System.out.println("Clicked on Subscription");
	}
	

}
