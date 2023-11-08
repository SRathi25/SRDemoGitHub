package stepDefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataTableUserRegistration {

	WebDriver driver;
	
	@Given("User is on registration page")
	public void user_is_on_registration_page() {
	
		System.setProperty("webdriver.gecko.driver", "E:\\JarFiles\\geckodriver.exe");
	//	driver=new FirefoxDriver();
	//	driver.get("https://demo.automationtesting.in/Register.html");
	//	driver.manage().window().maximize();
	//    throw new io.cucumber.java.PendingException();
	}

	@When("User enters following details")
	public void user_enters_following_details(DataTable dataTable) {
	    
		List<List<String>> userList=dataTable.asLists(String.class);
		
		for(List<String> user:userList)
		{
			System.out.println(user);
			
			driver=new FirefoxDriver();
			driver.get("https://demo.automationtesting.in/Register.html");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//input[@ng-model='FirstName']")).sendKeys(user.get(0));
			driver.findElement(By.xpath("//input[@ng-model='LastName']")).sendKeys(user.get(1));
			driver.findElement(By.xpath("//input[@type='email']")).sendKeys(user.get(2));
			driver.findElement(By.xpath("//input[@type='tel']")).sendKeys(user.get(3));
	//		driver.findElement(By.xpath("//select[@id='countries']")).sendKeys();
	//		Select myCountry=new Select(driver.findElement(By.xpath("//span[@id='select2-country-container']")));
	//		myCountry.selectByVisibleText("India");
			driver.findElement(By.xpath("//button[@id='submitbtn']")).click();
		}
	
	//	throw new io.cucumber.java.PendingException();
	}

	@Then("User registration should be successful")
	public void user_registration_should_be_successful() {
	    System.out.println("Successful");
		
	//    throw new io.cucumber.java.PendingException();
	}
}


