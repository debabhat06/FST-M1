package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {
    public static void main(String args[]) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        String URL = "https://www.training-support.net/";
        driver.get(URL);
        String title = driver.getTitle();
        System.out.println("The title of the page is :" +title);
        WebElement element = driver.findElement(By.id("about-link"));
        element.click();
        
    }
}