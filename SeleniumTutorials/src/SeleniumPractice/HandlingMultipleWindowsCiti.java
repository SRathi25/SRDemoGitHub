package SeleniumPractice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingMultipleWindowsCiti {

	public static void main(String[] args) {
		
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "E://JarFiles//geckodriver.exe");
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.online.citibank.co.in/");
		
	//	WebElement loginPage = driver.findElement(By.xpath("//a[@id='loginId']"));
	//	WebElement registerPage = driver.findElement(By.xpath("//a[contains(text(),'Register Now')]"));
		
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='popup1']//a[@class='newclose']"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='newclose2']"))).click();
		
		//Login - //a[@id='loginId']
		//Register - //a[contains(text(),'Register Now')]

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='loginId']"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Register No')]"))).click();
			
				
		Set<String> windls=driver.getWindowHandles();
		Iterator<String> iterators=windls.iterator();
			
		while(iterators.hasNext())
		{
			String childWindow=iterators.next();
			System.out.println(driver.switchTo().window(childWindow).getTitle());
		}
	
	
	
	}

}
