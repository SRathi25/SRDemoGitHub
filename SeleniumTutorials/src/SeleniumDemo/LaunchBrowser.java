package SeleniumDemo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		
		WebDriver driver;
		
		//FireFox Browser
		System.setProperty("webdriver.gecko.driver","E:\\JarFiles\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		//GoogleChrome Browser
		System.setProperty("webdriver.chrome.driver","E:\\JarFiles\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	
		
	}

}
