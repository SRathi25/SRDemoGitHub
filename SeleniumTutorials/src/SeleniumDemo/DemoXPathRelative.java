package SeleniumDemo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoXPathRelative {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver","E:\\JarFiles\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
			
		//Relative XPath
		//Username
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("Seed");
		//Password
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Seed123");
		//Sign in
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
	}

}
