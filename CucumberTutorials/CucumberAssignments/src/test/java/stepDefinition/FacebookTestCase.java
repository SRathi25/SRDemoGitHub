package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FacebookTestCase {
	
	WebDriver driver;
	
	
	@Given("Open Facebook application")
	public void open_facebook_application() {
	    System.out.println("open_facebook_application()");
	    System.setProperty("webdriver.gecko.driver", "E:\\JarFiles\\geckodriver.exe");
	    driver=new FirefoxDriver();
	    driver.get("https://www.facebook.com/");
	    throw new io.cucumber.java.PendingException();
	}

	@When("I enter valid {string} and valid {string}")
	public void i_enter_valid_and_valid(String Username, String Password) {
	    System.out.println("Username = " + Username + "\nPassword = " + Password);
		throw new io.cucumber.java.PendingException();
	}

	@When("I click on Login button")
	public void i_click_on_login_button() {
		System.out.println("I click on Login button");
		throw new io.cucumber.java.PendingException();
	}

	@Then("I should get access of application")
	public void i_should_get_access_of_application() {
	    System.out.println("I should get access of application");
		throw new io.cucumber.java.PendingException();
	}

	@When("I enter invalid {string} and invalid {string}")
	public void i_enter_invalid_and_invalid(String Username, String Password) {
		System.out.println("Username = " + Username + "\nPassword = " + Password);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(Username);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(Password);
		
		throw new io.cucumber.java.PendingException();
	}

	@When("click on button")
	public void click_on_button() {
		System.out.println("click on button");
		driver.findElement(By.xpath("//button[@id='u_0_5_Zb']")).click();
	   throw new io.cucumber.java.PendingException();
	}

	@Then("I should not get access of application")
	public void i_should_not_get_access_of_application() {
	    System.out.println("I should not get access of application");
		throw new io.cucumber.java.PendingException();
	}

}
