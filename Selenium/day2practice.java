package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day2practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		WebElement username = driver.findElement(By.cssSelector("#user-name"));
		
		WebElement password = driver.findElement(By.cssSelector("#password"));
		
		WebElement login = driver.findElement(By.cssSelector("#login-button"));
		
		// dashboard elements #user-name, #password, #login-button, #header_container > div.header_secondary_container > span
		
		username.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		login.click();
		
		// assertion
		 WebElement heading = driver.findElement(By.cssSelector("#header_container > div.header_secondary_container > span"));
		 
		 if(heading.isDisplayed()) {
			 System.out.println("test case is passed");
		 }
		 else {
			 System.out.println("test case is failed");
		 }

	}
	
}
