package com.tutorialninja.rediff.assignment_24th_apr_2023;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Tutorial_Register_New_User {

	public WebDriver driver;

	@BeforeMethod
	public void openTutorialUrl() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://tutorialsninja.com/demo/");

	}

	@Test
	public void registerNewUser() {
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.xpath("//input[@id = 'input-firstname']")).sendKeys("Roger");
		driver.findElement(By.xpath("//input[@id = 'input-lastname' and @name = 'lastname']")).sendKeys("dayal");
		driver.findElement(By.xpath("//input[@id = 'input-email' and @name='email']")).sendKeys("rogerdayal@gmail.com");
		driver.findElement(By.xpath("//input[@name = 'telephone' and @id='input-telephone']")).sendKeys("9574563210");
		driver.findElement(By.xpath("//input[@id='input-password' and @name='password']")).sendKeys("roger@1234");
		driver.findElement(By.xpath("//input[@id = 'input-confirm' and @name='confirm']")).sendKeys("roger@1234");
		driver.findElement(By.name("agree")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//div[contains(text(),  'Warning: E-Mail Address is already registered!')]")).isDisplayed());
	}

	@AfterMethod
	public void teardown() {
		driver.close();
	}

}