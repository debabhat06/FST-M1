package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity_7_2 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver,20);
		driver.get("https://www.training-support.net/selenium/dynamic-attributes");
		System.out.println("The title of the page: "+driver.getTitle());
		driver.findElement(By.xpath("//input[contains(@class,'-username')]")).sendKeys("debabhat06");
		driver.findElement(By.xpath("//input[contains(@class,'-password')]")).sendKeys("passw0rd1");
		driver.findElement(By.xpath("//input[starts-with(@name,'name-')]")).sendKeys("passw0rd1");
		driver.findElement(By.xpath("//input[starts-with(@class,'email-')]")).sendKeys("debabhat06@gmail.com");
		driver.findElement(By.xpath("//button[contains(text(),'Sign Up')]")).click();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@id='action-confirmation']"))));
		System.out.println("The sign up message says: "+driver.findElement(By.xpath("//div[@id='action-confirmation']")).getText());
		driver.close();
	}

}
