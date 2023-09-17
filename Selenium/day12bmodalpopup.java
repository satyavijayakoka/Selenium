package Selenium;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class day12bmodalpopup {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Popup-Alerts/index.html");

		
		 driver.findElement(By.cssSelector("#button2 > p")).click();
		
		 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		boolean B1 =  driver.findElement(By.cssSelector("#myModal > div > div > div.modal-header > h4")).isDisplayed();
		if(B1) {
			System.out.println("test case pass");
		}
		else {
			System.out.println("test case fail");
		}
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.cssSelector("#myModal > div > div > div.modal-footer > button")).click();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		boolean B2 = driver.findElement(By.cssSelector("#myModal > div > div > div.modal-header > h4")).isDisplayed();
		
		
		if(B2==false) {
			System.out.println("test case pass");
		}
		else {
			System.out.println("test case fail");
		}
		driver.close();
		
	}

}
