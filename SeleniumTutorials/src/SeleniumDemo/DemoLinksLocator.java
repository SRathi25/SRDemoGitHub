package SeleniumDemo;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoLinksLocator {

	public static void main(String[] args) {
		
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "E:\\JarFiles\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("http:\\www.google.com");
	
	//	driver.findElement(By.linkText("Gmail")).click();
	
	//	driver.findElement(By.partialLinkText("How Search")).click();
	//	driver.findElement(By.partialLinkText("Search works")).click();
	//	driver.findElement(By.partialLinkText("Search")).click();
	//	driver.findElement(By.partialLinkText("How")).click();
		
		
		//to find all links on google.com
		List<WebElement> lnks = driver.findElements(By.tagName("a"));
		System.out.println("No. of Links = " + lnks.size());
		
		//to print links text
		System.out.println("List of Links");
		for(WebElement we : lnks)		//for each
		{
			System.out.println(we.getText());
		}
		
		
	}

}
