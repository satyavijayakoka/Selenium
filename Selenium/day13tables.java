package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class day13tables {

	public static void main(String[] args) {
		// Tables 
		
				// Get the total number of tables 
				// Get the total number of rows 
				// Get the total number of columns
				// Iterate rows and columns and print text of element 
				// Convert it into integer and add
		
		ChromeDriver driver = new ChromeDriver();
		// visiting the url
		driver.get("http://www.webdriveruniversity.com/Data-Table/index.html");
		
          // getting total number of rows
		
		List<WebElement> tbl = driver.findElements(By.xpath("//*[table]"));
		System.out.println(tbl.size());
		
		// getting total number of rows
		
		List<WebElement> rows = driver.findElements(By.xpath("//*[@id=\"t01\"]/tbody/tr"));
		int totalrows = rows.size();
		System.out.println(totalrows);
		
		List<WebElement> columns = driver.findElements(By.xpath("//*[@id=\"t02\"]/tbody/tr[2]/td"));
		int totalcolumns = columns.size();
		System.out.println(totalcolumns);
		
		//  //*[@id="t01"]/tbody/tr[2]/td[3]
		
		int sum = 0;
		for(int i =2; i <=totalrows; i++ ) {
			System.out.println(i);
			String text = driver.findElement(By.xpath("//*[@id=\"t01\"]/tbody/tr["+i+"]/td[3]")).getText();
			System.out.println(text);
			
			
			sum = sum+ Integer.parseInt(text);
			
		}
		System.out.println(sum);
		
		
		// find the person with michael
		
		for(int i = 2; i<= totalrows ; i++) {
			String text2 = driver.findElement(By.xpath("//*[@id=\"t01\"]/tbody/tr["+i+"]/td[1]")).getText();
			System.out.println(text2);
			
			if(text2.equals("Michael")) {
				System.out.println("test case pass");
				break;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
