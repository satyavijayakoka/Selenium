package seleniumexam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class exampractice32023 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		
		// question 1
		
		 String actualvalue = driver.getTitle();
		String expectedvalue = "WebDriver | Dropdown Menu(s) | Checkboxe(s) | Radio Button(s)";
		if(expectedvalue.equals(actualvalue)) {
			System.out.println("test case pass");
		}
		else {
			System.out.println("test case fail");
		}
		
		// question 2   #checkboxes > label:nth-child(1) > input[type=checkbox]
		
		
	WebElement option1 =driver.findElement(By.cssSelector("#checkboxes > label:nth-child(1) > input[type=checkbox]"));
	WebElement option2 =driver.findElement(By.cssSelector("#checkboxes > label:nth-child(3) > input[type=checkbox]"));	
	WebElement option3 =driver.findElement(By.cssSelector("#checkboxes > label:nth-child(5) > input[type=checkbox]"));	
	WebElement option4 =driver.findElement(By.cssSelector("#checkboxes > label:nth-child(7) > input[type=checkbox]"));	
		
		option1.click();
		option2.click();
		option3.click();
		option4.click();
		
		// assertion
		
		boolean opt1 = option1.isSelected();
		boolean opt2 = option1.isSelected();
		boolean opt3 = option1.isSelected();
		boolean opt4 = option1.isSelected();
		
		
		System.out.println(opt1);
		System.out.println(opt2);
		System.out.println(opt3);
		System.out.println(opt4);
		
		// question 3 #radio-buttons > input[type=radio]:nth-child(7);  #radio-buttons > input[type=radio]:nth-child(5)
		
		WebElement orange =driver.findElement(By.cssSelector("#radio-buttons > input[type=radio]:nth-child(7)"));
		
		 orange.click();
		
		 // assertion
		  boolean org = orange.isSelected();
		System.out.println("orange button: " +org);
		
		// question 4  #dropdowm-menu-1; #dropdowm-menu-2-- testng
		WebElement dropdown = driver.findElement(By.cssSelector("#dropdowm-menu-1"));
		Select python = new Select(dropdown);
		python.selectByVisibleText("Python");
		
		// assertion
		
	String selectedvalue =python.getFirstSelectedOption().getText();
		
		// System.out.println(selectedvalue);
		
		if(selectedvalue.equals("Python")) {
			System.out.println("python option is selected");
		}
		else {
			System.out.println("python option is not selected");
		}
		
		// question 5 #main-header > h1    #main-header > h1
		
		WebElement heading =driver.findElement(By.cssSelector("#main-header > h1"));
		String headtxt = heading.getText();
		//System.out.println(headtxt);
		
		if(headtxt.equals("Dropdown Menu(s), Checkboxe(s) & Radio Button(s)")) {
			System.out.println("test case pass");
		}
		else {
			System.out.println("test case fail");
		}
		
		

	}

}
