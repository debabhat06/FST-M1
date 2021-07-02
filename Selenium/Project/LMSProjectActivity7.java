package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;





public class LMSProjectActivity7 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/lms");
		WebElement courses = driver.findElement(By.xpath("//a[@href='https://alchemy.hguy.co/lms/all-courses/']"));
		courses.click();
		JavascriptExecutor jss = (JavascriptExecutor) driver;
		jss.executeScript("window.scrollBy(0,500)");
		System.out.println("The number of the courses are: "+driver.findElements(By.className("entry-title")).size());
		List<WebElement> m = driver.findElements(By.xpath("//h3[@class='entry-title']"));
		for(int i = 0; i< m.size(); i++) {
	         //obtain text
	         String s = m.get(i).getText();
	         System.out.println("Course name is: " + s);
	      }
		driver.close();
		
	}

}
