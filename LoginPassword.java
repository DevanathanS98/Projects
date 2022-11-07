package com.selenium;

import java.awt.AWTException;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPassword {
  
	public static void main(String[] args) throws InterruptedException //throws InterruptedException,AWTException 
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver newdriver = new ChromeDriver();
	//newdriver.manage().window().maximize();
	newdriver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F_encoding%3DUTF8%26ref_%3Dnav_em_hd_re_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&&ref_%3Dnav_em_hd_clc_signin_0_1_1_32");
	
	WebElement email = newdriver.findElement(By.id("ap_email"));
	email.sendKeys("sgdevanathan@gmail.com");
	Thread.sleep(2000);
	WebElement continu = newdriver.findElement(By.className("a-button-input"));
	continu.click();
	Thread.sleep(2000);
	WebElement otp = newdriver.findElement(By.id("continue"));
	otp.click();
	Thread.sleep(2000);
	WebElement otpp = newdriver.findElement(By.id("continue"));
	otpp.click();
	Thread.sleep(2000);
	WebElement pass = newdriver.findElement(By.id("ap_password"));
	pass.sendKeys("1234567890");
	Thread.sleep(2000);
	WebElement sign = newdriver.findElement(By.id("signInSubmit"));
	sign.click();
	System.out.println("sucessfully completed");
	}
}
