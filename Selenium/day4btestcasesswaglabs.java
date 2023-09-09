package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day4btestcasesswaglabs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		 

		
		// Test case 1 ;inspect products: #header_container > div.header_secondary_container > span  
		
		performLogin(driver,"standard_user","secret_sauce");
		boolean tc1 = driver.findElement(By.cssSelector("#header_container > div.header_secondary_container > span")).isDisplayed();
		if(tc1) {
			System.out.println("test case 1 pass");
		}
		else {
			System.out.println("test case fail");
		}
		
		// Test case 2 ; #login_button_container > div > form > div.error-message-container.error > h3
		
		driver.get("https://www.saucedemo.com/");
		performLogin(driver,"locked_out_user","secret_sauce");
boolean tc2 = driver.findElement(By.cssSelector("#login_button_container > div > form > div.error-message-container.error > h3")).isDisplayed();
		if(tc2) {
			System.out.println("test case 2 pass");
		}
		else {
			System.out.println("test case 2 fail");
		}
		
		// Test case 3 ; inspect image of dog:  #item_4_img_link > img 
		
		driver.get("https://www.saucedemo.com/");
		performLogin(driver,"problem_user","secret_sauce");
		boolean tc3 = driver.findElement(By.cssSelector("#item_4_img_link > img")).isDisplayed();
		if(tc3) {
			System.out.println("test case 3 pass");
		}
		else {
			System.out.println("test case 3 fail");
		}
		
		// Test case4   #inventory_container > div > div:nth-child(1) > div.inventory_item_description > div.pricebar > div
		
		driver.get("https://www.saucedemo.com/");
		performLogin(driver,"performance_glitch_user","secret_sauce");
		

		 List<WebElement> abc = driver.findElements(By.cssSelector(".inventory_item_price"));
	     
	    // System.out.println(abc.size());
		
	int x = abc.size();
	if(x == 6) {
		System.out.println("test case 4 pass");
		
	}
	else {
		System.out.println("test case 4 fails");
	}
		
		
		
		
		
		  // it is used to wait before finding element to validate.
		
	//	driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		
	//	int displayedImageCount = numOfImg(driver);
		
	//	if(displayedImageCount >0) {
	//		System.out.println("number of displayed images:"+ displayedImageCount);
	//	
	//		System.out.println("test case 4 passed");
	//	}
	//	else {
	//		System.out.println("no images displayed or test case 4 failed");
		}
		
	//

public static void performLogin(ChromeDriver driver,String username, String password) {
	
	WebElement usernameField= driver.findElement(By.cssSelector("#user-name"));
	WebElement passwordField= driver.findElement(By.cssSelector("#password"));
	WebElement loginButton= driver.findElement(By.cssSelector("#login-button"));
	
	usernameField.sendKeys(username);
	passwordField.sendKeys(password);
	loginButton.click();
	
}

		 
 // public static int numOfImg(ChromeDriver driver) {
	//int i =0;
	// counting images  ;inspect price and choose attribute class = "inventory_item_price"

	// List<WebElement> abc = driver.findElements(By.cssSelector(".inventory_item_price"));
     
  //   System.out.println(abc.size());
     
   //  return i;
	// for(WebElement image : driver.findElements(By.cssSelector(".inventory_item_price"))) {
	//	if(image.isDisplayed()) {
	//		i++;
  
	
	
	
}

