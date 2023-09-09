package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;

public class FindElemnts {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.example.com/checkboxes-page"); // Replace with your checkbox page

        // Find all checkboxes using their tag name
        List<WebElement> allCheckboxes = driver.findElements(By.tagName("input"));

        // Click on all the checkboxes
        for (WebElement checkbox : allCheckboxes) {
        	
            checkbox.click();
        }

        // Close the browser
        //driver.quit();
    }
}
