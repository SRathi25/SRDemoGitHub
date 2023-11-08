package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoCSSSelector {

	public static void main(String[] args) {
		
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "E:\\JarFiles\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		
		//Username
		driver.findElement(By.cssSelector("input#login1")).sendKeys("Seed");
	//	driver.findElement(By.cssSelector("input[name^='login']")).sendKeys("Seed");
		
		
		//Password
		driver.findElement(By.cssSelector("input#password")).sendKeys("Seed1234");
		//Sign in
		driver.findElement(By.cssSelector("input[name='proceed']")).click();
		
		
	}

}
