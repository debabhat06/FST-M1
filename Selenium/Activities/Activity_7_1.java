package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity_7_1 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver,20);
		driver.get("https://training-support.net/selenium/dynamic-attributes");
		System.out.println("The title of the page is "+driver.getTitle());
		driver.findElement(By.xpath("//input[starts-with(@class,'username')]")).sendKeys("admin");
		driver.findElement(By.xpath("//input[starts-with(@class,'password')]")).sendKeys("password");
		driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//div[@id='action-confirmation']"), "Welcome Back, admin"));
		System.out.println("The login message says:" +driver.findElement(By.xpath("//div[@id='action-confirmation']")).getText());
		driver.close();
		

	}

}
