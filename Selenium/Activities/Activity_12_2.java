package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_12_2 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/nested-iframes");
		System.out.println("Title of the page is :"+driver.getTitle());
		driver.switchTo().frame(0);
		driver.switchTo().frame(0);
		WebElement heading1 = driver.findElement(By.xpath("//div[@class='content']"));
		System.out.println("Heading of the first Iframe is: "+heading1.getText());
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		driver.switchTo().frame(1);
		WebElement heading2 = driver.findElement(By.xpath("//div[@class='content']"));
		System.out.println("Heading of the first Iframe is: "+heading2.getText());
		driver.close();

	}

}
