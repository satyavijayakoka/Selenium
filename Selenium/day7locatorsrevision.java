package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day7locatorsrevision {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		driver.findElement(By.id("user-name"));
		driver.findElement(By.name("password"));
		driver.findElement(By.className("submit-button"));	
		
		// CssSelector Locator
					// .className-- swaglabs
					// #idValue-- username
					// tagName-- username,password,loginbutton--- form(tagname)
					// tagName[attribute = "value"]
//<input type="submit" class="submit-button btn_action" data-test="login-button" id="login-button" name="login-button" value="Login">
			
		driver.findElement(By.cssSelector(".submit-button"));
		driver.findElement(By.cssSelector("#login-button"));
		driver.findElement(By.cssSelector("form"));
		driver.findElement(By.cssSelector("input[data-test=\"login-button\"]"));
		driver.findElement(By.cssSelector("input[class=\"submit-button btn_action\"]"));
		
		driver.findElement(By.tagName("form"));
		
	// xpath -->//tagName[@attrbute= "value"]
		
//<input class="input_error form_input" placeholder="Username" type="text" data-test="username" id="user-name" name="user-name" autocorrect="off" autocapitalize="none" value="" fdprocessedid="swqhlf">
		
		driver.findElement(By.xpath("//input[@id=\"user-name\"]"));
		
	WebElement username = driver.findElement(By.cssSelector("#user-name"));
	WebElement password = driver.findElement(By.cssSelector("#password"));
	WebElement login = driver.findElement(By.cssSelector("#login-button"));
		username.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		login.click();
		
		driver.findElement(By.linkText("Sauce Labs Backpack"));
		driver.findElement(By.partialLinkText("Twit"));
		System.out.println("hello");
		driver.close();
	}

}
