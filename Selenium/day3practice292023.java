package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day3practice292023 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get(" http://www.webdriveruniversity.com/Contact-Us/contactus.html");
		
		// tagName
		// <h2 name="contactme" class="section_header">CONTACT US</h2>
		
		WebElement headTwo = driver.findElement(By.cssSelector("h2"));
		String pre = headTwo.getText();
        System.out.println(pre);

        // class
         WebElement headTwoB = driver.findElement(By.cssSelector(".section_header"));
         String q1 = headTwoB.getText();
         System.out.println(q1);
         
         
        // there is no id in contact-us
        WebElement headTwoC = driver.findElement(By.cssSelector("#contact_me"));
         
         boolean q2 = headTwoC.isDisplayed();
         System.out.println(q2);
         
         //Test case 1
        WebElement headThree =  driver.findElement(By.cssSelector("h2[name=\"contactme\"]"));
         String q3 = headThree.getText();
         System.out.println(q3);
         
         if(q3.equals("CONTACT US")) {
        	 System.out.println("test case 1 pass");
         }
         else {
        	 System.out.println("test case 1 fails");
         }
         
         // Test case 2(happy path)
         
         driver.get(" http://www.webdriveruniversity.com/Contact-Us/contactus.html");
 		driver.findElement(By.cssSelector("#contact_form > input:nth-child(1)")).sendKeys("satya");
 		driver.findElement(By.cssSelector("#contact_form > input:nth-child(2)")).sendKeys("koka");
 		driver.findElement(By.cssSelector("#contact_form > input:nth-child(3)")).sendKeys("ammu.duggi123@gmail.com");
 		driver.findElement(By.cssSelector("#contact_form > textarea")).sendKeys("i am learning selenium");
 		driver.findElement(By.cssSelector("#form_buttons > input:nth-child(2)")).submit();
         
        boolean q4 = driver.findElement(By.cssSelector("h1")).isDisplayed();
         if(q4) {
        	 System.out.println("test case 2 pass");
         }
         else {
        	 System.out.println("test case 2 fail");
         }
         
         // Test case 3
         
         driver.get(" http://www.webdriveruniversity.com/Contact-Us/contactus.html");
  		driver.findElement(By.cssSelector("#contact_form > input:nth-child(1)")).sendKeys("satya");
  		driver.findElement(By.cssSelector("#contact_form > input:nth-child(2)")).sendKeys("koka");
  		driver.findElement(By.cssSelector("#contact_form > input:nth-child(3)")).sendKeys("ammu.duggi123gmail.com");
  		driver.findElement(By.cssSelector("#contact_form > textarea")).sendKeys("i am learning selenium");
  		driver.findElement(By.cssSelector("#form_buttons > input:nth-child(2)")).submit();
         
         boolean q5 = driver.findElement(By.cssSelector("body")).isDisplayed();
         if(q5) {
        	 System.out.println("test case 3 pass");
         }
         else {
        	 System.out.println("test case 3 fail");
         }
         
         // test case 4
         
         driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
 	    
		   driver.findElement(By.cssSelector("#contact_form > input:nth-child(1) ")).sendKeys("satya");
		   driver.findElement(By.cssSelector("#contact_form > input:nth-child(2)")).sendKeys("koka");
		   driver.findElement(By.cssSelector("#contact_form > input:nth-child(3)")).sendKeys("ammu.duggi123@gmail.com");
		   driver.findElement(By.cssSelector("#contact_form > textarea")).sendKeys("hello learning selenium");
		   driver.findElement(By.cssSelector("#form_buttons > input:nth-child(1)")).click();
		   
		  driver.findElement(By.cssSelector("#form_buttons > input:nth-child(1)")).getText();
	    
		   String q7 = driver.findElement(By.cssSelector("#contact_form > input:nth-child(1)")).getText();
			  System.out.println(q7);
			  
			  if(q7.isEmpty()) {
				  System.out.println("test case 4 pass");
			  }
			  else {
				  System.out.println("test case 4 fails");
			  }
         
         
         
         
         

	}

}
