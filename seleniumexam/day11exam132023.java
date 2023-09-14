package seleniumexam;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class day11exam132023 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		 
		List<WebElement> checkboxes = driver.findElements(By.cssSelector("input[type='checkbox']"));
			
		// Select all checkboxes  #checkboxes > label:nth-child(1) > input[type=checkbox]
		//#checkboxes
		
		
		for (WebElement checkbox : checkboxes) {
            if (!checkbox.isSelected()) {
                checkbox.click();
            }
            
            System.out.println("Checkbox selected: " + checkbox.isSelected());
        }
			
		 // Unselect all checkboxes
		
        for (WebElement checkbox : checkboxes) {
           
                checkbox.click();
            
            System.out.println("Checkbox selected: " + checkbox.isSelected());
        }
        
     
        
        
        
        
	}

}
