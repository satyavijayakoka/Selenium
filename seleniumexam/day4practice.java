package seleniumexam;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day4practice {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
// <input class="input_error form_input" placeholder="Username" type="text" data-test="username" id="user-name" name="user-name" autocorrect="off" autocapitalize="none" value="">
		
	//	WebElement ele =driver.findElement(By.id("user-name"));
	//	ele.sendKeys("standard_user");
		
		
		// name locator
		// name locator of html element to select the element
		
	//	WebElement ele =driver.findElement(By.name("user-name"));
		
	//	ele.sendKeys("standard_user");
		
		
		// class name locator-- class locator of html element to select the element
		
		WebElement ele = driver.findElement(By.className("input_error"));
		
		ele.sendKeys("standard_user");
		
		List<WebElement> elelist = driver.findElements(By.className("input_error"));
		elelist.get(1).sendKeys("secret_sauce");
		
		
		//tag name selector
		
		driver.findElements(By.tagName("input")).get(1).sendKeys("secret_sauce");
		
		// CssSelector Locator
			// .className-- swaglabs
			// #idValue-- username
			// tagName-- username,password,loginbutton--- form(tagname)
			// tagName[attribute = "value"]
//<input class="input_error form_input" placeholder="Username" type="text" data-test="username" id="user-name" name="user-name" autocorrect="off" autocapitalize="none" value="" fdprocessedid="swqhlf">
			
		
		driver.findElement(By.cssSelector(".login_logo"));
		driver.findElement(By.cssSelector("#user-name"));
		driver.findElement(By.cssSelector("form"));
		driver.findElement(By.cssSelector("input[placeholder='Username']"));
		
		
		
	}

}
