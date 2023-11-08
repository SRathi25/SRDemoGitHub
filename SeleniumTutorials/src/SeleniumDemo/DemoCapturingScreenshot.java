package SeleniumDemo;



import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.apache.commons.*;
import org.apache.commons.io.FileUtils;


public class DemoCapturingScreenshot {

	public static void main(String[] args) throws IOException {

		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "E:\\JarFiles\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
	//	Thread.sleep(2000);
		
		File scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile,new File("E:\\JarFiles\\screenshot.png"));

		
		
		
	}

}
