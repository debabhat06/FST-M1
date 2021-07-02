package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LMSProjectActivity4 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/lms/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		WebElement popularheading = driver.findElement(By.xpath("//h3[contains(text(),'Email Marketing Strategies')]"));
		System.out.println("The title of the second most popular course is: "+popularheading.getText()+" " +"and it matches so "+popularheading.getText().contentEquals("Email Marketing Strategies"));
		driver.close();
		
		

	}

}
