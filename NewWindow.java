package com.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NewWindow {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Actions a= new Actions(driver);
		Robot r=new Robot();
		
		WebElement best= driver.findElement(By.xpath("//a[@href='/gp/bestsellers/?ref_=nav_cs_bestsellers']"));
		a.contextClick(best).build().perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		
		WebElement deals = driver.findElement(By.xpath("//a[@href='/deals?ref_=nav_cs_gb']"));
		a.contextClick(deals).build().perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		
		WebElement mobile= driver.findElement(By.xpath("//a[@href='/mobile-phones/b/?ie=UTF8&node=1389401031&ref_=nav_cs_mobiles']"));
		a.contextClick(mobile).build().perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		
		WebElement cust= driver.findElement(By.xpath("//a[@href='/gp/help/customer/display.html?nodeId=200507590&ref_=nav_cs_help\']"));
		a.contextClick(cust).build().perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		
		//getwindowsize
		int size = driver.getWindowHandles().size();
		System.out.println(size);
		
		//get title for all the windowss
		Set<String> windowHandles = driver.getWindowHandles();
		for (String cp : windowHandles) {
			String title = driver.switchTo().window(cp).getTitle();
			System.out.println("all window title:"+title);
		}
		//Parent Window ID
			String windowHandle = driver.getWindowHandle();
			System.out.println(windowHandle);
			
		//Go to particular Window
			String actual_title= "Mobile Phones: Buy New Mobiles Online at Best Prices in India | Buy Cell Phones Online - Amazon.in";
			for (String cp : windowHandles) {
			if(driver.switchTo().window(cp).getTitle().equals(actual_title)) {
				break;
			}
			//close non parent window
			for (String cp1 : windowHandles) {
				if (!cp1.equals(windowHandle))	{
					driver.switchTo().window(cp1);
					driver.close();
				}
			}
			}
					
					
		}
		
	}

