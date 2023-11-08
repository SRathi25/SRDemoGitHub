package MyPOM;

import org.testng.annotations.Test;

import TestNGDTutorials.RedffLoginReg;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class RediffLoginTest {
	
	WebDriver driver;
	
  @Test
  public void validLogin() {
	  driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	  RediffLoginPage.txtUsername(driver).sendKeys("Seed");
	  RediffLoginPage.txtPassword(driver).sendKeys("Seed123");
	  RediffLoginPage.btnSignIn(driver).click();
  }
  @BeforeMethod
  public void launchBrowser() {
	  
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
  }
  
 

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeClass
  public void setBrowser() {
	  System.setProperty("webdriver.gecko.driver", "E:\\JarFiles\\geckodriver.exe");
	  
  }

  @AfterClass
  public void afterClass() {
  }

}
