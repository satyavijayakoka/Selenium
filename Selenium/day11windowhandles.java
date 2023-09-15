package Selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day11windowhandles {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();	
		driver.get("http://www.webdriveruniversity.com/");
		driver.findElement(By.cssSelector("#contact-us")).click();
		String parentwindow = driver.getWindowHandle();
		System.out.println(parentwindow);
		
		Set<String> windows = driver.getWindowHandles();
		System.out.println(windows);
		
		Iterator<String> s = windows.iterator();
		String parentwindowA = s.next();
		System.out.println(parentwindowA);
		String childwindow = s.next();
		System.out.println(childwindow);
		driver.switchTo().window(childwindow);
		
		WebElement ele = driver.findElement(By.cssSelector("#contact_me > div > div:nth-child(1) > div > h2"));
		if(ele.isDisplayed()) {
			System.out.println("test case pass");
		}
		if(driver.getTitle().equals("WebDriver | Contact Us")) {
			System.out.println("test case pass");
		}
		
		driver.switchTo().window(parentwindow);
		driver.getCurrentUrl();
		driver.quit();

	}

}
