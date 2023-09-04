package seleniumexam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class seleniumexam32023 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
		driver.findElement(By.cssSelector("#contact_form > input:nth-child(1)")).sendKeys("satya");
		driver.findElement(By.cssSelector("#contact_form > input:nth-child(2)")).sendKeys("koka");
		driver.findElement(By.cssSelector("#contact_form > input:nth-child(3)")).sendKeys("ammu.duggi123@gmail.com");
		driver.findElement(By.cssSelector("#contact_form > textarea")).sendKeys("i am learning selenium");
		//driver.findElement(By.cssSelector("#form_buttons > input:nth-child(2)")).click();
		// question 1
		
		/*String expectedtitle = "";
		String actualtitle = "";
		if(expectedtitle.equals(actualtitle){
			System.out.println("test case pass");
			
		}else {
			System.out.println("test case fail");
		}*/
		
		
		driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		 String pagetitle =driver.getTitle();
		 System.out.println(pagetitle);
		 
		 String expectedvalue ="WebDriver | Dropdown Menu(s) | Checkboxe(s) | Radio Button(s)";
		 String actualtitle = "pagetitle";
			if(expectedvalue.equals(actualtitle)){
				System.out.println("test case pass");
				
			}else {
				System.out.println("test case fail");
			}
			
			// question 2
			WebElement option1 =driver.findElement(By.cssSelector("#checkboxes > label:nth-child(1) > input[type=checkbox]"));
			WebElement option2=driver.findElement(By.cssSelector("#checkboxes > label:nth-child(3) > input[type=checkbox]"));
			WebElement option3=driver.findElement(By.cssSelector("#checkboxes > label:nth-child(5) > input[type=checkbox]"));
			WebElement option4=driver.findElement(By.cssSelector("#checkboxes > label:nth-child(7) > input[type=checkbox]"));
			option1.click();
			option2.click();
			option3.click();
			option4.click();
			
			// assertion
			
			boolean q1 = option1.isSelected();
			boolean q2 = option1.isSelected();
			boolean q3 = option1.isSelected();
			boolean q4 = option1.isSelected();
			
			System.out.println(q1);
			System.out.println(q2);
			System.out.println(q3);
			System.out.println(q4);
			
			// question3
			
			WebElement orange=driver.findElement(By.cssSelector("#radio-buttons > input[type=radio]:nth-child(7)"));
			orange.click();
			boolean q5 = orange.isSelected();
			if(q5==true) {
				System.out.println("Orange radio button is selected.");
			}
			
			// question 4
			
			Select python = new Select(driver.findElement(By.cssSelector("#dropdowm-menu-1")));
			python.selectByVisibleText("Python");
	
			String selectedOption = python.getFirstSelectedOption().getText();
	        if (selectedOption.equals("Python")) {
	            System.out.println("Python is selected from the dropdown.");
	        } else {
	            System.out.println("Python is not selected from the dropdown.");
	        }
			
			// question 5
	        WebElement heading = driver.findElement(By.cssSelector("#main-header > h1"));
			String headingTxt = heading.getText();
			System.out.println(headingTxt);
	        
	        
	        
	        
	        
	}

}
