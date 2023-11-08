package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoCheckBox {

	public static void main(String[] args) {

		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "E:\\JarFiles\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		//username
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("Seed");
		//password
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Seed1234");
		
		//isDisplayed()
		Boolean status=driver.findElement(By.xpath("//input[@id='remember']")).isDisplayed();
		System.out.println("Status with isDisplayed() = "+status);
		
		
		//isEnabled()
		status=driver.findElement(By.xpath("//input[@id='remember']")).isEnabled();
		System.out.println("Status with isEnabled() = "+status);
		
		
		//isSelected()
		status=driver.findElement(By.xpath("//input[@id='remember']")).isSelected();
		System.out.println("Status with isSelected() = "+status);
		
		
		driver.findElement(By.xpath("//input[@id='remember']")).click();
		
		
		//isSelected()
		status=driver.findElement(By.xpath("//input[@id='remember']")).isSelected();
		System.out.println("Status with isSelected() = "+status);
		
		
		driver.findElement(By.xpath("//input[@id='remember']")).click();
		
		
	}

}
