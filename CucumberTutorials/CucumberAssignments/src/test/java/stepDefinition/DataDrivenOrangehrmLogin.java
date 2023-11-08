package stepDefinition;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


//https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
//input[@name='username']
//input[@type='password']
//button[@type='submit']


public class DataDrivenOrangehrmLogin {

	//static WebDriver driver;
	WebDriver driver;
	
	@Given("Open Orangehrm Application")
	public void open_orangehrm_application() {
	    
		System.setProperty("webdriver.gecko.driver", "E:\\JarFiles\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//    throw new io.cucumber.java.PendingException();
	}

	@When("User enter valid {string} and valid {string}")
	public void user_enter_valid_and_valid(String un, String pass) {
		//input[@name='username']
		//input[@type='password']
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(un);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(pass);
	//    throw new io.cucumber.java.PendingException();
	}

	@When("User click on Login button")
	public void user_click_on_login_button() {
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	//	throw new io.cucumber.java.PendingException();
	}

	@Then("User should get access of Application")
	public void user_should_get_access_of_application() {
	  
		String act=driver.getCurrentUrl();
		String exp="List";
		Assert.assertTrue(act.contains(exp));
		System.out.println("User Login Successful");
	//    throw new io.cucumber.java.PendingException();
	}
		
} 


