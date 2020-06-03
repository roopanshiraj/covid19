package org.testing.Utilities;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotCapture {
	
	public static void takeScreenShot(ChromeDriver driver, String path) throws IOException    //String fileName in braces
	{
	//String timestamp= new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss").format(new Date());	
	File f= driver.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(f, new File(path));
	//FileUtils.copyFile(f, new File(path+ fileName + " " + timestamp + ".png" ));
	

    }
	
}	
