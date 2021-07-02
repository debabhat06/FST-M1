package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_11_1 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/javascript-alerts");
		System.out.println("The title of the page is: "+driver.getTitle());
		WebElement simple = driver.findElement(By.xpath("//button[@id='simple']"));
		simple.click();
		Alert simplealert = driver.switchTo().alert();
		System.out.println("The alert says: "+simplealert.getText());
		simplealert.accept();
		driver.close();

	}

}
