package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionss {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/droppable");
//		WebElement sss = driver.findElement(By.xpath("//div[@id='draggable']"));
		
		Actions a=new Actions(driver);

//		click
//		a.click(sss).build().perform();
		
//		right click
//		a.contextClick(sss).build().perform(); 	
		
		//drag & drop
		WebElement drag = driver.findElement(By.id("draggable")); //("//div[@id='draggable']"));
		WebElement drop = driver.findElement(By.id("droppable")); //("//div[@id='droppable']"));
//		a.dragAndDrop(drag, drop).build().perform();
		a.clickAndHold(drag).moveToElement(drag).release(drop).build().perform();
	
	
	}

}
