package parameter_registration_tutorialNinja;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter_Register_TutorialNinja {

	public WebDriver driver;

	@Test
	@Parameters({ "browser", "url", "linkMyAccount", "linkRegister", "firstName", "lastName", "emailAddress",
			"telephoneNumber", "initialPassword", "confirmPassword", "iagree", "continueBtn" })
	public void registerTutorialNinja(String browser, String url, String linkMyAccount, String linkRegister,
			String firstName, String lastName, String emailAddress, String telephoneNumber, String initialPassword,
			String confirmPassword, String iagree, String continueBtn) {

		if (browser.equals("chrome")) {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		} else if (browser.equals("firefox")) {
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		}

		driver.get(url);
		driver.findElement(By.linkText(linkMyAccount)).click();
		driver.findElement(By.linkText(linkRegister)).click();

		driver.findElement(By.xpath("//input[@id = 'input-firstname']")).sendKeys(firstName);
		driver.findElement(By.xpath("//input[@id = 'input-lastname' and @name = 'lastname']")).sendKeys(lastName);
		driver.findElement(By.xpath("//input[@id = 'input-email' and @name='email']")).sendKeys(emailAddress);
		driver.findElement(By.xpath("//input[@name = 'telephone' and @id='input-telephone']")).sendKeys(telephoneNumber);
		driver.findElement(By.xpath("//input[@id='input-password' and @name='password']")).sendKeys(initialPassword);
		driver.findElement(By.xpath("//input[@id = 'input-confirm' and @name='confirm']")).sendKeys(confirmPassword);
		driver.findElement(By.name(iagree)).click();
		driver.findElement(By.cssSelector(continueBtn)).click();

	}

	@AfterMethod
	public void tearDown() {
		//driver.close();
	}

}
