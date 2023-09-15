package Selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day10windowhandle {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();  
		  driver.get("http://www.webdriveruniversity.com/");  
		 String parentwindow = driver.getWindowHandle();
		 System.out.println(parentwindow);
		 
		 
		// #contact-us > div > div.section-title > h1
		 // on parent window we have to inspect and select contact us & copy the element (or) we can do it by id="contact-us"
		 
		 driver.findElement(By.cssSelector("#contact-us")).click();
		
		 
		Set<String> windows = driver.getWindowHandles();
		
		for(String window: windows) {
			
			 System.out.println(window);
			 
			if(!window.equals(parentwindow)) {
				driver.switchTo().window(window);
				break;
			}
		}
		System.out.println(driver.getCurrentUrl());
		 

		WebElement first_name = driver.findElement(By.cssSelector("#contact_form > input:nth-child(1)"));
		WebElement last_name = driver.findElement(By.cssSelector("#contact_form > input:nth-child(2)"));
		WebElement email = driver.findElement(By.cssSelector("#contact_form > input:nth-child(3)"));
		WebElement message = driver.findElement(By.cssSelector("#contact_form > textarea"));
		WebElement submit_button = driver.findElement(By.cssSelector("#form_buttons > input:nth-child(2)"));
		
		first_name.sendKeys("satya");
		last_name.sendKeys("koka");
		email.sendKeys("ammu.duggi123@gmail.com");
		message.sendKeys("i am learning selenium");
		submit_button.click();
		
		driver.switchTo().window(parentwindow);
		System.out.println(driver.getCurrentUrl()); 
		
		
		
		
	}

}
