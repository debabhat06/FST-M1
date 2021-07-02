package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LMSProjectActivity2 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/lms/");
		WebElement heading = driver.findElement(By.xpath("//div[@class = 'uagb-ifb-title-wrap']/h1"));
		System.out.println("The Heading of the page is: "+heading.getText());
		//System.out.println(heading.getText().contentEquals("Learn from Industry Experts"));
		System.out.println(heading.isDisplayed());
		driver.close();

	}

}
