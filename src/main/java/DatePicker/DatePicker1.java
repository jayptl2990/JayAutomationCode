package DatePicker;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class DatePicker1 {
	public WebDriver driver;
	public WebDriverWait wait;

	// Thread.sleep(2000) you can use
	// 25th December 2023

	@Test
	public void seleniumPractiseBlogspotCalendar() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.easemytrip.com/flights.html");
		WebElement calendar = driver.findElement(By.id("ddate"));
		calendar.click();

		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ddate")));
		selectDateCalendar("25", "December", "2025");

	}

	public void selectDateCalendar(String calendarDay, String calendarMonth, String calendarYear) throws Exception {

		// months other than February cannot be more than 31 days
		if (Integer.parseInt(calendarDay) > 31) {
			System.out.println("Invalid date because days of month is greater than 31");
			return;
		}

		// month of February cannot be more than 29 days
		if(calendarMonth.equals("February") && Integer.parseInt(calendarDay)>29) {
			System.out.println("Invalid date because Feb month days is greater than 29");
			return;
		}

		String monthYear = driver.findElement(By.className("ui-datepicker-title")).getText();
		System.out.println("The month and year is : " + monthYear);
		Thread.sleep(2000);

		// now I will consider the month Year as a String entity and based on split()
		// will use the WebElement

		String month = monthYear.split(" ")[0];
		String year = monthYear.split(" ")[1];

		while (!(month.equals(calendarMonth) && year.equals(calendarYear))) {
			driver.findElement(By.xpath("//a[@title = 'Next']")).click();
			monthYear = driver.findElement(By.className("ui-datepicker-title")).getText();
			month = monthYear.split(" ")[0];
			year = monthYear.split(" ")[1];
		}

		Thread.sleep(2000);
		String dynamicXpath = "//td[@data-handler = 'selectDay']/a[text() = \'" + calendarDay + "\']";
		
		
		driver.findElement(By.xpath(dynamicXpath)).click();

	}

}

