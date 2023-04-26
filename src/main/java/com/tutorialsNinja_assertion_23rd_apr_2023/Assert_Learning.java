package com.tutorialsNinja_assertion_23rd_apr_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert_Learning {
	public WebDriver driver;

	SoftAssert softassert = new SoftAssert();

	@BeforeMethod
	public void openurl() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		// driver.manage().deleteAllCookies();
		driver.get("https://tutorialsninja.com/demo");

	}

	@Test
	public void clickOnSignInLink() throws Exception {
		Thread.sleep(3000);
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();

		String actualPrivacywarningMessage = driver.findElement(By.xpath("//div[@class = 'alert alert-danger alert-dismissible']")).getText();
		String expectedPrivacypolicywarningMessage = "Warning: You must agree to the Privacy Policy!";
		softassert.assertTrue(actualPrivacywarningMessage.contains(expectedPrivacypolicywarningMessage),"My assertion is wrong1");

		System.out.println("jay");

		String actualfirstnamewarningMessage = driver.findElement(By.xpath("//div[contains(text(), 'First Name must be between 1 and 32 characters!')]")).getText();
		String expectfirstnamewarningMessage = "First Name must be between 1 and 32 characters!";
		softassert.assertTrue(actualfirstnamewarningMessage.contains(expectfirstnamewarningMessage),"My assertion is wrong2");

		String actuallastnamewarningMessage = driver.findElement(By.xpath("//div[contains(text(), 'Last Name must be between 1 and 32 characters!')]")).getText();
		String expectlastnamewarningMessage = "Last Name must be between 1 and 32 characters!";
		softassert.assertTrue(actuallastnamewarningMessage.contains(expectlastnamewarningMessage),"My assertion is wrong3");

		String actualemailwarningMessage = driver.findElement(By.xpath("//div[contains(text(), 'E-Mail Address does not appear to be valid!')]")).getText();
		String expectemailwarningMessage = "E-Mail Address does not appear to be valid!";
		softassert.assertTrue(actualemailwarningMessage.contains(expectemailwarningMessage), "My assertion is wrong 4");

		String actualtelephonewarningMessage = driver.findElement(By.xpath("//div[contains(text(), 'Telephone must be between 3 and 32 characters!')]")).getText();
		String expecttelephonewarningMessage = "Telephone must be between 3 and 32 characters!";
		softassert.assertTrue(actualtelephonewarningMessage.contains(expecttelephonewarningMessage),"My assertion is wrong 5");

		String actualpasswordwarningMessage = driver.findElement(By.xpath("//div[contains(text(), 'Password must be between 4 and 20 characters!')]")).getText();
		String expectpasswordwarningMessage = "Password must be between 4 and 20 characters!";
		softassert.assertTrue(actualpasswordwarningMessage.contains(expectpasswordwarningMessage),"My assertion is wrong6");

		softassert.assertAll();

	}

	@AfterMethod
	public void teardown() {
		driver.close();
	}

}