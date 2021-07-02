package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_11_2 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/javascript-alerts");
		System.out.println("The title of the page is: "+driver.getTitle());
		WebElement confirm = driver.findElement(By.xpath("//button[@id='confirm']"));
		confirm.click();
		Alert confirmAlert = driver.switchTo().alert();
		System.out.println("The alert says: "+confirmAlert.getText());
		confirmAlert.accept();
		confirm.click();
		confirmAlert.dismiss();
		driver.close();

	}

}
