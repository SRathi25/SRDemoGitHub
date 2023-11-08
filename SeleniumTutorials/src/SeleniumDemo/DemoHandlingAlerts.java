package SeleniumDemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoHandlingAlerts {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "E://JarFiles//chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		
		//By.xpath("//button[@id='alertButton']")
		//By.id("alertButton")
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='alertButton']"))).click();
	//	wait.until(ExpectedConditions.elementToBeClickable(By.id("alertButton"))).click();
		
		
		//Switch to alert
		Alert a=driver.switchTo().alert();
		String msg=a.getText();
		System.out.println(msg);
		a.accept();
		
		//Switch to main window
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("timerAlertButton"))).click();
/*		
		Alert a1=driver.switchTo().alert();
		System.out.println(a1.getText());
	//	Thread.sleep(20000);
		wait.until(ExpectedConditions.alertIsPresent()).accept();
		a1.accept();
		
		driver.switchTo().defaultContent();
*/	
	
/*		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("confirmButton"))).click();
		Alert a2=driver.switchTo().alert();
		System.out.println(a2.getText());
		a2.accept();
		
		driver.switchTo().defaultContent();
		
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='promtButton']"))).click();
		wait.until(ExpectedConditions.alertIsPresent()).sendKeys("Seed");
		Alert a3=driver.switchTo().alert();
		System.out.println(a3.getText());
		a3.accept();
		
	*/

	}

}
