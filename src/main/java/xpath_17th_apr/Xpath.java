package xpath_17th_apr;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.rediff.com/");
		driver.findElement(By.xpath("//span[@id = 'username']/following::p[1]/child::a[1]")).click();
		driver.findElement(By.xpath("//input[@id ='login1' or @name='login']")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.xpath("//div[@class ='pwdpass']/descendant::input[1]")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//div[@class= 'pwdpass']/child::em[1]/following::input[1]")).click();
		driver.close();
	}

}
