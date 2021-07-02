package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LMSProjectActivity5 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/lms");
		WebElement myaccountbutton = driver.findElement(By.xpath("//a[@href='https://alchemy.hguy.co/lms/my-account/']"));
		System.out.println("I have been navigated to "+myaccountbutton.getText());
		myaccountbutton.click();
		System.out.println("The title of the new page is "+driver.getTitle()+ " it matches so "+driver.getTitle().contentEquals("My Account – Alchemy LMS"));
		driver.close();

	}

}
