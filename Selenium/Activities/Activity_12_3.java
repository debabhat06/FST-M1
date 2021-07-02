package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity_12_3 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver,5);
		driver.get("https://www.training-support.net/selenium/popups");
		System.out.println("Title of the page is :"+driver.getTitle());
		WebElement signIn = driver.findElement(By.xpath("//button[contains(@class,'orange button')]"));
		Actions builder = new Actions(driver);
		builder.moveToElement(signIn).pause(Duration.ofSeconds(1)).build().perform();
		System.out.println("ToolTip text is "+signIn.getAttribute("data-tooltip"));
		signIn.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("signInModal")));
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password");
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		WebElement loginInButton = driver.findElement(By.xpath("//div[@id='action-confirmation']"));
		System.out.println("The message says: "+loginInButton.getText());
		driver.close();

	}

}
