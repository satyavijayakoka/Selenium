package Selenium;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class day8cthreaddotsleep {

	public static void main(String[] args) {
	

		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		//driver.findElement(By.id("user-n"));
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		driver.findElement(By.className("submit-button")).click();
		driver.findElement(By.cssSelector(".bm-burger-button")).click();
		try {
			Thread.sleep(5000);
		}
		catch(InterruptedException e){
			e.printStackTrace();
			
		}
		driver.findElement(By.cssSelector("#logout_sidebar_link")).click();
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
	}

}
