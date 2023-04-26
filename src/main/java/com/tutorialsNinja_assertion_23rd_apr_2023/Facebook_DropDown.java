package com.tutorialsNinja_assertion_23rd_apr_2023;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class Facebook_DropDown {

	public WebDriver driver;

	@BeforeMethod
	public void openUrl() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com/");
		
	}

}
