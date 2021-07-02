package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LMSProjectActivity6 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/lms");
		WebElement myaccount = driver.findElement(By.xpath("//a[@href='https://alchemy.hguy.co/lms/my-account/']"));
		myaccount.click();
		System.out.println("The title of the current page is "+driver.getTitle()+" and it matches so "+driver.getTitle().contentEquals("My Account – Alchemy LMS"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		WebElement loginbutton = driver.findElement(By.xpath("//a[@href='#login']"));
		loginbutton.click();
		driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys("root");
		driver.findElement(By.xpath("//input[@id='user_pass']")).sendKeys("pa$$w0rd");
		driver.findElement(By.xpath("//input[@id='wp-submit']")).click();
		JavascriptExecutor jss = (JavascriptExecutor) driver;
		jss.executeScript("window.scrollBy(0,1000)");
		WebElement editbutton = driver.findElement(By.xpath("//a[@class='ld-profile-edit-link']"));
		System.out.println("You can see the button "+editbutton.getText()+" and that means you are logged in.");
		driver.close();

	}

}
