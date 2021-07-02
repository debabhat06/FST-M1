package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class Activity1 {
	
	WebDriver driver;
  @Test
  public void test1() {
	  
	  System.out.println("The title of the page is: "+driver.getTitle());
	  Assert.assertEquals("Training Support", driver.getTitle());
	  WebElement aboutbutton = driver.findElement(By.xpath("//a[@id='about-link']"));
	  aboutbutton.click();
	  System.out.println("The title of the page is: "+driver.getTitle());
	  Assert.assertEquals("About Training Support", driver.getTitle());
	  
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  
	  driver = new FirefoxDriver();
	  driver.get("https://www.training-support.net/");
  }

  @AfterMethod
  public void afterMethod() {
	  
	  driver.close();
	  
  }

}
