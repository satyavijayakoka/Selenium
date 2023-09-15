package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class day9dropdowns {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		
		// copied element from dropdown :
		
		/* <select class="dropdown-menu-lists" id="dropdowm-menu-1">
        <option value="java">JAVA</option>
       <option value="c#">C#</option>
       <option value="python">Python</option>
        <option value="sql">SQL</option>
      </select>*/
		
		WebElement select = driver.findElement(By.cssSelector("#dropdowm-menu-1"));
		
		Select dropdown = new Select(select);
		dropdown.selectByIndex(0);
		
		dropdown.selectByValue("python");
		dropdown.selectByVisibleText("Python");
		
	//	List<WebElement> opt = dropdown.getOptions();	
	//	for(int i =0; i<opt.size(); i++) {
	//		dropdown.selectByIndex(i);
	//	}		
	
		List<WebElement> opt = dropdown.getOptions();
		for(int i = 0; i<opt.size(); i++) {
			System.out.println(opt.get(i).getText());
			
			if(opt.get(i).getText().startsWith("P")) {
				dropdown.selectByVisibleText(opt.get(i).getText());
				break;
			}
		}
		
		// Assertion 
		
				System.out.println(dropdown.getFirstSelectedOption().getText());
		
		driver.close();	
		
	}

}
