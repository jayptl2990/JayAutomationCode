package com.automation.tutorialninja_20th_apr_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TutorialNinja_TestNG {

	public static WebDriver driver;

	@BeforeMethod
	public void openurl() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://tutorialsninja.com/demo");

	}

	@Test
	public void openTutorialNinja() {
		System.out.println(driver.getCurrentUrl());
		String currentURL = "https://tutorialsninja.com/demo/";
		if (currentURL.equals("https://tutorialsninja.com/demo/")) {
			System.out.println("The website open successfully");
		} else {
			System.out.println("The website is not open successfully");
		}
	}

	@Test
	public void clickOnMyaccount() {
		driver.findElement(By.linkText("My Account")).click();
	}

	@Test
	public void clickOnLogin() {
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
	}

	@Test
	public void clickOnSignInLink() {
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.xpath("//input[@id='input-email' and @name='email']")).sendKeys("jaypatel@gmail.com");
		driver.findElement(By.xpath("//input[@id='input-password' and @name='password']")).sendKeys("jay@1234");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	}

	@AfterMethod
	public void teardown() {
		driver.close();
	}

}
