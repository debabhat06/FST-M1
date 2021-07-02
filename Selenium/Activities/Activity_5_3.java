package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_5_3 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/dynamic-controls");
		System.out.println("The title of the page is "+driver.getTitle());
		System.out.println(driver.findElement(By.xpath("//input[@id='input-text']")).isEnabled());
		driver.findElement(By.xpath("//button[@id='toggleInput']")).click();
		System.out.println(driver.findElement(By.xpath("//input[@id='input-text']")).isEnabled());
		driver.close();

	}

}
