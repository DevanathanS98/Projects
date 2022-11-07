package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569891%7Cb%7Cfacebook%20signin%7C&placement=&creative=589460569891&keyword=facebook%20signin&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221832%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-3821998899%26loc_physical_ms%3D1007809%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=CjwKCAjw4c-ZBhAEEiwAZ105RcTkuKNk_VGpc8o7Rg3zPdXyUXCTUP2xyNMNP2iJDX2u3iZOkj7LoBoCC4UQAvD_BwE");
		
//		WebElement findElement = driver.findElement(By.xpath("//select[@id='day']"));
//		Select a = new Select(findElement);
//		a.selectByIndex(4);
//		Thread.sleep(2000);
//		a.selectByVisibleText("27");
//		Thread.sleep(2000);
//		a.selectByValue("10");
//		
//		WebElement findElement2 = driver.findElement(By.xpath("//select[@name='birthday_month']"));
//		Select b = new Select(findElement2);
//		b.selectByIndex(2);
//		Thread.sleep(2000);
//		b.selectByValue("9");
//		Thread.sleep(2000);
//		b.selectByVisibleText("Apr");
//		Thread.sleep(3000);
		
		driver.navigate().to("http://testleaf.herokuapp.com/pages/Dropdown.html");
		WebElement findElement21= driver.findElement(By.xpath("//select[@multiple='']"));
		Select b1 =new Select(findElement21);
		b1.selectByIndex(1);
		b1.selectByValue("2");
		b1.selectByVisibleText("UFT/QTP");
		Thread.sleep(3000);
		b1.deselectAll();
		
		
		
	}

}
