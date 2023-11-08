package MyPOM;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

//input[@name='username']
//input[@type='password']
//button[@type='submit']
public class OrangeHRMLoginTest {
 
	WebDriver driver;
	
  @Test
  public void validLogin() {
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  OrangeHRMLoginPage.txtUsername(driver).sendKeys("Seed");
	  OrangeHRMLoginPage.txtPassword(driver).sendKeys("Seed123");
	  OrangeHRMLoginPage.btnLogin(driver).click();
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
