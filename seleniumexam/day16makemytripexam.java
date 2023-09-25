package seleniumexam;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class day16makemytripexam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		
				driver.get("https://www.makemytrip.com/");
				driver.manage().window().maximize();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//From City
		driver.findElement(By.cssSelector("#fromCity")).sendKeys("Hyderabad");
		
		try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
		List<WebElement> dynamicList= driver.findElements(By.cssSelector("p[class='font14 appendBottom5 blackText']"));
	
		for (int i=0; i<dynamicList.size(); i++) {
			
			String FromCity = dynamicList.get(i).getText();
			
			System.out.println(FromCity);
			
			if(FromCity.contains("Hyderabad")) {
				dynamicList.get(i).click();
				break;
				
			}
			
			
		}
		
		//To City
		driver.findElement(By.cssSelector("#toCity")).sendKeys("Vijayawada");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		List<WebElement> dynamicList1= driver.findElements(By.cssSelector("p[class='font14 appendBottom5 blackText']"));
		
		for (int i=0; i<dynamicList1.size(); i++) {
			
			String FromCity = dynamicList1.get(i).getText();
			
			System.out.println(FromCity);
			
			if(FromCity.contains("Vijayawada")) {
				dynamicList1.get(i).click();
				break;
				
			}
			
			
		}
		
		driver.close();
	}

}
