package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_4_3 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/target-practice");
		System.out.println("The title of the current page is: "+driver.getTitle());
		WebElement header1 = driver.findElement(By.xpath("//div[@class='column']/h3"));
		System.out.println("The name of the third header attribute is "+header1.getText());
		WebElement header2 = driver.findElement(By.xpath("//div[@class='column']/h5"));
		System.out.println("The css property for fifth header is "+header2.getCssValue("color"));
		WebElement button = driver.findElement(By.xpath("//button[contains(text(),'Violet')]"));
		System.out.println("The Class Attributes for violet button is: "+button.getAttribute("class"));
		WebElement button2 = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[3]/button[2]"));
		System.out.println("The name of the button is: "+button2.getText());
		System.out.println("The color of the button is: "+button2.getCssValue("color"));
		
		
		driver.close();

	}

}