package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_11_3 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/javascript-alerts");
		System.out.println("The title of the page is: "+driver.getTitle());
		WebElement prompt = driver.findElement(By.xpath("//button[@id='prompt']"));
		prompt.click();
		Alert promptAlert = driver.switchTo().alert();
		System.out.println("The alert says: "+promptAlert.getText());
		promptAlert.sendKeys("Yes, you are!!");
		promptAlert.accept();
		driver.close();

	}

}
