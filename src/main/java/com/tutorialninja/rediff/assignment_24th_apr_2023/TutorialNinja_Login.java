package com.tutorialninja.rediff.assignment_24th_apr_2023;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TutorialNinja_Login {
	public static WebDriver driver;

	@BeforeMethod
	public void openTutorialUrl() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://tutorialsninja.com/demo/");

	}

	@Test(dataProvider = "Tutorial" , dataProviderClass = DataProvider_Rediff_Tutorial.class)
	public void loginUser(String username, String password) {
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.xpath("//input[@id='input-email' and @name='email']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='input-password' and @name='password']")).sendKeys(password);
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		Assert.assertTrue(driver.findElement(By.linkText("Logout")).isDisplayed());
	}

	@AfterMethod
	public void closeUrl() {
		driver.close();
	}

}
