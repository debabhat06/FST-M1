package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LMSProjectActivity9 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/lms");
		WebElement myaccount = driver.findElement(By.xpath("//a[@href='https://alchemy.hguy.co/lms/my-account/']"));
		myaccount.click();
		JavascriptExecutor jss = (JavascriptExecutor) driver;
		jss.executeScript("window.scrollBy(0,1000)");
		WebElement loginbutton = driver.findElement(By.xpath("//a[@href='#login']"));
		loginbutton.click();
		driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys("root");
		driver.findElement(By.xpath("//input[@id='user_pass']")).sendKeys("pa$$w0rd");
		driver.findElement(By.xpath("//input[@id='wp-submit']")).click();
		driver.findElement(By.xpath("//a[@href='https://alchemy.hguy.co/lms/all-courses/']")).click();
		jss.executeScript("window.scrollBy(0,500)");
		driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
		jss.executeScript("window.scrollBy(0,800)");
		driver.findElement(By.xpath("//div[contains(text(),'Developing Strategy')]")).click();
		System.out.println("The title of the course is "+driver.getTitle());
		driver.close();

	}

}
