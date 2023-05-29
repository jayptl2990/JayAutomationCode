package parameter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class TutorialNinja_Parameter {
	
	public static WebDriver driver;
	
	
	
	
	@Test
	@Parameter({"browser", "url", "linkmyAcc", "LinkLogin", "email", "password", "locatorLoginButton"})
	
	public void loginTutorialNinja() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(url);
		
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.xpath("//input[@id = 'input-firstname']")).sendKeys("jay");
		driver.findElement(By.xpath("//input[@id = 'input-lastname' and @name = 'lastname']")).sendKeys("patel");
		driver.findElement(By.xpath("//input[@id = 'input-email' and @name='email']")).sendKeys("jaypatel@gmail.com");
		driver.findElement(By.xpath("//input[@name = 'telephone' and @id='input-telephone']")).sendKeys("9874563210");
		driver.findElement(By.xpath("//input[@id='input-password' and @name='password']")).sendKeys("jay@1234");
		driver.findElement(By.xpath("//input[@id = 'input-confirm' and @name='confirm']")).sendKeys("jay@1234");
		driver.findElement(By.name("agree")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	}
	

}
