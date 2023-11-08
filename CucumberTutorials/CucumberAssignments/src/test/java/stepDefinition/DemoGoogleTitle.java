package stepDefinition;

import static org.junit.Assert.*;
import static org.testng.Assert.assertEquals;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DemoGoogleTitle {

	WebDriver driver;
	String title;
	
	@Given("I open Google application")
	public void i_open_google_application() {
	    
		System.setProperty("webdriver.gecko.driver", "E:\\JarFiles\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
		//throw new io.cucumber.java.PendingException();
	}

	@When("I capture title")
	public void i_capture_title() {
	    System.out.println(driver.getTitle());
	//    throw new io.cucumber.java.PendingException();
	}

	@Then("I should get valid title as Google")
	public void i_should_get_valid_title_as_google() {
		Assert.assertEquals((driver.getTitle()), "Google");
					
	 //   throw new io.cucumber.java.PendingException();
	}

	
	//Scenario - Test search feature of Google
	@Given("open google application")
	public void open_google_application() {
		System.setProperty("webdriver.gecko.driver", "E:\\JarFiles\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
	 //   throw new io.cucumber.java.PendingException();
	}

	@When("I search valid keyword and go for search")
	public void i_search_valid_keyword_and_go_for_search() {
	    driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("Cucumber",Keys.ENTER);
	//    driver.findElement(By.xpath("//input[@class='gNO89b']")).click();
	    
	    //   throw new io.cucumber.java.PendingException();
	}

	@Then("I should get a valid search result")
	public void i_should_get_a_valid_search_result() {
		
	/*	WebDriverWait wait = new WebDriverWait(driver, 30);
		List<WebElement> result=driver.findElements(By.tagName("h3"));
		assertEquals(result.get(0), "Cucumber");
		wait.until(ExpectedConditions.elementToBeClickable(result.get(0))).click();
		*/
		
		String act=driver.getCurrentUrl();
		String exp="Cucumber";
		Assert.assertTrue(act.contains(exp));
		System.out.println("Search Successful");
		
	 //   throw new io.cucumber.java.PendingException();
	}

	
}
