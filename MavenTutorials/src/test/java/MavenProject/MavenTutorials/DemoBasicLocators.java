package MavenProject.MavenTutorials;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoBasicLocators {

	public static void main(String[] args) {
		
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "E:\\JarFiles\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.manage().window().maximize();		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.id("login1")).sendKeys("Seed");
		driver.findElement(By.id("password")).sendKeys("Seed1234");
	//	driver.findElement(By.name("passwd")).sendKeys("Seed123");
		driver.findElement(By.name("proceed")).click();
		
		
		
		
	}

}
