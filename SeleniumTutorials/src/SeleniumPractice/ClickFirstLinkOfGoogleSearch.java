package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//Open Google.com, search using a keyword and click on 1st link of the result page

public class ClickFirstLinkOfGoogleSearch {

	public static void main(String[] args) {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "E://JarFiles//chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("Selenium Testing",Keys.ENTER);
	
		WebDriverWait wait=new WebDriverWait(driver,50);
		
		List<WebElement> result=driver.findElements(By.tagName("h3"));
		wait.until(ExpectedConditions.elementToBeClickable(result.get(0))).click();
		
		
	}

}
