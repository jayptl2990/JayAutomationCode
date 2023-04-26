package com.tutorialninja.rediff.assignment_24th_apr_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Rediff_LoginScreen {

	public WebDriver driver;

	@BeforeMethod
	public void openRediffUrl() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/");

	}

	@Test(dataProvider = "Rediff", dataProviderClass = DataProvider_Rediff_Tutorial.class)
	public void testCase1(String username, String password) throws Exception {
		Thread.sleep(500);
		driver.findElement(By.xpath("//span[@id = 'username']/following::p[1]/child::a[1]")).click();
		driver.findElement(By.xpath("//input[@id ='login1' or @name='login']")).sendKeys(username);
		driver.findElement(By.xpath("//div[@class ='pwdpass']/descendant::input[1]")).sendKeys(password);
		driver.findElement(By.xpath("//div[@class= 'pwdpass']/child::em[1]/following::input[1]")).click();
		
	}

	@AfterMethod
	public void closeUrl() {
		driver.close();
	}
}
