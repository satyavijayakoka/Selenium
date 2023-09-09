package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class day8implicitlywait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
	/*	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		driver.findElement(By.className("submit-button")).click();
		driver.findElement(By.cssSelector(".bm-burger-button")).click(); // this is for three bars(burger button) by class
		driver.findElement(By.cssSelector("#logout_sidebar_link")).click();// this is for logout by id
		driver.close();*/
		
		
		// program 2
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		driver.findElement(By.className("submit-button")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.cssSelector(".bm-burger-button")).click();
		driver.findElement(By.cssSelector("#logout_sidebar_link")).click();// this is for logout by id
		driver.close();
	}

}
