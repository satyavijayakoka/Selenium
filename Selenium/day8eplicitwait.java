package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class day8eplicitwait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
//		alertIsPresent()
//		elementSelectionStateToBe()
//		elementToBeClickable()
//		elementToBeSelected()
//		frameToBeAvaliableAndSwitchToIt()
//		invisibilityOfTheElementLocated()
//		invisibilityOfElementWithText()
//		presenceOfAllElementsLocatedBy()
//		presenceOfElementLocated()
//		textToBePresentInElement()
//		textToBePresentInElementLocated()
//		textToBePresentInElementValue()
//		titleIs()
//		titleContains()
//		visibilityOf()
//		visibilityOfAllElements()
//		visibilityOfAllElementsLocatedBy()
//		visibilityOfElementLocated()

		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		driver.findElement(By.className("submit-button")).click();
		driver.findElement(By.cssSelector(".bm-burger-button")).click();
		
		// creating the wait
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		// adding conditions
		
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector("#logout_sidebar_link"))));
		
		driver.findElement(By.cssSelector("#logout_sidebar_link")).click();
		driver.close();
		
		
		
	}

}
