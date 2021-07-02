package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Activity5 {
	
	WebDriver driver;
	
  @Test(groups= {"HeaderTests","ButtonTests"})
  public void PageTitle() {
	  
	  System.out.println("Title of the page is "+driver.getTitle());
	  
  }
  
  @Test(dependsOnMethods ={"PageTitle"},groups= {"HeaderTests"})
  public void Header() {
	  
	  WebElement header3 = driver.findElement(By.xpath("//h3[@id='third-header']"));
	  System.out.println("it says: "+header3.getText());
	  Assert.assertEquals("Third header", header3.getText());
	  WebElement header5 = driver.findElement(By.cssSelector("h3#third-header"));
      Assert.assertEquals(header5.getCssValue("color"), "rgb(251, 189, 8)");
	  
  }
  
  @Test(dependsOnMethods ={"PageTitle"},groups= {"ButtonTests"})
  public void Button() {
	  
	  WebElement button1 = driver.findElement(By.cssSelector("button.olive"));
      Assert.assertEquals(button1.getText(), "Olive");
      WebElement button2 = driver.findElement(By.cssSelector("button.brown"));
      Assert.assertEquals(button2.getCssValue("color"), "rgb(255, 255, 255)");
	  
  }
  
  
  @BeforeClass (alwaysRun=true)
  public void beforeClass() {
	  
	  driver= new FirefoxDriver();
	  driver.get("https://www.training-support.net/selenium/target-practice");
	  
  }

  @AfterClass
  public void afterClass() {
	  
	  driver.close();
	  
  }

}
