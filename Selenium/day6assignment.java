package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day6assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en.wikipedia.org/wiki/Main_Page");

        // 1. ID (Locating the search input)
        WebElement searchInput = driver.findElement(By.id("searchInput"));
        searchInput.sendKeys("OpenAI");

        // 2. Name (Locating the search input using its name)
        WebElement searchInputByName = driver.findElement(By.name("search"));
        System.out.println(searchInputByName.getAttribute("placeholder"));

        // 3. Class Name (Locating an element with the class 'mp-upper')
        WebElement upperElement = driver.findElement(By.className("mp-upper"));
        System.out.println(upperElement.getText().substring(0, 50) + "...");  // Displaying the first 50 characters

        // 4. Tag Name (Getting the first link on the page)
        WebElement firstLink = driver.findElement(By.tagName("a"));
        System.out.println(firstLink.getAttribute("href"));

        // 5. Link Text (Clicking the "Contents" link)
        WebElement contentsLink = driver.findElement(By.linkText("Contents"));
        contentsLink.click();

        // 6. Partial Link Text (Finding a link that has "Current" in its text)
        WebElement currentLink = driver.findElement(By.partialLinkText("Current"));
        System.out.println(currentLink.getText());

        // 7. CSS Selector (Locating the search button using a CSS selector)
        WebElement searchButton = driver.findElement(By.cssSelector("input[type='submit'][name='go']"));
        searchButton.click();

        // 8. XPath (Locating the first heading on the page using XPath)
        WebElement firstHeading = driver.findElement(By.xpath("//h2"));
        System.out.println(firstHeading.getText());
        
        driver.quit();
    }


	}


