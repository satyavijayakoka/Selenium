package Selenium;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageTest1 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/"); 
        
        
        
        String[] usernames = {"standard_user", "locked_out_user", "problem_user", "performance_glitch_user"};
        		
        String password = "secret_sauce";

        for (String username : usernames) {
            
            WebElement usernameField = driver.findElement(By.cssSelector("#user-name")); 
            WebElement passwordField = driver.findElement(By.cssSelector("#password")); 
            WebElement loginButton = driver.findElement(By.cssSelector("#login-button"));
           usernameField.clear();
            usernameField.sendKeys(username);
            passwordField.sendKeys(password);
            loginButton.click();
            
            
            System.out.println("Login attempt made for: " + username);
      
            driver.get("https://www.saucedemo.com/");
        }

        driver.close();
        }
        
    }

		


