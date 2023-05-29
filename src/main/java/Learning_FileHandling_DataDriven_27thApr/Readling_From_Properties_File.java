package Learning_FileHandling_DataDriven_27thApr;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Readling_From_Properties_File {

	public WebDriver driver;
	public Properties prop;
	public FileInputStream ip;

	@Test(priority = 1)
	public void tutorialsNinjaLoginTest() throws Exception {
		// Step 1 - Create the Object of Properties Class
		prop = new Properties();

		// Step 2 - Create the object of FileInputStream Class and pass the path of the
		// Properties file in its constructor
		ip = new FileInputStream(System.getProperty("user.dir")
				+ "\\src\\main\\java\\Learning_FileHandling_DataDriven_27thApr\\config.properties");

		// Step 3 - load the properties file with the ip reference
		prop.load(ip);

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys(prop.getProperty("validUsername"));
		driver.findElement(By.id("input-password")).sendKeys(prop.getProperty("validPassword"));
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		Assert.assertTrue(driver.findElement(By.linkText("Logout")).isDisplayed());
		driver.quit();
	}

	@Test(priority = 2)
	public void rediffLoginTest() throws Exception {
		prop = new Properties();
		ip = new FileInputStream(System.getProperty("user.dir")
				+ "\\src\\main\\java\\Learning_FileHandling_DataDriven_27thApr\\config.properties");
		prop.load(ip);

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("urlR"));
		driver.findElement(By.id("login1")).sendKeys(prop.getProperty("validRUsername"));
		driver.findElement(By.id("password")).sendKeys(prop.getProperty("validRPassword"));
		driver.findElement(By.className("signinbtn")).click();
		Assert.assertTrue(driver.findElement(By.className("rd_logout")).isDisplayed());
		driver.quit();
	}

}