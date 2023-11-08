package SeleniumDemo;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoExplicitWait {

	public static void main(String[] args) {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "E://JarFiles//chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
		
		//a[contains(text(),'privacy policy')]
		
		WebDriverWait wait=new WebDriverWait(driver, 20);
		boolean flag=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'privacy policy')]"))).isDisplayed();
		
		if(flag)
		{
			System.out.println(driver.findElement(By.xpath("//a[contains(text(),'privacy policy')]")).getText());
		}
		else
		{
			System.out.println("Defect Found");
		}
		
	}

}
