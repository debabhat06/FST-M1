package Selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity_11_4 {

	public static void main(String[] args) {
		//creating a webinstance
		WebDriver driver = new FirefoxDriver();
		//open a browser
		driver.get("https://www.training-support.net/selenium/tab-opener");
		//print page title
		System.out.println("The title of the page is :" +driver.getTitle());
		String window = driver.getWindowHandle();
		//print windowhandle
		System.out.println("The window Handle is: "+window);
		//find the button to open a new tab and click
		WebElement clickMe = driver.findElement(By.xpath("//a[@id='launcher']"));
		clickMe.click();
		WebDriverWait wait = new WebDriverWait(driver, 5);
		//waiting for new tab to open
		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		Set<String> windowsHandles = driver.getWindowHandles();
		//printing all handles
		System.out.println("Here are the window Handles: "+windowsHandles);
		//switch to newly open tab
		for(String handles: driver.getWindowHandles()) {
			
			driver.switchTo().window(handles);
			
		}
		//current handle
		System.out.println("Current window handle: " + driver.getWindowHandle());
		wait.until(ExpectedConditions.titleIs("Newtab"));
		//printing title of new tab
		System.out.println("The title of the new page is: "+driver.getTitle());
		
		//heading of the new page
		WebElement newTabText = driver.findElement(By.xpath("//div[contains(text(),'New Tab')]"));
		System.out.println("The heading of the new page is "+newTabText.getText());
		driver.findElement(By.linkText("Open Another One!")).click();
		wait.until(ExpectedConditions.numberOfWindowsToBe(3));
		windowsHandles = driver.getWindowHandles();
        System.out.println("All window handles: " + windowsHandles);
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }
        System.out.println("Current window handle: " + driver.getWindowHandle());
        wait.until(ExpectedConditions.titleIs("Newtab2"));
        System.out.println("New Tab Title is: " + driver.getTitle());
        
        //System.out.println("New tab heading is: " + newTabText.getText());
		
		driver.quit();

	}

}
