package com.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {
 public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://demoqa.com/alerts");
	
	WebElement alt = driver.findElement(By.xpath("//button[@id='alertButton']"));
	alt.click();
	Thread.sleep(2000);
	org.openqa.selenium.Alert a = driver.switchTo().alert();
	a.accept();
	Thread.sleep(3000);
	
	WebElement b = driver.findElement(By.id("confirmButton"));
	b.click();
	Thread.sleep(2000);
	org.openqa.selenium.Alert b1 =driver.switchTo().alert();
	b1.accept();
 
	WebElement findElement = driver.findElement(By.id("promtButton"));
	findElement.click();
	Thread.sleep(3000);
	org.openqa.selenium.Alert c = driver.switchTo().alert();
	a.sendKeys("deva");
	Thread.sleep(3000);
    a.accept();
    
    
 }
}
