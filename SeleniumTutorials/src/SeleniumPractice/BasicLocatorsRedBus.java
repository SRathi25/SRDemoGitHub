package SeleniumPractice;

import org.apache.commons.math3.analysis.function.Exp;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasicLocatorsRedBus {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver","E:\\JarFiles\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.com/");
		
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("src"))).sendKeys("Pune",Keys.ENTER);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("dest"))).sendKeys("Hyderbad", Keys.ENTER);
	//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("onward_cal"))).sendKeys("20/11");
		wait.until(ExpectedConditions.elementToBeClickable(By.id("search_butn"))).click();
		

	}

}
