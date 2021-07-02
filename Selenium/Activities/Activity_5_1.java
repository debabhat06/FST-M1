package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_5_1 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/dynamic-controls");
		System.out.println("The title of the page is "+driver.getTitle());
		System.out.println(driver.findElement(By.xpath("//input[@class='willDisappear']")).isDisplayed());
		driver.findElement(By.xpath("//button[@id='toggleCheckbox']")).click();
		System.out.println(driver.findElement(By.xpath("//input[@class='willDisappear']")).isDisplayed());
		driver.close();
		

	}

}
