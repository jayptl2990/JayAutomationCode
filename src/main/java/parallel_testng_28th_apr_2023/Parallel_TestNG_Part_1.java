package parallel_testng_28th_apr_2023;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel_TestNG_Part_1 {
	WebDriver driver;
	

	@Test(threadPoolSize = 2, invocationCount = 2)
	public void tc1() {
		System.out.println("This output is for TC 1 : " + Thread.currentThread().getId());
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
	}
	
	@Test
	public void tc2() {
		System.out.println("This output is for TC 2 : " + Thread.currentThread().getId());
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://makemytrip.com");
	}
}
