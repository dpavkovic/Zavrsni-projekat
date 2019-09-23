package rs.itbootcamp.humanity.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityHome {

	public static final String URL = "https://www.humanity.com";
	private static final String START_FREE = "//a[@class='button pale']";
	private static final String FULL_NAME = "//input[@placeholder='Full Name']";
	private static final String WORK_EMAIL = "//input[@placeholder='Work Email']";
	private static final String START_BUTTON = "//input[@id='popup-free-trial-link']";
	private static final String ABOUT_US = "//a[@class='nav-link no-before'][contains(text(),'About us')]";
	private static final String LOGINBUTTON = "//p[contains(text(),'LOGIN')]";
	private static final String EMAIL = "//input[@id='email']";
	private static final String PASSWORD = "//input[@id='password']";
	private static final String LOGIN = "//button[contains(text(),'Log in')]";
	private static final String OPT_NAME = "//div[@class='input-wrapper']//input[@placeholder='Full Name']";
	private static final String OPT_WORK_EMAIL = "//div[@class='input-wrapper']//input[@placeholder='Work Email']";
	private static final String OPT_START = "//input[@id='free-trial-link-01']";

	public static WebElement getStartFree(WebDriver driver) {
		return driver.findElement(By.xpath(START_FREE));
	}

	public static void clickStartFree(WebDriver driver) {
		getStartFree(driver).click();
	}

	public static WebElement getFullName(WebDriver driver) {
		return driver.findElement(By.xpath(FULL_NAME));
	}

	public static void clickFullName(WebDriver driver) {
		getFullName(driver).click();

	}

	public static void inputFullName(WebDriver driver, String data) {
		getFullName(driver).sendKeys(data);
	}

	public static WebElement getWorkEmail(WebDriver driver) {
		return driver.findElement(By.xpath(WORK_EMAIL));
	}

	public static void clickWorkEmail(WebDriver driver) {
		getWorkEmail(driver).click();

	}

	public static void inputWorkEmail(WebDriver driver, String data) {
		getWorkEmail(driver).sendKeys(data);
	}

	public static WebElement getStartButton(WebDriver driver) {
		return driver.findElement(By.xpath(START_BUTTON));
	}

	public static void clickStartButton(WebDriver driver) {
		getStartButton(driver).click();
	}

	public static WebElement getAboutUs(WebDriver driver) {
		return driver.findElement(By.xpath(ABOUT_US));
	}

	public static void clickAboutUs(WebDriver driver) {
		getAboutUs(driver).click();
	}

	public static WebElement getLoginButton(WebDriver driver) {
		return driver.findElement(By.xpath(LOGINBUTTON));
	}

	public static void clickLoginButton(WebDriver driver) {
		getLoginButton(driver).click();
	}

	public static WebElement getEmail(WebDriver driver) {
		return driver.findElement(By.xpath(EMAIL));
	}

	public static void clickEmail(WebDriver driver) {
		getEmail(driver).click();

	}

	public static void inputEmail(WebDriver driver, String data) {
		getEmail(driver).sendKeys(data);
	}

	public static WebElement getPassword(WebDriver driver) {
		return driver.findElement(By.xpath(PASSWORD));
	}

	public static void clickPassword(WebDriver driver) {
		getPassword(driver).click();

	}

	public static void inputPassword(WebDriver driver, String data) {
		getPassword(driver).sendKeys(data);
	}

	public static WebElement getLogin(WebDriver driver) {
		return driver.findElement(By.xpath(LOGIN));
	}

	public static void clickLogin(WebDriver driver) {
		getLogin(driver).click();
	}

	public static WebElement getOptName(WebDriver driver) {
		return driver.findElement(By.xpath(OPT_NAME));
	}

	public static void clickOptName(WebDriver driver) {
		getOptName(driver).click();

	}

	public static void inputOptname(WebDriver driver, String data) {
		getOptName(driver).sendKeys(data);
	}

	public static WebElement getOptWorkEmail(WebDriver driver) {
		return driver.findElement(By.xpath(OPT_WORK_EMAIL));
	}

	public static void clickOptWorkEmail(WebDriver driver) {
		getOptName(driver).click();

	}

	public static void inputOptEmail(WebDriver driver, String data) {
		getOptWorkEmail(driver).sendKeys(data);
	}

	public static WebElement getOptStart(WebDriver driver) {
		return driver.findElement(By.xpath(OPT_START));
	}

	public static void clickOptStart(WebDriver driver) {
		getOptStart(driver).click();

	}

}
