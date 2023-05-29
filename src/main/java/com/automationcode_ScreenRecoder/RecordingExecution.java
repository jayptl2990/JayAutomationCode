package com.automationcode_ScreenRecoder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RecordingExecution {
	
	
	public WebDriver driver;

	
	@Test
	public void testCase1() throws Exception {
		Thread.sleep(500);
		ScreenRecorderUtil.startRecord("testCase1");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://mail.rediff.com/");
		driver.findElement(By.xpath("//span[@id = 'username']/following::p[1]/child::a[1]")).click();
		driver.findElement(By.xpath("//input[@id ='login1' or @name='login']")).sendKeys("Seleniumpanda@rediffmail.com");
		driver.findElement(By.xpath("//div[@class ='pwdpass']/descendant::input[1]")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//div[@class= 'pwdpass']/child::em[1]/following::input[1]")).click();
		driver.close();
		ScreenRecorderUtil.stopRecord();
	}

	

}
