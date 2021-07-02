package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity_10_1 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/input-events");
		System.out.println("The title of the page is: "+driver.getTitle());
		Actions actions = new Actions(driver);
		WebElement cube = driver.findElement(By.id("wrapD3Cube"));
		actions.click(cube);
		WebElement activeside = driver.findElement(By.className("active"));
		System.out.println("After Left Click or just clicking the number shown is: "+activeside.getText());
		actions.doubleClick(cube).perform();
		activeside = driver.findElement(By.className("active"));
		System.out.println("After double Click, the number shown is: "+activeside.getText());
		actions.contextClick(cube).perform();
		activeside = driver.findElement(By.className("active"));
		System.out.println("After right Click, the number shown is: "+activeside.getText());
		driver.close();

	}

}
