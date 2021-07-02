package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity_9_2 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/selects");
		WebElement multiselect = driver.findElement(By.xpath("//h3[@id='multi-value']"));
		Select multilist = new Select(driver.findElement(By.xpath("//select[@id='multi-select']")));
		if(multilist.isMultiple()) {
			multilist.selectByVisibleText("Javascript");
			System.out.println(multiselect.getText());
			multilist.selectByValue("node");
			System.out.println(multiselect.getText());
			for(int i= 4;i<=6;i++) {
				multilist.selectByIndex(i);
				System.out.println(multiselect.getText());
			}
			multilist.deselectByValue("node");
			System.out.println(multiselect.getText());
			multilist.deselectByIndex(7);
			System.out.println(multiselect.getText());
			multilist.getFirstSelectedOption();
			System.out.println(multiselect.getText());
			List <WebElement> alloptions = multilist.getAllSelectedOptions();
			for(WebElement option: alloptions) {
				
				System.out.println("The options are : "+option.getText());
				
			}
			multilist.deselectAll();
			System.out.println(multiselect.getText());
			
		}
		driver.close();
	}

}
