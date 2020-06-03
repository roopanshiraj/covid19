package org.testing.Pages;

import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VideoPlay {
	
	ChromeDriver driver;
	Properties pr;
	
	public VideoPlay(ChromeDriver driver, Properties pr)
	{
		this.driver= driver;
		this.pr=pr;
	}
	
	public void videoPlayMethod()
	{
		List<WebElement> ls= driver.findElements(By.id("video-title"));
		 System.out.println("Video count is" + ls.size());
		 ls.get(2).click();
		System.out.println("Video played successfully");
	}

}
