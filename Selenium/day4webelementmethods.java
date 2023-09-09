package Selenium;



import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day4webelementmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");

		//ChromeDriver driver1 = new ChromeDriver();
		
		//driver1.get("https://www.saucedemo.com/"); 
	
		
		// getText();
		
		 WebElement e1 = driver.findElement(By.cssSelector(".section_header"));
		//WebElement e1 = driver.findElement(By.cssSelector("#contact_me > div > div:nth-child(1) > div > h2"));
		String txt = e1.getText();
		
	System.out.println(txt); //CONTACT US
		
        // getTagName()
	String txt2 = e1.getTagName();
	System.out.println(txt2);  //h2
	
	
	// get attribute
	
	String txt3 = e1.getAttribute("class");
	System.out.println(txt3);  //section_header
	
	// getsize()
	driver.manage().window().maximize();
	Dimension a = e1.getSize();
	System.out.println(a);  //(1140, 46)
	
	// get size ; email id: #contact_form > input:nth-child(3)        #contact_form > input:nth-child(3)
	
	Dimension b =driver.findElement(By.cssSelector("#contact_form > input:nth-child(3)")).getSize();
	
	System.out.println(b);  //(1053, 58)
	
	String txt4 = e1.getCssValue("font-size");
	String txt5 = e1.getCssValue("font-family");
	String txt6 = e1.getCssValue("color");
	System.out.println(txt4);  //42px
	System.out.println(txt5);  //"Helvetica Neue", Helvetica, Arial, sans-serif
	System.out.println(txt6);  //rgba(230, 44, 33, 1)
	
	Point q = e1.getLocation();
	System.out.println(q);  //(405, 100)
	
	// getTitle()
/*	String pagetitle = driver.getTitle();
	System.out.println(pagetitle);
	
	// getCurrentUrl()
	
	String url = driver.getCurrentUrl();
	System.out.println(url);
	
	// get navigate()
	
	Navigation c = driver.navigate();
	  // Navigate to Google
    driver.navigate().to("https://www.google.com");
 // Navigate to Bing
    driver.navigate().to("https://www.bing.com");		
	
	// Now, navigate back to the previous page
	driver.navigate().back();
	// Go forward to the page you clicked the link to
	driver.navigate().forward();
	
	// Now, navigate to DuckDuckGo
    driver.navigate().to("https://www.duckduckgo.com");
    
    driver.navigate().refresh();
    
  // driver.quit();
	
	
	
	//System.out.println(c);

	//String ps = driver.getPageSource();
	//System.out.println(ps);
	
	//driver.close();*/
	}

}
