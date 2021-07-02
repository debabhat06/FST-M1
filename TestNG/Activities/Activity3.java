package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Activity3 {
	
	WebDriver driver;
	
  @Test
  public void test1() {
	  
	  driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
	  driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password");
	  driver.findElement(By.xpath("//button[@class='ui button']")).click();
	  WebElement confirm = driver.findElement(By.xpath("//div[@id='action-confirmation']"));
	  System.out.println("The confirmation message says"+confirm.getText());
	  Assert.assertEquals("Welcome Back, admin", confirm.getText());
	  
  }
  @BeforeClass
  public void beforeClass() {
	  
	  driver= new FirefoxDriver();
	  driver.get("https://www.training-support.net/selenium/login-form");
  }

  @AfterClass
  public void afterClass() {
	  
	  driver.close();
	  
  }

}
