package Selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;


public class day5assignment {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

        // Use JavaScript to open a new tab with Bing
        ((JavascriptExecutor) driver).executeScript("window.open('https://www.bing.com', '_blank');");

        // Switch focus to the new tab
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }

        // Close the current tab (Bing)
        driver.quit();
        driver.close();

        
    }
}
