package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class day5assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		// getTitle() returns the title of the page
		String pagetitle = driver.getTitle();
		System.out.println(pagetitle);
		
// getCurrentUrl() returns currentUrl
	String url = driver.getCurrentUrl();
	System.out.println(url);
		
		
		
		 WebElement username= driver.findElement(By.cssSelector("#user-name"));
		WebElement password= driver.findElement(By.cssSelector("#password"));
		WebElement loginButton= driver.findElement(By.cssSelector("#login-button"));
		
		username.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		loginButton.click();
		
		// findElements() returns the list of all web elements the specified criteria
		 List<WebElement> item = driver.findElements(By.cssSelector(".inventory_item"));
		 System.out.println(item.size());
		 
		// getTitle()
		String pagetitle1 = driver.getTitle();
		System.out.println(pagetitle1);
		
		// getCurrentUrl()
		
		String url1 = driver.getCurrentUrl();
		System.out.println(url1);
		
		// get navigate()
		Navigation c = driver.navigate();
		System.out.println(c);
		
		
		// driver.getPageSource() source code of the page
		String ps = driver.getPageSource();
				System.out.println(ps);

				
		  // Navigate to Google
	    driver.navigate().to("https://www.google.com");
	    
	 // Navigate to Bing
	    driver.navigate().to("https://www.bing.com");		
		
		// Now, navigate back to the previous page
		driver.navigate().back();
		
		// Go forward to the page you clicked the link to
		driver.navigate().forward();
		
		// Now, navigate to DuckDuckGo
	    driver.navigate().to("https://www.duckduckgo.com");
	    
	    driver.navigate().refresh();
	    
	   driver.quit(); // it closes all windows at a time
		
		//driver.close(); //it close the current window
	   
	}

}
