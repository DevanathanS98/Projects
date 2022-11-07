package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.pagefactory.ByAll;

public class Frames {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		driver.switchTo().frame(0);
		WebElement a = driver.findElement(By.xpath("//input[@type='text']"));
		a.sendKeys("deva");
		
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		WebElement b = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		b.click();
		
		WebElement c = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(c);
		WebElement d = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		driver.switchTo().frame(d);
		
		WebElement ee = driver.findElement(By.xpath("//input[@type='text']"));
		ee.sendKeys("hello");
		
	}	
}
