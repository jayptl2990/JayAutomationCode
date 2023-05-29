package multiple_webelement_8th_apr_2023;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Multtiple_Webelement {

	public WebDriver driver;

	@BeforeMethod
	public void openRediffUrl() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://mail.rediff.com/");
		
		
		@Test

	}

}
