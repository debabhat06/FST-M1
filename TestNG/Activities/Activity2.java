package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;

public class Activity2 {
	
	WebDriver driver;
	
  @Test
  public void test1() {
	  
	  System.out.println("The title of the page is: "+driver.getTitle());
  }
  
  @Test
  public void test2() {
	  
	  WebElement blackbutton = driver.findElement(By.xpath("//button[@class='ui black button']"));
	  Assert.assertEquals("blackbutton", blackbutton.getText());
  }
  
  @Test(enabled=false)
  public void test3() {
	  
	  System.out.println("this will be skipped");
  }
  
  @Test
  public void test4() {
	  
	  System.out.println("this will use skip excpetion");
	  throw new SkipException("This is a skip exception");
  }
  
  @BeforeClass
  public void beforeClass() {
	  
	   driver = new FirefoxDriver();
	   driver.get("https://www.training-support.net/selenium/target-practice");
	  
  }

  @AfterClass
  public void afterClass() {
	  
	  driver.close();
  }

}
