package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_4_1 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get(" https://www.training-support.net");
		System.out.println("The title of the page is: "+driver.getTitle());
		WebElement about = driver.findElement(By.xpath("//a[@id='about-link']"));
		about.click();
		System.out.println("The title of the new page is: "+driver.getTitle());
		driver.close();

	}

}
