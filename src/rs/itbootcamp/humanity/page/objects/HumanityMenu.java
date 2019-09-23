package rs.itbootcamp.humanity.page.objects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class HumanityMenu {
	
	public static final String URL= "https://zemljacuda1.humanity.com/app/dashboard/";
	private static final String  DASHBOARD= "//a[@id='sn_dashboard']//span[@class='primNavQtip__inner']";
	private static final String  SHIFT_PLANNING= "//p[contains(text(),'ShiftPlanning')]";
	private static final String  TIME_CLOCK= "//i[@class='primNavQtip__icon icon-timeclock']";
	private static final String  LEAVE= "//p[@class='primNavQtip__itemName'][contains(text(),'Leave')]";
	private static final String  TRAINING= "//p[contains(text(),'Training')]";
	private static final String  STAFF= "//p[contains(text(),'Staff')]";
	private static final String  PAYROLL= "//a[@id='sn_payroll']//span[@class='primNavQtip__inner']";
	private static final String  REPORTS= "//p[contains(text(),'Reports')]";
	
	public static WebElement getDashboard(WebDriver driver) {
		return driver.findElement(By.xpath(DASHBOARD));
	}

	public static void clickDashboard(WebDriver driver) {
		getDashboard(driver).click();
	}
	public static WebElement getShiftPlanning(WebDriver driver) {
		return driver.findElement(By.xpath(SHIFT_PLANNING));
	}

	public static void clickShiftPlanning(WebDriver driver) {
		getShiftPlanning(driver).click();
	}
	public static WebElement getTimeClock(WebDriver driver) {
		return driver.findElement(By.xpath(TIME_CLOCK));
	}

	public static void clickTimeClock(WebDriver driver) {
		getTimeClock(driver).click();
	}
	public static WebElement getLeave(WebDriver driver) {
		return driver.findElement(By.xpath(LEAVE));
	}

	public static void clickLeave(WebDriver driver) {
		getLeave(driver).click();
	}
	public static WebElement getTraining(WebDriver driver) {
		return driver.findElement(By.xpath(TRAINING));
	}

	public static void clickTraining(WebDriver driver) {
		getTraining(driver).click();
	}
	public static WebElement getStaff(WebDriver driver) {
		return driver.findElement(By.xpath(STAFF));
	}

	public static void clickStaff(WebDriver driver) {
		getStaff(driver).click();
	}
	public static WebElement getPayroll(WebDriver driver) {
		return driver.findElement(By.xpath(PAYROLL));
	}

	public static void clickPayroll(WebDriver driver) {
		getPayroll(driver).click();
	}
	public static WebElement getReports(WebDriver driver) {
		return driver.findElement(By.xpath(REPORTS));
	}

	public static void clickStartFree(WebDriver driver) {
		getReports(driver).click();
	}

	

}
