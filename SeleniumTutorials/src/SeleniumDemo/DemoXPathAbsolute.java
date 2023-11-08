package SeleniumDemo;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

class DemoXPathAbsolute {

	public static void main(String[] args) {
		
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver","E:\\JarFiles\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		
		//Absolute XPath
		//Username
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/form/div/div[2]/div/div[2]/input")).sendKeys("Seed");
		
		//Password
	//	driver.findElement(By.xpath("/html/body/div/div/div/div[2]/form/div/div[2]/div[2]/div[2]/div/input")).sendKeys("Seed123");
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/form/div/div[2]/div[2]/div[2]/div/input[@id='password']")).sendKeys("Seed123");
				
		//Signin
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/form/div/div[2]/div[2]/div[2]/div/input[2]")).click();
	

		
	}

}
