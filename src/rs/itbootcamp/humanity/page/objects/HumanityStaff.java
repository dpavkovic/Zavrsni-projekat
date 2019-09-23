package rs.itbootcamp.humanity.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityStaff {
	public static final String URL = "https://zemljacuda1.humanity.com/app/staff/list/load/true/";
	public static final String ADD="//button[@id='act_primary']";
	public static final String FIRST_NAME_ADD = "//input[@id='_asf";
	public static final String LAST_NAME_ADD = "//input[@id='_asl";
	public static final String EMAIL_ADD = "//input[@id='_ase";
	public static final String END = "']";
	
	
	
	public static WebElement getAdd(WebDriver driver) {
		return driver.findElement(By.xpath(ADD));
	}

	public static void clickAdd(WebDriver driver) {
		getAdd(driver).click();
	}

	public static WebElement getFirstNameAdd(WebDriver driver, int poRedu) {
		return driver.findElement(By.xpath(FIRST_NAME_ADD + poRedu + END));
	}

	public static void setFirstnameAdd(WebDriver driver, int poRedu) {
		getFirstNameAdd(driver, poRedu).click();

	}

	public static WebElement getLastNameAdd(WebDriver driver, int poRedu) {
		return driver.findElement(By.xpath(LAST_NAME_ADD + poRedu + END));
	}

	public static void setLastNameAdd(WebDriver driver, int poRedu) {
		getLastNameAdd(driver, poRedu).click();

	}

	public static WebElement getEmailAdd(WebDriver driver, int poRedu) {
		return driver.findElement(By.xpath(EMAIL_ADD + poRedu + END));
	}

	public static void setEmailAdd(WebDriver driver, int poRedu) {
		getEmailAdd(driver, poRedu).click();

	}

}
