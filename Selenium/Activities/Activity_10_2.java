package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Activity_10_2 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/input-events");
		System.out.println("The title of the page is: "+driver.getTitle());
		WebElement keypressed = driver.findElement(By.id("keyPressed"));
		Actions action = new Actions(driver);
		Action sendkey = action.sendKeys("D").build();
		sendkey.perform();
		System.out.println("The key that is pressed is: "+keypressed.getText());
		Action secondaction = action.keyDown(Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(Keys.CONTROL).build();
		secondaction.perform();
		
		System.out.println("The key that is pressed is: "+keypressed.getText());
		driver.close();

	}

}
