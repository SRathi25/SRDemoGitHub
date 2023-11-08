package MyPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrangeHRMLoginPage {
	//input[@name='username']
	//input[@type='password']
	//button[@type='submit']
	
	public static WebElement element;
	public static WebElement txtUsername(WebDriver driver)
	{
		element=driver.findElement(By.name("username"));
		return element;
	}
	public static WebElement txtPassword(WebDriver driver)
	{
		element=driver.findElement(By.name("password"));
		return element;
	}
	public static WebElement btnLogin(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//button[@type='submit']"));
		return element;
	}
	
	
}
