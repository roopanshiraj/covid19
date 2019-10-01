package org.testing.TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testing.Base.Base;
import org.testing.Pages.Login;
import org.testng.annotations.Test;

public class TC1 extends Base {
	
	@Test
	public void loginandTrendingClick() throws InterruptedException
	{
	Login l= new Login (driver, pr);
	l.signin ("user1", "password1");
	System.out.println("Click on Trending");
	WebElement trending= driver.findElement(By.xpath(pr.getProperty("trending")));
	trending.click();
	System.out.println("Clicked on Trending");
 }

}