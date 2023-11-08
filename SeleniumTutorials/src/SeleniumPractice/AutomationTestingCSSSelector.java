package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutomationTestingCSSSelector {

	public static void main(String[] args) {
		
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "E:\\JarFiles\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		
		//First name
		driver.findElement(By.cssSelector("input[placeholder='First Name']")).sendKeys("Snehal");
		//last name
		driver.findElement(By.cssSelector("input[placeholder='Last Name']")).sendKeys("Rathi");
		//address
		driver.findElement(By.cssSelector("textarea[ng-model='Adress']")).sendKeys("Pune");
		//email address
		driver.findElement(By.cssSelector("input[ng-model='EmailAdress']")).sendKeys("snehal@gmail.com");
		//phone
		driver.findElement(By.cssSelector("input[ng-model='Phone']")).sendKeys("9922342121");
		//password
		driver.findElement(By.cssSelector("input#firstpassword")).sendKeys("Password123");
		//confirm password
		driver.findElement(By.cssSelector("input#secondpassword")).sendKeys("Password123");
				
		
		
		
	}

}
