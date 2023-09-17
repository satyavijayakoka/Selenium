package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day12ajsalert {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		// visiting the url
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		// copy the element "result" on url
		
		WebElement ele = driver.findElement(By.id("result"));
		// finding the element and clicking on it
		
		// test case 1: for js alert click ok
		//#content > div > ul > li:nth-child(1) > button
		
	/*	driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(1) > button")).click();
		
		// switching to alert and get text
		
		String alert = driver.switchTo().alert().getText();
		if(alert.equals("I am a JS Alert")) {
			System.out.println("test case 1 pass");
		}
		driver.switchTo().alert().accept();
		if(ele.getText().equals("You successfully clicked an alert")) {
			System.out.println("test case 1 pass");
		}*/
		
		// test case 2: for js confirm click ok
		
	/*	driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(2) > button")).click();
		String text = driver.switchTo().alert().getText();
		if(text.equals("I am a JS Confirm")) {
			System.out.println("test case 2 pass");
		}
		driver.switchTo().alert().accept();
		if(ele.getText().equals("You clicked: Ok")) {
			System.out.println("test case 2 pass");
		}*/
		
		
		// test case 3:  for js confirm click cancel
		
	/*	driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(2) > button")).click();
		String text2 = driver.switchTo().alert().getText();
		if(text2.equals("I am a JS Confirm")) {
			System.out.println("test case 3 pass");
		}
		driver.switchTo().alert().dismiss();
		if(ele.getText().equals("You clicked: Cancel")) {
			System.out.println("test case 3 pass");
		}*/
		
		// test case 4 : for js prompt button click ok
		
	/*	driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(3) > button")).click();
		String text3 = driver.switchTo().alert().getText();
		if(text3.equals("I am a JS prompt")) {
			System.out.println("test case 4 pass");
		}
		else {
			System.out.println("test case 4 fail");
		}
		driver.switchTo().alert().sendKeys("text3");
		driver.switchTo().alert().accept();
		if(ele.getText().equals("You entered: text3")) {
			System.out.println("test case pass");
		}
		else {
			System.out.println("test case fail");
		}*/
		
		// test case 5: for js prompt button click cancel
		
		driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(3) > button")).click();
		String text3 = driver.switchTo().alert().getText();
		if(text3.equals("I am a JS prompt")) {
			System.out.println("test case 5 pass");
		}
		else {
			System.out.println("test case 5 fail");
		}
		driver.switchTo().alert().sendKeys("text3");
		driver.switchTo().alert().dismiss();
		if(ele.getText().equals("You entered: null")) {
			System.out.println("test case pass");
		}
		else {
			System.out.println("test case fail");
		}
		
		
		driver.close();
		driver.quit();
		
		

		// Modal Popup as homework 
				// http://www.webdriveruniversity.com/Popup-Alerts/index.html
				
				
	}

}
