package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_8_2 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/tables");
		List <WebElement> rows = driver.findElements(By.xpath("//table[contains(@id, 'sortableTable')]/tbody/tr"));
		System.out.println("The number of rows are: "+rows.size());
		List <WebElement> columns = driver.findElements(By.xpath("//table[contains(@id, 'sortableTable')]/tbody/tr[1]/td"));
		System.out.println("The number of columns are: "+columns.size());
		WebElement cellValueBefore = driver.findElement(By.xpath("//table[@id='sortableTable']/tbody/tr[2]/td[2]"));
        System.out.println("Second row, second column value(Before sorting): " + cellValueBefore.getText());
        driver.findElement(By.xpath("//table[@id='sortableTable']/thead/tr/th[2]")).click();
        WebElement cellValueAfter = driver.findElement(By.xpath("//table[@id='sortableTable']/tbody/tr[2]/td[2]"));
        System.out.println("Second row, second column value(After sorting): " + cellValueAfter.getText());
        WebElement footerValue = driver.findElement(By.xpath("//table[contains(@id, 'sortableTable')]/tfoot/tr"));
        System.out.println("The footer Values are :"+footerValue.getText());
		driver.close();

	}

}
