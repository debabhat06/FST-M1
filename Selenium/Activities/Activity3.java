package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/simple-form");
		System.out.println("The title of the page is: " +driver.getTitle());
		WebElement firstname = driver.findElement(By.id("firstName"));
		firstname.sendKeys("Debanjani");
		WebElement lastname = driver.findElement(By.id("lastName"));
		lastname.sendKeys("Bhattacharjee");
		WebElement emailid = driver.findElement(By.id("email"));
		emailid.sendKeys("debabhat06@gmail.com");
		WebElement phonenumber = driver.findElement(By.id("number"));
		phonenumber.sendKeys("8552019062");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		driver.findElement(By.cssSelector(".ui.green.button")).click();
		Thread.sleep(1000);
		
		
		
		driver.close();

	}

}
