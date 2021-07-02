package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity_6_2 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver,20);
		driver.get("https://www.training-support.net/selenium/ajax");
		System.out.println("The title of the page is "+driver.getTitle());
		driver.findElement(By.xpath("//button[@class='ui violet button']")).click();
		WebElement text = driver.findElement(By.xpath("//div[@id='ajax-content']/h1"));
		wait.until(ExpectedConditions.visibilityOf(text));
		System.out.println("After waiting of the text it says: "+text.getText());
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"), "I'm late!"));
		WebElement text1 = driver.findElement(By.xpath("//div[@id='ajax-content']/h3"));
		System.out.println("The text has changed to "+text1.getText());
		driver.close();
		

	}

}
