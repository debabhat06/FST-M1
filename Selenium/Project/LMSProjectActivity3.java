package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LMSProjectActivity3 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/lms/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		WebElement firstinfo = driver.findElement(By.xpath("//h3[contains(text(),' Actionable Training ')]"));
		System.out.println("The title of the first info box is: "+firstinfo.getText()+" " +"and it matches so "+firstinfo.getText().contentEquals("Actionable Training"));
		driver.close();
		
		

	}

}
