package rs.itbootcamp.humanity.page.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import rs.itbootcamp.humanity.page.objects.HumanityHome;

public class HumanityLoginTests {

	public static boolean loginTest() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(HumanityHome.URL);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		if (driver.getCurrentUrl().contains(HumanityHome.URL) == false) {
			return false;
		}
		HumanityHome.getLoginButton(driver);
		HumanityHome.clickLoginButton(driver);
		HumanityHome.getEmail(driver);
		HumanityHome.clickEmail(driver);
		HumanityHome.inputEmail(driver, "bubicica@gmail.com");
		HumanityHome.getPassword(driver);
		HumanityHome.clickPassword(driver);
		HumanityHome.inputPassword(driver, "654646654");
		HumanityHome.getLogin(driver);
		HumanityHome.clickLogin(driver);

		driver.quit();
		return true;
	}

}
