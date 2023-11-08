package SeleniumDemo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//Click on Sign Up, Will get a Popup, enter data and click

public class DemoHandlingPopupWindows {

	public static void main(String[] args) {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "E://JarFiles//chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://evadav.com/");
		
		//div[@class='main-h__w-btn']//button[@type='button'][contains(text(),'Sign up')]
		
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='main-h__w-btn']//button[@type='button'][contains(text(),'Sign up')]"))).click();
		
		
		
		Set<String> allWins=driver.getWindowHandles();
		if(!allWins.isEmpty())
		{
			for(String winld:allWins)
			{
				driver.switchTo().window(winld);
				if(driver.getPageSource().contains("I want to promote my brand or buy Evadav traffic"));
				{
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='email']"))).sendKeys("Seed");
			//		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("seed");
				}
			
			}
		}

	}

}
