package autosuggestive_dropdown_7th_may_2023;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Autosuggestive_Dropdown {
	public WebDriver driver;
	
	@Test(priority = 2)
	public void makeMyTrip() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("fromCity")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder = 'From']")).sendKeys("New");
		Thread.sleep(1000);
		int i = 0;
		while(i<4) {
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@placeholder = 'From']")).sendKeys(Keys.DOWN);
			i++;
		}
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder = 'From']")).sendKeys(Keys.ENTER);
		
		
		driver.findElement(By.id("toCity")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder = 'To']")).sendKeys("Dub");
		Thread.sleep(1000);
		int j = 0;
		while(j<5) {
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@placeholder = 'To']")).sendKeys(Keys.DOWN);
			j++;
		}
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder = 'To']")).sendKeys(Keys.ENTER);
	}
	
	
	@Test(priority = 1)
	public void easemytrip() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.easemytrip.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		
		driver.findElement(By.id("fromCity")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder = 'From']")).sendKeys("New");
		Thread.sleep(1000);
		int i = 0;
		while(i<4) {
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@placeholder = 'From']")).sendKeys(Keys.DOWN);
			i++;
		}
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder = 'From']")).sendKeys(Keys.ENTER);
	
	}
}
