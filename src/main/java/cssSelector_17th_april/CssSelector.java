package cssSelector_17th_april;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.rediff.com/");
		driver.findElement(By.cssSelector("p#signin_info > a:nth-child(1)")).click();
		driver.findElement(By.cssSelector("div.floatL.leftwidth > div:nth-child(2) > div:nth-child(1) >div:nth-child(2) >input:nth-child(1)")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.cssSelector("div.floatL.leftwidth>div:nth-child(2)>div:nth-child(2)>div:nth-child(2)>div:nth-child(1)>input:nth-child(1)")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("div.floatL.leftwidth>div:nth-child(2)>div:nth-child(2)>div:nth-of-type(2)>div:nth-of-type(1)>input:nth-of-type(2)")).click();
		driver.close();
	}

}
