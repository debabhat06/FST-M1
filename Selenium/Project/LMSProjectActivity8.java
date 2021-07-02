package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LMSProjectActivity8 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/lms");
		driver.findElement(By.xpath("//a[@href='https://alchemy.hguy.co/lms/contact/']")).click();
		JavascriptExecutor jss = (JavascriptExecutor) driver;
		jss.executeScript("window.scrollBy(0,500)");
		driver.findElement(By.xpath("//input[@id='wpforms-8-field_0']")).sendKeys("Deban Bhatt");
		driver.findElement(By.xpath("//input[@id='wpforms-8-field_1']")).sendKeys("debabhat06@gmail.com");
		driver.findElement(By.xpath("//input[@id='wpforms-8-field_3']")).sendKeys("DemoMessage");
		driver.findElement(By.xpath("//textarea[@id='wpforms-8-field_2']")).sendKeys("This is the first demo message.please contact me in my email for further details.");
		driver.findElement(By.xpath("//button[@id='wpforms-submit-8']")).click();
		System.out.println("The message displayed after submitting the message is "+driver.findElement(By.xpath("//div[@id='wpforms-confirmation-8']/p")).getText());
		driver.close();
	}

}
