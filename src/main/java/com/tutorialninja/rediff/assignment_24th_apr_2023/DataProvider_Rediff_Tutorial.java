package com.tutorialninja.rediff.assignment_24th_apr_2023;

import org.testng.annotations.DataProvider;

public class DataProvider_Rediff_Tutorial {

	@DataProvider(name = "Rediff")
	public static Object[][] getRediffData() {
		Object[][] data = { { "seleniumpanda@rediffmail.com", "Selenium@123" },
				{ "seleniumpanda@rediffmail.com", "Donky@123" } };
		return data;
	}

	@DataProvider(name = "Tutorial")
	public static Object getTutorialNinjaData() {
		Object[][] data = { { "jaypatel@gmail.com", "jay@1234" }, { "rajpatel@gmail.com", "raj@1234" },
				{ "rampatel@gmail.com", "ram@1234" }, { "nikpatel@gmail.com", "nik@1234" },
				{ "meetpatel@gmail.com", "meet@1234" } };
		return data;
	}

}
