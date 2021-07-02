package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity_6_1 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait (driver, 20);
		driver.get("https://training-support.net/selenium/dynamic-controls");
		System.out.println("The title of the page is "+driver.getTitle());
		WebElement checkbox= driver.findElement(By.xpath("//input[@class='willDisappear']"));
		checkbox.click();
		WebElement checkboxtoggle = driver.findElement(By.xpath("//button[@id='toggleCheckbox']"));
		checkboxtoggle.click();
		wait.until(ExpectedConditions.invisibilityOf(checkbox));
		checkboxtoggle.click();
		wait.until(ExpectedConditions.visibilityOf(checkbox));
		driver.close();
		
		

	}

}
