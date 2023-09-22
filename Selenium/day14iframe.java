package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day14iframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// WebDriver | IFrame--> title
		// #frame
		// #div-main-nav > div > ul > li.active > a
		
		
		
		ChromeDriver driver = new ChromeDriver();
		// visiting the url
		driver.get("http://www.webdriveruniversity.com/IFrame/index.html");
		
		// iframe --> searching by tagname and selecting it by id
	//	WebElement ele = driver.findElement(By.cssSelector("#frame"));
	//	driver.switchTo().frame(ele);
		
		// switch to iframe by index and searching the element "home"
		
		driver.switchTo().frame(0);
		WebElement ele2 = driver.findElement(By.cssSelector(" #div-main-nav > div > ul > li.active > a"));
		System.out.println(ele2.isDisplayed());
		
		// switching back to main content
		driver.switchTo().defaultContent();
		// finding the element in main content --> by id (#nav-title) heading of the page
		driver.findElement(By.cssSelector("#nav-title")).isDisplayed();
		
		// validating the title of main content
		if(driver.getTitle().equals("WebDriver | IFrame")) {
			System.out.println("test case pass");
		}
		else {
			System.out.println("test case fails");
		}
		
		driver.close();
		
		
		
	}

}
