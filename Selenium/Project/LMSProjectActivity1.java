package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LMSProjectActivity1 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/lms/");
		System.out.println("The title of the page is: "+driver.getTitle());
		System.out.println(driver.getTitle().contentEquals("Alchemy LMS – An LMS Application"));
		driver.close();

	}

}
