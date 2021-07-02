package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_12_1 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/iframes");
		System.out.println("Title of the page:"+driver.getTitle());
		driver.switchTo().frame(0);
		WebElement heading1 = driver.findElement(By.xpath("//div[@class='content']"));
		System.out.println("Heading of the first iFrame is:"+heading1.getText());
		System.out.println("The button says:"+driver.findElement(By.xpath("//button[@id='actionButton']")).getText());
		System.out.println("Color of the button is:"+driver.findElement(By.xpath("//button[@id='actionButton']")).getCssValue("background-color"));
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		WebElement heading2 = driver.findElement(By.xpath("//div[@class='content']"));
		System.out.println("Heading of the second iFrame is:"+heading2.getText());
		System.out.println("The button says:"+driver.findElement(By.xpath("//button[@id='actionButton']")).getText());
		System.out.println("Color of the button is:"+driver.findElement(By.xpath("//button[@id='actionButton']")).getCssValue("background-color"));
		driver.close(); 

	}

}
