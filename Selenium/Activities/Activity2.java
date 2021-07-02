package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net");
		String title = driver.getTitle();
		System.out.println("The title of the page is "+title);
		WebElement idlocator = driver.findElement(By.id("about-link"));
		System.out.println("The getText for id  is "+idlocator.getText());
		WebElement classNamelocator = driver.findElement(By.className("green"));
		System.out.println("The getText for ClassName is "+classNamelocator.getText());
		WebElement linktextlocator = driver.findElement(By.linkText("About Us"));
		System.out.println("The getText for linktext is "+linktextlocator.getText());
		WebElement csslocator = driver.findElement(By.cssSelector(".green"));
		System.out.println("The getText for csslocator is "+csslocator.getText());
		driver.close();
	}

}
