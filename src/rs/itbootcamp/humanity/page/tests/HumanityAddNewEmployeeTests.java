package rs.itbootcamp.humanity.page.tests;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.bcel.generic.NEWARRAY;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import rs.itbootcamp.humanity.page.objects.HumanityHome;
import rs.itbootcamp.humanity.page.objects.HumanityStaff;

public class HumanityAddNewEmployeeTests {
	public static boolean addEmpTest() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(HumanityStaff.URL);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		String name, lastName, email;
		List <String> imena = new ArrayList<>();
		

		if (driver.getCurrentUrl().contains(HumanityStaff.URL) == false) {
			return false;
		}
		int poRedu = 0;

		name = "Trubica";
		lastName = "Vesela";
		email = "travica@gmail.com";

		HumanityStaff.getAdd(driver);
		HumanityStaff.clickAdd(driver);
		HumanityStaff.getFirstNameAdd(driver, poRedu);
		HumanityStaff.getLastNameAdd(driver, poRedu);
		HumanityStaff.getEmailAdd(driver, poRedu);
		imena.add(name+" "+lastName+" ");
	
		
		
		return true;

	}
}
