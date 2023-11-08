package SeleniumDemo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoWebDriverMethods {

	public static void main(String[] args) {
		
		WebDriver driver;
		
		//FireFox Browser
		System.setProperty("webdriver.gecko.driver","E:\\JarFiles\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http:\\www.google.com");
		String cururl=driver.getCurrentUrl();
		System.out.println("Current URL = " + cururl);
		System.out.println("Current Title = " + driver.getTitle());
		System.out.println("Source = " + driver.getPageSource());
		driver.close();
		//driver.quit();
		
	/*	
		//GoogleChrome Browser
		System.setProperty("webdriver.chrome.driver","E:\\JarFiles\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http:\\www.google.com");
		String cururl=driver.getCurrentUrl();
		System.out.println("Current URL = " + cururl);
		System.out.println("Current Title = " + driver.getTitle());
		System.out.println("Source = " + driver.getPageSource());
		driver.close();
		//driver.quit();
		
	*/

	}

}
