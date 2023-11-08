package SeleniumDemo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoHandlingMultipleWindows {

	public static void main(String[] args) {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "E://JarFiles//chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/female-jobs-in-akola");
		
		//a[@id='login_Layer']
		//a[@id='register_Layer']
		//a[contains(text(),'Gold Loan Relationship Officer')]
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Gold Loan Relationship Officer')]"))).click();		
		
		
		
		Set<String> windls=driver.getWindowHandles();
		Iterator<String> iterators=windls.iterator();
	
	
		String mainwin=iterators.next();
		String newwin=iterators.next();
		System.out.println(driver.getTitle());
		driver.switchTo().window(newwin);
		System.out.println(driver.getTitle());
		driver.switchTo().window(mainwin);
		System.out.println(driver.getTitle());
		
	
	/*	
		while(iterators.hasNext())
		{
			String childWindow=iterators.next();
			System.out.println(driver.switchTo().window(childWindow).getTitle());
		}
		
	*/
		
		
		
	}

}
