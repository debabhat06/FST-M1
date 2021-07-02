package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity_9_1 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/selects");
		WebElement dropdown = driver.findElement(By.xpath("//h3[@id='single-value']"));
		Select dropdownnew = new Select(driver.findElement(By.xpath("//select[@id='single-select']")));
		dropdownnew.selectByVisibleText("Option 2");
		System.out.println("The second option is: "+dropdown.getText());
		dropdownnew.selectByIndex(3);
		System.out.println("The third option is: "+dropdown.getText());
		dropdownnew.selectByValue("4");
		System.out.println("The fourth option is: "+dropdown.getText());
		List <WebElement> options = dropdownnew.getOptions();
		for(WebElement Everyoption : options) {
			
			System.out.println("Options are:"+Everyoption.getText());
			
		}
		driver.close();
		

	}

}
