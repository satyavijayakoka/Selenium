package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day3testcases {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
		
		// Test case 1 
		// <h2 name="contactme" id = "three" class="section_header">CONTACT US</h2> (for referrence of us)
		// Xpath , CSS selector 

		// tagName  #contact_me > div > div:nth-child(1) > div > h2
		//finding element with tagName to find the "CONTACT US" element
		  //{in DOM command f and type *tagName that is highlighted*}
	WebElement headTwo = driver.findElement(By.cssSelector("h2"));
	 String q1 = headTwo.getText();
	 System.out.println(q1); // CONTACT US
	 
	 
	 // class
	 //finding element with class to find the "CONTACT US" text element 
	  //{in DOM command f and type .*Value of that attribute*}
	 WebElement headTwob =  driver.findElement(By.cssSelector(".section_header"));
	 String q2 = headTwob.getText();
	 System.out.println(q2); // CONTACT US
	 
	// id 
	
	//finding element with id to validate that "CONTACT US" is displayed
	  //{in DOM command f and type *[id]*}

	// <form action="contact_us.php" method="post" id="contact_form"> (for my reference)
	 
	 WebElement headTwoc = driver.findElement(By.cssSelector("#contact_form"));
	 //String h = headTwoc.getText();
	 //System.out.println(h);
	
	    boolean q3 = headTwoc.isDisplayed();
	    System.out.println(q3); // true
	
	 // anyAttribute 
	  //tagName[attribute= "value"] 

	    //finding element by any attribute
	    //tagName[attribute= "value"]
	    
	    // Test case 1
	    WebElement headThreed = driver.findElement(By.cssSelector("h2[name =\"contactme\"]")); 
	 //  WebElement headThreed = driver.findElement(By.cssSelector("h2[name=\"contactme\"]"));
	   // boolean q8 =headThreed.isDisplayed();
	  //  System.out.println(q8);
	   String q4 = headThreed.getText(); 
	   System.out.println(q4); 
	   if(q4.equals("CONTACT US")) { 
	   System.out.println("Testcase 1 pass"); 
	   } 
	   else { 
	   System.out.println("Testcase1 Fail"); 
	   } 
	   // CONTACT US 


	// Test case 2(happy path)
	   
	   driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
	   driver.findElement(By.cssSelector("#contact_form > input:nth-child(1) ")).sendKeys("satya");
	   driver.findElement(By.cssSelector("#contact_form > input:nth-child(2)")).sendKeys("koka");
	   driver.findElement(By.cssSelector("#contact_form > input:nth-child(3)")).sendKeys("ammu.duggi123@gmail.com");
	   driver.findElement(By.cssSelector("#contact_form > textarea")).sendKeys("hello learning selenium");
	   driver.findElement(By.cssSelector("#form_buttons > input:nth-child(2)")).submit();
	    
	  // assertion
	 boolean q5 =  driver.findElement(By.cssSelector("h1")).isDisplayed();
	    if(q5) {
	    	System.out.println("test case 2 is passed");
	    }
	    else {
	    	System.out.println("test case 2 fail");
	    	
	    	
	    }
	    
	    // Test case 3(invalid email id)
	    
	   driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
	    
		   driver.findElement(By.cssSelector("#contact_form > input:nth-child(1) ")).sendKeys("satya");
		   driver.findElement(By.cssSelector("#contact_form > input:nth-child(2)")).sendKeys("koka");
		   driver.findElement(By.cssSelector("#contact_form > input:nth-child(3)")).sendKeys("ammu.duggi123gmail.com");
		   driver.findElement(By.cssSelector("#contact_form > textarea")).sendKeys("hello learning selenium");
		   driver.findElement(By.cssSelector("#form_buttons > input:nth-child(2)")).submit();
	    
	   boolean q6 = driver.findElement(By.cssSelector("body")).isDisplayed();
	    if(q6) {
	    	System.out.println("test case 3 pass");
	    }
	    else {
	    	System.out.println("test case 3 fail");
	    }
	    
	    
	    // Test case 4;  reset: #form_buttons > input:nth-child(1)
	    
	    
	  driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
	    
		   driver.findElement(By.cssSelector("#contact_form > input:nth-child(1) ")).sendKeys("satya");
		   driver.findElement(By.cssSelector("#contact_form > input:nth-child(2)")).sendKeys("koka");
		   driver.findElement(By.cssSelector("#contact_form > input:nth-child(3)")).sendKeys("ammu.duggi123@gmail.com");
		   driver.findElement(By.cssSelector("#contact_form > textarea")).sendKeys("hello learning selenium");
		   driver.findElement(By.cssSelector("#form_buttons > input:nth-child(1)")).click();
	    
       // reset first name
		   
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
