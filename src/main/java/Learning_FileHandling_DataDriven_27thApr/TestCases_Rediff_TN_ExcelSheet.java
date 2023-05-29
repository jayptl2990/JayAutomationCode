package Learning_FileHandling_DataDriven_27thApr;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCases_Rediff_TN_ExcelSheet {

	public WebDriver driver;

	
	
	  @Test(dataProvider = "Rediff", dataProviderClass = ExcelData.class) 
	  public void enterRediffLogicDetails(String username, String password) 
	  { 
	  driver = new ChromeDriver(); 
	  driver.manage().window().maximize();
	  driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	  driver.findElement(By.xpath("//input[@id ='login1' or @name='login']")).sendKeys(username);
	  driver.findElement(By.xpath("//div[@class ='pwdpass']/descendant::input[1]")).sendKeys(password); driver.findElement(By.xpath("//div[@class= 'pwdpass']/child::em[1]/following::input[1]")).click();
	  driver.close();
	  
	  
	  }
	 
	@Test(dataProvider = "TNN", dataProviderClass = ExcelData.class)
	public void enterTNLogicDetails(String username, String password) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://tutorialsninja.com/demo/");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.xpath("//input[@id='input-email' and @name='email']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='input-password' and @name='password']")).sendKeys(password);
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		//Assert.assertTrue(driver.findElement(By.linkText("Logout")).isDisplayed());
		driver.close();
	}

}
