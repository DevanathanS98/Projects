package com.selenium;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {
	public static void main(String[] args) throws InterruptedException, IOException  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.youtube.com/");
		
		
		driver.navigate().to("https://www.facebook.com/");
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().to("https://www.whatsapp.com/");
		driver.navigate().refresh();
		
		TakesScreenshot ts = (TakesScreenshot) driver;//Narrowing Typecasting
		File from =ts.getScreenshotAs(OutputType.FILE);
		
		File to = new File("C:\\Users\\admin\\eclipse-workspace\\Selenium\\screenshot\\img2.png");
		FileUtils.copyFile(from, to);
		
	}

}
