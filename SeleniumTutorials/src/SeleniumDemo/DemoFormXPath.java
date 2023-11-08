package SeleniumDemo;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoFormXPath {

	public static void main(String[] args) {
		
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "E:\\JarFiles\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");

		//Absolute XPath
	//	driver.findElement(By.xpath("/html/body/center/form/div/table[2]/tbody/tr[3]/td[3]/input")).sendKeys("Test Test");
	//	driver.findElement(By.xpath("/html/body/center/form//div/table[2]/tbody/tr[7]/td[3]/input")).sendKeys("test12345");
		
		//Dynamic Xpath - //tagname[starts-with(@attribute,"valueof attribute")]
		//Name
		driver.findElement(By.xpath("//input[starts-with(@name,'name')]")).sendKeys("Test Test");
		//Password
		driver.findElement(By.xpath("//input[starts-with(@id,'newpasswd')]")).sendKeys("Test12345@");
		//Confirm Password
		driver.findElement(By.xpath("//input[contains(@name,'confirm')]")).sendKeys("Test12345@");
		//Alternate Email
		driver.findElement(By.xpath("//input[starts-with(@name,'altemail']")).sendKeys("test@gmail.com");
	
	}

}
