package seleniumexam;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day11examradiobuttons {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		 
		List<WebElement> radioButtons = driver.findElements(By.cssSelector("input[name='color']"));
			
		
		for (WebElement radioButton :radioButtons ) {
             
            	radioButton.click();
         // String  c=	radioButton.getText();
            	
          //System.out.println(c);
          System.out.println("radioButton selected: " + radioButton.isSelected());
        }
			
		 
        
        
        
        

	}

}
